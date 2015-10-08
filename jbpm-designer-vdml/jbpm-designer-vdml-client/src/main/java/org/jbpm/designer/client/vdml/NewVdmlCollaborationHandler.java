package org.jbpm.designer.client.vdml;

import com.google.gwt.user.client.ui.IsWidget;
import org.guvnor.common.services.project.model.Package;
import org.gwtbootstrap3.client.ui.ListBox;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jbpm.designer.type.VdmlCollaborationTypeDefinition;
import org.jbpm.designer.vdml.CollaborationDiagramType;
import org.jbpm.designer.vdml.CollaborationType;
import org.jbpm.designer.vdml.VdmlCollaborationAssetService;
import org.kie.workbench.common.widgets.client.handlers.DefaultNewResourceHandler;
import org.kie.workbench.common.widgets.client.handlers.NewResourcePresenter;
import org.uberfire.backend.vfs.Path;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.commons.data.Pair;
import org.uberfire.ext.editor.commons.client.validation.ValidatorWithReasonCallback;
import org.uberfire.ext.widgets.common.client.callbacks.DefaultErrorCallback;
import org.uberfire.ext.widgets.common.client.common.popups.errors.ErrorPopup;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.mvp.impl.PathPlaceRequest;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class NewVdmlCollaborationHandler extends DefaultNewResourceHandler {

    @Inject
    private Caller<VdmlCollaborationAssetService> designerAssetService;

    @Inject
    private PlaceManager placeManager;

    @Inject
    private VdmlCollaborationTypeDefinition resourceType;

    private ListBox collaborationTypeListBox = new ListBox();
    private ListBox collaborationDiagramTypeListBox = new ListBox();
    private List<CollaborationDiagramType> collaborationDiagramTypes;

    @Override
    public String getDescription() {
        // return DesignerEditorConstants.INSTANCE.businessProcess();
        return "VDML Collaboration";
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
    public void validate(String baseFileName, ValidatorWithReasonCallback callback) {
        CollaborationType type = CollaborationType.valueOf(collaborationTypeListBox.getSelectedValue());
        CollaborationDiagramType diagramType = this.collaborationDiagramTypes.get(collaborationDiagramTypeListBox.getSelectedIndex());
        if(diagramType.getProfileName().equals("vdcm") && type!=CollaborationType.ORG_UNIT){
            ErrorPopup.showMessage("Capability Management Diagrams are supported for Organization Collaborations only");
            callback.onFailure();
            return;
        }
        super.validate(baseFileName, callback);
    }
    @Override
    public List<Pair<String, ? extends IsWidget>> getExtensions() {
        List<Pair<String, ? extends IsWidget>> extensions2 = super.getExtensions();
        if(this.collaborationDiagramTypes==null){
            designerAssetService.call(new RemoteCallback<List<CollaborationDiagramType>>() {
                @Override
                public void callback(final List<CollaborationDiagramType> types) {
                    collaborationDiagramTypes=types;
                    for (CollaborationDiagramType t : types) {
                        collaborationDiagramTypeListBox.addItem(t.getDescription());
                    }
                }
            }, new DefaultErrorCallback()).getAvailableDiagramTypes();

        }
        return extensions2;
    }

    @PostConstruct
    private void setupExtensions() {
        collaborationTypeListBox.addItem("Business Network", CollaborationType.BUSINESS_NETWORK.name());
        collaborationTypeListBox.addItem("Capability Method", CollaborationType.CAPABILITY_METHOD.name());
        collaborationTypeListBox.addItem("Community", CollaborationType.COMMUNITY.name());
        collaborationTypeListBox.addItem("Organization", CollaborationType.ORG_UNIT.name());
        this.extensions.add(Pair.newPair("CollaborationType", collaborationTypeListBox));
        this.extensions.add(Pair.newPair("DiagramType", collaborationDiagramTypeListBox));
    }

    @Override
    public void create(final Package pkg, final String baseFileName, final NewResourcePresenter presenter) {
        CollaborationType type = CollaborationType.valueOf(collaborationTypeListBox.getSelectedValue());
        CollaborationDiagramType diagramType = this.collaborationDiagramTypes.get(collaborationDiagramTypeListBox.getSelectedIndex());
        designerAssetService.call(new RemoteCallback<Path>() {
            @Override
            public void callback(final Path path) {
                presenter.complete();
                notifySuccess();
                final PlaceRequest place = new PathPlaceRequest(path);
                placeManager.goTo(place);
            }
        }, new DefaultErrorCallback()).createCollaboration(pkg.getPackageMainResourcesPath(), buildFileName(baseFileName, resourceType), type,diagramType.getProfileName());
    }

}
