package org.jbpm.designer.vdml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.smm.Measure;
import org.omg.vdml.Activity;
import org.omg.vdml.BusinessNetwork;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.Collaboration;
import org.omg.vdml.Community;
import org.omg.vdml.InputPort;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Port;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.ValueDeliveryModel;

public class VdmlHelper {
    public static Collaboration getCollaboration(XMLResource r) {
        for (EObject eObject : r.getContents()) {
            if (eObject instanceof ValueDeliveryModel) {
                EList<Collaboration> collaboration = ((ValueDeliveryModel) eObject).getCollaboration();
                for (Collaboration c : collaboration) {
                    return c;
                }
                for (VDMLDiagram d : ((ValueDeliveryModel) eObject).getDiagram()) {
                    if (d.getVdmlElement() instanceof Collaboration) {
                        return (Collaboration) d.getVdmlElement();
                    }
                }
            }else if(eObject instanceof VDMLDiagram){
                VDMLDiagram d=(VDMLDiagram) eObject;
                if (d.getVdmlElement() instanceof Collaboration) {
                    return (Collaboration) d.getVdmlElement();
                }
            }
        }
        throw new IllegalStateException("Resource " + r.getURI() + " does not have a VDML Collaboration");
    }

    public static VDMLDiagram getDiagram(XMLResource r) {
        for (EObject eObject : r.getContents()) {
            if (eObject instanceof VDMLDiagram) {
                return (VDMLDiagram) eObject;
            } else if (eObject instanceof ValueDeliveryModel) {
                for (VDMLDiagram d : ((ValueDeliveryModel) eObject).getDiagram()) {
                    return d;
                }
            }
        }
        throw new IllegalStateException("Resource " + r.getURI() + " does not have a VDML Diagram");
    }

    public static Role getRoleResponsibleFor(Port r) {
        Role receivingRole = null;
        if (r != null) {
            if (r.eContainer() instanceof Activity) {
                receivingRole = ((Activity) r.eContainer()).getPerformingRole();
            } else if (r.eContainer() instanceof Store) {
                // TODO this won't work - different collaborations. Look at
                // assignments instead
                return r.getHandler();
            }
        }
        return receivingRole;
    }

    public static Role createRole(Collaboration owningCollaboration2) {
        if (owningCollaboration2 instanceof OrgUnit) {
            return VDMLFactory.eINSTANCE.createPosition();
        } else if (owningCollaboration2 instanceof BusinessNetwork) {
            return VDMLFactory.eINSTANCE.createParty();
        } else if (owningCollaboration2 instanceof Community) {
            return VDMLFactory.eINSTANCE.createMember();
        } else if (owningCollaboration2 instanceof CapabilityMethod) {
            return VDMLFactory.eINSTANCE.createPerformer();
        } else {
            return VDMLFactory.eINSTANCE.createRole();
        }
    }

    public static Measure getValueMeasure(ValueAdd field) {
        MeasuredCharacteristic valueMeasurement = field.getValueMeasurement();
        return getMeasure(valueMeasurement);
    }

    public static Measure getMeasure(MeasuredCharacteristic valueMeasurement) {
        return valueMeasurement.getCharacteristicDefinition().getMeasure().get(0);
    }

    public static boolean hasValueMeasure(ValueAdd field) {
        MeasuredCharacteristic vm = field.getValueMeasurement();
        return hasMeasure(vm);
    }

    public static boolean hasMeasure(MeasuredCharacteristic vm) {
        return vm != null && vm.getCharacteristicDefinition() != null && vm.getCharacteristicDefinition().getMeasure().size() > 0;
    }

    public static EList<ValueAdd> getValueAdds(Port p) {
        EList<ValueAdd> valueAdds = null;
        if (p instanceof InputPort) {
            valueAdds = ((InputPort) p).getInput().getProvider().getValueAdd();
        } else {
            valueAdds = ((OutputPort) p).getValueAdd();
        }
        return valueAdds;
    }
}
