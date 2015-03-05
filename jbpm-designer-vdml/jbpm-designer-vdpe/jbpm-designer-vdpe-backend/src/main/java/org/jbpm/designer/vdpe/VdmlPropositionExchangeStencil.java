package org.jbpm.designer.vdpe;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.jbpm.designer.emf.util.StencilInfo;
import org.pavanecce.vdml.metamodel.vdml.Role;
import org.pavanecce.vdml.metamodel.vdml.ValueProposition;
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;
import org.pavanecce.vdml.metamodel.vdml.VdmlFactory;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiFactory;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

public enum VdmlPropositionExchangeStencil implements StencilInfo {
    VDML_PROPOSITION_EXCHANGE_DIAGRAM(VdmlPackage.eINSTANCE.getCollaboration(), VdmlDiPackage.eINSTANCE.getVDMLDiagram(), "VdmlPropositionExchangeDiagram"),
    ROLE(VdmlPackage.eINSTANCE.getRole(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "Role"),
    VALUE_PROPOSITION(VdmlPackage.eINSTANCE.getValueProposition(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "ValueProposition"),
    PROVIDED_PROPOSITION(VdmlPackage.eINSTANCE.getRole_ProvidedProposition(), VdmlDiPackage.eINSTANCE.getVDMLEdge(), "ProvidedProposition"),
    RECIPIENT(VdmlPackage.eINSTANCE.getValueProposition_Recipient(), VdmlDiPackage.eINSTANCE.getVDMLEdge(), "Recipient");
    private EClass type;
    private EClass shapeType;
    private String stencilId;
    private static Map<String, VdmlPropositionExchangeStencil> nameMap = new HashMap<String, VdmlPropositionExchangeStencil>();

    private VdmlPropositionExchangeStencil(EClass type, EClass shapeType, String name) {
        this.type = type;
        this.stencilId = name;
        this.shapeType = shapeType;
    }

    private VdmlPropositionExchangeStencil(EReference type, EClass shapeType, String name) {
        this.stencilId = name;
        this.shapeType = shapeType;
    }

    public EClass getType() {
        return type;
    }

    public String getStencilId() {
        return stencilId;
    }

    static {
        for (VdmlPropositionExchangeStencil stencil : values()) {
            nameMap.put(stencil.stencilId, stencil);
        }
    }

    public static DiagramElement createDiagramElement(String stencilId) {
        VdmlPropositionExchangeStencil stencil = findStencilById(stencilId);
        if (stencil.shapeType == null) {
            return null;
        }
        return (DiagramElement) VdmlDiFactory.eINSTANCE.create(stencil.shapeType);
    }

    public static VdmlElement createElement(String stencilId) {
        VdmlPropositionExchangeStencil stencil = findStencilById(stencilId);
        if (stencil.type == null) {
            return null;
        }
        return (VdmlElement) VdmlFactory.eINSTANCE.create(stencil.type);
    }

    public static VdmlPropositionExchangeStencil findStencilById(String stencilId) {
        VdmlPropositionExchangeStencil stencil = nameMap.get(stencilId);
        if (stencil == null) {
            throw new IllegalArgumentException("unregistered stencil id: " + stencilId);
        }
        return stencil;
    }

    public static VdmlPropositionExchangeStencil findStencilByElement(EObject me, DiagramElement de) {
        if(de instanceof VDMLEdge){
            VDMLEdge edge = (VDMLEdge) de;
            if(edge.getSource().getModelElement() instanceof Role && edge.getTarget().getModelElement() instanceof ValueProposition){
                return PROVIDED_PROPOSITION;
            }else if(edge.getSource().getModelElement() instanceof ValueProposition && edge.getTarget().getModelElement() instanceof Role){
                return RECIPIENT;
            }
        }
        VdmlPropositionExchangeStencil[] possibilities = values();
        if (possibilities != null) {
            for (VdmlPropositionExchangeStencil cmmnStencil : possibilities) {
                if (cmmnStencil.type!=null && cmmnStencil.type.isSuperTypeOf(me.eClass())) {
                    return cmmnStencil;
                }
            }
        }
        return null;
    }

}
