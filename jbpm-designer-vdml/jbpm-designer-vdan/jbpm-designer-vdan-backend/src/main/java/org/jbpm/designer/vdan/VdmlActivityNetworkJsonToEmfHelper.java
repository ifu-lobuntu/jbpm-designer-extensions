package org.jbpm.designer.vdan;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Pool;
import org.omg.vdml.PortContainer;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;
import org.omg.vdml.util.VDMLSwitch;

public class VdmlActivityNetworkJsonToEmfHelper extends VDMLSwitch<Object> implements JsonToEmfHelper {
    private ShapeMap shapeMap;
    protected Shape sourceShape;
    private Collaboration owningCollaboration;
    private static Map<String, EClass> COLLABORATION_TYPE_MAP = new HashMap<String, EClass>();

    static {
        COLLABORATION_TYPE_MAP.put("CapabilityMethod", VDMLPackage.eINSTANCE.getCapabilityMethod());
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
            OrgUnit orgUnit = VDMLFactory.eINSTANCE.createOrgUnit();
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
    public void doSwitch(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        super.doSwitch(shapeMap.getModelElement(sourceShape.getResourceId()));
    }

    public VDMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        VDMLDiagram vdmlDiagram = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        result.getContents().add(vdm);
        EClass eClass = COLLABORATION_TYPE_MAP.get(json.getProperty("collaborationtype"));
        owningCollaboration = (Collaboration) VDMLFactory.eINSTANCE.create(eClass);
        vdm.getCollaboration().add(owningCollaboration);
        owningCollaboration.setId(json.getResourceId());
        vdmlDiagram.setVdmlElement(owningCollaboration);
        vdm.getDiagram().add(vdmlDiagram);
        return vdmlDiagram;
    }

    public DiagramElement createElements(Shape shape) {
        DiagramElement de = VdmlActivityNetworkStencil.createDiagramElement(shape.getStencilId());
        VdmlElement el = VdmlActivityNetworkStencil.createElement(shape.getStencilId());
        if (de instanceof VDMLShape) {
            ((VDMLShape) de).setVdmlElement((VdmlElement) el);
        } else if (de instanceof VDMLEdge) {
            ((VDMLEdge) de).setVdmlElement((VdmlElement) el);
        }
        de.setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
        return de;
    }

    @Override
    public EObject create(EClass eType) {
        return VDMLFactory.eINSTANCE.create(eType);
    }

}
