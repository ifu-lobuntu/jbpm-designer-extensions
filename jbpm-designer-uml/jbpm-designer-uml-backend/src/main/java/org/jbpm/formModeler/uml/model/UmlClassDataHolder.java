package org.jbpm.formModeler.uml.model;

import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.designer.ucd.UmlTypeMap;
import org.jbpm.formModeler.api.client.FormRenderContext;
import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.formModeler.core.model.PojoDataHolder;
import org.jbpm.formModeler.kie.services.FormRenderContentMarshallerManager;
import org.jbpm.formModeler.service.cdi.CDIBeanLocator;
import org.jbpm.formModeler.uml.integration.UmlClassDataHolderBuilder;
import org.kie.internal.task.api.ContentMarshallerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UmlClassDataHolder extends PojoDataHolder {
    private transient Logger log = LoggerFactory.getLogger(UmlClassDataHolder.class);

    private Class holderClass;

    public UmlClassDataHolder(String holderId, String inputId, String outputId, String holderClass, String renderColor) {
        super(holderId, inputId, outputId, holderClass, renderColor);
    }

    public UmlClassDataHolder(String holderId, String inputId, String outputId, Class holderClass, String renderColor) {
        super(holderId, inputId, outputId, holderClass.getName(), renderColor);
        this.holderClass = holderClass;
        Resource resource = holderClass.eResource();
        String platformString = resource.getURI().toString();
        super.setClassName(platformString + "#" + JBPMECoreHelper.getID(holderClass));
        
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
        return UmlClassDataHolderBuilder.HOLDER_TYPE_UML_CLASS;
    }

    @Override
    public String getInfo() {
        return super.getClassName();
    }

    @Override
    public Set<DataFieldHolder> getFieldHolders() {
        try {
            if (dataFieldHolders == null || dataFieldHolders.size() == 0)
                dataFieldHolders = calculatePropertyNames();
            return dataFieldHolders;
        } catch (Exception e) {
        }
        return null;
    }

    private Set<DataFieldHolder> calculatePropertyNames() throws Exception {

        if (holderClass == null) {
            return null;
        }

        Set<DataFieldHolder> dataFieldHolders = new TreeSet<DataFieldHolder>();

        for (Property field : holderClass.getAllAttributes()) {
            
            Type umlType = field.getType();
            String type = UmlTypeMap.get(umlType.getQualifiedName());
            if(type==null){
                Resource resource = umlType.eResource();
                type=resource.getURI() + "#" + JBPMECoreHelper.getID(umlType);
            }
            DataFieldHolder fieldHolder = new DataFieldHolder(this, field.getName(), type);
            dataFieldHolders.add(fieldHolder);

        }

        return dataFieldHolders;
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
