package org.jbpm.designer.extensions.emf.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.omg.dd.di.DiagramElement;

public class AbstractEmfJsonMarshaller {
    protected IEmfDiagramProfile profile;

    protected AbstractEmfJsonMarshaller(IEmfDiagramProfile profile) {
        this.profile = profile;
    }

    protected void setUriHandler(ResourceSet resourceSet) {
        UriHelper.setPlatformUriHandler(resourceSet, profile.getUriHandler());
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
