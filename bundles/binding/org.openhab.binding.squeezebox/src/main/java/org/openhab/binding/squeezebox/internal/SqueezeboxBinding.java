/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.squeezebox.internal;

import java.util.ArrayList;
import java.util.List;

import org.openhab.binding.squeezebox.SqueezeboxBindingConfig;
import org.openhab.binding.squeezebox.SqueezeboxBindingProvider;
import org.openhab.core.binding.AbstractBinding;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.IncreaseDecreaseType;
import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.PercentType;
import org.openhab.core.library.types.StringType;
import org.openhab.core.library.types.UpDownType;
import org.openhab.core.types.Command;
import org.openhab.io.squeezeserver.SqueezePlayer;
import org.openhab.io.squeezeserver.SqueezePlayer.PlayerEvent;
import org.openhab.io.squeezeserver.SqueezePlayerEventListener;
import org.openhab.io.squeezeserver.SqueezeServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Binding which communicates with (one or many) Squeezeboxes. 
 * 
 * @author Markus Wolters
 * @author Ben Jones
 * @since 1.3.0
 */
public class SqueezeboxBinding extends AbstractBinding<SqueezeboxBindingProvider> implements SqueezePlayerEventListener {
	
	private static final Logger logger = LoggerFactory.getLogger(SqueezeboxBinding.class);

	private SqueezeServer squeezeServer;
	
	/**
	 * @{inheritDoc}
	 */
	@Override
	public void internalReceiveCommand(String itemName, Command command) {
		if (squeezeServer == null) {
			logger.warn("Squeeze Server not initialised or configured yet, ignoring command '{}' for item '{}'", command.toString(), itemName);
			return;
		}

		logger.trace("internalReceiveCommand(itemname = {}, command = {})", itemName, command.toString());
		for (SqueezeboxBindingProvider provider : providers) {
			SqueezeboxBindingConfig bindingConfig = provider.getSqueezeboxBindingConfig(itemName);
			String playerId = bindingConfig.getPlayerId();		
			
			try {
				switch (bindingConfig.getCommandType()) {
					case POWER:
						if (command.equals(OnOffType.ON))
							squeezeServer.powerOn(playerId);
						else if (command.equals(OnOffType.OFF))
							squeezeServer.powerOff(playerId);						
						break;
					
					case MUTE:
						if (command.equals(OnOffType.ON))
							squeezeServer.mute(playerId);
						else if (command.equals(OnOffType.OFF))
							squeezeServer.unMute(playerId);						
						break;
					
					case VOLUME: 
						if (command.equals(IncreaseDecreaseType.INCREASE))						
							squeezeServer.volumeUp(playerId);
						else if (command.equals(IncreaseDecreaseType.DECREASE))
							squeezeServer.volumeDown(playerId); 
						else if (command.equals(UpDownType.UP))						
							squeezeServer.volumeUp(playerId);
						else if (command.equals(UpDownType.DOWN))
							squeezeServer.volumeDown(playerId); 
						else if (command instanceof DecimalType)
							squeezeServer.setVolume(playerId, ((DecimalType)command).intValue()); 
						break;

					case PLAY:
						if (command.equals(OnOffType.ON))
							squeezeServer.play(playerId);
						else if (command.equals(OnOffType.OFF))
							squeezeServer.stop(playerId);
						break;
					case PAUSE:
						if (command.equals(OnOffType.ON))
							squeezeServer.pause(playerId);
						else if (command.equals(OnOffType.OFF))
							squeezeServer.unPause(playerId);
						break;
					case STOP:
						if (command.equals(OnOffType.ON))
							squeezeServer.stop(playerId);
						else if (command.equals(OnOffType.OFF))
							squeezeServer.play(playerId);
						break;
					case NEXT:
						if (command.equals(OnOffType.ON))
							squeezeServer.next(playerId);
						break;						
					case PREV:
						if (command.equals(OnOffType.ON))
							squeezeServer.prev(playerId);
						break;
						
					case HTTP: 
						if (command.equals(OnOffType.ON))
							squeezeServer.playUrl(playerId, "http://" + bindingConfig.getExtra()); 
						else if (command.equals(OnOffType.OFF))
							squeezeServer.stop(playerId);
						break;
					case FILE: 
						if (command.equals(OnOffType.ON))
							squeezeServer.playUrl(playerId, "file://" + bindingConfig.getExtra()); 
						else if (command.equals(OnOffType.OFF))
							squeezeServer.stop(playerId);
						break;
					
					case SYNC: 
						if (command.equals(OnOffType.ON))
							squeezeServer.syncPlayer(playerId, bindingConfig.getExtra()); 
						else if (command.equals(OnOffType.OFF))
							squeezeServer.unSyncPlayer(bindingConfig.getExtra());
						break;
					case COMMAND:
					    if (command instanceof StringType)
					    	squeezeServer.playerCommand(playerId, command.toString());
					    else
						squeezeServer.playerCommand(playerId, bindingConfig.getExtra());
					    	break;

					default:
						logger.warn("Unsupported command type '{}'", bindingConfig.getCommandType()); 
				}
			}
			catch (Exception e) {
				logger.warn("Error executing command type '" + bindingConfig.getCommandType() + "'", e);
			}	
		}
	}

	@Override
	public void powerChangeEvent(PlayerEvent event) {
		booleanChangeEvent(event.getPlayerId(), CommandType.POWER, event.getPlayer().isPowered());
	}

	@Override
	public void muteChangeEvent(PlayerEvent event) {
		booleanChangeEvent(event.getPlayerId(), CommandType.MUTE, event.getPlayer().isMuted());
	}
	
