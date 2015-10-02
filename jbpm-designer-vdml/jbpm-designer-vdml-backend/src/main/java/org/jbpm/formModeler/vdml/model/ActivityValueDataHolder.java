package org.jbpm.formModeler.vdml.model;

import org.eclipse.emf.common.util.EList;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.formModeler.api.client.FormRenderContext;
import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.formModeler.emf.EmfBasedDataHolder;
import org.omg.smm.Characteristic;
import org.omg.smm.GradeMeasure;
import org.omg.smm.Measure;
import org.omg.smm.RankingMeasure;
import org.omg.vdml.*;

import java.util.*;

public class ActivityValueDataHolder extends EmfBasedDataHolder<Activity> {
    public static final String TYPE = "vdmlValueActivity";
    private Set<VdmlFieldWrapper> fieldWrappers;
    public ActivityValueDataHolder(Activity eobject, String ftm) {
        super(eobject, ftm);
    }

    public Set<VdmlFieldWrapper> getFieldWrappers() {
        if(fieldWrappers==null){
            fieldWrappers=new HashSet<VdmlFieldWrapper>();
            for (MeasuredCharacteristic field : getEObject().getMeasuredCharacteristic()) {
                addFieldWrapper(getEObject(), field);
            }
            if (VdmlHelper.hasMeasure(getEObject().getDuration())) {
                addFieldWrapper(getEObject(), "duration", getEObject().getDuration());
            }
            for (Port port : getEObject().getContainedPort()) {
                if (port instanceof InputPort) {
                    InputPort ip = (InputPort) port;
                    addFieldsForDeliverableFlow(ip, ip.getInput());
                    if (ip.getInput().getProvider().eContainer() instanceof SupplyingStore) {
                        SupplyingStore ss = (SupplyingStore) ip.getInput().getProvider().eContainer();
                        addFieldsForSupplyingStore(ip, ss);
                    }
                } else {
                    OutputPort op = (OutputPort) port;
                    addFieldsForDeliverableFlow(op, op.getOutput());
                }
            }
            for (ResourceUse resourceUse : getEObject().getResourceUse()) {
                if(VdmlHelper.hasMeasure(resourceUse.getQuantity())){
                    addFieldWrapper(resourceUse,"quantity", resourceUse.getQuantity());
                }
                if(VdmlHelper.hasMeasure(resourceUse.getDuration())){
                    addFieldWrapper(resourceUse,"duration", resourceUse.getDuration());
                }
                for (MeasuredCharacteristic characteristic : resourceUse.getMeasuredCharacteristic()) {
                    addFieldWrapper(resourceUse,characteristic.getName(),characteristic);
                }
            }
        }
        return fieldWrappers;
    }

    protected void addFieldsForSupplyingStore(InputPort ip, SupplyingStore ss) {
        if (ss.getStoreRequirement() != null) {
            for (MeasuredCharacteristic characteristic : ss.getMeasuredCharacteristic()) {
                if(VdmlHelper.hasMeasure(characteristic)) {
                    addFieldWrapper(ip, ss, characteristic.getName(), characteristic);
                }
            }
            MeasuredCharacteristic inventoryLevel = ss.getInventoryLevel();
            if (VdmlHelper.hasMeasure(inventoryLevel)) {
                addFieldWrapper(ip,ss,"inventoryLevel",inventoryLevel);
            }
        }
    }


    @Override
    protected Set<DataFieldHolder> buildDataFieldHolders() throws Exception {
        Set<DataFieldHolder> dataFieldHolders = new TreeSet<DataFieldHolder>();
        for (VdmlFieldWrapper vdmlFieldWrapper : getFieldWrappers()) {
            dataFieldHolders.add(vdmlFieldWrapper.getField());
        }
        return dataFieldHolders;
    }



    private void addFieldsForDeliverableFlow( Port introducingPort, DeliverableFlow flow) {
        for (ValueAdd field : VdmlHelper.getValueAdds(flow.getProvider())) {
            if (VdmlHelper.hasValueMeasure(field)) {
                addFieldWrapper(introducingPort, field, field.getName(),field.getValueMeasurement());
            }
        }
        if (VdmlHelper.hasMeasure(flow.getProvider().getBatchSize())) {
            addFieldWrapper(introducingPort, flow, "quantity", flow.getProvider().getBatchSize());
        } else if (VdmlHelper.hasMeasure(flow.getRecipient().getBatchSize())) {
            addFieldWrapper(introducingPort, flow, "quantity", flow.getRecipient().getBatchSize());
        }
        if (VdmlHelper.hasMeasure(flow.getDuration())) {
            addFieldWrapper(introducingPort, flow, "duration", flow.getDuration());
        }
    }

    @Override
    public Object createInstance(FormRenderContext context) throws Exception {
        return new HashMap<String, Object>();
    }

    @Override
    public void writeValue(Object destination, String propName, Object value) throws Exception {
        ((Map) destination).put(propName, value);
    }

    @Override
    public Object readValue(Object source, String propName) throws Exception {
        return ((Map) source).get(propName);
    }

    @Override
    public String getTypeCode() {
        return TYPE;
    }

    @Override
    public boolean isAssignableValue(Object value) {
        return value instanceof Map;
    }

    private void addFieldWrapper(VdmlElement parentElement, MeasuredCharacteristic field) {
        addFieldWrapper(parentElement, field.getName(), field);
    }

    private void addFieldWrapper(VdmlElement parentElement, String localName, MeasuredCharacteristic field) {
        Characteristic characteristicDefinition = field.getCharacteristicDefinition();
        addFieldWrapper(null, parentElement, localName, characteristicDefinition);
    }
    private void addFieldWrapper(Port introducingPort, VdmlElement parentElement, String localName, MeasuredCharacteristic field) {
        Characteristic characteristicDefinition = field.getCharacteristicDefinition();
        addFieldWrapper(introducingPort, parentElement, localName, characteristicDefinition);
    }

    private void addFieldWrapper(Port introducingPort, VdmlElement parentElement, String localName, Characteristic characteristicDefinition) {
        Measure measure = characteristicDefinition.getMeasure().get(0);
        fieldWrappers.add(new VdmlFieldWrapper(this, introducingPort, parentElement, localName, measure));
    }
}
