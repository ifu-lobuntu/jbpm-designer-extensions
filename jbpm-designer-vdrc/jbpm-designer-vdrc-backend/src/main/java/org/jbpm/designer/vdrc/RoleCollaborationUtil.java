package org.jbpm.designer.vdrc;

import org.omg.vdml.Activity;
import org.omg.vdml.Port;
import org.omg.vdml.Role;
import org.omg.vdml.Store;

public class RoleCollaborationUtil {

    public static Role getRoleFor(Port r) {
        Role receivingRole = null;
        if (r != null) {
            if (r.eContainer() instanceof Activity) {
                receivingRole = ((Activity) r.eContainer()).getPerformingRole();
            } else if (r.eContainer() instanceof Store) {
                return r.getHandler();
            }
        }
        return receivingRole;
    }

}
