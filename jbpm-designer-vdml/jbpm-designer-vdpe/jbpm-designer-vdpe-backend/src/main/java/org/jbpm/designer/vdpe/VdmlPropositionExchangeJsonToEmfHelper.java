package org.jbpm.designer.vdpe;

import java.util.HashMap;
import java.util.List;
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
import org.pavanecce.vdml.metamodel.vdml.Collaboration;
import org.pavanecce.vdml.metamodel.vdml.Role;
import org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel;
import org.pavanecce.vdml.metamodel.vdml.ValueProposition;
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

public class VdmlPropositionExchangeJsonToEmfHelper extends VdmlSwitch<Object> implements JsonToEmfHelper {
    private ShapeMap resource;
    protected Shape sourceShape;
    private static Map<String, EClass> COLLABORATION_TYPE_MAP = new HashMap<String, EClass>();
    static {
        COLLABORATION_TYPE_MAP.put("CapabilityMethod", VdmlPackage.eINSTANCE.getCapabilityMethod());
    }
    private LinkedStencil currentStencil;

    public VdmlPropositionExchangeJsonToEmfHelper(ShapeMap resource) {
        this.resource = resource;
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        for (Shape shape : sourceShape.getChildShapes()) {
            if (shape.getStencilId().equals(VdmlPropositionExchangeStencil.ROLE.getStencilId())) {
                object.getCollaborationRole().add((Role) resource.getModelElement(shape.getResourceId()));
            }
        }
        return super.caseCollaboration(object);
    }
    @Override
    public Object caseRole(Role object) {
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            VDMLEdge edge = (VDMLEdge) resource.getDiagramElement(sr.getResourceId());
            if(edge.getTarget().getModelElement() instanceof ValueProposition){
                object.getProvidedProposition().add((ValueProposition) edge.getTarget().getModelElement());
            }
        }
        return super.caseRole(object);
    }
    @Override
    public Object caseValueProposition(ValueProposition object) {
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            VDMLEdge edge = (VDMLEdge) resource.getDiagramElement(sr.getResourceId());
            if(edge.getTarget().getModelElement() instanceof Role){
                object.setRecipient((Role) edge.getTarget().getModelElement());
            }
        }
        return super.caseValueProposition(object);
    }
    @Override
    public void linkElements(Shape shape, DiagramElement de, EObject modelElement) {
        if (de instanceof VDMLShape) {
            ((VDMLShape) de).setVDMLElement((VdmlElement) modelElement);
        } else if (de instanceof VDMLEdge) {
            ((VDMLEdge) de).setVDMLElement((VdmlElement) modelElement);
        }
    }

    @Override
    public void doSwitch(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        super.doSwitch(resource.getModelElement(sourceShape.getResourceId()));
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
        ((VDMLEdge) edge).setTargetElement(resource.getDiagramElement(target.getResourceId()));
    }

    @Override
    public void setSourceElement(Edge edge, Shape source) {
        ((VDMLEdge) edge).setSourceElement(resource.getDiagramElement(source.getResourceId()));
    }

    @Override
    public EObject createElement(String stencilId) {
        return VdmlPropositionExchangeStencil.createElement(stencilId);
    }

    @Override
    public DiagramElement createDiagramElement(String stencilId) {
        return VdmlPropositionExchangeStencil.createDiagramElement(stencilId);
    }
}
