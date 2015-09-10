package org.jbpm.formModeler.uml.model;

import org.eclipse.uml2.uml.Class;

public interface UmlClassIntrospector {
    void setClass(Class c);
    Object createInstance(ClassLoader cl) throws Exception;
    Object getValue(Object from, String prop) throws Exception;
    void setValue(Object from, String prop, Object value) throws Exception;

    boolean isInstance(Object value);
}
