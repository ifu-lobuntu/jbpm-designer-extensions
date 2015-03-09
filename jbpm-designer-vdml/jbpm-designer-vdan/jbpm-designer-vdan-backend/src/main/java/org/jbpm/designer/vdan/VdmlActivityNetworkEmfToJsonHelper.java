package org.jbpm.designer.vdan;

import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.extensions.diagram.Point;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
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
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.util.VDMLSwitch;

public class VdmlActivityNetworkEmfToJsonHelper extends VDMLSwitch<Object> implements EmfToJsonHelper {
    protected Shape targetShape;
    private ShapeMap shapeMap;
    private Collaboration owningCollaboration;

    public VdmlActivityNetworkEmfToJsonHelper(ShapeMap resource) {
        super();
        this.shapeMap = resource;
    }

    @Override
    public void doSwitch(LinkedStencil validator, Shape targetShape, EObject me) {
        if (owningCollaboration == null && me instanceof Collaboration) {
            this.owningCollaboration = (Collaboration) me;
        }
        this.targetShape = targetShape;
        doSwitch(me);
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
        addPorts(object);
        return super.caseActivity(object);
    }

    public void addPorts(PortContainer object) {
        for (Port port : object.getContainedPort()) {
            Shape out = shapeMap.getShape(port);
            targetShape.addOutgoing(out);
            Point upperLeft = out.getUpperLeft();
            Point lowerRight = out.getLowerRight();
            if (upperLeft != null && upperLeft.getX() != null && upperLeft.getY() != null && lowerRight != null && lowerRight.getY() != null) {
                double absoluteX = (upperLeft.getX() + lowerRight.getX()) / 2;
                double absoluteY = (upperLeft.getY() + lowerRight.getY()) / 2;
                out.getDockers().add(
                        new Point(absoluteX - targetShape.getBounds().getUpperLeft().getX(), absoluteY - targetShape.getBounds().getUpperLeft().getY()));
            }
        }
    }

    // TODO repeating pattern - normalize
    @Override
    public Object caseInputPort(InputPort object) {
        for (InputDelegation d : object.getInputDelegation()) {
            Shape out = shapeMap.getShape(d);
            targetShape.addOutgoing(out);
        }
        return super.caseInputPort(object);
    }

    @Override
    public Object caseOutputPort(OutputPort object) {
        if (object.getOutput() != null) {
            Shape out = shapeMap.getShape(object.getOutput());
            targetShape.addOutgoing(out);
        }
        for (OutputDelegation d : object.getOutputDelegation()) {
            Shape out = shapeMap.getShape(d);
            targetShape.addOutgoing(out);
        }
        return super.caseOutputPort(object);
    }

    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        if (object.getRecipient() != null) {
            // Shape out = getShape(getDiagramElement(object.getRecipient()));
            // targetShape.addOutgoing(out);
        }
        return super.caseDeliverableFlow(object);
    }

    @Override
    public Object caseInputDelegation(InputDelegation object) {
        if (object.getTarget() != null) {
            // Shape out = getShape(getDiagramElement(object.getTarget()));
            // targetShape.addOutgoing(out);
        }
        return super.caseInputDelegation(object);
    }

    @Override
    public Object caseOutputDelegation(OutputDelegation object) {
        if (object.getTarget() != null) {
            // Shape out = getShape(getDiagramElement(object.getTarget()));
            // targetShape.addOutgoing(out);
        }
        return super.caseOutputDelegation(object);
    }

    // normalize end
    @Override
    public Object caseStore(Store object) {
        addPorts(object);
        return super.caseStore(object);
    }

    @Override
    public void linkElements(org.omg.dd.di.DiagramElement diagramElement, Shape shape) {
    }

    @Override
    public org.omg.dd.di.Diagram getDiagram(int i) {
        ValueDeliveryModel dr = (ValueDeliveryModel) shapeMap.getResource().getContents().get(0);
        return dr.getDiagram().get(i);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, org.omg.dd.di.DiagramElement de) {
        return VdmlActivityNetworkStencil.findStencilByElement(me, de);
    }
}
