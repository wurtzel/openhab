/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.nibeheatpump.protocol;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.openhab.binding.nibeheatpump.internal.NibeHeatPumpException;

/**
 * Class for parse data packets from Nibe heat pumps
 * 
 * @author Pauli Anttila
 * @since 1.3.0
 */
public class NibeHeatPumpDataParser {

	public enum NibeDataType {
		U8, U16, U32, S8, S16, S32;
	}

	public enum Type {
		Sensor, Status, Settings;
	}

	public static class VariableInformation {

		public double factor;
		public String variable;
		public NibeDataType dataType;
		public Type type;

		public VariableInformation() {
		}

		public VariableInformation(double factor, String variable,
				NibeDataType dataType, Type type) {
			this.factor = factor;
			this.variable = variable;
			this.dataType = dataType;
			this.type = type;
		}

	}
	
	@SuppressWarnings("serial")
	public static final Map<Integer, VariableInformation> VARIABLE_INFO_F750 = 
	Collections.unmodifiableMap(new HashMap<Integer, VariableInformation>() {{
		put(40004, new VariableInformation(10,	"BT1 Outdoor temp",								NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40005, new VariableInformation(10,	"EB23-BT2 Supply temp S4",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40006, new VariableInformation(10,	"EB22-BT2 Supply temp S3",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40007, new VariableInformation(10,	"EB21-BT2 Supply temp S2",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40008, new VariableInformation(10,	"BT2 Supply temp S1",							NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40012, new VariableInformation(10,	"EB100-EP14-BT3 Return temp",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40013, new VariableInformation(10,	"BT7 Hot Water top",							NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40014, new VariableInformation(10,	"BT6 Hot Water load",							NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40017, new VariableInformation(10,	"EB100-EP14-BT12 Cond. out",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40018, new VariableInformation(10,	"EB100-EP14-BT14 Hot gas temp",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40019, new VariableInformation(10,	"EB100-EP14-BT15 Liquid line",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40020, new VariableInformation(10,	"EB100-BT16 Evaporator temp",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40022, new VariableInformation(10,	"EB100-EP14-BT17 Suction",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40025, new VariableInformation(10,	"EB100-BT20 Exhaust air temp.",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40026, new VariableInformation(10,	"EB100-BT21 Vented air temp.",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40030, new VariableInformation(10,	"EB23-BT50 Room Temp S4",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40031, new VariableInformation(10,	"EB22-BT50 Room Temp S3",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40032, new VariableInformation(10,	"EB21-BT50 Room Temp S2",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40033, new VariableInformation(10,	"BT50 Room Temp S1",							NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40045, new VariableInformation(10,	"EQ1-BT64 PCS4 Supply Temp",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40047, new VariableInformation(10,	"EB100-BT61 Supply Radiator Temp",				NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40048, new VariableInformation(10,	"EB100-BT62 Return Radiator Temp",				NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40050, new VariableInformation(10,	"EB100-BS1 Air flow",							NibeDataType.S16,	Type.Sensor));		// Unit: 
		put(40051, new VariableInformation(100,	"EB100-BS1 Air flow unfiltered",				NibeDataType.S16,	Type.Sensor));		// Unit: 
		put(40054, new VariableInformation(1,	"EB100-FD1 Temperature limiter",				NibeDataType.S16,	Type.Sensor));		// Unit: 
		put(40067, new VariableInformation(10,	"BT1 Average",									NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40071, new VariableInformation(10,	"BT25 external supply temp",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40072, new VariableInformation(10,	"BF1 Flow",										NibeDataType.S16,	Type.Sensor));		// Unit: l/m
		put(40074, new VariableInformation(1,	"EB100-FR1 Anode Status",						NibeDataType.S16,	Type.Sensor));		// Unit: 
		put(40077, new VariableInformation(10,	"BT6 external water heater load temp.",			NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40078, new VariableInformation(10,	"BT7 external water heater top temp.",			NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40079, new VariableInformation(10,	"EB100-BE3 Current Phase 3",					NibeDataType.S32,	Type.Sensor));		// Unit: A
		put(40081, new VariableInformation(10,	"EB100-BE2 Current Phase 2",					NibeDataType.S32,	Type.Sensor));		// Unit: A
		put(40083, new VariableInformation(10,	"EB100-BE1 Current Phase 1",					NibeDataType.S32,	Type.Sensor));		// Unit: A
		put(40107, new VariableInformation(10,	"EB100-BT20 Exhaust air temp.",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40108, new VariableInformation(10,	"EB100-BT20 Exhaust air temp.",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40109, new VariableInformation(10,	"EB100-BT20 Exhaust air temp.",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40110, new VariableInformation(10,	"EB100-BT21 Vented air temp.",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40111, new VariableInformation(10,	"EB100-BT21 Vented air temp.",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40112, new VariableInformation(10,	"EB100-BT21 Vented air temp.",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40127, new VariableInformation(10,	"EB23-BT3 Return temp S4",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40128, new VariableInformation(10,	"EB22-BT3 Return temp S3",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40129, new VariableInformation(10,	"EB21-BT3 Return temp S2",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40141, new VariableInformation(10,	"AZ2-BT22 Supply air temp. SAM",				NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40142, new VariableInformation(10,	"AZ2-BT23 Outdoor temp. SAM",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40143, new VariableInformation(10,	"AZ2-BT68 Flow temp. SAM",						NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40144, new VariableInformation(10,	"AZ2-BT69 Return temp. SAM",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40157, new VariableInformation(10,	"EP30-BT53 Solar Panel Temp",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(40158, new VariableInformation(10,	"EP30-BT54 Solar Load Temp",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(43001, new VariableInformation(1,	"Software version",								NibeDataType.U16,	Type.Sensor));		// Unit: 
		put(43005, new VariableInformation(10,	"Degree Minutes",								NibeDataType.S16,	Type.Sensor));		// Unit: 
		put(43006, new VariableInformation(10,	"Calculated Supply Temperature S4",				NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(43007, new VariableInformation(10,	"Calculated Supply Temperature S3",				NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(43008, new VariableInformation(10,	"Calculated Supply Temperature S2",				NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(43009, new VariableInformation(10,	"Calculated Supply Temperature S1",				NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(43013, new VariableInformation(1,	"Freeze Protection Status",						NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(43061, new VariableInformation(1,	"t. after start timer",							NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(43062, new VariableInformation(1,	"t. after mode change",							NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(43064, new VariableInformation(10,	"HMF dT set.",									NibeDataType.S16,	Type.Sensor));		// Unit: 
		put(43065, new VariableInformation(10,	"HMF dT act.",									NibeDataType.S16,	Type.Sensor));		// Unit: 
		put(43081, new VariableInformation(10,	"Tot. op.time add.",							NibeDataType.S32,	Type.Sensor));		// Unit: h
		put(43084, new VariableInformation(100,	"Int. el.add. Power",							NibeDataType.S16,	Type.Sensor));		// Unit: kW
		put(43086, new VariableInformation(1,	"Prio",											NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(43091, new VariableInformation(1,	"Int. el.add. State",							NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(43108, new VariableInformation(1,	"Fan speed current",							NibeDataType.U8,	Type.Sensor));		// Unit: %
		put(43122, new VariableInformation(1,	"Compr. current min.freq.",						NibeDataType.S16,	Type.Sensor));		// Unit: Hz
		put(43123, new VariableInformation(1,	"Compr. current max.freq.",						NibeDataType.S16,	Type.Sensor));		// Unit: Hz
		put(43124, new VariableInformation(10,	"Airflow ref.",									NibeDataType.S16,	Type.Sensor));		// Unit: 
		put(43132, new VariableInformation(1,	"Inverter com. timer",							NibeDataType.U16,	Type.Sensor));		// Unit: sec
		put(43133, new VariableInformation(1,	"Inverter drive status",						NibeDataType.U16,	Type.Sensor));		// Unit: 
		put(43136, new VariableInformation(10,	"Compr. current freq.",							NibeDataType.U16,	Type.Sensor));		// Unit: Hz
		put(43137, new VariableInformation(1,	"Inverter alarm code",							NibeDataType.U16,	Type.Sensor));		// Unit: 
		put(43138, new VariableInformation(1,	"Inverter fault code",							NibeDataType.U16,	Type.Sensor));		// Unit: 
		put(43140, new VariableInformation(10,	"compr. temp.",									NibeDataType.S16,	Type.Sensor));		// Unit: �C
//		put(43141, new VariableInformation(1,	"compr. in power",								NibeDataType.U16,	Type.Sensor));		// Unit: W
		put(43141, new VariableInformation(0.1,	"compr. in power",								NibeDataType.U16,	Type.Sensor));		// Unit: W
		put(43144, new VariableInformation(100,	"Compr. energy total",							NibeDataType.U32,	Type.Sensor));		// Unit: kWh
		put(43147, new VariableInformation(1,	"Compr. in current",							NibeDataType.S16,	Type.Sensor));		// Unit: A
		put(43181, new VariableInformation(1,	"Chargepump speed",								NibeDataType.S16,	Type.Sensor));		// Unit: 
		put(43182, new VariableInformation(1,	"Compr. freq. setpoint",						NibeDataType.U16,	Type.Sensor));		// Unit: Hz
		put(43239, new VariableInformation(10,	"Tot. HW op.time add.",							NibeDataType.S32,	Type.Sensor));		// Unit: h
		put(43305, new VariableInformation(100,	"Compr. energy HW",								NibeDataType.U32,	Type.Sensor));		// Unit: kWh
		put(43375, new VariableInformation(1,	"compr. in power mean",							NibeDataType.S16,	Type.Sensor));		// Unit: W
		put(43382, new VariableInformation(1,	"Inverter mem error code",						NibeDataType.U16,	Type.Sensor));		// Unit: 
		put(43416, new VariableInformation(1,	"Compressor starts EB100-EP14",					NibeDataType.S32,	Type.Sensor));		// Unit: 
		put(43420, new VariableInformation(1,	"Tot. op.time compr. EB100-EP14",				NibeDataType.S32,	Type.Sensor));		// Unit: h
		put(43424, new VariableInformation(1,	"Tot. HW op.time compr. EB100-EP14",			NibeDataType.S32,	Type.Sensor));		// Unit: h
		put(43427, new VariableInformation(1,	"Compressor State EP14",						NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(43435, new VariableInformation(1,	"Compressor status EP14",						NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(43437, new VariableInformation(1,	"HM-pump Status EP14",							NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(43514, new VariableInformation(1,	"PCA-Base Relays EP14",							NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(43516, new VariableInformation(1,	"PCA-Power Relays EP14",						NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(43542, new VariableInformation(10,	"Calculated supply air temp.",					NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(44258, new VariableInformation(1,	"External supply air accessory relays",			NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(44267, new VariableInformation(10,	"Calc. Cooling Supply Temperature S4",			NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(44268, new VariableInformation(10,	"Calc. Cooling Supply Temperature S3",			NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(44269, new VariableInformation(10,	"Calc. Cooling Supply Temperature S2",			NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(44270, new VariableInformation(10,	"Calc. Cooling Supply Temperature S1",			NibeDataType.S16,	Type.Sensor));		// Unit: �C
		put(44317, new VariableInformation(1,	"SCA accessory relays",							NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(44331, new VariableInformation(1,	"Software release",								NibeDataType.U8,	Type.Sensor));		// Unit: 
		put(45001, new VariableInformation(1,	"Alarm number",									NibeDataType.S16,	Type.Sensor));		// Unit: 
		put(47062, new VariableInformation(10,	"HW charge offset",								NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47291, new VariableInformation(1,	"Floor drying timer",							NibeDataType.U16,	Type.Settings));	// Unit: hrs
		put(47004, new VariableInformation(1,	"Heat curve S4",								NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47005, new VariableInformation(1,	"Heat curve S3",								NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47006, new VariableInformation(1,	"Heat curve S2",								NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47007, new VariableInformation(1,	"Heat curve S1",								NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47008, new VariableInformation(1,	"Offset S4",									NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47009, new VariableInformation(1,	"Offset S3",									NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47010, new VariableInformation(1,	"Offset S2",									NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47011, new VariableInformation(1,	"Offset S1",									NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47012, new VariableInformation(10,	"Min Supply System 4",							NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47013, new VariableInformation(10,	"Min Supply System 3",							NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47014, new VariableInformation(10,	"Min Supply System 2",							NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47015, new VariableInformation(10,	"Min Supply System 1",							NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47016, new VariableInformation(10,	"Max Supply System 4",							NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47017, new VariableInformation(10,	"Max Supply System 3",							NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47018, new VariableInformation(10,	"Max Supply System 2",							NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47019, new VariableInformation(10,	"Max Supply System 1",							NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47020, new VariableInformation(1,	"Own Curve P7",									NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47021, new VariableInformation(1,	"Own Curve P6",									NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47022, new VariableInformation(1,	"Own Curve P5",									NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47023, new VariableInformation(1,	"Own Curve P4",									NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47024, new VariableInformation(1,	"Own Curve P3",									NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47025, new VariableInformation(1,	"Own Curve P2",									NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47026, new VariableInformation(1,	"Own Curve P1",									NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47027, new VariableInformation(1,	"Point offset outdoor temp.",					NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47028, new VariableInformation(1,	"Point offset",									NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47029, new VariableInformation(1,	"External adjustment S4",						NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47030, new VariableInformation(1,	"External adjustment S3",						NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47031, new VariableInformation(1,	"External adjustment S2",						NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47032, new VariableInformation(1,	"External adjustment S1",						NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47033, new VariableInformation(10,	"External adjustment with room sensor S4",		NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47034, new VariableInformation(10,	"External adjustment with room sensor S3",		NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47035, new VariableInformation(10,	"External adjustment with room sensor S2",		NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47036, new VariableInformation(10,	"External adjustment with room sensor S1",		NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47041, new VariableInformation(1,	"Hot water mode",								NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47043, new VariableInformation(10,	"Start temperature HW Luxury",					NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47044, new VariableInformation(10,	"Start temperature HW Normal",					NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47045, new VariableInformation(10,	"Start temperature HW Economy",					NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47046, new VariableInformation(10,	"Stop temperature Periodic HW",					NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47047, new VariableInformation(10,	"Stop temperature HW Luxury",					NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47048, new VariableInformation(10,	"Stop temperature HW Normal",					NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47049, new VariableInformation(10,	"Stop temperature HW Economy",					NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47050, new VariableInformation(1,	"Periodic HW",									NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47051, new VariableInformation(1,	"Periodic HW Interval",							NibeDataType.S8,	Type.Settings));	// Unit: days
		put(47054, new VariableInformation(1,	"Run time HWC",									NibeDataType.S8,	Type.Settings));	// Unit: min
		put(47055, new VariableInformation(1,	"Still time HWC",								NibeDataType.S8,	Type.Settings));	// Unit: min
		put(47092, new VariableInformation(1,	"Manual compfreq HW",							NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47093, new VariableInformation(1,	"Manual compfreq speed HW",						NibeDataType.U16,	Type.Settings));	// Unit: Hz
		put(47094, new VariableInformation(1,	"Sec per compfreq step",						NibeDataType.U8,	Type.Settings));	// Unit: s
		put(47095, new VariableInformation(1,	"Max compfreq step",							NibeDataType.U8,	Type.Settings));	// Unit: Hz
		put(47096, new VariableInformation(1,	"Manual compfreq Heating",						NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47097, new VariableInformation(1,	"Min speed after start",						NibeDataType.U8,	Type.Settings));	// Unit: Min
		put(47098, new VariableInformation(1,	"Min speed after HW",							NibeDataType.U8,	Type.Settings));	// Unit: Min
		put(47099, new VariableInformation(1,	"GMz",											NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47100, new VariableInformation(10,	"Max diff VBF-BerVBF",							NibeDataType.U8,	Type.Settings));	// Unit: �C
		put(47101, new VariableInformation(1,	"Comp freq reg P",								NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47102, new VariableInformation(1,	"Comp freq max delta F",						NibeDataType.S8,	Type.Settings));	// Unit: Hz
		put(47103, new VariableInformation(1,	"Min comp freq",								NibeDataType.S16,	Type.Settings));	// Unit: Hz
		put(47104, new VariableInformation(1,	"Max comp freq",								NibeDataType.S16,	Type.Settings));	// Unit: Hz
		put(47105, new VariableInformation(1,	"Comp freq heating",							NibeDataType.S16,	Type.Settings));	// Unit: Hz
		put(47131, new VariableInformation(1,	"Language",										NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47134, new VariableInformation(1,	"Period HW",									NibeDataType.U8,	Type.Settings));	// Unit: min
		put(47135, new VariableInformation(1,	"Period Heat",									NibeDataType.U8,	Type.Settings));	// Unit: min
		put(47136, new VariableInformation(1,	"Period Pool",									NibeDataType.U8,	Type.Settings));	// Unit: min
		put(47138, new VariableInformation(1,	"Operational mode heat medium pump",			NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47206, new VariableInformation(1,	"DM start heating",								NibeDataType.S16,	Type.Settings));	// Unit: 
		put(47207, new VariableInformation(1,	"DM start cooling",								NibeDataType.S16,	Type.Settings));	// Unit: 
		put(47208, new VariableInformation(1,	"DM start add.",								NibeDataType.S16,	Type.Settings));	// Unit: 
		put(47209, new VariableInformation(1,	"DM between add. steps",						NibeDataType.S16,	Type.Settings));	// Unit: 
		put(47210, new VariableInformation(1,	"DM start add. with shunt",						NibeDataType.S16,	Type.Settings));	// Unit: 
		put(47212, new VariableInformation(100,	"Max int add. power",							NibeDataType.S16,	Type.Settings));	// Unit: kW
		put(47214, new VariableInformation(1,	"Fuse",											NibeDataType.U8,	Type.Settings));	// Unit: A
		put(47261, new VariableInformation(1,	"Exhaust Fan speed 4",							NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47262, new VariableInformation(1,	"Exhaust Fan speed 3",							NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47263, new VariableInformation(1,	"Exhaust Fan speed 2",							NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47264, new VariableInformation(1,	"Exhaust Fan speed 1",							NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47265, new VariableInformation(1,	"Exhaust Fan speed normal",						NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47266, new VariableInformation(1,	"Supply Fan speed 4",							NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47267, new VariableInformation(1,	"Supply Fan speed 3",							NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47268, new VariableInformation(1,	"Supply Fan speed 2",							NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47269, new VariableInformation(1,	"Supply Fan speed 1",							NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47270, new VariableInformation(1,	"Supply Fan speed normal",						NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47271, new VariableInformation(1,	"Fan return time 4",							NibeDataType.U8,	Type.Settings));	// Unit: h
		put(47272, new VariableInformation(1,	"Fan return time 3",							NibeDataType.U8,	Type.Settings));	// Unit: h
		put(47273, new VariableInformation(1,	"Fan return time 2",							NibeDataType.U8,	Type.Settings));	// Unit: h
		put(47274, new VariableInformation(1,	"Fan return time 1",							NibeDataType.U8,	Type.Settings));	// Unit: h
		put(47275, new VariableInformation(1,	"Filter Reminder period",						NibeDataType.U8,	Type.Settings));	// Unit: Months
		put(47276, new VariableInformation(1,	"Floor drying",									NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47277, new VariableInformation(1,	"Floor drying period 7",						NibeDataType.U8,	Type.Settings));	// Unit: days
		put(47278, new VariableInformation(1,	"Floor drying period 6",						NibeDataType.U8,	Type.Settings));	// Unit: days
		put(47279, new VariableInformation(1,	"Floor drying period 5",						NibeDataType.U8,	Type.Settings));	// Unit: days
		put(47280, new VariableInformation(1,	"Floor drying period 4",						NibeDataType.U8,	Type.Settings));	// Unit: days
		put(47281, new VariableInformation(1,	"Floor drying period 3",						NibeDataType.U8,	Type.Settings));	// Unit: days
		put(47282, new VariableInformation(1,	"Floor drying period 2",						NibeDataType.U8,	Type.Settings));	// Unit: days
		put(47283, new VariableInformation(1,	"Floor drying period 1",						NibeDataType.U8,	Type.Settings));	// Unit: days
		put(47284, new VariableInformation(1,	"Floor drying temp. 7",							NibeDataType.U8,	Type.Settings));	// Unit: �C
		put(47285, new VariableInformation(1,	"Floor drying temp. 6",							NibeDataType.U8,	Type.Settings));	// Unit: �C
		put(47286, new VariableInformation(1,	"Floor drying temp. 5",							NibeDataType.U8,	Type.Settings));	// Unit: �C
		put(47287, new VariableInformation(1,	"Floor drying temp. 4",							NibeDataType.U8,	Type.Settings));	// Unit: �C
		put(47288, new VariableInformation(1,	"Floor drying temp. 3",							NibeDataType.U8,	Type.Settings));	// Unit: �C
		put(47289, new VariableInformation(1,	"Floor drying temp. 2",							NibeDataType.U8,	Type.Settings));	// Unit: �C
		put(47290, new VariableInformation(1,	"Floor drying temp. 1",							NibeDataType.U8,	Type.Settings));	// Unit: �C
		put(47294, new VariableInformation(1,	"Use airflow defrost",							NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47295, new VariableInformation(1,	"Airflow reduction trig",						NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47296, new VariableInformation(1,	"Airflow defrost done",							NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47297, new VariableInformation(1,	"Initiate inverter",							NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47298, new VariableInformation(1,	"Force inverter init",							NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47299, new VariableInformation(1,	"Min time defrost",								NibeDataType.U8,	Type.Settings));	// Unit: min
		put(47300, new VariableInformation(10,	"DOT",											NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47301, new VariableInformation(10,	"delta T at DOT",								NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47302, new VariableInformation(1,	"Climate system 2 accessory",					NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47303, new VariableInformation(1,	"Climate system 3 accessory",					NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47304, new VariableInformation(1,	"Climate system 4 accessory",					NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47305, new VariableInformation(10,	"Climate system 4 mixing valve amp.",			NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47306, new VariableInformation(10,	"Climate system 3 mixing valve amp.",			NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47307, new VariableInformation(10,	"Climate system 2 mixing valve amp.",			NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47308, new VariableInformation(10,	"Climate system 4 shunt wait",					NibeDataType.S16,	Type.Settings));	// Unit: secs
		put(47309, new VariableInformation(10,	"Climate system 3 shunt wait",					NibeDataType.S16,	Type.Settings));	// Unit: secs
		put(47310, new VariableInformation(10,	"Climate system 2 shunt wait",					NibeDataType.S16,	Type.Settings));	// Unit: secs
		put(47317, new VariableInformation(1,	"Shunt controlled add. accessory",				NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47318, new VariableInformation(1,	"Shunt controlled add. min. temp.",				NibeDataType.S8,	Type.Settings));	// Unit: �C
		put(47319, new VariableInformation(1,	"Shunt controlled add. min. runtime",			NibeDataType.U8,	Type.Settings));	// Unit: hrs
		put(47320, new VariableInformation(10,	"Shunt controlled add. mixing valve amp.",		NibeDataType.S8,	Type.Settings));	// Unit: 
		put(47321, new VariableInformation(1,	"Shunt controlled add. mixing valve wait",		NibeDataType.S16,	Type.Settings));	// Unit: secs
		put(47352, new VariableInformation(1,	"SMS40 accessory",								NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47370, new VariableInformation(1,	"Allow Additive Heating",						NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47371, new VariableInformation(1,	"Allow Heating",								NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47372, new VariableInformation(1,	"Allow Cooling",								NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47378, new VariableInformation(10,	"Max diff. comp.",								NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47379, new VariableInformation(10,	"Max diff. add.",								NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47384, new VariableInformation(1,	"Date format",									NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47385, new VariableInformation(1,	"Time format",									NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47387, new VariableInformation(1,	"HW production",								NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47388, new VariableInformation(1,	"Alarm lower room temp.",						NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47389, new VariableInformation(1,	"Alarm lower HW temp.",							NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47391, new VariableInformation(1,	"Use room sensor S4",							NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47392, new VariableInformation(1,	"Use room sensor S3",							NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47393, new VariableInformation(1,	"Use room sensor S2",							NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47394, new VariableInformation(1,	"Use room sensor S1",							NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47395, new VariableInformation(10,	"Room sensor setpoint S4",						NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47396, new VariableInformation(10,	"Room sensor setpoint S3",						NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47397, new VariableInformation(10,	"Room sensor setpoint S2",						NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47398, new VariableInformation(10,	"Room sensor setpoint S1",						NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(47399, new VariableInformation(10,	"Room sensor factor S4",						NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47400, new VariableInformation(10,	"Room sensor factor S3",						NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47401, new VariableInformation(10,	"Room sensor factor S2",						NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47402, new VariableInformation(10,	"Room sensor factor S1",						NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47415, new VariableInformation(1,	"Speed circ.pump Pool",							NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47417, new VariableInformation(1,	"Speed circ.pump Cooling",						NibeDataType.U8,	Type.Settings));	// Unit: %
		put(47442, new VariableInformation(1,	"preset flow clim. sys.",						NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47473, new VariableInformation(1,	"Max time defrost",								NibeDataType.U8,	Type.Settings));	// Unit: min
		put(47537, new VariableInformation(1,	"Night cooling",								NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47538, new VariableInformation(1,	"Start room temp. night cooling",				NibeDataType.U8,	Type.Settings));	// Unit: �C
		put(47539, new VariableInformation(1,	"Night Cooling Min. diff.",						NibeDataType.U8,	Type.Settings));	// Unit: �C
		put(47555, new VariableInformation(1,	"DEW accessory",								NibeDataType.U8,	Type.Settings));	// Unit: 
		put(47570, new VariableInformation(1,	"Operational mode",								NibeDataType.U8,	Type.Settings));	// Unit: 
		put(48134, new VariableInformation(1,	"Operational mode charge pump",					NibeDataType.U8,	Type.Settings));	// Unit: 
		put(48158, new VariableInformation(10,	"SAM supply air curve: outdoor temp T3",		NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(48159, new VariableInformation(10,	"SAM supply air curve: outdoor temp T2",		NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(48160, new VariableInformation(10,	"SAM supply air curve: outdoor temp T1",		NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(48161, new VariableInformation(10,	"SAM supply air curve: supply air temp at T3",	NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(48162, new VariableInformation(10,	"SAM supply air curve: supply air temp at T2",	NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(48163, new VariableInformation(10,	"SAM supply air curve: supply air temp at T1",	NibeDataType.S16,	Type.Settings));	// Unit: �C
		put(48201, new VariableInformation(1,	"SCA accessory",								NibeDataType.U8,	Type.Settings));	// Unit: 
	}});
	
	@SuppressWarnings("serial")
	public static final Map<Integer, VariableInformation> VARIABLE_INFO_F1145_F1245 = 
	Collections.unmodifiableMap(new HashMap<Integer, VariableInformation>() {{
		put(40004, new VariableInformation(10,	"BT1 outdoor temp",						NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40005, new VariableInformation(10,	"EB23-BT2 supply temp S4",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40006, new VariableInformation(10,	"EB22-BT2 supply temp S3",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40007, new VariableInformation(10,	"EB21-BT2 supply temp S2",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40008, new VariableInformation(10,	"BT2 supply temp S1",					NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40012, new VariableInformation(10,	"EB100-EP14-BT3 return temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40013, new VariableInformation(10,	"BT7 hot water top",					NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40014, new VariableInformation(10,	"BT6 hot water load",					NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40015, new VariableInformation(10,	"EB100-EP14-BT10 brine in temp",		NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40016, new VariableInformation(10,	"EB100-EP14-BT11 brine out temp",		NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40017, new VariableInformation(10,	"EB100-EP14-BT12 cond out",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40018, new VariableInformation(10,	"EB100-EP14-BT14 hot gas temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40019, new VariableInformation(10,	"EB100-EP14-BT15 liquid line",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40022, new VariableInformation(10,	"EB100-EP14-BT17 suction",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40025, new VariableInformation(10,	"EB100-BT20 exhaust air temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40026, new VariableInformation(10,	"EB100-BT21 vented air temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40028, new VariableInformation(10,	"AZ1-BT26 temp collector in FLM 1",		NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40029, new VariableInformation(10,	"AZ1-BT27 temp collector out FLM 1",	NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40030, new VariableInformation(10,	"EB23-BT50 room temp S4",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40031, new VariableInformation(10,	"EB22-BT50 room temp S3",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40032, new VariableInformation(10,	"EB21-BT50 room temp S2",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40033, new VariableInformation(10,	"BT50 room temp S1",					NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40042, new VariableInformation(10,	"CL11-BT51 pool 1 temp",		 		NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40043, new VariableInformation(10,	"EP8-BT53 solar panel temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40044, new VariableInformation(10,	"EP8-BT54 solar load temp",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40045, new VariableInformation(10,	"EQ1-BT64 PCS4 supply temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40046, new VariableInformation(10,	"EQ1-BT65 PCS4 return temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40054, new VariableInformation(1,	"EB100-FD1 temperature limiter",		NibeDataType.S16,	Type.Sensor));   // Unit: none
		put(40067, new VariableInformation(10,	"EM1-BT52 boiler temperature",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40070, new VariableInformation(10,	"BT25 external supply temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40071, new VariableInformation(10,	"BT25 external supply temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40072, new VariableInformation(10,	"BF1 Flow",								NibeDataType.S16,	Type.Sensor));   // Unit: l/m
		put(40074, new VariableInformation(1,	"EB100-FR1 anode status",				NibeDataType.S16,	Type.Sensor));   // Unit: none
		put(40079, new VariableInformation(10,	"EB100-BE1 current phase 3",			NibeDataType.S32,	Type.Sensor));   // Unit: A
		put(40081, new VariableInformation(10,	"EB100-BE1 current phase 2",			NibeDataType.S32,	Type.Sensor));   // Unit: A
		put(40083, new VariableInformation(10,	"EB100-BE1 current phase 1",			NibeDataType.S32,	Type.Sensor));   // Unit: A
		put(40107, new VariableInformation(10,	"EB100-BT20 exhaust air temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40108, new VariableInformation(10,	"EB100-BT20 exhaust air temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40109, new VariableInformation(10,	"EB100-BT20 exhaust air temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40110, new VariableInformation(10,	"EB100-BT21 vented air temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40111, new VariableInformation(10,	"EB100-BT21 vented air temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40112, new VariableInformation(10,	"EB100-BT21 vented air temp",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40113, new VariableInformation(10,	"AZ1-BT26 temp collector in FLM 4",		NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40114, new VariableInformation(10,	"AZ1-BT26 temp collector in FLM 3",		NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40115, new VariableInformation(10,	"AZ1-BT26 temp collector in FLM 2",		NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40116, new VariableInformation(10,	"AZ1-BT27 temp collector out FLM 4",	NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40117, new VariableInformation(10,	"AZ1-BT27 temp collector out FLM 3",	NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40118, new VariableInformation(10,	"AZ1-BT27 temp collector out FLM 2",	NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40127, new VariableInformation(10,	"EB23-BT3 return temp S4",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40128, new VariableInformation(10,	"EB22-BT3 return temp S3",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40129, new VariableInformation(10,	"EB21-BT3 return temp S2",				NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(40152, new VariableInformation(10,	"BT71 ext return temp",					NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(43001, new VariableInformation(1,	"Software version",						NibeDataType.U16,	Type.Sensor));   // Unit: none
		put(43005, new VariableInformation(10,	"Degree minutes",						NibeDataType.S16,	Type.Sensor));   // Unit: DM
		put(43006, new VariableInformation(10,	"Calculated supply temp S4",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(43007, new VariableInformation(10,	"Calculated supply temp S3",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(43008, new VariableInformation(10,	"Calculated supply temp S2",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(43009, new VariableInformation(10,	"Calculated supply temp S1",			NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(43010, new VariableInformation(10,	"Calculated cooling supply temp",		NibeDataType.S16,	Type.Sensor));   // Unit: C
		put(43013, new VariableInformation(1,	"Freeze protection status",				NibeDataType.U8,	Type.Sensor));   // Unit: none, 1=Freeze protection active
		put(43024, new VariableInformation(1,	"Status cooling",						NibeDataType.U8,	Type.Sensor));	 // Unit: none, 0=OFF, 1=ON
		put(43081, new VariableInformation(10,	"Total operation time addition",		NibeDataType.S32,	Type.Sensor));   // Unit: hours
		put(43084, new VariableInformation(100,	"Internal electrical addition power",	NibeDataType.S16,	Type.Sensor));   // Unit: kW
		put(43086, new VariableInformation(1,	"Prio",									NibeDataType.U8,	Type.Sensor));   // Unit: none
		put(43091, new VariableInformation(1,	"Internal electrical addition state",	NibeDataType.U16,	Type.Sensor));   // Unit: none
		put(43103, new VariableInformation(1,	"HPAC state",							NibeDataType.U8,	Type.Sensor));   // Unit: none
		put(43230, new VariableInformation(10,	"Accumulated energy",					NibeDataType.U32,	Type.Sensor));   // Unit: kWh
		put(43239, new VariableInformation(1,	"Total hot water operation time add",	NibeDataType.S32,	Type.Sensor));   // Unit: hours
		put(43395, new VariableInformation(1,	"HPAC relays",							NibeDataType.U8,	Type.Sensor));   // Unit: none
		put(43416, new VariableInformation(1,	"Compressor starts EB100-EP14",			NibeDataType.S32,	Type.Sensor));   // Unit: none
		put(43420, new VariableInformation(1,	"Total operation time compressor",		NibeDataType.S32,	Type.Sensor));   // Unit: hours
		put(43424, new VariableInformation(1,	"Total hot water operation time compr",	NibeDataType.S32,	Type.Sensor));   // Unit: hours
		put(43427, new VariableInformation(1,	"Compressor state EP14",				NibeDataType.U8,	Type.Sensor));   // Unit: none, // 20 = Stopped, 40 = Starting, 60 = Running, 100 = Stopping 
		put(43514, new VariableInformation(1,	"PCA-Base relayes EP14",				NibeDataType.U8,	Type.Sensor));   // Unit: none 
		put(43516, new VariableInformation(1,	"PCA-Power relayes EP14",				NibeDataType.U8,	Type.Sensor));   // Unit: none 

		put(45001, new VariableInformation(1,	"Alarm number",							NibeDataType.S16,	Type.Status));   // Unit: none

		put(47004, new VariableInformation(1,	"Heat curve S4",						NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47005, new VariableInformation(1,	"Heat curve S3",						NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47006, new VariableInformation(1,	"Heat curve S2",						NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47007, new VariableInformation(1,	"Heat curve S1",						NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47008, new VariableInformation(1,	"Offset S4",							NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47009, new VariableInformation(1,	"Offset S3",							NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47010, new VariableInformation(1,	"Offset S2",							NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47011, new VariableInformation(1,	"Offset S1",							NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47012, new VariableInformation(10,	"Min supply system 4",					NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47013, new VariableInformation(10,	"Min supply system 3",					NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47014, new VariableInformation(10,	"Min supply system 2",					NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47015, new VariableInformation(10,	"Min supply system 1",					NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47016, new VariableInformation(10,	"Max supply system 4",					NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47017, new VariableInformation(10,	"Max supply system 3",					NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47018, new VariableInformation(10,	"Max supply system 2",					NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47019, new VariableInformation(10,	"Max supply system 1",					NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47020, new VariableInformation(1,	"Own curve P7",							NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47021, new VariableInformation(1,	"Own curve P6",							NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47022, new VariableInformation(1,	"Own curve P5",							NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47023, new VariableInformation(1,	"Own curve P4",							NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47024, new VariableInformation(1,	"Own curve P3",							NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47025, new VariableInformation(1,	"Own curve P2",							NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47026, new VariableInformation(1,	"Own curve P1",							NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47027, new VariableInformation(1,	"Point offset outdoor temp",			NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47028, new VariableInformation(1,	"Point offset",							NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47029, new VariableInformation(1,	"External adjustment S4",				NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47030, new VariableInformation(1,	"External adjustment S3",				NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47031, new VariableInformation(1,	"External adjustment S2",				NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47032, new VariableInformation(1,	"External adjustment S1",				NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47033, new VariableInformation(10,	"External adjust with room sensor S4",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47034, new VariableInformation(10,	"External adjust with room sensor S3",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47035, new VariableInformation(10,	"External adjust with room sensor S2",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47036, new VariableInformation(10,	"External adjust with room sensor S1",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47041, new VariableInformation(1,	"Hot water mode",						NibeDataType.S8,	Type.Settings)); // Unit: none, 0=economy, 1=normal, 2=luxury
		put(47043, new VariableInformation(10,	"Start temperature hot water luxury",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47044, new VariableInformation(10,	"Start temperature hot water normal",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47045, new VariableInformation(10,	"Start temperature hot water economy",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47046, new VariableInformation(10,	"Stop temperature periodic hot water",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47047, new VariableInformation(10,	"Stop temperature hot water luxury",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47048, new VariableInformation(10,	"Stop temperature hot water normal",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47049, new VariableInformation(10,	"Stop temperature hot water economy",	NibeDataType.S16,	Type.Settings)); // Unit: C
		put(47050, new VariableInformation(1,	"Periodic hot water",					NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47051, new VariableInformation(1,	"Periodic hot water interval",			NibeDataType.S8,	Type.Settings)); // Unit: days
		put(47131, new VariableInformation(1,	"Language",								NibeDataType.S8,	Type.Settings)); // Unit: none, 0=English, 1=Svenska, 5=Suomi
		put(47133, new VariableInformation(1,	"Period pool 2",						NibeDataType.U8,	Type.Settings)); // Unit: min
		put(47134, new VariableInformation(1,	"Period hot water",						NibeDataType.U8,	Type.Settings)); // Unit: min
		put(47135, new VariableInformation(1,	"Period heat",							NibeDataType.U8,	Type.Settings)); // Unit: min
		put(47136, new VariableInformation(1,	"Period pool",							NibeDataType.U8,	Type.Settings)); // Unit: min
		put(47138, new VariableInformation(1,	"Operational mode heat medium pump",	NibeDataType.U8,	Type.Settings)); // Unit: none, 10=intermittent, 20=continuous, 30=economy, 40=auto
		put(47139, new VariableInformation(1,	"Operational mode brine medium pump",	NibeDataType.U8,	Type.Settings)); // Unit: none, 10=intermittent, 20=continuous, 30=economy, 40=auto
		put(47206, new VariableInformation(1,	"DM start heating",						NibeDataType.S16,	Type.Settings)); // Unit: DM
		put(47207, new VariableInformation(1,	"DM start cooling",						NibeDataType.S16,	Type.Settings)); // Unit: DM
		put(47208, new VariableInformation(1,	"DM start addition",					NibeDataType.S16,	Type.Settings)); // Unit: DM
		put(47209, new VariableInformation(1,	"DM between addition steps",			NibeDataType.S16,	Type.Settings)); // Unit: DM
		put(47210, new VariableInformation(1,	"DM start addition with shunt",			NibeDataType.S16,	Type.Settings)); // Unit: DM
		put(47212, new VariableInformation(100,	"Max int addition power",				NibeDataType.S16,	Type.Settings)); // Unit: kW
		put(47214, new VariableInformation(1,	"Fuse",									NibeDataType.U8,	Type.Settings)); // Unit: A
		put(47261, new VariableInformation(1,	"Exhaust fan speed 4",					NibeDataType.U8,	Type.Settings)); // Unit: %
		put(47262, new VariableInformation(1,	"Exhaust fan speed 3",					NibeDataType.U8,	Type.Settings)); // Unit: %
		put(47263, new VariableInformation(1,	"Exhaust fan speed 2",					NibeDataType.U8,	Type.Settings)); // Unit: %
		put(47264, new VariableInformation(1,	"Exhaust fan speed 1",					NibeDataType.U8,	Type.Settings)); // Unit: %
		put(47265, new VariableInformation(1,	"Exhaust fan speed normal",				NibeDataType.U8,	Type.Settings)); // Unit: %
		put(47271, new VariableInformation(1,	"Fan return time 4",					NibeDataType.U8,	Type.Settings)); // Unit: hours
		put(47272, new VariableInformation(1,	"Fan return time 3",					NibeDataType.U8,	Type.Settings)); // Unit: hours
		put(47273, new VariableInformation(1,	"Fan return time 2",					NibeDataType.U8,	Type.Settings)); // Unit: hours
		put(47274, new VariableInformation(1,	"Fan return time 1",					NibeDataType.U8,	Type.Settings)); // Unit: hours
		put(47275, new VariableInformation(1,	"Filter reminder period",				NibeDataType.U8,	Type.Settings)); // Unit: months
		put(47276, new VariableInformation(1,	"Floor drying",							NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47277, new VariableInformation(1,	"Floor drying period 7",				NibeDataType.U8,	Type.Settings)); // Unit: days
		put(47278, new VariableInformation(1,	"Floor drying period 6",				NibeDataType.U8,	Type.Settings)); // Unit: days
		put(47279, new VariableInformation(1,	"Floor drying period 5",				NibeDataType.U8,	Type.Settings)); // Unit: days
		put(47280, new VariableInformation(1,	"Floor drying period 4",				NibeDataType.U8,	Type.Settings)); // Unit: days
		put(47281, new VariableInformation(1,	"Floor drying period 3",				NibeDataType.U8,	Type.Settings)); // Unit: days
		put(47282, new VariableInformation(1,	"Floor drying period 2",				NibeDataType.U8,	Type.Settings)); // Unit: days
		put(47283, new VariableInformation(1,	"Floor drying period 1",				NibeDataType.U8,	Type.Settings)); // Unit: days
		put(47284, new VariableInformation(1,	"Floor drying temp 7",					NibeDataType.U8,	Type.Settings)); // Unit: C
		put(47285, new VariableInformation(1,	"Floor drying temp 6",					NibeDataType.U8,	Type.Settings)); // Unit: C
		put(47286, new VariableInformation(1,	"Floor drying temp 5",					NibeDataType.U8,	Type.Settings)); // Unit: C
		put(47287, new VariableInformation(1,	"Floor drying temp 4",					NibeDataType.U8,	Type.Settings)); // Unit: C
		put(47288, new VariableInformation(1,	"Floor drying temp 3",					NibeDataType.U8,	Type.Settings)); // Unit: C
		put(47289, new VariableInformation(1,	"Floor drying temp 2",					NibeDataType.U8,	Type.Settings)); // Unit: C
		put(47290, new VariableInformation(1,	"Floor drying temp 1",					NibeDataType.U8,	Type.Settings)); // Unit: C
		put(47291, new VariableInformation(1,	"Floor drying timer",					NibeDataType.U16,	Type.Settings)); // Unit: hours
		put(47302, new VariableInformation(1,	"Climate system 2 accessory",			NibeDataType.U8,	Type.Settings)); // Unit: none
		put(47303, new VariableInformation(1,	"Climate system 3 accessory",			NibeDataType.U8,	Type.Settings)); // Unit: none
		put(47304, new VariableInformation(1,	"Climate system 4 accessory",			NibeDataType.U8,	Type.Settings)); // Unit: none
		put(47305, new VariableInformation(10,	"Climate system 4 mixing valve amp",	NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47306, new VariableInformation(10,	"Climate system 3 mixing valve amp",	NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47307, new VariableInformation(10,	"Climate system 2 mixing valve amp",	NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47308, new VariableInformation(10,	"Climate system 4 shunt wait",			NibeDataType.S16,	Type.Settings)); // Unit: secs
		put(47309, new VariableInformation(10,	"Climate system 3 shunt wait",			NibeDataType.S16,	Type.Settings)); // Unit: secs
		put(47310, new VariableInformation(10,	"Climate system 2 shunt wait",			NibeDataType.S16,	Type.Settings)); // Unit: secs
		put(47312, new VariableInformation(1,	"FLM pump",								NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47313, new VariableInformation(1,	"FLM defrost",							NibeDataType.U8,	Type.Settings)); // Unit: hours
		put(47317, new VariableInformation(1,	"Shunt controlled addition accessory",	NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47318, new VariableInformation(1,	"Shunt controlled add min temp",		NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47319, new VariableInformation(1,	"Shunt controlled add min runtime",		NibeDataType.U8,	Type.Settings)); // Unit: hours
		put(47320, new VariableInformation(1,	"Shunt controlled add mix valve amp",	NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47321, new VariableInformation(1,	"Shunt controlled add mix valve wait",	NibeDataType.S16,	Type.Settings)); // Unit: secs
		put(47322, new VariableInformation(1,	"Step controlled add accessory",		NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47323, new VariableInformation(1,	"Step controlled add start DM",			NibeDataType.S16,	Type.Settings)); // Unit: DM
		put(47324, new VariableInformation(1,	"Step controlled add diff DM",			NibeDataType.S16,	Type.Settings)); // Unit: DM
		put(47326, new VariableInformation(1,	"Step controlled add mode",				NibeDataType.U8,	Type.Settings)); // Unit: none, 0=linear, 1=binary
		put(47327, new VariableInformation(1,	"Ground water pump accessory",			NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47329, new VariableInformation(1,	"Cooling 2-pipe accessory",				NibeDataType.U8,	Type.Settings)); // Unit: none
		put(47330, new VariableInformation(1,	"Cooling 4-pipe accessory",				NibeDataType.U8,	Type.Settings)); // Unit: none
		put(47331, new VariableInformation(1,	"Min cooling supply temp",				NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47332, new VariableInformation(1,	"Cooling supply temp at 20C",			NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47333, new VariableInformation(1,	"Cooling supply temp at 40C",			NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47334, new VariableInformation(1,	"Cooling close mixing valves",			NibeDataType.U8,	Type.Settings)); // Unit: none
		put(47335, new VariableInformation(1,	"Time between switch heat/cooling",		NibeDataType.S8,	Type.Settings)); // Unit: hours
		put(47336, new VariableInformation(1,	"Heat at room under temp",				NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47337, new VariableInformation(1,	"Cool at room over temp",				NibeDataType.S8,	Type.Settings)); // Unit: C
		put(47338, new VariableInformation(1,	"Cooling mixing valve amp",				NibeDataType.S8,	Type.Settings)); // Unit: none
		put(47339, new VariableInformation(1,	"Cooling mixing valve step delay",		NibeDataType.S16,	Type.Settings)); // Unit: none
		put(47340, new VariableInformation(1,	"Cooling with room sensor",				NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47378, new VariableInformation(10,	"Max diff comp",						NibeDataType.S16,	Type.Settings)); // Unit: C 
		put(47379, new VariableInformation(10,	"Max diff add",							NibeDataType.S16,	Type.Settings)); // Unit: C 
		put(47380, new VariableInformation(1,	"Low brine out autoreset",				NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON 
		put(47381, new VariableInformation(10,	"Low brine out temp",					NibeDataType.S16,	Type.Settings)); // Unit: C 
		put(47382, new VariableInformation(1,	"High brine in",						NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON 
		put(47383, new VariableInformation(10,	"High brine in temp",					NibeDataType.S16,	Type.Settings)); // Unit: C 
		put(47384, new VariableInformation(1,	"Date format",							NibeDataType.U8,	Type.Settings)); // Unit: none, 1=DD-MM-YY, 2=YY-MM-DD 
		put(47385, new VariableInformation(1,	"Time format",							NibeDataType.U8,	Type.Settings)); // Unit: none, 12=12 hours, 24=24 hours
		put(47387, new VariableInformation(1,	"Hot water production",					NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47388, new VariableInformation(1,	"Alarm lower room temp",				NibeDataType.U8,	Type.Settings)); // Unit: none 
		put(47389, new VariableInformation(1,	"Alarm lower HW temp",					NibeDataType.U8,	Type.Settings)); // Unit: none 
		put(47391, new VariableInformation(1,	"Use room sensor S4",					NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47392, new VariableInformation(1,	"Use room sensor S3",					NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47393, new VariableInformation(1,	"Use room sensor S2",					NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47394, new VariableInformation(1,	"Use room sensor S1",					NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(47395, new VariableInformation(10,	"Room sensor setpoint S4",				NibeDataType.S16,	Type.Settings)); // Unit: C 
		put(47396, new VariableInformation(10,	"Room sensor setpoint S3",				NibeDataType.S16,	Type.Settings)); // Unit: C 
		put(47397, new VariableInformation(10,	"Room sensor setpoint S2",				NibeDataType.S16,	Type.Settings)); // Unit: C 
		put(47398, new VariableInformation(10,	"Room sensor setpoint S1",				NibeDataType.S16,	Type.Settings)); // Unit: C 
		put(47399, new VariableInformation(10,	"Room sensor factor S4",				NibeDataType.U8,	Type.Settings)); // Unit: none 
		put(47400, new VariableInformation(10,	"Room sensor factor S3",				NibeDataType.U8,	Type.Settings)); // Unit: none 
		put(47401, new VariableInformation(10,	"Room sensor factor S2",				NibeDataType.U8,	Type.Settings)); // Unit: none 
		put(47402, new VariableInformation(10,	"Room sensor factor S1",				NibeDataType.U8,	Type.Settings)); // Unit: none 
		put(47413, new VariableInformation(1,	"Speed circ pump hot water",			NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(47414, new VariableInformation(1,	"Speed circ pump heat",					NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(47415, new VariableInformation(1,	"Speed circ pump pool",					NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(47416, new VariableInformation(1,	"Speed circ pump economy",				NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(47417, new VariableInformation(1,	"Speed circ pump cooling",				NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(47418, new VariableInformation(1,	"Speed brine pump",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(47538, new VariableInformation(1,	"Start room temp nigh cooling",			NibeDataType.U8,	Type.Settings)); // Unit: C 
		put(47570, new VariableInformation(1,	"Operational mode",						NibeDataType.U8,	Type.Settings)); // Unit: none, 0=auto, 1=manual, 2=add heat only 
		put(48074, new VariableInformation(10,	"Set point for BT74",					NibeDataType.S16,	Type.Settings)); // Unit: none
		put(48088, new VariableInformation(1,	"Pool 1 accesory",						NibeDataType.U8,	Type.Settings)); // Unit: none
		put(48090, new VariableInformation(10,	"Pool 1 start temp",					NibeDataType.S16,	Type.Settings)); // Unit: C
		put(48092, new VariableInformation(10,	"Pool 1 stop temp",						NibeDataType.S16,	Type.Settings)); // Unit: C
		put(48093, new VariableInformation(1,	"Pool 2 activated",						NibeDataType.U8,	Type.Settings)); // Unit: none
		put(48094, new VariableInformation(1,	"Pool 1 activated",						NibeDataType.U8,	Type.Settings)); // Unit: none
		put(48537, new VariableInformation(1,	"Night cooling",						NibeDataType.U8,	Type.Settings)); // Unit: none, 0=OFF, 1=ON
		put(48539, new VariableInformation(1,	"Night cooling min diff",				NibeDataType.U8,	Type.Settings)); // Unit: C
		put(48053, new VariableInformation(1,	"FLM 2 speed 4",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48054, new VariableInformation(1,	"FLM 2 speed 3",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48055, new VariableInformation(1,	"FLM 2 speed 2",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48056, new VariableInformation(1,	"FLM 2 speed 1",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48057, new VariableInformation(1,	"FLM 2 speed normal",					NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48058, new VariableInformation(1,	"FLM 3 speed 4",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48059, new VariableInformation(1,	"FLM 3 speed 3",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48060, new VariableInformation(1,	"FLM 3 speed 2",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48061, new VariableInformation(1,	"FLM 3 speed 1",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48062, new VariableInformation(1,	"FLM 3 speed normal",					NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48063, new VariableInformation(1,	"FLM 4 speed 4",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48064, new VariableInformation(1,	"FLM 4 speed 3",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48065, new VariableInformation(1,	"FLM 4 speed 2",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48066, new VariableInformation(1,	"FLM 4 speed 1",						NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48067, new VariableInformation(1,	"FLM 4 speed normal",					NibeDataType.U8,	Type.Settings)); // Unit: % 
		put(48068, new VariableInformation(1,	"FLM 4 accessory",						NibeDataType.U8,	Type.Settings)); // Unit: none 
		put(48069, new VariableInformation(1,	"FLM 3 accessory",						NibeDataType.U8,	Type.Settings)); // Unit: none 
		put(48070, new VariableInformation(1,	"FLM 2 accessory",						NibeDataType.U8,	Type.Settings)); // Unit: none 
		put(48071, new VariableInformation(1,	"FLM 1 accessory",						NibeDataType.U8,	Type.Settings)); // Unit: none 
		put(48073, new VariableInformation(1,	"FLM cooling",							NibeDataType.U8,	Type.Settings)); // Unit: none 
	}});

	public static Hashtable<Integer, Short> ParseData(byte[] data)
			throws NibeHeatPumpException {

		if (data[0] == (byte) 0x5C && data[1] == (byte) 0x00
				&& data[2] == (byte) 0x20 && data[3] == (byte) 0x68
				&& data[4] >= (byte) 0x50) {

			int datalen = data[4];
			int msglen = 5 + datalen; 
			
			byte checksum = 0;

			// calculate XOR checksum
			for (int i = 2; i < msglen; i++)
				checksum ^= data[i];

			byte msgChecksum = data[msglen];
			
            // if checksum is 0x5C (start character), heat pump seems to send 0xC5 checksum

			if (checksum == msgChecksum || (checksum == (byte) 0x5C && msgChecksum == (byte) 0xC5)) {

				if ( datalen > 0x50) {
					// if data contains 0x5C (start character), 
					// data seems to contains double 0x5C characters
					
					// let's remove doubles
					for( int i=1; i<msglen; i++) {
						if (data[i] == (byte) 0x5C) {
							data = ArrayUtils.remove(data, i);
							msglen--;
						}
					}
				}
				
				// parse data to hash table

				Hashtable<Integer, Short> values = new Hashtable<Integer, Short>();
				
				try {
					for (int i = 5; i < (msglen - 1); i += 4) {
						
						int id = ((data[i + 1] & 0xFF) << 8 | (data[i + 0] & 0xFF));
						short value = (short) ((data[i + 3] & 0xFF) << 8 | (data[i + 2] & 0xFF));
	
						if (id != 0xFFFF)
							values.put(id, value);
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					throw new NibeHeatPumpException("Error occured during data parsing", e);
				}
				
				return values;

			} else {
				throw new NibeHeatPumpException("Checksum does not match");
			}

		} else {
			return null;
		}
	}

}
