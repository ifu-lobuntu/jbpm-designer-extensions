package org.jbpm.designer.vdan;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.designer.vdrc.AbstractVdmlEmfToJsonHelper;
import org.omg.vdml.Activity;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Role;
import org.omg.vdml.Store;

public class VdmlActivityNetworkEmfToJsonHelper extends AbstractVdmlEmfToJsonHelper{

    public VdmlActivityNetworkEmfToJsonHelper(ShapeMap resource) {
        super(resource);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        targetShape.getProperties().put("collaborationtype", object.eClass().getName());
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseCapabilityMethod(CapabilityMethod object) {
        return super.caseCapabilityMethod(object);
    }

    @Override
    public Object caseRole(Role object) {
        return super.caseRole(object);
    }

    @Override
    public Object caseActivity(Activity object) {
        return super.caseActivity(object);
    }


    @Override
    public Object caseInputPort(InputPort object) {
        return super.caseInputPort(object);
    }

    @Override
    public Object caseOutputPort(OutputPort object) {
        return super.caseOutputPort(object);
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
    public Object caseStore(Store object) {
        return super.caseStore(object);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, org.omg.dd.di.DiagramElement de) {
        return VdmlActivityNetworkStencil.findStencilByElement(me, de);
    }

    @Override
    public void preprocessResource(XMLResource resource) {
    }
}
