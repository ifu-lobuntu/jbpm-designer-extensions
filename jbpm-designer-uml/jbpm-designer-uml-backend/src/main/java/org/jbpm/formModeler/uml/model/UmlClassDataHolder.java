package org.jbpm.formModeler.uml.model;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.util.BeanUtil;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.designer.ucd.UmlTypeMap;
import org.jbpm.formModeler.api.client.FormRenderContext;
import org.jbpm.formModeler.api.model.DataFieldHolder;
import org.jbpm.formModeler.api.model.Field;
import org.jbpm.formModeler.core.model.PojoDataHolder;
import org.jbpm.formModeler.kie.services.FormRenderContentMarshallerManager;
import org.jbpm.formModeler.service.cdi.CDIBeanLocator;
import org.jbpm.formModeler.uml.integration.UmlClassDataHolderBuilder;
import org.kie.internal.task.api.ContentMarshallerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.*;

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
        if (resource.getURI().isPlatformResource()) {
            String s = resource.getURI().trimSegments(1).toPlatformString(true);
            s = s.substring(s.indexOf('/', 2) + 1);
            s = s.replaceAll("src/main/resources/", "");
            s = s.replaceAll("/", ".");
            s = s + "." + holderClass.getName();
            super.setClassName(s + "," + platformString + "#" + JBPMECoreHelper.getID(holderClass));
        } else {
            super.setClassName(platformString + "#" + JBPMECoreHelper.getID(holderClass));
        }
    }

    @Override
    public Object createInstance(FormRenderContext context) throws Exception {
        FormRenderContentMarshallerManager marshallerManager = (FormRenderContentMarshallerManager) CDIBeanLocator
                .getBeanByType(FormRenderContentMarshallerManager.class);
        ContentMarshallerContext contextMarshaller = marshallerManager.getContentMarshaller(context.getUID());
        ClassLoader classLoader = contextMarshaller.getClassloader();
        String className = super.getClassName();
        if (className.indexOf(',') > 0) {
            className = className.substring(0, className.indexOf(','));
        }
        return createInstance(classLoader.loadClass(className));
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
        if (holderClass == null) {
            return super.getFieldHolders();
        } else {
            try {
                if (dataFieldHolders == null || dataFieldHolders.size() == 0)
                    dataFieldHolders = calculatePropertyNames();
                return dataFieldHolders;
            } catch (Exception e) {
            }
            return null;
        }
    }

    @Override
    public void writeValue(Object destination, String propName, Object value) throws Exception {
        if (destination != null && propName != null && propName.length() > 0) {
            if ("this".equals(propName)) {
                if(value!=null && destination!=value){
                    //Will only happen when there was no Input object associated, such as on process creation
                    for (PropertyDescriptor pd : Introspector.getBeanInfo(destination.getClass()).getPropertyDescriptors()) {
                        if(pd.getWriteMethod()!=null && pd.getReadMethod()!=null) {
                            writeValue(destination, pd.getName(), readValue(value,pd.getName()));
                        }
                    }
                }
                return;
            } else {
                java.lang.reflect.Field field = destination.getClass().getDeclaredField(propName);
                propName = Character.toUpperCase(propName.charAt(0)) + propName.substring(1);
                if (value instanceof List && field.getType().isAssignableFrom(Set.class)) {
                    value = new HashSet((List) value);
                }
                Method setterMethod = destination.getClass().getMethod("set" + propName, new java.lang.Class[]{field.getType()});
                setterMethod.invoke(destination, new Object[]{value});
            }
        }
    }

    @Override
    public Object readFromBindingExperssion(Object source, String bindingExpression) throws Exception {
        if (bindingExpression.endsWith("/this")) {
            return source;
        }
        return super.readFromBindingExperssion(source, bindingExpression);
    }

    @Override
    public Object readValue(Object source, String propName) throws Exception {
        if (propName.equals("this")) {
            return source;
        }
        Object value = super.readValue(source, propName);
        if(value instanceof Set){
            return new ArrayList((Set) value);
        }
        return value;
    }

    @Override
    protected boolean isValidType(String returnType) throws Exception {
        return super.isValidType(returnType);
    }

    @Override
    public boolean isAssignableValue(Object value) {
        if(value==null){
            return false;
        }else{
            java.lang.Class<?> cls = value.getClass();
            while(cls!=Object.class) {
                if (getClassName().startsWith(cls.getName())) {
                    return true;
                }
                cls=cls.getSuperclass();
            }
        }
        return false;
    }

    @Override
    public String getInputBinding(String fieldName) {
        return super.getInputBinding(fieldName);
    }

    @Override
    public String getOuputBinding(String fieldName) {
        return super.getOuputBinding(fieldName);
    }

    @Override
    public boolean containsOutputBinding(String bindingString) {
        return super.containsOutputBinding(bindingString);
    }

    @Override
    public boolean containsBinding(String bindingString) {
        return super.containsBinding(bindingString);
    }

    @Override
    public boolean containsInputBinding(String bindingString) {
        return super.containsInputBinding(bindingString);
    }

    @Override
    public boolean isAssignableForField(Field field) {
        return super.isAssignableForField(field);
    }

    @Override
    protected boolean containsBinding(String bindingString, String id) {
        if (StringUtils.isEmpty(bindingString) || StringUtils.isEmpty(id)) return false;

        String rawbinding = bindingExpressionUtil.extractBindingExpression(bindingString);

        String[] parts = rawbinding.split("/");
        return id.equals(parts[0]);
    }

    private Set<DataFieldHolder> calculatePropertyNames() throws Exception {

        if (holderClass == null) {
            return null;
        }

        Set<DataFieldHolder> dataFieldHolders = new TreeSet<DataFieldHolder>();

        for (Property field : holderClass.getAllAttributes()) {

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
        String className = super.getClassName();
        if (className.indexOf(',') > 0) {
            className = className.substring(0, className.indexOf(','));
        }
        return java.lang.Class.forName(className);
    }

    @Override
    public Logger getLogger() {
        return this.log;
    }
}
