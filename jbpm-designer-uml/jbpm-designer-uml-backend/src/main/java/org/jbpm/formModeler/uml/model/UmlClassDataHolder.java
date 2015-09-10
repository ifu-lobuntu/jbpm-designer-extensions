package org.jbpm.formModeler.uml.model;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.designer.ucd.UmlTypeMap;
import org.jbpm.formModeler.api.client.FormRenderContext;
import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.formModeler.emf.EmfBasedDataHolder;
import org.jbpm.formModeler.kie.services.FormRenderContentMarshallerManager;
import org.jbpm.formModeler.service.cdi.CDIBeanLocator;
import org.kie.internal.task.api.ContentMarshallerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.TreeSet;

public class UmlClassDataHolder extends EmfBasedDataHolder<Class> {
    public static final String TYPE = "UmlClassDataHolder";
    private final UmlClassIntrospector introspector;
    private transient Logger log = LoggerFactory.getLogger(UmlClassDataHolder.class);

    public UmlClassDataHolder(String holderId, String inputId, String outputId, Class holderClass, String renderColor) {
        this(holderClass, holderId);
        this.setInputId(inputId);
        this.setOutputId(outputId);
        this.setRenderColor(renderColor);
    }

    public UmlClassDataHolder(Class holderClass, String holderId) {
        super(holderClass, holderId);
        this.introspector = createIntrospector(holderClass);

    }

    private PojoUmlClassIntrospector createIntrospector(Class holderClass) {
        return new PojoUmlClassIntrospector();//TODO check for tags in the umlPackage
    }

    @Override
    public Object createInstance(FormRenderContext context) throws Exception {
        FormRenderContentMarshallerManager marshallerManager = (FormRenderContentMarshallerManager) CDIBeanLocator
                .getBeanByType(FormRenderContentMarshallerManager.class);
        ContentMarshallerContext contextMarshaller = marshallerManager.getContentMarshaller(context.getUID());
        ClassLoader classLoader = contextMarshaller.getClassloader();
        return introspector.createInstance(classLoader);
    }

    @Override
    public String getTypeCode() {
        return TYPE;
    }


    @Override
    public void writeValue(Object destination, String propName, Object value) throws Exception {
        if (destination != null && propName != null && propName.length() > 0) {
            introspector.setValue(destination, propName, value);
        }
    }

    @Override
    public Object readValue(Object source, String propName) throws Exception {
        if (source != null && propName != null && propName.length() > 0) {
            return introspector.getValue(source, propName);
        }
        return null;
    }


    @Override
    public boolean isAssignableValue(Object value) {
        return this.introspector.isInstance(value);
    }

    @Override

    protected Set<DataFieldHolder> buildDataFieldHolders() throws Exception {
        Set<DataFieldHolder> dataFieldHolders = new TreeSet<DataFieldHolder>();
        for (Property field : getEObject().getAllAttributes()) {
            Type umlType = field.getType();
            String type = UmlTypeMap.get(umlType.getQualifiedName());
            if (type == null) {
                Resource resource = umlType.eResource();
                type = resource.getURI() + "#" + JBPMECoreHelper.getID(umlType);
            }
            DataFieldHolder fieldHolder = new DataFieldHolder(this, field.getName(), type);
            dataFieldHolders.add(fieldHolder);
        }
        return dataFieldHolders;
    }
}
