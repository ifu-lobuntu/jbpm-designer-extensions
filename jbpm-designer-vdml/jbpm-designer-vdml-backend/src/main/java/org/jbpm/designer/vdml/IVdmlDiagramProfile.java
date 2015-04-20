package org.jbpm.designer.vdml;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.jbpm.designer.extensions.api.IEmfDiagramProfile;
import org.omg.dd.di.Diagram;

public interface IVdmlDiagramProfile extends IEmfDiagramProfile {
    CollaborationType getDefaultForCollaborationType();

    Diagram buildDiagramStub(ResourceSet rst, URI uri);
}
