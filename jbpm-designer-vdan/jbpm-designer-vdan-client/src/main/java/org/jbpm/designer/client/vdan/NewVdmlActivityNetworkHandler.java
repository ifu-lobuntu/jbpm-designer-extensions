package org.jbpm.designer.client.vdan;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jbpm.designer.client.vdrc.DefaultNewCollaborationDiagramHandler;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import com.google.gwt.user.client.ui.IsWidget;

@ApplicationScoped
public class NewVdmlActivityNetworkHandler extends DefaultNewCollaborationDiagramHandler{

   @Inject
    private VdmlActivityNetworkType resourceType;

    @Override
    public String getDescription() {
//        return DesignerEditorConstants.INSTANCE.businessProcess();
        return "Value Activity Network";
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
        return "vdan";
    }
}
