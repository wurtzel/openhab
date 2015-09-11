/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.lightwaverf.internal;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.openhab.binding.lightwaverf.LightwaveRfBindingProvider;
import org.openhab.binding.lightwaverf.internal.command.LightwaveRFCommand;
import org.openhab.binding.lightwaverf.internal.command.LightwaveRfCommandOk;
import org.openhab.binding.lightwaverf.internal.command.LightwaveRfHeatInfoRequest;
import org.openhab.binding.lightwaverf.internal.command.LightwaveRfRoomDeviceMessage;
import org.openhab.binding.lightwaverf.internal.command.LightwaveRfRoomMessage;
import org.openhab.binding.lightwaverf.internal.command.LightwaveRfSerialMessage;
import org.openhab.binding.lightwaverf.internal.command.LightwaveRfVersionMessage;
import org.openhab.binding.lightwaverf.internal.message.LightwaveRFMessageListener;
import org.openhab.core.binding.AbstractBinding;
import org.openhab.core.binding.BindingChangeListener;
import org.openhab.core.binding.BindingProvider;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.openhab.core.types.Type;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Neil Renaud
 * @since 1.7.0
 */
public class LightwaveRfBinding extends
		AbstractBinding<LightwaveRfBindingProvider> implements
		LightwaveRFMessageListener, BindingChangeListener {

	private static final Logger logger = LoggerFactory
			.getLogger(LightwaveRfBinding.class);

	private static int TIME_BETWEEN_SENT_MESSAGES_MS = 100;
	private static int TIMEOUT_FOR_OK_MESSAGES_MS = 500;
	// LightwaveRF WIFI hub port.
	private static int LIGHTWAVE_PORT_TO_SEND_TO = 9760;
	private static int LIGHTWAVE_PORT_TO_RECEIVE_ON = 9761;
	// LightwaveRF WIFI hub IP Address or broadcast address
	private static String LIGHTWAVE_IP = "255.255.255.255";
	private static boolean SEND_REGISTER_ON_STARTUP = true;

	private LightwaverfConvertor messageConvertor = new LightwaverfConvertor();
	private LightwaveRFReceiver receiverOnSendPort = null;
	private LightwaveRFReceiver receiverOnReceiverPort = null;
	private LightwaveRFSender sender = null;
	private LightwaveRfHeatPoller heatPoller = null;

	public LightwaveRfBinding() {
	}

	/**
	 * Called by the SCR to activate the component with its configuration read
	 * from CAS
	 * 
	 * @param bundleContext
	 *            BundleContext of the Bundle that defines this component
	 * @param configuration
	 *            Configuration properties for this component obtained from the
	 *            ConfigAdmin service
	 */
	public void activate(final BundleContext bundleContext,
			final Map<String, Object> configuration) {
		try {

			String ipString = (String) configuration.get("ip");
			if (StringUtils.isNotBlank(ipString)) {
				LIGHTWAVE_IP = ipString;
			}

			String portOneString = (String) configuration.get("receiveport");
			if (StringUtils.isNotBlank(portOneString)) {
				LIGHTWAVE_PORT_TO_RECEIVE_ON = Integer.parseInt(portOneString);
			}

			String portTwoString = (String) configuration.get("sendport");
			if (StringUtils.isNotBlank(portTwoString)) {
				LIGHTWAVE_PORT_TO_SEND_TO = Integer.parseInt(portTwoString);
			}

			String sendRegistrationMessageString = (String) configuration
					.get("registeronstartup");
			if (StringUtils.isNotBlank(sendRegistrationMessageString)) {
				SEND_REGISTER_ON_STARTUP = Boolean
						.parseBoolean(sendRegistrationMessageString);
			}

			String sendDelayString = (String) configuration.get("senddelay");
			if (StringUtils.isNotBlank(sendDelayString)) {
				TIME_BETWEEN_SENT_MESSAGES_MS = Integer
						.parseInt(sendDelayString);
			}

			String okTimeoutString = (String) configuration.get("okTimeout");
			if (StringUtils.isNotBlank(okTimeoutString)) {
				TIMEOUT_FOR_OK_MESSAGES_MS = Integer.parseInt(okTimeoutString);
			}

			logger.info("LightwaveBinding: IP[{}]", LIGHTWAVE_IP);
			logger.info("LightwaveBinding: ReceivePort[{}]",
					LIGHTWAVE_PORT_TO_RECEIVE_ON);
			logger.info("LightwaveBinding: Send Port[{}]",
					LIGHTWAVE_PORT_TO_SEND_TO);
			logger.info("LightwaveBinding: Register On Startup[{}]",
					SEND_REGISTER_ON_STARTUP);
			logger.info("LightwaveBinding: Send Delay [{}]",
					TIME_BETWEEN_SENT_MESSAGES_MS);
			logger.info("LightwaveBinding: Timeout for Ok Messages [{}]",
					TIMEOUT_FOR_OK_MESSAGES_MS);

			messageConvertor = new LightwaverfConvertor();

			// Create the Sender and Receiver
			receiverOnReceiverPort = new LightwaveRFReceiver(messageConvertor,
					LIGHTWAVE_PORT_TO_RECEIVE_ON);
			receiverOnSendPort = new LightwaveRFReceiver(messageConvertor,
					LIGHTWAVE_PORT_TO_SEND_TO);
			sender = new LightwaveRFSender(LIGHTWAVE_IP,
					LIGHTWAVE_PORT_TO_SEND_TO, TIME_BETWEEN_SENT_MESSAGES_MS,
					TIMEOUT_FOR_OK_MESSAGES_MS);

			// Add Listeners
			receiverOnReceiverPort.addListener(this);
			receiverOnSendPort.addListener(this);
			receiverOnReceiverPort.addListener(sender);

			// Start all the senders and receivers
			receiverOnReceiverPort.start();
			receiverOnSendPort.start();
			sender.start();

			if (SEND_REGISTER_ON_STARTUP) {
				sender.sendLightwaveCommand(messageConvertor
						.getRegistrationCommand());
			}

			// Now the sender is started and we have sent the registration
			// message
			// start the Heat Poller
			heatPoller = new LightwaveRfHeatPoller(sender, messageConvertor);

			// Now register pollers if we have them. It might be that provider
			// hasn't
			// been setup yet and in that case they'll be registered by the
			// bindingChanged method
			for (LightwaveRfBindingProvider provider : providers) {
				Collection<String> itemNames = provider.getItemNames();
				registerHeatingPollers(provider, itemNames);
			}

		} catch (UnknownHostException e) {
			logger.error("Error creating LightwaveRFSender", e);
		} catch (SocketException e) {
			logger.error("Error creating LightwaveRFSender/Receiver", e);
		}
	}

	@Override
	public void bindingChanged(BindingProvider provider, String itemName) {
		super.bindingChanged(provider, itemName);
		if (provider instanceof LightwaveRfBindingProvider) {
			logger.info("LightwaveRf Binding changed for: {}", itemName);
			registerHeatingPoller((LightwaveRfBindingProvider) provider,
					itemName);
		}
	}

	private void registerHeatingPollers(LightwaveRfBindingProvider provider,
			Collection<String> itemNames) {
		for (String itemName : itemNames) {
			registerHeatingPoller(provider, itemName);
		}
	}

	private void registerHeatingPoller(LightwaveRfBindingProvider provider,
			String itemName) {
		int poll = provider.getPollInterval(itemName);
		if (poll > 0) {
			String roomId = provider.getRoomId(itemName);
			heatPoller.addRoomToPoll(itemName, roomId, poll);
		} else {
			heatPoller.removeRoomToPoll(itemName);
		}
	}

	/**
	 * Called by the SCR when the configuration of a binding has been changed
	 * through the ConfigAdmin service.
	 * 
	 * @param configuration
	 *            Updated configuration properties
	 */
	public void modified(final Map<String, Object> configuration) {
		// update the internal configuration accordingly
	}

	/**
	 * Called by the SCR to deactivate the component when either the
	 * configuration is removed or mandatory references are no longer satisfied
	 * or the component has simply been stopped.
	 * 
	 * @param reason
	 *            Reason code for the deactivation:<br>
	 *            <ul>
	 *            <li>0 – Unspecified
	 *            <li>1 – The component was disabled
	 *            <li>2 – A reference became unsatisfied
	 *            <li>3 – A configuration was changed
	 *            <li>4 – A configuration was deleted
	 *            <li>5 – The component was disposed
	 *            <li>6 – The bundle was stopped
	 *            </ul>
	 */
	public void deactivate(final int reason) {
		// deallocate resources here that are no longer needed and
		// should be reset when activating this binding again
		heatPoller.stop();

		receiverOnReceiverPort.stop();
		receiverOnSendPort.stop();
		sender.stop();

		receiverOnReceiverPort = null;
		receiverOnSendPort = null;
		sender = null;
		heatPoller = null;
		messageConvertor = null;
	}

	/**
	 * @{inheritDoc
	 */
	@Override
	protected void internalReceiveCommand(String itemName, Command command) {
		logger.debug("internalReceiveCommand({},{}) is called!", itemName,
				command);
		internalReceive(itemName, command);
	}

	/**
	 * @{inheritDoc
	 */
	@Override
	protected void internalReceiveUpdate(String itemName, State newState) {
		logger.debug("internalReceiveUpdate({},{}) is called!", itemName,
				newState);
		internalReceive(itemName, newState);
	}

	private void internalReceive(String itemName, Type command) {
		String roomId = getRoomId(itemName);
		String deviceId = getDeviceId(itemName);
		LightwaveRfType deviceType = getType(itemName);
		LightwaveRFCommand lightwaverfMessageString = messageConvertor
				.convertToLightwaveRfMessage(roomId, deviceId, deviceType,
						command);
		sender.sendLightwaveCommand(lightwaverfMessageString);

	}

	private String getRoomId(String itemName) {
		for (LightwaveRfBindingProvider provider : providers) {
			String roomId = provider.getRoomId(itemName);
			if (roomId != null) {
				return roomId;
			}
		}
		return null;
	}

	private String getDeviceId(String itemName) {
		for (LightwaveRfBindingProvider provider : providers) {
			String deviceId = provider.getDeviceId(itemName);
			if (deviceId != null) {
				return deviceId;
			}
		}
		return null;
	}

	private LightwaveRfType getType(String itemName) {
		for (LightwaveRfBindingProvider provider : providers) {
			LightwaveRfType type = provider.getTypeForItemName(itemName);
			if (type != null) {
				return type;
			}
		}
		return null;
	}

	private void publishUpdate(List<String> itemNames,
			LightwaveRFCommand message, LightwaveRfBindingProvider provider) {
		logger.debug("Publishing Update {} to {}", message, itemNames);
		boolean published = false;
		if (itemNames != null) {
			for (String itemName : itemNames) {
				LightwaveRfType deviceType = provider
						.getTypeForItemName(itemName);
				State state = message.getState(deviceType);
				if (state != null) {
					logger.info(
							"Update from LightwaveRf ItemName[{}], State[{}]",
							itemName, state);
					published = true;
					eventPublisher.postUpdate(itemName, state);
				} else {
					logger.info("State was null for {} type {}, message {}",
							itemName, deviceType, message);
				}
			}
		}
		if (!published) {
			logger.warn("No item for incoming message[{}]",
					message.getLightwaveRfCommandString());
		}
	}

	@Override
	public void roomDeviceMessageReceived(LightwaveRfRoomDeviceMessage message) {
		for (LightwaveRfBindingProvider provider : providers) {
			List<String> itemNames = provider.getBindingItemsForRoomDevice(
					message.getRoomId(), message.getDeviceId());
			publishUpdate(itemNames, message, provider);
		}
	}

	@Override
	public void roomMessageReceived(LightwaveRfRoomMessage message) {
		for (LightwaveRfBindingProvider provider : providers) {
			List<String> itemNames = provider.getBindingItemsForRoom(message
					.getRoomId());
			publishUpdate(itemNames, message, provider);
		}
	}

	@Override
	public void serialMessageReceived(LightwaveRfSerialMessage message) {
		for (LightwaveRfBindingProvider provider : providers) {
			List<String> itemNames = provider.getBindingItemsForSerial(message
					.getSerial());
			publishUpdate(itemNames, message, provider);
		}
	}

	@Override
	public void okMessageReceived(LightwaveRfCommandOk message) {
		// Do nothing
	}

	@Override
	public void heatInfoMessageReceived(LightwaveRfHeatInfoRequest command) {
		// Do nothing
	}

	@Override
	public void versionMessageReceived(LightwaveRfVersionMessage message) {
		for (LightwaveRfBindingProvider provider : providers) {
			List<String> itemNames = provider
					.getBindingItemsForType(LightwaveRfType.VERSION);
			publishUpdate(itemNames, message, provider);
		}
	}

	/**
	 * Visible for testing only to allow us to add a mock of the Lightwave
	 * Sender
	 * 
	 * @param mockLightwaveRfSender
	 */
	void setLightaveRfSender(LightwaveRFSender lightwaveRfSender) {
		this.sender = lightwaveRfSender;
	}

	/**
	 * Visible for testing only to allow us to add a mock Convertor
	 * 
	 * @param mockLightwaveRfConvertor
	 */
	void setLightwaveRfConvertor(LightwaverfConvertor mockLightwaveRfConvertor) {
		this.messageConvertor = mockLightwaveRfConvertor;
	}
}
