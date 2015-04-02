package org.jbpm.designer.vdan;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
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
        if (object.eContainer() == null && sourceShape.getStencilId().equals(VdmlActivityNetworkStencil.COLLABORATION_INPUT_PORT.getStencilId())) {
            owningCollaboration.getContainedPort().add(object);
        }
        return super.caseInputPort(object);
    }

    @Override
    public Object caseOutputPort(OutputPort object) {
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

    @Override
    public Object convertFromString(LinkedProperty property, String string, Class<?> targetType) {
        return null;
    }

    @Override
    public void postprocessResource(XMLResource resource) {
    }

}
