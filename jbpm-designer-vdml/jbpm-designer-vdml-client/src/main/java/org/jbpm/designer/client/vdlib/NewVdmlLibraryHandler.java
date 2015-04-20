package org.jbpm.designer.client.vdlib;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jbpm.designer.client.vdml.DefaultNewCollaborationDiagramHandler;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import com.google.gwt.user.client.ui.IsWidget;

@ApplicationScoped
public class NewVdmlLibraryHandler extends DefaultNewCollaborationDiagramHandler {

    @Inject
    private VdmlLibraryType resourceType;

    @Override
    public String getDescription() {
        // return DesignerEditorConstants.INSTANCE.businessProcess();
        return "VDML Library Diagram";
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
        return "vdlib";
    }

}
