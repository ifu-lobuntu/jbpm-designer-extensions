package org.jbpm.designer.extensions.emf.util;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.omg.dd.di.DiagramElement;

public class AbstractEmfJsonMarshaller {
    protected IEmfDiagramProfile profile;

    protected AbstractEmfJsonMarshaller(IEmfDiagramProfile profile) {
        this.profile = profile;
    }

    protected void setUriHandler(ResourceSet resourceSet) {
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        URI testPlatformURI = URI.createPlatformResourceURI("/project1/src/test.xmi", true);
        for (URIHandler uriHandler : new ArrayList<URIHandler>(uriHandlers)) {
            if (uriHandler.canHandle(testPlatformURI)) {
                uriHandlers.remove(uriHandler);
            }
        }
        uriHandlers.add(profile.getUriHandler());
    }

    protected EObject getModelElement(DiagramElement de) {
        if (de == null) {
            // e.g. floating edges
            return null;
        } else {
            EList<EObject> modelElements = de.getModelElement();
            return modelElements.isEmpty() ? null : modelElements.get(0);
        }
    }

}
