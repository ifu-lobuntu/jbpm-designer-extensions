package org.jbpm.formModeler.cmmn.model;

import org.jbpm.formModeler.api.client.FormRenderContext;
import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.formModeler.core.config.FieldTypeManager;
import org.jbpm.formModeler.emf.EmfBasedDataHolder;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TCaseParameter;
import org.omg.cmmn.TCmmnElement;
import org.omg.cmmn.TTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CmmnTaskDataHolder extends EmfBasedDataHolder<TCmmnElement> {
    public static final String TYPE="CmmnTaskDataHolder";

    public CmmnTaskDataHolder(TCmmnElement eobject, String uniqueId) {
        super(eobject,uniqueId);
    }

    @Override
    protected Set<DataFieldHolder> buildDataFieldHolders() throws Exception {
        Set<DataFieldHolder> dataFieldHolders = new TreeSet<DataFieldHolder>();
        for (TCaseParameter field : getEObject()instanceof TTask? ((TTask)getEObject()).getInputs():((TCase)getEObject()).getInput()) {
            if(field.getBindingRef()!=null && field.getBindingRef().getDefinitionRef()!=null){
                DataFieldHolder fieldHolder = new DataFieldHolder(this, field.getName(), Object.class.getName());
                dataFieldHolders.add(fieldHolder);
            }
        }
        return dataFieldHolders;
    }


    @Override
    public Object createInstance(FormRenderContext context) throws Exception {
        return new HashMap<String, Object>();
    }

    @Override
    public void writeValue(Object destination, String propName, Object value) throws Exception {
        if (destination != null) {
            Map<String, Object> map = (Map<String, Object>) destination;
            map.put(propName, value);
        }
    }

    @Override
    public Object readValue(Object source, String propName) throws Exception {
        if (source != null) {
            Map<String, Object> map = (Map<String, Object>) source;
            return map.get(propName);
        }
        return null;
    }

    @Override
    public String getTypeCode() {
        return TYPE;
    }

    @Override
    public boolean isAssignableValue(Object value) {
        return value instanceof Map;
    }
}
