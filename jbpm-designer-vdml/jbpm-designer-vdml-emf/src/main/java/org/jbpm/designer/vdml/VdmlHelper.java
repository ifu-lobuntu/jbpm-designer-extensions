package org.jbpm.designer.vdml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.omg.smm.Characteristic;
import org.omg.smm.Measure;
import org.omg.vdml.*;

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
        return vm != null && hasMeasure(vm.getCharacteristicDefinition());
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

    public static BusinessItem findOrCreateBusinessItemFor(BusinessItemDefinition bid, Collaboration owningCollaboration2) {
        BusinessItem deliverable = null;
        for (BusinessItem bi : owningCollaboration2.getBusinessItem()) {
            if (bi.getDefinition() != null && bi.getDefinition().equals(bid)) {
                deliverable = bi;
                break;
            }
        }
        if (deliverable == null) {
            deliverable = VDMLFactory.eINSTANCE.createBusinessItem();
            deliverable.setDefinition(bid);
            deliverable.setName(bid.getName());
            owningCollaboration2.getBusinessItem().add(deliverable);
        }
        return deliverable;
    }

    public static ValueDeliveryModel getValueDeliveryModelIn(Resource eResource) {
        for (EObject eo : eResource.getContents()) {
            if (eo instanceof ValueDeliveryModel) {
                return (ValueDeliveryModel) eo;
            } 
        }
        return null;
    }

    public static String getClassName(Measure m) {
        URI packageUri = m.eResource().getURI().trimSegments(1);
        String ps = packageUri.toPlatformString(true);
        ps=ps.substring(ps.indexOf("src/main/resources/") + "src/main/resources/".length());
        return ps.replace('/','.')+m.getName();
    }

    public static boolean hasMeasure(Characteristic c) {
        return c!=null && c.getMeasure().size()>0;
    }

    public static DelegationContext getDefaultDelegationContext(Activity a) {
        DelegationContext defaultDelegationContext = null;
        for (DelegationContext delegationContext : a.getDelegationContext()) {
            if (delegationContext.getParentContext() instanceof Scenario && Boolean.TRUE.equals(((Scenario) delegationContext.getParentContext()).getIsCommon())) {
                defaultDelegationContext = delegationContext;
                break;
            }
        }
        return defaultDelegationContext;
    }
    public static OutputDelegation getDefaultDelegation(OutputPort p) {
        for (OutputDelegation od : p.getDelegatedOutput()) {
            if(od.eContainer() instanceof DelegationContext){
                DelegationContext dc= (DelegationContext) od.eContainer();
                if(dc.getParentContext() instanceof Scenario && Boolean.TRUE.equals(((Scenario)dc.getParentContext()).getIsCommon())){
                    return od;
                }
            }
        }
        return null;
    }
    public static InputDelegation getDefaultDelegation(InputPort p) {
        for (InputDelegation od : p.getInputDelegation()) {
            if(od.eContainer() instanceof DelegationContext){
                DelegationContext dc= (DelegationContext) od.eContainer();
                if(dc.getParentContext() instanceof Scenario && Boolean.TRUE.equals(((Scenario)dc.getParentContext()).getIsCommon())){
                    return od;
                }
            }
        }
        return null;
    }
}
