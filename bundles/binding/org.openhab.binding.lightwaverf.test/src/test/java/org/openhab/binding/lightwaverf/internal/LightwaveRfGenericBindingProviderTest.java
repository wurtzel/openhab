/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.lightwaverf.internal;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.openhab.core.library.items.DimmerItem;
import org.openhab.core.library.items.NumberItem;
import org.openhab.core.library.items.SwitchItem;


public class LightwaveRfGenericBindingProviderTest {

	@Test
	public void testProcessBindingConfigurationForDimmer() throws Exception {
		String context = "";

		LightwaveRfGenericBindingProvider bingindProvider = new LightwaveRfGenericBindingProvider();
		bingindProvider.processBindingConfiguration(context, 
				new DimmerItem("MyDimmer"), "room=1,device=2,type=DIMMER");
		
		assertEquals(Arrays.asList("MyDimmer"), bingindProvider.getBindingItemsForRoomDevice("1", "2"));
		assertEquals(Arrays.asList("MyDimmer"), bingindProvider.getItemNames());
		assertEquals("1", bingindProvider.getRoomId("MyDimmer"));
		assertEquals("2", bingindProvider.getDeviceId("MyDimmer"));
		assertEquals(LightwaveRfType.DIMMER, bingindProvider.getTypeForItemName("MyDimmer"));
	}

	@Test
	public void testProcessBindingConfigurationForSwitch() throws Exception {
		String context = "";
		
		LightwaveRfGenericBindingProvider bingindProvider = new LightwaveRfGenericBindingProvider();
		bingindProvider.processBindingConfiguration(context, 
				new SwitchItem("MySwitch"), "room=3,device=4,type=SWITCH");
		
		assertEquals(Arrays.asList("MySwitch"), bingindProvider.getBindingItemsForRoomDevice("3", "4"));
		assertEquals(Arrays.asList("MySwitch"), bingindProvider.getItemNames());
		assertEquals("3", bingindProvider.getRoomId("MySwitch"));
		assertEquals("4", bingindProvider.getDeviceId("MySwitch"));
		assertEquals(LightwaveRfType.SWITCH, bingindProvider.getTypeForItemName("MySwitch"));
	}
	
	@Test
	public void testProcessBindingConfigurationForHeatingBattery() throws Exception {
		String context = "";
		
		LightwaveRfGenericBindingProvider bingindProvider = new LightwaveRfGenericBindingProvider();
		bingindProvider.processBindingConfiguration(context, 
				new NumberItem("MyBattery"), "room=3,device=4,type=HEATING_BATTERY");
		
		assertEquals(Arrays.asList("MyBattery"), bingindProvider.getBindingItemsForRoomDevice("3", "4"));
		assertEquals(Arrays.asList("MyBattery"), bingindProvider.getItemNames());
		assertEquals("3", bingindProvider.getRoomId("MyBattery"));
		assertEquals("4", bingindProvider.getDeviceId("MyBattery"));
		assertEquals(LightwaveRfType.HEATING_BATTERY, bingindProvider.getTypeForItemName("MyBattery"));
	}
	
	@Test
	public void testRealLifeConfigurationForHeatingBattery() throws Exception {
		String context = "";
		
		LightwaveRfGenericBindingProvider bingindProvider = new LightwaveRfGenericBindingProvider();
		bingindProvider.processBindingConfiguration(context, 
				new NumberItem("MyBattery"), "room=3,device=4,type=HEATING_BATTERY");
		bingindProvider.processBindingConfiguration(context, 
				new NumberItem("MyCurrentTemp"), "room=3,device=4,type=HEATING_CURRENT_TEMP");
		bingindProvider.processBindingConfiguration(context, 
				new DimmerItem("MyDimmer"), "room=1,device=2,type=DIMMER");
		bingindProvider.processBindingConfiguration(context, 
				new SwitchItem("MySwitch"), "room=3,device=3,type=SWITCH");
		
		assertEquals(Arrays.asList("MyBattery", "MySwitch", "MyCurrentTemp", "MyDimmer"), bingindProvider.getItemNames());

		assertEquals(Arrays.asList("MySwitch"), bingindProvider.getBindingItemsForRoomDevice("3", "3"));
		assertEquals("3", bingindProvider.getRoomId("MySwitch"));
		assertEquals("3", bingindProvider.getDeviceId("MySwitch"));
		assertEquals(LightwaveRfType.SWITCH, bingindProvider.getTypeForItemName("MySwitch"));
		
		assertEquals(Arrays.asList("MyDimmer"), bingindProvider.getBindingItemsForRoomDevice("1", "2"));
		assertEquals("1", bingindProvider.getRoomId("MyDimmer"));
		assertEquals("2", bingindProvider.getDeviceId("MyDimmer"));
		assertEquals(LightwaveRfType.DIMMER, bingindProvider.getTypeForItemName("MyDimmer"));
		
		assertEquals(Arrays.asList("MyBattery", "MyCurrentTemp"), bingindProvider.getBindingItemsForRoomDevice("3", "4"));
		assertEquals("3", bingindProvider.getRoomId("MyBattery"));
		assertEquals("4", bingindProvider.getDeviceId("MyBattery"));
		assertEquals(LightwaveRfType.HEATING_BATTERY, bingindProvider.getTypeForItemName("MyBattery"));
		assertEquals("3", bingindProvider.getRoomId("MyCurrentTemp"));
		assertEquals("4", bingindProvider.getDeviceId("MyCurrentTemp"));
		assertEquals(LightwaveRfType.HEATING_CURRENT_TEMP, bingindProvider.getTypeForItemName("MyCurrentTemp"));
	}
}
