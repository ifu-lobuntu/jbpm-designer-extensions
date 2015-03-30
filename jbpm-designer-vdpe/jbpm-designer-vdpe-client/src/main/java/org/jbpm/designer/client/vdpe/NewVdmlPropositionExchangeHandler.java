package org.jbpm.designer.client.vdpe;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.guvnor.common.services.project.model.Package;
import org.jboss.errai.common.client.api.Caller;
import org.jbpm.designer.client.vdrc.DefaultNewCollaborationDiagramHandler;
import org.jbpm.designer.vdrc.CollaborationAssetService;
import org.kie.workbench.common.widgets.client.handlers.NewResourcePresenter;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.ext.widgets.common.client.callbacks.DefaultErrorCallback;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import com.google.gwt.user.client.ui.IsWidget;

@ApplicationScoped
public class NewVdmlPropositionExchangeHandler extends DefaultNewCollaborationDiagramHandler {

    @Inject
    private Caller<CollaborationAssetService> designerAssetService;

    @Inject
    private PlaceManager placeManager;

    @Inject
    private VdmlPropositionExchangeType resourceType;

    @Override
    public String getDescription() {
//        return DesignerEditorConstants.INSTANCE.businessProcess();
        return "Value Proposition Exchange";
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
    public void create( final Package pkg,
                        final String baseFileName,
                        final NewResourcePresenter presenter ) {
        //TODO warn the user we're ignoring the filename, or find a better approach
        designerAssetService.call(getSuccessCallback(presenter), new DefaultErrorCallback() ).createCollaborationDiagram(collaborationsListBox.getSelectedCollaboration(),"vdpe" );
    }

}
