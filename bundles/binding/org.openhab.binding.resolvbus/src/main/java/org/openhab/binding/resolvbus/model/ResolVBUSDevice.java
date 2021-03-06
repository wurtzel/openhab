/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.binding.resolvbus.model;

/**
 * @author Michael Heckmann
 * @since 1.7.0
 */

public class ResolVBUSDevice {
	
	protected String address;
	protected String name;
	protected String mask;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMask() {
		return mask;
	}
	public void setMask(String mask) {
		this.mask = mask;
	}
}
