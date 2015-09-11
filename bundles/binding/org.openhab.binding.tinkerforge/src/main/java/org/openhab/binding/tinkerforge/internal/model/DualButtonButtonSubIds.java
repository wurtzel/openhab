/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.tinkerforge.internal.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dual Button Button Sub Ids</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getDualButtonButtonSubIds()
 * @model
 * @generated
 */
public enum DualButtonButtonSubIds implements Enumerator
{
  /**
   * The '<em><b>DUALBUTTON LEFTBUTTON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DUALBUTTON_LEFTBUTTON_VALUE
   * @generated
   * @ordered
   */
  DUALBUTTON_LEFTBUTTON(0, "DUALBUTTON_LEFTBUTTON", "DUALBUTTON_LEFTBUTTON"),

  /**
   * The '<em><b>DUALBUTTON RIGHTBUTTON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DUALBUTTON_RIGHTBUTTON_VALUE
   * @generated
   * @ordered
   */
  DUALBUTTON_RIGHTBUTTON(0, "DUALBUTTON_RIGHTBUTTON", "DUALBUTTON_RIGHTBUTTON");

  /**
   * The '<em><b>DUALBUTTON LEFTBUTTON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DUALBUTTON LEFTBUTTON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DUALBUTTON_LEFTBUTTON
   * @model
   * @generated
   * @ordered
   */
  public static final int DUALBUTTON_LEFTBUTTON_VALUE = 0;

  /**
   * The '<em><b>DUALBUTTON RIGHTBUTTON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DUALBUTTON RIGHTBUTTON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DUALBUTTON_RIGHTBUTTON
   * @model
   * @generated
   * @ordered
   */
  public static final int DUALBUTTON_RIGHTBUTTON_VALUE = 0;

  /**
   * An array of all the '<em><b>Dual Button Button Sub Ids</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DualButtonButtonSubIds[] VALUES_ARRAY =
    new DualButtonButtonSubIds[]
    {
      DUALBUTTON_LEFTBUTTON,
      DUALBUTTON_RIGHTBUTTON,
    };

  /**
   * A public read-only list of all the '<em><b>Dual Button Button Sub Ids</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DualButtonButtonSubIds> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Dual Button Button Sub Ids</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DualButtonButtonSubIds get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DualButtonButtonSubIds result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dual Button Button Sub Ids</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DualButtonButtonSubIds getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DualButtonButtonSubIds result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dual Button Button Sub Ids</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DualButtonButtonSubIds get(int value)
  {
    switch (value)
    {
      case DUALBUTTON_LEFTBUTTON_VALUE: return DUALBUTTON_LEFTBUTTON;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DualButtonButtonSubIds(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DualButtonButtonSubIds
