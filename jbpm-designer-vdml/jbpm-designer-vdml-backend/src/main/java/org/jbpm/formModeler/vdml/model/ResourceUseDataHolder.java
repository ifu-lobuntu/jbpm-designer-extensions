package org.jbpm.formModeler.vdml.model;

import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.vdml.services.model.runtime.ActivityObservation;
import org.jbpm.vdml.services.model.runtime.ResourceUseObservation;
import org.omg.vdml.Activity;
import org.omg.vdml.ResourceUse;

import java.util.Set;
import java.util.TreeSet;

public class ResourceUseDataHolder extends ObservationDataHolder<Activity> {
    public static final String TYPE = "vdmlResourceUse";

    public ResourceUseDataHolder(Activity eobject, String uniqueId) {
        super(eobject, uniqueId);
    }

    @Override
    protected Set<DataFieldHolder> buildDataFieldHolders() throws Exception {
        Set<DataFieldHolder> dataFieldHolders = new TreeSet<DataFieldHolder>();
        for (ResourceUse field : getEObject().getResourceUse()) {
            if(field.getDuration()!=null) {
                DataFieldHolder fieldHolder = new DataFieldHolder(this, field.getName()+"Duration", "java.lang.Double");
                dataFieldHolders.add(fieldHolder);
            }
            if(field.getQuantity() !=null){
                DataFieldHolder fieldHolder = new DataFieldHolder(this, field.getName()+"Quantity", "java.lang.Double");
                dataFieldHolders.add(fieldHolder);
            }
        }
        return dataFieldHolders;
    }

    @Override
    public Object readValue(Object source, String propName) throws Exception {
        ActivityObservation ao= (ActivityObservation) source;
        if(propName.endsWith("Quantity")){
            propName=propName.substring(0, propName.length() -  "Quantity".length());
            ResourceUseObservation ruo = lookupElement(propName,ao.getResourceUseObservation());
            return ruo.getQuantity().getValue();
        }
        if(propName.endsWith("Duration")){
            propName=propName.substring(0, propName.length() -  "Duration".length());
            ResourceUseObservation ruo = lookupElement(propName,ao.getResourceUseObservation());
            return ruo.getDuration().getValue();
        }
        return null;
    }

    @Override
    public void writeValue(Object destination, String propName, Object value) throws Exception {
        ActivityObservation ao= (ActivityObservation) destination;
        if(propName.endsWith("Quantity")){
            propName=propName.substring(0, propName.length() -  "Quantity".length());
            ResourceUseObservation ruo = lookupElement(propName,ao.getResourceUseObservation());
            ruo.getQuantity().setValue((Double) value);
        }
        if(propName.endsWith("Duration")){
            propName=propName.substring(0, propName.length() -  "Duration".length());
            ResourceUseObservation ruo = lookupElement(propName,ao.getResourceUseObservation());
            ruo.getDuration().setValue((Double) value);
        }
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
