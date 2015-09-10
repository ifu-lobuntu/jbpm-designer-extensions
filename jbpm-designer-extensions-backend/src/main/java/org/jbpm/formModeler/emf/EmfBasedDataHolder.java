package org.jbpm.formModeler.emf;


import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.formModeler.core.model.DefaultDataHolder;

import java.util.Set;

public abstract class EmfBasedDataHolder <T extends EObject> extends DefaultDataHolder {

    private final T eobject;
    private String inputId;
    private String outputId;
    protected Set<DataFieldHolder> dataFieldHolders;


    public EmfBasedDataHolder(T eobject, String uniqueId) {
        this.eobject=eobject;
        this.uniqueId=uniqueId;
    }

    protected abstract Set<DataFieldHolder> buildDataFieldHolders() throws Exception;
    @Override
    public String getInfo() {
        return getEObject().eResource().getURI() + "#" + JBPMECoreHelper.getID(getEObject());
    }


    @Override
    public String getInputId() {
        return inputId;
    }

    public T getEObject() {
        return eobject;
    }

    @Override
    public String getOuputId() {
        return outputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public void setOutputId(String outputId) {
        this.outputId = outputId;
    }

    @Override
    public Object readFromBindingExperssion(Object source, String bindingExpression) throws Exception {
        if (source == null || StringUtils.isEmpty(bindingExpression) || bindingExpression.indexOf("/") == -1)
            return null;

        bindingExpression = bindingExpressionUtil.extractBindingExpression(bindingExpression);

        String[] bindingParts = bindingExpression.split("/");

        if (bindingParts.length == 2) {
            return readValue(source, bindingParts[1]);
        }
        return null;
    }

    @Override
    public Set<DataFieldHolder> getFieldHolders() {
        try {
            if (dataFieldHolders == null || dataFieldHolders.size() == 0)
                dataFieldHolders = buildDataFieldHolders();
            return dataFieldHolders;
        } catch (Exception e) {
        }
        return null;
    }


    @Override
    public DataFieldHolder getDataFieldHolderById(String fieldHolderId) {
        if (getFieldHolders() != null) {
            for (DataFieldHolder dataFieldHolder : getFieldHolders()) {
                if (dataFieldHolder.getId().equals(fieldHolderId))
                    return dataFieldHolder;
            }
        }
        return null;
    }


}