	@Override
	public void volumeChangeEvent(PlayerEvent event) {
		numberChangeEvent(event.getPlayerId(), CommandType.VOLUME, event.getPlayer().getVolume());
	}
	
	@Override
	public void currentPlaylistIndexEvent(PlayerEvent event) {
		numberChangeEvent(event.getPlayerId(), CommandType.CURRTRACK, event.getPlayer().getCurrentPlaylistIndex());
	}
	
	@Override
	public void currentPlayingTimeEvent(PlayerEvent event) {
		numberChangeEvent(event.getPlayerId(), CommandType.PLAYTIME, event.getPlayer().getCurrentPlayingTime());
	}
	
	@Override
	public void numberPlaylistTracksEvent(PlayerEvent event) {
		numberChangeEvent(event.getPlayerId(), CommandType.NUMTRACKS, event.getPlayer().getNumberPlaylistTracks());
	}
	@Override
	public void currentPlaylistShuffleEvent(PlayerEvent event) {
		numberChangeEvent(event.getPlayerId(), CommandType.SHUFFLE, event.getPlayer().getCurrentPlaylistShuffle());
	}
	@Override
	public void currentPlaylistRepeatEvent(PlayerEvent event) {
		numberChangeEvent(event.getPlayerId(), CommandType.REPEAT, event.getPlayer().getCurrentPlaylistRepeat());
	}
	@Override
	public void modeChangeEvent(PlayerEvent event) {
		booleanChangeEvent(event.getPlayerId(), CommandType.PLAY, event.getPlayer().isPlaying());
		booleanChangeEvent(event.getPlayerId(), CommandType.PAUSE, event.getPlayer().isPaused());
		booleanChangeEvent(event.getPlayerId(), CommandType.STOP, event.getPlayer().isStopped());
	}

	@Override
	public void titleChangeEvent(PlayerEvent event) {
		stringChangeEvent(event.getPlayerId(), CommandType.TITLE, event.getPlayer().getTitle());
	}
		
	@Override
	public void albumChangeEvent(PlayerEvent event) {
		stringChangeEvent(event.getPlayerId(), CommandType.ALBUM, event.getPlayer().getAlbum());
	}

	@Override
	public void artistChangeEvent(PlayerEvent event) {
		stringChangeEvent(event.getPlayerId(), CommandType.ARTIST, event.getPlayer().getArtist());
	}

	@Override
	public void coverArtChangeEvent(PlayerEvent event) {
		stringChangeEvent(event.getPlayerId(), CommandType.COVERART, event.getPlayer().getCoverArt());
	}

	@Override
	public void yearChangeEvent(PlayerEvent event) {
		stringChangeEvent(event.getPlayerId(), CommandType.YEAR, Integer.toString(event.getPlayer().getYear()));
	}

	@Override
	public void genreChangeEvent(PlayerEvent event) {
		stringChangeEvent(event.getPlayerId(), CommandType.GENRE, event.getPlayer().getGenre());
	}

	@Override
	public void remoteTitleChangeEvent(PlayerEvent event) {
		stringChangeEvent(event.getPlayerId(), CommandType.REMOTETITLE, event.getPlayer().getRemoteTitle());
	}
	
	@Override
	public void irCodeChangeEvent(PlayerEvent event) {
		stringChangeEvent(event.getPlayerId(), CommandType.IRCODE, event.getPlayer().getIrCode());
	}
	
	private void stringChangeEvent(String playerId, CommandType commandType, String newState) {
		logger.debug("SqueezePlayer " + playerId + " -> " + commandType.getCommand() + ": " + newState);
		for (String itemName : getItemNames(playerId, commandType)) {
			eventPublisher.postUpdate(itemName, StringType.valueOf(newState));
		}
	}
	
	private void numberChangeEvent(String playerId, CommandType commandType, int newState) {
		logger.debug("SqueezePlayer " + playerId + " -> " + commandType.getCommand() + ": " + Integer.toString(newState));
		for (String itemName : getItemNames(playerId, commandType)) {
			eventPublisher.postUpdate(itemName, new PercentType(newState));
		}
	}
	
	private void booleanChangeEvent(String playerId, CommandType commandType, boolean newState) {
		logger.debug("SqueezePlayer " + playerId + " -> " + commandType.getCommand() + ": " + Boolean.toString(newState));
		for (String itemName : getItemNames(playerId, commandType)) {
			if (newState) {
				eventPublisher.postUpdate(itemName, OnOffType.ON);
			} else {
				eventPublisher.postUpdate(itemName, OnOffType.OFF);
			}
		}
	}

	private List<String> getItemNames(String playerId, CommandType commandType) {
		List<String> itemNames = new ArrayList<String>();
		for (SqueezeboxBindingProvider provider : this.providers) {
			for (String itemName : provider.getItemNames()) {
				SqueezeboxBindingConfig bindingConfig = provider.getSqueezeboxBindingConfig(itemName);
				if (!bindingConfig.getPlayerId().equals(playerId))
					continue;
				if (!bindingConfig.getCommandType().equals(commandType))
					continue;
				itemNames.add(itemName);
			}
		}
		return itemNames;
	}
	
	/**
	 * Setter for Declarative Services. Adds the SqueezeServer instance.
	 * 
	 * @param squeezeServer
	 *            Service.
	 */
	public void setSqueezeServer(SqueezeServer squeezeServer) {
		this.squeezeServer = squeezeServer;
		this.squeezeServer.addPlayerEventListener(this);
	}

	/**
	 * Unsetter for Declarative Services.
	 * 
	 * @param squeezeServer
	 *            Service to remove.
	 */
	public void unsetSqueezeServer(SqueezeServer squeezeServer) {
		this.squeezeServer.removePlayerEventListener(this);
		this.squeezeServer = null;
	}
}
