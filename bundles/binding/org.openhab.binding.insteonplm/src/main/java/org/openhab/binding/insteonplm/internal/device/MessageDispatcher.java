/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.insteonplm.internal.device;

import org.openhab.binding.insteonplm.internal.message.FieldException;
import org.openhab.binding.insteonplm.internal.message.Msg;
import org.openhab.binding.insteonplm.internal.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Does preprocessing of messages to decide which handler should be called.
 * 
 * @author Bernd Pfrommer
 * @since 1.5.0
 */
public abstract class MessageDispatcher {
	private static final Logger logger = LoggerFactory.getLogger(MessageDispatcher.class);

	DeviceFeature m_feature = null;
	/**
	 * Constructor
	 * @param f DeviceFeature to which this MessageDispatcher belongs
	 */
	MessageDispatcher(DeviceFeature f) {
		m_feature = f;
	}
	/**
	 * Generic handling of incoming ALL LINK messages
	 * @param msg the message received
	 * @param port the port on which the message was received
	 * @return true if the message was handled by this function
	 */
	protected boolean handleAllLinkMessage(Msg msg, String port) {
		if (!msg.isAllLink()) {
			return false;
		}
		try {
			InsteonAddress a = msg.getAddress("toAddress");
			// ALL_LINK_BROADCAST and ALL_LINK_CLEANUP
			// have a valid Command1 field
			// but the CLEANUP_SUCCESS (of type ALL_LINK_BROADCAST!)
			// message has cmd1 = 0x06 and the cmd as the
			// high byte of the toAddress.
			byte cmd1 = msg.getByte("command1");
			if (!msg.isCleanup() && cmd1 == 0x06) {
				cmd1 = a.getHighByte();
			}
			// For ALL_LINK_BROADCAST messages, the group is
			// in the low byte of the toAddress. For direct
			// ALL_LINK_CLEANUP, it is in Command2
			
			int group = (msg.isCleanup() ? msg.getByte("command2") : a.getLowByte()) & 0xff;
			MessageHandler h = m_feature.getMsgHandlers().get(cmd1 & 0xFF);
			if (h == null) h = m_feature.getDefaultMsgHandler();
			logger.debug("{}:{}->{} cmd1:{} group {}/{}:{}", m_feature.getDevice().getAddress(), m_feature.getName(),
						h.getClass().getSimpleName(), Utils.getHexByte(cmd1), group, h.getGroup(), msg);
			if (h.getGroup() == group) {
				h.handleMessage(group, cmd1, msg, m_feature, port);
			}
		} catch (FieldException e) {
			logger.error("couldn't parse ALL_LINK message: {}", msg, e);
		}
		return true;
	}
	/**
	 * Checks if this message is in response to previous query by this feature
	 * @param msg
	 * @return true;
	 */
	boolean isMyDirectAck(Msg msg) {
		return msg.isAckOfDirect() && (m_feature.getQueryStatus() == DeviceFeature.QueryStatus.QUERY_PENDING)
				&& m_feature.getDevice().getFeatureQueried() == m_feature;
	}
	/**
	 * Dispatches message
	 * @param msg Message to dispatch
	 * @param port Insteon device ('/dev/usb') from which the message came
	 * @return true if this message was found to be a reply to a direct message,
	 *              and was claimed by one of the handlers 
	 */
	public abstract boolean dispatch(Msg msg, String port);

	//
	//
	// ------------ implementations of MessageDispatchers start here ------------------
	//
	//
	
	private static class DefaultDispatcher extends MessageDispatcher {
		DefaultDispatcher(DeviceFeature f) { super(f); }
		@Override
		public boolean dispatch(Msg msg, String port) {
			byte cmd  = 0x00;
			byte cmd1 = 0x00;
			boolean isConsumed = false;
			int key = -1;
			try {
				cmd  = msg.getByte("Cmd");
				cmd1 = msg.getByte("command1");
			} catch (FieldException e) {
				logger.debug("no command found, dropping msg {}", msg);
				return false;
			}
			if (msg.isAllLinkCleanupAckOrNack()) {
				// Had cases when a KeypadLinc would send an ALL_LINK_CLEANUP_ACK
				// in response to a direct status query message
				return false; 
			}
			if (handleAllLinkMessage(msg, port)) {
				return false;
			}
			if (msg.isAckOfDirect()) {
				// in the case of direct ack, the cmd1 code is useless.
				// you have to know what message was sent before to
				// interpret the reply message
				logger.debug("defdisp: {}:{} qs:{} cmd: {}", m_feature.getDevice().getAddress(), m_feature.getName(),
						m_feature.getQueryStatus(), cmd);
				if (isMyDirectAck(msg)) {
					isConsumed = true;
					if (cmd == 0x50) {
						// must be a reply to our message, tweak the cmd1 code!
						logger.debug("changing key to 0x19 for msg {}", msg);
						key = 0x19; // we have installed a handler under that command number
					}
				}
			} else {
				key = (cmd1 & 0xFF);
			}
			if (key != -1 || m_feature.isStatusFeature()) {
				MessageHandler h = m_feature.getMsgHandlers().get(key);
				if (h == null) h = m_feature.getDefaultMsgHandler();
				logger.debug("{}:{}->{} DIRECT: {}", m_feature.getDevice().getAddress(), m_feature.getName(),
						h.getClass().getSimpleName(), msg);
				h.handleMessage(-1, cmd1, msg, m_feature, port);
			}
			if (isConsumed) {
				m_feature.setQueryStatus(DeviceFeature.QueryStatus.QUERY_ANSWERED);
				logger.debug("defdisp: {}:{} set status to: {}", m_feature.getDevice().getAddress(), m_feature.getName(),
						m_feature.getQueryStatus());
			}
			return isConsumed;
		}
	}

