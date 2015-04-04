package org.jbpm.designer.vdan;

import org.eclipse.emf.ecore.EClass;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdrc.AbstractVdmlJsonToEmfHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Pool;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;

public class VdmlActivityNetworkJsonToEmfHelper extends AbstractVdmlJsonToEmfHelper {
    public VdmlActivityNetworkJsonToEmfHelper(ShapeMap resource) {
        super(resource);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseRole(Role object) {
        owningCollaboration.getActivity().addAll(object.getPerformedWork());
        return super.caseRole(object);
    }

    @Override
    public Object caseActivity(Activity object) {
        return super.caseActivity(object);
    }

    @Override
    public Object casePool(Pool object) {
        return super.casePool(object);
    }

    @Override
    public Object caseStore(Store object) {
        findBackingOrgUnit().getOwnedStore().add(object);
        return super.caseStore(object);
    }

    private OrgUnit findBackingOrgUnit() {
        if (owningCollaboration instanceof OrgUnit) {
            return (OrgUnit) owningCollaboration;
        } else {
            ValueDeliveryModel model = (ValueDeliveryModel) owningCollaboration.eContainer();
            for (Collaboration c : model.getCollaboration()) {
                if (c instanceof OrgUnit && c.getName().equals(owningCollaboration.getName() + "OrgUnit")) {
                    return (OrgUnit) c;
                }
            }
            OrgUnit orgUnit = VDMLFactory.eINSTANCE.createOrgUnit();
            orgUnit.setName(owningCollaboration.getName() + "OrgUnit");
            model.getCollaboration().add(orgUnit);
            return orgUnit;
        }
    }

    @Override
    public Object caseResourceUse(ResourceUse object) {
        Activity a = (Activity) object.getDeliverable().eContainer();
        a.getResourceUse().add(object);
        return super.caseResourceUse(object);
    }

    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        return super.caseDeliverableFlow(object);
    }

    @Override
    public Object caseInputDelegation(InputDelegation object) {
        return super.caseInputDelegation(object);
    }

    @Override
    public Object caseOutputDelegation(OutputDelegation object) {
        return super.caseOutputDelegation(object);
    }

    @Override
    public Object caseInputPort(InputPort object) {
        return super.caseInputPort(object);
    }

    @Override
    public Object caseOutputPort(OutputPort object) {
        return super.caseOutputPort(object);
    }

    protected EClass[] getManagedClasses() {
        VDMLPackage vp = VDMLPackage.eINSTANCE;
        return new EClass[] { vp.getRole(), vp.getActivity(), vp.getOutputPort(), vp.getInputPort(), vp.getDeliverableFlow(), vp.getResourceUse(),
                vp.getInputDelegation(), vp.getOutputDelegation(), vp.getValueAdd() };
    }


    @Override
    protected VDMLDiagramElement createDiagramElement(String stencilId) {
        return VdmlActivityNetworkStencil.createDiagramElement(stencilId);
    }

    @Override
    protected VdmlElement createElement(String stencilId) {
        return VdmlActivityNetworkStencil.createElement(stencilId);
    }

}
