package org.jbpm.designer.vdan;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.Collaboration;
import org.omg.vdml.Port;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.VdmlElement;

public enum VdmlActivityNetworkStencil implements StencilInfo {
    VDML_ACTIVITY_NETWORK_DIAGRAM(VDMLPackage.eINSTANCE.getCollaboration(), VDMLDIPackage.eINSTANCE.getVDMLDiagram(), "VdmlActivityNetworkDiagram"),
    ROLE(VDMLPackage.eINSTANCE.getRole(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "Role"),
    ACTIVITY(VDMLPackage.eINSTANCE.getActivity(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "Activity"),
    ACTIVITY_OUTPUT_PORT(VDMLPackage.eINSTANCE.getOutputPort(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "ActivityOutputPort"),
    ACTIVITY_INPUT_PORT(VDMLPackage.eINSTANCE.getInputPort(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "ActivityInputPort"),
    STORE_OUTPUT_PORT(VDMLPackage.eINSTANCE.getOutputPort(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "StoreOutputPort"),
    STORE_INPUT_PORT(VDMLPackage.eINSTANCE.getInputPort(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "StoreInputPort"),
    COLLABORATION_OUTPUT_PORT(VDMLPackage.eINSTANCE.getOutputPort(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "CollaborationOutputPort"),
    COLLABORATION_INPUT_PORT(VDMLPackage.eINSTANCE.getInputPort(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "CollaborationInputPort"),
    STORE(VDMLPackage.eINSTANCE.getStore(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "Store"),
    POOL(VDMLPackage.eINSTANCE.getPool(), VDMLDIPackage.eINSTANCE.getVDMLShape(), "Pool"),
    DELIVERABLE_FLOW(VDMLPackage.eINSTANCE.getDeliverableFlow(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "DeliverableFlow"),
    INPUT_DELEGATION(VDMLPackage.eINSTANCE.getInputDelegation(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "InputDelegation"),
    OUTPUT_DELEGATION(VDMLPackage.eINSTANCE.getOutputDelegation(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "OutputDelegation"),
    RESOURCE_USE(VDMLPackage.eINSTANCE.getResourceUse(), VDMLDIPackage.eINSTANCE.getVDMLEdge(), "ResourceUse");

    private EClass type;
    private EClass shapeType;
    private String stencilId;
    private static Map<String, VdmlActivityNetworkStencil> nameMap = new HashMap<String, VdmlActivityNetworkStencil>();

    private VdmlActivityNetworkStencil(EClass type, EClass shapeType, String name) {
        this.type = type;
        this.stencilId = name;
        this.shapeType = shapeType;
    }

    private VdmlActivityNetworkStencil(EReference type, EClass shapeType, String name) {
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
        for (VdmlActivityNetworkStencil stencil : values()) {
            nameMap.put(stencil.stencilId, stencil);
        }
    }

    public static DiagramElement createDiagramElement(String stencilId) {
        VdmlActivityNetworkStencil stencil = findStencilById(stencilId);
        if (stencil.shapeType == null) {
            return null;
        }
        return (DiagramElement) VDMLDIFactory.eINSTANCE.create(stencil.shapeType);
    }

    public static VdmlElement createElement(String stencilId) {
        VdmlActivityNetworkStencil stencil = findStencilById(stencilId);
        if (stencil.type == null) {
            return null;
        }
        if(stencilId.equals(COLLABORATION_INPUT_PORT.getStencilId())){
            System.out.println();
        }
        return (VdmlElement) VDMLFactory.eINSTANCE.create(stencil.type);
    }

    public static VdmlActivityNetworkStencil findStencilById(String stencilId) {
        VdmlActivityNetworkStencil stencil = nameMap.get(stencilId);
        if (stencil == null) {
            throw new IllegalArgumentException("unregistered stencil id: " + stencilId);
        }
        return stencil;
    }

    public static VdmlActivityNetworkStencil findStencilByElement(EObject me, DiagramElement de) {
        VdmlActivityNetworkStencil[] possibilities = values();
        if(me instanceof Port){
            if(me.eContainer() instanceof Collaboration){
                possibilities=new VdmlActivityNetworkStencil[]{COLLABORATION_INPUT_PORT,COLLABORATION_OUTPUT_PORT};
            }else if(me.eContainer() instanceof Store){
                possibilities=new VdmlActivityNetworkStencil[]{STORE_INPUT_PORT,STORE_OUTPUT_PORT};
            }else{
                possibilities=new VdmlActivityNetworkStencil[]{ACTIVITY_INPUT_PORT,ACTIVITY_OUTPUT_PORT};
            }
        }
        if (possibilities != null) {
            for (VdmlActivityNetworkStencil cmmnStencil : possibilities) {
                if (cmmnStencil.type.isSuperTypeOf(me.eClass())) {
                    return cmmnStencil;
                }
            }
        }
        return null;
    }

}
