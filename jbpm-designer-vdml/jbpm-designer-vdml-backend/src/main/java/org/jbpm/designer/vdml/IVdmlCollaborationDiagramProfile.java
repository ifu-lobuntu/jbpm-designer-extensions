package org.jbpm.designer.vdml;

import org.jbpm.designer.extensions.emf.util.IEmfDiagramProfile;

public interface IVdmlCollaborationDiagramProfile extends IEmfDiagramProfile {
    CollaborationType getDefaultForCollaborationType();
}
