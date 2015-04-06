package org.jbpm.designer.client.vdrc;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import org.guvnor.common.services.project.context.ProjectContext;
import org.guvnor.common.services.project.model.Package;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jbpm.designer.vdrc.VdmlCollaborationAssetService;
import org.kie.workbench.common.services.shared.project.KieProjectService;
import org.kie.workbench.common.services.shared.validation.ValidationService;
import org.kie.workbench.common.widgets.client.handlers.NewResourceHandler;
import org.kie.workbench.common.widgets.client.handlers.NewResourcePresenter;
import org.kie.workbench.common.widgets.client.handlers.PackageContextProvider;
import org.kie.workbench.common.widgets.client.resources.i18n.CommonConstants;
import org.uberfire.backend.vfs.Path;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.commons.data.Pair;
import org.uberfire.ext.editor.commons.client.validation.ValidatorWithReasonCallback;
import org.uberfire.ext.widgets.common.client.callbacks.DefaultErrorCallback;
import org.uberfire.ext.widgets.common.client.common.BusyIndicatorView;
import org.uberfire.ext.widgets.common.client.common.popups.errors.ErrorPopup;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.mvp.impl.PathPlaceRequest;
import org.uberfire.workbench.events.NotificationEvent;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import com.google.gwt.core.client.Callback;
import com.google.gwt.user.client.ui.IsWidget;

/**
 * Handler for the creation of new Items that require a Name and Path
 */
public abstract class DefaultNewCollaborationDiagramHandler implements NewResourceHandler, PackageContextProvider {

    protected final List<Pair<String, ? extends IsWidget>> extensions = new LinkedList<Pair<String, ? extends IsWidget>>();
    @Inject
    private Caller<VdmlCollaborationAssetService> designerAssetService;
    
    @Inject
    protected CollaborationsListBox collaborationsListBox;

    @Inject
    protected ProjectContext context;

    @Inject
    protected Caller<KieProjectService> projectService;

    @Inject
    protected Caller<ValidationService> validationService;

    @Inject
    private PlaceManager placeManager;

    @Inject
    private Event<NotificationEvent> notificationEvent;

    @Inject
    private BusyIndicatorView busyIndicatorView;

    @PostConstruct
    private void setupExtensions() {
        this.extensions.add(Pair.newPair("Collaborations", collaborationsListBox));
    }

    @Override
    public List<Pair<String, ? extends IsWidget>> getExtensions() {
        this.collaborationsListBox.setContext(context, true);
        return this.extensions;
    }

    public abstract String getProfileName();

    @Override
    public void create(final Package pkg, final String baseFileName, final NewResourcePresenter presenter) {
        // TODO warn the user we're ignoring the filename, or find a better
        // approach
        designerAssetService.call(getSuccessCallback(presenter), new DefaultErrorCallback()).createCollaborationDiagram(
                collaborationsListBox.getSelectedCollaboration(), getProfileName());
    }

    @Override
    public void validate(final String baseFileName, final ValidatorWithReasonCallback callback) {
        if (collaborationsListBox.getSelectedCollaboration() == null) {
            ErrorPopup.showMessage(CommonConstants.INSTANCE.MissingPath());
            callback.onFailure();
            return;
        }

        final String fileName = buildFileName(baseFileName, getResourceType());

        validationService.call(new RemoteCallback<Boolean>() {
            @Override
            public void callback(final Boolean response) {
                if (Boolean.TRUE.equals(response)) {
                    callback.onSuccess();
                } else {
                    callback.onFailure(CommonConstants.INSTANCE.InvalidFileName0(baseFileName));
                }
            }
        }).isFileNameValid(fileName);
    }

    @Override
    public void acceptContext(final ProjectContext context, final Callback<Boolean, Void> callback) {
        callback.onSuccess(context != null && context.getActivePackage() != null);
    }

    @Override
    public Package getPackage() {
        return context.getActivePackage();
    }

    protected String buildFileName(final String baseFileName, final ResourceTypeDefinition resourceType) {
        final String suffix = resourceType.getSuffix();
        final String prefix = resourceType.getPrefix();
        final String extension = !(suffix == null || "".equals(suffix)) ? "." + resourceType.getSuffix() : "";
        if (baseFileName.endsWith(extension)) {
            return prefix + baseFileName;
        }
        return prefix + baseFileName + extension;
    }

    protected void notifySuccess() {
        notificationEvent.fire(new NotificationEvent(CommonConstants.INSTANCE.ItemCreatedSuccessfully()));
    }

    protected RemoteCallback<Path> getSuccessCallback(final NewResourcePresenter presenter) {
        return new RemoteCallback<Path>() {

            @Override
            public void callback(final Path path) {
                busyIndicatorView.hideBusyIndicator();
                presenter.complete();
                notifySuccess();
                final PlaceRequest place = new PathPlaceRequest(path);
                placeManager.goTo(place);
            }

        };
    }
}