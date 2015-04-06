package org.jbpm.designer.client.vdrc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.inject.Inject;

import org.guvnor.common.services.project.context.ProjectContext;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jbpm.designer.vdrc.VdmlCollaborationAssetService;
import org.kie.workbench.common.widgets.client.resources.i18n.CommonConstants;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.PathFactory;

import com.github.gwtbootstrap.client.ui.ListBox;

public class CollaborationsListBox extends ListBox {
    @Inject
    protected Caller<VdmlCollaborationAssetService> projectService;

    private final List<Path> collaborationFiles = new ArrayList<Path>();

    public void setContext(final ProjectContext context, final boolean includeDefaultPackage) {
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

                // Remove default package, if not required (after sorting it is
                // guaranteed to be at index 0)
                if (!includeDefaultPackage) {
                    sortedPackages.remove(0);
                }

                // Disable and set default content if no Packages available
                if (sortedPackages.size() == 0) {
                    addItem(CommonConstants.INSTANCE.ItemUndefinedPath());
                    setEnabled(false);
                    return;
                }

                // Add to ListBox
                int selectedIndex = -1;
                for (Path pkg : sortedPackages) {
                    addItem(pkg.getFileName());
                    collaborationFiles.add(pkg);
                    if (false) {
                        selectedIndex = collaborationFiles.indexOf(pkg);
                    }
                }
                if (selectedIndex != -1) {
                    setSelectedIndex(selectedIndex);
                } else {
                    setSelectedIndex(0);
                }
            }
        }).resolveCollaborations(path);
    }

    public Path getSelectedCollaboration() {
        if (collaborationFiles.size() == 0)
            return null;
        final int selectedIndex = getSelectedIndex();
        return selectedIndex < 0 && selectedIndex >= collaborationFiles.size() ? null : collaborationFiles.get(selectedIndex);
    }

}
