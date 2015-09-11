/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.tinkerforge.internal.model;

import java.math.BigDecimal;

import org.openhab.binding.tinkerforge.internal.config.DeviceOptions;
import org.openhab.binding.tinkerforge.internal.types.PercentValue;
import org.openhab.core.library.types.PercentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Point Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.SetPointActor#getPercentValue <em>Percent Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getSetPointActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SetPointActor<C extends DimmableConfiguration> extends DimmableActor<C>
{
  /**
   * Returns the value of the '<em><b>Percent Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Percent Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Percent Value</em>' attribute.
   * @see #setPercentValue(PercentValue)
   * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getSetPointActor_PercentValue()
   * @model unique="false" dataType="org.openhab.binding.tinkerforge.internal.model.PercentValue"
   * @generated
   */
  PercentValue getPercentValue();

  /**
   * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.SetPointActor#getPercentValue <em>Percent Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Percent Value</em>' attribute.
   * @see #getPercentValue()
   * @generated
   */
  void setPercentValue(PercentValue value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model newValueUnique="false" optsDataType="org.openhab.binding.tinkerforge.internal.model.DeviceOptions" optsUnique="false"
   * @generated
   */
  void setValue(BigDecimal newValue, DeviceOptions opts);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model newValueDataType="org.openhab.binding.tinkerforge.internal.model.PercentType" newValueUnique="false" optsDataType="org.openhab.binding.tinkerforge.internal.model.DeviceOptions" optsUnique="false"
   * @generated
   */
  void setValue(PercentType newValue, DeviceOptions opts);

} // SetPointActor
