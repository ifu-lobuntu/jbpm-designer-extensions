package org.jbpm.designer.client.vdlib;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.guvnor.common.services.project.model.Package;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jbpm.designer.client.vdml.DefaultNewCollaborationDiagramHandler;
import org.jbpm.designer.service.DesignerAssetService;
import org.kie.workbench.common.widgets.client.handlers.DefaultNewResourceHandler;
import org.kie.workbench.common.widgets.client.handlers.NewResourcePresenter;
import org.uberfire.backend.vfs.Path;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.ext.widgets.common.client.callbacks.DefaultErrorCallback;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.mvp.impl.PathPlaceRequest;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import com.google.gwt.user.client.ui.IsWidget;

@ApplicationScoped
public class NewVdmlLibraryHandler extends DefaultNewResourceHandler {

    @Inject
    private Caller<DesignerAssetService> designerAssetService;

    @Inject
    private PlaceManager placeManager;

    @Inject
    private VdmlLibraryType resourceType;

    @Override
    public String getDescription() {
        // return DesignerEditorConstants.INSTANCE.businessProcess();
        return "Value Library";
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
    public void create(final Package pkg, final String baseFileName, final NewResourcePresenter presenter) {
        designerAssetService.call(new RemoteCallback<Path>() {
            @Override
            public void callback(final Path path) {
                presenter.complete();
                notifySuccess();
                final PlaceRequest place = new PathPlaceRequest(path);
                placeManager.goTo(place);
            }
        }, new DefaultErrorCallback()).createProcess(pkg.getPackageMainResourcesPath(), buildFileName(baseFileName, resourceType));
    }

}
