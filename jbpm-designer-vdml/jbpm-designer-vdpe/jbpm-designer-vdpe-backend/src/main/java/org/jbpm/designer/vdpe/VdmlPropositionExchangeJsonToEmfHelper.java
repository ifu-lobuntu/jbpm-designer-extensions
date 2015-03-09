package org.jbpm.designer.vdpe;

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
import org.omg.vdml.Collaboration;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.VdmlElement;
import org.omg.vdml.util.VDMLSwitch;

public class VdmlPropositionExchangeJsonToEmfHelper extends VDMLSwitch<Object> implements JsonToEmfHelper {
    private ShapeMap resource;
    protected Shape sourceShape;
    private static Map<String, EClass> COLLABORATION_TYPE_MAP = new HashMap<String, EClass>();
    static {
        COLLABORATION_TYPE_MAP.put("CapabilityMethod", VDMLPackage.eINSTANCE.getCapabilityMethod());
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
            if (edge.getTargetShape().getVdmlElement() instanceof ValueProposition) {
                object.getProvidedProposition().add((ValueProposition) edge.getTargetShape().getVdmlElement());
            }
        }
        return super.caseRole(object);
    }

    @Override
    public Object caseValueProposition(ValueProposition object) {
        for (ShapeReference sr : sourceShape.getOutgoing()) {
            VDMLEdge edge = (VDMLEdge) resource.getDiagramElement(sr.getResourceId());
            if (edge.getTargetShape().getVdmlElement() instanceof Role) {
                object.setRecipient((Role) edge.getTargetShape().getVdmlElement());
            }
        }
        return super.caseValueProposition(object);
    }

    @Override
    public DiagramElement createElements(Shape shape) {
        DiagramElement de = VdmlPropositionExchangeStencil.createDiagramElement(shape.getStencilId());
        EObject modelElement = VdmlPropositionExchangeStencil.createElement(shape.getStencilId());
        if (de instanceof VDMLShape) {
            ((VDMLShape) de).setVdmlElement((VdmlElement) modelElement);
        } else if (de instanceof VDMLEdge) {
            ((VDMLEdge) de).setVdmlElement((VdmlElement) modelElement);
        }
        de.setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
        return de;
    }

    @Override
    public void doSwitch(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        super.doSwitch(resource.getModelElement(sourceShape.getResourceId()));
    }

    public VDMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        VDMLDiagram vdmlDiagram = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        result.getContents().add(vdm);
        EClass eClass = COLLABORATION_TYPE_MAP.get(json.getProperty("collaborationtype"));
        Collaboration collaboration = (Collaboration) VDMLFactory.eINSTANCE.create(eClass);
        vdm.getCollaboration().add(collaboration);
        collaboration.setId(json.getResourceId());
        vdmlDiagram.setVdmlElement(collaboration);
        vdm.getDiagram().add(vdmlDiagram);
        return vdmlDiagram;
    }

    @Override
    public EObject create(EClass eType) {
        return VDMLFactory.eINSTANCE.create(eType);
    }
}
