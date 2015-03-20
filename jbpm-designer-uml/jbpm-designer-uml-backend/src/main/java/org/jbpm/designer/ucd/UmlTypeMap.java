package org.jbpm.designer.ucd;

import java.util.HashMap;
import java.util.Map;

public class UmlTypeMap {
    private static Map<String, String> typeMap = new HashMap<String, String>();
    static {
        typeMap.put("cmmntypes::String", "java.lang.String");
        typeMap.put("cmmntypes::Boolean", "java.lang.Boolean");
        typeMap.put("cmmntypes::Integer", "java.lang.Integer");
        typeMap.put("cmmntypes::Float", "java.lang.Float");
        typeMap.put("cmmntypes::Double", "java.lang.Double");
        typeMap.put("cmmntypes::Date", "java.util.Date");
        typeMap.put("cmmntypes::DateTime", "java.util.Date");
    }
    public static String get(String qualifiedName) {
        return typeMap.get(qualifiedName);
    }

}
