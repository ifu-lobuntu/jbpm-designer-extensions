package org.jbpm.designer.client.vdml;

import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;
import org.guvnor.common.services.project.context.ProjectContext;
import org.gwtbootstrap3.client.ui.ListBox;
import org.gwtbootstrap3.client.ui.TextBox;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jbpm.designer.vdml.VdmlCollaborationAssetService;
import org.kie.workbench.common.widgets.client.handlers.NewResourceView;
import org.kie.workbench.common.widgets.client.resources.i18n.CommonConstants;
import org.uberfire.backend.vfs.Path;

import javax.inject.Inject;
import java.util.*;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class CollaborationsListBox extends ListBox {
    public class NameSyncChangeHandler implements ChangeHandler, KeyPressHandler, Handler {
        TextBox nameField;
        private String extension;

        @Override
        public void onChange(ChangeEvent event) {
            updateNameField();
        }

        private void updateNameField() {
            if (nameField == null) {
                nameField = findNameField();
            }
            if (nameField != null) {
                nameField.setEnabled(false);
                Path selectedCollaboration = getSelectedCollaboration();
                if (selectedCollaboration == null) {
                    nameField.setText("");
                } else {
                    nameField.setText(selectedCollaboration.getFileName().replace(".vdcol", ""));
                }
            }
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }

        @Override
        public void onKeyPress(KeyPressEvent event) {
            int c=event.getUnicodeCharCode();
//            updateNameField();
        }

        @Override
        public void onAttachOrDetach(AttachEvent event) {
            if (event.isAttached()) {
                updateNameField();
            }else if(nameField!=null){
                nameField.setEnabled(true);
            }
        }
    }

    @Inject
    protected Caller<VdmlCollaborationAssetService> projectService;

    private final List<Path> collaborationFiles = new ArrayList<Path>();
    private NameSyncChangeHandler nameSync;

    public void setContext(final ProjectContext context, final String extension) {
        if (nameSync == null) {
            nameSync = new NameSyncChangeHandler();
            addChangeHandler(nameSync);
            addKeyPressHandler(nameSync);
            addAttachHandler(nameSync);
            nameSync.setExtension( extension);
        }
        clear();
        collaborationFiles.clear();
        setEnabled(true);

        // Disable and set default content if Project is not selected
        if (context.getActiveProject() == null) {
            addItem(CommonConstants.INSTANCE.ItemUndefinedPath());
            setEnabled(false);
            return;
        }

        Path path = context.getActivePackage().getPackageMainResourcesPath();
        projectService.call(new RemoteCallback<Collection<Path>>() {
            @Override
            public void callback(final Collection<Path> pkgs) {
                final List<Path> sortedPackages = new ArrayList<Path>();
                sortedPackages.addAll(pkgs);
                Collections.sort(sortedPackages, new Comparator<Path>() {
                    @Override
                    public int compare(final Path p1, final Path p2) {
                        return p1.getFileName().compareTo(p2.getFileName());
                    }
                });

                // Disable and set default content if no Packages available
                if (sortedPackages.size() == 0) {
                    addItem(CommonConstants.INSTANCE.ItemUndefinedPath());
                    setEnabled(false);
                    return;
                }

                // Add to ListBox
                for (Path pkg : sortedPackages) {
                    addItem(pkg.getFileName());
                    collaborationFiles.add(pkg);
                }
                setSelectedIndex(-1);
            }
        }).resolveCollaborations(path);
    }

    private TextBox findNameField() {
        Widget parent = getParent();
        while (!(parent instanceof NewResourceView || parent == null)) {
            parent = parent.getParent();
        }
        if (parent instanceof NewResourceView) {
            return findNameField((NewResourceView) parent);
        }
        return null;
    }

    private TextBox findNameField(ComplexPanel nrv) {
        for (int i = 0; i < nrv.getWidgetCount(); i++) {
            Widget widget = nrv.getWidget(i);
            if (widget instanceof TextBox) {
                // There is only one field
                return (TextBox) widget;
            } else if (widget instanceof ComplexPanel) {
                TextBox f = findNameField((ComplexPanel) widget);
                if (f != null) {
                    return f;
                }
            }
        }
        ;
        return null;
    }

    public Path getSelectedCollaboration() {
        if (collaborationFiles.size() == 0)
            return null;
        final int selectedIndex = getSelectedIndex();
        return selectedIndex < 0 && selectedIndex >= collaborationFiles.size() ? null : collaborationFiles.get(selectedIndex);
    }

}
