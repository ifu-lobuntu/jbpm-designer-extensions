package org.jbpm.designer.vdrc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.omg.smm.Measure;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.InputPort;
import org.omg.vdml.MeasuredCharacteristic;
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
    protected Collaboration owningCollaboration;
    static {
        COLLABORATION_TYPE_MAP.put("CapabilityMethod", VDMLPackage.eINSTANCE.getCapabilityMethod());
        COLLABORATION_TYPE_MAP.put("OrgUnit", VDMLPackage.eINSTANCE.getOrgUnit());
        COLLABORATION_TYPE_MAP.put("BusinessNetwork", VDMLPackage.eINSTANCE.getBusinessNetwork());
        COLLABORATION_TYPE_MAP.put("Community", VDMLPackage.eINSTANCE.getCommunity());
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
    protected abstract EClass[] getManagedClasses();

    @Override
    public Object convertFromString(LinkedProperty property, String string, Class<?> targetType) {
        return null;
    }
    protected MeasuredCharacteristic ensureMeasuredCharacteristicDefinition(Measure valueMeasure, MeasuredCharacteristic mc) {
        if(mc==null){
            mc = VDMLFactory.eINSTANCE.createMeasuredCharacteristic();
        }
        mc.setCharacteristicDefinition(valueMeasure.getTrait());
        return mc;
    }

    @Override
    public void doSwitch(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        super.doSwitch(shapeMap.getModelElement(sourceShape.getResourceId()));
    }
    private Collection<VdmlElement> collectOrphans(VDMLDiagram diagram, Map<VdmlElement, VDMLDiagramElement> map, Set<EClass> classes) {
        Collection<VdmlElement> orphans=new HashSet<VdmlElement>();
        OrphanFilter orphanFilter = getOrphanFilter();
        TreeIterator<EObject> eAllContents = diagram.getVdmlElement().eAllContents();
        while (eAllContents.hasNext()) {
            EObject eObject = (EObject) eAllContents.next();
            if(eObject instanceof VdmlElement && classes.contains(eObject.eClass())){
                VdmlElement ve = (VdmlElement) eObject;
                if(!map.containsKey(eObject) && orphanFilter.shouldHaveDiagramElement(ve)){
                    orphans.add(ve);
                }
            }
        }
        Set<VdmlElement> duplicates = new HashSet<VdmlElement>();
        for (VdmlElement potentialParent : orphans) {
            for (VdmlElement potentialChild : orphans) {
                if(potentialChild!=potentialParent &&  EcoreUtil.isAncestor(potentialParent, potentialChild)){
                    duplicates.add(potentialChild);
                }
            }
        }
        orphans.removeAll(duplicates);
        return orphans;
    }

    protected void buildMap(VDMLDiagram diagram, Map<VdmlElement, VDMLDiagramElement> map, EClass... cls) {
        Set<EClass> classes = new HashSet<EClass>(Arrays.asList(cls));
        populateDiagramElementMap(diagram, map, classes);
    }

    protected void populateDiagramElementMap(VDMLDiagram diagram, Map<VdmlElement, VDMLDiagramElement> map, Set<EClass> classes) {
        TreeIterator<EObject> allContents = diagram.eAllContents();
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
        if (vdm.getCollaboration().isEmpty()) {
            String ref = json.getProperty("collaboration");
            if (ref != null && ref.contains("|")) {
                this.owningCollaboration = UriHelper.resolveEObject(shapeMap.getResource().getResourceSet(), ref.split("\\|"), COLLABORATION_FEATURE_MAP);
            } else {
                EClass eClass = COLLABORATION_TYPE_MAP.get(json.getProperty("collaborationtype"));
                this.owningCollaboration = (Collaboration) VDMLFactory.eINSTANCE.create(eClass);
                vdm.getCollaboration().add(owningCollaboration);
            }
        } else {
            this.owningCollaboration = vdm.getCollaboration().get(0);
        }
        this.owningCollaboration.setId(json.getResourceId());
        vdmlDiagram.setVdmlElement(this.owningCollaboration);
        // We assume that Oryx always owns the diagram
        vdmlDiagram.getOwnedVdmlDiagramElement().clear();
        return vdmlDiagram;
    }
    @Override
    public void postprocessResource(XMLResource resource) {
        VDMLDiagram vdmlDiagram = VdmlHelper.getDiagram(resource);
        Set<EClass> classes = new HashSet<EClass>(Arrays.asList(getManagedClasses()));
        Map<VdmlElement, VDMLDiagramElement> map=new HashMap<VdmlElement, VDMLDiagramElement>();
        populateDiagramElementMap(vdmlDiagram, map, classes);
        Collection<VdmlElement> orphans = collectOrphans(vdmlDiagram,map,classes);
        Collaboration coll = (Collaboration) vdmlDiagram.getVdmlElement();
        ((XMLResource) coll.eResource()).setModified(true);
        VdmlElementDeleter ved=new VdmlElementDeleter(coll,classes);
        for (VdmlElement orphan : orphans) {
            ved.doSwitch(orphan);
        }
        ved.deleteOrphanedEdges();
    }
    @Override
    public EObject create(EClass eType) {
        return VDMLFactory.eINSTANCE.create(eType);
    }
    protected OrphanFilter getOrphanFilter(){
        return new OrphanFilter() {
            
            @Override
            public boolean shouldHaveDiagramElement(VdmlElement e) {
                return true;
            }
        };
    }
    protected interface OrphanFilter{
        boolean shouldHaveDiagramElement(VdmlElement e);
    }
}