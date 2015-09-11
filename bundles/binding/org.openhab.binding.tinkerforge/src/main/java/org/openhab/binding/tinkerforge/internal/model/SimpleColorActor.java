/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.openhab.core.library.types.HSBType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Color Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getSimpleColorActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SimpleColorActor extends ColorActor
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model colorDataType="org.openhab.binding.tinkerforge.internal.model.HSBType" colorUnique="false"
   * @generated
   */
  void setSelectedColor(HSBType color);

} // SimpleColorActor
