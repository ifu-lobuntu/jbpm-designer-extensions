package org.jbpm.formModeler.vdml.model;

import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.vdml.services.model.runtime.ActivityObservation;
import org.omg.vdml.Activity;
import org.omg.vdml.MeasuredCharacteristic;

import java.util.Set;
import java.util.TreeSet;

public class ActivityValueDataHolder extends ObservationDataHolder<Activity> {
    public static final String TYPE = "vdmlValueActivity";

    public ActivityValueDataHolder(Activity eobject, String ftm) {
        super(eobject, ftm);
    }

    @Override
    protected Set<DataFieldHolder> buildDataFieldHolders() throws Exception {
        Set<DataFieldHolder> dataFieldHolders = new TreeSet<DataFieldHolder>();
        for (MeasuredCharacteristic field : getEObject().getMeasuredCharacteristic()) {
            DataFieldHolder fieldHolder = new DataFieldHolder(this, field.getName(), "java.lang.Double");
            dataFieldHolders.add(fieldHolder);
        }
        return dataFieldHolders;
    }
    @Override
    public void writeValue(Object destination, String propName, Object value) throws Exception {
        ActivityObservation dfo = (ActivityObservation) destination;
        super.setMeasurement(propName, value, dfo.getMeasurements());
    }

    @Override
    public Object readValue(Object source, String propName) throws Exception {
        ActivityObservation dfo = (ActivityObservation) source;
        return super.getMeasurement(propName, dfo.getMeasurements());
    }

    @Override
    public String getTypeCode() {
        return TYPE;
    }

    @Override
    public boolean isAssignableValue(Object value) {
        return value instanceof ActivityObservation;
    }


}
