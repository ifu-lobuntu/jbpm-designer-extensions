package org.jbpm.designer.vdcm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdml.AbstractVdmlJsonToEmfHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.vdml.Activity;
import org.omg.vdml.CapabilityOffer;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Pool;
import org.omg.vdml.Position;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.VdmlElement;

public class VdmlCapabilityManagementJsonToEmfHelper extends AbstractVdmlJsonToEmfHelper {
    private OrgUnit owningOrgUnit;

    public VdmlCapabilityManagementJsonToEmfHelper(ShapeMap resource) {
        super(resource, VdmlCapabilityManagementStencil.class);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseRole(Role object) {
        return super.caseRole(object);
    }
    @Override
    public Object casePosition(Position object) {
        owningOrgUnit.getPosition().add(object);
        return super.casePosition(object);
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
    public Object caseOrgUnit(OrgUnit object) {
        return super.caseOrgUnit(object);
    }

    @Override
    public Object caseStore(Store object) {
        owningOrgUnit.getOwnedStore().add(object);
        return super.caseStore(object);
    }

    @Override
    public VDMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        VDMLDiagram diagram = super.prepareEmfDiagram(json, result);
        if (super.owningCollaboration != null) {
            this.owningOrgUnit = (OrgUnit) super.owningCollaboration;
            for (CapabilityOffer co : this.owningOrgUnit.getCapabilityOffer()) {
                co.getMethod().clear();
                co.getCapabilityResource().clear();
            }
            for (Position p : this.owningOrgUnit.getPosition()) {
                // TODO this is a problem for externally referenced pools
                p.getActorPool().clear();
            }
        }
        return diagram;
    }

    @Override
    public Object caseResourceUse(ResourceUse object) {
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
        return new EClass[] { vp.getPosition(), vp.getStore(), vp.getPool(), vp.getCapabilityOffer() };
    }

    @Override
    protected VDMLDiagramElement createDiagramElement(String stencilId) {
        return VdmlCapabilityManagementStencil.createDiagramElement(stencilId);
    }

    @Override
    protected VdmlElement createElement(String stencilId) {
        EClass elementType = VdmlCapabilityManagementStencil.findStencilById(stencilId).getElementType();
        if(elementType==null){
            return null;
        }
        return (VdmlElement) super.create(elementType);
    }

}
