package org.jbpm.formModeler.uml.model;

import org.eclipse.uml2.uml.Class;
import org.jbpm.document.Document;
import org.jbpm.document.service.impl.DocumentImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DocumentUmlClassIntrospector extends PojoUmlClassIntrospector implements UmlClassIntrospector {

    @Override
    public void setClass(Class c) {
        this.umlClass = c;
        super.javaClass = DocumentImpl.class;
    }

    @Override
    public Object createInstance(ClassLoader cl) throws Exception {
        return new DocumentImpl();
    }

    @Override
    public Object getValue(Object from, String prop) throws Exception {
        try {
            return super.getValue(from, prop);
        } catch (Exception e) {
            return ((Document) from).getAttribute(prop);
        }
    }

    @Override
    public void setValue(Object destination, String propName, Object value) throws Exception {
        try {
            super.setValue(destination, propName, value);
        } catch (Exception e) {
            if (value != null) {
                ((Document) destination).addAttribute(propName, value.toString());
            }
        }

    }

    @Override
    public boolean isInstance(Object value) {
        return value instanceof Document;//TODO refine this to check the documentType against the umlClass
    }
}
