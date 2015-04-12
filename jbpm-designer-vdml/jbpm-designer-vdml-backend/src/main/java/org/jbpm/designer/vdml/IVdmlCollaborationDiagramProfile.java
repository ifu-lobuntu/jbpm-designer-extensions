package org.jbpm.designer.vdml;

import org.jbpm.designer.extensions.api.IEmfDiagramProfile;

public interface IVdmlCollaborationDiagramProfile extends IEmfDiagramProfile {
    CollaborationType getDefaultForCollaborationType();
}
