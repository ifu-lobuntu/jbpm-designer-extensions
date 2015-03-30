package org.jbpm.designer.vdrc;

import java.util.Collection;

import org.jboss.errai.bus.server.annotations.Remote;
import org.uberfire.backend.vfs.Path;

@Remote
public interface CollaborationAssetService {
    public Path createCollaboration(final Path context, final String fileName, CollaborationType type);
    public Collection<Path> resolveCollaborations(final Path context);
    public Path createCollaborationDiagram(Path collaborationFile, String otherProfileName) ;

}
