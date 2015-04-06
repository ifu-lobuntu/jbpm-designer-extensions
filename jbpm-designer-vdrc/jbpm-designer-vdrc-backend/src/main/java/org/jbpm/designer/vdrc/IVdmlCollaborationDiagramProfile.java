package org.jbpm.designer.vdrc;

import org.jbpm.designer.extensions.emf.util.IEmfDiagramProfile;

public interface IVdmlCollaborationDiagramProfile extends IEmfDiagramProfile {
    CollaborationType getDefaultForCollaborationType();
}
