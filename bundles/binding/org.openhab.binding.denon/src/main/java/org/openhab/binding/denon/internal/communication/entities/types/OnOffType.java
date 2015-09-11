/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.denon.internal.communication.entities.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.openhab.binding.denon.internal.communication.adapters.OnOffAdapter;

/**
 * Contains an On/Off value in the form of a boolean 
 * 
 * @author Jeroen Idserda
 * @since 1.7.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class OnOffType {
	
	@XmlJavaTypeAdapter(OnOffAdapter.class)
	private Boolean value;

	public Boolean getValue() {
		return value;
	}

	public void setValue(Boolean value) {
		this.value = value;
	}

}
