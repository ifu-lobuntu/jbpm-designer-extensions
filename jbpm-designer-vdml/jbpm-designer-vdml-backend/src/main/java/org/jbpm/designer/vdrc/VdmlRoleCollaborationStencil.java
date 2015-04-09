package org.jbpm.designer.vdrc;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.VdmlElement;

public enum VdmlRoleCollaborationStencil implements VdmlStencilInfo {
    VDML_PROPOSITION_EXCHANGE_DIAGRAM(VDMLPackage.eINSTANCE.getCollaboration(), VDMLDIPackage.eINSTANCE.getVDMLDiagram(), "RoleCollaborationDiagram"),
    ROLE(VDMLPackage.eINSTANCE.getRole(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "Role"),
    EXISITING_DELIVERABLE_FLOW(VDMLPackage.eINSTANCE.getDeliverableFlow(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "ExistingDeliverableFlow"),
    NEW_DELIVERABLE_FLOW(VDMLPackage.eINSTANCE.getDeliverableFlow(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "NewDeliverableFlow");
    private EClass type;
    private EClass shapeType;
    private String stencilId;
    private static Map<String, VdmlRoleCollaborationStencil> nameMap = new HashMap<String, VdmlRoleCollaborationStencil>();

    private VdmlRoleCollaborationStencil(EClass type, EClass shapeType, String name) {
        this.type = type;
        this.stencilId = name;
        this.shapeType = shapeType;
    }

    private VdmlRoleCollaborationStencil(EReference type, EClass shapeType, String name) {
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
        for (VdmlRoleCollaborationStencil stencil : values()) {
            nameMap.put(stencil.stencilId, stencil);
        }
    }

    public static VDMLDiagramElement createDiagramElement(String stencilId) {
        VdmlRoleCollaborationStencil stencil = findStencilById(stencilId);
        if (stencil.shapeType == null) {
            return null;
        }
        return (VDMLDiagramElement) VDMLDIFactory.eINSTANCE.create(stencil.shapeType);
    }


    public static VdmlRoleCollaborationStencil findStencilById(String stencilId) {
        VdmlRoleCollaborationStencil stencil = nameMap.get(stencilId);
        if (stencil == null) {
            throw new IllegalArgumentException("unregistered stencil id: " + stencilId);
        }
        return stencil;
    }

    public static VdmlRoleCollaborationStencil findStencilByElement(EObject me, DiagramElement de) {
        VdmlRoleCollaborationStencil[] possibilities = values();
        if (possibilities != null) {
            for (VdmlRoleCollaborationStencil cmmnStencil : possibilities) {
                if (cmmnStencil.type!=null && cmmnStencil.type.isSuperTypeOf(me.eClass())) {
                    return cmmnStencil;
                }
            }
        }
        return null;
    }

    @Override
    public EClass getElementType() {
        return this.type;
    }

}
