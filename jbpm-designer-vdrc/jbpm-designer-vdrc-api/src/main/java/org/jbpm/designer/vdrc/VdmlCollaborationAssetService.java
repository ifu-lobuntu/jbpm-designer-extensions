package org.jbpm.designer.vdrc;

import java.util.Collection;
import java.util.List;

import org.jboss.errai.bus.server.annotations.Remote;
import org.uberfire.backend.vfs.Path;

@Remote
public interface VdmlCollaborationAssetService {
    public Path createCollaboration(final Path context, final String fileName, CollaborationType type, String initialDiagramProfileName);
    public Collection<Path> resolveCollaborations(final Path context);
    public List<CollaborationDiagramType> getAvailableDiagramTypes();
    public Path createCollaborationDiagram(Path collaborationFile, String otherProfileName) ;
}
