package org.omg.smm.util;

import org.omg.smm.Measure;
import org.omg.vdml.MeasuredCharacteristic;

public class SmmHelper {
    public static boolean hasMeasure(MeasuredCharacteristic mc){
        return mc!=null && mc.getCharacteristicDefinition()!=null && mc.getCharacteristicDefinition().getMeasure().size()>0;
    }
    public static Measure getMeasure(MeasuredCharacteristic mc){
        return mc.getCharacteristicDefinition().getMeasure().get(0);
    }
}
