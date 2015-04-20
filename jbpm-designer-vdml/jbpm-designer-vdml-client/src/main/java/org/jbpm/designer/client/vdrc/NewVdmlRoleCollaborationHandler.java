package org.jbpm.designer.client.vdrc;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jbpm.designer.client.vdml.DefaultNewCollaborationDiagramHandler;
import org.jbpm.designer.type.VdmlRoleCollaborationTypeDefinition;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import com.google.gwt.user.client.ui.IsWidget;

@ApplicationScoped
public class NewVdmlRoleCollaborationHandler extends DefaultNewCollaborationDiagramHandler {

    @Inject
    private VdmlRoleCollaborationTypeDefinition resourceType;

    @Override
    public String getDescription() {
        // return DesignerEditorConstants.INSTANCE.businessProcess();
        return "VDML Role Collaboration Diagram";
    }

    @Override
    public IsWidget getIcon() {
        return null;
    }

    @Override
    public ResourceTypeDefinition getResourceType() {
        return resourceType;
    }

    @Override
    public String getProfileName() {
        return "vdrc";

    }
}