	private static class DefaultGroupDispatcher extends MessageDispatcher {
		DefaultGroupDispatcher(DeviceFeature f) { super(f); }
		@Override
		public boolean dispatch(Msg msg, String port) {
			byte cmd  = 0x00;
			byte cmd1 = 0x00;
			boolean isConsumed = false;
			int key = -1;
			try {
				cmd  = msg.getByte("Cmd");
				cmd1 = msg.getByte("command1");
			} catch (FieldException e) {
				logger.debug("no command found, dropping msg {}", msg);
				return false;
			}
			if (msg.isAllLinkCleanupAckOrNack()) {
				// Had cases when a KeypadLinc would send an ALL_LINK_CLEANUP_ACK
				// in response to a direct status query message
				return false; 
			}
			if (handleAllLinkMessage(msg, port)) {
				return false;
			}
			if (msg.isAckOfDirect()) {
				// in the case of direct ack, the cmd1 code is useless.
				// you have to know what message was sent before to
				// interpret the reply message
				logger.debug("defdisp: {}:{} qs:{} cmd: {}", m_feature.getDevice().getAddress(), m_feature.getName(),
						m_feature.getQueryStatus(), cmd);
				if (isMyDirectAck(msg)) {
					isConsumed = true;
					if (cmd == 0x50) {
						// must be a reply to our message, tweak the cmd1 code!
						logger.debug("changing key to 0x19 for msg {}", msg);
						key = 0x19; // we have installed a handler under that command number
					}
				}
			} else {
				key = (cmd1 & 0xFF);
			}
			if (key != -1) {
				for (DeviceFeature f : m_feature.getConnectedFeatures()) {
					MessageHandler h = f.getMsgHandlers().get(key);
					if (h == null) h = f.getDefaultMsgHandler();
					logger.debug("{}:{}->{} DIRECT: {}", f.getDevice().getAddress(), f.getName(),
							h.getClass().getSimpleName(), msg);
					h.handleMessage(-1, cmd1, msg, f, port);
					
				}
			}
			if (isConsumed) {
				m_feature.setQueryStatus(DeviceFeature.QueryStatus.QUERY_ANSWERED);
				logger.debug("defdisp: {}:{} set status to: {}", m_feature.getDevice().getAddress(), m_feature.getName(),
						m_feature.getQueryStatus());
			}
			return isConsumed;
		}
	}

	
	private static class SimpleDispatcher extends MessageDispatcher {
		SimpleDispatcher(DeviceFeature f) { super(f); }
		@Override
		public boolean dispatch(Msg msg, String port) {
			byte cmd1 = 0x00;
			try {
				if (handleAllLinkMessage(msg, port)) {
					return false;
				}
				if (msg.isAllLinkCleanupAckOrNack()) {
					// Had cases when a KeypadLinc would send an ALL_LINK_CLEANUP_ACK
					// in response to a direct status query message
					return false; 
				}
				cmd1 = msg.getByte("command1");
			} catch (FieldException e) {
				logger.debug("no cmd1 found, dropping msg {}", msg);
				return false;
			}
			boolean isConsumed = isMyDirectAck(msg);
			int key = (cmd1 & 0xFF);
			MessageHandler h = m_feature.getMsgHandlers().get(key);
			if (h == null) h = m_feature.getDefaultMsgHandler();
			logger.trace("{}:{}->{} {}", m_feature.getDevice().getAddress(), m_feature.getName(),
					h.getClass().getSimpleName(), msg);
			h.handleMessage(-1, cmd1, msg, m_feature, port);
			return isConsumed;
		}
	}

	private static class X10Dispatcher extends MessageDispatcher {
		X10Dispatcher(DeviceFeature f) { super(f); }
		@Override
		public boolean dispatch(Msg msg, String port) {
			try {
				byte rawX10	= msg.getByte("rawX10");
				int cmd = (rawX10 & 0x0f);
				MessageHandler h = m_feature.getMsgHandlers().get(cmd);
				if (h == null) h = m_feature.getDefaultMsgHandler();
				logger.debug("{}:{}->{} {}", m_feature.getDevice().getAddress(), m_feature.getName(),
								h.getClass().getSimpleName(), msg);
						h.handleMessage(-1, (byte)cmd, msg, m_feature, port);
			} catch (FieldException e) {
				logger.error("error parsing {}: ", msg, e);
			}
			return false;
		}
	}

	private static class PassThroughDispatcher extends MessageDispatcher {
		PassThroughDispatcher(DeviceFeature f) { super(f); }
		@Override
		public boolean dispatch(Msg msg, String port) {
			MessageHandler h = m_feature.getDefaultMsgHandler();
			logger.trace("{}:{}->{} {}", m_feature.getDevice().getAddress(), m_feature.getName(),
					h.getClass().getSimpleName(), msg);
			h.handleMessage(-1, (byte)0x01, msg, m_feature, port);
			return false;
		}
	}

	/**
	 * Factory method for creating device dispatchers given a name.
	 * The name is usually the class name.
	 * @param name the name of the dispatcher to create
	 * @param f the feature for which to create the dispatcher
	 * @return the dispatcher which was created
	 */
	public static MessageDispatcher s_makeMessageDispatcher(String name, DeviceFeature f) {
		if (name.equals("PassThroughDispatcher")) return new PassThroughDispatcher(f);
		else if (name.equals("DefaultDispatcher")) return new DefaultDispatcher(f);
		else if (name.equals("DefaultGroupDispatcher")) return new DefaultGroupDispatcher(f);
		else if (name.equals("SimpleDispatcher")) return new SimpleDispatcher(f);
		else if (name.equals("X10Dispatcher")) return new X10Dispatcher(f);
		else {
			logger.error("unimplemented message dispatcher requested: {}", name);
			return null;
		}
	}
}
