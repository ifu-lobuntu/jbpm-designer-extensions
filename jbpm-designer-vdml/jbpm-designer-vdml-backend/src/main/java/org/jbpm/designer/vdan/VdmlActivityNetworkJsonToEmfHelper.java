package org.jbpm.designer.vdan;

import org.eclipse.emf.ecore.EClass;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdml.AbstractVdmlJsonToEmfHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Pool;
import org.omg.vdml.Port;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.VdmlElement;

public class VdmlActivityNetworkJsonToEmfHelper extends AbstractVdmlJsonToEmfHelper {
    public VdmlActivityNetworkJsonToEmfHelper(ShapeMap resource) {
        super(resource, VdmlActivityNetworkStencil.class);
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
        object.setDuration(buildMeasuredCharacteristic("durationMeasure"));
        object.setRecurrenceInterval(buildMeasuredCharacteristic("recurrenceIntervalMeasure"));
        return super.caseActivity(object);
    }

    @Override
    public Object casePool(Pool object) {
        
        return super.casePool(object);
    }

    @Override
    public Object caseValueAdd(ValueAdd object) {
        object.setValueMeasurement(buildMeasuredCharacteristic("valueMeasure"));
        return super.caseValueAdd(object);
    }

    @Override
    public Object caseStore(Store object) {
        return super.caseStore(object);
    }

    @Override
    public Object caseResourceUse(ResourceUse object) {
        Activity a = (Activity) object.getDeliverable().eContainer();
        a.getResourceUse().add(object);
        object.setQuantity(buildMeasuredCharacteristic("quantityMeasure"));
        object.setPlanningPercentage(buildMeasuredCharacteristic("planningPercentageMeasure"));
        return super.caseResourceUse(object);
    }

    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        object.setDuration(buildMeasuredCharacteristic("durationMeasure"));
        object.setDeliverable(buildBusinessItem("deliverableDefinition"));
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
    public Object casePort(Port object) {
        object.setBatchSize(buildMeasuredCharacteristic("batchSizeMeasure"));
        object.setPlanningPercentage(buildMeasuredCharacteristic("planningPercentageMeasure"));
        object.setOffset(buildMeasuredCharacteristic("offsetMeasure"));
        return super.casePort(object);
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
        VdmlActivityNetworkStencil stencil = VdmlActivityNetworkStencil.findStencilById(stencilId);
        if (stencil != null && stencil.getElementType() != null) {
            return (VdmlElement) super.create(stencil.getElementType());
        } else {
            return null;
        }
    }

}
