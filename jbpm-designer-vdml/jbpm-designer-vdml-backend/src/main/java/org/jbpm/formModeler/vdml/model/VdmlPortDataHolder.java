package org.jbpm.formModeler.vdml.model;

import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.formModeler.api.client.FormRenderContext;
import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.formModeler.core.model.PojoDataHolder;
import org.jbpm.formModeler.kie.services.FormRenderContentMarshallerManager;
import org.jbpm.formModeler.service.cdi.CDIBeanLocator;
import org.jbpm.formModeler.vdml.integration.VdmlPortDataHolderBuilder;
import org.kie.internal.task.api.ContentMarshallerContext;
import org.omg.smm.GradeMeasure;
import org.omg.smm.Measure;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Port;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.ValueElement;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VdmlPortDataHolder extends PojoDataHolder {
    private transient Logger log = LoggerFactory.getLogger(VdmlPortDataHolder.class);

    private Port holderPort;

    public VdmlPortDataHolder(String holderId, String inputId, String outputId, String holderClass, String renderColor) {
        super(holderId, inputId, outputId, holderClass, renderColor);
    }

    public VdmlPortDataHolder(String holderId, String inputId, String outputId, Port holderPort, String renderColor) {
        super(holderId, inputId, outputId, holderPort.getName(), renderColor);
        this.holderPort = holderPort;
        Resource resource = holderPort.eResource();
        String platformString = resource.getURI().toString();
        super.setClassName(platformString + "#" + resource.getURIFragment(holderPort));

    }

    @Override
    public Object createInstance(FormRenderContext context) throws Exception {
        FormRenderContentMarshallerManager marshallerManager = (FormRenderContentMarshallerManager) CDIBeanLocator
                .getBeanByType(FormRenderContentMarshallerManager.class);
        ContentMarshallerContext contextMarshaller = marshallerManager.getContentMarshaller(context.getUID());
        ClassLoader classLoader = contextMarshaller.getClassloader();
        return createInstance(classLoader.loadClass(getClassName()));
    }

    @Override
    public String getTypeCode() {
        return VdmlPortDataHolderBuilder.HOLDER_TYPE_VDML_PORT;
    }

    @Override
    public String getInfo() {
        return super.getClassName();
    }

    @Override
    public Set<DataFieldHolder> getFieldHolders() {
        try {
            if (dataFieldHolders == null || dataFieldHolders.size() == 0 || true)
                dataFieldHolders = calculatePropertyNames();
            return dataFieldHolders;
        } catch (Exception e) {
        }
        return null;
    }

    private Set<DataFieldHolder> calculatePropertyNames() throws Exception {

        if (holderPort == null) {
            return null;
        }

        Set<DataFieldHolder> dataFieldHolders = new TreeSet<DataFieldHolder>();
        for (ValueAdd field : VdmlHelper.getValueAdds(holderPort)) {
            if (VdmlHelper.hasValueMeasure(field)) {
                Measure m = VdmlHelper.getValueMeasure(field);
                String type = "java.lang.Double";
                if (m instanceof GradeMeasure) {
                    // TODO represent as enum
                    type = m.getName();
                }
                DataFieldHolder fieldHolder = new DataFieldHolder(this, field.getName(), type);
                dataFieldHolders.add(fieldHolder);
            }
        }
        if(VdmlHelper.hasMeasure(holderPort.getBatchSize())){
            String type = "java.lang.Double";
            Measure m=VdmlHelper.getMeasure(holderPort.getBatchSize());
            if (m instanceof GradeMeasure) {
                // TODO represent as enum
                type = m.getName();
            }

            dataFieldHolders.add(new DataFieldHolder(this, "quantity", type));
            
        }
        return dataFieldHolders;
    }

    //TODO bla bla. That valueAdd should already be in the right context
    boolean isValueAddInPropositionContext(DeliverableFlow flow, ValueAdd va) {
        EList<ValueElement> aggregatedTo = va.getAggregatedTo();
        for (ValueElement valueElement : aggregatedTo) {
            if (valueElement instanceof ValuePropositionComponent) {
                ValueProposition vp = (ValueProposition) valueElement.eContainer();
                if (VdmlHelper.getRoleResponsibleFor(flow.getProvider()).getId().equals(vp.getProvider().getId())
                        && VdmlHelper.getRoleResponsibleFor(flow.getRecipient()).getId().equals(vp.getRecipient().getId())) {
                    return true;
                }
            }
        }
        return false;
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

    @Override
    protected java.lang.Class getHolderClass() throws ClassNotFoundException {
        return null;
    }

    @Override
    public Logger getLogger() {
        return this.log;
    }
}
