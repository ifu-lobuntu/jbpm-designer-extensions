package org.jbpm.designer.emf.util;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.jbpm.designer.stencilset.linkage.LinkedStencilSet;
import org.uberfire.workbench.events.NotificationEvent;

public interface IEmfDiagramProfile {

    LinkedStencilSet getLinkedStencilSet();

    void fire(final String notification, final NotificationEvent.NotificationType type);

    void logInfo(String string);

    String getStencilSetURL();

    String getStencilSetNamespaceURL();

    ResourceFactoryImpl prepareResourceSet(ResourceSet resourceSet);

    EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource);

    JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource);

    void setUriHandler(URIHandler handler);

    URIHandler getUriHandler();

    String getDiagramStencilId();

    boolean useIdAttribute();

    boolean processRequest(HttpServletRequest req, HttpServletResponse resp, String action, String processId) throws IOException;

}
