package org.jbpm.designer.vdan;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmmn1.Cmmn1Factory;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Edge;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.emf.util.JsonToEmfHelper;
import org.jbpm.designer.emf.util.ShapeMap;
import org.jbpm.designer.server.diagram.json.Diagram;
import org.jbpm.designer.server.diagram.json.Shape;
import org.jbpm.designer.server.diagram.json.ShapeReference;
import org.jbpm.designer.stencilset.linkage.LinkedStencil;
import org.pavanecce.vdml.metamodel.vdml.Activity;
import org.pavanecce.vdml.metamodel.vdml.Collaboration;
import org.pavanecce.vdml.metamodel.vdml.DeliverableFlow;
import org.pavanecce.vdml.metamodel.vdml.InputDelegation;
import org.pavanecce.vdml.metamodel.vdml.InputPort;
import org.pavanecce.vdml.metamodel.vdml.OrgUnit;
import org.pavanecce.vdml.metamodel.vdml.OutputDelegation;
import org.pavanecce.vdml.metamodel.vdml.OutputPort;
import org.pavanecce.vdml.metamodel.vdml.Pool;
import org.pavanecce.vdml.metamodel.vdml.PortContainer;
import org.pavanecce.vdml.metamodel.vdml.ResourceUse;
import org.pavanecce.vdml.metamodel.vdml.Role;
import org.pavanecce.vdml.metamodel.vdml.Store;
import org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel;
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;
import org.pavanecce.vdml.metamodel.vdml.VdmlFactory;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;
import org.pavanecce.vdml.metamodel.vdml.util.VdmlSwitch;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLShape;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiFactory;

public class VdmlActivityNetworkJsonToEmfHelper extends VdmlSwitch<Object> implements JsonToEmfHelper {
    private ShapeMap shapeMap;
    protected Shape sourceShape;
    private Collaboration owningCollaboration;
    private static Map<String, EClass> COLLABORATION_TYPE_MAP = new HashMap<String, EClass>();

    static {
        COLLABORATION_TYPE_MAP.put("CapabilityMethod", VdmlPackage.eINSTANCE.getCapabilityMethod());
    }
    private LinkedStencil currentStencil;

    public VdmlActivityNetworkJsonToEmfHelper(ShapeMap resource) {
        this.shapeMap = resource;
    }



    @Override
    public Object caseCollaboration(Collaboration object) {
        for (Shape shape : sourceShape.getChildShapes()) {
            if (shape.getStencilId().equals(VdmlActivityNetworkStencil.ROLE.getStencilId())) {
                object.getCollaborationRole().add((Role) shapeMap.getModelElement(shape.getResourceId()));
            }
        }
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseRole(Role object) {
        for (Shape shape : sourceShape.getChildShapes()) {
            if (shape.getStencilId().equals(VdmlActivityNetworkStencil.ACTIVITY.getStencilId())) {
                Activity activity = (Activity) shapeMap.getModelElement(shape.getResourceId());
                object.getPerformedWork().add(activity);
                owningCollaboration.getActivity().add(activity);
            }
        }
        return super.caseRole(object);
    }

    @Override
    public Object caseActivity(Activity object) {
        addPorts(object);
        return super.caseActivity(object);
    }

    private void addPorts(PortContainer object) {
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            Shape shape = shapeMap.get(sr.getResourceId());
            String stencilId = shape.getStencilId();
            if (stencilId.equals(VdmlActivityNetworkStencil.ACTIVITY_INPUT_PORT.getStencilId())
                    || stencilId.equals(VdmlActivityNetworkStencil.STORE_INPUT_PORT.getStencilId())) {
                InputPort inputPort = (InputPort) shapeMap.getModelElement(shape.getResourceId());
                object.getContainedPort().add(inputPort);
            } else if (stencilId.equals(VdmlActivityNetworkStencil.ACTIVITY_OUTPUT_PORT.getStencilId())
                    || stencilId.equals(VdmlActivityNetworkStencil.STORE_OUTPUT_PORT.getStencilId())) {
                OutputPort outputPort = (OutputPort) shapeMap.getModelElement(shape.getResourceId());
                object.getContainedPort().add(outputPort);
            }
        }
    }



