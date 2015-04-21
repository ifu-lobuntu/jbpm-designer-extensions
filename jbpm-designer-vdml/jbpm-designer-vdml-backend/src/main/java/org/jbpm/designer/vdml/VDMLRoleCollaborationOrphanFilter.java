package org.jbpm.designer.vdml;

import org.jbpm.designer.vdml.AbstractVdmlJsonEmfHelper.OrphanFilter;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Role;
import org.omg.vdml.VdmlElement;

public class VDMLRoleCollaborationOrphanFilter implements OrphanFilter {

    @Override
    public boolean shouldHaveDiagramElement(VdmlElement e) {
        if (e instanceof DeliverableFlow) {
            DeliverableFlow d = (DeliverableFlow) e;
            Collaboration owningCollaboration = (Collaboration) e.eContainer();
            Role providingRole = VdmlHelper.getRoleResponsibleFor(d.getProvider());
            if (providingRole != null && owningCollaboration.getCollaborationRole().contains(providingRole)) {
                Role receivingRole = VdmlHelper.getRoleResponsibleFor(d.getRecipient());
                if (receivingRole != null && owningCollaboration.getCollaborationRole().contains(receivingRole)) {
                    return receivingRole!=providingRole;
                }
            }
        }
        return true;
    }

}
