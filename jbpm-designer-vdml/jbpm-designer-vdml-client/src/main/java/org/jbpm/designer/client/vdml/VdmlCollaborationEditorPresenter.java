package org.jbpm.designer.client.vdml;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.VFSService;
import org.uberfire.client.annotations.WorkbenchEditor;
import org.uberfire.client.annotations.WorkbenchPartTitle;
import org.uberfire.client.annotations.WorkbenchPartView;
import org.uberfire.client.workbench.events.ChangeTitleWidgetEvent;
import org.uberfire.ext.widgets.common.client.ace.AceEditorMode;
import org.uberfire.ext.widgets.core.client.editors.texteditor.TextEditorPresenter;
import org.uberfire.ext.widgets.core.client.resources.i18n.CoreConstants;
import org.uberfire.lifecycle.IsDirty;
import org.uberfire.lifecycle.OnClose;
import org.uberfire.lifecycle.OnOpen;
import org.uberfire.lifecycle.OnSave;
import org.uberfire.lifecycle.OnStartup;
import org.uberfire.mvp.PlaceRequest;

import com.google.gwt.user.client.ui.IsWidget;

@Dependent
@WorkbenchEditor(identifier = "vdml.collaboration.editor", supportedTypes = {VdmlCollaborationType.class})
public class VdmlCollaborationEditorPresenter
        extends TextEditorPresenter {

    @Inject
    private Caller<VFSService> vfsServices;

    @Inject
    private Event<ChangeTitleWidgetEvent> changeTitleWidgetEvent;

    @OnStartup
    public void onStartup(final Path path, final PlaceRequest placeRequest) {
        vfsServices.call(new RemoteCallback<String>() {
            @Override
            public void callback(String response) {
                if (response == null) {
                    view.setContent( CoreConstants.INSTANCE.EmptyEntry(),AceEditorMode.XML);
                } else {
                    view.setContent(response,AceEditorMode.XML);
                }
                changeTitleWidgetEvent.fire(
                        new ChangeTitleWidgetEvent(
                                placeRequest,
                                CoreConstants.INSTANCE.TextEditor() +" [" + path.getFileName() + "]"));

            }
        }).readAllString(path);
    }

    @OnSave
    public void onSave() {
        vfsServices.call(new RemoteCallback<Path>() {
            @Override
            public void callback(Path response) {
                view.setDirty(false);
            }
        }).write(path, view.getContent());
    }

    @IsDirty
    public boolean isDirty() {
        return super.isDirty();
    }

    @OnClose
    public void onClose() {
        this.path = null;
    }

    @OnOpen
    public void onOpen() {
        super.onOpen();
    }

    @WorkbenchPartTitle
    public String getTitle() {
        return CoreConstants.INSTANCE.TextEditor();
    }

    @WorkbenchPartView
    public IsWidget getWidget() {
        return super.getWidget();
    }

}
