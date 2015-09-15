package org.jbpm.formModeler.vdml.model;

import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.vdml.services.impl.model.runtime.ActivityObservation;
import org.jbpm.vdml.services.impl.model.runtime.DirectedFlowObservation;
import org.omg.vdml.Activity;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Port;

import java.util.Set;
import java.util.TreeSet;

public class ValueOutputDataHolder extends ObservationDataHolder<Activity> {
    public static final String TYPE = "vdmlValueOutput";

    public ValueOutputDataHolder(Activity eobject, String uniqueId) {
        super(eobject, uniqueId);
    }

    @Override
    protected Set<DataFieldHolder> buildDataFieldHolders() throws Exception {
        Set<DataFieldHolder> dataFieldHolders = new TreeSet<DataFieldHolder>();
        for (Port field : getEObject().getContainedPort()) {
            if (field instanceof OutputPort) {
                DataFieldHolder fieldHolder = new DataFieldHolder(this, field.getName(), DirectedFlowObservation.class.getName());
                dataFieldHolders.add(fieldHolder);
            }
        }
        return dataFieldHolders;
    }


    @Override
    public Object readValue(Object source, String propName) throws Exception {
        ActivityObservation ao= (ActivityObservation) source;
        return lookupElement(propName,ao.getConcludedFlow());
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
