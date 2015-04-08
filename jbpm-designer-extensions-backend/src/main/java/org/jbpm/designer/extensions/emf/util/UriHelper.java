package org.jbpm.designer.extensions.emf.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

public class UriHelper {
    public static void setPlatformUriHandler(ResourceSet resourceSet, final URIHandler uriHandlerToUse) {
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        replaceUriHandler(uriHandlerToUse, uriHandlers);
        Resource d = new ResourceImpl() {
            // Jeez!!!!
            {
                replaceUriHandler(uriHandlerToUse, getDefaultURIConverter().getURIHandlers());
            }
        };

    }

    private static void replaceUriHandler(URIHandler uriHandlerToUse, EList<URIHandler> uriHandlers) {
        URI testPlatformURI = URI.createPlatformResourceURI("/project1/src/test.xmi", true);
        for (URIHandler uriHandler : new ArrayList<URIHandler>(uriHandlers)) {
            if (uriHandler.canHandle(testPlatformURI)) {
                uriHandlers.remove(uriHandler);
            }
        }
        uriHandlers.add(uriHandlerToUse);
    }

    public static URI findMappedUri(ResourceSet rst, String string) {
        URI mappedUri = null;
        Set<URI> keySet = rst.getURIConverter().getURIMap().keySet();
        for (URI uri : keySet) {
            if (uri.toString().endsWith(string)) {
                mappedUri = uri;
                break;
            }
        }
        return mappedUri;
    }

    public static <T extends EObject> T resolveEObject(ResourceSet rst, String[] split, EAttribute feature, EClass classifier) {
        return resolveEObject(rst, split, Collections.singletonMap(classifier, feature));
    }

    @SuppressWarnings("unchecked")
    public static <T extends EObject> T resolveEObject(ResourceSet rst, String[] split, Map<EClass, EAttribute> classFeatureMap) {
        Set<Entry<EClass, EAttribute>> entrySet = classFeatureMap.entrySet();
        URI uri = findMappedUri(rst, split[1]);
        String identifier = split[0];
        if (uri == null) {
            uri = URI.createPlatformResourceURI(split[1], true);
        }
        Resource resource = rst.getResource(uri, true);
        // Only look at the primary object or its contents
        EObject pkg = resource.getContents().get(0);
        if (isMatch(entrySet, identifier, pkg)) {
            return (T) pkg;
        }
        TreeIterator<EObject> ti = pkg.eAllContents();
        while (ti.hasNext()) {
            EObject eObject = (EObject) ti.next();
            if (isMatch(entrySet, identifier, eObject)) {
                return (T) eObject;
            }
        }
        return null;
    }

    protected static boolean isMatch(Set<Entry<EClass, EAttribute>> entrySet, String identifier, EObject eObject) {
        boolean isMatch = false;
        for (Entry<EClass, EAttribute> entry : entrySet) {
            if (entry.getKey().isInstance(eObject) && eObject.eGet(entry.getValue()).equals(identifier)) {
                isMatch = true;
            }
        }
        return isMatch;
    }
}
