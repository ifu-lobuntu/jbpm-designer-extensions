package org.jbpm.designer.vdcm;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.jbpm.designer.vdrc.VdmlStencilInfo;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.CapabilityOffer;
import org.omg.vdml.Pool;
import org.omg.vdml.Position;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.VdmlElement;

public enum VdmlCapabilityManagementStencil implements VdmlStencilInfo {
    VDML_CAPABILITY_MANAGEMENT_DIAGRAM(VDMLPackage.eINSTANCE.getCollaboration(), VDMLDIPackage.eINSTANCE.getVDMLDiagram(), "VdmlCapabilityManagementDiagram"),
    ORG_UNIT(VDMLPackage.eINSTANCE.getOrgUnit(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "OrgUnit"),
    POSITION(VDMLPackage.eINSTANCE.getPosition(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "Position"),
    STORE(VDMLPackage.eINSTANCE.getStore(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "Store"),
    POOL(VDMLPackage.eINSTANCE.getPool(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "Pool"),
    CAPABILITY_OFFER(VDMLPackage.eINSTANCE.getCapabilityOffer(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "CapabilityOffer"),
    CAPABILITY_METHOD(VDMLPackage.eINSTANCE.getCapabilityMethod(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "CapabilityMethod"),
    CAPABILITY_RESOURCE(VDMLPackage.eINSTANCE.getCapabilityOffer_CapabilityResource(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "CapabilityResource"),
    METHOD(VDMLPackage.eINSTANCE.getCapabilityOffer_Method(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "Method"),
    APPLIED_CAPABILITY_OFFER(VDMLPackage.eINSTANCE.getActivity_AppliedCapabilityOffer(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "AppliedCapabilityOffer"),
    POOL_POSITION(VDMLPackage.eINSTANCE.getPool_Position(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "PoolPosition");

    private EClass type;
    private EClass shapeType;
    private String stencilId;
    private static Map<String, VdmlCapabilityManagementStencil> nameMap = new HashMap<String, VdmlCapabilityManagementStencil>();

    private VdmlCapabilityManagementStencil(EClass type, EClass shapeType, String name) {
        this.type = type;
        this.stencilId = name;
        this.shapeType = shapeType;
    }

    private VdmlCapabilityManagementStencil(EReference type, EClass shapeType, String name) {
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
        for (VdmlCapabilityManagementStencil stencil : values()) {
            nameMap.put(stencil.stencilId, stencil);
        }
    }

    public static VDMLDiagramElement createDiagramElement(String stencilId) {
        VdmlCapabilityManagementStencil stencil = findStencilById(stencilId);
        if (stencil.shapeType == null) {
            return null;
        }
        return (VDMLDiagramElement) VDMLDIFactory.eINSTANCE.create(stencil.shapeType);
    }

    public static VdmlElement createElement(String stencilId) {
        VdmlCapabilityManagementStencil stencil = findStencilById(stencilId);
        if (stencil.type == null) {
            return null;
        }
        return (VdmlElement) VDMLFactory.eINSTANCE.create(stencil.type);
    }

    public static VdmlCapabilityManagementStencil findStencilById(String stencilId) {
        VdmlCapabilityManagementStencil stencil = nameMap.get(stencilId);
        if (stencil == null) {
            throw new IllegalArgumentException("unregistered stencil id: " + stencilId);
        }
        return stencil;
    }

    public static VdmlCapabilityManagementStencil findStencilByElement(EObject me, DiagramElement de) {
        VdmlCapabilityManagementStencil[] possibilities = {CAPABILITY_OFFER,POSITION,STORE,POOL,ORG_UNIT,CAPABILITY_METHOD};
        if(de instanceof VDMLDiagram){
            return VDML_CAPABILITY_MANAGEMENT_DIAGRAM;
        }else if (de instanceof VDMLEdge) {
            VDMLEdge edge = (VDMLEdge) de;
            VDMLShape s = edge.getSourceShape();
            VDMLShape t = edge.getTargetShape();
            if (s != null && t != null) {
                if (s.getVdmlElement() instanceof CapabilityOffer && t.getVdmlElement() instanceof Store) {
                    return CAPABILITY_RESOURCE;
                } else if (s.getVdmlElement() instanceof CapabilityOffer && t.getVdmlElement() instanceof CapabilityOffer) {
                    return APPLIED_CAPABILITY_OFFER;
                } else if (s.getVdmlElement() instanceof CapabilityOffer && t.getVdmlElement() instanceof CapabilityMethod) {
                    return METHOD;
                } else if (s.getVdmlElement() instanceof Position && t.getVdmlElement() instanceof Pool) {
                    return POOL_POSITION;
                }

            }
        }
        if (possibilities != null) {
            for (VdmlCapabilityManagementStencil cmmnStencil : possibilities) {
                if (cmmnStencil.type !=null && cmmnStencil.type.isSuperTypeOf(me.eClass())) {
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
