package org.jbpm.designer.extensions.emf.util;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencilSet;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.jbpm.designer.web.profile.IExtensionDiagramProfile;
import org.uberfire.workbench.events.NotificationEvent;

public interface IEmfDiagramProfile extends IExtensionDiagramProfile,IDiagramProfile{

    LinkedStencilSet getLinkedStencilSet();

    void fire(final String notification, final NotificationEvent.NotificationType type);

    void logInfo(String string);


    ResourceFactoryImpl prepareResourceSet(ResourceSet resourceSet);

    EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource);

    JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource);

    void setUriHandler(URIHandler handler);

    URIHandler getUriHandler();

    String getDiagramStencilId();

    boolean useIdAttribute();

    IEmfDiagramProfile getOtherProfile(String string);

}
