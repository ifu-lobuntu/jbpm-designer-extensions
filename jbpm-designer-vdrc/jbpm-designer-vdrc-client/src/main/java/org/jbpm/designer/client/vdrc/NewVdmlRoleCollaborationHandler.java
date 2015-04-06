package org.jbpm.designer.client.vdrc;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jbpm.designer.vdrc.VdmlRoleCollaborationTypeDefinition;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import com.google.gwt.user.client.ui.IsWidget;

@ApplicationScoped
public class NewVdmlRoleCollaborationHandler extends DefaultNewCollaborationDiagramHandler {

    @Inject
    private VdmlRoleCollaborationTypeDefinition resourceType;

    @Override
    public String getDescription() {
        // return DesignerEditorConstants.INSTANCE.businessProcess();
        return "Value Role Collaboration";
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
