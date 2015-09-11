/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * 
 * @author Theo Weiss
 * @since 1.3.0
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * Copyright (c) 2010-2015, openHAB.org and others.
 *  * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * <!-- end-model-doc -->
 * @see org.openhab.binding.tinkerforge.internal.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.openhab.binding.tinkerforge.internal' literalsInterface='true' loadInitialization='false' adapterFactory='false'"
 * @generated
 */
public interface ModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "model";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.openhab.binding.tinkerforge.internal.model";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "model";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelPackage eINSTANCE = org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.TFConfig <em>TF Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.TFConfig
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFConfig()
   * @generated
   */
  int TF_CONFIG = 100;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.OHTFDeviceImpl <em>OHTF Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.OHTFDeviceImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getOHTFDevice()
   * @generated
   */
  int OHTF_DEVICE = 101;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.OHConfigImpl <em>OH Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.OHConfigImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getOHConfig()
   * @generated
   */
  int OH_CONFIG = 103;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.EcosystemImpl <em>Ecosystem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.EcosystemImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getEcosystem()
   * @generated
   */
  int ECOSYSTEM = 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickdImpl <em>MBrickd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickdImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickd()
   * @generated
   */
  int MBRICKD = 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MTFConfigConsumer <em>MTF Config Consumer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MTFConfigConsumer
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTFConfigConsumer()
   * @generated
   */
  int MTF_CONFIG_CONSUMER = 3;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MBaseDevice <em>MBase Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MBaseDevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBaseDevice()
   * @generated
   */
  int MBASE_DEVICE = 4;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MDevice <em>MDevice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MDevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMDevice()
   * @generated
   */
  int MDEVICE = 5;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder <em>MSub Device Holder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMSubDeviceHolder()
   * @generated
   */
  int MSUB_DEVICE_HOLDER = 6;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickServoImpl <em>MBrick Servo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickServoImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickServo()
   * @generated
   */
  int MBRICK_SERVO = 38;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFBrickDCConfigurationImpl <em>TF Brick DC Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFBrickDCConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFBrickDCConfiguration()
   * @generated
   */
  int TF_BRICK_DC_CONFIGURATION = 112;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl <em>MDual Relay Bricklet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMDualRelayBricklet()
   * @generated
   */
  int MDUAL_RELAY_BRICKLET = 41;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MActor <em>MActor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMActor()
   * @generated
   */
  int MACTOR = 7;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MSwitchActor <em>MSwitch Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MSwitchActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMSwitchActor()
   * @generated
   */
  int MSWITCH_ACTOR = 9;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MInSwitchActor <em>MIn Switch Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MInSwitchActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMInSwitchActor()
   * @generated
   */
  int MIN_SWITCH_ACTOR = 11;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickDCImpl <em>MBrick DC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickDCImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickDC()
   * @generated
   */
  int MBRICK_DC = 40;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialQuadRelayBrickletImpl <em>MIndustrial Quad Relay Bricklet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialQuadRelayBrickletImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMIndustrialQuadRelayBricklet()
   * @generated
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET = 42;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialQuadRelayImpl <em>MIndustrial Quad Relay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialQuadRelayImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMIndustrialQuadRelay()
   * @generated
   */
  int MINDUSTRIAL_QUAD_RELAY = 43;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDigitalIn4Impl <em>MBricklet Industrial Digital In4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDigitalIn4Impl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletIndustrialDigitalIn4()
   * @generated
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4 = 44;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MSubDevice <em>MSub Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MSubDevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMSubDevice()
   * @generated
   */
  int MSUB_DEVICE = 14;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialDigitalInImpl <em>MIndustrial Digital In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialDigitalInImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMIndustrialDigitalIn()
   * @generated
   */
  int MINDUSTRIAL_DIGITAL_IN = 45;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFIOActorConfigurationImpl <em>TFIO Actor Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFIOActorConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFIOActorConfiguration()
   * @generated
   */
  int TFIO_ACTOR_CONFIGURATION = 113;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIO16Impl <em>MBricklet IO16</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIO16Impl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletIO16()
   * @generated
   */
  int MBRICKLET_IO16 = 52;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DigitalSensorImpl <em>Digital Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.DigitalSensorImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalSensor()
   * @generated
   */
  int DIGITAL_SENSOR = 53;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.IODevice <em>IO Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.IODevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIODevice()
   * @generated
   */
  int IO_DEVICE = 13;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFInterruptListenerConfigurationImpl <em>TF Interrupt Listener Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFInterruptListenerConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFInterruptListenerConfiguration()
   * @generated
   */
  int TF_INTERRUPT_LISTENER_CONFIGURATION = 114;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFIOSensorConfigurationImpl <em>TFIO Sensor Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFIOSensorConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFIOSensorConfiguration()
   * @generated
   */
  int TFIO_SENSOR_CONFIGURATION = 115;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl <em>MDual Relay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMDualRelay()
   * @generated
   */
  int MDUAL_RELAY = 64;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFNullConfigurationImpl <em>TF Null Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFNullConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFNullConfiguration()
   * @generated
   */
  int TF_NULL_CONFIGURATION = 104;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFServoConfigurationImpl <em>TF Servo Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFServoConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFServoConfiguration()
   * @generated
   */
  int TF_SERVO_CONFIGURATION = 116;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MServoImpl <em>MServo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MServoImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMServo()
   * @generated
   */
  int MSERVO = 39;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.CallbackListener <em>Callback Listener</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.CallbackListener
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getCallbackListener()
   * @generated
   */
  int CALLBACK_LISTENER = 15;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.InterruptListener <em>Interrupt Listener</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.InterruptListener
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getInterruptListener()
   * @generated
   */
  int INTERRUPT_LISTENER = 16;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MSensor <em>MSensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MSensor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMSensor()
   * @generated
   */
  int MSENSOR = 17;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletHumidityImpl <em>MBricklet Humidity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletHumidityImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletHumidity()
   * @generated
   */
  int MBRICKLET_HUMIDITY = 70;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDistanceIRImpl <em>MBricklet Distance IR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDistanceIRImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletDistanceIR()
   * @generated
   */
  int MBRICKLET_DISTANCE_IR = 71;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTemperatureImpl <em>MBricklet Temperature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTemperatureImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletTemperature()
   * @generated
   */
  int MBRICKLET_TEMPERATURE = 80;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFBaseConfigurationImpl <em>TF Base Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFBaseConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFBaseConfiguration()
   * @generated
   */
  int TF_BASE_CONFIGURATION = 107;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOSYSTEM__LOGGER = 0;

  /**
   * The feature id for the '<em><b>Mbrickds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOSYSTEM__MBRICKDS = 1;

  /**
   * The number of structural features of the '<em>Ecosystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOSYSTEM_FEATURE_COUNT = 2;

  /**
   * The operation id for the '<em>Get Brickd</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOSYSTEM___GET_BRICKD__STRING_INT = 0;

  /**
   * The operation id for the '<em>Get Device</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOSYSTEM___GET_DEVICE__STRING_STRING = 1;

  /**
   * The operation id for the '<em>Get Devices4 Generic Id</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOSYSTEM___GET_DEVICES4_GENERIC_ID__STRING_STRING = 2;

  /**
   * The operation id for the '<em>Disconnect</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOSYSTEM___DISCONNECT = 3;

  /**
   * The number of operations of the '<em>Ecosystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECOSYSTEM_OPERATION_COUNT = 4;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__LOGGER = 0;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__IP_CONNECTION = 1;

  /**
   * The feature id for the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__HOST = 2;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__PORT = 3;

  /**
   * The feature id for the '<em><b>Authkey</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__AUTHKEY = 4;

  /**
   * The feature id for the '<em><b>Is Connected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__IS_CONNECTED = 5;

  /**
   * The feature id for the '<em><b>Auto Reconnect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__AUTO_RECONNECT = 6;

  /**
   * The feature id for the '<em><b>Reconnected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__RECONNECTED = 7;

  /**
   * The feature id for the '<em><b>Connected Counter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__CONNECTED_COUNTER = 8;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__TIMEOUT = 9;

  /**
   * The feature id for the '<em><b>Mdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__MDEVICES = 10;

  /**
   * The feature id for the '<em><b>Ecosystem</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD__ECOSYSTEM = 11;

  /**
   * The number of structural features of the '<em>MBrickd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD_FEATURE_COUNT = 12;

  /**
   * The operation id for the '<em>Connect</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD___CONNECT = 0;

  /**
   * The operation id for the '<em>Disconnect</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD___DISCONNECT = 1;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD___INIT = 2;

  /**
   * The operation id for the '<em>Get Device</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD___GET_DEVICE__STRING = 3;

  /**
   * The number of operations of the '<em>MBrickd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKD_OPERATION_COUNT = 4;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.SubDeviceAdmin <em>Sub Device Admin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.SubDeviceAdmin
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getSubDeviceAdmin()
   * @generated
   */
  int SUB_DEVICE_ADMIN = 2;

  /**
   * The number of structural features of the '<em>Sub Device Admin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DEVICE_ADMIN_FEATURE_COUNT = 0;

  /**
   * The operation id for the '<em>Add Sub Device</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DEVICE_ADMIN___ADD_SUB_DEVICE__STRING_STRING = 0;

  /**
   * The number of operations of the '<em>Sub Device Admin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DEVICE_ADMIN_OPERATION_COUNT = 1;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTF_CONFIG_CONSUMER__TF_CONFIG = 0;

  /**
   * The number of structural features of the '<em>MTF Config Consumer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTF_CONFIG_CONSUMER_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>MTF Config Consumer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTF_CONFIG_CONSUMER_OPERATION_COUNT = 0;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBASE_DEVICE__LOGGER = 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBASE_DEVICE__UID = 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBASE_DEVICE__POLL = 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBASE_DEVICE__ENABLED_A = 3;

  /**
   * The number of structural features of the '<em>MBase Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBASE_DEVICE_FEATURE_COUNT = 4;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBASE_DEVICE___INIT = 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBASE_DEVICE___ENABLE = 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBASE_DEVICE___DISABLE = 2;

  /**
   * The number of operations of the '<em>MBase Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBASE_DEVICE_OPERATION_COUNT = 3;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__LOGGER = MBASE_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__UID = MBASE_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__POLL = MBASE_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__ENABLED_A = MBASE_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__TINKERFORGE_DEVICE = MBASE_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__IP_CONNECTION = MBASE_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__CONNECTED_UID = MBASE_DEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__POSITION = MBASE_DEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__DEVICE_IDENTIFIER = MBASE_DEVICE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__NAME = MBASE_DEVICE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE__BRICKD = MBASE_DEVICE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>MDevice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE_FEATURE_COUNT = MBASE_DEVICE_FEATURE_COUNT + 7;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE___INIT = MBASE_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE___ENABLE = MBASE_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE___DISABLE = MBASE_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>MDevice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDEVICE_OPERATION_COUNT = MBASE_DEVICE_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE_HOLDER__MSUBDEVICES = 0;

  /**
   * The number of structural features of the '<em>MSub Device Holder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE_HOLDER_FEATURE_COUNT = 1;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE_HOLDER___INIT_SUB_DEVICES = 0;

  /**
   * The number of operations of the '<em>MSub Device Holder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE_HOLDER_OPERATION_COUNT = 1;

  /**
   * The number of structural features of the '<em>MActor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACTOR_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>MActor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACTOR_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.SwitchSensor <em>Switch Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.SwitchSensor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getSwitchSensor()
   * @generated
   */
  int SWITCH_SENSOR = 8;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_SENSOR__SWITCH_STATE = 0;

  /**
   * The number of structural features of the '<em>Switch Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_SENSOR_FEATURE_COUNT = 1;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_SENSOR___FETCH_SWITCH_STATE = 0;

  /**
   * The number of operations of the '<em>Switch Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_SENSOR_OPERATION_COUNT = 1;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSWITCH_ACTOR__SWITCH_STATE = SWITCH_SENSOR__SWITCH_STATE;

  /**
   * The number of structural features of the '<em>MSwitch Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSWITCH_ACTOR_FEATURE_COUNT = SWITCH_SENSOR_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSWITCH_ACTOR___FETCH_SWITCH_STATE = SWITCH_SENSOR___FETCH_SWITCH_STATE;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSWITCH_ACTOR___TURN_SWITCH__ONOFFVALUE = SWITCH_SENSOR_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MSwitch Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSWITCH_ACTOR_OPERATION_COUNT = SWITCH_SENSOR_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.ProgrammableSwitchActor <em>Programmable Switch Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.ProgrammableSwitchActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getProgrammableSwitchActor()
   * @generated
   */
  int PROGRAMMABLE_SWITCH_ACTOR = 10;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMMABLE_SWITCH_ACTOR__SWITCH_STATE = SWITCH_SENSOR__SWITCH_STATE;

  /**
   * The number of structural features of the '<em>Programmable Switch Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMMABLE_SWITCH_ACTOR_FEATURE_COUNT = SWITCH_SENSOR_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMMABLE_SWITCH_ACTOR___FETCH_SWITCH_STATE = SWITCH_SENSOR___FETCH_SWITCH_STATE;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMMABLE_SWITCH_ACTOR___TURN_SWITCH__ONOFFVALUE_DEVICEOPTIONS = SWITCH_SENSOR_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Programmable Switch Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMMABLE_SWITCH_ACTOR_OPERATION_COUNT = SWITCH_SENSOR_OPERATION_COUNT + 1;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_SWITCH_ACTOR__SWITCH_STATE = MSWITCH_ACTOR__SWITCH_STATE;

  /**
   * The number of structural features of the '<em>MIn Switch Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_SWITCH_ACTOR_FEATURE_COUNT = MSWITCH_ACTOR_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_SWITCH_ACTOR___FETCH_SWITCH_STATE = MSWITCH_ACTOR___FETCH_SWITCH_STATE;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_SWITCH_ACTOR___TURN_SWITCH__ONOFFVALUE = MSWITCH_ACTOR___TURN_SWITCH__ONOFFVALUE;

  /**
   * The number of operations of the '<em>MIn Switch Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_SWITCH_ACTOR_OPERATION_COUNT = MSWITCH_ACTOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.GenericDevice <em>Generic Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.GenericDevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getGenericDevice()
   * @generated
   */
  int GENERIC_DEVICE = 12;

  /**
   * The feature id for the '<em><b>Generic Device Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_DEVICE__GENERIC_DEVICE_ID = 0;

  /**
   * The number of structural features of the '<em>Generic Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_DEVICE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Generic Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_DEVICE_OPERATION_COUNT = 0;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE__LOGGER = MBASE_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE__UID = MBASE_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE__POLL = MBASE_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE__ENABLED_A = MBASE_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE__SUB_ID = MBASE_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE__MBRICK = MBASE_DEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MSub Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE_FEATURE_COUNT = MBASE_DEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE___INIT = MBASE_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE___ENABLE = MBASE_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE___DISABLE = MBASE_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>MSub Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSUB_DEVICE_OPERATION_COUNT = MBASE_DEVICE_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE__LOGGER = MSUB_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE__UID = MSUB_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE__POLL = MSUB_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE__ENABLED_A = MSUB_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE__SUB_ID = MSUB_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE__MBRICK = MSUB_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Generic Device Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE__GENERIC_DEVICE_ID = MSUB_DEVICE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>IO Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE_FEATURE_COUNT = MSUB_DEVICE_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE___INIT = MSUB_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE___ENABLE = MSUB_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE___DISABLE = MSUB_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>IO Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO_DEVICE_OPERATION_COUNT = MSUB_DEVICE_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_LISTENER__CALLBACK_PERIOD = 0;

  /**
   * The number of structural features of the '<em>Callback Listener</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_LISTENER_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Callback Listener</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_LISTENER_OPERATION_COUNT = 0;

  /**
   * The feature id for the '<em><b>Debounce Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERRUPT_LISTENER__DEBOUNCE_PERIOD = 0;

  /**
   * The number of structural features of the '<em>Interrupt Listener</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERRUPT_LISTENER_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Interrupt Listener</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERRUPT_LISTENER_OPERATION_COUNT = 0;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSENSOR__SENSOR_VALUE = 0;

  /**
   * The number of structural features of the '<em>MSensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSENSOR_FEATURE_COUNT = 1;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSENSOR___FETCH_SENSOR_VALUE = 0;

  /**
   * The number of operations of the '<em>MSensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSENSOR_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletBarometerImpl <em>MBricklet Barometer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletBarometerImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletBarometer()
   * @generated
   */
  int MBRICKLET_BAROMETER = 91;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBarometerTemperatureImpl <em>MBarometer Temperature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBarometerTemperatureImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBarometerTemperature()
   * @generated
   */
  int MBAROMETER_TEMPERATURE = 92;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletAmbientLightImpl <em>MBricklet Ambient Light</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletAmbientLightImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletAmbientLight()
   * @generated
   */
  int MBRICKLET_AMBIENT_LIGHT = 93;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLCD20x4Impl <em>MBricklet LCD2 0x4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLCD20x4Impl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletLCD20x4()
   * @generated
   */
  int MBRICKLET_LCD2_0X4 = 97;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MTextActor <em>MText Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MTextActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTextActor()
   * @generated
   */
  int MTEXT_ACTOR = 18;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEXT_ACTOR__TEXT = 0;

  /**
   * The number of structural features of the '<em>MText Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEXT_ACTOR_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>MText Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEXT_ACTOR_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MLCDSubDevice <em>MLCD Sub Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MLCDSubDevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMLCDSubDevice()
   * @generated
   */
  int MLCD_SUB_DEVICE = 19;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE__LOGGER = MSUB_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE__UID = MSUB_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE__POLL = MSUB_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE__ENABLED_A = MSUB_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE__SUB_ID = MSUB_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE__MBRICK = MSUB_DEVICE__MBRICK;

  /**
   * The number of structural features of the '<em>MLCD Sub Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE_FEATURE_COUNT = MSUB_DEVICE_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE___INIT = MSUB_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE___ENABLE = MSUB_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE___DISABLE = MSUB_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>MLCD Sub Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD_SUB_DEVICE_OPERATION_COUNT = MSUB_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDigitalOut4Impl <em>MBricklet Industrial Digital Out4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDigitalOut4Impl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletIndustrialDigitalOut4()
   * @generated
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4 = 46;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActor <em>Digital Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalActor()
   * @generated
   */
  int DIGITAL_ACTOR = 20;

  /**
   * The feature id for the '<em><b>Digital State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR__DIGITAL_STATE = 0;

  /**
   * The number of structural features of the '<em>Digital Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_FEATURE_COUNT = 1;

  /**
   * The operation id for the '<em>Turn Digital</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR___TURN_DIGITAL__HIGHLOWVALUE = 0;

  /**
   * The operation id for the '<em>Fetch Digital Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR___FETCH_DIGITAL_VALUE = 1;

  /**
   * The number of operations of the '<em>Digital Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_OPERATION_COUNT = 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorDigitalOut4Impl <em>Digital Actor Digital Out4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorDigitalOut4Impl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalActorDigitalOut4()
   * @generated
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4 = 47;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.NumberActor <em>Number Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.NumberActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getNumberActor()
   * @generated
   */
  int NUMBER_ACTOR = 21;

  /**
   * The number of structural features of the '<em>Number Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_ACTOR_FEATURE_COUNT = 0;

  /**
   * The operation id for the '<em>Set Number</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_ACTOR___SET_NUMBER__BIGDECIMAL = 0;

  /**
   * The number of operations of the '<em>Number Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_ACTOR_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.ColorActor <em>Color Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.ColorActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getColorActor()
   * @generated
   */
  int COLOR_ACTOR = 22;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_ACTOR__COLOR = 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLEDStripImpl <em>MBricklet LED Strip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLEDStripImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletLEDStrip()
   * @generated
   */
  int MBRICKLET_LED_STRIP = 49;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSegmentDisplay4x7Impl <em>MBricklet Segment Display4x7</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSegmentDisplay4x7Impl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletSegmentDisplay4x7()
   * @generated
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7 = 48;

  /**
   * The number of structural features of the '<em>Color Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_ACTOR_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Color Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_ACTOR_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.ProgrammableColorActor <em>Programmable Color Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.ProgrammableColorActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getProgrammableColorActor()
   * @generated
   */
  int PROGRAMMABLE_COLOR_ACTOR = 23;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMMABLE_COLOR_ACTOR__COLOR = COLOR_ACTOR__COLOR;

  /**
   * The number of structural features of the '<em>Programmable Color Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT = COLOR_ACTOR_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Set Selected Color</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMMABLE_COLOR_ACTOR___SET_SELECTED_COLOR__HSBTYPE_DEVICEOPTIONS = COLOR_ACTOR_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Programmable Color Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMMABLE_COLOR_ACTOR_OPERATION_COUNT = COLOR_ACTOR_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.SimpleColorActor <em>Simple Color Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.SimpleColorActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getSimpleColorActor()
   * @generated
   */
  int SIMPLE_COLOR_ACTOR = 24;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_COLOR_ACTOR__COLOR = COLOR_ACTOR__COLOR;

  /**
   * The number of structural features of the '<em>Simple Color Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_COLOR_ACTOR_FEATURE_COUNT = COLOR_ACTOR_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Set Selected Color</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_COLOR_ACTOR___SET_SELECTED_COLOR__HSBTYPE = COLOR_ACTOR_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Simple Color Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_COLOR_ACTOR_OPERATION_COUNT = COLOR_ACTOR_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MoveActor <em>Move Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MoveActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMoveActor()
   * @generated
   */
  int MOVE_ACTOR = 25;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_ACTOR__DIRECTION = 0;

  /**
   * The number of structural features of the '<em>Move Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_ACTOR_FEATURE_COUNT = 1;

  /**
   * The operation id for the '<em>Move</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_ACTOR___MOVE__UPDOWNTYPE_DEVICEOPTIONS = 0;

  /**
   * The operation id for the '<em>Stop</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_ACTOR___STOP = 1;

  /**
   * The operation id for the '<em>Moveon</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_ACTOR___MOVEON__DEVICEOPTIONS = 2;

  /**
   * The number of operations of the '<em>Move Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_ACTOR_OPERATION_COUNT = 3;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.DimmableActor <em>Dimmable Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.DimmableActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDimmableActor()
   * @generated
   */
  int DIMMABLE_ACTOR = 26;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMMABLE_ACTOR__TF_CONFIG = MTF_CONFIG_CONSUMER__TF_CONFIG;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMMABLE_ACTOR__MIN_VALUE = MTF_CONFIG_CONSUMER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMMABLE_ACTOR__MAX_VALUE = MTF_CONFIG_CONSUMER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dimmable Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMMABLE_ACTOR_FEATURE_COUNT = MTF_CONFIG_CONSUMER_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Dimm</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMMABLE_ACTOR___DIMM__INCREASEDECREASETYPE_DEVICEOPTIONS = MTF_CONFIG_CONSUMER_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Dimmable Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMMABLE_ACTOR_OPERATION_COUNT = MTF_CONFIG_CONSUMER_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.SetPointActor <em>Set Point Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.SetPointActor
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getSetPointActor()
   * @generated
   */
  int SET_POINT_ACTOR = 27;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINT_ACTOR__TF_CONFIG = DIMMABLE_ACTOR__TF_CONFIG;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINT_ACTOR__MIN_VALUE = DIMMABLE_ACTOR__MIN_VALUE;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINT_ACTOR__MAX_VALUE = DIMMABLE_ACTOR__MAX_VALUE;

  /**
   * The feature id for the '<em><b>Percent Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINT_ACTOR__PERCENT_VALUE = DIMMABLE_ACTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Point Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINT_ACTOR_FEATURE_COUNT = DIMMABLE_ACTOR_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Dimm</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINT_ACTOR___DIMM__INCREASEDECREASETYPE_DEVICEOPTIONS = DIMMABLE_ACTOR___DIMM__INCREASEDECREASETYPE_DEVICEOPTIONS;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINT_ACTOR___SET_VALUE__BIGDECIMAL_DEVICEOPTIONS = DIMMABLE_ACTOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINT_ACTOR___SET_VALUE__PERCENTTYPE_DEVICEOPTIONS = DIMMABLE_ACTOR_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>Set Point Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINT_ACTOR_OPERATION_COUNT = DIMMABLE_ACTOR_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDualButtonImpl <em>MBricklet Dual Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDualButtonImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletDualButton()
   * @generated
   */
  int MBRICKLET_DUAL_BUTTON = 28;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MBricklet Dual Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MBricklet Dual Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DUAL_BUTTON_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonDevice <em>Dual Button Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonDevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonDevice()
   * @generated
   */
  int DUAL_BUTTON_DEVICE = 29;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE__LOGGER = MSUB_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE__UID = MSUB_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE__POLL = MSUB_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE__ENABLED_A = MSUB_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE__SUB_ID = MSUB_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE__MBRICK = MSUB_DEVICE__MBRICK;

  /**
   * The number of structural features of the '<em>Dual Button Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE_FEATURE_COUNT = MSUB_DEVICE_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE___INIT = MSUB_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE___ENABLE = MSUB_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE___DISABLE = MSUB_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>Dual Button Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_DEVICE_OPERATION_COUNT = MSUB_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DualButtonButtonImpl <em>Dual Button Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.DualButtonButtonImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonButton()
   * @generated
   */
  int DUAL_BUTTON_BUTTON = 30;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON__LOGGER = DUAL_BUTTON_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON__UID = DUAL_BUTTON_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON__POLL = DUAL_BUTTON_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON__ENABLED_A = DUAL_BUTTON_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON__SUB_ID = DUAL_BUTTON_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON__MBRICK = DUAL_BUTTON_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON__SENSOR_VALUE = DUAL_BUTTON_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON__TF_CONFIG = DUAL_BUTTON_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON__DEVICE_TYPE = DUAL_BUTTON_DEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON__POSITION = DUAL_BUTTON_DEVICE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Dual Button Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON_FEATURE_COUNT = DUAL_BUTTON_DEVICE_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON___INIT = DUAL_BUTTON_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON___ENABLE = DUAL_BUTTON_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON___DISABLE = DUAL_BUTTON_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON___FETCH_SENSOR_VALUE = DUAL_BUTTON_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Dual Button Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_BUTTON_OPERATION_COUNT = DUAL_BUTTON_DEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DualButtonLedImpl <em>Dual Button Led</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.DualButtonLedImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonLed()
   * @generated
   */
  int DUAL_BUTTON_LED = 31;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED__LOGGER = DUAL_BUTTON_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED__UID = DUAL_BUTTON_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED__POLL = DUAL_BUTTON_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED__ENABLED_A = DUAL_BUTTON_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED__SUB_ID = DUAL_BUTTON_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED__MBRICK = DUAL_BUTTON_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Digital State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED__DIGITAL_STATE = DUAL_BUTTON_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED__TF_CONFIG = DUAL_BUTTON_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED__DEVICE_TYPE = DUAL_BUTTON_DEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED__POSITION = DUAL_BUTTON_DEVICE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Dual Button Led</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED_FEATURE_COUNT = DUAL_BUTTON_DEVICE_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED___INIT = DUAL_BUTTON_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED___ENABLE = DUAL_BUTTON_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED___DISABLE = DUAL_BUTTON_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Turn Digital</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED___TURN_DIGITAL__HIGHLOWVALUE = DUAL_BUTTON_DEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Fetch Digital Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED___FETCH_DIGITAL_VALUE = DUAL_BUTTON_DEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>Dual Button Led</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED_OPERATION_COUNT = DUAL_BUTTON_DEVICE_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLinearPotiImpl <em>MBricklet Linear Poti</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLinearPotiImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletLinearPoti()
   * @generated
   */
  int MBRICKLET_LINEAR_POTI = 32;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__CALLBACK_PERIOD = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>MBricklet Linear Poti</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MBricklet Linear Poti</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LINEAR_POTI_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletJoystickImpl <em>MBricklet Joystick</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletJoystickImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletJoystick()
   * @generated
   */
  int MBRICKLET_JOYSTICK = 33;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__CALLBACK_PERIOD = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__TF_CONFIG = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>MBricklet Joystick</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MBricklet Joystick</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_JOYSTICK_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.JoystickDevice <em>Joystick Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.JoystickDevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getJoystickDevice()
   * @generated
   */
  int JOYSTICK_DEVICE = 34;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE__LOGGER = MSUB_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE__UID = MSUB_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE__POLL = MSUB_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE__ENABLED_A = MSUB_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE__SUB_ID = MSUB_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE__MBRICK = MSUB_DEVICE__MBRICK;

  /**
   * The number of structural features of the '<em>Joystick Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE_FEATURE_COUNT = MSUB_DEVICE_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE___INIT = MSUB_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE___ENABLE = MSUB_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE___DISABLE = MSUB_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>Joystick Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_DEVICE_OPERATION_COUNT = MSUB_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.JoystickXPositionImpl <em>Joystick XPosition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.JoystickXPositionImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getJoystickXPosition()
   * @generated
   */
  int JOYSTICK_XPOSITION = 35;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION__LOGGER = JOYSTICK_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION__UID = JOYSTICK_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION__POLL = JOYSTICK_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION__ENABLED_A = JOYSTICK_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION__SUB_ID = JOYSTICK_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION__MBRICK = JOYSTICK_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION__SENSOR_VALUE = JOYSTICK_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION__DEVICE_TYPE = JOYSTICK_DEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Joystick XPosition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION_FEATURE_COUNT = JOYSTICK_DEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION___INIT = JOYSTICK_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION___ENABLE = JOYSTICK_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION___DISABLE = JOYSTICK_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION___FETCH_SENSOR_VALUE = JOYSTICK_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Joystick XPosition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_XPOSITION_OPERATION_COUNT = JOYSTICK_DEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.JoystickYPositionImpl <em>Joystick YPosition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.JoystickYPositionImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getJoystickYPosition()
   * @generated
   */
  int JOYSTICK_YPOSITION = 36;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION__LOGGER = JOYSTICK_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION__UID = JOYSTICK_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION__POLL = JOYSTICK_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION__ENABLED_A = JOYSTICK_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION__SUB_ID = JOYSTICK_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION__MBRICK = JOYSTICK_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION__SENSOR_VALUE = JOYSTICK_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION__DEVICE_TYPE = JOYSTICK_DEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Joystick YPosition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION_FEATURE_COUNT = JOYSTICK_DEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION___INIT = JOYSTICK_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION___ENABLE = JOYSTICK_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION___DISABLE = JOYSTICK_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION___FETCH_SENSOR_VALUE = JOYSTICK_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Joystick YPosition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_YPOSITION_OPERATION_COUNT = JOYSTICK_DEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.JoystickButtonImpl <em>Joystick Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.JoystickButtonImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getJoystickButton()
   * @generated
   */
  int JOYSTICK_BUTTON = 37;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON__LOGGER = JOYSTICK_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON__UID = JOYSTICK_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON__POLL = JOYSTICK_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON__ENABLED_A = JOYSTICK_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON__SUB_ID = JOYSTICK_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON__MBRICK = JOYSTICK_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON__SENSOR_VALUE = JOYSTICK_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON__TF_CONFIG = JOYSTICK_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON__DEVICE_TYPE = JOYSTICK_DEVICE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Joystick Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON_FEATURE_COUNT = JOYSTICK_DEVICE_FEATURE_COUNT + 3;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON___INIT = JOYSTICK_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON___ENABLE = JOYSTICK_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON___DISABLE = JOYSTICK_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON___FETCH_SENSOR_VALUE = JOYSTICK_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Joystick Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOYSTICK_BUTTON_OPERATION_COUNT = JOYSTICK_DEVICE_OPERATION_COUNT + 1;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MBrick Servo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBrick Servo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_SERVO_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__SENSOR_VALUE = MSENSOR__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__SWITCH_STATE = MSENSOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__LOGGER = MSENSOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__UID = MSENSOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__POLL = MSENSOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__ENABLED_A = MSENSOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__SUB_ID = MSENSOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__MBRICK = MSENSOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__DIRECTION = MSENSOR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__TF_CONFIG = MSENSOR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__MIN_VALUE = MSENSOR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__MAX_VALUE = MSENSOR_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Percent Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__PERCENT_VALUE = MSENSOR_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__DEVICE_TYPE = MSENSOR_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Velocity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__VELOCITY = MSENSOR_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Acceleration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__ACCELERATION = MSENSOR_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Max Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__MAX_POSITION = MSENSOR_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Min Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__MIN_POSITION = MSENSOR_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Pulse Width Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__PULSE_WIDTH_MIN = MSENSOR_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Pulse Width Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__PULSE_WIDTH_MAX = MSENSOR_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__PERIOD = MSENSOR_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Output Voltage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__OUTPUT_VOLTAGE = MSENSOR_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Target Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO__TARGET_POSITION = MSENSOR_FEATURE_COUNT + 21;

  /**
   * The number of structural features of the '<em>MServo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO_FEATURE_COUNT = MSENSOR_FEATURE_COUNT + 22;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___FETCH_SENSOR_VALUE = MSENSOR___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___FETCH_SWITCH_STATE = MSENSOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___TURN_SWITCH__ONOFFVALUE_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___ENABLE = MSENSOR_OPERATION_COUNT + 3;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___DISABLE = MSENSOR_OPERATION_COUNT + 4;

  /**
   * The operation id for the '<em>Move</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___MOVE__UPDOWNTYPE_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 5;

  /**
   * The operation id for the '<em>Stop</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___STOP = MSENSOR_OPERATION_COUNT + 6;

  /**
   * The operation id for the '<em>Moveon</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___MOVEON__DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 7;

  /**
   * The operation id for the '<em>Dimm</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___DIMM__INCREASEDECREASETYPE_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 8;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___SET_VALUE__BIGDECIMAL_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 9;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___SET_VALUE__PERCENTTYPE_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 10;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___INIT = MSENSOR_OPERATION_COUNT + 11;

  /**
   * The operation id for the '<em>Set Point</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO___SET_POINT__SHORT_INT_INT = MSENSOR_OPERATION_COUNT + 12;

  /**
   * The number of operations of the '<em>MServo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSERVO_OPERATION_COUNT = MSENSOR_OPERATION_COUNT + 13;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__SENSOR_VALUE = MSENSOR__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__SWITCH_STATE = MSENSOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__LOGGER = MSENSOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__UID = MSENSOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__POLL = MSENSOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__ENABLED_A = MSENSOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__TINKERFORGE_DEVICE = MSENSOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__IP_CONNECTION = MSENSOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__CONNECTED_UID = MSENSOR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__POSITION = MSENSOR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__DEVICE_IDENTIFIER = MSENSOR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__NAME = MSENSOR_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__BRICKD = MSENSOR_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__DIRECTION = MSENSOR_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__TF_CONFIG = MSENSOR_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__MIN_VALUE = MSENSOR_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__MAX_VALUE = MSENSOR_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Percent Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__PERCENT_VALUE = MSENSOR_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__CALLBACK_PERIOD = MSENSOR_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__DEVICE_TYPE = MSENSOR_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__THRESHOLD = MSENSOR_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Max Velocity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__MAX_VELOCITY = MSENSOR_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Min Velocity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__MIN_VELOCITY = MSENSOR_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Velocity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__VELOCITY = MSENSOR_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Targetvelocity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__TARGETVELOCITY = MSENSOR_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Current Velocity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__CURRENT_VELOCITY = MSENSOR_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Acceleration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__ACCELERATION = MSENSOR_FEATURE_COUNT + 25;

  /**
   * The feature id for the '<em><b>Pwm Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__PWM_FREQUENCY = MSENSOR_FEATURE_COUNT + 26;

  /**
   * The feature id for the '<em><b>Drive Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC__DRIVE_MODE = MSENSOR_FEATURE_COUNT + 27;

  /**
   * The number of structural features of the '<em>MBrick DC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC_FEATURE_COUNT = MSENSOR_FEATURE_COUNT + 28;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___FETCH_SENSOR_VALUE = MSENSOR___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___FETCH_SWITCH_STATE = MSENSOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___TURN_SWITCH__ONOFFVALUE_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___ENABLE = MSENSOR_OPERATION_COUNT + 3;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___DISABLE = MSENSOR_OPERATION_COUNT + 4;

  /**
   * The operation id for the '<em>Move</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___MOVE__UPDOWNTYPE_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 5;

  /**
   * The operation id for the '<em>Stop</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___STOP = MSENSOR_OPERATION_COUNT + 6;

  /**
   * The operation id for the '<em>Moveon</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___MOVEON__DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 7;

  /**
   * The operation id for the '<em>Dimm</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___DIMM__INCREASEDECREASETYPE_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 8;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___SET_VALUE__BIGDECIMAL_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 9;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___SET_VALUE__PERCENTTYPE_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 10;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___INIT = MSENSOR_OPERATION_COUNT + 11;

  /**
   * The operation id for the '<em>Set Speed</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC___SET_SPEED__SHORT_INT_STRING = MSENSOR_OPERATION_COUNT + 12;

  /**
   * The number of operations of the '<em>MBrick DC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICK_DC_OPERATION_COUNT = MSENSOR_OPERATION_COUNT + 13;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MDual Relay Bricklet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MDual Relay Bricklet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_BRICKLET_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MIndustrial Quad Relay Bricklet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MIndustrial Quad Relay Bricklet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_BRICKLET_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY__SWITCH_STATE = MIN_SWITCH_ACTOR__SWITCH_STATE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY__LOGGER = MIN_SWITCH_ACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY__UID = MIN_SWITCH_ACTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY__POLL = MIN_SWITCH_ACTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY__ENABLED_A = MIN_SWITCH_ACTOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY__SUB_ID = MIN_SWITCH_ACTOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY__MBRICK = MIN_SWITCH_ACTOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY__DEVICE_TYPE = MIN_SWITCH_ACTOR_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>MIndustrial Quad Relay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_FEATURE_COUNT = MIN_SWITCH_ACTOR_FEATURE_COUNT + 7;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY___FETCH_SWITCH_STATE = MIN_SWITCH_ACTOR___FETCH_SWITCH_STATE;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY___TURN_SWITCH__ONOFFVALUE = MIN_SWITCH_ACTOR___TURN_SWITCH__ONOFFVALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY___INIT = MIN_SWITCH_ACTOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY___ENABLE = MIN_SWITCH_ACTOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY___DISABLE = MIN_SWITCH_ACTOR_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>MIndustrial Quad Relay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_QUAD_RELAY_OPERATION_COUNT = MIN_SWITCH_ACTOR_OPERATION_COUNT + 3;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__MSUBDEVICES = MSUB_DEVICE_HOLDER__MSUBDEVICES;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__LOGGER = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__UID = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__POLL = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__ENABLED_A = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__TINKERFORGE_DEVICE = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__IP_CONNECTION = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__CONNECTED_UID = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__POSITION = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__DEVICE_IDENTIFIER = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__NAME = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__BRICKD = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Debounce Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__DEBOUNCE_PERIOD = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__TF_CONFIG = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4__DEVICE_TYPE = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 13;

  /**
   * The number of structural features of the '<em>MBricklet Industrial Digital In4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4_FEATURE_COUNT = MSUB_DEVICE_HOLDER_FEATURE_COUNT + 14;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4___INIT_SUB_DEVICES = MSUB_DEVICE_HOLDER___INIT_SUB_DEVICES;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4___INIT = MSUB_DEVICE_HOLDER_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4___ENABLE = MSUB_DEVICE_HOLDER_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4___DISABLE = MSUB_DEVICE_HOLDER_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>MBricklet Industrial Digital In4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_IN4_OPERATION_COUNT = MSUB_DEVICE_HOLDER_OPERATION_COUNT + 3;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN__LOGGER = MSUB_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN__UID = MSUB_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN__POLL = MSUB_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN__ENABLED_A = MSUB_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN__SUB_ID = MSUB_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN__MBRICK = MSUB_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN__SENSOR_VALUE = MSUB_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN__DEVICE_TYPE = MSUB_DEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MIndustrial Digital In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN_FEATURE_COUNT = MSUB_DEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN___INIT = MSUB_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN___ENABLE = MSUB_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN___DISABLE = MSUB_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN___FETCH_SENSOR_VALUE = MSUB_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MIndustrial Digital In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINDUSTRIAL_DIGITAL_IN_OPERATION_COUNT = MSUB_DEVICE_OPERATION_COUNT + 1;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MBricklet Industrial Digital Out4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MBricklet Industrial Digital Out4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DIGITAL_OUT4_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The feature id for the '<em><b>Digital State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4__DIGITAL_STATE = DIGITAL_ACTOR__DIGITAL_STATE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4__LOGGER = DIGITAL_ACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4__UID = DIGITAL_ACTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4__POLL = DIGITAL_ACTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4__ENABLED_A = DIGITAL_ACTOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4__SUB_ID = DIGITAL_ACTOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4__MBRICK = DIGITAL_ACTOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4__PIN = DIGITAL_ACTOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4__DEVICE_TYPE = DIGITAL_ACTOR_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Digital Actor Digital Out4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4_FEATURE_COUNT = DIGITAL_ACTOR_FEATURE_COUNT + 8;

  /**
   * The operation id for the '<em>Turn Digital</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4___TURN_DIGITAL__HIGHLOWVALUE = DIGITAL_ACTOR___TURN_DIGITAL__HIGHLOWVALUE;

  /**
   * The operation id for the '<em>Fetch Digital Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4___FETCH_DIGITAL_VALUE = DIGITAL_ACTOR___FETCH_DIGITAL_VALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4___INIT = DIGITAL_ACTOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4___ENABLE = DIGITAL_ACTOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4___DISABLE = DIGITAL_ACTOR_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>Digital Actor Digital Out4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_DIGITAL_OUT4_OPERATION_COUNT = DIGITAL_ACTOR_OPERATION_COUNT + 3;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__LOGGER = NUMBER_ACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__UID = NUMBER_ACTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__POLL = NUMBER_ACTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__ENABLED_A = NUMBER_ACTOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__TINKERFORGE_DEVICE = NUMBER_ACTOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__IP_CONNECTION = NUMBER_ACTOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__CONNECTED_UID = NUMBER_ACTOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__POSITION = NUMBER_ACTOR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__DEVICE_IDENTIFIER = NUMBER_ACTOR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__NAME = NUMBER_ACTOR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__BRICKD = NUMBER_ACTOR_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7__DEVICE_TYPE = NUMBER_ACTOR_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>MBricklet Segment Display4x7</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7_FEATURE_COUNT = NUMBER_ACTOR_FEATURE_COUNT + 12;

  /**
   * The operation id for the '<em>Set Number</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7___SET_NUMBER__BIGDECIMAL = NUMBER_ACTOR___SET_NUMBER__BIGDECIMAL;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7___INIT = NUMBER_ACTOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7___ENABLE = NUMBER_ACTOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7___DISABLE = NUMBER_ACTOR_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>MBricklet Segment Display4x7</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SEGMENT_DISPLAY4X7_OPERATION_COUNT = NUMBER_ACTOR_OPERATION_COUNT + 3;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__COLOR = PROGRAMMABLE_COLOR_ACTOR__COLOR;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__LOGGER = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__UID = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__POLL = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__ENABLED_A = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__TINKERFORGE_DEVICE = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__IP_CONNECTION = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__CONNECTED_UID = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__POSITION = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__DEVICE_IDENTIFIER = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__NAME = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__BRICKD = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__TF_CONFIG = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__MSUBDEVICES = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__DEVICE_TYPE = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Color Mapping</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP__COLOR_MAPPING = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>MBricklet LED Strip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP_FEATURE_COUNT = PROGRAMMABLE_COLOR_ACTOR_FEATURE_COUNT + 15;

  /**
   * The operation id for the '<em>Set Selected Color</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP___SET_SELECTED_COLOR__HSBTYPE_DEVICEOPTIONS = PROGRAMMABLE_COLOR_ACTOR___SET_SELECTED_COLOR__HSBTYPE_DEVICEOPTIONS;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP___INIT = PROGRAMMABLE_COLOR_ACTOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP___ENABLE = PROGRAMMABLE_COLOR_ACTOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP___DISABLE = PROGRAMMABLE_COLOR_ACTOR_OPERATION_COUNT + 2;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP___INIT_SUB_DEVICES = PROGRAMMABLE_COLOR_ACTOR_OPERATION_COUNT + 3;

  /**
   * The number of operations of the '<em>MBricklet LED Strip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LED_STRIP_OPERATION_COUNT = PROGRAMMABLE_COLOR_ACTOR_OPERATION_COUNT + 4;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.LEDGroupImpl <em>LED Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.LEDGroupImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getLEDGroup()
   * @generated
   */
  int LED_GROUP = 50;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP__LOGGER = MSUB_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP__UID = MSUB_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP__POLL = MSUB_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP__ENABLED_A = MSUB_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP__SUB_ID = MSUB_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP__MBRICK = MSUB_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP__COLOR = MSUB_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP__SWITCH_STATE = MSUB_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP__TF_CONFIG = MSUB_DEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP__DEVICE_TYPE = MSUB_DEVICE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>LED Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP_FEATURE_COUNT = MSUB_DEVICE_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP___INIT = MSUB_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP___ENABLE = MSUB_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP___DISABLE = MSUB_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Set Selected Color</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP___SET_SELECTED_COLOR__HSBTYPE = MSUB_DEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP___FETCH_SWITCH_STATE = MSUB_DEVICE_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP___TURN_SWITCH__ONOFFVALUE = MSUB_DEVICE_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>LED Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP_OPERATION_COUNT = MSUB_DEVICE_OPERATION_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorIO16Impl <em>Digital Actor IO16</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorIO16Impl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalActorIO16()
   * @generated
   */
  int DIGITAL_ACTOR_IO16 = 51;

  /**
   * The feature id for the '<em><b>Digital State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__DIGITAL_STATE = DIGITAL_ACTOR__DIGITAL_STATE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__LOGGER = DIGITAL_ACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__UID = DIGITAL_ACTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__POLL = DIGITAL_ACTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__ENABLED_A = DIGITAL_ACTOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__SUB_ID = DIGITAL_ACTOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__MBRICK = DIGITAL_ACTOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Generic Device Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__GENERIC_DEVICE_ID = DIGITAL_ACTOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__TF_CONFIG = DIGITAL_ACTOR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__DEVICE_TYPE = DIGITAL_ACTOR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__PORT = DIGITAL_ACTOR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__PIN = DIGITAL_ACTOR_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Default State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__DEFAULT_STATE = DIGITAL_ACTOR_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Keep On Reconnect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16__KEEP_ON_RECONNECT = DIGITAL_ACTOR_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Digital Actor IO16</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16_FEATURE_COUNT = DIGITAL_ACTOR_FEATURE_COUNT + 13;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16___INIT = DIGITAL_ACTOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16___ENABLE = DIGITAL_ACTOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16___DISABLE = DIGITAL_ACTOR_OPERATION_COUNT + 2;

  /**
   * The operation id for the '<em>Turn Digital</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16___TURN_DIGITAL__HIGHLOWVALUE = DIGITAL_ACTOR_OPERATION_COUNT + 3;

  /**
   * The operation id for the '<em>Fetch Digital Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16___FETCH_DIGITAL_VALUE = DIGITAL_ACTOR_OPERATION_COUNT + 4;

  /**
   * The number of operations of the '<em>Digital Actor IO16</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO16_OPERATION_COUNT = DIGITAL_ACTOR_OPERATION_COUNT + 5;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Debounce Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__DEBOUNCE_PERIOD = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__TF_CONFIG = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>MBricklet IO16</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MBricklet IO16</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO16_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__LOGGER = IO_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__UID = IO_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__POLL = IO_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__ENABLED_A = IO_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__SUB_ID = IO_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__MBRICK = IO_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Generic Device Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__GENERIC_DEVICE_ID = IO_DEVICE__GENERIC_DEVICE_ID;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__SENSOR_VALUE = IO_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__TF_CONFIG = IO_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__DEVICE_TYPE = IO_DEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pull Up Resistor Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__PULL_UP_RESISTOR_ENABLED = IO_DEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__PORT = IO_DEVICE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR__PIN = IO_DEVICE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Digital Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_FEATURE_COUNT = IO_DEVICE_FEATURE_COUNT + 6;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR___INIT = IO_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR___ENABLE = IO_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR___DISABLE = IO_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR___FETCH_SENSOR_VALUE = IO_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Digital Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_OPERATION_COUNT = IO_DEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIO4Impl <em>MBricklet IO4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIO4Impl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletIO4()
   * @generated
   */
  int MBRICKLET_IO4 = 54;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Debounce Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__DEBOUNCE_PERIOD = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__TF_CONFIG = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>MBricklet IO4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MBricklet IO4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_IO4_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.IO4Device <em>IO4 Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.IO4Device
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIO4Device()
   * @generated
   */
  int IO4_DEVICE = 55;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE__LOGGER = MSUB_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE__UID = MSUB_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE__POLL = MSUB_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE__ENABLED_A = MSUB_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE__SUB_ID = MSUB_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE__MBRICK = MSUB_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Generic Device Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE__GENERIC_DEVICE_ID = MSUB_DEVICE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>IO4 Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE_FEATURE_COUNT = MSUB_DEVICE_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE___INIT = MSUB_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE___ENABLE = MSUB_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE___DISABLE = MSUB_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>IO4 Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IO4_DEVICE_OPERATION_COUNT = MSUB_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DigitalSensorIO4Impl <em>Digital Sensor IO4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.DigitalSensorIO4Impl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalSensorIO4()
   * @generated
   */
  int DIGITAL_SENSOR_IO4 = 56;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__LOGGER = IO4_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__UID = IO4_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__POLL = IO4_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__ENABLED_A = IO4_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__SUB_ID = IO4_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__MBRICK = IO4_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Generic Device Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__GENERIC_DEVICE_ID = IO4_DEVICE__GENERIC_DEVICE_ID;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__SENSOR_VALUE = IO4_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__TF_CONFIG = IO4_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__DEVICE_TYPE = IO4_DEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pull Up Resistor Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__PULL_UP_RESISTOR_ENABLED = IO4_DEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4__PIN = IO4_DEVICE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Digital Sensor IO4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4_FEATURE_COUNT = IO4_DEVICE_FEATURE_COUNT + 5;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4___INIT = IO4_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4___ENABLE = IO4_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4___DISABLE = IO4_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4___FETCH_SENSOR_VALUE = IO4_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Digital Sensor IO4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_SENSOR_IO4_OPERATION_COUNT = IO4_DEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorIO4Impl <em>Digital Actor IO4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorIO4Impl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalActorIO4()
   * @generated
   */
  int DIGITAL_ACTOR_IO4 = 57;

  /**
   * The feature id for the '<em><b>Digital State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__DIGITAL_STATE = DIGITAL_ACTOR__DIGITAL_STATE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__LOGGER = DIGITAL_ACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__UID = DIGITAL_ACTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__POLL = DIGITAL_ACTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__ENABLED_A = DIGITAL_ACTOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__SUB_ID = DIGITAL_ACTOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__MBRICK = DIGITAL_ACTOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Generic Device Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__GENERIC_DEVICE_ID = DIGITAL_ACTOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__TF_CONFIG = DIGITAL_ACTOR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__DEVICE_TYPE = DIGITAL_ACTOR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__PIN = DIGITAL_ACTOR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Default State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__DEFAULT_STATE = DIGITAL_ACTOR_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Keep On Reconnect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4__KEEP_ON_RECONNECT = DIGITAL_ACTOR_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Digital Actor IO4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4_FEATURE_COUNT = DIGITAL_ACTOR_FEATURE_COUNT + 12;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4___INIT = DIGITAL_ACTOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4___ENABLE = DIGITAL_ACTOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4___DISABLE = DIGITAL_ACTOR_OPERATION_COUNT + 2;

  /**
   * The operation id for the '<em>Turn Digital</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4___TURN_DIGITAL__HIGHLOWVALUE = DIGITAL_ACTOR_OPERATION_COUNT + 3;

  /**
   * The operation id for the '<em>Fetch Digital Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4___FETCH_DIGITAL_VALUE = DIGITAL_ACTOR_OPERATION_COUNT + 4;

  /**
   * The number of operations of the '<em>Digital Actor IO4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGITAL_ACTOR_IO4_OPERATION_COUNT = DIGITAL_ACTOR_OPERATION_COUNT + 5;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMultiTouchImpl <em>MBricklet Multi Touch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMultiTouchImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletMultiTouch()
   * @generated
   */
  int MBRICKLET_MULTI_TOUCH = 58;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Recalibrate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__RECALIBRATE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sensitivity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH__SENSITIVITY = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>MBricklet Multi Touch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MBricklet Multi Touch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MULTI_TOUCH_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MultiTouchDeviceImpl <em>Multi Touch Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MultiTouchDeviceImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMultiTouchDevice()
   * @generated
   */
  int MULTI_TOUCH_DEVICE = 59;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE__LOGGER = MSUB_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE__UID = MSUB_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE__POLL = MSUB_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE__ENABLED_A = MSUB_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE__SUB_ID = MSUB_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE__MBRICK = MSUB_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE__SENSOR_VALUE = MSUB_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE__TF_CONFIG = MSUB_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE__PIN = MSUB_DEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Disable Electrode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE__DISABLE_ELECTRODE = MSUB_DEVICE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Multi Touch Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE_FEATURE_COUNT = MSUB_DEVICE_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE___INIT = MSUB_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE___ENABLE = MSUB_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE___DISABLE = MSUB_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE___FETCH_SENSOR_VALUE = MSUB_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Multi Touch Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE_OPERATION_COUNT = MSUB_DEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.ElectrodeImpl <em>Electrode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ElectrodeImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getElectrode()
   * @generated
   */
  int ELECTRODE = 60;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__LOGGER = MULTI_TOUCH_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__UID = MULTI_TOUCH_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__POLL = MULTI_TOUCH_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__ENABLED_A = MULTI_TOUCH_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__SUB_ID = MULTI_TOUCH_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__MBRICK = MULTI_TOUCH_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__SENSOR_VALUE = MULTI_TOUCH_DEVICE__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__TF_CONFIG = MULTI_TOUCH_DEVICE__TF_CONFIG;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__PIN = MULTI_TOUCH_DEVICE__PIN;

  /**
   * The feature id for the '<em><b>Disable Electrode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__DISABLE_ELECTRODE = MULTI_TOUCH_DEVICE__DISABLE_ELECTRODE;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE__DEVICE_TYPE = MULTI_TOUCH_DEVICE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Electrode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE_FEATURE_COUNT = MULTI_TOUCH_DEVICE_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE___INIT = MULTI_TOUCH_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE___ENABLE = MULTI_TOUCH_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE___DISABLE = MULTI_TOUCH_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE___FETCH_SENSOR_VALUE = MULTI_TOUCH_DEVICE___FETCH_SENSOR_VALUE;

  /**
   * The number of operations of the '<em>Electrode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELECTRODE_OPERATION_COUNT = MULTI_TOUCH_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.ProximityImpl <em>Proximity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ProximityImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getProximity()
   * @generated
   */
  int PROXIMITY = 61;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__LOGGER = MULTI_TOUCH_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__UID = MULTI_TOUCH_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__POLL = MULTI_TOUCH_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__ENABLED_A = MULTI_TOUCH_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__SUB_ID = MULTI_TOUCH_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__MBRICK = MULTI_TOUCH_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__SENSOR_VALUE = MULTI_TOUCH_DEVICE__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__TF_CONFIG = MULTI_TOUCH_DEVICE__TF_CONFIG;

  /**
   * The feature id for the '<em><b>Pin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__PIN = MULTI_TOUCH_DEVICE__PIN;

  /**
   * The feature id for the '<em><b>Disable Electrode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__DISABLE_ELECTRODE = MULTI_TOUCH_DEVICE__DISABLE_ELECTRODE;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY__DEVICE_TYPE = MULTI_TOUCH_DEVICE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Proximity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY_FEATURE_COUNT = MULTI_TOUCH_DEVICE_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY___INIT = MULTI_TOUCH_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY___ENABLE = MULTI_TOUCH_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY___DISABLE = MULTI_TOUCH_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY___FETCH_SENSOR_VALUE = MULTI_TOUCH_DEVICE___FETCH_SENSOR_VALUE;

  /**
   * The number of operations of the '<em>Proximity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROXIMITY_OPERATION_COUNT = MULTI_TOUCH_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMotionDetectorImpl <em>MBricklet Motion Detector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMotionDetectorImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletMotionDetector()
   * @generated
   */
  int MBRICKLET_MOTION_DETECTOR = 62;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MBricklet Motion Detector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet Motion Detector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOTION_DETECTOR_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletHallEffectImpl <em>MBricklet Hall Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletHallEffectImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletHallEffect()
   * @generated
   */
  int MBRICKLET_HALL_EFFECT = 63;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__CALLBACK_PERIOD = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__TF_CONFIG = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>MBricklet Hall Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet Hall Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HALL_EFFECT_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY__SWITCH_STATE = MIN_SWITCH_ACTOR__SWITCH_STATE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY__LOGGER = MIN_SWITCH_ACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY__UID = MIN_SWITCH_ACTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY__POLL = MIN_SWITCH_ACTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY__ENABLED_A = MIN_SWITCH_ACTOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY__SUB_ID = MIN_SWITCH_ACTOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY__MBRICK = MIN_SWITCH_ACTOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY__DEVICE_TYPE = MIN_SWITCH_ACTOR_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>MDual Relay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_FEATURE_COUNT = MIN_SWITCH_ACTOR_FEATURE_COUNT + 7;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY___FETCH_SWITCH_STATE = MIN_SWITCH_ACTOR___FETCH_SWITCH_STATE;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY___TURN_SWITCH__ONOFFVALUE = MIN_SWITCH_ACTOR___TURN_SWITCH__ONOFFVALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY___INIT = MIN_SWITCH_ACTOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY___ENABLE = MIN_SWITCH_ACTOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY___DISABLE = MIN_SWITCH_ACTOR_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>MDual Relay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MDUAL_RELAY_OPERATION_COUNT = MIN_SWITCH_ACTOR_OPERATION_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletRemoteSwitchImpl <em>MBricklet Remote Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletRemoteSwitchImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletRemoteSwitch()
   * @generated
   */
  int MBRICKLET_REMOTE_SWITCH = 65;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type ADevices</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__TYPE_ADEVICES = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type BDevices</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__TYPE_BDEVICES = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Type CDevices</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH__TYPE_CDEVICES = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>MBricklet Remote Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 6;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Add Sub Device</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH___ADD_SUB_DEVICE__STRING_STRING = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet Remote Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_REMOTE_SWITCH_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitch <em>Remote Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitch
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitch()
   * @generated
   */
  int REMOTE_SWITCH = 66;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH__SWITCH_STATE = MIN_SWITCH_ACTOR__SWITCH_STATE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH__LOGGER = MIN_SWITCH_ACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH__UID = MIN_SWITCH_ACTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH__POLL = MIN_SWITCH_ACTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH__ENABLED_A = MIN_SWITCH_ACTOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH__SUB_ID = MIN_SWITCH_ACTOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH__MBRICK = MIN_SWITCH_ACTOR_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Remote Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_FEATURE_COUNT = MIN_SWITCH_ACTOR_FEATURE_COUNT + 6;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH___FETCH_SWITCH_STATE = MIN_SWITCH_ACTOR___FETCH_SWITCH_STATE;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH___TURN_SWITCH__ONOFFVALUE = MIN_SWITCH_ACTOR___TURN_SWITCH__ONOFFVALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH___INIT = MIN_SWITCH_ACTOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH___ENABLE = MIN_SWITCH_ACTOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH___DISABLE = MIN_SWITCH_ACTOR_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>Remote Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_OPERATION_COUNT = MIN_SWITCH_ACTOR_OPERATION_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchAImpl <em>Remote Switch A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchAImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchA()
   * @generated
   */
  int REMOTE_SWITCH_A = 67;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__SWITCH_STATE = REMOTE_SWITCH__SWITCH_STATE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__LOGGER = REMOTE_SWITCH__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__UID = REMOTE_SWITCH__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__POLL = REMOTE_SWITCH__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__ENABLED_A = REMOTE_SWITCH__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__SUB_ID = REMOTE_SWITCH__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__MBRICK = REMOTE_SWITCH__MBRICK;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__TF_CONFIG = REMOTE_SWITCH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__DEVICE_TYPE = REMOTE_SWITCH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>House Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__HOUSE_CODE = REMOTE_SWITCH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Receiver Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__RECEIVER_CODE = REMOTE_SWITCH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Repeats</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A__REPEATS = REMOTE_SWITCH_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Remote Switch A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A_FEATURE_COUNT = REMOTE_SWITCH_FEATURE_COUNT + 5;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A___FETCH_SWITCH_STATE = REMOTE_SWITCH___FETCH_SWITCH_STATE;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A___TURN_SWITCH__ONOFFVALUE = REMOTE_SWITCH___TURN_SWITCH__ONOFFVALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A___INIT = REMOTE_SWITCH___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A___ENABLE = REMOTE_SWITCH___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A___DISABLE = REMOTE_SWITCH___DISABLE;

  /**
   * The number of operations of the '<em>Remote Switch A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_A_OPERATION_COUNT = REMOTE_SWITCH_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchBImpl <em>Remote Switch B</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchBImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchB()
   * @generated
   */
  int REMOTE_SWITCH_B = 68;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__SENSOR_VALUE = MSENSOR__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__SWITCH_STATE = MSENSOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__LOGGER = MSENSOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__UID = MSENSOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__POLL = MSENSOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__ENABLED_A = MSENSOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__SUB_ID = MSENSOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__MBRICK = MSENSOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__TF_CONFIG = MSENSOR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__MIN_VALUE = MSENSOR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__MAX_VALUE = MSENSOR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__DEVICE_TYPE = MSENSOR_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__ADDRESS = MSENSOR_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__UNIT = MSENSOR_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Repeats</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__REPEATS = MSENSOR_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Target Dimmvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B__TARGET_DIMMVALUE = MSENSOR_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>Remote Switch B</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B_FEATURE_COUNT = MSENSOR_FEATURE_COUNT + 15;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B___FETCH_SENSOR_VALUE = MSENSOR___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B___FETCH_SWITCH_STATE = MSENSOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B___TURN_SWITCH__ONOFFVALUE = MSENSOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B___INIT = MSENSOR_OPERATION_COUNT + 2;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B___ENABLE = MSENSOR_OPERATION_COUNT + 3;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B___DISABLE = MSENSOR_OPERATION_COUNT + 4;

  /**
   * The operation id for the '<em>Dimm</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B___DIMM__INCREASEDECREASETYPE_DEVICEOPTIONS = MSENSOR_OPERATION_COUNT + 5;

  /**
   * The number of operations of the '<em>Remote Switch B</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_B_OPERATION_COUNT = MSENSOR_OPERATION_COUNT + 6;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchCImpl <em>Remote Switch C</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchCImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchC()
   * @generated
   */
  int REMOTE_SWITCH_C = 69;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__SWITCH_STATE = REMOTE_SWITCH__SWITCH_STATE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__LOGGER = REMOTE_SWITCH__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__UID = REMOTE_SWITCH__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__POLL = REMOTE_SWITCH__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__ENABLED_A = REMOTE_SWITCH__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__SUB_ID = REMOTE_SWITCH__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__MBRICK = REMOTE_SWITCH__MBRICK;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__TF_CONFIG = REMOTE_SWITCH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__DEVICE_TYPE = REMOTE_SWITCH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>System Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__SYSTEM_CODE = REMOTE_SWITCH_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__DEVICE_CODE = REMOTE_SWITCH_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Repeats</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C__REPEATS = REMOTE_SWITCH_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Remote Switch C</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C_FEATURE_COUNT = REMOTE_SWITCH_FEATURE_COUNT + 5;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C___FETCH_SWITCH_STATE = REMOTE_SWITCH___FETCH_SWITCH_STATE;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C___TURN_SWITCH__ONOFFVALUE = REMOTE_SWITCH___TURN_SWITCH__ONOFFVALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C___INIT = REMOTE_SWITCH___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C___ENABLE = REMOTE_SWITCH___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C___DISABLE = REMOTE_SWITCH___DISABLE;

  /**
   * The number of operations of the '<em>Remote Switch C</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_C_OPERATION_COUNT = REMOTE_SWITCH_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__SENSOR_VALUE = MSENSOR__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__LOGGER = MSENSOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__UID = MSENSOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__POLL = MSENSOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__ENABLED_A = MSENSOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__TINKERFORGE_DEVICE = MSENSOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__IP_CONNECTION = MSENSOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__CONNECTED_UID = MSENSOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__POSITION = MSENSOR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__DEVICE_IDENTIFIER = MSENSOR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__NAME = MSENSOR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__BRICKD = MSENSOR_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__TF_CONFIG = MSENSOR_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__CALLBACK_PERIOD = MSENSOR_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__DEVICE_TYPE = MSENSOR_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY__THRESHOLD = MSENSOR_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>MBricklet Humidity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY_FEATURE_COUNT = MSENSOR_FEATURE_COUNT + 15;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY___FETCH_SENSOR_VALUE = MSENSOR___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY___ENABLE = MSENSOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY___DISABLE = MSENSOR_OPERATION_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY___INIT = MSENSOR_OPERATION_COUNT + 3;

  /**
   * The number of operations of the '<em>MBricklet Humidity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_HUMIDITY_OPERATION_COUNT = MSENSOR_OPERATION_COUNT + 4;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__CALLBACK_PERIOD = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR__THRESHOLD = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>MBricklet Distance IR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet Distance IR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_IR_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSolidStateRelayImpl <em>MBricklet Solid State Relay</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSolidStateRelayImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletSolidStateRelay()
   * @generated
   */
  int MBRICKLET_SOLID_STATE_RELAY = 72;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__SWITCH_STATE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MBricklet Solid State Relay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY___FETCH_SWITCH_STATE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY___TURN_SWITCH__ONOFFVALUE = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY___INIT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>MBricklet Solid State Relay</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOLID_STATE_RELAY_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDual020mAImpl <em>MBricklet Industrial Dual020m A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDual020mAImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletIndustrialDual020mA()
   * @generated
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A = 73;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>MBricklet Industrial Dual020m A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet Industrial Dual020m A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_INDUSTRIAL_DUAL020M_A_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.Dual020mADeviceImpl <em>Dual020m ADevice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.Dual020mADeviceImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDual020mADevice()
   * @generated
   */
  int DUAL020M_ADEVICE = 74;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__LOGGER = MSUB_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__UID = MSUB_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__POLL = MSUB_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__ENABLED_A = MSUB_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__SUB_ID = MSUB_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__MBRICK = MSUB_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__SENSOR_VALUE = MSUB_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__CALLBACK_PERIOD = MSUB_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__TF_CONFIG = MSUB_DEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__DEVICE_TYPE = MSUB_DEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__THRESHOLD = MSUB_DEVICE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Sensor Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE__SENSOR_NUM = MSUB_DEVICE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Dual020m ADevice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE_FEATURE_COUNT = MSUB_DEVICE_FEATURE_COUNT + 6;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE___INIT = MSUB_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE___ENABLE = MSUB_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE___DISABLE = MSUB_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE___FETCH_SENSOR_VALUE = MSUB_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Dual020m ADevice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL020M_ADEVICE_OPERATION_COUNT = MSUB_DEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletPTCImpl <em>MBricklet PTC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletPTCImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletPTC()
   * @generated
   */
  int MBRICKLET_PTC = 75;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__TF_CONFIG = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>MBricklet PTC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet PTC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_PTC_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.PTCDevice <em>PTC Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.PTCDevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPTCDevice()
   * @generated
   */
  int PTC_DEVICE = 76;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE__LOGGER = MSUB_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE__UID = MSUB_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE__POLL = MSUB_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE__ENABLED_A = MSUB_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE__SUB_ID = MSUB_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE__MBRICK = MSUB_DEVICE__MBRICK;

  /**
   * The number of structural features of the '<em>PTC Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE_FEATURE_COUNT = MSUB_DEVICE_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE___INIT = MSUB_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE___ENABLE = MSUB_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE___DISABLE = MSUB_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>PTC Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_DEVICE_OPERATION_COUNT = MSUB_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.PTCTemperatureImpl <em>PTC Temperature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.PTCTemperatureImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPTCTemperature()
   * @generated
   */
  int PTC_TEMPERATURE = 77;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__LOGGER = PTC_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__UID = PTC_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__POLL = PTC_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__ENABLED_A = PTC_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__SUB_ID = PTC_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__MBRICK = PTC_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__SENSOR_VALUE = PTC_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__TF_CONFIG = PTC_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__CALLBACK_PERIOD = PTC_DEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__DEVICE_TYPE = PTC_DEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE__THRESHOLD = PTC_DEVICE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>PTC Temperature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE_FEATURE_COUNT = PTC_DEVICE_FEATURE_COUNT + 5;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE___INIT = PTC_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE___ENABLE = PTC_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE___DISABLE = PTC_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE___FETCH_SENSOR_VALUE = PTC_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>PTC Temperature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_TEMPERATURE_OPERATION_COUNT = PTC_DEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.PTCResistanceImpl <em>PTC Resistance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.PTCResistanceImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPTCResistance()
   * @generated
   */
  int PTC_RESISTANCE = 78;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__LOGGER = PTC_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__UID = PTC_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__POLL = PTC_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__ENABLED_A = PTC_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__SUB_ID = PTC_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__MBRICK = PTC_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__SENSOR_VALUE = PTC_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__TF_CONFIG = PTC_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__CALLBACK_PERIOD = PTC_DEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__DEVICE_TYPE = PTC_DEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE__THRESHOLD = PTC_DEVICE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>PTC Resistance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE_FEATURE_COUNT = PTC_DEVICE_FEATURE_COUNT + 5;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE___INIT = PTC_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE___ENABLE = PTC_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE___DISABLE = PTC_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE___FETCH_SENSOR_VALUE = PTC_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>PTC Resistance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_RESISTANCE_OPERATION_COUNT = PTC_DEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.PTCConnectedImpl <em>PTC Connected</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.PTCConnectedImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPTCConnected()
   * @generated
   */
  int PTC_CONNECTED = 79;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED__LOGGER = PTC_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED__UID = PTC_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED__POLL = PTC_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED__ENABLED_A = PTC_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED__SUB_ID = PTC_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED__MBRICK = PTC_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED__SENSOR_VALUE = PTC_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED__DEVICE_TYPE = PTC_DEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>PTC Connected</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED_FEATURE_COUNT = PTC_DEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED___INIT = PTC_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED___ENABLE = PTC_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED___DISABLE = PTC_DEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED___FETCH_SENSOR_VALUE = PTC_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>PTC Connected</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTC_CONNECTED_OPERATION_COUNT = PTC_DEVICE_OPERATION_COUNT + 1;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__CALLBACK_PERIOD = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE__THRESHOLD = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>MBricklet Temperature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet Temperature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTemperatureIRImpl <em>MBricklet Temperature IR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTemperatureIRImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletTemperatureIR()
   * @generated
   */
  int MBRICKLET_TEMPERATURE_IR = 81;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MBricklet Temperature IR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MBricklet Temperature IR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TEMPERATURE_IR_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice <em>MTemperature IR Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTemperatureIRDevice()
   * @generated
   */
  int MTEMPERATURE_IR_DEVICE = 82;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE__SENSOR_VALUE = MSENSOR__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE__LOGGER = MSENSOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE__UID = MSENSOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE__POLL = MSENSOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE__ENABLED_A = MSENSOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE__SUB_ID = MSENSOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE__MBRICK = MSENSOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE__CALLBACK_PERIOD = MSENSOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE__THRESHOLD = MSENSOR_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>MTemperature IR Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE_FEATURE_COUNT = MSENSOR_FEATURE_COUNT + 8;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE___FETCH_SENSOR_VALUE = MSENSOR___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE___INIT = MSENSOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE___ENABLE = MSENSOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE___DISABLE = MSENSOR_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>MTemperature IR Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTEMPERATURE_IR_DEVICE_OPERATION_COUNT = MSENSOR_OPERATION_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.ObjectTemperatureImpl <em>Object Temperature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ObjectTemperatureImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getObjectTemperature()
   * @generated
   */
  int OBJECT_TEMPERATURE = 83;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__SENSOR_VALUE = MTEMPERATURE_IR_DEVICE__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__LOGGER = MTEMPERATURE_IR_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__UID = MTEMPERATURE_IR_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__POLL = MTEMPERATURE_IR_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__ENABLED_A = MTEMPERATURE_IR_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__SUB_ID = MTEMPERATURE_IR_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__MBRICK = MTEMPERATURE_IR_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__CALLBACK_PERIOD = MTEMPERATURE_IR_DEVICE__CALLBACK_PERIOD;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__THRESHOLD = MTEMPERATURE_IR_DEVICE__THRESHOLD;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__TF_CONFIG = MTEMPERATURE_IR_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__DEVICE_TYPE = MTEMPERATURE_IR_DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Emissivity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE__EMISSIVITY = MTEMPERATURE_IR_DEVICE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Object Temperature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE_FEATURE_COUNT = MTEMPERATURE_IR_DEVICE_FEATURE_COUNT + 3;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE___FETCH_SENSOR_VALUE = MTEMPERATURE_IR_DEVICE___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE___INIT = MTEMPERATURE_IR_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE___ENABLE = MTEMPERATURE_IR_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE___DISABLE = MTEMPERATURE_IR_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>Object Temperature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPERATURE_OPERATION_COUNT = MTEMPERATURE_IR_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.AmbientTemperatureImpl <em>Ambient Temperature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.AmbientTemperatureImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getAmbientTemperature()
   * @generated
   */
  int AMBIENT_TEMPERATURE = 84;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__SENSOR_VALUE = MTEMPERATURE_IR_DEVICE__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__LOGGER = MTEMPERATURE_IR_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__UID = MTEMPERATURE_IR_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__POLL = MTEMPERATURE_IR_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__ENABLED_A = MTEMPERATURE_IR_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__SUB_ID = MTEMPERATURE_IR_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__MBRICK = MTEMPERATURE_IR_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__CALLBACK_PERIOD = MTEMPERATURE_IR_DEVICE__CALLBACK_PERIOD;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__THRESHOLD = MTEMPERATURE_IR_DEVICE__THRESHOLD;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__TF_CONFIG = MTEMPERATURE_IR_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE__DEVICE_TYPE = MTEMPERATURE_IR_DEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ambient Temperature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE_FEATURE_COUNT = MTEMPERATURE_IR_DEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE___FETCH_SENSOR_VALUE = MTEMPERATURE_IR_DEVICE___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE___INIT = MTEMPERATURE_IR_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE___ENABLE = MTEMPERATURE_IR_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE___DISABLE = MTEMPERATURE_IR_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>Ambient Temperature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMBIENT_TEMPERATURE_OPERATION_COUNT = MTEMPERATURE_IR_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTiltImpl <em>MBricklet Tilt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTiltImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletTilt()
   * @generated
   */
  int MBRICKLET_TILT = 85;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MBricklet Tilt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MBricklet Tilt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_TILT_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletVoltageCurrentImpl <em>MBricklet Voltage Current</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletVoltageCurrentImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletVoltageCurrent()
   * @generated
   */
  int MBRICKLET_VOLTAGE_CURRENT = 86;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Averaging</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__AVERAGING = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Voltage Conversion Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__VOLTAGE_CONVERSION_TIME = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Current Conversion Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT__CURRENT_CONVERSION_TIME = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>MBricklet Voltage Current</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 6;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT___INIT = MDEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>MBricklet Voltage Current</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_VOLTAGE_CURRENT_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.VoltageCurrentDevice <em>Voltage Current Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.VoltageCurrentDevice
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getVoltageCurrentDevice()
   * @generated
   */
  int VOLTAGE_CURRENT_DEVICE = 87;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE__SENSOR_VALUE = MSENSOR__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE__LOGGER = MSENSOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE__UID = MSENSOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE__POLL = MSENSOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE__ENABLED_A = MSENSOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE__SUB_ID = MSENSOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE__MBRICK = MSENSOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE__CALLBACK_PERIOD = MSENSOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE__TF_CONFIG = MSENSOR_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Voltage Current Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE_FEATURE_COUNT = MSENSOR_FEATURE_COUNT + 8;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE___FETCH_SENSOR_VALUE = MSENSOR___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE___INIT = MSENSOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE___ENABLE = MSENSOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE___DISABLE = MSENSOR_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>Voltage Current Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLTAGE_CURRENT_DEVICE_OPERATION_COUNT = MSENSOR_OPERATION_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.VCDeviceVoltageImpl <em>VC Device Voltage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.VCDeviceVoltageImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getVCDeviceVoltage()
   * @generated
   */
  int VC_DEVICE_VOLTAGE = 88;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__SENSOR_VALUE = VOLTAGE_CURRENT_DEVICE__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__LOGGER = VOLTAGE_CURRENT_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__UID = VOLTAGE_CURRENT_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__POLL = VOLTAGE_CURRENT_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__ENABLED_A = VOLTAGE_CURRENT_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__SUB_ID = VOLTAGE_CURRENT_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__MBRICK = VOLTAGE_CURRENT_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__CALLBACK_PERIOD = VOLTAGE_CURRENT_DEVICE__CALLBACK_PERIOD;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__TF_CONFIG = VOLTAGE_CURRENT_DEVICE__TF_CONFIG;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__DEVICE_TYPE = VOLTAGE_CURRENT_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE__THRESHOLD = VOLTAGE_CURRENT_DEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>VC Device Voltage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE_FEATURE_COUNT = VOLTAGE_CURRENT_DEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE___FETCH_SENSOR_VALUE = VOLTAGE_CURRENT_DEVICE___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE___INIT = VOLTAGE_CURRENT_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE___ENABLE = VOLTAGE_CURRENT_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE___DISABLE = VOLTAGE_CURRENT_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>VC Device Voltage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_VOLTAGE_OPERATION_COUNT = VOLTAGE_CURRENT_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.VCDeviceCurrentImpl <em>VC Device Current</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.VCDeviceCurrentImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getVCDeviceCurrent()
   * @generated
   */
  int VC_DEVICE_CURRENT = 89;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__SENSOR_VALUE = VOLTAGE_CURRENT_DEVICE__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__LOGGER = VOLTAGE_CURRENT_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__UID = VOLTAGE_CURRENT_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__POLL = VOLTAGE_CURRENT_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__ENABLED_A = VOLTAGE_CURRENT_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__SUB_ID = VOLTAGE_CURRENT_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__MBRICK = VOLTAGE_CURRENT_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__CALLBACK_PERIOD = VOLTAGE_CURRENT_DEVICE__CALLBACK_PERIOD;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__TF_CONFIG = VOLTAGE_CURRENT_DEVICE__TF_CONFIG;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__DEVICE_TYPE = VOLTAGE_CURRENT_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT__THRESHOLD = VOLTAGE_CURRENT_DEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>VC Device Current</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT_FEATURE_COUNT = VOLTAGE_CURRENT_DEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT___FETCH_SENSOR_VALUE = VOLTAGE_CURRENT_DEVICE___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT___INIT = VOLTAGE_CURRENT_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT___ENABLE = VOLTAGE_CURRENT_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT___DISABLE = VOLTAGE_CURRENT_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>VC Device Current</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_CURRENT_OPERATION_COUNT = VOLTAGE_CURRENT_DEVICE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.VCDevicePowerImpl <em>VC Device Power</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.VCDevicePowerImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getVCDevicePower()
   * @generated
   */
  int VC_DEVICE_POWER = 90;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__SENSOR_VALUE = VOLTAGE_CURRENT_DEVICE__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__LOGGER = VOLTAGE_CURRENT_DEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__UID = VOLTAGE_CURRENT_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__POLL = VOLTAGE_CURRENT_DEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__ENABLED_A = VOLTAGE_CURRENT_DEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__SUB_ID = VOLTAGE_CURRENT_DEVICE__SUB_ID;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__MBRICK = VOLTAGE_CURRENT_DEVICE__MBRICK;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__CALLBACK_PERIOD = VOLTAGE_CURRENT_DEVICE__CALLBACK_PERIOD;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__TF_CONFIG = VOLTAGE_CURRENT_DEVICE__TF_CONFIG;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__DEVICE_TYPE = VOLTAGE_CURRENT_DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER__THRESHOLD = VOLTAGE_CURRENT_DEVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>VC Device Power</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER_FEATURE_COUNT = VOLTAGE_CURRENT_DEVICE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER___FETCH_SENSOR_VALUE = VOLTAGE_CURRENT_DEVICE___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER___INIT = VOLTAGE_CURRENT_DEVICE___INIT;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER___ENABLE = VOLTAGE_CURRENT_DEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER___DISABLE = VOLTAGE_CURRENT_DEVICE___DISABLE;

  /**
   * The number of operations of the '<em>VC Device Power</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VC_DEVICE_POWER_OPERATION_COUNT = VOLTAGE_CURRENT_DEVICE_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__CALLBACK_PERIOD = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER__THRESHOLD = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>MBricklet Barometer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 6;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER___INIT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>MBricklet Barometer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_BAROMETER_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE__SENSOR_VALUE = MSENSOR__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE__LOGGER = MSENSOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE__UID = MSENSOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE__POLL = MSENSOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE__ENABLED_A = MSENSOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE__SUB_ID = MSENSOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE__MBRICK = MSENSOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE__DEVICE_TYPE = MSENSOR_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>MBarometer Temperature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE_FEATURE_COUNT = MSENSOR_FEATURE_COUNT + 7;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE___FETCH_SENSOR_VALUE = MSENSOR___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE___ENABLE = MSENSOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE___DISABLE = MSENSOR_OPERATION_COUNT + 2;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE___INIT = MSENSOR_OPERATION_COUNT + 3;

  /**
   * The number of operations of the '<em>MBarometer Temperature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBAROMETER_TEMPERATURE_OPERATION_COUNT = MSENSOR_OPERATION_COUNT + 4;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__CALLBACK_PERIOD = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT__THRESHOLD = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>MBricklet Ambient Light</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet Ambient Light</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_AMBIENT_LIGHT_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSoundIntensityImpl <em>MBricklet Sound Intensity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSoundIntensityImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletSoundIntensity()
   * @generated
   */
  int MBRICKLET_SOUND_INTENSITY = 94;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__CALLBACK_PERIOD = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY__THRESHOLD = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>MBricklet Sound Intensity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet Sound Intensity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_SOUND_INTENSITY_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMoistureImpl <em>MBricklet Moisture</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMoistureImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletMoisture()
   * @generated
   */
  int MBRICKLET_MOISTURE = 95;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__CALLBACK_PERIOD = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__THRESHOLD = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Moving Average</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE__MOVING_AVERAGE = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>MBricklet Moisture</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 6;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet Moisture</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_MOISTURE_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDistanceUSImpl <em>MBricklet Distance US</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDistanceUSImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletDistanceUS()
   * @generated
   */
  int MBRICKLET_DISTANCE_US = 96;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__SENSOR_VALUE = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__TF_CONFIG = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__CALLBACK_PERIOD = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__THRESHOLD = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Moving Average</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US__MOVING_AVERAGE = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>MBricklet Distance US</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 6;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US___FETCH_SENSOR_VALUE = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>MBricklet Distance US</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_DISTANCE_US_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__LOGGER = MDEVICE__LOGGER;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__UID = MDEVICE__UID;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__POLL = MDEVICE__POLL;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__ENABLED_A = MDEVICE__ENABLED_A;

  /**
   * The feature id for the '<em><b>Tinkerforge Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__TINKERFORGE_DEVICE = MDEVICE__TINKERFORGE_DEVICE;

  /**
   * The feature id for the '<em><b>Ip Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__IP_CONNECTION = MDEVICE__IP_CONNECTION;

  /**
   * The feature id for the '<em><b>Connected Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__CONNECTED_UID = MDEVICE__CONNECTED_UID;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__POSITION = MDEVICE__POSITION;

  /**
   * The feature id for the '<em><b>Device Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__DEVICE_IDENTIFIER = MDEVICE__DEVICE_IDENTIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__NAME = MDEVICE__NAME;

  /**
   * The feature id for the '<em><b>Brickd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__BRICKD = MDEVICE__BRICKD;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__TEXT = MDEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Msubdevices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__MSUBDEVICES = MDEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__DEVICE_TYPE = MDEVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Position Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__POSITION_PREFIX = MDEVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Positon Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__POSITON_SUFFIX = MDEVICE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Display Errors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__DISPLAY_ERRORS = MDEVICE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Error Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4__ERROR_PREFIX = MDEVICE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>MBricklet LCD2 0x4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4_FEATURE_COUNT = MDEVICE_FEATURE_COUNT + 7;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4___ENABLE = MDEVICE___ENABLE;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4___DISABLE = MDEVICE___DISABLE;

  /**
   * The operation id for the '<em>Init Sub Devices</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4___INIT_SUB_DEVICES = MDEVICE_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4___INIT = MDEVICE_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Clear</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4___CLEAR = MDEVICE_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>MBricklet LCD2 0x4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBRICKLET_LCD2_0X4_OPERATION_COUNT = MDEVICE_OPERATION_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MLCD20x4BacklightImpl <em>MLCD2 0x4 Backlight</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MLCD20x4BacklightImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMLCD20x4Backlight()
   * @generated
   */
  int MLCD2_0X4_BACKLIGHT = 98;

  /**
   * The feature id for the '<em><b>Switch State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT__SWITCH_STATE = MIN_SWITCH_ACTOR__SWITCH_STATE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT__LOGGER = MIN_SWITCH_ACTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT__UID = MIN_SWITCH_ACTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT__POLL = MIN_SWITCH_ACTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT__ENABLED_A = MIN_SWITCH_ACTOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT__SUB_ID = MIN_SWITCH_ACTOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT__MBRICK = MIN_SWITCH_ACTOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT__DEVICE_TYPE = MIN_SWITCH_ACTOR_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>MLCD2 0x4 Backlight</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT_FEATURE_COUNT = MIN_SWITCH_ACTOR_FEATURE_COUNT + 7;

  /**
   * The operation id for the '<em>Fetch Switch State</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT___FETCH_SWITCH_STATE = MIN_SWITCH_ACTOR___FETCH_SWITCH_STATE;

  /**
   * The operation id for the '<em>Turn Switch</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT___TURN_SWITCH__ONOFFVALUE = MIN_SWITCH_ACTOR___TURN_SWITCH__ONOFFVALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT___INIT = MIN_SWITCH_ACTOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT___ENABLE = MIN_SWITCH_ACTOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT___DISABLE = MIN_SWITCH_ACTOR_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>MLCD2 0x4 Backlight</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BACKLIGHT_OPERATION_COUNT = MIN_SWITCH_ACTOR_OPERATION_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MLCD20x4ButtonImpl <em>MLCD2 0x4 Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MLCD20x4ButtonImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMLCD20x4Button()
   * @generated
   */
  int MLCD2_0X4_BUTTON = 99;

  /**
   * The feature id for the '<em><b>Sensor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON__SENSOR_VALUE = MSENSOR__SENSOR_VALUE;

  /**
   * The feature id for the '<em><b>Logger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON__LOGGER = MSENSOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON__UID = MSENSOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Poll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON__POLL = MSENSOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON__ENABLED_A = MSENSOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON__SUB_ID = MSENSOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Mbrick</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON__MBRICK = MSENSOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON__TF_CONFIG = MSENSOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Device Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON__DEVICE_TYPE = MSENSOR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Button Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON__BUTTON_NUM = MSENSOR_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>MLCD2 0x4 Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON_FEATURE_COUNT = MSENSOR_FEATURE_COUNT + 9;

  /**
   * The operation id for the '<em>Fetch Sensor Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON___FETCH_SENSOR_VALUE = MSENSOR___FETCH_SENSOR_VALUE;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON___INIT = MSENSOR_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Enable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON___ENABLE = MSENSOR_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Disable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON___DISABLE = MSENSOR_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>MLCD2 0x4 Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLCD2_0X4_BUTTON_OPERATION_COUNT = MSENSOR_OPERATION_COUNT + 3;

  /**
   * The number of structural features of the '<em>TF Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_CONFIG_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>TF Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_CONFIG_OPERATION_COUNT = 0;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_DEVICE__UID = 0;

  /**
   * The feature id for the '<em><b>Subid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_DEVICE__SUBID = 1;

  /**
   * The feature id for the '<em><b>Ohid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_DEVICE__OHID = 2;

  /**
   * The feature id for the '<em><b>Sub Device Ids</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_DEVICE__SUB_DEVICE_IDS = 3;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_DEVICE__TF_CONFIG = 4;

  /**
   * The feature id for the '<em><b>Oh Config</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_DEVICE__OH_CONFIG = 5;

  /**
   * The number of structural features of the '<em>OHTF Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_DEVICE_FEATURE_COUNT = 6;

  /**
   * The operation id for the '<em>Is Valid Sub Id</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_DEVICE___IS_VALID_SUB_ID__STRING = 0;

  /**
   * The number of operations of the '<em>OHTF Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_DEVICE_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.OHTFSubDeviceAdminDeviceImpl <em>OHTF Sub Device Admin Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.OHTFSubDeviceAdminDeviceImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getOHTFSubDeviceAdminDevice()
   * @generated
   */
  int OHTF_SUB_DEVICE_ADMIN_DEVICE = 102;

  /**
   * The feature id for the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_SUB_DEVICE_ADMIN_DEVICE__UID = OHTF_DEVICE__UID;

  /**
   * The feature id for the '<em><b>Subid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_SUB_DEVICE_ADMIN_DEVICE__SUBID = OHTF_DEVICE__SUBID;

  /**
   * The feature id for the '<em><b>Ohid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_SUB_DEVICE_ADMIN_DEVICE__OHID = OHTF_DEVICE__OHID;

  /**
   * The feature id for the '<em><b>Sub Device Ids</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_SUB_DEVICE_ADMIN_DEVICE__SUB_DEVICE_IDS = OHTF_DEVICE__SUB_DEVICE_IDS;

  /**
   * The feature id for the '<em><b>Tf Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_SUB_DEVICE_ADMIN_DEVICE__TF_CONFIG = OHTF_DEVICE__TF_CONFIG;

  /**
   * The feature id for the '<em><b>Oh Config</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_SUB_DEVICE_ADMIN_DEVICE__OH_CONFIG = OHTF_DEVICE__OH_CONFIG;

  /**
   * The number of structural features of the '<em>OHTF Sub Device Admin Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_SUB_DEVICE_ADMIN_DEVICE_FEATURE_COUNT = OHTF_DEVICE_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Is Valid Sub Id</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_SUB_DEVICE_ADMIN_DEVICE___IS_VALID_SUB_ID__STRING = OHTF_DEVICE_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>OHTF Sub Device Admin Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OHTF_SUB_DEVICE_ADMIN_DEVICE_OPERATION_COUNT = OHTF_DEVICE_OPERATION_COUNT + 1;

  /**
   * The feature id for the '<em><b>Oh Tf Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OH_CONFIG__OH_TF_DEVICES = 0;

  /**
   * The number of structural features of the '<em>OH Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OH_CONFIG_FEATURE_COUNT = 1;

  /**
   * The operation id for the '<em>Get Config By TF Id</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OH_CONFIG___GET_CONFIG_BY_TF_ID__STRING_STRING = 0;

  /**
   * The operation id for the '<em>Get Config By OH Id</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OH_CONFIG___GET_CONFIG_BY_OH_ID__STRING = 1;

  /**
   * The number of operations of the '<em>OH Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OH_CONFIG_OPERATION_COUNT = 2;

  /**
   * The number of structural features of the '<em>TF Null Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_NULL_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>TF Null Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_NULL_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFPTCBrickletConfigurationImpl <em>TFPTC Bricklet Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFPTCBrickletConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFPTCBrickletConfiguration()
   * @generated
   */
  int TFPTC_BRICKLET_CONFIGURATION = 105;

  /**
   * The feature id for the '<em><b>Noise Rejection Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFPTC_BRICKLET_CONFIGURATION__NOISE_REJECTION_FILTER = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Wire Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFPTC_BRICKLET_CONFIGURATION__WIRE_MODE = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>TFPTC Bricklet Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFPTC_BRICKLET_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>TFPTC Bricklet Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFPTC_BRICKLET_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFIndustrialDual020mAConfigurationImpl <em>TF Industrial Dual020m AConfiguration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFIndustrialDual020mAConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFIndustrialDual020mAConfiguration()
   * @generated
   */
  int TF_INDUSTRIAL_DUAL020M_ACONFIGURATION = 106;

  /**
   * The feature id for the '<em><b>Sample Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_INDUSTRIAL_DUAL020M_ACONFIGURATION__SAMPLE_RATE = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TF Industrial Dual020m AConfiguration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_INDUSTRIAL_DUAL020M_ACONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>TF Industrial Dual020m AConfiguration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_INDUSTRIAL_DUAL020M_ACONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BASE_CONFIGURATION__THRESHOLD = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BASE_CONFIGURATION__CALLBACK_PERIOD = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>TF Base Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BASE_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>TF Base Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BASE_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFObjectTemperatureConfigurationImpl <em>TF Object Temperature Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFObjectTemperatureConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFObjectTemperatureConfiguration()
   * @generated
   */
  int TF_OBJECT_TEMPERATURE_CONFIGURATION = 108;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_OBJECT_TEMPERATURE_CONFIGURATION__THRESHOLD = TF_BASE_CONFIGURATION__THRESHOLD;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_OBJECT_TEMPERATURE_CONFIGURATION__CALLBACK_PERIOD = TF_BASE_CONFIGURATION__CALLBACK_PERIOD;

  /**
   * The feature id for the '<em><b>Emissivity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_OBJECT_TEMPERATURE_CONFIGURATION__EMISSIVITY = TF_BASE_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TF Object Temperature Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_OBJECT_TEMPERATURE_CONFIGURATION_FEATURE_COUNT = TF_BASE_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>TF Object Temperature Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_OBJECT_TEMPERATURE_CONFIGURATION_OPERATION_COUNT = TF_BASE_CONFIGURATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFMoistureBrickletConfigurationImpl <em>TF Moisture Bricklet Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFMoistureBrickletConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFMoistureBrickletConfiguration()
   * @generated
   */
  int TF_MOISTURE_BRICKLET_CONFIGURATION = 109;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_MOISTURE_BRICKLET_CONFIGURATION__THRESHOLD = TF_BASE_CONFIGURATION__THRESHOLD;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_MOISTURE_BRICKLET_CONFIGURATION__CALLBACK_PERIOD = TF_BASE_CONFIGURATION__CALLBACK_PERIOD;

  /**
   * The feature id for the '<em><b>Moving Average</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_MOISTURE_BRICKLET_CONFIGURATION__MOVING_AVERAGE = TF_BASE_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TF Moisture Bricklet Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_MOISTURE_BRICKLET_CONFIGURATION_FEATURE_COUNT = TF_BASE_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>TF Moisture Bricklet Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_MOISTURE_BRICKLET_CONFIGURATION_OPERATION_COUNT = TF_BASE_CONFIGURATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFDistanceUSBrickletConfigurationImpl <em>TF Distance US Bricklet Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFDistanceUSBrickletConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFDistanceUSBrickletConfiguration()
   * @generated
   */
  int TF_DISTANCE_US_BRICKLET_CONFIGURATION = 110;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_DISTANCE_US_BRICKLET_CONFIGURATION__THRESHOLD = TF_BASE_CONFIGURATION__THRESHOLD;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_DISTANCE_US_BRICKLET_CONFIGURATION__CALLBACK_PERIOD = TF_BASE_CONFIGURATION__CALLBACK_PERIOD;

  /**
   * The feature id for the '<em><b>Moving Average</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_DISTANCE_US_BRICKLET_CONFIGURATION__MOVING_AVERAGE = TF_BASE_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TF Distance US Bricklet Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_DISTANCE_US_BRICKLET_CONFIGURATION_FEATURE_COUNT = TF_BASE_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>TF Distance US Bricklet Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_DISTANCE_US_BRICKLET_CONFIGURATION_OPERATION_COUNT = TF_BASE_CONFIGURATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFVoltageCurrentConfigurationImpl <em>TF Voltage Current Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.TFVoltageCurrentConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFVoltageCurrentConfiguration()
   * @generated
   */
  int TF_VOLTAGE_CURRENT_CONFIGURATION = 111;

  /**
   * The feature id for the '<em><b>Averaging</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_VOLTAGE_CURRENT_CONFIGURATION__AVERAGING = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Voltage Conversion Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_VOLTAGE_CURRENT_CONFIGURATION__VOLTAGE_CONVERSION_TIME = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Current Conversion Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_VOLTAGE_CURRENT_CONFIGURATION__CURRENT_CONVERSION_TIME = TF_CONFIG_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>TF Voltage Current Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_VOLTAGE_CURRENT_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>TF Voltage Current Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_VOLTAGE_CURRENT_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickletRemoteSwitchConfigurationImpl <em>Bricklet Remote Switch Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.BrickletRemoteSwitchConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getBrickletRemoteSwitchConfiguration()
   * @generated
   */
  int BRICKLET_REMOTE_SWITCH_CONFIGURATION = 117;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchAConfigurationImpl <em>Remote Switch AConfiguration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchAConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchAConfiguration()
   * @generated
   */
  int REMOTE_SWITCH_ACONFIGURATION = 118;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchBConfigurationImpl <em>Remote Switch BConfiguration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchBConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchBConfiguration()
   * @generated
   */
  int REMOTE_SWITCH_BCONFIGURATION = 119;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchCConfigurationImpl <em>Remote Switch CConfiguration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchCConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchCConfiguration()
   * @generated
   */
  int REMOTE_SWITCH_CCONFIGURATION = 120;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MultiTouchDeviceConfigurationImpl <em>Multi Touch Device Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.MultiTouchDeviceConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMultiTouchDeviceConfiguration()
   * @generated
   */
  int MULTI_TOUCH_DEVICE_CONFIGURATION = 121;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickletMultiTouchConfigurationImpl <em>Bricklet Multi Touch Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.BrickletMultiTouchConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getBrickletMultiTouchConfiguration()
   * @generated
   */
  int BRICKLET_MULTI_TOUCH_CONFIGURATION = 122;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DimmableConfigurationImpl <em>Dimmable Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.DimmableConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDimmableConfiguration()
   * @generated
   */
  int DIMMABLE_CONFIGURATION = 123;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMMABLE_CONFIGURATION__MIN_VALUE = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMMABLE_CONFIGURATION__MAX_VALUE = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dimmable Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMMABLE_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Dimmable Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMMABLE_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BRICK_DC_CONFIGURATION__MIN_VALUE = DIMMABLE_CONFIGURATION__MIN_VALUE;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BRICK_DC_CONFIGURATION__MAX_VALUE = DIMMABLE_CONFIGURATION__MAX_VALUE;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BRICK_DC_CONFIGURATION__THRESHOLD = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Callback Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BRICK_DC_CONFIGURATION__CALLBACK_PERIOD = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Velocity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BRICK_DC_CONFIGURATION__VELOCITY = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Acceleration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BRICK_DC_CONFIGURATION__ACCELERATION = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Pwm Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BRICK_DC_CONFIGURATION__PWM_FREQUENCY = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Drive Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BRICK_DC_CONFIGURATION__DRIVE_MODE = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>TF Brick DC Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BRICK_DC_CONFIGURATION_FEATURE_COUNT = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>TF Brick DC Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_BRICK_DC_CONFIGURATION_OPERATION_COUNT = DIMMABLE_CONFIGURATION_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFIO_ACTOR_CONFIGURATION__DEFAULT_STATE = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Keep On Reconnect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFIO_ACTOR_CONFIGURATION__KEEP_ON_RECONNECT = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>TFIO Actor Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFIO_ACTOR_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>TFIO Actor Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFIO_ACTOR_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Debounce Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_INTERRUPT_LISTENER_CONFIGURATION__DEBOUNCE_PERIOD = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TF Interrupt Listener Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_INTERRUPT_LISTENER_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>TF Interrupt Listener Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_INTERRUPT_LISTENER_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pull Up Resistor Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFIO_SENSOR_CONFIGURATION__PULL_UP_RESISTOR_ENABLED = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TFIO Sensor Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFIO_SENSOR_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>TFIO Sensor Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TFIO_SENSOR_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION__MIN_VALUE = DIMMABLE_CONFIGURATION__MIN_VALUE;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION__MAX_VALUE = DIMMABLE_CONFIGURATION__MAX_VALUE;

  /**
   * The feature id for the '<em><b>Velocity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION__VELOCITY = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Acceleration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION__ACCELERATION = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Servo Voltage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION__SERVO_VOLTAGE = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pulse Width Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION__PULSE_WIDTH_MIN = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Pulse Width Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION__PULSE_WIDTH_MAX = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION__PERIOD = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Output Voltage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION__OUTPUT_VOLTAGE = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>TF Servo Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION_FEATURE_COUNT = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 7;

  /**
   * The number of operations of the '<em>TF Servo Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TF_SERVO_CONFIGURATION_OPERATION_COUNT = DIMMABLE_CONFIGURATION_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type ADevices</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICKLET_REMOTE_SWITCH_CONFIGURATION__TYPE_ADEVICES = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type BDevices</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICKLET_REMOTE_SWITCH_CONFIGURATION__TYPE_BDEVICES = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type CDevices</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICKLET_REMOTE_SWITCH_CONFIGURATION__TYPE_CDEVICES = TF_CONFIG_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Bricklet Remote Switch Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICKLET_REMOTE_SWITCH_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Bricklet Remote Switch Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICKLET_REMOTE_SWITCH_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>House Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_ACONFIGURATION__HOUSE_CODE = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Receiver Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_ACONFIGURATION__RECEIVER_CODE = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Repeats</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_ACONFIGURATION__REPEATS = TF_CONFIG_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Remote Switch AConfiguration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_ACONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Remote Switch AConfiguration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_ACONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_BCONFIGURATION__MIN_VALUE = DIMMABLE_CONFIGURATION__MIN_VALUE;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_BCONFIGURATION__MAX_VALUE = DIMMABLE_CONFIGURATION__MAX_VALUE;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_BCONFIGURATION__ADDRESS = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_BCONFIGURATION__UNIT = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Repeats</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_BCONFIGURATION__REPEATS = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Remote Switch BConfiguration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_BCONFIGURATION_FEATURE_COUNT = DIMMABLE_CONFIGURATION_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Remote Switch BConfiguration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_BCONFIGURATION_OPERATION_COUNT = DIMMABLE_CONFIGURATION_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>System Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_CCONFIGURATION__SYSTEM_CODE = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_CCONFIGURATION__DEVICE_CODE = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Repeats</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_CCONFIGURATION__REPEATS = TF_CONFIG_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Remote Switch CConfiguration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_CCONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Remote Switch CConfiguration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_SWITCH_CCONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Disable Electrode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE_CONFIGURATION__DISABLE_ELECTRODE = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Multi Touch Device Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Multi Touch Device Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TOUCH_DEVICE_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Recalibrate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICKLET_MULTI_TOUCH_CONFIGURATION__RECALIBRATE = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sensitivity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICKLET_MULTI_TOUCH_CONFIGURATION__SENSITIVITY = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bricklet Multi Touch Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICKLET_MULTI_TOUCH_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Bricklet Multi Touch Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRICKLET_MULTI_TOUCH_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.ButtonConfigurationImpl <em>Button Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ButtonConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getButtonConfiguration()
   * @generated
   */
  int BUTTON_CONFIGURATION = 124;

  /**
   * The feature id for the '<em><b>Tactile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_CONFIGURATION__TACTILE = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Button Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DualButtonLEDConfigurationImpl <em>Dual Button LED Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.DualButtonLEDConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonLEDConfiguration()
   * @generated
   */
  int DUAL_BUTTON_LED_CONFIGURATION = 125;

  /**
   * The feature id for the '<em><b>Autotoggle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED_CONFIGURATION__AUTOTOGGLE = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dual Button LED Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Dual Button LED Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUAL_BUTTON_LED_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.LEDStripConfigurationImpl <em>LED Strip Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.LEDStripConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getLEDStripConfiguration()
   * @generated
   */
  int LED_STRIP_CONFIGURATION = 126;

  /**
   * The feature id for the '<em><b>Chiptype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_STRIP_CONFIGURATION__CHIPTYPE = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Frameduration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_STRIP_CONFIGURATION__FRAMEDURATION = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Clockfrequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_STRIP_CONFIGURATION__CLOCKFREQUENCY = TF_CONFIG_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Color Mapping</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_STRIP_CONFIGURATION__COLOR_MAPPING = TF_CONFIG_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Devices</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_STRIP_CONFIGURATION__SUB_DEVICES = TF_CONFIG_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>LED Strip Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_STRIP_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>LED Strip Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_STRIP_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.LEDGroupConfigurationImpl <em>LED Group Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.impl.LEDGroupConfigurationImpl
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getLEDGroupConfiguration()
   * @generated
   */
  int LED_GROUP_CONFIGURATION = 127;

  /**
   * The feature id for the '<em><b>Leds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP_CONFIGURATION__LEDS = TF_CONFIG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LED Group Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP_CONFIGURATION_FEATURE_COUNT = TF_CONFIG_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>LED Group Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_GROUP_CONFIGURATION_OPERATION_COUNT = TF_CONFIG_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '<em>Switch State</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.types.OnOffValue
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getSwitchState()
   * @generated
   */
  int SWITCH_STATE = 164;

  /**
   * The meta object id for the '<em>Digital Value</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.types.HighLowValue
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalValue()
   * @generated
   */
  int DIGITAL_VALUE = 165;

  /**
   * The meta object id for the '<em>HSB Value</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.types.HSBValue
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getHSBValue()
   * @generated
   */
  int HSB_VALUE = 166;

  /**
   * The meta object id for the '<em>Tinker Bricklet IO16</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletIO16
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletIO16()
   * @generated
   */
  int TINKER_BRICKLET_IO16 = 167;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.DCDriveMode <em>DC Drive Mode</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.DCDriveMode
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDCDriveMode()
   * @generated
   */
  int DC_DRIVE_MODE = 146;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsServo <em>Config Opts Servo</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsServo
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getConfigOptsServo()
   * @generated
   */
  int CONFIG_OPTS_SERVO = 147;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonDevicePosition <em>Dual Button Device Position</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonDevicePosition
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonDevicePosition()
   * @generated
   */
  int DUAL_BUTTON_DEVICE_POSITION = 148;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonLedSubIds <em>Dual Button Led Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonLedSubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonLedSubIds()
   * @generated
   */
  int DUAL_BUTTON_LED_SUB_IDS = 149;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonButtonSubIds <em>Dual Button Button Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonButtonSubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonButtonSubIds()
   * @generated
   */
  int DUAL_BUTTON_BUTTON_SUB_IDS = 150;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.JoystickSubIds <em>Joystick Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.JoystickSubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getJoystickSubIds()
   * @generated
   */
  int JOYSTICK_SUB_IDS = 151;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.PTCSubIds <em>PTC Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.PTCSubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPTCSubIds()
   * @generated
   */
  int PTC_SUB_IDS = 152;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialDual020mASubIds <em>Industrial Dual020m ASub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.IndustrialDual020mASubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIndustrialDual020mASubIds()
   * @generated
   */
  int INDUSTRIAL_DUAL020M_ASUB_IDS = 153;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.NoSubIds <em>No Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.NoSubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getNoSubIds()
   * @generated
   */
  int NO_SUB_IDS = 128;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalInSubIDs <em>Industrial Digital In Sub IDs</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalInSubIDs
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIndustrialDigitalInSubIDs()
   * @generated
   */
  int INDUSTRIAL_DIGITAL_IN_SUB_IDS = 129;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalOutSubIDs <em>Industrial Digital Out Sub IDs</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalOutSubIDs
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIndustrialDigitalOutSubIDs()
   * @generated
   */
  int INDUSTRIAL_DIGITAL_OUT_SUB_IDS = 130;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialQuadRelayIDs <em>Industrial Quad Relay IDs</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.IndustrialQuadRelayIDs
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIndustrialQuadRelayIDs()
   * @generated
   */
  int INDUSTRIAL_QUAD_RELAY_IDS = 131;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.ServoSubIDs <em>Servo Sub IDs</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.ServoSubIDs
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getServoSubIDs()
   * @generated
   */
  int SERVO_SUB_IDS = 132;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.BarometerSubIDs <em>Barometer Sub IDs</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.BarometerSubIDs
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getBarometerSubIDs()
   * @generated
   */
  int BAROMETER_SUB_IDS = 133;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.IO16SubIds <em>IO16 Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.IO16SubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIO16SubIds()
   * @generated
   */
  int IO16_SUB_IDS = 134;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.IO4SubIds <em>IO4 Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.IO4SubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIO4SubIds()
   * @generated
   */
  int IO4_SUB_IDS = 135;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.DualRelaySubIds <em>Dual Relay Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.DualRelaySubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualRelaySubIds()
   * @generated
   */
  int DUAL_RELAY_SUB_IDS = 136;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.LCDButtonSubIds <em>LCD Button Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.LCDButtonSubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getLCDButtonSubIds()
   * @generated
   */
  int LCD_BUTTON_SUB_IDS = 137;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.LCDBacklightSubIds <em>LCD Backlight Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.LCDBacklightSubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getLCDBacklightSubIds()
   * @generated
   */
  int LCD_BACKLIGHT_SUB_IDS = 138;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.MultiTouchSubIds <em>Multi Touch Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.MultiTouchSubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMultiTouchSubIds()
   * @generated
   */
  int MULTI_TOUCH_SUB_IDS = 139;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.TemperatureIRSubIds <em>Temperature IR Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.TemperatureIRSubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTemperatureIRSubIds()
   * @generated
   */
  int TEMPERATURE_IR_SUB_IDS = 140;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.VoltageCurrentSubIds <em>Voltage Current Sub Ids</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.VoltageCurrentSubIds
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getVoltageCurrentSubIds()
   * @generated
   */
  int VOLTAGE_CURRENT_SUB_IDS = 141;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsMove <em>Config Opts Move</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsMove
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getConfigOptsMove()
   * @generated
   */
  int CONFIG_OPTS_MOVE = 142;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsDimmable <em>Config Opts Dimmable</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsDimmable
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getConfigOptsDimmable()
   * @generated
   */
  int CONFIG_OPTS_DIMMABLE = 143;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsSetPoint <em>Config Opts Set Point</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsSetPoint
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getConfigOptsSetPoint()
   * @generated
   */
  int CONFIG_OPTS_SET_POINT = 144;

  /**
   * The meta object id for the '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsSwitchSpeed <em>Config Opts Switch Speed</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsSwitchSpeed
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getConfigOptsSwitchSpeed()
   * @generated
   */
  int CONFIG_OPTS_SWITCH_SPEED = 145;

  /**
   * The meta object id for the '<em>MIP Connection</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.IPConnection
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMIPConnection()
   * @generated
   */
  int MIP_CONNECTION = 154;

  /**
   * The meta object id for the '<em>MTinker Device</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.Device
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerDevice()
   * @generated
   */
  int MTINKER_DEVICE = 155;

  /**
   * The meta object id for the '<em>MLogger</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slf4j.Logger
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMLogger()
   * @generated
   */
  int MLOGGER = 156;


  /**
   * The meta object id for the '<em>MAtomic Boolean</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.concurrent.atomic.AtomicBoolean
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMAtomicBoolean()
   * @generated
   */
  int MATOMIC_BOOLEAN = 157;

  /**
   * The meta object id for the '<em>MTinkerforge Device</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.Device
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerforgeDevice()
   * @generated
   */
  int MTINKERFORGE_DEVICE = 158;

  /**
   * The meta object id for the '<em>MTinker Brick DC</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickDC
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickDC()
   * @generated
   */
  int MTINKER_BRICK_DC = 159;

  /**
   * The meta object id for the '<em>MTinker Brick Servo</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickServo
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickServo()
   * @generated
   */
  int MTINKER_BRICK_SERVO = 168;


  /**
   * The meta object id for the '<em>MTinkerforge Value</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.types.TinkerforgeValue
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerforgeValue()
   * @generated
   */
  int MTINKERFORGE_VALUE = 169;

  /**
   * The meta object id for the '<em>MDecimal Value</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.types.DecimalValue
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMDecimalValue()
   * @generated
   */
  int MDECIMAL_VALUE = 170;

  /**
   * The meta object id for the '<em>MTinker Bricklet Humidity</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletHumidity
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletHumidity()
   * @generated
   */
  int MTINKER_BRICKLET_HUMIDITY = 171;

  /**
   * The meta object id for the '<em>MTinker Bricklet Distance IR</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletDistanceIR
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletDistanceIR()
   * @generated
   */
  int MTINKER_BRICKLET_DISTANCE_IR = 172;

  /**
   * The meta object id for the '<em>MTinker Bricklet Temperature</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletTemperature
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletTemperature()
   * @generated
   */
  int MTINKER_BRICKLET_TEMPERATURE = 173;

  /**
   * The meta object id for the '<em>MTinker Bricklet Barometer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletBarometer
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletBarometer()
   * @generated
   */
  int MTINKER_BRICKLET_BAROMETER = 174;

  /**
   * The meta object id for the '<em>MTinker Bricklet Ambient Light</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletAmbientLight
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletAmbientLight()
   * @generated
   */
  int MTINKER_BRICKLET_AMBIENT_LIGHT = 175;

  /**
   * The meta object id for the '<em>MTinker Bricklet LCD2 0x4</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletLCD20x4
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletLCD20x4()
   * @generated
   */
  int MTINKER_BRICKLET_LCD2_0X4 = 176;

  /**
   * The meta object id for the '<em>Tinker Bricklet Remote Switch</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletRemoteSwitch
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletRemoteSwitch()
   * @generated
   */
  int TINKER_BRICKLET_REMOTE_SWITCH = 177;

  /**
   * The meta object id for the '<em>Tinker Bricklet Motion Detector</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletMotionDetector
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletMotionDetector()
   * @generated
   */
  int TINKER_BRICKLET_MOTION_DETECTOR = 178;

  /**
   * The meta object id for the '<em>Tinker Bricklet Multi Touch</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletMultiTouch
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletMultiTouch()
   * @generated
   */
  int TINKER_BRICKLET_MULTI_TOUCH = 179;

  /**
   * The meta object id for the '<em>Tinker Bricklet Temperature IR</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletTemperatureIR
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletTemperatureIR()
   * @generated
   */
  int TINKER_BRICKLET_TEMPERATURE_IR = 180;

  /**
   * The meta object id for the '<em>Tinker Bricklet Sound Intensity</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletSoundIntensity
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletSoundIntensity()
   * @generated
   */
  int TINKER_BRICKLET_SOUND_INTENSITY = 181;

  /**
   * The meta object id for the '<em>Tinker Bricklet Moisture</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletMoisture
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletMoisture()
   * @generated
   */
  int TINKER_BRICKLET_MOISTURE = 182;

  /**
   * The meta object id for the '<em>Tinker Bricklet Distance US</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletDistanceUS
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletDistanceUS()
   * @generated
   */
  int TINKER_BRICKLET_DISTANCE_US = 183;

  /**
   * The meta object id for the '<em>Tinker Bricklet Voltage Current</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletVoltageCurrent
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletVoltageCurrent()
   * @generated
   */
  int TINKER_BRICKLET_VOLTAGE_CURRENT = 184;

  /**
   * The meta object id for the '<em>Tinker Bricklet Tilt</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletTilt
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletTilt()
   * @generated
   */
  int TINKER_BRICKLET_TILT = 185;

  /**
   * The meta object id for the '<em>Tinker Bricklet IO4</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletIO4
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletIO4()
   * @generated
   */
  int TINKER_BRICKLET_IO4 = 186;

  /**
   * The meta object id for the '<em>Tinker Bricklet Hall Effect</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletHallEffect
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletHallEffect()
   * @generated
   */
  int TINKER_BRICKLET_HALL_EFFECT = 187;

  /**
   * The meta object id for the '<em>Tinker Bricklet Segment Display4x7</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletSegmentDisplay4x7
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletSegmentDisplay4x7()
   * @generated
   */
  int TINKER_BRICKLET_SEGMENT_DISPLAY4X7 = 188;

  /**
   * The meta object id for the '<em>Tinker Bricklet LED Strip</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletLEDStrip
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletLEDStrip()
   * @generated
   */
  int TINKER_BRICKLET_LED_STRIP = 189;

  /**
   * The meta object id for the '<em>Bricklet Joystick</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletJoystick
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getBrickletJoystick()
   * @generated
   */
  int BRICKLET_JOYSTICK = 190;

  /**
   * The meta object id for the '<em>Tinker Bricklet Linear Poti</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletLinearPoti
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletLinearPoti()
   * @generated
   */
  int TINKER_BRICKLET_LINEAR_POTI = 191;

  /**
   * The meta object id for the '<em>Tinker Bricklet Dual Button</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletDualButton
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletDualButton()
   * @generated
   */
  int TINKER_BRICKLET_DUAL_BUTTON = 192;

  /**
   * The meta object id for the '<em>Tinker Bricklet PTC</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletPTC
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletPTC()
   * @generated
   */
  int TINKER_BRICKLET_PTC = 193;

  /**
   * The meta object id for the '<em>Tinker Bricklet Industrial Dual020m A</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletIndustrialDual020mA
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletIndustrialDual020mA()
   * @generated
   */
  int TINKER_BRICKLET_INDUSTRIAL_DUAL020M_A = 194;

  /**
   * The meta object id for the '<em>Tinker Bricklet Solid State Relay</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletSolidStateRelay
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletSolidStateRelay()
   * @generated
   */
  int TINKER_BRICKLET_SOLID_STATE_RELAY = 195;

  /**
   * The meta object id for the '<em>HSB Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.core.library.types.HSBType
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getHSBType()
   * @generated
   */
  int HSB_TYPE = 196;

  /**
   * The meta object id for the '<em>Up Down Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.core.library.types.UpDownType
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getUpDownType()
   * @generated
   */
  int UP_DOWN_TYPE = 197;

  /**
   * The meta object id for the '<em>Percent Value</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.types.PercentValue
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPercentValue()
   * @generated
   */
  int PERCENT_VALUE = 198;

  /**
   * The meta object id for the '<em>Device Options</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.config.DeviceOptions
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDeviceOptions()
   * @generated
   */
  int DEVICE_OPTIONS = 199;

  /**
   * The meta object id for the '<em>Percent Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.core.library.types.PercentType
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPercentType()
   * @generated
   */
  int PERCENT_TYPE = 200;

  /**
   * The meta object id for the '<em>Increase Decrease Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.core.library.types.IncreaseDecreaseType
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIncreaseDecreaseType()
   * @generated
   */
  int INCREASE_DECREASE_TYPE = 201;

  /**
   * The meta object id for the '<em>Direction Value</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.binding.tinkerforge.internal.types.DirectionValue
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDirectionValue()
   * @generated
   */
  int DIRECTION_VALUE = 202;

  /**
   * The meta object id for the '<em>Enum</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Enum
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 203;

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFConfig <em>TF Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Config</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFConfig
   * @generated
   */
  EClass getTFConfig();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.OHTFDevice <em>OHTF Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OHTF Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.OHTFDevice
   * @generated
   */
  EClass getOHTFDevice();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getUid()
   * @see #getOHTFDevice()
   * @generated
   */
  EAttribute getOHTFDevice_Uid();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getSubid <em>Subid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subid</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getSubid()
   * @see #getOHTFDevice()
   * @generated
   */
  EAttribute getOHTFDevice_Subid();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getOhid <em>Ohid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ohid</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getOhid()
   * @see #getOHTFDevice()
   * @generated
   */
  EAttribute getOHTFDevice_Ohid();

  /**
   * Returns the meta object for the attribute list '{@link org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getSubDeviceIds <em>Sub Device Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sub Device Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getSubDeviceIds()
   * @see #getOHTFDevice()
   * @generated
   */
  EAttribute getOHTFDevice_SubDeviceIds();

  /**
   * Returns the meta object for the containment reference '{@link org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getTfConfig <em>Tf Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tf Config</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getTfConfig()
   * @see #getOHTFDevice()
   * @generated
   */
  EReference getOHTFDevice_TfConfig();

  /**
   * Returns the meta object for the container reference '{@link org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getOhConfig <em>Oh Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Oh Config</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getOhConfig()
   * @see #getOHTFDevice()
   * @generated
   */
  EReference getOHTFDevice_OhConfig();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.OHTFDevice#isValidSubId(java.lang.String) <em>Is Valid Sub Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Is Valid Sub Id</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.OHTFDevice#isValidSubId(java.lang.String)
   * @generated
   */
  EOperation getOHTFDevice__IsValidSubId__String();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.OHTFSubDeviceAdminDevice <em>OHTF Sub Device Admin Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OHTF Sub Device Admin Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.OHTFSubDeviceAdminDevice
   * @generated
   */
  EClass getOHTFSubDeviceAdminDevice();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.OHTFSubDeviceAdminDevice#isValidSubId(java.lang.String) <em>Is Valid Sub Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Is Valid Sub Id</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.OHTFSubDeviceAdminDevice#isValidSubId(java.lang.String)
   * @generated
   */
  EOperation getOHTFSubDeviceAdminDevice__IsValidSubId__String();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.OHConfig <em>OH Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OH Config</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.OHConfig
   * @generated
   */
  EClass getOHConfig();

  /**
   * Returns the meta object for the containment reference list '{@link org.openhab.binding.tinkerforge.internal.model.OHConfig#getOhTfDevices <em>Oh Tf Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Oh Tf Devices</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.OHConfig#getOhTfDevices()
   * @see #getOHConfig()
   * @generated
   */
  EReference getOHConfig_OhTfDevices();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.OHConfig#getConfigByTFId(java.lang.String, java.lang.String) <em>Get Config By TF Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Config By TF Id</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.OHConfig#getConfigByTFId(java.lang.String, java.lang.String)
   * @generated
   */
  EOperation getOHConfig__GetConfigByTFId__String_String();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.OHConfig#getConfigByOHId(java.lang.String) <em>Get Config By OH Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Config By OH Id</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.OHConfig#getConfigByOHId(java.lang.String)
   * @generated
   */
  EOperation getOHConfig__GetConfigByOHId__String();

  /**
   * The meta object id for the '<em>MTinker Bricklet Dual Relay</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletDualRelay
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletDualRelay()
   * @generated
   */
  int MTINKER_BRICKLET_DUAL_RELAY = 160;


  /**
   * The meta object id for the '<em>MTinker Bricklet Industrial Quad Relay</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletIndustrialQuadRelay
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletIndustrialQuadRelay()
   * @generated
   */
  int MTINKER_BRICKLET_INDUSTRIAL_QUAD_RELAY = 161;

  /**
   * The meta object id for the '<em>MTinker Bricklet Industrial Digital In4</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletIndustrialDigitalIn4
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletIndustrialDigitalIn4()
   * @generated
   */
  int MTINKER_BRICKLET_INDUSTRIAL_DIGITAL_IN4 = 162;

  /**
   * The meta object id for the '<em>MTinker Bricklet Industrial Digital Out4</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tinkerforge.BrickletIndustrialDigitalOut4
   * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletIndustrialDigitalOut4()
   * @generated
   */
  int MTINKER_BRICKLET_INDUSTRIAL_DIGITAL_OUT4 = 163;

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.Ecosystem <em>Ecosystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ecosystem</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Ecosystem
   * @generated
   */
  EClass getEcosystem();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.Ecosystem#getLogger <em>Logger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logger</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Ecosystem#getLogger()
   * @see #getEcosystem()
   * @generated
   */
  EAttribute getEcosystem_Logger();

  /**
   * Returns the meta object for the containment reference list '{@link org.openhab.binding.tinkerforge.internal.model.Ecosystem#getMbrickds <em>Mbrickds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mbrickds</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Ecosystem#getMbrickds()
   * @see #getEcosystem()
   * @generated
   */
  EReference getEcosystem_Mbrickds();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.Ecosystem#getBrickd(java.lang.String, int) <em>Get Brickd</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Brickd</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.Ecosystem#getBrickd(java.lang.String, int)
   * @generated
   */
  EOperation getEcosystem__GetBrickd__String_int();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.Ecosystem#getDevice(java.lang.String, java.lang.String) <em>Get Device</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Device</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.Ecosystem#getDevice(java.lang.String, java.lang.String)
   * @generated
   */
  EOperation getEcosystem__GetDevice__String_String();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.Ecosystem#getDevices4GenericId(java.lang.String, java.lang.String) <em>Get Devices4 Generic Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Devices4 Generic Id</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.Ecosystem#getDevices4GenericId(java.lang.String, java.lang.String)
   * @generated
   */
  EOperation getEcosystem__GetDevices4GenericId__String_String();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.Ecosystem#disconnect() <em>Disconnect</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Disconnect</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.Ecosystem#disconnect()
   * @generated
   */
  EOperation getEcosystem__Disconnect();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd <em>MBrickd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBrickd</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd
   * @generated
   */
  EClass getMBrickd();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getLogger <em>Logger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logger</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getLogger()
   * @see #getMBrickd()
   * @generated
   */
  EAttribute getMBrickd_Logger();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getIpConnection <em>Ip Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ip Connection</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getIpConnection()
   * @see #getMBrickd()
   * @generated
   */
  EAttribute getMBrickd_IpConnection();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getHost <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getHost()
   * @see #getMBrickd()
   * @generated
   */
  EAttribute getMBrickd_Host();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getPort()
   * @see #getMBrickd()
   * @generated
   */
  EAttribute getMBrickd_Port();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getAuthkey <em>Authkey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Authkey</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getAuthkey()
   * @see #getMBrickd()
   * @generated
   */
  EAttribute getMBrickd_Authkey();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getIsConnected <em>Is Connected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Connected</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getIsConnected()
   * @see #getMBrickd()
   * @generated
   */
  EAttribute getMBrickd_IsConnected();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#isAutoReconnect <em>Auto Reconnect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Auto Reconnect</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#isAutoReconnect()
   * @see #getMBrickd()
   * @generated
   */
  EAttribute getMBrickd_AutoReconnect();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#isReconnected <em>Reconnected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reconnected</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#isReconnected()
   * @see #getMBrickd()
   * @generated
   */
  EAttribute getMBrickd_Reconnected();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getConnectedCounter <em>Connected Counter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connected Counter</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getConnectedCounter()
   * @see #getMBrickd()
   * @generated
   */
  EAttribute getMBrickd_ConnectedCounter();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getTimeout()
   * @see #getMBrickd()
   * @generated
   */
  EAttribute getMBrickd_Timeout();

  /**
   * Returns the meta object for the containment reference list '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getMdevices <em>Mdevices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mdevices</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getMdevices()
   * @see #getMBrickd()
   * @generated
   */
  EReference getMBrickd_Mdevices();

  /**
   * Returns the meta object for the container reference '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getEcosystem <em>Ecosystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Ecosystem</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getEcosystem()
   * @see #getMBrickd()
   * @generated
   */
  EReference getMBrickd_Ecosystem();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#connect() <em>Connect</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Connect</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#connect()
   * @generated
   */
  EOperation getMBrickd__Connect();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#disconnect() <em>Disconnect</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Disconnect</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#disconnect()
   * @generated
   */
  EOperation getMBrickd__Disconnect();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#init()
   * @generated
   */
  EOperation getMBrickd__Init();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickd#getDevice(java.lang.String) <em>Get Device</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Device</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickd#getDevice(java.lang.String)
   * @generated
   */
  EOperation getMBrickd__GetDevice__String();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.SubDeviceAdmin <em>Sub Device Admin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Device Admin</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.SubDeviceAdmin
   * @generated
   */
  EClass getSubDeviceAdmin();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.SubDeviceAdmin#addSubDevice(java.lang.String, java.lang.String) <em>Add Sub Device</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Add Sub Device</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.SubDeviceAdmin#addSubDevice(java.lang.String, java.lang.String)
   * @generated
   */
  EOperation getSubDeviceAdmin__AddSubDevice__String_String();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MTFConfigConsumer <em>MTF Config Consumer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MTF Config Consumer</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MTFConfigConsumer
   * @generated
   */
  EClass getMTFConfigConsumer();

  /**
   * Returns the meta object for the containment reference '{@link org.openhab.binding.tinkerforge.internal.model.MTFConfigConsumer#getTfConfig <em>Tf Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tf Config</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MTFConfigConsumer#getTfConfig()
   * @see #getMTFConfigConsumer()
   * @generated
   */
  EReference getMTFConfigConsumer_TfConfig();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBaseDevice <em>MBase Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBase Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBaseDevice
   * @generated
   */
  EClass getMBaseDevice();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBaseDevice#getLogger <em>Logger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logger</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBaseDevice#getLogger()
   * @see #getMBaseDevice()
   * @generated
   */
  EAttribute getMBaseDevice_Logger();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBaseDevice#getUid <em>Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uid</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBaseDevice#getUid()
   * @see #getMBaseDevice()
   * @generated
   */
  EAttribute getMBaseDevice_Uid();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBaseDevice#isPoll <em>Poll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Poll</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBaseDevice#isPoll()
   * @see #getMBaseDevice()
   * @generated
   */
  EAttribute getMBaseDevice_Poll();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBaseDevice#getEnabledA <em>Enabled A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled A</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBaseDevice#getEnabledA()
   * @see #getMBaseDevice()
   * @generated
   */
  EAttribute getMBaseDevice_EnabledA();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBaseDevice#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBaseDevice#init()
   * @generated
   */
  EOperation getMBaseDevice__Init();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBaseDevice#enable() <em>Enable</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Enable</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBaseDevice#enable()
   * @generated
   */
  EOperation getMBaseDevice__Enable();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBaseDevice#disable() <em>Disable</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Disable</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBaseDevice#disable()
   * @generated
   */
  EOperation getMBaseDevice__Disable();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MDevice <em>MDevice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MDevice</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDevice
   * @generated
   */
  EClass getMDevice();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MDevice#getTinkerforgeDevice <em>Tinkerforge Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tinkerforge Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDevice#getTinkerforgeDevice()
   * @see #getMDevice()
   * @generated
   */
  EAttribute getMDevice_TinkerforgeDevice();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MDevice#getIpConnection <em>Ip Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ip Connection</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDevice#getIpConnection()
   * @see #getMDevice()
   * @generated
   */
  EAttribute getMDevice_IpConnection();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MDevice#getConnectedUid <em>Connected Uid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connected Uid</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDevice#getConnectedUid()
   * @see #getMDevice()
   * @generated
   */
  EAttribute getMDevice_ConnectedUid();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MDevice#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDevice#getPosition()
   * @see #getMDevice()
   * @generated
   */
  EAttribute getMDevice_Position();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MDevice#getDeviceIdentifier <em>Device Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Identifier</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDevice#getDeviceIdentifier()
   * @see #getMDevice()
   * @generated
   */
  EAttribute getMDevice_DeviceIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MDevice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDevice#getName()
   * @see #getMDevice()
   * @generated
   */
  EAttribute getMDevice_Name();

  /**
   * Returns the meta object for the container reference '{@link org.openhab.binding.tinkerforge.internal.model.MDevice#getBrickd <em>Brickd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Brickd</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDevice#getBrickd()
   * @see #getMDevice()
   * @generated
   */
  EReference getMDevice_Brickd();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder <em>MSub Device Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MSub Device Holder</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder
   * @generated
   */
  EClass getMSubDeviceHolder();

  /**
   * Returns the meta object for the containment reference list '{@link org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder#getMsubdevices <em>Msubdevices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Msubdevices</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder#getMsubdevices()
   * @see #getMSubDeviceHolder()
   * @generated
   */
  EReference getMSubDeviceHolder_Msubdevices();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder#initSubDevices() <em>Init Sub Devices</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init Sub Devices</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder#initSubDevices()
   * @generated
   */
  EOperation getMSubDeviceHolder__InitSubDevices();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickServo <em>MBrick Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBrick Servo</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickServo
   * @generated
   */
  EClass getMBrickServo();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickServo#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickServo#getDeviceType()
   * @see #getMBrickServo()
   * @generated
   */
  EAttribute getMBrickServo_DeviceType();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickServo#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickServo#init()
   * @generated
   */
  EOperation getMBrickServo__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration <em>TF Brick DC Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Brick DC Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration
   * @generated
   */
  EClass getTFBrickDCConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration#getVelocity <em>Velocity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Velocity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration#getVelocity()
   * @see #getTFBrickDCConfiguration()
   * @generated
   */
  EAttribute getTFBrickDCConfiguration_Velocity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration#getAcceleration <em>Acceleration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acceleration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration#getAcceleration()
   * @see #getTFBrickDCConfiguration()
   * @generated
   */
  EAttribute getTFBrickDCConfiguration_Acceleration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration#getPwmFrequency <em>Pwm Frequency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pwm Frequency</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration#getPwmFrequency()
   * @see #getTFBrickDCConfiguration()
   * @generated
   */
  EAttribute getTFBrickDCConfiguration_PwmFrequency();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration#getDriveMode <em>Drive Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Drive Mode</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFBrickDCConfiguration#getDriveMode()
   * @see #getTFBrickDCConfiguration()
   * @generated
   */
  EAttribute getTFBrickDCConfiguration_DriveMode();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC <em>MBrick DC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBrick DC</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC
   * @generated
   */
  EClass getMBrickDC();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#getThreshold()
   * @see #getMBrickDC()
   * @generated
   */
  EAttribute getMBrickDC_Threshold();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#getMaxVelocity <em>Max Velocity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Velocity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#getMaxVelocity()
   * @see #getMBrickDC()
   * @generated
   */
  EAttribute getMBrickDC_MaxVelocity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#getMinVelocity <em>Min Velocity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Velocity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#getMinVelocity()
   * @see #getMBrickDC()
   * @generated
   */
  EAttribute getMBrickDC_MinVelocity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#getDeviceType()
   * @see #getMBrickDC()
   * @generated
   */
  EAttribute getMBrickDC_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#getVelocity <em>Velocity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Velocity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#getVelocity()
   * @see #getMBrickDC()
   * @generated
   */
  EAttribute getMBrickDC_Velocity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#getTargetvelocity <em>Targetvelocity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Targetvelocity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#getTargetvelocity()
   * @see #getMBrickDC()
   * @generated
   */
  EAttribute getMBrickDC_Targetvelocity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#getCurrentVelocity <em>Current Velocity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Current Velocity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#getCurrentVelocity()
   * @see #getMBrickDC()
   * @generated
   */
  EAttribute getMBrickDC_CurrentVelocity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#getAcceleration <em>Acceleration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acceleration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#getAcceleration()
   * @see #getMBrickDC()
   * @generated
   */
  EAttribute getMBrickDC_Acceleration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#getPwmFrequency <em>Pwm Frequency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pwm Frequency</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#getPwmFrequency()
   * @see #getMBrickDC()
   * @generated
   */
  EAttribute getMBrickDC_PwmFrequency();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#getDriveMode <em>Drive Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Drive Mode</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#getDriveMode()
   * @see #getMBrickDC()
   * @generated
   */
  EAttribute getMBrickDC_DriveMode();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#init()
   * @generated
   */
  EOperation getMBrickDC__Init();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickDC#setSpeed(java.lang.Short, int, java.lang.String) <em>Set Speed</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Speed</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickDC#setSpeed(java.lang.Short, int, java.lang.String)
   * @generated
   */
  EOperation getMBrickDC__SetSpeed__Short_int_String();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MDualRelayBricklet <em>MDual Relay Bricklet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MDual Relay Bricklet</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDualRelayBricklet
   * @generated
   */
  EClass getMDualRelayBricklet();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MDualRelayBricklet#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDualRelayBricklet#getDeviceType()
   * @see #getMDualRelayBricklet()
   * @generated
   */
  EAttribute getMDualRelayBricklet_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelayBricklet <em>MIndustrial Quad Relay Bricklet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MIndustrial Quad Relay Bricklet</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelayBricklet
   * @generated
   */
  EClass getMIndustrialQuadRelayBricklet();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelayBricklet#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelayBricklet#getDeviceType()
   * @see #getMIndustrialQuadRelayBricklet()
   * @generated
   */
  EAttribute getMIndustrialQuadRelayBricklet_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelay <em>MIndustrial Quad Relay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MIndustrial Quad Relay</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelay
   * @generated
   */
  EClass getMIndustrialQuadRelay();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelay#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelay#getDeviceType()
   * @see #getMIndustrialQuadRelay()
   * @generated
   */
  EAttribute getMIndustrialQuadRelay_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDigitalIn4 <em>MBricklet Industrial Digital In4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Industrial Digital In4</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDigitalIn4
   * @generated
   */
  EClass getMBrickletIndustrialDigitalIn4();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDigitalIn4#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDigitalIn4#getDeviceType()
   * @see #getMBrickletIndustrialDigitalIn4()
   * @generated
   */
  EAttribute getMBrickletIndustrialDigitalIn4_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MIndustrialDigitalIn <em>MIndustrial Digital In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MIndustrial Digital In</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MIndustrialDigitalIn
   * @generated
   */
  EClass getMIndustrialDigitalIn();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MIndustrialDigitalIn#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MIndustrialDigitalIn#getDeviceType()
   * @see #getMIndustrialDigitalIn()
   * @generated
   */
  EAttribute getMIndustrialDigitalIn_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDigitalOut4 <em>MBricklet Industrial Digital Out4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Industrial Digital Out4</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDigitalOut4
   * @generated
   */
  EClass getMBrickletIndustrialDigitalOut4();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDigitalOut4#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDigitalOut4#getDeviceType()
   * @see #getMBrickletIndustrialDigitalOut4()
   * @generated
   */
  EAttribute getMBrickletIndustrialDigitalOut4_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorDigitalOut4 <em>Digital Actor Digital Out4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Digital Actor Digital Out4</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorDigitalOut4
   * @generated
   */
  EClass getDigitalActorDigitalOut4();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorDigitalOut4#getPin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pin</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorDigitalOut4#getPin()
   * @see #getDigitalActorDigitalOut4()
   * @generated
   */
  EAttribute getDigitalActorDigitalOut4_Pin();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorDigitalOut4#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorDigitalOut4#getDeviceType()
   * @see #getDigitalActorDigitalOut4()
   * @generated
   */
  EAttribute getDigitalActorDigitalOut4_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActor <em>Digital Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Digital Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActor
   * @generated
   */
  EClass getDigitalActor();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActor#getDigitalState <em>Digital State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Digital State</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActor#getDigitalState()
   * @see #getDigitalActor()
   * @generated
   */
  EAttribute getDigitalActor_DigitalState();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActor#turnDigital(org.openhab.binding.tinkerforge.internal.types.HighLowValue) <em>Turn Digital</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Turn Digital</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActor#turnDigital(org.openhab.binding.tinkerforge.internal.types.HighLowValue)
   * @generated
   */
  EOperation getDigitalActor__TurnDigital__HighLowValue();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActor#fetchDigitalValue() <em>Fetch Digital Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Fetch Digital Value</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActor#fetchDigitalValue()
   * @generated
   */
  EOperation getDigitalActor__FetchDigitalValue();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.NumberActor <em>Number Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.NumberActor
   * @generated
   */
  EClass getNumberActor();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.NumberActor#setNumber(java.math.BigDecimal) <em>Set Number</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Number</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.NumberActor#setNumber(java.math.BigDecimal)
   * @generated
   */
  EOperation getNumberActor__SetNumber__BigDecimal();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.ColorActor <em>Color Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ColorActor
   * @generated
   */
  EClass getColorActor();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.ColorActor#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ColorActor#getColor()
   * @see #getColorActor()
   * @generated
   */
  EAttribute getColorActor_Color();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.ProgrammableColorActor <em>Programmable Color Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Programmable Color Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ProgrammableColorActor
   * @generated
   */
  EClass getProgrammableColorActor();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.ProgrammableColorActor#setSelectedColor(org.openhab.core.library.types.HSBType, org.openhab.binding.tinkerforge.internal.config.DeviceOptions) <em>Set Selected Color</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Selected Color</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.ProgrammableColorActor#setSelectedColor(org.openhab.core.library.types.HSBType, org.openhab.binding.tinkerforge.internal.config.DeviceOptions)
   * @generated
   */
  EOperation getProgrammableColorActor__SetSelectedColor__HSBType_DeviceOptions();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.SimpleColorActor <em>Simple Color Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Color Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.SimpleColorActor
   * @generated
   */
  EClass getSimpleColorActor();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.SimpleColorActor#setSelectedColor(org.openhab.core.library.types.HSBType) <em>Set Selected Color</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Selected Color</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.SimpleColorActor#setSelectedColor(org.openhab.core.library.types.HSBType)
   * @generated
   */
  EOperation getSimpleColorActor__SetSelectedColor__HSBType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MoveActor <em>Move Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Move Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MoveActor
   * @generated
   */
  EClass getMoveActor();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MoveActor#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MoveActor#getDirection()
   * @see #getMoveActor()
   * @generated
   */
  EAttribute getMoveActor_Direction();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MoveActor#move(org.openhab.core.library.types.UpDownType, org.openhab.binding.tinkerforge.internal.config.DeviceOptions) <em>Move</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Move</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MoveActor#move(org.openhab.core.library.types.UpDownType, org.openhab.binding.tinkerforge.internal.config.DeviceOptions)
   * @generated
   */
  EOperation getMoveActor__Move__UpDownType_DeviceOptions();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MoveActor#stop() <em>Stop</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Stop</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MoveActor#stop()
   * @generated
   */
  EOperation getMoveActor__Stop();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MoveActor#moveon(org.openhab.binding.tinkerforge.internal.config.DeviceOptions) <em>Moveon</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Moveon</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MoveActor#moveon(org.openhab.binding.tinkerforge.internal.config.DeviceOptions)
   * @generated
   */
  EOperation getMoveActor__Moveon__DeviceOptions();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DimmableActor <em>Dimmable Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimmable Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DimmableActor
   * @generated
   */
  EClass getDimmableActor();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DimmableActor#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DimmableActor#getMinValue()
   * @see #getDimmableActor()
   * @generated
   */
  EAttribute getDimmableActor_MinValue();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DimmableActor#getMaxValue <em>Max Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DimmableActor#getMaxValue()
   * @see #getDimmableActor()
   * @generated
   */
  EAttribute getDimmableActor_MaxValue();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.DimmableActor#dimm(org.openhab.core.library.types.IncreaseDecreaseType, org.openhab.binding.tinkerforge.internal.config.DeviceOptions) <em>Dimm</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Dimm</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.DimmableActor#dimm(org.openhab.core.library.types.IncreaseDecreaseType, org.openhab.binding.tinkerforge.internal.config.DeviceOptions)
   * @generated
   */
  EOperation getDimmableActor__Dimm__IncreaseDecreaseType_DeviceOptions();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.SetPointActor <em>Set Point Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Point Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.SetPointActor
   * @generated
   */
  EClass getSetPointActor();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.SetPointActor#getPercentValue <em>Percent Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Percent Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.SetPointActor#getPercentValue()
   * @see #getSetPointActor()
   * @generated
   */
  EAttribute getSetPointActor_PercentValue();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.SetPointActor#setValue(java.math.BigDecimal, org.openhab.binding.tinkerforge.internal.config.DeviceOptions) <em>Set Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Value</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.SetPointActor#setValue(java.math.BigDecimal, org.openhab.binding.tinkerforge.internal.config.DeviceOptions)
   * @generated
   */
  EOperation getSetPointActor__SetValue__BigDecimal_DeviceOptions();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.SetPointActor#setValue(org.openhab.core.library.types.PercentType, org.openhab.binding.tinkerforge.internal.config.DeviceOptions) <em>Set Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Value</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.SetPointActor#setValue(org.openhab.core.library.types.PercentType, org.openhab.binding.tinkerforge.internal.config.DeviceOptions)
   * @generated
   */
  EOperation getSetPointActor__SetValue__PercentType_DeviceOptions();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDualButton <em>MBricklet Dual Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Dual Button</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDualButton
   * @generated
   */
  EClass getMBrickletDualButton();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDualButton#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDualButton#getDeviceType()
   * @see #getMBrickletDualButton()
   * @generated
   */
  EAttribute getMBrickletDualButton_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonDevice <em>Dual Button Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dual Button Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonDevice
   * @generated
   */
  EClass getDualButtonDevice();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonButton <em>Dual Button Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dual Button Button</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonButton
   * @generated
   */
  EClass getDualButtonButton();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonButton#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonButton#getDeviceType()
   * @see #getDualButtonButton()
   * @generated
   */
  EAttribute getDualButtonButton_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonButton#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonButton#getPosition()
   * @see #getDualButtonButton()
   * @generated
   */
  EAttribute getDualButtonButton_Position();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonLed <em>Dual Button Led</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dual Button Led</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonLed
   * @generated
   */
  EClass getDualButtonLed();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonLed#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonLed#getDeviceType()
   * @see #getDualButtonLed()
   * @generated
   */
  EAttribute getDualButtonLed_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonLed#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonLed#getPosition()
   * @see #getDualButtonLed()
   * @generated
   */
  EAttribute getDualButtonLed_Position();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLinearPoti <em>MBricklet Linear Poti</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Linear Poti</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLinearPoti
   * @generated
   */
  EClass getMBrickletLinearPoti();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLinearPoti#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLinearPoti#getDeviceType()
   * @see #getMBrickletLinearPoti()
   * @generated
   */
  EAttribute getMBrickletLinearPoti_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletJoystick <em>MBricklet Joystick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Joystick</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletJoystick
   * @generated
   */
  EClass getMBrickletJoystick();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletJoystick#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletJoystick#getDeviceType()
   * @see #getMBrickletJoystick()
   * @generated
   */
  EAttribute getMBrickletJoystick_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.JoystickDevice <em>Joystick Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Joystick Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.JoystickDevice
   * @generated
   */
  EClass getJoystickDevice();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.JoystickXPosition <em>Joystick XPosition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Joystick XPosition</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.JoystickXPosition
   * @generated
   */
  EClass getJoystickXPosition();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.JoystickXPosition#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.JoystickXPosition#getDeviceType()
   * @see #getJoystickXPosition()
   * @generated
   */
  EAttribute getJoystickXPosition_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.JoystickYPosition <em>Joystick YPosition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Joystick YPosition</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.JoystickYPosition
   * @generated
   */
  EClass getJoystickYPosition();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.JoystickYPosition#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.JoystickYPosition#getDeviceType()
   * @see #getJoystickYPosition()
   * @generated
   */
  EAttribute getJoystickYPosition_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.JoystickButton <em>Joystick Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Joystick Button</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.JoystickButton
   * @generated
   */
  EClass getJoystickButton();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.JoystickButton#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.JoystickButton#getDeviceType()
   * @see #getJoystickButton()
   * @generated
   */
  EAttribute getJoystickButton_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLEDStrip <em>MBricklet LED Strip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet LED Strip</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLEDStrip
   * @generated
   */
  EClass getMBrickletLEDStrip();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLEDStrip#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLEDStrip#getDeviceType()
   * @see #getMBrickletLEDStrip()
   * @generated
   */
  EAttribute getMBrickletLEDStrip_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLEDStrip#getColorMapping <em>Color Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color Mapping</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLEDStrip#getColorMapping()
   * @see #getMBrickletLEDStrip()
   * @generated
   */
  EAttribute getMBrickletLEDStrip_ColorMapping();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.LEDGroup <em>LED Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LED Group</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LEDGroup
   * @generated
   */
  EClass getLEDGroup();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.LEDGroup#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LEDGroup#getDeviceType()
   * @see #getLEDGroup()
   * @generated
   */
  EAttribute getLEDGroup_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletSegmentDisplay4x7 <em>MBricklet Segment Display4x7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Segment Display4x7</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletSegmentDisplay4x7
   * @generated
   */
  EClass getMBrickletSegmentDisplay4x7();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletSegmentDisplay4x7#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletSegmentDisplay4x7#getDeviceType()
   * @see #getMBrickletSegmentDisplay4x7()
   * @generated
   */
  EAttribute getMBrickletSegmentDisplay4x7_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16 <em>Digital Actor IO16</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Digital Actor IO16</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16
   * @generated
   */
  EClass getDigitalActorIO16();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#getDeviceType()
   * @see #getDigitalActorIO16()
   * @generated
   */
  EAttribute getDigitalActorIO16_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#getPort()
   * @see #getDigitalActorIO16()
   * @generated
   */
  EAttribute getDigitalActorIO16_Port();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#getPin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pin</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#getPin()
   * @see #getDigitalActorIO16()
   * @generated
   */
  EAttribute getDigitalActorIO16_Pin();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#getDefaultState <em>Default State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default State</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#getDefaultState()
   * @see #getDigitalActorIO16()
   * @generated
   */
  EAttribute getDigitalActorIO16_DefaultState();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#isKeepOnReconnect <em>Keep On Reconnect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keep On Reconnect</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#isKeepOnReconnect()
   * @see #getDigitalActorIO16()
   * @generated
   */
  EAttribute getDigitalActorIO16_KeepOnReconnect();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#turnDigital(org.openhab.binding.tinkerforge.internal.types.HighLowValue) <em>Turn Digital</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Turn Digital</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#turnDigital(org.openhab.binding.tinkerforge.internal.types.HighLowValue)
   * @generated
   */
  EOperation getDigitalActorIO16__TurnDigital__HighLowValue();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#fetchDigitalValue() <em>Fetch Digital Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Fetch Digital Value</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO16#fetchDigitalValue()
   * @generated
   */
  EOperation getDigitalActorIO16__FetchDigitalValue();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MActor <em>MActor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MActor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MActor
   * @generated
   */
  EClass getMActor();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.SwitchSensor <em>Switch Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Sensor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.SwitchSensor
   * @generated
   */
  EClass getSwitchSensor();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.SwitchSensor#getSwitchState <em>Switch State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Switch State</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.SwitchSensor#getSwitchState()
   * @see #getSwitchSensor()
   * @generated
   */
  EAttribute getSwitchSensor_SwitchState();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.SwitchSensor#fetchSwitchState() <em>Fetch Switch State</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Fetch Switch State</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.SwitchSensor#fetchSwitchState()
   * @generated
   */
  EOperation getSwitchSensor__FetchSwitchState();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MSwitchActor <em>MSwitch Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MSwitch Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MSwitchActor
   * @generated
   */
  EClass getMSwitchActor();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MSwitchActor#turnSwitch(org.openhab.binding.tinkerforge.internal.types.OnOffValue) <em>Turn Switch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Turn Switch</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MSwitchActor#turnSwitch(org.openhab.binding.tinkerforge.internal.types.OnOffValue)
   * @generated
   */
  EOperation getMSwitchActor__TurnSwitch__OnOffValue();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.ProgrammableSwitchActor <em>Programmable Switch Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Programmable Switch Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ProgrammableSwitchActor
   * @generated
   */
  EClass getProgrammableSwitchActor();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.ProgrammableSwitchActor#turnSwitch(org.openhab.binding.tinkerforge.internal.types.OnOffValue, org.openhab.binding.tinkerforge.internal.config.DeviceOptions) <em>Turn Switch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Turn Switch</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.ProgrammableSwitchActor#turnSwitch(org.openhab.binding.tinkerforge.internal.types.OnOffValue, org.openhab.binding.tinkerforge.internal.config.DeviceOptions)
   * @generated
   */
  EOperation getProgrammableSwitchActor__TurnSwitch__OnOffValue_DeviceOptions();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MInSwitchActor <em>MIn Switch Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MIn Switch Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MInSwitchActor
   * @generated
   */
  EClass getMInSwitchActor();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.GenericDevice <em>Generic Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.GenericDevice
   * @generated
   */
  EClass getGenericDevice();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.GenericDevice#getGenericDeviceId <em>Generic Device Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic Device Id</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.GenericDevice#getGenericDeviceId()
   * @see #getGenericDevice()
   * @generated
   */
  EAttribute getGenericDevice_GenericDeviceId();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFIOActorConfiguration <em>TFIO Actor Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TFIO Actor Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFIOActorConfiguration
   * @generated
   */
  EClass getTFIOActorConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFIOActorConfiguration#getDefaultState <em>Default State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default State</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFIOActorConfiguration#getDefaultState()
   * @see #getTFIOActorConfiguration()
   * @generated
   */
  EAttribute getTFIOActorConfiguration_DefaultState();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFIOActorConfiguration#isKeepOnReconnect <em>Keep On Reconnect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keep On Reconnect</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFIOActorConfiguration#isKeepOnReconnect()
   * @see #getTFIOActorConfiguration()
   * @generated
   */
  EAttribute getTFIOActorConfiguration_KeepOnReconnect();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFInterruptListenerConfiguration <em>TF Interrupt Listener Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Interrupt Listener Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFInterruptListenerConfiguration
   * @generated
   */
  EClass getTFInterruptListenerConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFInterruptListenerConfiguration#getDebouncePeriod <em>Debounce Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debounce Period</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFInterruptListenerConfiguration#getDebouncePeriod()
   * @see #getTFInterruptListenerConfiguration()
   * @generated
   */
  EAttribute getTFInterruptListenerConfiguration_DebouncePeriod();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIO16 <em>MBricklet IO16</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet IO16</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIO16
   * @generated
   */
  EClass getMBrickletIO16();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIO16#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIO16#getDeviceType()
   * @see #getMBrickletIO16()
   * @generated
   */
  EAttribute getMBrickletIO16_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.IODevice <em>IO Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IO Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.IODevice
   * @generated
   */
  EClass getIODevice();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFIOSensorConfiguration <em>TFIO Sensor Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TFIO Sensor Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFIOSensorConfiguration
   * @generated
   */
  EClass getTFIOSensorConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFIOSensorConfiguration#isPullUpResistorEnabled <em>Pull Up Resistor Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pull Up Resistor Enabled</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFIOSensorConfiguration#isPullUpResistorEnabled()
   * @see #getTFIOSensorConfiguration()
   * @generated
   */
  EAttribute getTFIOSensorConfiguration_PullUpResistorEnabled();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DigitalSensor <em>Digital Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Digital Sensor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalSensor
   * @generated
   */
  EClass getDigitalSensor();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalSensor#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalSensor#getDeviceType()
   * @see #getDigitalSensor()
   * @generated
   */
  EAttribute getDigitalSensor_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalSensor#isPullUpResistorEnabled <em>Pull Up Resistor Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pull Up Resistor Enabled</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalSensor#isPullUpResistorEnabled()
   * @see #getDigitalSensor()
   * @generated
   */
  EAttribute getDigitalSensor_PullUpResistorEnabled();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalSensor#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalSensor#getPort()
   * @see #getDigitalSensor()
   * @generated
   */
  EAttribute getDigitalSensor_Port();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalSensor#getPin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pin</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalSensor#getPin()
   * @see #getDigitalSensor()
   * @generated
   */
  EAttribute getDigitalSensor_Pin();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIO4 <em>MBricklet IO4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet IO4</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIO4
   * @generated
   */
  EClass getMBrickletIO4();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIO4#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIO4#getDeviceType()
   * @see #getMBrickletIO4()
   * @generated
   */
  EAttribute getMBrickletIO4_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.IO4Device <em>IO4 Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IO4 Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.IO4Device
   * @generated
   */
  EClass getIO4Device();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DigitalSensorIO4 <em>Digital Sensor IO4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Digital Sensor IO4</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalSensorIO4
   * @generated
   */
  EClass getDigitalSensorIO4();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalSensorIO4#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalSensorIO4#getDeviceType()
   * @see #getDigitalSensorIO4()
   * @generated
   */
  EAttribute getDigitalSensorIO4_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalSensorIO4#isPullUpResistorEnabled <em>Pull Up Resistor Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pull Up Resistor Enabled</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalSensorIO4#isPullUpResistorEnabled()
   * @see #getDigitalSensorIO4()
   * @generated
   */
  EAttribute getDigitalSensorIO4_PullUpResistorEnabled();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalSensorIO4#getPin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pin</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalSensorIO4#getPin()
   * @see #getDigitalSensorIO4()
   * @generated
   */
  EAttribute getDigitalSensorIO4_Pin();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4 <em>Digital Actor IO4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Digital Actor IO4</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4
   * @generated
   */
  EClass getDigitalActorIO4();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#getDeviceType()
   * @see #getDigitalActorIO4()
   * @generated
   */
  EAttribute getDigitalActorIO4_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#getPin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pin</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#getPin()
   * @see #getDigitalActorIO4()
   * @generated
   */
  EAttribute getDigitalActorIO4_Pin();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#getDefaultState <em>Default State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default State</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#getDefaultState()
   * @see #getDigitalActorIO4()
   * @generated
   */
  EAttribute getDigitalActorIO4_DefaultState();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#isKeepOnReconnect <em>Keep On Reconnect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keep On Reconnect</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#isKeepOnReconnect()
   * @see #getDigitalActorIO4()
   * @generated
   */
  EAttribute getDigitalActorIO4_KeepOnReconnect();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#turnDigital(org.openhab.binding.tinkerforge.internal.types.HighLowValue) <em>Turn Digital</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Turn Digital</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#turnDigital(org.openhab.binding.tinkerforge.internal.types.HighLowValue)
   * @generated
   */
  EOperation getDigitalActorIO4__TurnDigital__HighLowValue();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#fetchDigitalValue() <em>Fetch Digital Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Fetch Digital Value</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.DigitalActorIO4#fetchDigitalValue()
   * @generated
   */
  EOperation getDigitalActorIO4__FetchDigitalValue();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMultiTouch <em>MBricklet Multi Touch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Multi Touch</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMultiTouch
   * @generated
   */
  EClass getMBrickletMultiTouch();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMultiTouch#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMultiTouch#getDeviceType()
   * @see #getMBrickletMultiTouch()
   * @generated
   */
  EAttribute getMBrickletMultiTouch_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMultiTouch#getRecalibrate <em>Recalibrate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recalibrate</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMultiTouch#getRecalibrate()
   * @see #getMBrickletMultiTouch()
   * @generated
   */
  EAttribute getMBrickletMultiTouch_Recalibrate();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMultiTouch#getSensitivity <em>Sensitivity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sensitivity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMultiTouch#getSensitivity()
   * @see #getMBrickletMultiTouch()
   * @generated
   */
  EAttribute getMBrickletMultiTouch_Sensitivity();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MultiTouchDevice <em>Multi Touch Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Touch Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MultiTouchDevice
   * @generated
   */
  EClass getMultiTouchDevice();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MultiTouchDevice#getPin <em>Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pin</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MultiTouchDevice#getPin()
   * @see #getMultiTouchDevice()
   * @generated
   */
  EAttribute getMultiTouchDevice_Pin();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MultiTouchDevice#getDisableElectrode <em>Disable Electrode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Disable Electrode</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MultiTouchDevice#getDisableElectrode()
   * @see #getMultiTouchDevice()
   * @generated
   */
  EAttribute getMultiTouchDevice_DisableElectrode();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.Electrode <em>Electrode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Electrode</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Electrode
   * @generated
   */
  EClass getElectrode();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.Electrode#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Electrode#getDeviceType()
   * @see #getElectrode()
   * @generated
   */
  EAttribute getElectrode_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.Proximity <em>Proximity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proximity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Proximity
   * @generated
   */
  EClass getProximity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.Proximity#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Proximity#getDeviceType()
   * @see #getProximity()
   * @generated
   */
  EAttribute getProximity_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMotionDetector <em>MBricklet Motion Detector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Motion Detector</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMotionDetector
   * @generated
   */
  EClass getMBrickletMotionDetector();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMotionDetector#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMotionDetector#getDeviceType()
   * @see #getMBrickletMotionDetector()
   * @generated
   */
  EAttribute getMBrickletMotionDetector_DeviceType();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMotionDetector#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMotionDetector#init()
   * @generated
   */
  EOperation getMBrickletMotionDetector__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletHallEffect <em>MBricklet Hall Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Hall Effect</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletHallEffect
   * @generated
   */
  EClass getMBrickletHallEffect();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletHallEffect#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletHallEffect#getDeviceType()
   * @see #getMBrickletHallEffect()
   * @generated
   */
  EAttribute getMBrickletHallEffect_DeviceType();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletHallEffect#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletHallEffect#init()
   * @generated
   */
  EOperation getMBrickletHallEffect__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MSubDevice <em>MSub Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MSub Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MSubDevice
   * @generated
   */
  EClass getMSubDevice();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MSubDevice#getSubId <em>Sub Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sub Id</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MSubDevice#getSubId()
   * @see #getMSubDevice()
   * @generated
   */
  EAttribute getMSubDevice_SubId();

  /**
   * Returns the meta object for the container reference '{@link org.openhab.binding.tinkerforge.internal.model.MSubDevice#getMbrick <em>Mbrick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Mbrick</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MSubDevice#getMbrick()
   * @see #getMSubDevice()
   * @generated
   */
  EReference getMSubDevice_Mbrick();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MDualRelay <em>MDual Relay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MDual Relay</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDualRelay
   * @generated
   */
  EClass getMDualRelay();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MDualRelay#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MDualRelay#getDeviceType()
   * @see #getMDualRelay()
   * @generated
   */
  EAttribute getMDualRelay_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch <em>MBricklet Remote Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Remote Switch</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch
   * @generated
   */
  EClass getMBrickletRemoteSwitch();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch#getDeviceType()
   * @see #getMBrickletRemoteSwitch()
   * @generated
   */
  EAttribute getMBrickletRemoteSwitch_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch#getTypeADevices <em>Type ADevices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type ADevices</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch#getTypeADevices()
   * @see #getMBrickletRemoteSwitch()
   * @generated
   */
  EAttribute getMBrickletRemoteSwitch_TypeADevices();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch#getTypeBDevices <em>Type BDevices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type BDevices</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch#getTypeBDevices()
   * @see #getMBrickletRemoteSwitch()
   * @generated
   */
  EAttribute getMBrickletRemoteSwitch_TypeBDevices();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch#getTypeCDevices <em>Type CDevices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type CDevices</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletRemoteSwitch#getTypeCDevices()
   * @see #getMBrickletRemoteSwitch()
   * @generated
   */
  EAttribute getMBrickletRemoteSwitch_TypeCDevices();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitch <em>Remote Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remote Switch</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitch
   * @generated
   */
  EClass getRemoteSwitch();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA <em>Remote Switch A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remote Switch A</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA
   * @generated
   */
  EClass getRemoteSwitchA();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA#getDeviceType()
   * @see #getRemoteSwitchA()
   * @generated
   */
  EAttribute getRemoteSwitchA_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA#getHouseCode <em>House Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>House Code</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA#getHouseCode()
   * @see #getRemoteSwitchA()
   * @generated
   */
  EAttribute getRemoteSwitchA_HouseCode();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA#getReceiverCode <em>Receiver Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Receiver Code</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA#getReceiverCode()
   * @see #getRemoteSwitchA()
   * @generated
   */
  EAttribute getRemoteSwitchA_ReceiverCode();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA#getRepeats <em>Repeats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeats</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchA#getRepeats()
   * @see #getRemoteSwitchA()
   * @generated
   */
  EAttribute getRemoteSwitchA_Repeats();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB <em>Remote Switch B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remote Switch B</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB
   * @generated
   */
  EClass getRemoteSwitchB();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB#getDeviceType()
   * @see #getRemoteSwitchB()
   * @generated
   */
  EAttribute getRemoteSwitchB_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB#getAddress()
   * @see #getRemoteSwitchB()
   * @generated
   */
  EAttribute getRemoteSwitchB_Address();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB#getUnit()
   * @see #getRemoteSwitchB()
   * @generated
   */
  EAttribute getRemoteSwitchB_Unit();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB#getRepeats <em>Repeats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeats</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB#getRepeats()
   * @see #getRemoteSwitchB()
   * @generated
   */
  EAttribute getRemoteSwitchB_Repeats();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB#getTargetDimmvalue <em>Target Dimmvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Dimmvalue</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchB#getTargetDimmvalue()
   * @see #getRemoteSwitchB()
   * @generated
   */
  EAttribute getRemoteSwitchB_TargetDimmvalue();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC <em>Remote Switch C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remote Switch C</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC
   * @generated
   */
  EClass getRemoteSwitchC();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC#getDeviceType()
   * @see #getRemoteSwitchC()
   * @generated
   */
  EAttribute getRemoteSwitchC_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC#getSystemCode <em>System Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>System Code</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC#getSystemCode()
   * @see #getRemoteSwitchC()
   * @generated
   */
  EAttribute getRemoteSwitchC_SystemCode();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC#getDeviceCode <em>Device Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Code</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC#getDeviceCode()
   * @see #getRemoteSwitchC()
   * @generated
   */
  EAttribute getRemoteSwitchC_DeviceCode();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC#getRepeats <em>Repeats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeats</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchC#getRepeats()
   * @see #getRemoteSwitchC()
   * @generated
   */
  EAttribute getRemoteSwitchC_Repeats();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFNullConfiguration <em>TF Null Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Null Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFNullConfiguration
   * @generated
   */
  EClass getTFNullConfiguration();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFPTCBrickletConfiguration <em>TFPTC Bricklet Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TFPTC Bricklet Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFPTCBrickletConfiguration
   * @generated
   */
  EClass getTFPTCBrickletConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFPTCBrickletConfiguration#getNoiseRejectionFilter <em>Noise Rejection Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Noise Rejection Filter</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFPTCBrickletConfiguration#getNoiseRejectionFilter()
   * @see #getTFPTCBrickletConfiguration()
   * @generated
   */
  EAttribute getTFPTCBrickletConfiguration_NoiseRejectionFilter();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFPTCBrickletConfiguration#getWireMode <em>Wire Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wire Mode</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFPTCBrickletConfiguration#getWireMode()
   * @see #getTFPTCBrickletConfiguration()
   * @generated
   */
  EAttribute getTFPTCBrickletConfiguration_WireMode();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFIndustrialDual020mAConfiguration <em>TF Industrial Dual020m AConfiguration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Industrial Dual020m AConfiguration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFIndustrialDual020mAConfiguration
   * @generated
   */
  EClass getTFIndustrialDual020mAConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFIndustrialDual020mAConfiguration#getSampleRate <em>Sample Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sample Rate</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFIndustrialDual020mAConfiguration#getSampleRate()
   * @see #getTFIndustrialDual020mAConfiguration()
   * @generated
   */
  EAttribute getTFIndustrialDual020mAConfiguration_SampleRate();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration <em>TF Servo Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Servo Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration
   * @generated
   */
  EClass getTFServoConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getVelocity <em>Velocity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Velocity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getVelocity()
   * @see #getTFServoConfiguration()
   * @generated
   */
  EAttribute getTFServoConfiguration_Velocity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getAcceleration <em>Acceleration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acceleration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getAcceleration()
   * @see #getTFServoConfiguration()
   * @generated
   */
  EAttribute getTFServoConfiguration_Acceleration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getServoVoltage <em>Servo Voltage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Servo Voltage</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getServoVoltage()
   * @see #getTFServoConfiguration()
   * @generated
   */
  EAttribute getTFServoConfiguration_ServoVoltage();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getPulseWidthMin <em>Pulse Width Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pulse Width Min</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getPulseWidthMin()
   * @see #getTFServoConfiguration()
   * @generated
   */
  EAttribute getTFServoConfiguration_PulseWidthMin();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getPulseWidthMax <em>Pulse Width Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pulse Width Max</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getPulseWidthMax()
   * @see #getTFServoConfiguration()
   * @generated
   */
  EAttribute getTFServoConfiguration_PulseWidthMax();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Period</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getPeriod()
   * @see #getTFServoConfiguration()
   * @generated
   */
  EAttribute getTFServoConfiguration_Period();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getOutputVoltage <em>Output Voltage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output Voltage</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFServoConfiguration#getOutputVoltage()
   * @see #getTFServoConfiguration()
   * @generated
   */
  EAttribute getTFServoConfiguration_OutputVoltage();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.BrickletRemoteSwitchConfiguration <em>Bricklet Remote Switch Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bricklet Remote Switch Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.BrickletRemoteSwitchConfiguration
   * @generated
   */
  EClass getBrickletRemoteSwitchConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.BrickletRemoteSwitchConfiguration#getTypeADevices <em>Type ADevices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type ADevices</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.BrickletRemoteSwitchConfiguration#getTypeADevices()
   * @see #getBrickletRemoteSwitchConfiguration()
   * @generated
   */
  EAttribute getBrickletRemoteSwitchConfiguration_TypeADevices();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.BrickletRemoteSwitchConfiguration#getTypeBDevices <em>Type BDevices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type BDevices</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.BrickletRemoteSwitchConfiguration#getTypeBDevices()
   * @see #getBrickletRemoteSwitchConfiguration()
   * @generated
   */
  EAttribute getBrickletRemoteSwitchConfiguration_TypeBDevices();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.BrickletRemoteSwitchConfiguration#getTypeCDevices <em>Type CDevices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type CDevices</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.BrickletRemoteSwitchConfiguration#getTypeCDevices()
   * @see #getBrickletRemoteSwitchConfiguration()
   * @generated
   */
  EAttribute getBrickletRemoteSwitchConfiguration_TypeCDevices();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchAConfiguration <em>Remote Switch AConfiguration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remote Switch AConfiguration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchAConfiguration
   * @generated
   */
  EClass getRemoteSwitchAConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchAConfiguration#getHouseCode <em>House Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>House Code</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchAConfiguration#getHouseCode()
   * @see #getRemoteSwitchAConfiguration()
   * @generated
   */
  EAttribute getRemoteSwitchAConfiguration_HouseCode();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchAConfiguration#getReceiverCode <em>Receiver Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Receiver Code</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchAConfiguration#getReceiverCode()
   * @see #getRemoteSwitchAConfiguration()
   * @generated
   */
  EAttribute getRemoteSwitchAConfiguration_ReceiverCode();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchAConfiguration#getRepeats <em>Repeats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeats</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchAConfiguration#getRepeats()
   * @see #getRemoteSwitchAConfiguration()
   * @generated
   */
  EAttribute getRemoteSwitchAConfiguration_Repeats();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchBConfiguration <em>Remote Switch BConfiguration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remote Switch BConfiguration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchBConfiguration
   * @generated
   */
  EClass getRemoteSwitchBConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchBConfiguration#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchBConfiguration#getAddress()
   * @see #getRemoteSwitchBConfiguration()
   * @generated
   */
  EAttribute getRemoteSwitchBConfiguration_Address();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchBConfiguration#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchBConfiguration#getUnit()
   * @see #getRemoteSwitchBConfiguration()
   * @generated
   */
  EAttribute getRemoteSwitchBConfiguration_Unit();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchBConfiguration#getRepeats <em>Repeats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeats</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchBConfiguration#getRepeats()
   * @see #getRemoteSwitchBConfiguration()
   * @generated
   */
  EAttribute getRemoteSwitchBConfiguration_Repeats();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchCConfiguration <em>Remote Switch CConfiguration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remote Switch CConfiguration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchCConfiguration
   * @generated
   */
  EClass getRemoteSwitchCConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchCConfiguration#getSystemCode <em>System Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>System Code</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchCConfiguration#getSystemCode()
   * @see #getRemoteSwitchCConfiguration()
   * @generated
   */
  EAttribute getRemoteSwitchCConfiguration_SystemCode();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchCConfiguration#getDeviceCode <em>Device Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Code</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchCConfiguration#getDeviceCode()
   * @see #getRemoteSwitchCConfiguration()
   * @generated
   */
  EAttribute getRemoteSwitchCConfiguration_DeviceCode();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitchCConfiguration#getRepeats <em>Repeats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeats</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitchCConfiguration#getRepeats()
   * @see #getRemoteSwitchCConfiguration()
   * @generated
   */
  EAttribute getRemoteSwitchCConfiguration_Repeats();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MultiTouchDeviceConfiguration <em>Multi Touch Device Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Touch Device Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MultiTouchDeviceConfiguration
   * @generated
   */
  EClass getMultiTouchDeviceConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MultiTouchDeviceConfiguration#getDisableElectrode <em>Disable Electrode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Disable Electrode</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MultiTouchDeviceConfiguration#getDisableElectrode()
   * @see #getMultiTouchDeviceConfiguration()
   * @generated
   */
  EAttribute getMultiTouchDeviceConfiguration_DisableElectrode();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.BrickletMultiTouchConfiguration <em>Bricklet Multi Touch Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bricklet Multi Touch Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.BrickletMultiTouchConfiguration
   * @generated
   */
  EClass getBrickletMultiTouchConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.BrickletMultiTouchConfiguration#getRecalibrate <em>Recalibrate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recalibrate</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.BrickletMultiTouchConfiguration#getRecalibrate()
   * @see #getBrickletMultiTouchConfiguration()
   * @generated
   */
  EAttribute getBrickletMultiTouchConfiguration_Recalibrate();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.BrickletMultiTouchConfiguration#getSensitivity <em>Sensitivity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sensitivity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.BrickletMultiTouchConfiguration#getSensitivity()
   * @see #getBrickletMultiTouchConfiguration()
   * @generated
   */
  EAttribute getBrickletMultiTouchConfiguration_Sensitivity();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DimmableConfiguration <em>Dimmable Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimmable Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DimmableConfiguration
   * @generated
   */
  EClass getDimmableConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DimmableConfiguration#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DimmableConfiguration#getMinValue()
   * @see #getDimmableConfiguration()
   * @generated
   */
  EAttribute getDimmableConfiguration_MinValue();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DimmableConfiguration#getMaxValue <em>Max Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DimmableConfiguration#getMaxValue()
   * @see #getDimmableConfiguration()
   * @generated
   */
  EAttribute getDimmableConfiguration_MaxValue();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.ButtonConfiguration <em>Button Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ButtonConfiguration
   * @generated
   */
  EClass getButtonConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.ButtonConfiguration#isTactile <em>Tactile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tactile</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ButtonConfiguration#isTactile()
   * @see #getButtonConfiguration()
   * @generated
   */
  EAttribute getButtonConfiguration_Tactile();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonLEDConfiguration <em>Dual Button LED Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dual Button LED Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonLEDConfiguration
   * @generated
   */
  EClass getDualButtonLEDConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonLEDConfiguration#isAutotoggle <em>Autotoggle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Autotoggle</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonLEDConfiguration#isAutotoggle()
   * @see #getDualButtonLEDConfiguration()
   * @generated
   */
  EAttribute getDualButtonLEDConfiguration_Autotoggle();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration <em>LED Strip Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LED Strip Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration
   * @generated
   */
  EClass getLEDStripConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration#getChiptype <em>Chiptype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chiptype</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration#getChiptype()
   * @see #getLEDStripConfiguration()
   * @generated
   */
  EAttribute getLEDStripConfiguration_Chiptype();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration#getFrameduration <em>Frameduration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Frameduration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration#getFrameduration()
   * @see #getLEDStripConfiguration()
   * @generated
   */
  EAttribute getLEDStripConfiguration_Frameduration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration#getClockfrequency <em>Clockfrequency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clockfrequency</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration#getClockfrequency()
   * @see #getLEDStripConfiguration()
   * @generated
   */
  EAttribute getLEDStripConfiguration_Clockfrequency();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration#getColorMapping <em>Color Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color Mapping</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration#getColorMapping()
   * @see #getLEDStripConfiguration()
   * @generated
   */
  EAttribute getLEDStripConfiguration_ColorMapping();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration#getSubDevices <em>Sub Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sub Devices</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LEDStripConfiguration#getSubDevices()
   * @see #getLEDStripConfiguration()
   * @generated
   */
  EAttribute getLEDStripConfiguration_SubDevices();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.LEDGroupConfiguration <em>LED Group Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LED Group Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LEDGroupConfiguration
   * @generated
   */
  EClass getLEDGroupConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.LEDGroupConfiguration#getLeds <em>Leds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Leds</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LEDGroupConfiguration#getLeds()
   * @see #getLEDGroupConfiguration()
   * @generated
   */
  EAttribute getLEDGroupConfiguration_Leds();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MServo <em>MServo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MServo</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo
   * @generated
   */
  EClass getMServo();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MServo#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#getDeviceType()
   * @see #getMServo()
   * @generated
   */
  EAttribute getMServo_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MServo#getVelocity <em>Velocity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Velocity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#getVelocity()
   * @see #getMServo()
   * @generated
   */
  EAttribute getMServo_Velocity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MServo#getAcceleration <em>Acceleration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acceleration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#getAcceleration()
   * @see #getMServo()
   * @generated
   */
  EAttribute getMServo_Acceleration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MServo#getMaxPosition <em>Max Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Position</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#getMaxPosition()
   * @see #getMServo()
   * @generated
   */
  EAttribute getMServo_MaxPosition();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MServo#getMinPosition <em>Min Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Position</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#getMinPosition()
   * @see #getMServo()
   * @generated
   */
  EAttribute getMServo_MinPosition();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MServo#getPulseWidthMin <em>Pulse Width Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pulse Width Min</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#getPulseWidthMin()
   * @see #getMServo()
   * @generated
   */
  EAttribute getMServo_PulseWidthMin();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MServo#getPulseWidthMax <em>Pulse Width Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pulse Width Max</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#getPulseWidthMax()
   * @see #getMServo()
   * @generated
   */
  EAttribute getMServo_PulseWidthMax();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MServo#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Period</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#getPeriod()
   * @see #getMServo()
   * @generated
   */
  EAttribute getMServo_Period();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MServo#getOutputVoltage <em>Output Voltage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output Voltage</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#getOutputVoltage()
   * @see #getMServo()
   * @generated
   */
  EAttribute getMServo_OutputVoltage();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MServo#getTargetPosition <em>Target Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Position</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#getTargetPosition()
   * @see #getMServo()
   * @generated
   */
  EAttribute getMServo_TargetPosition();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MServo#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#init()
   * @generated
   */
  EOperation getMServo__Init();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MServo#setPoint(java.lang.Short, int, int) <em>Set Point</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Point</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MServo#setPoint(java.lang.Short, int, int)
   * @generated
   */
  EOperation getMServo__SetPoint__Short_int_int();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.CallbackListener <em>Callback Listener</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callback Listener</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.CallbackListener
   * @generated
   */
  EClass getCallbackListener();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.CallbackListener#getCallbackPeriod <em>Callback Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Callback Period</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.CallbackListener#getCallbackPeriod()
   * @see #getCallbackListener()
   * @generated
   */
  EAttribute getCallbackListener_CallbackPeriod();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.InterruptListener <em>Interrupt Listener</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interrupt Listener</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.InterruptListener
   * @generated
   */
  EClass getInterruptListener();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.InterruptListener#getDebouncePeriod <em>Debounce Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debounce Period</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.InterruptListener#getDebouncePeriod()
   * @see #getInterruptListener()
   * @generated
   */
  EAttribute getInterruptListener_DebouncePeriod();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MSensor <em>MSensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MSensor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MSensor
   * @generated
   */
  EClass getMSensor();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MSensor#getSensorValue <em>Sensor Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sensor Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MSensor#getSensorValue()
   * @see #getMSensor()
   * @generated
   */
  EAttribute getMSensor_SensorValue();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MSensor#fetchSensorValue() <em>Fetch Sensor Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Fetch Sensor Value</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MSensor#fetchSensorValue()
   * @generated
   */
  EOperation getMSensor__FetchSensorValue();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletHumidity <em>MBricklet Humidity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Humidity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletHumidity
   * @generated
   */
  EClass getMBrickletHumidity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletHumidity#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletHumidity#getDeviceType()
   * @see #getMBrickletHumidity()
   * @generated
   */
  EAttribute getMBrickletHumidity_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletHumidity#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletHumidity#getThreshold()
   * @see #getMBrickletHumidity()
   * @generated
   */
  EAttribute getMBrickletHumidity_Threshold();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletHumidity#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletHumidity#init()
   * @generated
   */
  EOperation getMBrickletHumidity__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceIR <em>MBricklet Distance IR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Distance IR</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceIR
   * @generated
   */
  EClass getMBrickletDistanceIR();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceIR#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceIR#getDeviceType()
   * @see #getMBrickletDistanceIR()
   * @generated
   */
  EAttribute getMBrickletDistanceIR_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceIR#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceIR#getThreshold()
   * @see #getMBrickletDistanceIR()
   * @generated
   */
  EAttribute getMBrickletDistanceIR_Threshold();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceIR#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceIR#init()
   * @generated
   */
  EOperation getMBrickletDistanceIR__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletSolidStateRelay <em>MBricklet Solid State Relay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Solid State Relay</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletSolidStateRelay
   * @generated
   */
  EClass getMBrickletSolidStateRelay();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletSolidStateRelay#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletSolidStateRelay#getDeviceType()
   * @see #getMBrickletSolidStateRelay()
   * @generated
   */
  EAttribute getMBrickletSolidStateRelay_DeviceType();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletSolidStateRelay#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletSolidStateRelay#init()
   * @generated
   */
  EOperation getMBrickletSolidStateRelay__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDual020mA <em>MBricklet Industrial Dual020m A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Industrial Dual020m A</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDual020mA
   * @generated
   */
  EClass getMBrickletIndustrialDual020mA();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDual020mA#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDual020mA#getDeviceType()
   * @see #getMBrickletIndustrialDual020mA()
   * @generated
   */
  EAttribute getMBrickletIndustrialDual020mA_DeviceType();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDual020mA#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletIndustrialDual020mA#init()
   * @generated
   */
  EOperation getMBrickletIndustrialDual020mA__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.Dual020mADevice <em>Dual020m ADevice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dual020m ADevice</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Dual020mADevice
   * @generated
   */
  EClass getDual020mADevice();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.Dual020mADevice#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Dual020mADevice#getDeviceType()
   * @see #getDual020mADevice()
   * @generated
   */
  EAttribute getDual020mADevice_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.Dual020mADevice#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Dual020mADevice#getThreshold()
   * @see #getDual020mADevice()
   * @generated
   */
  EAttribute getDual020mADevice_Threshold();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.Dual020mADevice#getSensorNum <em>Sensor Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sensor Num</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.Dual020mADevice#getSensorNum()
   * @see #getDual020mADevice()
   * @generated
   */
  EAttribute getDual020mADevice_SensorNum();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletPTC <em>MBricklet PTC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet PTC</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletPTC
   * @generated
   */
  EClass getMBrickletPTC();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletPTC#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletPTC#getDeviceType()
   * @see #getMBrickletPTC()
   * @generated
   */
  EAttribute getMBrickletPTC_DeviceType();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletPTC#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletPTC#init()
   * @generated
   */
  EOperation getMBrickletPTC__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.PTCDevice <em>PTC Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PTC Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.PTCDevice
   * @generated
   */
  EClass getPTCDevice();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.PTCTemperature <em>PTC Temperature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PTC Temperature</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.PTCTemperature
   * @generated
   */
  EClass getPTCTemperature();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.PTCTemperature#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.PTCTemperature#getDeviceType()
   * @see #getPTCTemperature()
   * @generated
   */
  EAttribute getPTCTemperature_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.PTCTemperature#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.PTCTemperature#getThreshold()
   * @see #getPTCTemperature()
   * @generated
   */
  EAttribute getPTCTemperature_Threshold();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.PTCResistance <em>PTC Resistance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PTC Resistance</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.PTCResistance
   * @generated
   */
  EClass getPTCResistance();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.PTCResistance#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.PTCResistance#getDeviceType()
   * @see #getPTCResistance()
   * @generated
   */
  EAttribute getPTCResistance_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.PTCResistance#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.PTCResistance#getThreshold()
   * @see #getPTCResistance()
   * @generated
   */
  EAttribute getPTCResistance_Threshold();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.PTCConnected <em>PTC Connected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PTC Connected</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.PTCConnected
   * @generated
   */
  EClass getPTCConnected();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.PTCConnected#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.PTCConnected#getDeviceType()
   * @see #getPTCConnected()
   * @generated
   */
  EAttribute getPTCConnected_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletTemperature <em>MBricklet Temperature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Temperature</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletTemperature
   * @generated
   */
  EClass getMBrickletTemperature();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletTemperature#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletTemperature#getDeviceType()
   * @see #getMBrickletTemperature()
   * @generated
   */
  EAttribute getMBrickletTemperature_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletTemperature#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletTemperature#getThreshold()
   * @see #getMBrickletTemperature()
   * @generated
   */
  EAttribute getMBrickletTemperature_Threshold();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletTemperature#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletTemperature#init()
   * @generated
   */
  EOperation getMBrickletTemperature__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletTemperatureIR <em>MBricklet Temperature IR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Temperature IR</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletTemperatureIR
   * @generated
   */
  EClass getMBrickletTemperatureIR();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletTemperatureIR#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletTemperatureIR#getDeviceType()
   * @see #getMBrickletTemperatureIR()
   * @generated
   */
  EAttribute getMBrickletTemperatureIR_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice <em>MTemperature IR Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MTemperature IR Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice
   * @generated
   */
  EClass getMTemperatureIRDevice();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice#getThreshold()
   * @see #getMTemperatureIRDevice()
   * @generated
   */
  EAttribute getMTemperatureIRDevice_Threshold();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.ObjectTemperature <em>Object Temperature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Temperature</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ObjectTemperature
   * @generated
   */
  EClass getObjectTemperature();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.ObjectTemperature#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ObjectTemperature#getDeviceType()
   * @see #getObjectTemperature()
   * @generated
   */
  EAttribute getObjectTemperature_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.ObjectTemperature#getEmissivity <em>Emissivity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Emissivity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ObjectTemperature#getEmissivity()
   * @see #getObjectTemperature()
   * @generated
   */
  EAttribute getObjectTemperature_Emissivity();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.AmbientTemperature <em>Ambient Temperature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ambient Temperature</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.AmbientTemperature
   * @generated
   */
  EClass getAmbientTemperature();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.AmbientTemperature#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.AmbientTemperature#getDeviceType()
   * @see #getAmbientTemperature()
   * @generated
   */
  EAttribute getAmbientTemperature_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletTilt <em>MBricklet Tilt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Tilt</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletTilt
   * @generated
   */
  EClass getMBrickletTilt();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletTilt#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletTilt#getDeviceType()
   * @see #getMBrickletTilt()
   * @generated
   */
  EAttribute getMBrickletTilt_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletVoltageCurrent <em>MBricklet Voltage Current</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Voltage Current</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletVoltageCurrent
   * @generated
   */
  EClass getMBrickletVoltageCurrent();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletVoltageCurrent#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletVoltageCurrent#getDeviceType()
   * @see #getMBrickletVoltageCurrent()
   * @generated
   */
  EAttribute getMBrickletVoltageCurrent_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletVoltageCurrent#getAveraging <em>Averaging</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Averaging</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletVoltageCurrent#getAveraging()
   * @see #getMBrickletVoltageCurrent()
   * @generated
   */
  EAttribute getMBrickletVoltageCurrent_Averaging();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletVoltageCurrent#getVoltageConversionTime <em>Voltage Conversion Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Voltage Conversion Time</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletVoltageCurrent#getVoltageConversionTime()
   * @see #getMBrickletVoltageCurrent()
   * @generated
   */
  EAttribute getMBrickletVoltageCurrent_VoltageConversionTime();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletVoltageCurrent#getCurrentConversionTime <em>Current Conversion Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Current Conversion Time</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletVoltageCurrent#getCurrentConversionTime()
   * @see #getMBrickletVoltageCurrent()
   * @generated
   */
  EAttribute getMBrickletVoltageCurrent_CurrentConversionTime();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.VoltageCurrentDevice <em>Voltage Current Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Voltage Current Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VoltageCurrentDevice
   * @generated
   */
  EClass getVoltageCurrentDevice();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.VCDeviceVoltage <em>VC Device Voltage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VC Device Voltage</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VCDeviceVoltage
   * @generated
   */
  EClass getVCDeviceVoltage();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.VCDeviceVoltage#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VCDeviceVoltage#getDeviceType()
   * @see #getVCDeviceVoltage()
   * @generated
   */
  EAttribute getVCDeviceVoltage_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.VCDeviceVoltage#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VCDeviceVoltage#getThreshold()
   * @see #getVCDeviceVoltage()
   * @generated
   */
  EAttribute getVCDeviceVoltage_Threshold();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.VCDeviceCurrent <em>VC Device Current</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VC Device Current</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VCDeviceCurrent
   * @generated
   */
  EClass getVCDeviceCurrent();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.VCDeviceCurrent#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VCDeviceCurrent#getDeviceType()
   * @see #getVCDeviceCurrent()
   * @generated
   */
  EAttribute getVCDeviceCurrent_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.VCDeviceCurrent#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VCDeviceCurrent#getThreshold()
   * @see #getVCDeviceCurrent()
   * @generated
   */
  EAttribute getVCDeviceCurrent_Threshold();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.VCDevicePower <em>VC Device Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VC Device Power</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VCDevicePower
   * @generated
   */
  EClass getVCDevicePower();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.VCDevicePower#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VCDevicePower#getDeviceType()
   * @see #getVCDevicePower()
   * @generated
   */
  EAttribute getVCDevicePower_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.VCDevicePower#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VCDevicePower#getThreshold()
   * @see #getVCDevicePower()
   * @generated
   */
  EAttribute getVCDevicePower_Threshold();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFBaseConfiguration <em>TF Base Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Base Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFBaseConfiguration
   * @generated
   */
  EClass getTFBaseConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFBaseConfiguration#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFBaseConfiguration#getThreshold()
   * @see #getTFBaseConfiguration()
   * @generated
   */
  EAttribute getTFBaseConfiguration_Threshold();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFBaseConfiguration#getCallbackPeriod <em>Callback Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Callback Period</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFBaseConfiguration#getCallbackPeriod()
   * @see #getTFBaseConfiguration()
   * @generated
   */
  EAttribute getTFBaseConfiguration_CallbackPeriod();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFObjectTemperatureConfiguration <em>TF Object Temperature Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Object Temperature Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFObjectTemperatureConfiguration
   * @generated
   */
  EClass getTFObjectTemperatureConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFObjectTemperatureConfiguration#getEmissivity <em>Emissivity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Emissivity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFObjectTemperatureConfiguration#getEmissivity()
   * @see #getTFObjectTemperatureConfiguration()
   * @generated
   */
  EAttribute getTFObjectTemperatureConfiguration_Emissivity();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFMoistureBrickletConfiguration <em>TF Moisture Bricklet Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Moisture Bricklet Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFMoistureBrickletConfiguration
   * @generated
   */
  EClass getTFMoistureBrickletConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFMoistureBrickletConfiguration#getMovingAverage <em>Moving Average</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Moving Average</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFMoistureBrickletConfiguration#getMovingAverage()
   * @see #getTFMoistureBrickletConfiguration()
   * @generated
   */
  EAttribute getTFMoistureBrickletConfiguration_MovingAverage();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFDistanceUSBrickletConfiguration <em>TF Distance US Bricklet Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Distance US Bricklet Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFDistanceUSBrickletConfiguration
   * @generated
   */
  EClass getTFDistanceUSBrickletConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFDistanceUSBrickletConfiguration#getMovingAverage <em>Moving Average</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Moving Average</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFDistanceUSBrickletConfiguration#getMovingAverage()
   * @see #getTFDistanceUSBrickletConfiguration()
   * @generated
   */
  EAttribute getTFDistanceUSBrickletConfiguration_MovingAverage();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.TFVoltageCurrentConfiguration <em>TF Voltage Current Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TF Voltage Current Configuration</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFVoltageCurrentConfiguration
   * @generated
   */
  EClass getTFVoltageCurrentConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFVoltageCurrentConfiguration#getAveraging <em>Averaging</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Averaging</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFVoltageCurrentConfiguration#getAveraging()
   * @see #getTFVoltageCurrentConfiguration()
   * @generated
   */
  EAttribute getTFVoltageCurrentConfiguration_Averaging();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFVoltageCurrentConfiguration#getVoltageConversionTime <em>Voltage Conversion Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Voltage Conversion Time</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFVoltageCurrentConfiguration#getVoltageConversionTime()
   * @see #getTFVoltageCurrentConfiguration()
   * @generated
   */
  EAttribute getTFVoltageCurrentConfiguration_VoltageConversionTime();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.TFVoltageCurrentConfiguration#getCurrentConversionTime <em>Current Conversion Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Current Conversion Time</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TFVoltageCurrentConfiguration#getCurrentConversionTime()
   * @see #getTFVoltageCurrentConfiguration()
   * @generated
   */
  EAttribute getTFVoltageCurrentConfiguration_CurrentConversionTime();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletBarometer <em>MBricklet Barometer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Barometer</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletBarometer
   * @generated
   */
  EClass getMBrickletBarometer();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletBarometer#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletBarometer#getDeviceType()
   * @see #getMBrickletBarometer()
   * @generated
   */
  EAttribute getMBrickletBarometer_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletBarometer#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletBarometer#getThreshold()
   * @see #getMBrickletBarometer()
   * @generated
   */
  EAttribute getMBrickletBarometer_Threshold();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletBarometer#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletBarometer#init()
   * @generated
   */
  EOperation getMBrickletBarometer__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBarometerTemperature <em>MBarometer Temperature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBarometer Temperature</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBarometerTemperature
   * @generated
   */
  EClass getMBarometerTemperature();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBarometerTemperature#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBarometerTemperature#getDeviceType()
   * @see #getMBarometerTemperature()
   * @generated
   */
  EAttribute getMBarometerTemperature_DeviceType();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBarometerTemperature#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBarometerTemperature#init()
   * @generated
   */
  EOperation getMBarometerTemperature__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletAmbientLight <em>MBricklet Ambient Light</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Ambient Light</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletAmbientLight
   * @generated
   */
  EClass getMBrickletAmbientLight();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletAmbientLight#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletAmbientLight#getDeviceType()
   * @see #getMBrickletAmbientLight()
   * @generated
   */
  EAttribute getMBrickletAmbientLight_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletAmbientLight#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletAmbientLight#getThreshold()
   * @see #getMBrickletAmbientLight()
   * @generated
   */
  EAttribute getMBrickletAmbientLight_Threshold();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletAmbientLight#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletAmbientLight#init()
   * @generated
   */
  EOperation getMBrickletAmbientLight__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletSoundIntensity <em>MBricklet Sound Intensity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Sound Intensity</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletSoundIntensity
   * @generated
   */
  EClass getMBrickletSoundIntensity();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletSoundIntensity#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletSoundIntensity#getDeviceType()
   * @see #getMBrickletSoundIntensity()
   * @generated
   */
  EAttribute getMBrickletSoundIntensity_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletSoundIntensity#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletSoundIntensity#getThreshold()
   * @see #getMBrickletSoundIntensity()
   * @generated
   */
  EAttribute getMBrickletSoundIntensity_Threshold();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletSoundIntensity#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletSoundIntensity#init()
   * @generated
   */
  EOperation getMBrickletSoundIntensity__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMoisture <em>MBricklet Moisture</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Moisture</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMoisture
   * @generated
   */
  EClass getMBrickletMoisture();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMoisture#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMoisture#getDeviceType()
   * @see #getMBrickletMoisture()
   * @generated
   */
  EAttribute getMBrickletMoisture_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMoisture#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMoisture#getThreshold()
   * @see #getMBrickletMoisture()
   * @generated
   */
  EAttribute getMBrickletMoisture_Threshold();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMoisture#getMovingAverage <em>Moving Average</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Moving Average</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMoisture#getMovingAverage()
   * @see #getMBrickletMoisture()
   * @generated
   */
  EAttribute getMBrickletMoisture_MovingAverage();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletMoisture#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletMoisture#init()
   * @generated
   */
  EOperation getMBrickletMoisture__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceUS <em>MBricklet Distance US</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet Distance US</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceUS
   * @generated
   */
  EClass getMBrickletDistanceUS();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceUS#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceUS#getDeviceType()
   * @see #getMBrickletDistanceUS()
   * @generated
   */
  EAttribute getMBrickletDistanceUS_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceUS#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceUS#getThreshold()
   * @see #getMBrickletDistanceUS()
   * @generated
   */
  EAttribute getMBrickletDistanceUS_Threshold();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceUS#getMovingAverage <em>Moving Average</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Moving Average</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceUS#getMovingAverage()
   * @see #getMBrickletDistanceUS()
   * @generated
   */
  EAttribute getMBrickletDistanceUS_MovingAverage();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceUS#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletDistanceUS#init()
   * @generated
   */
  EOperation getMBrickletDistanceUS__Init();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4 <em>MBricklet LCD2 0x4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBricklet LCD2 0x4</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4
   * @generated
   */
  EClass getMBrickletLCD20x4();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#getDeviceType()
   * @see #getMBrickletLCD20x4()
   * @generated
   */
  EAttribute getMBrickletLCD20x4_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#getPositionPrefix <em>Position Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position Prefix</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#getPositionPrefix()
   * @see #getMBrickletLCD20x4()
   * @generated
   */
  EAttribute getMBrickletLCD20x4_PositionPrefix();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#getPositonSuffix <em>Positon Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Positon Suffix</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#getPositonSuffix()
   * @see #getMBrickletLCD20x4()
   * @generated
   */
  EAttribute getMBrickletLCD20x4_PositonSuffix();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#isDisplayErrors <em>Display Errors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Errors</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#isDisplayErrors()
   * @see #getMBrickletLCD20x4()
   * @generated
   */
  EAttribute getMBrickletLCD20x4_DisplayErrors();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#getErrorPrefix <em>Error Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Error Prefix</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#getErrorPrefix()
   * @see #getMBrickletLCD20x4()
   * @generated
   */
  EAttribute getMBrickletLCD20x4_ErrorPrefix();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#init()
   * @generated
   */
  EOperation getMBrickletLCD20x4__Init();

  /**
   * Returns the meta object for the '{@link org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#clear() <em>Clear</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Clear</em>' operation.
   * @see org.openhab.binding.tinkerforge.internal.model.MBrickletLCD20x4#clear()
   * @generated
   */
  EOperation getMBrickletLCD20x4__Clear();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MTextActor <em>MText Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MText Actor</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MTextActor
   * @generated
   */
  EClass getMTextActor();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MTextActor#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MTextActor#getText()
   * @see #getMTextActor()
   * @generated
   */
  EAttribute getMTextActor_Text();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MLCDSubDevice <em>MLCD Sub Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MLCD Sub Device</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MLCDSubDevice
   * @generated
   */
  EClass getMLCDSubDevice();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MLCD20x4Backlight <em>MLCD2 0x4 Backlight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MLCD2 0x4 Backlight</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MLCD20x4Backlight
   * @generated
   */
  EClass getMLCD20x4Backlight();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MLCD20x4Backlight#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MLCD20x4Backlight#getDeviceType()
   * @see #getMLCD20x4Backlight()
   * @generated
   */
  EAttribute getMLCD20x4Backlight_DeviceType();

  /**
   * Returns the meta object for class '{@link org.openhab.binding.tinkerforge.internal.model.MLCD20x4Button <em>MLCD2 0x4 Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MLCD2 0x4 Button</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MLCD20x4Button
   * @generated
   */
  EClass getMLCD20x4Button();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MLCD20x4Button#getDeviceType <em>Device Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device Type</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MLCD20x4Button#getDeviceType()
   * @see #getMLCD20x4Button()
   * @generated
   */
  EAttribute getMLCD20x4Button_DeviceType();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.binding.tinkerforge.internal.model.MLCD20x4Button#getButtonNum <em>Button Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Button Num</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MLCD20x4Button#getButtonNum()
   * @see #getMLCD20x4Button()
   * @generated
   */
  EAttribute getMLCD20x4Button_ButtonNum();

  /**
   * Returns the meta object for data type '{@link org.openhab.binding.tinkerforge.internal.types.OnOffValue <em>Switch State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Switch State</em>'.
   * @see org.openhab.binding.tinkerforge.internal.types.OnOffValue
   * @model instanceClass="org.openhab.binding.tinkerforge.internal.types.OnOffValue"
   * @generated
   */
  EDataType getSwitchState();

  /**
   * Returns the meta object for data type '{@link org.openhab.binding.tinkerforge.internal.types.HighLowValue <em>Digital Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Digital Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.types.HighLowValue
   * @model instanceClass="org.openhab.binding.tinkerforge.internal.types.HighLowValue"
   * @generated
   */
  EDataType getDigitalValue();

  /**
   * Returns the meta object for data type '{@link org.openhab.binding.tinkerforge.internal.types.HSBValue <em>HSB Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>HSB Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.types.HSBValue
   * @model instanceClass="org.openhab.binding.tinkerforge.internal.types.HSBValue"
   * @generated
   */
  EDataType getHSBValue();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletIO16 <em>Tinker Bricklet IO16</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet IO16</em>'.
   * @see com.tinkerforge.BrickletIO16
   * @model instanceClass="com.tinkerforge.BrickletIO16"
   * @generated
   */
  EDataType getTinkerBrickletIO16();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.DCDriveMode <em>DC Drive Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>DC Drive Mode</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DCDriveMode
   * @generated
   */
  EEnum getDCDriveMode();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsServo <em>Config Opts Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Config Opts Servo</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsServo
   * @generated
   */
  EEnum getConfigOptsServo();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonDevicePosition <em>Dual Button Device Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dual Button Device Position</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonDevicePosition
   * @generated
   */
  EEnum getDualButtonDevicePosition();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonLedSubIds <em>Dual Button Led Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dual Button Led Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonLedSubIds
   * @generated
   */
  EEnum getDualButtonLedSubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonButtonSubIds <em>Dual Button Button Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dual Button Button Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualButtonButtonSubIds
   * @generated
   */
  EEnum getDualButtonButtonSubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.JoystickSubIds <em>Joystick Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Joystick Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.JoystickSubIds
   * @generated
   */
  EEnum getJoystickSubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.PTCSubIds <em>PTC Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>PTC Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.PTCSubIds
   * @generated
   */
  EEnum getPTCSubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialDual020mASubIds <em>Industrial Dual020m ASub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Industrial Dual020m ASub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.IndustrialDual020mASubIds
   * @generated
   */
  EEnum getIndustrialDual020mASubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.NoSubIds <em>No Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>No Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.NoSubIds
   * @generated
   */
  EEnum getNoSubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalInSubIDs <em>Industrial Digital In Sub IDs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Industrial Digital In Sub IDs</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalInSubIDs
   * @generated
   */
  EEnum getIndustrialDigitalInSubIDs();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalOutSubIDs <em>Industrial Digital Out Sub IDs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Industrial Digital Out Sub IDs</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalOutSubIDs
   * @generated
   */
  EEnum getIndustrialDigitalOutSubIDs();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialQuadRelayIDs <em>Industrial Quad Relay IDs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Industrial Quad Relay IDs</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.IndustrialQuadRelayIDs
   * @generated
   */
  EEnum getIndustrialQuadRelayIDs();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.ServoSubIDs <em>Servo Sub IDs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Servo Sub IDs</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ServoSubIDs
   * @generated
   */
  EEnum getServoSubIDs();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.BarometerSubIDs <em>Barometer Sub IDs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Barometer Sub IDs</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.BarometerSubIDs
   * @generated
   */
  EEnum getBarometerSubIDs();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.IO16SubIds <em>IO16 Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>IO16 Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.IO16SubIds
   * @generated
   */
  EEnum getIO16SubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.IO4SubIds <em>IO4 Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>IO4 Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.IO4SubIds
   * @generated
   */
  EEnum getIO4SubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.DualRelaySubIds <em>Dual Relay Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dual Relay Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.DualRelaySubIds
   * @generated
   */
  EEnum getDualRelaySubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.LCDButtonSubIds <em>LCD Button Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>LCD Button Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LCDButtonSubIds
   * @generated
   */
  EEnum getLCDButtonSubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.LCDBacklightSubIds <em>LCD Backlight Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>LCD Backlight Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.LCDBacklightSubIds
   * @generated
   */
  EEnum getLCDBacklightSubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.MultiTouchSubIds <em>Multi Touch Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multi Touch Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.MultiTouchSubIds
   * @generated
   */
  EEnum getMultiTouchSubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.TemperatureIRSubIds <em>Temperature IR Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Temperature IR Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.TemperatureIRSubIds
   * @generated
   */
  EEnum getTemperatureIRSubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.VoltageCurrentSubIds <em>Voltage Current Sub Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Voltage Current Sub Ids</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.VoltageCurrentSubIds
   * @generated
   */
  EEnum getVoltageCurrentSubIds();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsMove <em>Config Opts Move</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Config Opts Move</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsMove
   * @generated
   */
  EEnum getConfigOptsMove();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsDimmable <em>Config Opts Dimmable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Config Opts Dimmable</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsDimmable
   * @generated
   */
  EEnum getConfigOptsDimmable();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsSetPoint <em>Config Opts Set Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Config Opts Set Point</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsSetPoint
   * @generated
   */
  EEnum getConfigOptsSetPoint();

  /**
   * Returns the meta object for enum '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsSwitchSpeed <em>Config Opts Switch Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Config Opts Switch Speed</em>'.
   * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsSwitchSpeed
   * @generated
   */
  EEnum getConfigOptsSwitchSpeed();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.IPConnection <em>MIP Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MIP Connection</em>'.
   * @see com.tinkerforge.IPConnection
   * @model instanceClass="com.tinkerforge.IPConnection"
   * @generated
   */
  EDataType getMIPConnection();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.Device <em>MTinker Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Device</em>'.
   * @see com.tinkerforge.Device
   * @model instanceClass="com.tinkerforge.Device"
   * @generated
   */
  EDataType getMTinkerDevice();

  /**
   * Returns the meta object for data type '{@link org.slf4j.Logger <em>MLogger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MLogger</em>'.
   * @see org.slf4j.Logger
   * @model instanceClass="org.slf4j.Logger"
   * @generated
   */
  EDataType getMLogger();

  /**
   * Returns the meta object for data type '{@link java.util.concurrent.atomic.AtomicBoolean <em>MAtomic Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MAtomic Boolean</em>'.
   * @see java.util.concurrent.atomic.AtomicBoolean
   * @model instanceClass="java.util.concurrent.atomic.AtomicBoolean"
   * @generated
   */
  EDataType getMAtomicBoolean();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.Device <em>MTinkerforge Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinkerforge Device</em>'.
   * @see com.tinkerforge.Device
   * @model instanceClass="com.tinkerforge.Device"
   * @generated
   */
  EDataType getMTinkerforgeDevice();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickDC <em>MTinker Brick DC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Brick DC</em>'.
   * @see com.tinkerforge.BrickDC
   * @model instanceClass="com.tinkerforge.BrickDC"
   * @generated
   */
  EDataType getMTinkerBrickDC();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickServo <em>MTinker Brick Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Brick Servo</em>'.
   * @see com.tinkerforge.BrickServo
   * @model instanceClass="com.tinkerforge.BrickServo"
   * @generated
   */
  EDataType getMTinkerBrickServo();

  /**
   * Returns the meta object for data type '{@link org.openhab.binding.tinkerforge.internal.types.TinkerforgeValue <em>MTinkerforge Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinkerforge Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.types.TinkerforgeValue
   * @model instanceClass="org.openhab.binding.tinkerforge.internal.types.TinkerforgeValue"
   * @generated
   */
  EDataType getMTinkerforgeValue();

  /**
   * Returns the meta object for data type '{@link org.openhab.binding.tinkerforge.internal.types.DecimalValue <em>MDecimal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MDecimal Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.types.DecimalValue
   * @model instanceClass="org.openhab.binding.tinkerforge.internal.types.DecimalValue"
   * @generated
   */
  EDataType getMDecimalValue();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletHumidity <em>MTinker Bricklet Humidity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Bricklet Humidity</em>'.
   * @see com.tinkerforge.BrickletHumidity
   * @model instanceClass="com.tinkerforge.BrickletHumidity"
   * @generated
   */
  EDataType getMTinkerBrickletHumidity();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletDistanceIR <em>MTinker Bricklet Distance IR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Bricklet Distance IR</em>'.
   * @see com.tinkerforge.BrickletDistanceIR
   * @model instanceClass="com.tinkerforge.BrickletDistanceIR"
   * @generated
   */
  EDataType getMTinkerBrickletDistanceIR();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletTemperature <em>MTinker Bricklet Temperature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Bricklet Temperature</em>'.
   * @see com.tinkerforge.BrickletTemperature
   * @model instanceClass="com.tinkerforge.BrickletTemperature"
   * @generated
   */
  EDataType getMTinkerBrickletTemperature();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletBarometer <em>MTinker Bricklet Barometer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Bricklet Barometer</em>'.
   * @see com.tinkerforge.BrickletBarometer
   * @model instanceClass="com.tinkerforge.BrickletBarometer"
   * @generated
   */
  EDataType getMTinkerBrickletBarometer();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletAmbientLight <em>MTinker Bricklet Ambient Light</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Bricklet Ambient Light</em>'.
   * @see com.tinkerforge.BrickletAmbientLight
   * @model instanceClass="com.tinkerforge.BrickletAmbientLight"
   * @generated
   */
  EDataType getMTinkerBrickletAmbientLight();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletLCD20x4 <em>MTinker Bricklet LCD2 0x4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Bricklet LCD2 0x4</em>'.
   * @see com.tinkerforge.BrickletLCD20x4
   * @model instanceClass="com.tinkerforge.BrickletLCD20x4"
   * @generated
   */
  EDataType getMTinkerBrickletLCD20x4();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletRemoteSwitch <em>Tinker Bricklet Remote Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Remote Switch</em>'.
   * @see com.tinkerforge.BrickletRemoteSwitch
   * @model instanceClass="com.tinkerforge.BrickletRemoteSwitch"
   * @generated
   */
  EDataType getTinkerBrickletRemoteSwitch();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletMotionDetector <em>Tinker Bricklet Motion Detector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Motion Detector</em>'.
   * @see com.tinkerforge.BrickletMotionDetector
   * @model instanceClass="com.tinkerforge.BrickletMotionDetector"
   * @generated
   */
  EDataType getTinkerBrickletMotionDetector();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletMultiTouch <em>Tinker Bricklet Multi Touch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Multi Touch</em>'.
   * @see com.tinkerforge.BrickletMultiTouch
   * @model instanceClass="com.tinkerforge.BrickletMultiTouch"
   * @generated
   */
  EDataType getTinkerBrickletMultiTouch();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletTemperatureIR <em>Tinker Bricklet Temperature IR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Temperature IR</em>'.
   * @see com.tinkerforge.BrickletTemperatureIR
   * @model instanceClass="com.tinkerforge.BrickletTemperatureIR"
   * @generated
   */
  EDataType getTinkerBrickletTemperatureIR();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletSoundIntensity <em>Tinker Bricklet Sound Intensity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Sound Intensity</em>'.
   * @see com.tinkerforge.BrickletSoundIntensity
   * @model instanceClass="com.tinkerforge.BrickletSoundIntensity"
   * @generated
   */
  EDataType getTinkerBrickletSoundIntensity();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletMoisture <em>Tinker Bricklet Moisture</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Moisture</em>'.
   * @see com.tinkerforge.BrickletMoisture
   * @model instanceClass="com.tinkerforge.BrickletMoisture"
   * @generated
   */
  EDataType getTinkerBrickletMoisture();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletDistanceUS <em>Tinker Bricklet Distance US</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Distance US</em>'.
   * @see com.tinkerforge.BrickletDistanceUS
   * @model instanceClass="com.tinkerforge.BrickletDistanceUS"
   * @generated
   */
  EDataType getTinkerBrickletDistanceUS();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletVoltageCurrent <em>Tinker Bricklet Voltage Current</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Voltage Current</em>'.
   * @see com.tinkerforge.BrickletVoltageCurrent
   * @model instanceClass="com.tinkerforge.BrickletVoltageCurrent"
   * @generated
   */
  EDataType getTinkerBrickletVoltageCurrent();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletTilt <em>Tinker Bricklet Tilt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Tilt</em>'.
   * @see com.tinkerforge.BrickletTilt
   * @model instanceClass="com.tinkerforge.BrickletTilt"
   * @generated
   */
  EDataType getTinkerBrickletTilt();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletIO4 <em>Tinker Bricklet IO4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet IO4</em>'.
   * @see com.tinkerforge.BrickletIO4
   * @model instanceClass="com.tinkerforge.BrickletIO4"
   * @generated
   */
  EDataType getTinkerBrickletIO4();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletHallEffect <em>Tinker Bricklet Hall Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Hall Effect</em>'.
   * @see com.tinkerforge.BrickletHallEffect
   * @model instanceClass="com.tinkerforge.BrickletHallEffect"
   * @generated
   */
  EDataType getTinkerBrickletHallEffect();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletSegmentDisplay4x7 <em>Tinker Bricklet Segment Display4x7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Segment Display4x7</em>'.
   * @see com.tinkerforge.BrickletSegmentDisplay4x7
   * @model instanceClass="com.tinkerforge.BrickletSegmentDisplay4x7"
   * @generated
   */
  EDataType getTinkerBrickletSegmentDisplay4x7();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletLEDStrip <em>Tinker Bricklet LED Strip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet LED Strip</em>'.
   * @see com.tinkerforge.BrickletLEDStrip
   * @model instanceClass="com.tinkerforge.BrickletLEDStrip"
   * @generated
   */
  EDataType getTinkerBrickletLEDStrip();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletJoystick <em>Bricklet Joystick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Bricklet Joystick</em>'.
   * @see com.tinkerforge.BrickletJoystick
   * @model instanceClass="com.tinkerforge.BrickletJoystick"
   * @generated
   */
  EDataType getBrickletJoystick();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletLinearPoti <em>Tinker Bricklet Linear Poti</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Linear Poti</em>'.
   * @see com.tinkerforge.BrickletLinearPoti
   * @model instanceClass="com.tinkerforge.BrickletLinearPoti"
   * @generated
   */
  EDataType getTinkerBrickletLinearPoti();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletDualButton <em>Tinker Bricklet Dual Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Dual Button</em>'.
   * @see com.tinkerforge.BrickletDualButton
   * @model instanceClass="com.tinkerforge.BrickletDualButton"
   * @generated
   */
  EDataType getTinkerBrickletDualButton();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletPTC <em>Tinker Bricklet PTC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet PTC</em>'.
   * @see com.tinkerforge.BrickletPTC
   * @model instanceClass="com.tinkerforge.BrickletPTC"
   * @generated
   */
  EDataType getTinkerBrickletPTC();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletIndustrialDual020mA <em>Tinker Bricklet Industrial Dual020m A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Industrial Dual020m A</em>'.
   * @see com.tinkerforge.BrickletIndustrialDual020mA
   * @model instanceClass="com.tinkerforge.BrickletIndustrialDual020mA"
   * @generated
   */
  EDataType getTinkerBrickletIndustrialDual020mA();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletSolidStateRelay <em>Tinker Bricklet Solid State Relay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Tinker Bricklet Solid State Relay</em>'.
   * @see com.tinkerforge.BrickletSolidStateRelay
   * @model instanceClass="com.tinkerforge.BrickletSolidStateRelay"
   * @generated
   */
  EDataType getTinkerBrickletSolidStateRelay();

  /**
   * Returns the meta object for data type '{@link org.openhab.core.library.types.HSBType <em>HSB Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>HSB Type</em>'.
   * @see org.openhab.core.library.types.HSBType
   * @model instanceClass="org.openhab.core.library.types.HSBType"
   * @generated
   */
  EDataType getHSBType();

  /**
   * Returns the meta object for data type '{@link org.openhab.core.library.types.UpDownType <em>Up Down Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Up Down Type</em>'.
   * @see org.openhab.core.library.types.UpDownType
   * @model instanceClass="org.openhab.core.library.types.UpDownType"
   * @generated
   */
  EDataType getUpDownType();

  /**
   * Returns the meta object for data type '{@link org.openhab.binding.tinkerforge.internal.types.PercentValue <em>Percent Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Percent Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.types.PercentValue
   * @model instanceClass="org.openhab.binding.tinkerforge.internal.types.PercentValue"
   * @generated
   */
  EDataType getPercentValue();

  /**
   * Returns the meta object for data type '{@link org.openhab.binding.tinkerforge.internal.config.DeviceOptions <em>Device Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Device Options</em>'.
   * @see org.openhab.binding.tinkerforge.internal.config.DeviceOptions
   * @model instanceClass="org.openhab.binding.tinkerforge.internal.config.DeviceOptions"
   * @generated
   */
  EDataType getDeviceOptions();

  /**
   * Returns the meta object for data type '{@link org.openhab.core.library.types.PercentType <em>Percent Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Percent Type</em>'.
   * @see org.openhab.core.library.types.PercentType
   * @model instanceClass="org.openhab.core.library.types.PercentType"
   * @generated
   */
  EDataType getPercentType();

  /**
   * Returns the meta object for data type '{@link org.openhab.core.library.types.IncreaseDecreaseType <em>Increase Decrease Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Increase Decrease Type</em>'.
   * @see org.openhab.core.library.types.IncreaseDecreaseType
   * @model instanceClass="org.openhab.core.library.types.IncreaseDecreaseType"
   * @generated
   */
  EDataType getIncreaseDecreaseType();

  /**
   * Returns the meta object for data type '{@link org.openhab.binding.tinkerforge.internal.types.DirectionValue <em>Direction Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Direction Value</em>'.
   * @see org.openhab.binding.tinkerforge.internal.types.DirectionValue
   * @model instanceClass="org.openhab.binding.tinkerforge.internal.types.DirectionValue"
   * @generated
   */
  EDataType getDirectionValue();

  /**
   * Returns the meta object for data type '{@link java.lang.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Enum</em>'.
   * @see java.lang.Enum
   * @model instanceClass="java.lang.Enum"
   * @generated
   */
  EDataType getEnum();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletDualRelay <em>MTinker Bricklet Dual Relay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Bricklet Dual Relay</em>'.
   * @see com.tinkerforge.BrickletDualRelay
   * @model instanceClass="com.tinkerforge.BrickletDualRelay"
   * @generated
   */
  EDataType getMTinkerBrickletDualRelay();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletIndustrialQuadRelay <em>MTinker Bricklet Industrial Quad Relay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Bricklet Industrial Quad Relay</em>'.
   * @see com.tinkerforge.BrickletIndustrialQuadRelay
   * @model instanceClass="com.tinkerforge.BrickletIndustrialQuadRelay"
   * @generated
   */
  EDataType getMTinkerBrickletIndustrialQuadRelay();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletIndustrialDigitalIn4 <em>MTinker Bricklet Industrial Digital In4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Bricklet Industrial Digital In4</em>'.
   * @see com.tinkerforge.BrickletIndustrialDigitalIn4
   * @model instanceClass="com.tinkerforge.BrickletIndustrialDigitalIn4"
   * @generated
   */
  EDataType getMTinkerBrickletIndustrialDigitalIn4();

  /**
   * Returns the meta object for data type '{@link com.tinkerforge.BrickletIndustrialDigitalOut4 <em>MTinker Bricklet Industrial Digital Out4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>MTinker Bricklet Industrial Digital Out4</em>'.
   * @see com.tinkerforge.BrickletIndustrialDigitalOut4
   * @model instanceClass="com.tinkerforge.BrickletIndustrialDigitalOut4"
   * @generated
   */
  EDataType getMTinkerBrickletIndustrialDigitalOut4();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModelFactory getModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.TFConfig <em>TF Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.TFConfig
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFConfig()
     * @generated
     */
    EClass TF_CONFIG = eINSTANCE.getTFConfig();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.OHTFDeviceImpl <em>OHTF Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.OHTFDeviceImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getOHTFDevice()
     * @generated
     */
    EClass OHTF_DEVICE = eINSTANCE.getOHTFDevice();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OHTF_DEVICE__UID = eINSTANCE.getOHTFDevice_Uid();

    /**
     * The meta object literal for the '<em><b>Subid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OHTF_DEVICE__SUBID = eINSTANCE.getOHTFDevice_Subid();

    /**
     * The meta object literal for the '<em><b>Ohid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OHTF_DEVICE__OHID = eINSTANCE.getOHTFDevice_Ohid();

    /**
     * The meta object literal for the '<em><b>Sub Device Ids</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OHTF_DEVICE__SUB_DEVICE_IDS = eINSTANCE.getOHTFDevice_SubDeviceIds();

    /**
     * The meta object literal for the '<em><b>Tf Config</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OHTF_DEVICE__TF_CONFIG = eINSTANCE.getOHTFDevice_TfConfig();

    /**
     * The meta object literal for the '<em><b>Oh Config</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OHTF_DEVICE__OH_CONFIG = eINSTANCE.getOHTFDevice_OhConfig();

    /**
     * The meta object literal for the '<em><b>Is Valid Sub Id</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation OHTF_DEVICE___IS_VALID_SUB_ID__STRING = eINSTANCE.getOHTFDevice__IsValidSubId__String();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.OHTFSubDeviceAdminDeviceImpl <em>OHTF Sub Device Admin Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.OHTFSubDeviceAdminDeviceImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getOHTFSubDeviceAdminDevice()
     * @generated
     */
    EClass OHTF_SUB_DEVICE_ADMIN_DEVICE = eINSTANCE.getOHTFSubDeviceAdminDevice();

    /**
     * The meta object literal for the '<em><b>Is Valid Sub Id</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation OHTF_SUB_DEVICE_ADMIN_DEVICE___IS_VALID_SUB_ID__STRING = eINSTANCE.getOHTFSubDeviceAdminDevice__IsValidSubId__String();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.OHConfigImpl <em>OH Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.OHConfigImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getOHConfig()
     * @generated
     */
    EClass OH_CONFIG = eINSTANCE.getOHConfig();

    /**
     * The meta object literal for the '<em><b>Oh Tf Devices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OH_CONFIG__OH_TF_DEVICES = eINSTANCE.getOHConfig_OhTfDevices();

    /**
     * The meta object literal for the '<em><b>Get Config By TF Id</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation OH_CONFIG___GET_CONFIG_BY_TF_ID__STRING_STRING = eINSTANCE.getOHConfig__GetConfigByTFId__String_String();

    /**
     * The meta object literal for the '<em><b>Get Config By OH Id</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation OH_CONFIG___GET_CONFIG_BY_OH_ID__STRING = eINSTANCE.getOHConfig__GetConfigByOHId__String();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.EcosystemImpl <em>Ecosystem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.EcosystemImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getEcosystem()
     * @generated
     */
    EClass ECOSYSTEM = eINSTANCE.getEcosystem();

    /**
     * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECOSYSTEM__LOGGER = eINSTANCE.getEcosystem_Logger();

    /**
     * The meta object literal for the '<em><b>Mbrickds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECOSYSTEM__MBRICKDS = eINSTANCE.getEcosystem_Mbrickds();

    /**
     * The meta object literal for the '<em><b>Get Brickd</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation ECOSYSTEM___GET_BRICKD__STRING_INT = eINSTANCE.getEcosystem__GetBrickd__String_int();

    /**
     * The meta object literal for the '<em><b>Get Device</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation ECOSYSTEM___GET_DEVICE__STRING_STRING = eINSTANCE.getEcosystem__GetDevice__String_String();

    /**
     * The meta object literal for the '<em><b>Get Devices4 Generic Id</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation ECOSYSTEM___GET_DEVICES4_GENERIC_ID__STRING_STRING = eINSTANCE.getEcosystem__GetDevices4GenericId__String_String();

    /**
     * The meta object literal for the '<em><b>Disconnect</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation ECOSYSTEM___DISCONNECT = eINSTANCE.getEcosystem__Disconnect();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickdImpl <em>MBrickd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickdImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickd()
     * @generated
     */
    EClass MBRICKD = eINSTANCE.getMBrickd();

    /**
     * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKD__LOGGER = eINSTANCE.getMBrickd_Logger();

    /**
     * The meta object literal for the '<em><b>Ip Connection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKD__IP_CONNECTION = eINSTANCE.getMBrickd_IpConnection();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKD__HOST = eINSTANCE.getMBrickd_Host();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKD__PORT = eINSTANCE.getMBrickd_Port();

    /**
     * The meta object literal for the '<em><b>Authkey</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKD__AUTHKEY = eINSTANCE.getMBrickd_Authkey();

    /**
     * The meta object literal for the '<em><b>Is Connected</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKD__IS_CONNECTED = eINSTANCE.getMBrickd_IsConnected();

    /**
     * The meta object literal for the '<em><b>Auto Reconnect</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKD__AUTO_RECONNECT = eINSTANCE.getMBrickd_AutoReconnect();

    /**
     * The meta object literal for the '<em><b>Reconnected</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKD__RECONNECTED = eINSTANCE.getMBrickd_Reconnected();

    /**
     * The meta object literal for the '<em><b>Connected Counter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKD__CONNECTED_COUNTER = eINSTANCE.getMBrickd_ConnectedCounter();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKD__TIMEOUT = eINSTANCE.getMBrickd_Timeout();

    /**
     * The meta object literal for the '<em><b>Mdevices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MBRICKD__MDEVICES = eINSTANCE.getMBrickd_Mdevices();

    /**
     * The meta object literal for the '<em><b>Ecosystem</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MBRICKD__ECOSYSTEM = eINSTANCE.getMBrickd_Ecosystem();

    /**
     * The meta object literal for the '<em><b>Connect</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKD___CONNECT = eINSTANCE.getMBrickd__Connect();

    /**
     * The meta object literal for the '<em><b>Disconnect</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKD___DISCONNECT = eINSTANCE.getMBrickd__Disconnect();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKD___INIT = eINSTANCE.getMBrickd__Init();

    /**
     * The meta object literal for the '<em><b>Get Device</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKD___GET_DEVICE__STRING = eINSTANCE.getMBrickd__GetDevice__String();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.SubDeviceAdmin <em>Sub Device Admin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.SubDeviceAdmin
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getSubDeviceAdmin()
     * @generated
     */
    EClass SUB_DEVICE_ADMIN = eINSTANCE.getSubDeviceAdmin();

    /**
     * The meta object literal for the '<em><b>Add Sub Device</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SUB_DEVICE_ADMIN___ADD_SUB_DEVICE__STRING_STRING = eINSTANCE.getSubDeviceAdmin__AddSubDevice__String_String();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MTFConfigConsumer <em>MTF Config Consumer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MTFConfigConsumer
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTFConfigConsumer()
     * @generated
     */
    EClass MTF_CONFIG_CONSUMER = eINSTANCE.getMTFConfigConsumer();

    /**
     * The meta object literal for the '<em><b>Tf Config</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MTF_CONFIG_CONSUMER__TF_CONFIG = eINSTANCE.getMTFConfigConsumer_TfConfig();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MBaseDevice <em>MBase Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MBaseDevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBaseDevice()
     * @generated
     */
    EClass MBASE_DEVICE = eINSTANCE.getMBaseDevice();

    /**
     * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBASE_DEVICE__LOGGER = eINSTANCE.getMBaseDevice_Logger();

    /**
     * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBASE_DEVICE__UID = eINSTANCE.getMBaseDevice_Uid();

    /**
     * The meta object literal for the '<em><b>Poll</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBASE_DEVICE__POLL = eINSTANCE.getMBaseDevice_Poll();

    /**
     * The meta object literal for the '<em><b>Enabled A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBASE_DEVICE__ENABLED_A = eINSTANCE.getMBaseDevice_EnabledA();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBASE_DEVICE___INIT = eINSTANCE.getMBaseDevice__Init();

    /**
     * The meta object literal for the '<em><b>Enable</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBASE_DEVICE___ENABLE = eINSTANCE.getMBaseDevice__Enable();

    /**
     * The meta object literal for the '<em><b>Disable</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBASE_DEVICE___DISABLE = eINSTANCE.getMBaseDevice__Disable();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MDevice <em>MDevice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MDevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMDevice()
     * @generated
     */
    EClass MDEVICE = eINSTANCE.getMDevice();

    /**
     * The meta object literal for the '<em><b>Tinkerforge Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MDEVICE__TINKERFORGE_DEVICE = eINSTANCE.getMDevice_TinkerforgeDevice();

    /**
     * The meta object literal for the '<em><b>Ip Connection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MDEVICE__IP_CONNECTION = eINSTANCE.getMDevice_IpConnection();

    /**
     * The meta object literal for the '<em><b>Connected Uid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MDEVICE__CONNECTED_UID = eINSTANCE.getMDevice_ConnectedUid();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MDEVICE__POSITION = eINSTANCE.getMDevice_Position();

    /**
     * The meta object literal for the '<em><b>Device Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MDEVICE__DEVICE_IDENTIFIER = eINSTANCE.getMDevice_DeviceIdentifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MDEVICE__NAME = eINSTANCE.getMDevice_Name();

    /**
     * The meta object literal for the '<em><b>Brickd</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MDEVICE__BRICKD = eINSTANCE.getMDevice_Brickd();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder <em>MSub Device Holder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMSubDeviceHolder()
     * @generated
     */
    EClass MSUB_DEVICE_HOLDER = eINSTANCE.getMSubDeviceHolder();

    /**
     * The meta object literal for the '<em><b>Msubdevices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MSUB_DEVICE_HOLDER__MSUBDEVICES = eINSTANCE.getMSubDeviceHolder_Msubdevices();

    /**
     * The meta object literal for the '<em><b>Init Sub Devices</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MSUB_DEVICE_HOLDER___INIT_SUB_DEVICES = eINSTANCE.getMSubDeviceHolder__InitSubDevices();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickServoImpl <em>MBrick Servo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickServoImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickServo()
     * @generated
     */
    EClass MBRICK_SERVO = eINSTANCE.getMBrickServo();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_SERVO__DEVICE_TYPE = eINSTANCE.getMBrickServo_DeviceType();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICK_SERVO___INIT = eINSTANCE.getMBrickServo__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFBrickDCConfigurationImpl <em>TF Brick DC Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFBrickDCConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFBrickDCConfiguration()
     * @generated
     */
    EClass TF_BRICK_DC_CONFIGURATION = eINSTANCE.getTFBrickDCConfiguration();

    /**
     * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_BRICK_DC_CONFIGURATION__VELOCITY = eINSTANCE.getTFBrickDCConfiguration_Velocity();

    /**
     * The meta object literal for the '<em><b>Acceleration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_BRICK_DC_CONFIGURATION__ACCELERATION = eINSTANCE.getTFBrickDCConfiguration_Acceleration();

    /**
     * The meta object literal for the '<em><b>Pwm Frequency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_BRICK_DC_CONFIGURATION__PWM_FREQUENCY = eINSTANCE.getTFBrickDCConfiguration_PwmFrequency();

    /**
     * The meta object literal for the '<em><b>Drive Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_BRICK_DC_CONFIGURATION__DRIVE_MODE = eINSTANCE.getTFBrickDCConfiguration_DriveMode();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickDCImpl <em>MBrick DC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickDCImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickDC()
     * @generated
     */
    EClass MBRICK_DC = eINSTANCE.getMBrickDC();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_DC__THRESHOLD = eINSTANCE.getMBrickDC_Threshold();

    /**
     * The meta object literal for the '<em><b>Max Velocity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_DC__MAX_VELOCITY = eINSTANCE.getMBrickDC_MaxVelocity();

    /**
     * The meta object literal for the '<em><b>Min Velocity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_DC__MIN_VELOCITY = eINSTANCE.getMBrickDC_MinVelocity();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_DC__DEVICE_TYPE = eINSTANCE.getMBrickDC_DeviceType();

    /**
     * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_DC__VELOCITY = eINSTANCE.getMBrickDC_Velocity();

    /**
     * The meta object literal for the '<em><b>Targetvelocity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_DC__TARGETVELOCITY = eINSTANCE.getMBrickDC_Targetvelocity();

    /**
     * The meta object literal for the '<em><b>Current Velocity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_DC__CURRENT_VELOCITY = eINSTANCE.getMBrickDC_CurrentVelocity();

    /**
     * The meta object literal for the '<em><b>Acceleration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_DC__ACCELERATION = eINSTANCE.getMBrickDC_Acceleration();

    /**
     * The meta object literal for the '<em><b>Pwm Frequency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_DC__PWM_FREQUENCY = eINSTANCE.getMBrickDC_PwmFrequency();

    /**
     * The meta object literal for the '<em><b>Drive Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICK_DC__DRIVE_MODE = eINSTANCE.getMBrickDC_DriveMode();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICK_DC___INIT = eINSTANCE.getMBrickDC__Init();

    /**
     * The meta object literal for the '<em><b>Set Speed</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICK_DC___SET_SPEED__SHORT_INT_STRING = eINSTANCE.getMBrickDC__SetSpeed__Short_int_String();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl <em>MDual Relay Bricklet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayBrickletImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMDualRelayBricklet()
     * @generated
     */
    EClass MDUAL_RELAY_BRICKLET = eINSTANCE.getMDualRelayBricklet();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MDUAL_RELAY_BRICKLET__DEVICE_TYPE = eINSTANCE.getMDualRelayBricklet_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialQuadRelayBrickletImpl <em>MIndustrial Quad Relay Bricklet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialQuadRelayBrickletImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMIndustrialQuadRelayBricklet()
     * @generated
     */
    EClass MINDUSTRIAL_QUAD_RELAY_BRICKLET = eINSTANCE.getMIndustrialQuadRelayBricklet();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MINDUSTRIAL_QUAD_RELAY_BRICKLET__DEVICE_TYPE = eINSTANCE.getMIndustrialQuadRelayBricklet_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialQuadRelayImpl <em>MIndustrial Quad Relay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialQuadRelayImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMIndustrialQuadRelay()
     * @generated
     */
    EClass MINDUSTRIAL_QUAD_RELAY = eINSTANCE.getMIndustrialQuadRelay();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MINDUSTRIAL_QUAD_RELAY__DEVICE_TYPE = eINSTANCE.getMIndustrialQuadRelay_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDigitalIn4Impl <em>MBricklet Industrial Digital In4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDigitalIn4Impl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletIndustrialDigitalIn4()
     * @generated
     */
    EClass MBRICKLET_INDUSTRIAL_DIGITAL_IN4 = eINSTANCE.getMBrickletIndustrialDigitalIn4();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_INDUSTRIAL_DIGITAL_IN4__DEVICE_TYPE = eINSTANCE.getMBrickletIndustrialDigitalIn4_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialDigitalInImpl <em>MIndustrial Digital In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MIndustrialDigitalInImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMIndustrialDigitalIn()
     * @generated
     */
    EClass MINDUSTRIAL_DIGITAL_IN = eINSTANCE.getMIndustrialDigitalIn();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MINDUSTRIAL_DIGITAL_IN__DEVICE_TYPE = eINSTANCE.getMIndustrialDigitalIn_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDigitalOut4Impl <em>MBricklet Industrial Digital Out4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDigitalOut4Impl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletIndustrialDigitalOut4()
     * @generated
     */
    EClass MBRICKLET_INDUSTRIAL_DIGITAL_OUT4 = eINSTANCE.getMBrickletIndustrialDigitalOut4();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_INDUSTRIAL_DIGITAL_OUT4__DEVICE_TYPE = eINSTANCE.getMBrickletIndustrialDigitalOut4_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorDigitalOut4Impl <em>Digital Actor Digital Out4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorDigitalOut4Impl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalActorDigitalOut4()
     * @generated
     */
    EClass DIGITAL_ACTOR_DIGITAL_OUT4 = eINSTANCE.getDigitalActorDigitalOut4();

    /**
     * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_DIGITAL_OUT4__PIN = eINSTANCE.getDigitalActorDigitalOut4_Pin();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_DIGITAL_OUT4__DEVICE_TYPE = eINSTANCE.getDigitalActorDigitalOut4_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.DigitalActor <em>Digital Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.DigitalActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalActor()
     * @generated
     */
    EClass DIGITAL_ACTOR = eINSTANCE.getDigitalActor();

    /**
     * The meta object literal for the '<em><b>Digital State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR__DIGITAL_STATE = eINSTANCE.getDigitalActor_DigitalState();

    /**
     * The meta object literal for the '<em><b>Turn Digital</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DIGITAL_ACTOR___TURN_DIGITAL__HIGHLOWVALUE = eINSTANCE.getDigitalActor__TurnDigital__HighLowValue();

    /**
     * The meta object literal for the '<em><b>Fetch Digital Value</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DIGITAL_ACTOR___FETCH_DIGITAL_VALUE = eINSTANCE.getDigitalActor__FetchDigitalValue();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.NumberActor <em>Number Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.NumberActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getNumberActor()
     * @generated
     */
    EClass NUMBER_ACTOR = eINSTANCE.getNumberActor();

    /**
     * The meta object literal for the '<em><b>Set Number</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NUMBER_ACTOR___SET_NUMBER__BIGDECIMAL = eINSTANCE.getNumberActor__SetNumber__BigDecimal();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.ColorActor <em>Color Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.ColorActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getColorActor()
     * @generated
     */
    EClass COLOR_ACTOR = eINSTANCE.getColorActor();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_ACTOR__COLOR = eINSTANCE.getColorActor_Color();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.ProgrammableColorActor <em>Programmable Color Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.ProgrammableColorActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getProgrammableColorActor()
     * @generated
     */
    EClass PROGRAMMABLE_COLOR_ACTOR = eINSTANCE.getProgrammableColorActor();

    /**
     * The meta object literal for the '<em><b>Set Selected Color</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation PROGRAMMABLE_COLOR_ACTOR___SET_SELECTED_COLOR__HSBTYPE_DEVICEOPTIONS = eINSTANCE.getProgrammableColorActor__SetSelectedColor__HSBType_DeviceOptions();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.SimpleColorActor <em>Simple Color Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.SimpleColorActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getSimpleColorActor()
     * @generated
     */
    EClass SIMPLE_COLOR_ACTOR = eINSTANCE.getSimpleColorActor();

    /**
     * The meta object literal for the '<em><b>Set Selected Color</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SIMPLE_COLOR_ACTOR___SET_SELECTED_COLOR__HSBTYPE = eINSTANCE.getSimpleColorActor__SetSelectedColor__HSBType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MoveActor <em>Move Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MoveActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMoveActor()
     * @generated
     */
    EClass MOVE_ACTOR = eINSTANCE.getMoveActor();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVE_ACTOR__DIRECTION = eINSTANCE.getMoveActor_Direction();

    /**
     * The meta object literal for the '<em><b>Move</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MOVE_ACTOR___MOVE__UPDOWNTYPE_DEVICEOPTIONS = eINSTANCE.getMoveActor__Move__UpDownType_DeviceOptions();

    /**
     * The meta object literal for the '<em><b>Stop</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MOVE_ACTOR___STOP = eINSTANCE.getMoveActor__Stop();

    /**
     * The meta object literal for the '<em><b>Moveon</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MOVE_ACTOR___MOVEON__DEVICEOPTIONS = eINSTANCE.getMoveActor__Moveon__DeviceOptions();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.DimmableActor <em>Dimmable Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.DimmableActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDimmableActor()
     * @generated
     */
    EClass DIMMABLE_ACTOR = eINSTANCE.getDimmableActor();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMMABLE_ACTOR__MIN_VALUE = eINSTANCE.getDimmableActor_MinValue();

    /**
     * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMMABLE_ACTOR__MAX_VALUE = eINSTANCE.getDimmableActor_MaxValue();

    /**
     * The meta object literal for the '<em><b>Dimm</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DIMMABLE_ACTOR___DIMM__INCREASEDECREASETYPE_DEVICEOPTIONS = eINSTANCE.getDimmableActor__Dimm__IncreaseDecreaseType_DeviceOptions();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.SetPointActor <em>Set Point Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.SetPointActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getSetPointActor()
     * @generated
     */
    EClass SET_POINT_ACTOR = eINSTANCE.getSetPointActor();

    /**
     * The meta object literal for the '<em><b>Percent Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_POINT_ACTOR__PERCENT_VALUE = eINSTANCE.getSetPointActor_PercentValue();

    /**
     * The meta object literal for the '<em><b>Set Value</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SET_POINT_ACTOR___SET_VALUE__BIGDECIMAL_DEVICEOPTIONS = eINSTANCE.getSetPointActor__SetValue__BigDecimal_DeviceOptions();

    /**
     * The meta object literal for the '<em><b>Set Value</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SET_POINT_ACTOR___SET_VALUE__PERCENTTYPE_DEVICEOPTIONS = eINSTANCE.getSetPointActor__SetValue__PercentType_DeviceOptions();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDualButtonImpl <em>MBricklet Dual Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDualButtonImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletDualButton()
     * @generated
     */
    EClass MBRICKLET_DUAL_BUTTON = eINSTANCE.getMBrickletDualButton();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_DUAL_BUTTON__DEVICE_TYPE = eINSTANCE.getMBrickletDualButton_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonDevice <em>Dual Button Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.DualButtonDevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonDevice()
     * @generated
     */
    EClass DUAL_BUTTON_DEVICE = eINSTANCE.getDualButtonDevice();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DualButtonButtonImpl <em>Dual Button Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.DualButtonButtonImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonButton()
     * @generated
     */
    EClass DUAL_BUTTON_BUTTON = eINSTANCE.getDualButtonButton();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUAL_BUTTON_BUTTON__DEVICE_TYPE = eINSTANCE.getDualButtonButton_DeviceType();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUAL_BUTTON_BUTTON__POSITION = eINSTANCE.getDualButtonButton_Position();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DualButtonLedImpl <em>Dual Button Led</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.DualButtonLedImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonLed()
     * @generated
     */
    EClass DUAL_BUTTON_LED = eINSTANCE.getDualButtonLed();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUAL_BUTTON_LED__DEVICE_TYPE = eINSTANCE.getDualButtonLed_DeviceType();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUAL_BUTTON_LED__POSITION = eINSTANCE.getDualButtonLed_Position();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLinearPotiImpl <em>MBricklet Linear Poti</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLinearPotiImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletLinearPoti()
     * @generated
     */
    EClass MBRICKLET_LINEAR_POTI = eINSTANCE.getMBrickletLinearPoti();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_LINEAR_POTI__DEVICE_TYPE = eINSTANCE.getMBrickletLinearPoti_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletJoystickImpl <em>MBricklet Joystick</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletJoystickImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletJoystick()
     * @generated
     */
    EClass MBRICKLET_JOYSTICK = eINSTANCE.getMBrickletJoystick();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_JOYSTICK__DEVICE_TYPE = eINSTANCE.getMBrickletJoystick_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.JoystickDevice <em>Joystick Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.JoystickDevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getJoystickDevice()
     * @generated
     */
    EClass JOYSTICK_DEVICE = eINSTANCE.getJoystickDevice();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.JoystickXPositionImpl <em>Joystick XPosition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.JoystickXPositionImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getJoystickXPosition()
     * @generated
     */
    EClass JOYSTICK_XPOSITION = eINSTANCE.getJoystickXPosition();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOYSTICK_XPOSITION__DEVICE_TYPE = eINSTANCE.getJoystickXPosition_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.JoystickYPositionImpl <em>Joystick YPosition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.JoystickYPositionImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getJoystickYPosition()
     * @generated
     */
    EClass JOYSTICK_YPOSITION = eINSTANCE.getJoystickYPosition();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOYSTICK_YPOSITION__DEVICE_TYPE = eINSTANCE.getJoystickYPosition_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.JoystickButtonImpl <em>Joystick Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.JoystickButtonImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getJoystickButton()
     * @generated
     */
    EClass JOYSTICK_BUTTON = eINSTANCE.getJoystickButton();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOYSTICK_BUTTON__DEVICE_TYPE = eINSTANCE.getJoystickButton_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLEDStripImpl <em>MBricklet LED Strip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLEDStripImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletLEDStrip()
     * @generated
     */
    EClass MBRICKLET_LED_STRIP = eINSTANCE.getMBrickletLEDStrip();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_LED_STRIP__DEVICE_TYPE = eINSTANCE.getMBrickletLEDStrip_DeviceType();

    /**
     * The meta object literal for the '<em><b>Color Mapping</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_LED_STRIP__COLOR_MAPPING = eINSTANCE.getMBrickletLEDStrip_ColorMapping();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.LEDGroupImpl <em>LED Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.LEDGroupImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getLEDGroup()
     * @generated
     */
    EClass LED_GROUP = eINSTANCE.getLEDGroup();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LED_GROUP__DEVICE_TYPE = eINSTANCE.getLEDGroup_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSegmentDisplay4x7Impl <em>MBricklet Segment Display4x7</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSegmentDisplay4x7Impl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletSegmentDisplay4x7()
     * @generated
     */
    EClass MBRICKLET_SEGMENT_DISPLAY4X7 = eINSTANCE.getMBrickletSegmentDisplay4x7();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_SEGMENT_DISPLAY4X7__DEVICE_TYPE = eINSTANCE.getMBrickletSegmentDisplay4x7_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorIO16Impl <em>Digital Actor IO16</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorIO16Impl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalActorIO16()
     * @generated
     */
    EClass DIGITAL_ACTOR_IO16 = eINSTANCE.getDigitalActorIO16();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_IO16__DEVICE_TYPE = eINSTANCE.getDigitalActorIO16_DeviceType();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_IO16__PORT = eINSTANCE.getDigitalActorIO16_Port();

    /**
     * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_IO16__PIN = eINSTANCE.getDigitalActorIO16_Pin();

    /**
     * The meta object literal for the '<em><b>Default State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_IO16__DEFAULT_STATE = eINSTANCE.getDigitalActorIO16_DefaultState();

    /**
     * The meta object literal for the '<em><b>Keep On Reconnect</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_IO16__KEEP_ON_RECONNECT = eINSTANCE.getDigitalActorIO16_KeepOnReconnect();

    /**
     * The meta object literal for the '<em><b>Turn Digital</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DIGITAL_ACTOR_IO16___TURN_DIGITAL__HIGHLOWVALUE = eINSTANCE.getDigitalActorIO16__TurnDigital__HighLowValue();

    /**
     * The meta object literal for the '<em><b>Fetch Digital Value</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DIGITAL_ACTOR_IO16___FETCH_DIGITAL_VALUE = eINSTANCE.getDigitalActorIO16__FetchDigitalValue();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MActor <em>MActor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMActor()
     * @generated
     */
    EClass MACTOR = eINSTANCE.getMActor();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.SwitchSensor <em>Switch Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.SwitchSensor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getSwitchSensor()
     * @generated
     */
    EClass SWITCH_SENSOR = eINSTANCE.getSwitchSensor();

    /**
     * The meta object literal for the '<em><b>Switch State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_SENSOR__SWITCH_STATE = eINSTANCE.getSwitchSensor_SwitchState();

    /**
     * The meta object literal for the '<em><b>Fetch Switch State</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SWITCH_SENSOR___FETCH_SWITCH_STATE = eINSTANCE.getSwitchSensor__FetchSwitchState();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MSwitchActor <em>MSwitch Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MSwitchActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMSwitchActor()
     * @generated
     */
    EClass MSWITCH_ACTOR = eINSTANCE.getMSwitchActor();

    /**
     * The meta object literal for the '<em><b>Turn Switch</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MSWITCH_ACTOR___TURN_SWITCH__ONOFFVALUE = eINSTANCE.getMSwitchActor__TurnSwitch__OnOffValue();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.ProgrammableSwitchActor <em>Programmable Switch Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.ProgrammableSwitchActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getProgrammableSwitchActor()
     * @generated
     */
    EClass PROGRAMMABLE_SWITCH_ACTOR = eINSTANCE.getProgrammableSwitchActor();

    /**
     * The meta object literal for the '<em><b>Turn Switch</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation PROGRAMMABLE_SWITCH_ACTOR___TURN_SWITCH__ONOFFVALUE_DEVICEOPTIONS = eINSTANCE.getProgrammableSwitchActor__TurnSwitch__OnOffValue_DeviceOptions();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MInSwitchActor <em>MIn Switch Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MInSwitchActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMInSwitchActor()
     * @generated
     */
    EClass MIN_SWITCH_ACTOR = eINSTANCE.getMInSwitchActor();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.GenericDevice <em>Generic Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.GenericDevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getGenericDevice()
     * @generated
     */
    EClass GENERIC_DEVICE = eINSTANCE.getGenericDevice();

    /**
     * The meta object literal for the '<em><b>Generic Device Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_DEVICE__GENERIC_DEVICE_ID = eINSTANCE.getGenericDevice_GenericDeviceId();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFIOActorConfigurationImpl <em>TFIO Actor Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFIOActorConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFIOActorConfiguration()
     * @generated
     */
    EClass TFIO_ACTOR_CONFIGURATION = eINSTANCE.getTFIOActorConfiguration();

    /**
     * The meta object literal for the '<em><b>Default State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFIO_ACTOR_CONFIGURATION__DEFAULT_STATE = eINSTANCE.getTFIOActorConfiguration_DefaultState();

    /**
     * The meta object literal for the '<em><b>Keep On Reconnect</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFIO_ACTOR_CONFIGURATION__KEEP_ON_RECONNECT = eINSTANCE.getTFIOActorConfiguration_KeepOnReconnect();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFInterruptListenerConfigurationImpl <em>TF Interrupt Listener Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFInterruptListenerConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFInterruptListenerConfiguration()
     * @generated
     */
    EClass TF_INTERRUPT_LISTENER_CONFIGURATION = eINSTANCE.getTFInterruptListenerConfiguration();

    /**
     * The meta object literal for the '<em><b>Debounce Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_INTERRUPT_LISTENER_CONFIGURATION__DEBOUNCE_PERIOD = eINSTANCE.getTFInterruptListenerConfiguration_DebouncePeriod();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIO16Impl <em>MBricklet IO16</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIO16Impl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletIO16()
     * @generated
     */
    EClass MBRICKLET_IO16 = eINSTANCE.getMBrickletIO16();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_IO16__DEVICE_TYPE = eINSTANCE.getMBrickletIO16_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.IODevice <em>IO Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.IODevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIODevice()
     * @generated
     */
    EClass IO_DEVICE = eINSTANCE.getIODevice();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFIOSensorConfigurationImpl <em>TFIO Sensor Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFIOSensorConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFIOSensorConfiguration()
     * @generated
     */
    EClass TFIO_SENSOR_CONFIGURATION = eINSTANCE.getTFIOSensorConfiguration();

    /**
     * The meta object literal for the '<em><b>Pull Up Resistor Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFIO_SENSOR_CONFIGURATION__PULL_UP_RESISTOR_ENABLED = eINSTANCE.getTFIOSensorConfiguration_PullUpResistorEnabled();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DigitalSensorImpl <em>Digital Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.DigitalSensorImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalSensor()
     * @generated
     */
    EClass DIGITAL_SENSOR = eINSTANCE.getDigitalSensor();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_SENSOR__DEVICE_TYPE = eINSTANCE.getDigitalSensor_DeviceType();

    /**
     * The meta object literal for the '<em><b>Pull Up Resistor Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_SENSOR__PULL_UP_RESISTOR_ENABLED = eINSTANCE.getDigitalSensor_PullUpResistorEnabled();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_SENSOR__PORT = eINSTANCE.getDigitalSensor_Port();

    /**
     * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_SENSOR__PIN = eINSTANCE.getDigitalSensor_Pin();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIO4Impl <em>MBricklet IO4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIO4Impl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletIO4()
     * @generated
     */
    EClass MBRICKLET_IO4 = eINSTANCE.getMBrickletIO4();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_IO4__DEVICE_TYPE = eINSTANCE.getMBrickletIO4_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.IO4Device <em>IO4 Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.IO4Device
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIO4Device()
     * @generated
     */
    EClass IO4_DEVICE = eINSTANCE.getIO4Device();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DigitalSensorIO4Impl <em>Digital Sensor IO4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.DigitalSensorIO4Impl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalSensorIO4()
     * @generated
     */
    EClass DIGITAL_SENSOR_IO4 = eINSTANCE.getDigitalSensorIO4();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_SENSOR_IO4__DEVICE_TYPE = eINSTANCE.getDigitalSensorIO4_DeviceType();

    /**
     * The meta object literal for the '<em><b>Pull Up Resistor Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_SENSOR_IO4__PULL_UP_RESISTOR_ENABLED = eINSTANCE.getDigitalSensorIO4_PullUpResistorEnabled();

    /**
     * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_SENSOR_IO4__PIN = eINSTANCE.getDigitalSensorIO4_Pin();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorIO4Impl <em>Digital Actor IO4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.DigitalActorIO4Impl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalActorIO4()
     * @generated
     */
    EClass DIGITAL_ACTOR_IO4 = eINSTANCE.getDigitalActorIO4();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_IO4__DEVICE_TYPE = eINSTANCE.getDigitalActorIO4_DeviceType();

    /**
     * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_IO4__PIN = eINSTANCE.getDigitalActorIO4_Pin();

    /**
     * The meta object literal for the '<em><b>Default State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_IO4__DEFAULT_STATE = eINSTANCE.getDigitalActorIO4_DefaultState();

    /**
     * The meta object literal for the '<em><b>Keep On Reconnect</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGITAL_ACTOR_IO4__KEEP_ON_RECONNECT = eINSTANCE.getDigitalActorIO4_KeepOnReconnect();

    /**
     * The meta object literal for the '<em><b>Turn Digital</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DIGITAL_ACTOR_IO4___TURN_DIGITAL__HIGHLOWVALUE = eINSTANCE.getDigitalActorIO4__TurnDigital__HighLowValue();

    /**
     * The meta object literal for the '<em><b>Fetch Digital Value</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DIGITAL_ACTOR_IO4___FETCH_DIGITAL_VALUE = eINSTANCE.getDigitalActorIO4__FetchDigitalValue();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMultiTouchImpl <em>MBricklet Multi Touch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMultiTouchImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletMultiTouch()
     * @generated
     */
    EClass MBRICKLET_MULTI_TOUCH = eINSTANCE.getMBrickletMultiTouch();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_MULTI_TOUCH__DEVICE_TYPE = eINSTANCE.getMBrickletMultiTouch_DeviceType();

    /**
     * The meta object literal for the '<em><b>Recalibrate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_MULTI_TOUCH__RECALIBRATE = eINSTANCE.getMBrickletMultiTouch_Recalibrate();

    /**
     * The meta object literal for the '<em><b>Sensitivity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_MULTI_TOUCH__SENSITIVITY = eINSTANCE.getMBrickletMultiTouch_Sensitivity();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MultiTouchDeviceImpl <em>Multi Touch Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MultiTouchDeviceImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMultiTouchDevice()
     * @generated
     */
    EClass MULTI_TOUCH_DEVICE = eINSTANCE.getMultiTouchDevice();

    /**
     * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_TOUCH_DEVICE__PIN = eINSTANCE.getMultiTouchDevice_Pin();

    /**
     * The meta object literal for the '<em><b>Disable Electrode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_TOUCH_DEVICE__DISABLE_ELECTRODE = eINSTANCE.getMultiTouchDevice_DisableElectrode();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.ElectrodeImpl <em>Electrode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ElectrodeImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getElectrode()
     * @generated
     */
    EClass ELECTRODE = eINSTANCE.getElectrode();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELECTRODE__DEVICE_TYPE = eINSTANCE.getElectrode_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.ProximityImpl <em>Proximity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ProximityImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getProximity()
     * @generated
     */
    EClass PROXIMITY = eINSTANCE.getProximity();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROXIMITY__DEVICE_TYPE = eINSTANCE.getProximity_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMotionDetectorImpl <em>MBricklet Motion Detector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMotionDetectorImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletMotionDetector()
     * @generated
     */
    EClass MBRICKLET_MOTION_DETECTOR = eINSTANCE.getMBrickletMotionDetector();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_MOTION_DETECTOR__DEVICE_TYPE = eINSTANCE.getMBrickletMotionDetector_DeviceType();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_MOTION_DETECTOR___INIT = eINSTANCE.getMBrickletMotionDetector__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletHallEffectImpl <em>MBricklet Hall Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletHallEffectImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletHallEffect()
     * @generated
     */
    EClass MBRICKLET_HALL_EFFECT = eINSTANCE.getMBrickletHallEffect();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_HALL_EFFECT__DEVICE_TYPE = eINSTANCE.getMBrickletHallEffect_DeviceType();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_HALL_EFFECT___INIT = eINSTANCE.getMBrickletHallEffect__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MSubDevice <em>MSub Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MSubDevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMSubDevice()
     * @generated
     */
    EClass MSUB_DEVICE = eINSTANCE.getMSubDevice();

    /**
     * The meta object literal for the '<em><b>Sub Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSUB_DEVICE__SUB_ID = eINSTANCE.getMSubDevice_SubId();

    /**
     * The meta object literal for the '<em><b>Mbrick</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MSUB_DEVICE__MBRICK = eINSTANCE.getMSubDevice_Mbrick();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl <em>MDual Relay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MDualRelayImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMDualRelay()
     * @generated
     */
    EClass MDUAL_RELAY = eINSTANCE.getMDualRelay();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MDUAL_RELAY__DEVICE_TYPE = eINSTANCE.getMDualRelay_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletRemoteSwitchImpl <em>MBricklet Remote Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletRemoteSwitchImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletRemoteSwitch()
     * @generated
     */
    EClass MBRICKLET_REMOTE_SWITCH = eINSTANCE.getMBrickletRemoteSwitch();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_REMOTE_SWITCH__DEVICE_TYPE = eINSTANCE.getMBrickletRemoteSwitch_DeviceType();

    /**
     * The meta object literal for the '<em><b>Type ADevices</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_REMOTE_SWITCH__TYPE_ADEVICES = eINSTANCE.getMBrickletRemoteSwitch_TypeADevices();

    /**
     * The meta object literal for the '<em><b>Type BDevices</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_REMOTE_SWITCH__TYPE_BDEVICES = eINSTANCE.getMBrickletRemoteSwitch_TypeBDevices();

    /**
     * The meta object literal for the '<em><b>Type CDevices</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_REMOTE_SWITCH__TYPE_CDEVICES = eINSTANCE.getMBrickletRemoteSwitch_TypeCDevices();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.RemoteSwitch <em>Remote Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.RemoteSwitch
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitch()
     * @generated
     */
    EClass REMOTE_SWITCH = eINSTANCE.getRemoteSwitch();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchAImpl <em>Remote Switch A</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchAImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchA()
     * @generated
     */
    EClass REMOTE_SWITCH_A = eINSTANCE.getRemoteSwitchA();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_A__DEVICE_TYPE = eINSTANCE.getRemoteSwitchA_DeviceType();

    /**
     * The meta object literal for the '<em><b>House Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_A__HOUSE_CODE = eINSTANCE.getRemoteSwitchA_HouseCode();

    /**
     * The meta object literal for the '<em><b>Receiver Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_A__RECEIVER_CODE = eINSTANCE.getRemoteSwitchA_ReceiverCode();

    /**
     * The meta object literal for the '<em><b>Repeats</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_A__REPEATS = eINSTANCE.getRemoteSwitchA_Repeats();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchBImpl <em>Remote Switch B</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchBImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchB()
     * @generated
     */
    EClass REMOTE_SWITCH_B = eINSTANCE.getRemoteSwitchB();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_B__DEVICE_TYPE = eINSTANCE.getRemoteSwitchB_DeviceType();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_B__ADDRESS = eINSTANCE.getRemoteSwitchB_Address();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_B__UNIT = eINSTANCE.getRemoteSwitchB_Unit();

    /**
     * The meta object literal for the '<em><b>Repeats</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_B__REPEATS = eINSTANCE.getRemoteSwitchB_Repeats();

    /**
     * The meta object literal for the '<em><b>Target Dimmvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_B__TARGET_DIMMVALUE = eINSTANCE.getRemoteSwitchB_TargetDimmvalue();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchCImpl <em>Remote Switch C</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchCImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchC()
     * @generated
     */
    EClass REMOTE_SWITCH_C = eINSTANCE.getRemoteSwitchC();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_C__DEVICE_TYPE = eINSTANCE.getRemoteSwitchC_DeviceType();

    /**
     * The meta object literal for the '<em><b>System Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_C__SYSTEM_CODE = eINSTANCE.getRemoteSwitchC_SystemCode();

    /**
     * The meta object literal for the '<em><b>Device Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_C__DEVICE_CODE = eINSTANCE.getRemoteSwitchC_DeviceCode();

    /**
     * The meta object literal for the '<em><b>Repeats</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_C__REPEATS = eINSTANCE.getRemoteSwitchC_Repeats();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFNullConfigurationImpl <em>TF Null Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFNullConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFNullConfiguration()
     * @generated
     */
    EClass TF_NULL_CONFIGURATION = eINSTANCE.getTFNullConfiguration();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFPTCBrickletConfigurationImpl <em>TFPTC Bricklet Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFPTCBrickletConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFPTCBrickletConfiguration()
     * @generated
     */
    EClass TFPTC_BRICKLET_CONFIGURATION = eINSTANCE.getTFPTCBrickletConfiguration();

    /**
     * The meta object literal for the '<em><b>Noise Rejection Filter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFPTC_BRICKLET_CONFIGURATION__NOISE_REJECTION_FILTER = eINSTANCE.getTFPTCBrickletConfiguration_NoiseRejectionFilter();

    /**
     * The meta object literal for the '<em><b>Wire Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TFPTC_BRICKLET_CONFIGURATION__WIRE_MODE = eINSTANCE.getTFPTCBrickletConfiguration_WireMode();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFIndustrialDual020mAConfigurationImpl <em>TF Industrial Dual020m AConfiguration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFIndustrialDual020mAConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFIndustrialDual020mAConfiguration()
     * @generated
     */
    EClass TF_INDUSTRIAL_DUAL020M_ACONFIGURATION = eINSTANCE.getTFIndustrialDual020mAConfiguration();

    /**
     * The meta object literal for the '<em><b>Sample Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_INDUSTRIAL_DUAL020M_ACONFIGURATION__SAMPLE_RATE = eINSTANCE.getTFIndustrialDual020mAConfiguration_SampleRate();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFServoConfigurationImpl <em>TF Servo Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFServoConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFServoConfiguration()
     * @generated
     */
    EClass TF_SERVO_CONFIGURATION = eINSTANCE.getTFServoConfiguration();

    /**
     * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_SERVO_CONFIGURATION__VELOCITY = eINSTANCE.getTFServoConfiguration_Velocity();

    /**
     * The meta object literal for the '<em><b>Acceleration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_SERVO_CONFIGURATION__ACCELERATION = eINSTANCE.getTFServoConfiguration_Acceleration();

    /**
     * The meta object literal for the '<em><b>Servo Voltage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_SERVO_CONFIGURATION__SERVO_VOLTAGE = eINSTANCE.getTFServoConfiguration_ServoVoltage();

    /**
     * The meta object literal for the '<em><b>Pulse Width Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_SERVO_CONFIGURATION__PULSE_WIDTH_MIN = eINSTANCE.getTFServoConfiguration_PulseWidthMin();

    /**
     * The meta object literal for the '<em><b>Pulse Width Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_SERVO_CONFIGURATION__PULSE_WIDTH_MAX = eINSTANCE.getTFServoConfiguration_PulseWidthMax();

    /**
     * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_SERVO_CONFIGURATION__PERIOD = eINSTANCE.getTFServoConfiguration_Period();

    /**
     * The meta object literal for the '<em><b>Output Voltage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_SERVO_CONFIGURATION__OUTPUT_VOLTAGE = eINSTANCE.getTFServoConfiguration_OutputVoltage();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickletRemoteSwitchConfigurationImpl <em>Bricklet Remote Switch Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.BrickletRemoteSwitchConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getBrickletRemoteSwitchConfiguration()
     * @generated
     */
    EClass BRICKLET_REMOTE_SWITCH_CONFIGURATION = eINSTANCE.getBrickletRemoteSwitchConfiguration();

    /**
     * The meta object literal for the '<em><b>Type ADevices</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRICKLET_REMOTE_SWITCH_CONFIGURATION__TYPE_ADEVICES = eINSTANCE.getBrickletRemoteSwitchConfiguration_TypeADevices();

    /**
     * The meta object literal for the '<em><b>Type BDevices</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRICKLET_REMOTE_SWITCH_CONFIGURATION__TYPE_BDEVICES = eINSTANCE.getBrickletRemoteSwitchConfiguration_TypeBDevices();

    /**
     * The meta object literal for the '<em><b>Type CDevices</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRICKLET_REMOTE_SWITCH_CONFIGURATION__TYPE_CDEVICES = eINSTANCE.getBrickletRemoteSwitchConfiguration_TypeCDevices();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchAConfigurationImpl <em>Remote Switch AConfiguration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchAConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchAConfiguration()
     * @generated
     */
    EClass REMOTE_SWITCH_ACONFIGURATION = eINSTANCE.getRemoteSwitchAConfiguration();

    /**
     * The meta object literal for the '<em><b>House Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_ACONFIGURATION__HOUSE_CODE = eINSTANCE.getRemoteSwitchAConfiguration_HouseCode();

    /**
     * The meta object literal for the '<em><b>Receiver Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_ACONFIGURATION__RECEIVER_CODE = eINSTANCE.getRemoteSwitchAConfiguration_ReceiverCode();

    /**
     * The meta object literal for the '<em><b>Repeats</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_ACONFIGURATION__REPEATS = eINSTANCE.getRemoteSwitchAConfiguration_Repeats();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchBConfigurationImpl <em>Remote Switch BConfiguration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchBConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchBConfiguration()
     * @generated
     */
    EClass REMOTE_SWITCH_BCONFIGURATION = eINSTANCE.getRemoteSwitchBConfiguration();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_BCONFIGURATION__ADDRESS = eINSTANCE.getRemoteSwitchBConfiguration_Address();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_BCONFIGURATION__UNIT = eINSTANCE.getRemoteSwitchBConfiguration_Unit();

    /**
     * The meta object literal for the '<em><b>Repeats</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_BCONFIGURATION__REPEATS = eINSTANCE.getRemoteSwitchBConfiguration_Repeats();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchCConfigurationImpl <em>Remote Switch CConfiguration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.RemoteSwitchCConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getRemoteSwitchCConfiguration()
     * @generated
     */
    EClass REMOTE_SWITCH_CCONFIGURATION = eINSTANCE.getRemoteSwitchCConfiguration();

    /**
     * The meta object literal for the '<em><b>System Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_CCONFIGURATION__SYSTEM_CODE = eINSTANCE.getRemoteSwitchCConfiguration_SystemCode();

    /**
     * The meta object literal for the '<em><b>Device Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_CCONFIGURATION__DEVICE_CODE = eINSTANCE.getRemoteSwitchCConfiguration_DeviceCode();

    /**
     * The meta object literal for the '<em><b>Repeats</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_SWITCH_CCONFIGURATION__REPEATS = eINSTANCE.getRemoteSwitchCConfiguration_Repeats();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MultiTouchDeviceConfigurationImpl <em>Multi Touch Device Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MultiTouchDeviceConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMultiTouchDeviceConfiguration()
     * @generated
     */
    EClass MULTI_TOUCH_DEVICE_CONFIGURATION = eINSTANCE.getMultiTouchDeviceConfiguration();

    /**
     * The meta object literal for the '<em><b>Disable Electrode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_TOUCH_DEVICE_CONFIGURATION__DISABLE_ELECTRODE = eINSTANCE.getMultiTouchDeviceConfiguration_DisableElectrode();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.BrickletMultiTouchConfigurationImpl <em>Bricklet Multi Touch Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.BrickletMultiTouchConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getBrickletMultiTouchConfiguration()
     * @generated
     */
    EClass BRICKLET_MULTI_TOUCH_CONFIGURATION = eINSTANCE.getBrickletMultiTouchConfiguration();

    /**
     * The meta object literal for the '<em><b>Recalibrate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRICKLET_MULTI_TOUCH_CONFIGURATION__RECALIBRATE = eINSTANCE.getBrickletMultiTouchConfiguration_Recalibrate();

    /**
     * The meta object literal for the '<em><b>Sensitivity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRICKLET_MULTI_TOUCH_CONFIGURATION__SENSITIVITY = eINSTANCE.getBrickletMultiTouchConfiguration_Sensitivity();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DimmableConfigurationImpl <em>Dimmable Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.DimmableConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDimmableConfiguration()
     * @generated
     */
    EClass DIMMABLE_CONFIGURATION = eINSTANCE.getDimmableConfiguration();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMMABLE_CONFIGURATION__MIN_VALUE = eINSTANCE.getDimmableConfiguration_MinValue();

    /**
     * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMMABLE_CONFIGURATION__MAX_VALUE = eINSTANCE.getDimmableConfiguration_MaxValue();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.ButtonConfigurationImpl <em>Button Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ButtonConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getButtonConfiguration()
     * @generated
     */
    EClass BUTTON_CONFIGURATION = eINSTANCE.getButtonConfiguration();

    /**
     * The meta object literal for the '<em><b>Tactile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_CONFIGURATION__TACTILE = eINSTANCE.getButtonConfiguration_Tactile();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.DualButtonLEDConfigurationImpl <em>Dual Button LED Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.DualButtonLEDConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonLEDConfiguration()
     * @generated
     */
    EClass DUAL_BUTTON_LED_CONFIGURATION = eINSTANCE.getDualButtonLEDConfiguration();

    /**
     * The meta object literal for the '<em><b>Autotoggle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUAL_BUTTON_LED_CONFIGURATION__AUTOTOGGLE = eINSTANCE.getDualButtonLEDConfiguration_Autotoggle();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.LEDStripConfigurationImpl <em>LED Strip Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.LEDStripConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getLEDStripConfiguration()
     * @generated
     */
    EClass LED_STRIP_CONFIGURATION = eINSTANCE.getLEDStripConfiguration();

    /**
     * The meta object literal for the '<em><b>Chiptype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LED_STRIP_CONFIGURATION__CHIPTYPE = eINSTANCE.getLEDStripConfiguration_Chiptype();

    /**
     * The meta object literal for the '<em><b>Frameduration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LED_STRIP_CONFIGURATION__FRAMEDURATION = eINSTANCE.getLEDStripConfiguration_Frameduration();

    /**
     * The meta object literal for the '<em><b>Clockfrequency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LED_STRIP_CONFIGURATION__CLOCKFREQUENCY = eINSTANCE.getLEDStripConfiguration_Clockfrequency();

    /**
     * The meta object literal for the '<em><b>Color Mapping</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LED_STRIP_CONFIGURATION__COLOR_MAPPING = eINSTANCE.getLEDStripConfiguration_ColorMapping();

    /**
     * The meta object literal for the '<em><b>Sub Devices</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LED_STRIP_CONFIGURATION__SUB_DEVICES = eINSTANCE.getLEDStripConfiguration_SubDevices();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.LEDGroupConfigurationImpl <em>LED Group Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.LEDGroupConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getLEDGroupConfiguration()
     * @generated
     */
    EClass LED_GROUP_CONFIGURATION = eINSTANCE.getLEDGroupConfiguration();

    /**
     * The meta object literal for the '<em><b>Leds</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LED_GROUP_CONFIGURATION__LEDS = eINSTANCE.getLEDGroupConfiguration_Leds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MServoImpl <em>MServo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MServoImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMServo()
     * @generated
     */
    EClass MSERVO = eINSTANCE.getMServo();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSERVO__DEVICE_TYPE = eINSTANCE.getMServo_DeviceType();

    /**
     * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSERVO__VELOCITY = eINSTANCE.getMServo_Velocity();

    /**
     * The meta object literal for the '<em><b>Acceleration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSERVO__ACCELERATION = eINSTANCE.getMServo_Acceleration();

    /**
     * The meta object literal for the '<em><b>Max Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSERVO__MAX_POSITION = eINSTANCE.getMServo_MaxPosition();

    /**
     * The meta object literal for the '<em><b>Min Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSERVO__MIN_POSITION = eINSTANCE.getMServo_MinPosition();

    /**
     * The meta object literal for the '<em><b>Pulse Width Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSERVO__PULSE_WIDTH_MIN = eINSTANCE.getMServo_PulseWidthMin();

    /**
     * The meta object literal for the '<em><b>Pulse Width Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSERVO__PULSE_WIDTH_MAX = eINSTANCE.getMServo_PulseWidthMax();

    /**
     * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSERVO__PERIOD = eINSTANCE.getMServo_Period();

    /**
     * The meta object literal for the '<em><b>Output Voltage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSERVO__OUTPUT_VOLTAGE = eINSTANCE.getMServo_OutputVoltage();

    /**
     * The meta object literal for the '<em><b>Target Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSERVO__TARGET_POSITION = eINSTANCE.getMServo_TargetPosition();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MSERVO___INIT = eINSTANCE.getMServo__Init();

    /**
     * The meta object literal for the '<em><b>Set Point</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MSERVO___SET_POINT__SHORT_INT_INT = eINSTANCE.getMServo__SetPoint__Short_int_int();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.CallbackListener <em>Callback Listener</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.CallbackListener
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getCallbackListener()
     * @generated
     */
    EClass CALLBACK_LISTENER = eINSTANCE.getCallbackListener();

    /**
     * The meta object literal for the '<em><b>Callback Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALLBACK_LISTENER__CALLBACK_PERIOD = eINSTANCE.getCallbackListener_CallbackPeriod();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.InterruptListener <em>Interrupt Listener</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.InterruptListener
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getInterruptListener()
     * @generated
     */
    EClass INTERRUPT_LISTENER = eINSTANCE.getInterruptListener();

    /**
     * The meta object literal for the '<em><b>Debounce Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERRUPT_LISTENER__DEBOUNCE_PERIOD = eINSTANCE.getInterruptListener_DebouncePeriod();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MSensor <em>MSensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MSensor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMSensor()
     * @generated
     */
    EClass MSENSOR = eINSTANCE.getMSensor();

    /**
     * The meta object literal for the '<em><b>Sensor Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSENSOR__SENSOR_VALUE = eINSTANCE.getMSensor_SensorValue();

    /**
     * The meta object literal for the '<em><b>Fetch Sensor Value</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MSENSOR___FETCH_SENSOR_VALUE = eINSTANCE.getMSensor__FetchSensorValue();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletHumidityImpl <em>MBricklet Humidity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletHumidityImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletHumidity()
     * @generated
     */
    EClass MBRICKLET_HUMIDITY = eINSTANCE.getMBrickletHumidity();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_HUMIDITY__DEVICE_TYPE = eINSTANCE.getMBrickletHumidity_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_HUMIDITY__THRESHOLD = eINSTANCE.getMBrickletHumidity_Threshold();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_HUMIDITY___INIT = eINSTANCE.getMBrickletHumidity__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDistanceIRImpl <em>MBricklet Distance IR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDistanceIRImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletDistanceIR()
     * @generated
     */
    EClass MBRICKLET_DISTANCE_IR = eINSTANCE.getMBrickletDistanceIR();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_DISTANCE_IR__DEVICE_TYPE = eINSTANCE.getMBrickletDistanceIR_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_DISTANCE_IR__THRESHOLD = eINSTANCE.getMBrickletDistanceIR_Threshold();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_DISTANCE_IR___INIT = eINSTANCE.getMBrickletDistanceIR__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSolidStateRelayImpl <em>MBricklet Solid State Relay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSolidStateRelayImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletSolidStateRelay()
     * @generated
     */
    EClass MBRICKLET_SOLID_STATE_RELAY = eINSTANCE.getMBrickletSolidStateRelay();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_SOLID_STATE_RELAY__DEVICE_TYPE = eINSTANCE.getMBrickletSolidStateRelay_DeviceType();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_SOLID_STATE_RELAY___INIT = eINSTANCE.getMBrickletSolidStateRelay__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDual020mAImpl <em>MBricklet Industrial Dual020m A</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletIndustrialDual020mAImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletIndustrialDual020mA()
     * @generated
     */
    EClass MBRICKLET_INDUSTRIAL_DUAL020M_A = eINSTANCE.getMBrickletIndustrialDual020mA();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_INDUSTRIAL_DUAL020M_A__DEVICE_TYPE = eINSTANCE.getMBrickletIndustrialDual020mA_DeviceType();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_INDUSTRIAL_DUAL020M_A___INIT = eINSTANCE.getMBrickletIndustrialDual020mA__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.Dual020mADeviceImpl <em>Dual020m ADevice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.Dual020mADeviceImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDual020mADevice()
     * @generated
     */
    EClass DUAL020M_ADEVICE = eINSTANCE.getDual020mADevice();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUAL020M_ADEVICE__DEVICE_TYPE = eINSTANCE.getDual020mADevice_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUAL020M_ADEVICE__THRESHOLD = eINSTANCE.getDual020mADevice_Threshold();

    /**
     * The meta object literal for the '<em><b>Sensor Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUAL020M_ADEVICE__SENSOR_NUM = eINSTANCE.getDual020mADevice_SensorNum();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletPTCImpl <em>MBricklet PTC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletPTCImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletPTC()
     * @generated
     */
    EClass MBRICKLET_PTC = eINSTANCE.getMBrickletPTC();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_PTC__DEVICE_TYPE = eINSTANCE.getMBrickletPTC_DeviceType();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_PTC___INIT = eINSTANCE.getMBrickletPTC__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.PTCDevice <em>PTC Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.PTCDevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPTCDevice()
     * @generated
     */
    EClass PTC_DEVICE = eINSTANCE.getPTCDevice();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.PTCTemperatureImpl <em>PTC Temperature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.PTCTemperatureImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPTCTemperature()
     * @generated
     */
    EClass PTC_TEMPERATURE = eINSTANCE.getPTCTemperature();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PTC_TEMPERATURE__DEVICE_TYPE = eINSTANCE.getPTCTemperature_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PTC_TEMPERATURE__THRESHOLD = eINSTANCE.getPTCTemperature_Threshold();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.PTCResistanceImpl <em>PTC Resistance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.PTCResistanceImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPTCResistance()
     * @generated
     */
    EClass PTC_RESISTANCE = eINSTANCE.getPTCResistance();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PTC_RESISTANCE__DEVICE_TYPE = eINSTANCE.getPTCResistance_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PTC_RESISTANCE__THRESHOLD = eINSTANCE.getPTCResistance_Threshold();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.PTCConnectedImpl <em>PTC Connected</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.PTCConnectedImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPTCConnected()
     * @generated
     */
    EClass PTC_CONNECTED = eINSTANCE.getPTCConnected();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PTC_CONNECTED__DEVICE_TYPE = eINSTANCE.getPTCConnected_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTemperatureImpl <em>MBricklet Temperature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTemperatureImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletTemperature()
     * @generated
     */
    EClass MBRICKLET_TEMPERATURE = eINSTANCE.getMBrickletTemperature();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_TEMPERATURE__DEVICE_TYPE = eINSTANCE.getMBrickletTemperature_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_TEMPERATURE__THRESHOLD = eINSTANCE.getMBrickletTemperature_Threshold();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_TEMPERATURE___INIT = eINSTANCE.getMBrickletTemperature__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTemperatureIRImpl <em>MBricklet Temperature IR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTemperatureIRImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletTemperatureIR()
     * @generated
     */
    EClass MBRICKLET_TEMPERATURE_IR = eINSTANCE.getMBrickletTemperatureIR();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_TEMPERATURE_IR__DEVICE_TYPE = eINSTANCE.getMBrickletTemperatureIR_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice <em>MTemperature IR Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MTemperatureIRDevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTemperatureIRDevice()
     * @generated
     */
    EClass MTEMPERATURE_IR_DEVICE = eINSTANCE.getMTemperatureIRDevice();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MTEMPERATURE_IR_DEVICE__THRESHOLD = eINSTANCE.getMTemperatureIRDevice_Threshold();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.ObjectTemperatureImpl <em>Object Temperature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ObjectTemperatureImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getObjectTemperature()
     * @generated
     */
    EClass OBJECT_TEMPERATURE = eINSTANCE.getObjectTemperature();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_TEMPERATURE__DEVICE_TYPE = eINSTANCE.getObjectTemperature_DeviceType();

    /**
     * The meta object literal for the '<em><b>Emissivity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_TEMPERATURE__EMISSIVITY = eINSTANCE.getObjectTemperature_Emissivity();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.AmbientTemperatureImpl <em>Ambient Temperature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.AmbientTemperatureImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getAmbientTemperature()
     * @generated
     */
    EClass AMBIENT_TEMPERATURE = eINSTANCE.getAmbientTemperature();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AMBIENT_TEMPERATURE__DEVICE_TYPE = eINSTANCE.getAmbientTemperature_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTiltImpl <em>MBricklet Tilt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletTiltImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletTilt()
     * @generated
     */
    EClass MBRICKLET_TILT = eINSTANCE.getMBrickletTilt();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_TILT__DEVICE_TYPE = eINSTANCE.getMBrickletTilt_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletVoltageCurrentImpl <em>MBricklet Voltage Current</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletVoltageCurrentImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletVoltageCurrent()
     * @generated
     */
    EClass MBRICKLET_VOLTAGE_CURRENT = eINSTANCE.getMBrickletVoltageCurrent();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_VOLTAGE_CURRENT__DEVICE_TYPE = eINSTANCE.getMBrickletVoltageCurrent_DeviceType();

    /**
     * The meta object literal for the '<em><b>Averaging</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_VOLTAGE_CURRENT__AVERAGING = eINSTANCE.getMBrickletVoltageCurrent_Averaging();

    /**
     * The meta object literal for the '<em><b>Voltage Conversion Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_VOLTAGE_CURRENT__VOLTAGE_CONVERSION_TIME = eINSTANCE.getMBrickletVoltageCurrent_VoltageConversionTime();

    /**
     * The meta object literal for the '<em><b>Current Conversion Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_VOLTAGE_CURRENT__CURRENT_CONVERSION_TIME = eINSTANCE.getMBrickletVoltageCurrent_CurrentConversionTime();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.VoltageCurrentDevice <em>Voltage Current Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.VoltageCurrentDevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getVoltageCurrentDevice()
     * @generated
     */
    EClass VOLTAGE_CURRENT_DEVICE = eINSTANCE.getVoltageCurrentDevice();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.VCDeviceVoltageImpl <em>VC Device Voltage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.VCDeviceVoltageImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getVCDeviceVoltage()
     * @generated
     */
    EClass VC_DEVICE_VOLTAGE = eINSTANCE.getVCDeviceVoltage();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VC_DEVICE_VOLTAGE__DEVICE_TYPE = eINSTANCE.getVCDeviceVoltage_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VC_DEVICE_VOLTAGE__THRESHOLD = eINSTANCE.getVCDeviceVoltage_Threshold();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.VCDeviceCurrentImpl <em>VC Device Current</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.VCDeviceCurrentImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getVCDeviceCurrent()
     * @generated
     */
    EClass VC_DEVICE_CURRENT = eINSTANCE.getVCDeviceCurrent();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VC_DEVICE_CURRENT__DEVICE_TYPE = eINSTANCE.getVCDeviceCurrent_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VC_DEVICE_CURRENT__THRESHOLD = eINSTANCE.getVCDeviceCurrent_Threshold();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.VCDevicePowerImpl <em>VC Device Power</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.VCDevicePowerImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getVCDevicePower()
     * @generated
     */
    EClass VC_DEVICE_POWER = eINSTANCE.getVCDevicePower();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VC_DEVICE_POWER__DEVICE_TYPE = eINSTANCE.getVCDevicePower_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VC_DEVICE_POWER__THRESHOLD = eINSTANCE.getVCDevicePower_Threshold();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFBaseConfigurationImpl <em>TF Base Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFBaseConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFBaseConfiguration()
     * @generated
     */
    EClass TF_BASE_CONFIGURATION = eINSTANCE.getTFBaseConfiguration();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_BASE_CONFIGURATION__THRESHOLD = eINSTANCE.getTFBaseConfiguration_Threshold();

    /**
     * The meta object literal for the '<em><b>Callback Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_BASE_CONFIGURATION__CALLBACK_PERIOD = eINSTANCE.getTFBaseConfiguration_CallbackPeriod();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFObjectTemperatureConfigurationImpl <em>TF Object Temperature Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFObjectTemperatureConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFObjectTemperatureConfiguration()
     * @generated
     */
    EClass TF_OBJECT_TEMPERATURE_CONFIGURATION = eINSTANCE.getTFObjectTemperatureConfiguration();

    /**
     * The meta object literal for the '<em><b>Emissivity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_OBJECT_TEMPERATURE_CONFIGURATION__EMISSIVITY = eINSTANCE.getTFObjectTemperatureConfiguration_Emissivity();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFMoistureBrickletConfigurationImpl <em>TF Moisture Bricklet Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFMoistureBrickletConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFMoistureBrickletConfiguration()
     * @generated
     */
    EClass TF_MOISTURE_BRICKLET_CONFIGURATION = eINSTANCE.getTFMoistureBrickletConfiguration();

    /**
     * The meta object literal for the '<em><b>Moving Average</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_MOISTURE_BRICKLET_CONFIGURATION__MOVING_AVERAGE = eINSTANCE.getTFMoistureBrickletConfiguration_MovingAverage();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFDistanceUSBrickletConfigurationImpl <em>TF Distance US Bricklet Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFDistanceUSBrickletConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFDistanceUSBrickletConfiguration()
     * @generated
     */
    EClass TF_DISTANCE_US_BRICKLET_CONFIGURATION = eINSTANCE.getTFDistanceUSBrickletConfiguration();

    /**
     * The meta object literal for the '<em><b>Moving Average</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_DISTANCE_US_BRICKLET_CONFIGURATION__MOVING_AVERAGE = eINSTANCE.getTFDistanceUSBrickletConfiguration_MovingAverage();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.TFVoltageCurrentConfigurationImpl <em>TF Voltage Current Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.TFVoltageCurrentConfigurationImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTFVoltageCurrentConfiguration()
     * @generated
     */
    EClass TF_VOLTAGE_CURRENT_CONFIGURATION = eINSTANCE.getTFVoltageCurrentConfiguration();

    /**
     * The meta object literal for the '<em><b>Averaging</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_VOLTAGE_CURRENT_CONFIGURATION__AVERAGING = eINSTANCE.getTFVoltageCurrentConfiguration_Averaging();

    /**
     * The meta object literal for the '<em><b>Voltage Conversion Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_VOLTAGE_CURRENT_CONFIGURATION__VOLTAGE_CONVERSION_TIME = eINSTANCE.getTFVoltageCurrentConfiguration_VoltageConversionTime();

    /**
     * The meta object literal for the '<em><b>Current Conversion Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TF_VOLTAGE_CURRENT_CONFIGURATION__CURRENT_CONVERSION_TIME = eINSTANCE.getTFVoltageCurrentConfiguration_CurrentConversionTime();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletBarometerImpl <em>MBricklet Barometer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletBarometerImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletBarometer()
     * @generated
     */
    EClass MBRICKLET_BAROMETER = eINSTANCE.getMBrickletBarometer();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_BAROMETER__DEVICE_TYPE = eINSTANCE.getMBrickletBarometer_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_BAROMETER__THRESHOLD = eINSTANCE.getMBrickletBarometer_Threshold();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_BAROMETER___INIT = eINSTANCE.getMBrickletBarometer__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBarometerTemperatureImpl <em>MBarometer Temperature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBarometerTemperatureImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBarometerTemperature()
     * @generated
     */
    EClass MBAROMETER_TEMPERATURE = eINSTANCE.getMBarometerTemperature();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBAROMETER_TEMPERATURE__DEVICE_TYPE = eINSTANCE.getMBarometerTemperature_DeviceType();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBAROMETER_TEMPERATURE___INIT = eINSTANCE.getMBarometerTemperature__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletAmbientLightImpl <em>MBricklet Ambient Light</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletAmbientLightImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletAmbientLight()
     * @generated
     */
    EClass MBRICKLET_AMBIENT_LIGHT = eINSTANCE.getMBrickletAmbientLight();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_AMBIENT_LIGHT__DEVICE_TYPE = eINSTANCE.getMBrickletAmbientLight_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_AMBIENT_LIGHT__THRESHOLD = eINSTANCE.getMBrickletAmbientLight_Threshold();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_AMBIENT_LIGHT___INIT = eINSTANCE.getMBrickletAmbientLight__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSoundIntensityImpl <em>MBricklet Sound Intensity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletSoundIntensityImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletSoundIntensity()
     * @generated
     */
    EClass MBRICKLET_SOUND_INTENSITY = eINSTANCE.getMBrickletSoundIntensity();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_SOUND_INTENSITY__DEVICE_TYPE = eINSTANCE.getMBrickletSoundIntensity_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_SOUND_INTENSITY__THRESHOLD = eINSTANCE.getMBrickletSoundIntensity_Threshold();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_SOUND_INTENSITY___INIT = eINSTANCE.getMBrickletSoundIntensity__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMoistureImpl <em>MBricklet Moisture</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletMoistureImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletMoisture()
     * @generated
     */
    EClass MBRICKLET_MOISTURE = eINSTANCE.getMBrickletMoisture();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_MOISTURE__DEVICE_TYPE = eINSTANCE.getMBrickletMoisture_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_MOISTURE__THRESHOLD = eINSTANCE.getMBrickletMoisture_Threshold();

    /**
     * The meta object literal for the '<em><b>Moving Average</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_MOISTURE__MOVING_AVERAGE = eINSTANCE.getMBrickletMoisture_MovingAverage();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_MOISTURE___INIT = eINSTANCE.getMBrickletMoisture__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDistanceUSImpl <em>MBricklet Distance US</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletDistanceUSImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletDistanceUS()
     * @generated
     */
    EClass MBRICKLET_DISTANCE_US = eINSTANCE.getMBrickletDistanceUS();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_DISTANCE_US__DEVICE_TYPE = eINSTANCE.getMBrickletDistanceUS_DeviceType();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_DISTANCE_US__THRESHOLD = eINSTANCE.getMBrickletDistanceUS_Threshold();

    /**
     * The meta object literal for the '<em><b>Moving Average</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_DISTANCE_US__MOVING_AVERAGE = eINSTANCE.getMBrickletDistanceUS_MovingAverage();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_DISTANCE_US___INIT = eINSTANCE.getMBrickletDistanceUS__Init();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLCD20x4Impl <em>MBricklet LCD2 0x4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MBrickletLCD20x4Impl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMBrickletLCD20x4()
     * @generated
     */
    EClass MBRICKLET_LCD2_0X4 = eINSTANCE.getMBrickletLCD20x4();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_LCD2_0X4__DEVICE_TYPE = eINSTANCE.getMBrickletLCD20x4_DeviceType();

    /**
     * The meta object literal for the '<em><b>Position Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_LCD2_0X4__POSITION_PREFIX = eINSTANCE.getMBrickletLCD20x4_PositionPrefix();

    /**
     * The meta object literal for the '<em><b>Positon Suffix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_LCD2_0X4__POSITON_SUFFIX = eINSTANCE.getMBrickletLCD20x4_PositonSuffix();

    /**
     * The meta object literal for the '<em><b>Display Errors</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_LCD2_0X4__DISPLAY_ERRORS = eINSTANCE.getMBrickletLCD20x4_DisplayErrors();

    /**
     * The meta object literal for the '<em><b>Error Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBRICKLET_LCD2_0X4__ERROR_PREFIX = eINSTANCE.getMBrickletLCD20x4_ErrorPrefix();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_LCD2_0X4___INIT = eINSTANCE.getMBrickletLCD20x4__Init();

    /**
     * The meta object literal for the '<em><b>Clear</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MBRICKLET_LCD2_0X4___CLEAR = eINSTANCE.getMBrickletLCD20x4__Clear();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MTextActor <em>MText Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MTextActor
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTextActor()
     * @generated
     */
    EClass MTEXT_ACTOR = eINSTANCE.getMTextActor();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MTEXT_ACTOR__TEXT = eINSTANCE.getMTextActor_Text();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MLCDSubDevice <em>MLCD Sub Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MLCDSubDevice
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMLCDSubDevice()
     * @generated
     */
    EClass MLCD_SUB_DEVICE = eINSTANCE.getMLCDSubDevice();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MLCD20x4BacklightImpl <em>MLCD2 0x4 Backlight</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MLCD20x4BacklightImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMLCD20x4Backlight()
     * @generated
     */
    EClass MLCD2_0X4_BACKLIGHT = eINSTANCE.getMLCD20x4Backlight();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MLCD2_0X4_BACKLIGHT__DEVICE_TYPE = eINSTANCE.getMLCD20x4Backlight_DeviceType();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.impl.MLCD20x4ButtonImpl <em>MLCD2 0x4 Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.impl.MLCD20x4ButtonImpl
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMLCD20x4Button()
     * @generated
     */
    EClass MLCD2_0X4_BUTTON = eINSTANCE.getMLCD20x4Button();

    /**
     * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MLCD2_0X4_BUTTON__DEVICE_TYPE = eINSTANCE.getMLCD20x4Button_DeviceType();

    /**
     * The meta object literal for the '<em><b>Button Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MLCD2_0X4_BUTTON__BUTTON_NUM = eINSTANCE.getMLCD20x4Button_ButtonNum();

    /**
     * The meta object literal for the '<em>Switch State</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.types.OnOffValue
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getSwitchState()
     * @generated
     */
    EDataType SWITCH_STATE = eINSTANCE.getSwitchState();

    /**
     * The meta object literal for the '<em>Digital Value</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.types.HighLowValue
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDigitalValue()
     * @generated
     */
    EDataType DIGITAL_VALUE = eINSTANCE.getDigitalValue();

    /**
     * The meta object literal for the '<em>HSB Value</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.types.HSBValue
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getHSBValue()
     * @generated
     */
    EDataType HSB_VALUE = eINSTANCE.getHSBValue();

    /**
     * The meta object literal for the '<em>Tinker Bricklet IO16</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletIO16
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletIO16()
     * @generated
     */
    EDataType TINKER_BRICKLET_IO16 = eINSTANCE.getTinkerBrickletIO16();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.DCDriveMode <em>DC Drive Mode</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.DCDriveMode
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDCDriveMode()
     * @generated
     */
    EEnum DC_DRIVE_MODE = eINSTANCE.getDCDriveMode();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsServo <em>Config Opts Servo</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsServo
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getConfigOptsServo()
     * @generated
     */
    EEnum CONFIG_OPTS_SERVO = eINSTANCE.getConfigOptsServo();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonDevicePosition <em>Dual Button Device Position</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.DualButtonDevicePosition
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonDevicePosition()
     * @generated
     */
    EEnum DUAL_BUTTON_DEVICE_POSITION = eINSTANCE.getDualButtonDevicePosition();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonLedSubIds <em>Dual Button Led Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.DualButtonLedSubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonLedSubIds()
     * @generated
     */
    EEnum DUAL_BUTTON_LED_SUB_IDS = eINSTANCE.getDualButtonLedSubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.DualButtonButtonSubIds <em>Dual Button Button Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.DualButtonButtonSubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualButtonButtonSubIds()
     * @generated
     */
    EEnum DUAL_BUTTON_BUTTON_SUB_IDS = eINSTANCE.getDualButtonButtonSubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.JoystickSubIds <em>Joystick Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.JoystickSubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getJoystickSubIds()
     * @generated
     */
    EEnum JOYSTICK_SUB_IDS = eINSTANCE.getJoystickSubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.PTCSubIds <em>PTC Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.PTCSubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPTCSubIds()
     * @generated
     */
    EEnum PTC_SUB_IDS = eINSTANCE.getPTCSubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialDual020mASubIds <em>Industrial Dual020m ASub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.IndustrialDual020mASubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIndustrialDual020mASubIds()
     * @generated
     */
    EEnum INDUSTRIAL_DUAL020M_ASUB_IDS = eINSTANCE.getIndustrialDual020mASubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.NoSubIds <em>No Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.NoSubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getNoSubIds()
     * @generated
     */
    EEnum NO_SUB_IDS = eINSTANCE.getNoSubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalInSubIDs <em>Industrial Digital In Sub IDs</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalInSubIDs
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIndustrialDigitalInSubIDs()
     * @generated
     */
    EEnum INDUSTRIAL_DIGITAL_IN_SUB_IDS = eINSTANCE.getIndustrialDigitalInSubIDs();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalOutSubIDs <em>Industrial Digital Out Sub IDs</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.IndustrialDigitalOutSubIDs
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIndustrialDigitalOutSubIDs()
     * @generated
     */
    EEnum INDUSTRIAL_DIGITAL_OUT_SUB_IDS = eINSTANCE.getIndustrialDigitalOutSubIDs();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.IndustrialQuadRelayIDs <em>Industrial Quad Relay IDs</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.IndustrialQuadRelayIDs
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIndustrialQuadRelayIDs()
     * @generated
     */
    EEnum INDUSTRIAL_QUAD_RELAY_IDS = eINSTANCE.getIndustrialQuadRelayIDs();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.ServoSubIDs <em>Servo Sub IDs</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.ServoSubIDs
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getServoSubIDs()
     * @generated
     */
    EEnum SERVO_SUB_IDS = eINSTANCE.getServoSubIDs();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.BarometerSubIDs <em>Barometer Sub IDs</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.BarometerSubIDs
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getBarometerSubIDs()
     * @generated
     */
    EEnum BAROMETER_SUB_IDS = eINSTANCE.getBarometerSubIDs();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.IO16SubIds <em>IO16 Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.IO16SubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIO16SubIds()
     * @generated
     */
    EEnum IO16_SUB_IDS = eINSTANCE.getIO16SubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.IO4SubIds <em>IO4 Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.IO4SubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIO4SubIds()
     * @generated
     */
    EEnum IO4_SUB_IDS = eINSTANCE.getIO4SubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.DualRelaySubIds <em>Dual Relay Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.DualRelaySubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDualRelaySubIds()
     * @generated
     */
    EEnum DUAL_RELAY_SUB_IDS = eINSTANCE.getDualRelaySubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.LCDButtonSubIds <em>LCD Button Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.LCDButtonSubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getLCDButtonSubIds()
     * @generated
     */
    EEnum LCD_BUTTON_SUB_IDS = eINSTANCE.getLCDButtonSubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.LCDBacklightSubIds <em>LCD Backlight Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.LCDBacklightSubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getLCDBacklightSubIds()
     * @generated
     */
    EEnum LCD_BACKLIGHT_SUB_IDS = eINSTANCE.getLCDBacklightSubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.MultiTouchSubIds <em>Multi Touch Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.MultiTouchSubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMultiTouchSubIds()
     * @generated
     */
    EEnum MULTI_TOUCH_SUB_IDS = eINSTANCE.getMultiTouchSubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.TemperatureIRSubIds <em>Temperature IR Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.TemperatureIRSubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTemperatureIRSubIds()
     * @generated
     */
    EEnum TEMPERATURE_IR_SUB_IDS = eINSTANCE.getTemperatureIRSubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.VoltageCurrentSubIds <em>Voltage Current Sub Ids</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.VoltageCurrentSubIds
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getVoltageCurrentSubIds()
     * @generated
     */
    EEnum VOLTAGE_CURRENT_SUB_IDS = eINSTANCE.getVoltageCurrentSubIds();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsMove <em>Config Opts Move</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsMove
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getConfigOptsMove()
     * @generated
     */
    EEnum CONFIG_OPTS_MOVE = eINSTANCE.getConfigOptsMove();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsDimmable <em>Config Opts Dimmable</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsDimmable
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getConfigOptsDimmable()
     * @generated
     */
    EEnum CONFIG_OPTS_DIMMABLE = eINSTANCE.getConfigOptsDimmable();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsSetPoint <em>Config Opts Set Point</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsSetPoint
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getConfigOptsSetPoint()
     * @generated
     */
    EEnum CONFIG_OPTS_SET_POINT = eINSTANCE.getConfigOptsSetPoint();

    /**
     * The meta object literal for the '{@link org.openhab.binding.tinkerforge.internal.model.ConfigOptsSwitchSpeed <em>Config Opts Switch Speed</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.model.ConfigOptsSwitchSpeed
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getConfigOptsSwitchSpeed()
     * @generated
     */
    EEnum CONFIG_OPTS_SWITCH_SPEED = eINSTANCE.getConfigOptsSwitchSpeed();

    /**
     * The meta object literal for the '<em>MIP Connection</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.IPConnection
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMIPConnection()
     * @generated
     */
    EDataType MIP_CONNECTION = eINSTANCE.getMIPConnection();

    /**
     * The meta object literal for the '<em>MTinker Device</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.Device
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerDevice()
     * @generated
     */
    EDataType MTINKER_DEVICE = eINSTANCE.getMTinkerDevice();

    /**
     * The meta object literal for the '<em>MLogger</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slf4j.Logger
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMLogger()
     * @generated
     */
    EDataType MLOGGER = eINSTANCE.getMLogger();

    /**
     * The meta object literal for the '<em>MAtomic Boolean</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.concurrent.atomic.AtomicBoolean
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMAtomicBoolean()
     * @generated
     */
    EDataType MATOMIC_BOOLEAN = eINSTANCE.getMAtomicBoolean();

    /**
     * The meta object literal for the '<em>MTinkerforge Device</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.Device
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerforgeDevice()
     * @generated
     */
    EDataType MTINKERFORGE_DEVICE = eINSTANCE.getMTinkerforgeDevice();

    /**
     * The meta object literal for the '<em>MTinker Brick DC</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickDC
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickDC()
     * @generated
     */
    EDataType MTINKER_BRICK_DC = eINSTANCE.getMTinkerBrickDC();

    /**
     * The meta object literal for the '<em>MTinker Brick Servo</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickServo
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickServo()
     * @generated
     */
    EDataType MTINKER_BRICK_SERVO = eINSTANCE.getMTinkerBrickServo();

    /**
     * The meta object literal for the '<em>MTinkerforge Value</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.types.TinkerforgeValue
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerforgeValue()
     * @generated
     */
    EDataType MTINKERFORGE_VALUE = eINSTANCE.getMTinkerforgeValue();

    /**
     * The meta object literal for the '<em>MDecimal Value</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.types.DecimalValue
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMDecimalValue()
     * @generated
     */
    EDataType MDECIMAL_VALUE = eINSTANCE.getMDecimalValue();

    /**
     * The meta object literal for the '<em>MTinker Bricklet Humidity</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletHumidity
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletHumidity()
     * @generated
     */
    EDataType MTINKER_BRICKLET_HUMIDITY = eINSTANCE.getMTinkerBrickletHumidity();

    /**
     * The meta object literal for the '<em>MTinker Bricklet Distance IR</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletDistanceIR
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletDistanceIR()
     * @generated
     */
    EDataType MTINKER_BRICKLET_DISTANCE_IR = eINSTANCE.getMTinkerBrickletDistanceIR();

    /**
     * The meta object literal for the '<em>MTinker Bricklet Temperature</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletTemperature
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletTemperature()
     * @generated
     */
    EDataType MTINKER_BRICKLET_TEMPERATURE = eINSTANCE.getMTinkerBrickletTemperature();

    /**
     * The meta object literal for the '<em>MTinker Bricklet Barometer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletBarometer
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletBarometer()
     * @generated
     */
    EDataType MTINKER_BRICKLET_BAROMETER = eINSTANCE.getMTinkerBrickletBarometer();

    /**
     * The meta object literal for the '<em>MTinker Bricklet Ambient Light</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletAmbientLight
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletAmbientLight()
     * @generated
     */
    EDataType MTINKER_BRICKLET_AMBIENT_LIGHT = eINSTANCE.getMTinkerBrickletAmbientLight();

    /**
     * The meta object literal for the '<em>MTinker Bricklet LCD2 0x4</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletLCD20x4
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletLCD20x4()
     * @generated
     */
    EDataType MTINKER_BRICKLET_LCD2_0X4 = eINSTANCE.getMTinkerBrickletLCD20x4();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Remote Switch</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletRemoteSwitch
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletRemoteSwitch()
     * @generated
     */
    EDataType TINKER_BRICKLET_REMOTE_SWITCH = eINSTANCE.getTinkerBrickletRemoteSwitch();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Motion Detector</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletMotionDetector
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletMotionDetector()
     * @generated
     */
    EDataType TINKER_BRICKLET_MOTION_DETECTOR = eINSTANCE.getTinkerBrickletMotionDetector();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Multi Touch</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletMultiTouch
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletMultiTouch()
     * @generated
     */
    EDataType TINKER_BRICKLET_MULTI_TOUCH = eINSTANCE.getTinkerBrickletMultiTouch();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Temperature IR</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletTemperatureIR
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletTemperatureIR()
     * @generated
     */
    EDataType TINKER_BRICKLET_TEMPERATURE_IR = eINSTANCE.getTinkerBrickletTemperatureIR();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Sound Intensity</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletSoundIntensity
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletSoundIntensity()
     * @generated
     */
    EDataType TINKER_BRICKLET_SOUND_INTENSITY = eINSTANCE.getTinkerBrickletSoundIntensity();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Moisture</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletMoisture
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletMoisture()
     * @generated
     */
    EDataType TINKER_BRICKLET_MOISTURE = eINSTANCE.getTinkerBrickletMoisture();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Distance US</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletDistanceUS
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletDistanceUS()
     * @generated
     */
    EDataType TINKER_BRICKLET_DISTANCE_US = eINSTANCE.getTinkerBrickletDistanceUS();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Voltage Current</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletVoltageCurrent
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletVoltageCurrent()
     * @generated
     */
    EDataType TINKER_BRICKLET_VOLTAGE_CURRENT = eINSTANCE.getTinkerBrickletVoltageCurrent();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Tilt</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletTilt
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletTilt()
     * @generated
     */
    EDataType TINKER_BRICKLET_TILT = eINSTANCE.getTinkerBrickletTilt();

    /**
     * The meta object literal for the '<em>Tinker Bricklet IO4</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletIO4
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletIO4()
     * @generated
     */
    EDataType TINKER_BRICKLET_IO4 = eINSTANCE.getTinkerBrickletIO4();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Hall Effect</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletHallEffect
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletHallEffect()
     * @generated
     */
    EDataType TINKER_BRICKLET_HALL_EFFECT = eINSTANCE.getTinkerBrickletHallEffect();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Segment Display4x7</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletSegmentDisplay4x7
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletSegmentDisplay4x7()
     * @generated
     */
    EDataType TINKER_BRICKLET_SEGMENT_DISPLAY4X7 = eINSTANCE.getTinkerBrickletSegmentDisplay4x7();

    /**
     * The meta object literal for the '<em>Tinker Bricklet LED Strip</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletLEDStrip
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletLEDStrip()
     * @generated
     */
    EDataType TINKER_BRICKLET_LED_STRIP = eINSTANCE.getTinkerBrickletLEDStrip();

    /**
     * The meta object literal for the '<em>Bricklet Joystick</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletJoystick
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getBrickletJoystick()
     * @generated
     */
    EDataType BRICKLET_JOYSTICK = eINSTANCE.getBrickletJoystick();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Linear Poti</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletLinearPoti
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletLinearPoti()
     * @generated
     */
    EDataType TINKER_BRICKLET_LINEAR_POTI = eINSTANCE.getTinkerBrickletLinearPoti();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Dual Button</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletDualButton
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletDualButton()
     * @generated
     */
    EDataType TINKER_BRICKLET_DUAL_BUTTON = eINSTANCE.getTinkerBrickletDualButton();

    /**
     * The meta object literal for the '<em>Tinker Bricklet PTC</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletPTC
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletPTC()
     * @generated
     */
    EDataType TINKER_BRICKLET_PTC = eINSTANCE.getTinkerBrickletPTC();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Industrial Dual020m A</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletIndustrialDual020mA
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletIndustrialDual020mA()
     * @generated
     */
    EDataType TINKER_BRICKLET_INDUSTRIAL_DUAL020M_A = eINSTANCE.getTinkerBrickletIndustrialDual020mA();

    /**
     * The meta object literal for the '<em>Tinker Bricklet Solid State Relay</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletSolidStateRelay
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getTinkerBrickletSolidStateRelay()
     * @generated
     */
    EDataType TINKER_BRICKLET_SOLID_STATE_RELAY = eINSTANCE.getTinkerBrickletSolidStateRelay();

    /**
     * The meta object literal for the '<em>HSB Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.core.library.types.HSBType
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getHSBType()
     * @generated
     */
    EDataType HSB_TYPE = eINSTANCE.getHSBType();

    /**
     * The meta object literal for the '<em>Up Down Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.core.library.types.UpDownType
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getUpDownType()
     * @generated
     */
    EDataType UP_DOWN_TYPE = eINSTANCE.getUpDownType();

    /**
     * The meta object literal for the '<em>Percent Value</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.types.PercentValue
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPercentValue()
     * @generated
     */
    EDataType PERCENT_VALUE = eINSTANCE.getPercentValue();

    /**
     * The meta object literal for the '<em>Device Options</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.config.DeviceOptions
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDeviceOptions()
     * @generated
     */
    EDataType DEVICE_OPTIONS = eINSTANCE.getDeviceOptions();

    /**
     * The meta object literal for the '<em>Percent Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.core.library.types.PercentType
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getPercentType()
     * @generated
     */
    EDataType PERCENT_TYPE = eINSTANCE.getPercentType();

    /**
     * The meta object literal for the '<em>Increase Decrease Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.core.library.types.IncreaseDecreaseType
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getIncreaseDecreaseType()
     * @generated
     */
    EDataType INCREASE_DECREASE_TYPE = eINSTANCE.getIncreaseDecreaseType();

    /**
     * The meta object literal for the '<em>Direction Value</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.binding.tinkerforge.internal.types.DirectionValue
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getDirectionValue()
     * @generated
     */
    EDataType DIRECTION_VALUE = eINSTANCE.getDirectionValue();

    /**
     * The meta object literal for the '<em>Enum</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Enum
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getEnum()
     * @generated
     */
    EDataType ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em>MTinker Bricklet Dual Relay</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletDualRelay
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletDualRelay()
     * @generated
     */
    EDataType MTINKER_BRICKLET_DUAL_RELAY = eINSTANCE.getMTinkerBrickletDualRelay();

    /**
     * The meta object literal for the '<em>MTinker Bricklet Industrial Quad Relay</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletIndustrialQuadRelay
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletIndustrialQuadRelay()
     * @generated
     */
    EDataType MTINKER_BRICKLET_INDUSTRIAL_QUAD_RELAY = eINSTANCE.getMTinkerBrickletIndustrialQuadRelay();

    /**
     * The meta object literal for the '<em>MTinker Bricklet Industrial Digital In4</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletIndustrialDigitalIn4
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletIndustrialDigitalIn4()
     * @generated
     */
    EDataType MTINKER_BRICKLET_INDUSTRIAL_DIGITAL_IN4 = eINSTANCE.getMTinkerBrickletIndustrialDigitalIn4();

    /**
     * The meta object literal for the '<em>MTinker Bricklet Industrial Digital Out4</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tinkerforge.BrickletIndustrialDigitalOut4
     * @see org.openhab.binding.tinkerforge.internal.model.impl.ModelPackageImpl#getMTinkerBrickletIndustrialDigitalOut4()
     * @generated
     */
    EDataType MTINKER_BRICKLET_INDUSTRIAL_DIGITAL_OUT4 = eINSTANCE.getMTinkerBrickletIndustrialDigitalOut4();

  }

} //ModelPackage
