package org.jbpm.designer.vdan;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.jbpm.designer.emf.util.StencilInfo;
import org.pavanecce.vdml.metamodel.vdml.Collaboration;
import org.pavanecce.vdml.metamodel.vdml.Port;
import org.pavanecce.vdml.metamodel.vdml.Store;
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;
import org.pavanecce.vdml.metamodel.vdml.VdmlFactory;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiFactory;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

public enum VdmlActivityNetworkStencil implements StencilInfo {
    VDML_ACTIVITY_NETWORK_DIAGRAM(VdmlPackage.eINSTANCE.getCollaboration(), VdmlDiPackage.eINSTANCE.getVDMLDiagram(), "VdmlActivityNetworkDiagram"),
    ROLE(VdmlPackage.eINSTANCE.getRole(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "Role"),
    ACTIVITY(VdmlPackage.eINSTANCE.getActivity(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "Activity"),
    ACTIVITY_OUTPUT_PORT(VdmlPackage.eINSTANCE.getOutputPort(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "ActivityOutputPort"),
    ACTIVITY_INPUT_PORT(VdmlPackage.eINSTANCE.getInputPort(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "ActivityInputPort"),
    STORE_OUTPUT_PORT(VdmlPackage.eINSTANCE.getOutputPort(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "StoreOutputPort"),
    STORE_INPUT_PORT(VdmlPackage.eINSTANCE.getInputPort(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "StoreInputPort"),
    COLLABORATION_OUTPUT_PORT(VdmlPackage.eINSTANCE.getOutputPort(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "CollaborationOutputPort"),
    COLLABORATION_INPUT_PORT(VdmlPackage.eINSTANCE.getInputPort(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "CollaborationInputPort"),
    STORE(VdmlPackage.eINSTANCE.getStore(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "Store"),
    POOL(VdmlPackage.eINSTANCE.getPool(), VdmlDiPackage.eINSTANCE.getVDMLShape(), "Pool"),
    DELIVERABLE_FLOW(VdmlPackage.eINSTANCE.getDeliverableFlow(), VdmlDiPackage.eINSTANCE.getVDMLEdge(), "DeliverableFlow"),
    INPUT_DELEGATION(VdmlPackage.eINSTANCE.getInputDelegation(), VdmlDiPackage.eINSTANCE.getVDMLEdge(), "InputDelegation"),
    OUTPUT_DELEGATION(VdmlPackage.eINSTANCE.getOutputDelegation(), VdmlDiPackage.eINSTANCE.getVDMLEdge(), "OutputDelegation"),
    RESOURCE_USE(VdmlPackage.eINSTANCE.getResourceUse(), VdmlDiPackage.eINSTANCE.getVDMLEdge(), "ResourceUse");

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
        return (DiagramElement) VdmlDiFactory.eINSTANCE.create(stencil.shapeType);
    }

    public static VdmlElement createElement(String stencilId) {
        VdmlActivityNetworkStencil stencil = findStencilById(stencilId);
        if (stencil.type == null) {
            return null;
        }
        if(stencilId.equals(COLLABORATION_INPUT_PORT.getStencilId())){
            System.out.println();
        }
        return (VdmlElement) VdmlFactory.eINSTANCE.create(stencil.type);
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
