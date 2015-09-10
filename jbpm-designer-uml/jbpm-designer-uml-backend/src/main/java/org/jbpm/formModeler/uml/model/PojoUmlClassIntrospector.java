package org.jbpm.formModeler.uml.model;

import org.eclipse.uml2.uml.Class;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PojoUmlClassIntrospector implements UmlClassIntrospector {
    protected Class umlClass;
    protected java.lang.Class javaClass;

    @Override
    public void setClass(Class c) {
        this.umlClass = c;
    }

    @Override
    public Object createInstance(ClassLoader cl) throws Exception {
        if (javaClass == null) {
            String pkg = umlClass.eResource().getURI().trimSegments(1).toPlatformString(true).replace('/', '.');
            if (pkg.charAt(0) == '.') {
                pkg = pkg.substring(1);
            }
            if (pkg.charAt(pkg.length() - 1) == '.') {
                pkg = pkg.substring(0, pkg.length() - 1);
            }
            while (javaClass == null) {
                try {
                    javaClass = cl.loadClass(pkg + "." + umlClass.getName());
                } catch (ClassNotFoundException e) {
                    if (pkg.indexOf('.') < 0) {
                        //Try class name alone
                        javaClass = cl.loadClass(umlClass.getName());
                    }
                    pkg = pkg.substring(pkg.indexOf('.', 0) + 1);
                }
            }
        }
        return javaClass.newInstance();
    }

    @Override
    public Object getValue(Object from, String prop) throws Exception {
        return from.getClass().getMethod("get" + capitalize(prop)).invoke(from);
    }

    @Override
    public void setValue(Object destination, String propName, Object value) throws Exception {
        java.lang.Class<?> destinationClass = destination.getClass();
        java.lang.reflect.Field field = getDeclaredField(propName, destinationClass);
        propName = capitalize(propName);
        if (value instanceof List && field.getType().isAssignableFrom(Set.class)) {
            value = new HashSet((List) value);
        }
        Method setterMethod = destination.getClass().getMethod("set" + propName, new java.lang.Class[]{field.getType()});
        setterMethod.invoke(destination, new Object[]{value});
    }

    @Override
    public boolean isInstance(Object value) {
        java.lang.Class<?> cls = value.getClass();
        while (cls != Object.class) {
            if (cls.getSimpleName().equals(umlClass.getName())) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    private String capitalize(String propName) {
        propName = Character.toUpperCase(propName.charAt(0)) + propName.substring(1);
        return propName;
    }

    private Field getDeclaredField(String propName, java.lang.Class<?> destinationClass) throws NoSuchFieldException {
        try {
            return destinationClass.getDeclaredField(propName);
        } catch (NoSuchFieldException e) {
            if (destinationClass.getSuperclass() == Object.class) {
                throw e;
            } else {
                return getDeclaredField(propName, destinationClass.getSuperclass());
            }
        }
    }
}
