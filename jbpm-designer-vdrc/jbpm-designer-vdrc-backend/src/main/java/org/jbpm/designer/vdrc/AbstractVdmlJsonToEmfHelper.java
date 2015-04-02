package org.jbpm.designer.vdrc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.UriHelper;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.di.DiagramElement;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Port;
import org.omg.vdml.PortContainer;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;
import org.omg.vdml.util.VDMLSwitch;

public abstract class AbstractVdmlJsonToEmfHelper extends VDMLSwitch<Object> implements JsonToEmfHelper {

    private static final Map<EClass, EAttribute> COLLABORATION_FEATURE_MAP = new HashMap<EClass, EAttribute>();
    static {
        COLLABORATION_FEATURE_MAP.put(VDMLPackage.eINSTANCE.getBusinessNetwork(), VDMLPackage.eINSTANCE.getVdmlElement_Name());
        COLLABORATION_FEATURE_MAP.put(VDMLPackage.eINSTANCE.getCapabilityMethod(), VDMLPackage.eINSTANCE.getVdmlElement_Name());
        COLLABORATION_FEATURE_MAP.put(VDMLPackage.eINSTANCE.getCommunity(), VDMLPackage.eINSTANCE.getVdmlElement_Name());
        COLLABORATION_FEATURE_MAP.put(VDMLPackage.eINSTANCE.getOrgUnit(), VDMLPackage.eINSTANCE.getVdmlElement_Name());
    }
    protected ShapeMap shapeMap;
    protected Shape sourceShape;
    protected static Map<String, EClass> COLLABORATION_TYPE_MAP = new HashMap<String, EClass>();
    private LinkedStencil currentStencil;
    static {
        COLLABORATION_TYPE_MAP.put("CapabilityMethod", VDMLPackage.eINSTANCE.getCapabilityMethod());
    }

    public AbstractVdmlJsonToEmfHelper(ShapeMap shapeMap) {
        this.shapeMap = shapeMap;
    }

    @Override
    public DiagramElement createElements(Shape shape) {
        VDMLDiagramElement de = (VDMLDiagramElement) shapeMap.getResource().getEObject(shape.getProperty("diagramElementId"));
        if (de == null) {
            de = createDiagramElement(shape.getStencilId());
        }
        VdmlElement modelElement = (VdmlElement) shapeMap.findEObjectById(shape.getResourceId());
        if (modelElement == null) {
            modelElement = createElement(shape.getStencilId());
        }
        if (de instanceof VDMLShape) {
            ((VDMLShape) de).setVdmlElement(modelElement);
        } else if (de instanceof VDMLEdge) {
            ((VDMLEdge) de).setVdmlElement(modelElement);
        }
        de.setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
        return de;
    }

    protected abstract VDMLDiagramElement createDiagramElement(String stencilId);

    protected abstract VdmlElement createElement(String stencilId);

    protected void removeFromPortContainer(Port... ports) {
        for (Port port : ports) {
            ((PortContainer) port.eContainer()).getContainedPort().remove(port);
        }
    }

    @Override
    public Object convertFromString(LinkedProperty property, String string, Class<?> targetType) {
        return null;
    }

    @Override
    public void doSwitch(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        super.doSwitch(shapeMap.getModelElement(sourceShape.getResourceId()));
    }

    protected void buildMap(VDMLDiagram diagram, Map<VdmlElement, VDMLDiagramElement> map, EClass... cls) {
        TreeIterator<EObject> allContents = diagram.eAllContents();
        Set<EClass> classes = new HashSet<EClass>(Arrays.asList(cls));
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
            if (eObject instanceof VDMLDiagramElement) {
                EList<EObject> modelElement = ((VDMLDiagramElement) eObject).getModelElement();
                for (EObject me : modelElement) {
                    if (classes.contains(me.eClass())) {
                        map.put((VdmlElement) me, (VDMLDiagramElement) eObject);
                    }
                }
            }
        }
    }

    protected void removeOrphanedRoles(Map<VdmlElement, VDMLDiagramElement> map, Collaboration coll) {
        for (Role role : new ArrayList<Role>(coll.getCollaborationRole())) {
            if (!map.containsKey(role)) {
                EList<Activity> performedWork = role.getPerformedWork();
                for (Activity activity : performedWork) {
                    EList<Port> containedPort = activity.getContainedPort();
                    for (Port port : containedPort) {
                        if (port instanceof InputPort) {
                            InputPort ip = (InputPort) port;
                            coll.getFlow().remove(ip.getInput());
                            OutputPort provider = ip.getInput().getProvider();
                            ((PortContainer)provider.eContainer()).getContainedPort().remove(provider);
                            coll.getInternalPortDelegation().removeAll(((InputPort) port).getDelegatedInput());
                        } else {
                            OutputPort op = (OutputPort) port;
                            coll.getFlow().remove(op.getOutput());
                            InputPort recipient = op.getOutput().getRecipient();
                            ((PortContainer)recipient.eContainer()).getContainedPort().remove(recipient);
                            coll.getInternalPortDelegation().removeAll(((OutputPort) port).getDelegatedOutput());
                        }
                    }
                }
                coll.getActivity().removeAll(performedWork);
                coll.getCollaborationRole().remove(role);
            }
        }
    }

    public VDMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        ValueDeliveryModel vdm = null;
        if (result.getContents().isEmpty()) {
            vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
            result.getContents().add(vdm);
        } else {
            vdm = (ValueDeliveryModel) result.getContents().get(0);
        }
        VDMLDiagram vdmlDiagram;
        if (vdm.getDiagram().isEmpty()) {
            vdmlDiagram = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
            vdm.getDiagram().add(vdmlDiagram);
        } else {
            vdmlDiagram = vdm.getDiagram().get(0);
        }
        vdmlDiagram.setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
        Collaboration collaboration;
        if (vdm.getCollaboration().isEmpty()) {
            String ref = json.getProperty("collaboration");
            if (ref != null && ref.contains("|")) {
                collaboration = UriHelper.resolveEObject(shapeMap.getResource().getResourceSet(), ref.split("\\|"), COLLABORATION_FEATURE_MAP);
            } else {
                EClass eClass = COLLABORATION_TYPE_MAP.get(json.getProperty("collaborationtype"));
                collaboration = (Collaboration) VDMLFactory.eINSTANCE.create(eClass);
                vdm.getCollaboration().add(collaboration);
            }
        } else {
            collaboration = vdm.getCollaboration().get(0);
        }
        collaboration.setId(json.getResourceId());
        vdmlDiagram.setVdmlElement(collaboration);
        // We assume that Oryx always owns the diagram
        vdmlDiagram.getOwnedVdmlDiagramElement().clear();
        return vdmlDiagram;
    }

    @Override
    public EObject create(EClass eType) {
        return VDMLFactory.eINSTANCE.create(eType);
    }

}