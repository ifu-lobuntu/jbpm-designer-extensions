package org.jbpm.designer.vdan;

import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.util.BoundaryShapePosition;
import org.jbpm.designer.vdml.AbstractVdmlEmfToJsonHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.DCFactory;
import org.omg.vdml.Activity;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Port;
import org.omg.vdml.PortContainer;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.VdmlElement;

public class VdmlActivityNetworkEmfToJsonHelper extends AbstractVdmlEmfToJsonHelper {

    public VdmlActivityNetworkEmfToJsonHelper(ShapeMap resource) {
        super(resource, VdmlActivityNetworkStencil.class);
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
        putMeasuredCharacteristic("durationMeasure", object.getDuration());
        putMeasuredCharacteristic("recurrenceIntervalMeasure", object.getRecurrenceInterval());
        return super.caseActivity(object);
    }

    @Override
    public Object caseValueAdd(ValueAdd object) {
        putMeasuredCharacteristic("valueMeasure", object.getValueMeasurement());
        return super.caseValueAdd(object);
    }

    @Override
    public Object caseResourceUse(ResourceUse object) {
        putMeasuredCharacteristic("quantityMeasure", object.getQuantity());
        putMeasuredCharacteristic("planningPercentageMeasure", object.getPlanningPercentage());
        return super.caseResourceUse(object);
    }

    @Override
    public Object casePort(Port object) {
        putMeasuredCharacteristic("batchSizeMeasure", object.getBatchSize());
        putMeasuredCharacteristic("planningPercentageMeasure", object.getPlanningPercentage());
        putMeasuredCharacteristic("offsetMeasure", object.getOffset());
        return super.casePort(object);
    }

    @Override
    public Object caseInputPort(InputPort object) {
        ensurePortShapePresent((VdmlElement) object.eContainer());
        return super.caseInputPort(object);
    }

    @Override
    public Object caseOutputPort(OutputPort object) {
        ensurePortShapePresent((VdmlElement) object.eContainer());
        return super.caseOutputPort(object);
    }

    protected void ensurePortShapePresent(VdmlElement eContainer) {
        if (eContainer instanceof Activity || eContainer instanceof Store) {
            Shape containerShape = shapeMap.getShape(eContainer);
            VDMLShape parentVdmlShape = (VDMLShape) shapeMap.getDiagramElement(containerShape);
            BoundaryShapePosition.ensureBoundaryShape(containerShape, targetShape, parentVdmlShape);
        }
    }

    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        putMeasuredCharacteristic("duration", object.getDuration());
        putBusinessItem(object.getDeliverable(), "deliverableDefinition");
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

    public void preprocessResource() {
        Map<VdmlElement, VDMLDiagramElement> map = buildVdmlElementToDiagramElementMap();
        buildRoleShapes(map, 800d, 200d);
        buildPortContainerShapes(map);
        buildPortShapes(map);
        buildDeliverableFlowEdges(map);
    }

    private void buildPortContainerShapes(Map<VdmlElement, VDMLDiagramElement> map) {
        TreeIterator<EObject> allContents = owningCollaboration.eAllContents();
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
            if (eObject instanceof Activity && !map.containsKey(eObject)) {
                PortContainer pc = (PortContainer) eObject;
                addPortContainerShape(map, pc, ((Activity) pc).getPerformingRole());
            } else if (eObject instanceof DeliverableFlow) {
                DeliverableFlow df = (DeliverableFlow) eObject;
                PortContainer providingContainer = (PortContainer) df.getProvider().eContainer();
                PortContainer receivingContainer = (PortContainer) df.getRecipient().eContainer();
                if (providingContainer instanceof Store && !map.containsKey(providingContainer)) {
                    addPortContainerShape(map, providingContainer, ((Activity) receivingContainer).getPerformingRole());
                } else if (receivingContainer instanceof Store && !map.containsKey(receivingContainer)) {
                    addPortContainerShape(map, receivingContainer, ((Activity) providingContainer).getPerformingRole());
                }
            }
        }
    }

    protected void addPortContainerShape(Map<VdmlElement, VDMLDiagramElement> map, PortContainer pc, Role responsibleRole) {
        VDMLShape shape = VDMLDIFactory.eINSTANCE.createVDMLShape();
        getDiagram().getOwnedVdmlDiagramElement().add(shape);
        shape.setId(EcoreUtil.generateUUID());
        shape.setVdmlElement(pc);
        map.put(pc, shape);
        VDMLShape roleShape;
        roleShape = (VDMLShape) map.get(responsibleRole);
        shape.setBounds(getNextBoundsOnRight(roleShape));
        roleShape.getOwnedShape().add(shape);
    }

    private Bounds getNextBoundsOnRight(VDMLShape shape) {
        Bounds rightMost = null;
        for (VDMLShape vdmlShape : shape.getOwnedShape()) {
            if (rightMost == null || (vdmlShape.getBounds().getX() + vdmlShape.getBounds().getWidth() > rightMost.getX() + rightMost.getWidth())) {
                rightMost = vdmlShape.getBounds();
            }
        }
        Bounds result = DCFactory.eINSTANCE.createBounds();
        result.setY(10d);
        result.setWidth(200d);
        result.setHeight(100d);
        if (rightMost != null) {
            result.setX(rightMost.getX() + rightMost.getWidth() + 50);
        } else {
            result.setX(50d);
        }
        return result;
    }

    private void buildPortShapes(Map<VdmlElement, VDMLDiagramElement> map) {
        TreeIterator<EObject> allContents = owningCollaboration.eAllContents();
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
            if (eObject instanceof Port && !map.containsKey(eObject)) {
                Port p = (Port) eObject;
                VDMLShape shape = VDMLDIFactory.eINSTANCE.createVDMLShape();
                shape.setId(EcoreUtil.generateUUID());
                shape.setVdmlElement(p);
                map.put(p, shape);
                if (p.eContainer() instanceof Collaboration) {
                    // This should not happen as VDAN owns
                    // collaborationPorts
                } else {
                    PortContainer pc = (PortContainer) p.eContainer();
                    VDMLShape parentShape = (VDMLShape) map.get(pc);
                    parentShape.getBoundaryShapes().add(shape);
                    ((VDMLShape) parentShape.eContainer()).getOwnedShape().add(shape);
                    BoundaryShapePosition pos = BoundaryShapePosition.values()[(parentShape.getBoundaryShapes().size() - 1) % 8];
                    shape.setBounds(pos.getBounds(parentShape.getBounds()));
                }
            }
        }
    }

    private void buildDeliverableFlowEdges(Map<VdmlElement, VDMLDiagramElement> map) {
        TreeIterator<EObject> allContents = owningCollaboration.eAllContents();
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
            if (eObject instanceof DeliverableFlow && !map.containsKey(eObject)) {
                DeliverableFlow d = (DeliverableFlow) eObject;
                // Create flow
                VDMLEdge edge = VDMLDIFactory.eINSTANCE.createVDMLEdge();
                getDiagram().getOwnedVdmlDiagramElement().add(edge);
                edge.setId(EcoreUtil.generateUUID());
                edge.setVdmlElement(d);
                edge.setSourceShape((VDMLShape) map.get(d.getProvider()));
                edge.setTargetShape((VDMLShape) map.get(d.getRecipient()));
                map.put(d, edge);
            }
        }
    }

}
