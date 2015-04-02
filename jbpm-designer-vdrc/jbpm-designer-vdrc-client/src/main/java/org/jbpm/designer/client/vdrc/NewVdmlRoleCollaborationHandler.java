package org.jbpm.designer.client.vdrc;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.guvnor.common.services.project.model.Package;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jbpm.designer.vdrc.CollaborationAssetService;
import org.jbpm.designer.vdrc.CollaborationType;
import org.kie.workbench.common.widgets.client.handlers.DefaultNewResourceHandler;
import org.kie.workbench.common.widgets.client.handlers.NewResourcePresenter;
import org.uberfire.backend.vfs.Path;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.commons.data.Pair;
import org.uberfire.ext.widgets.common.client.callbacks.DefaultErrorCallback;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.mvp.impl.PathPlaceRequest;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import com.github.gwtbootstrap.client.ui.ListBox;
import com.google.gwt.user.client.ui.IsWidget;

@ApplicationScoped
public class NewVdmlRoleCollaborationHandler extends DefaultNewResourceHandler {

    @Inject
    private Caller<CollaborationAssetService> designerAssetService;

    @Inject
    private PlaceManager placeManager;

    @Inject
    private VdmlRoleCollaborationType resourceType;

    private ListBox collaborationTypeListBox = new ListBox(false);

    @Override
    public String getDescription() {
        // return DesignerEditorConstants.INSTANCE.businessProcess();
        return "Role Collaboration";
    }
    @Override
    public IsWidget getIcon() {
        return null;
    }

    @Override
    public ResourceTypeDefinition getResourceType() {
        return resourceType;
    }

    @PostConstruct
    private void setupExtensions() {
        collaborationTypeListBox.addItem("Business Network", CollaborationType.BUSINESS_NETWORK.name());
        collaborationTypeListBox.addItem("Capability Method", CollaborationType.CAPABILITY_METHOD.name());
        collaborationTypeListBox.addItem("Community", CollaborationType.COMMUNITY.name());
        collaborationTypeListBox.addItem("Organization", CollaborationType.ORG_UNIT.name());
        this.extensions.add(Pair.newPair("CollaborationType", collaborationTypeListBox));
    }

    @Override
    public void create(final Package pkg, final String baseFileName, final NewResourcePresenter presenter) {
        CollaborationType type = CollaborationType.valueOf(collaborationTypeListBox.getValue());
        designerAssetService.call(new RemoteCallback<Path>() {
            @Override
            public void callback(final Path path) {
                presenter.complete();
                notifySuccess();
                final PlaceRequest place = new PathPlaceRequest(path);
                placeManager.goTo(place);
            }
        }, new DefaultErrorCallback()).createCollaboration(pkg.getPackageMainResourcesPath(), buildFileName(baseFileName, resourceType),
                type);
    }

}
