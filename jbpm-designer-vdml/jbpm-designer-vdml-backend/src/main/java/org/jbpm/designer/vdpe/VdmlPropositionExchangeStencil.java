package org.jbpm.designer.vdpe;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.jbpm.designer.vdrc.VdmlStencilInfo;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueProposition;

public enum VdmlPropositionExchangeStencil implements VdmlStencilInfo {
    VDML_PROPOSITION_EXCHANGE_DIAGRAM(VDMLPackage.eINSTANCE.getCollaboration(), VDMLDIPackage.eINSTANCE.getVDMLDiagram(), "PropositionExchangeDiagram"),
    ROLE(VDMLPackage.eINSTANCE.getRole(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "Role"),
    VALUE_PROPOSITION(VDMLPackage.eINSTANCE.getValueProposition(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "ValueProposition"),
    VALUE_PROPOSITION_COMPONENT(VDMLPackage.eINSTANCE.getValuePropositionComponent(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "ValuePropositionComponent"),
    PROVIDED_PROPOSITION(VDMLPackage.eINSTANCE.getRole_ProvidedProposition(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "ProvidedProposition"),
    RECIPIENT(VDMLPackage.eINSTANCE.getValueProposition_Recipient(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "Recipient");
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

    public static VDMLDiagramElement createDiagramElement(String stencilId) {
        VdmlPropositionExchangeStencil stencil = findStencilById(stencilId);
        if (stencil.shapeType == null) {
            return null;
        }
        return (VDMLDiagramElement) VDMLDIFactory.eINSTANCE.create(stencil.shapeType);
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
            if(edge.getSourceShape().getVdmlElement() instanceof Role && edge.getTargetShape().getVdmlElement() instanceof ValueProposition){
                return PROVIDED_PROPOSITION;
            }else if(edge.getSourceShape().getVdmlElement() instanceof ValueProposition && edge.getTargetShape().getVdmlElement() instanceof Role){
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

    @Override
    public EClass getElementType() {
        return type;
    }

}