    @Override
    public Object casePool(Pool object) {
        return super.casePool(object);
    }

    @Override
    public Object caseStore(Store object) {
        addPorts(object);
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
            OrgUnit orgUnit = VdmlFactory.eINSTANCE.createOrgUnit();
            orgUnit.setName(owningCollaboration.getName() + "OrgUnit");
            model.getCollaboration().add(orgUnit);
            return orgUnit;
        }
    }

    @Override
    public Object caseResourceUse(ResourceUse object) {
        return super.caseResourceUse(object);
    }

    // TODO Repeating pattern, normalize
    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        owningCollaboration.getFlow().add(object);
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            String stencilId = shapeMap.get(sr.getResourceId()).getStencilId();
            if (stencilId.equals(VdmlActivityNetworkStencil.ACTIVITY_INPUT_PORT.getStencilId())
                    || stencilId.equals(VdmlActivityNetworkStencil.STORE_INPUT_PORT.getStencilId())) {
                InputPort p = (InputPort) shapeMap.getModelElement(sr.getResourceId());
                p.setInput(object);
            }
        }
        return super.caseDeliverableFlow(object);
    }

    @Override
    public Object caseInputDelegation(InputDelegation object) {
        owningCollaboration.getInternalPortDelegation().add(object);
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            Shape shape = shapeMap.get(sr.getResourceId());
            String stencilId = shape.getStencilId();
            if (stencilId.equals(VdmlActivityNetworkStencil.ACTIVITY_INPUT_PORT.getStencilId())
                    || stencilId.equals(VdmlActivityNetworkStencil.STORE_INPUT_PORT.getStencilId())) {
                InputPort p = (InputPort) shapeMap.getModelElement(sr.getResourceId());
                object.setTarget(p);
            }
        }
        return super.caseInputDelegation(object);
    }

    @Override
    public Object caseOutputDelegation(OutputDelegation object) {
        owningCollaboration.getInternalPortDelegation().add(object);
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            String stencilId = shapeMap.get(sr.getResourceId()).getStencilId();
            if (stencilId.equals(VdmlActivityNetworkStencil.COLLABORATION_OUTPUT_PORT.getStencilId())) {
                OutputPort p = (OutputPort) shapeMap.getModelElement(sr.getResourceId());
                object.setTarget(p);
            }
        }
        return super.caseOutputDelegation(object);
    }
    @Override
    public Object caseInputPort(InputPort object) {
        if (object.eContainer() == null && sourceShape.getStencilId().equals(VdmlActivityNetworkStencil.COLLABORATION_INPUT_PORT.getStencilId())) {
            owningCollaboration.getContainedPort().add(object);
            for (ShapeReference sr : sourceShape.getOutgoing()) {
                String stencilId = shapeMap.get(sr.getResourceId()).getStencilId();
                if (stencilId.equals(VdmlActivityNetworkStencil.INPUT_DELEGATION.getStencilId())) {
                    InputDelegation p = (InputDelegation) shapeMap.getModelElement(sr.getResourceId());
                    owningCollaboration.getInternalPortDelegation().add(p);
                    p.setSource(object);
                }
            }

        }

        return super.caseInputPort(object);
    }

    @Override
    public Object caseOutputPort(OutputPort object) {
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            Shape shape = shapeMap.get(sr.getResourceId());
            String stencilId = shape.getStencilId();
            if (stencilId.equals(VdmlActivityNetworkStencil.DELIVERABLE_FLOW.getStencilId())) {
                DeliverableFlow flow = (DeliverableFlow) shapeMap.getModelElement(shape.getResourceId());
                object.setOutput(flow);
            } else if (stencilId.equals(VdmlActivityNetworkStencil.OUTPUT_DELEGATION.getStencilId())) {
                OutputDelegation p = (OutputDelegation) shapeMap.getModelElement(sr.getResourceId());
                owningCollaboration.getInternalPortDelegation().add(p);
                p.setSource(object);
            }

        }
        if (object.eContainer() == null && sourceShape.getStencilId().equals(VdmlActivityNetworkStencil.COLLABORATION_OUTPUT_PORT.getStencilId())) {
            owningCollaboration.getContainedPort().add(object);
        }
        return super.caseOutputPort(object);
    }
    //
    //
    // Implementation of abstract methods:
    //
    //
    @Override
    public void linkElements(Shape shape, DiagramElement de, EObject modelElement) {
        if (this.owningCollaboration == null && modelElement instanceof Collaboration) {
            this.owningCollaboration = (Collaboration) modelElement;
        }
        if (de instanceof VDMLShape) {
            ((VDMLShape) de).setVDMLElement((VdmlElement) modelElement);
        } else if (de instanceof VDMLEdge) {
            ((VDMLEdge) de).setVDMLElement((VdmlElement) modelElement);
        }
    }

    public void doSwitch(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        super.doSwitch(shapeMap.getModelElement(sourceShape.getResourceId()));
    }

    public VDMLPlane prepareEmfDiagram(Diagram json, XMLResource result) {
        VDMLDiagram vdmlDiagram = VdmlDiFactory.eINSTANCE.createVDMLDiagram();
        VDMLPlane vdmlPlane = VdmlDiFactory.eINSTANCE.createVDMLPlane();
        vdmlDiagram.setVDMLPlane(vdmlPlane);
        ValueDeliveryModel vdm = VdmlFactory.eINSTANCE.createValueDeliveryModel();
        result.getContents().add(vdm);
        EClass eClass = COLLABORATION_TYPE_MAP.get(json.getProperty("collaborationtype"));
        Collaboration collaboration = (Collaboration) VdmlFactory.eINSTANCE.create(eClass);
        vdm.getCollaboration().add(collaboration);
        collaboration.setId(json.getResourceId());
        vdmlPlane.setVDMLElement(collaboration);
        vdm.getDiagram().add(vdmlDiagram);
        linkElements(json, vdmlPlane, collaboration);
        return vdmlPlane;
    }

    public VDMLLabel setupDiagramElement(EObject el, DiagramElement de) {
        VDMLLabel label = null;
        if (de instanceof VDMLShape) {
            ((VDMLShape) de).setVDMLElement((VdmlElement) el);
            // ((VDMLShape) de).setVDMLLabel(label =
            // CmmnDiFactory.eINSTANCE.createVDMLLabel());
        } else if (de instanceof VDMLEdge) {
            ((VDMLEdge) de).setVDMLElement((VdmlElement) el);
            // ((VDMLEdge) de).setVDMLLabel(label =
            // CmmnDiFactory.eINSTANCE.createVDMLLabel());
        }
        return label;
    }

    @Override
    public EObject create(EClass eType) {
        return Cmmn1Factory.eINSTANCE.create(eType);
    }

    @Override
    public void setTargetElement(Edge edge, ShapeReference target) {
        ((VDMLEdge) edge).setTargetElement(shapeMap.getDiagramElement(target.getResourceId()));
    }

    @Override
    public void setSourceElement(Edge edge, Shape source) {
        ((VDMLEdge) edge).setSourceElement(shapeMap.getDiagramElement(source.getResourceId()));
    }

    @Override
    public EObject createElement(String stencilId) {
        return VdmlActivityNetworkStencil.createElement(stencilId);
    }

    @Override
    public DiagramElement createDiagramElement(String stencilId) {
        return VdmlActivityNetworkStencil.createDiagramElement(stencilId);
    }
}
