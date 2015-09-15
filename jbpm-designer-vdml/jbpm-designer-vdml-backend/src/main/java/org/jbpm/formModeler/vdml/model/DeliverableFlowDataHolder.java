package org.jbpm.formModeler.vdml.model;

import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.vdml.services.impl.model.meta.EnumeratedMeasure;
import org.jbpm.vdml.services.impl.model.runtime.DirectedFlowObservation;
import org.omg.smm.Measure;
import org.omg.vdml.*;

import java.util.Set;
import java.util.TreeSet;

public class DeliverableFlowDataHolder extends ObservationDataHolder<DeliverableFlow> {
    public static final String TYPE = "deliverableFlow";

    public DeliverableFlowDataHolder(DeliverableFlow eobject, String id) {
        super(eobject,id);
    }


    @Override
    public void writeValue(Object destination, String propName, Object value) throws Exception {
        DirectedFlowObservation dfo = (DirectedFlowObservation) destination;
        super.setMeasurement(propName, value, dfo.getMeasurements(), dfo.getValueAddMeasurements());
    }

    @Override
    public Object readValue(Object source, String propName) throws Exception {
        DirectedFlowObservation dfo = (DirectedFlowObservation) source;
        return super.getMeasurement(propName, dfo.getMeasurements(), dfo.getValueAddMeasurements());
    }

    @Override
    public String getTypeCode() {
        return TYPE;
    }

    @Override
    public boolean isAssignableValue(Object value) {
        return value instanceof DirectedFlowObservation;
    }


    @Override
    protected Set<DataFieldHolder> buildDataFieldHolders() throws Exception {
        Set<DataFieldHolder> dataFieldHolders = new TreeSet<DataFieldHolder>();
        for (ValueAdd field : VdmlHelper.getValueAdds(getEObject().getProvider())) {
            if (VdmlHelper.hasValueMeasure(field)) {
                Measure m = VdmlHelper.getValueMeasure(field);
                String type = "java.lang.Double";
                if(m instanceof EnumeratedMeasure){
                    type=((EnumeratedMeasure) m).getEnumClass().getName();
                }
                DataFieldHolder fieldHolder = new DataFieldHolder(this, field.getName(), type);
                dataFieldHolders.add(fieldHolder);
            }
        }
        if(VdmlHelper.hasMeasure(getEObject().getProvider().getBatchSize())){
            Measure m=VdmlHelper.getMeasure(getEObject().getProvider().getBatchSize());
            dataFieldHolders.add(new DataFieldHolder(this, "quantity", "java.lang.Double"));
        }
        if(VdmlHelper.hasMeasure(getEObject().getDuration())){
            Measure m=VdmlHelper.getMeasure(getEObject().getDuration());
            dataFieldHolders.add(new DataFieldHolder(this, "duration", "java.lang.Double"));
        }
        return dataFieldHolders;
    }
}
