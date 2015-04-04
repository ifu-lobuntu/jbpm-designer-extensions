package org.jbpm.designer.vdrc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.Port;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.ValueDeliveryModel;

public class VdmlHelper {
    public static Collaboration getCollaboration(XMLResource r){
        for (EObject eObject : r.getContents()) {
            if(eObject instanceof ValueDeliveryModel){
                EList<Collaboration> collaboration = ((ValueDeliveryModel) eObject).getCollaboration();
                for (Collaboration c : collaboration) {
                    return c;
                }
                for (VDMLDiagram d : ((ValueDeliveryModel) eObject).getDiagram()) {
                    if(d.getVdmlElement() instanceof Collaboration){
                        return (Collaboration) d.getVdmlElement();
                    }
                }
            }
        }
        throw new IllegalStateException("Resource " + r.getURI() +" does not have a VDML Collaboration");
    }
    public static VDMLDiagram getDiagram(XMLResource r){
        for (EObject eObject : r.getContents()) {
            if(eObject instanceof ValueDeliveryModel){
                for (VDMLDiagram d : ((ValueDeliveryModel) eObject).getDiagram()) {
                    return d;
                }
            }
        }
        throw new IllegalStateException("Resource " + r.getURI() +" does not have a VDML Diagram");
    }
    public static Role getRoleResponsibleFor(Port r) {
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
