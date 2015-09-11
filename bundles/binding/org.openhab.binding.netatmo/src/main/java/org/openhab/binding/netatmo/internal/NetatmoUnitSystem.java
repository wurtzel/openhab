/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.netatmo.internal;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

/**
 * @author Rob Nielsen
 * @since 1.8.0
 *
 *        This enum holds all the different unit systems for the Netatmo binding,
 *        along with conversion methods
 */
public enum NetatmoUnitSystem {
	M("Metric"), US("US");

	public static final NetatmoUnitSystem DEFAULT_UNIT_SYSTEM = NetatmoUnitSystem.M;

	private static final double METERS_TO_FEET = 3.2808399;

	private static final BigDecimal MM_TO_INCHES = new BigDecimal(0.0393700787);

	private static final BigDecimal ONE_POINT_EIGHT = new BigDecimal(1.8);

	private static final BigDecimal THIRTY_TWO = new BigDecimal(32);

	String unitSystem;

	private NetatmoUnitSystem(String unitSystem) {
		this.unitSystem = unitSystem;
	}

	public String getunitSystem() {
		return unitSystem;
	}

	public static NetatmoUnitSystem fromString(String unitSystem) {
		if (!StringUtils.isEmpty(unitSystem)) {
			for (NetatmoUnitSystem unitSystemType : NetatmoUnitSystem.values()) {
				if (unitSystemType.toString().equalsIgnoreCase(unitSystem)) {
					return unitSystemType;
				}
			}
		}
		throw new IllegalArgumentException("Invalid unitSystem: " + unitSystem);
	}
	
	public double convertAltitude(double value) {
		if (this == DEFAULT_UNIT_SYSTEM) {
			return value;
		}
		
		return value * METERS_TO_FEET;
	}
	
	public BigDecimal convertRain(BigDecimal value) {
		if (this == DEFAULT_UNIT_SYSTEM) {
			return value;
		}
		
		return value.multiply(MM_TO_INCHES);
	}
	
	public BigDecimal convertTemp(BigDecimal value) {
		if (this == DEFAULT_UNIT_SYSTEM) {
			return value;
		}
		
		return value.multiply(ONE_POINT_EIGHT).add(THIRTY_TWO);
	}
}
