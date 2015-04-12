package org.jbpm.designer.extensions.api;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencilSet;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.jbpm.designer.web.profile.IExtensionDiagramProfile;
import org.uberfire.workbench.events.NotificationEvent;

public interface IEmfDiagramProfile extends IExtensionDiagramProfile, IDiagramProfile, IEmfProfile {

    LinkedStencilSet getLinkedStencilSet();

    void fire(final String notification, final NotificationEvent.NotificationType type);

    void logInfo(String string);

    EmfToJsonHelper createEmfToJsonHelper(ShapeMap resource);

    JsonToEmfHelper createJsonToEmfHelper(ShapeMap resource);

    String getDiagramStencilId();

    boolean mergeOnUpdate();

    EStructuralFeature demandFeature(String featureName);

    IEmfBasedFormBuilder getFormBuilder();

}
