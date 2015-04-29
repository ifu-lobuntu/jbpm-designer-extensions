package org.jbpm.designer.uml.codegen;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;
import org.jbpm.designer.extensions.util.NameConverter;
import org.jbpm.designer.uml.code.metamodel.CodeMappedType;
import org.jbpm.designer.uml.code.metamodel.CodePackageReference;
import org.jbpm.designer.uml.code.metamodel.CodeTypeReference;
import org.jbpm.designer.uml.codegen.util.EmfClassifierUtil;

public class UmlToCodeReferenceMap {

    protected static final String MAPPINGS_EXTENSION = "mappings";
    protected static final String[] LANGUAGES = { "java", "js" };

    protected Map<NamedElement, CodeTypeReference> oldClassifierPaths = new HashMap<NamedElement, CodeTypeReference>();
    protected Map<Namespace, CodePackageReference> oldPackagePaths = new HashMap<Namespace, CodePackageReference>();
    protected Map<NamedElement, CodeTypeReference> classifierPaths = new HashMap<NamedElement, CodeTypeReference>();
    protected Map<Namespace, CodePackageReference> packagePaths = new HashMap<Namespace, CodePackageReference>();
    protected Map<Package, Map<String, CodeMappedType>> typeMap = new HashMap<Package, Map<String, CodeMappedType>>();

    public Map<String, CodeMappedType> getTypeMap(Package p) {
        Map<String, CodeMappedType> map = typeMap.get(p);
        if (map == null) {
            map = new HashMap<String, CodeMappedType>();
            typeMap.put(p, map);
            if (p.eResource() != null && p.eResource().getResourceSet() != null) {
                Resource eResource = p.eResource();
                URI uri = eResource.getURI();
                URI mappedTypesUri = uri.trimFileExtension().appendFileExtension(MAPPINGS_EXTENSION);
                for (String language : LANGUAGES) {
                    try {
                        InputStream inStream = eResource.getResourceSet().getURIConverter().createInputStream(mappedTypesUri.appendFileExtension(language));
                        if (inStream != null) {
                            Properties props = new Properties();
                            props.load(inStream);
                            Set<Entry<Object, Object>> entrySet = props.entrySet();
                            for (Entry<Object, Object> entry : entrySet) {
                                String umlClassName = (String) entry.getKey();
                                CodeMappedType cmt = map.get(umlClassName);
                                if (cmt == null) {
                                    map.put(umlClassName, cmt = new CodeMappedType(new HashMap<String, String>()));
                                }
                                cmt.getMappings().put(language, (String) entry.getValue());
                            }
                        }
                    } catch (IOException e1) {
                    }
                }
            }
        }
        return map;
    }

    public CodeTypeReference classifierPathname(NamedElement classifier) {
        CodeTypeReference result = classifierPaths.get(classifier);
        if (result == null) {
            CodeMappedType cmt = getTypeMap(classifier.getNearestPackage()).get(classifier.getQualifiedName());
            if (cmt != null) {
                CodePackageReference pr = packagePathname(classifier.getNamespace());
                CodeTypeReference ctr = new CodeTypeReference(cmt.getMappings().isEmpty(), pr, classifier.getName(), cmt.getMappings());
                classifierPaths.put(classifier, result = ctr);
            }
            if (classifier instanceof PrimitiveType) {
                PrimitiveType root = EmfClassifierUtil.getRootClass((PrimitiveType) classifier);
                if (root.getName().equals("Integer")) {
                    return StdlibMap.javaIntegerObjectType;
                } else if (root.getName().equals("Real")) {
                    return StdlibMap.javaRealObjectType;
                } else if (root.getName().equals("Boolean")) {
                    return StdlibMap.javaBooleanObjectType;
                } else if (root.getName().equals("String")) {
                    return StdlibMap.javaStringType;
                }
            } else {
                CodePackageReference pr = packagePathname(classifier.getNamespace());
                Map<String, String> mappings = EmfClassifierUtil.getMappings(classifier);
                CodeTypeReference ctr = new CodeTypeReference(mappings.isEmpty(), pr, classifier.getName(), mappings);
                classifierPaths.put(classifier, result = ctr);
                return ctr;
            }
        }
        return result;
    }
    public void registerPathname(Namespace p,CodePackageReference ref){
        packagePaths.put(p, ref);
    }
    public CodePackageReference packagePathname(Namespace p) {
        // TODO populate mappings
        CodePackageReference result = packagePaths.get(p);
        if (result == null) {
            Namespace parent = p.getNamespace();
            Map<String, String> packageMappings = EmfClassifierUtil.getMappings(p);
            if (parent == null) {
                packagePaths.put(p, result = new CodePackageReference(null, NameConverter.toValidVariableName(p.getName()).toLowerCase(), packageMappings));
            } else {
                packagePaths.put(p, result = new CodePackageReference(packagePathname(parent), NameConverter.toValidVariableName(p.getName()).toLowerCase(), packageMappings));
            }

        }
        return result;
    }

}