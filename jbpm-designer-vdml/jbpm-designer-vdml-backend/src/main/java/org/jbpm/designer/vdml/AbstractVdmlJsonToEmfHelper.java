package org.jbpm.designer.vdml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.vdrc.VdmlStencilInfo;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.Characteristic;
import org.omg.smm.Measure;
import org.omg.vdml.Assignment;
import org.omg.vdml.Attribute;
import org.omg.vdml.BusinessItem;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.Participant;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.VdmlElement;

public abstract class AbstractVdmlJsonToEmfHelper extends AbstractVdmlJsonEmfHelper implements JsonToEmfHelper {

    static {
        COLLABORATION_FEATURE_MAP.put(VDMLPackage.eINSTANCE.getBusinessNetwork(), VDMLPackage.eINSTANCE.getVdmlElement_Name());
        COLLABORATION_FEATURE_MAP.put(VDMLPackage.eINSTANCE.getCapabilityMethod(), VDMLPackage.eINSTANCE.getVdmlElement_Name());
        COLLABORATION_FEATURE_MAP.put(VDMLPackage.eINSTANCE.getCommunity(), VDMLPackage.eINSTANCE.getVdmlElement_Name());
        COLLABORATION_FEATURE_MAP.put(VDMLPackage.eINSTANCE.getOrgUnit(), VDMLPackage.eINSTANCE.getVdmlElement_Name());
    }
    protected Shape sourceShape;
    protected LinkedStencil currentStencil;

    public AbstractVdmlJsonToEmfHelper(ShapeMap shapeMap, Class<? extends VdmlStencilInfo> stencil) {
        super(shapeMap, stencil);
    }

    protected MeasuredCharacteristic buildMeasuredCharacteristic(String name) {
        Measure valueMeasure = (Measure) sourceShape.getUnboundProperty(name);
        MeasuredCharacteristic vm = null;
        if (valueMeasure != null && valueMeasure.getTrait() != null) {
            vm = VDMLFactory.eINSTANCE.createMeasuredCharacteristic();
            vm.setName(valueMeasure.getName());
            vm.setCharacteristicDefinition(valueMeasure.getTrait());
        }
        return vm;
    }
    protected void setMeasuredCharacteristics(String name, EList<MeasuredCharacteristic> measuredCharacteristic) {
        List<Measure> valueMeasures = (List<Measure>) sourceShape.getUnboundProperty(name);
        measuredCharacteristic.clear();
        if (valueMeasures != null) {
            for (Measure valueMeasure : valueMeasures) {
                if(valueMeasure.getTrait() != null){
                    MeasuredCharacteristic vm = null;
                    vm = VDMLFactory.eINSTANCE.createMeasuredCharacteristic();
                    vm.setName(valueMeasure.getName());
                    vm.setCharacteristicDefinition(valueMeasure.getTrait());
                    measuredCharacteristic.add(vm);
                }
            }
        }
    }
    protected void setCharacteristicDefinitions(String name, EList<Characteristic> characteristics) {
        List<Measure> valueMeasures = (List<Measure>) sourceShape.getUnboundProperty(name);
        characteristics.clear();
        if (valueMeasures != null) {
            for (Measure valueMeasure : valueMeasures) {
                if(valueMeasure.getTrait() != null){
                    characteristics.add(valueMeasure.getTrait());
                }
            }
        }
    }


    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        object.setDeliverable(buildBusinessItem("deliverableDefinition"));
        if (object.getDeliverable() != null) {
            object.setName(object.getDeliverable().getName());
        }
        return super.caseDeliverableFlow(object);
    }

    @Override
    public Object caseRole(Role object) {
        addAssignments(object);
        return super.caseRole(object);
    }

    protected void putAttribute(VdmlElement object, String name) {
        if (sourceShape.getProperty(name) != null) {
            Attribute attr = null;
            for (Attribute attribute2 : object.getAttribute()) {
                if (attribute2.getTag().equals(name)) {
                    attr = attribute2;
                }
            }
            if (attr == null) {
                attr = VDMLFactory.eINSTANCE.createAttribute();
                attr.setName(name);
                attr.setTag(name);
                object.getAttribute().add(attr);
            }
            attr.setValue(sourceShape.getProperty(name));
        }
    }

    private void addAssignments(Role object) {
        @SuppressWarnings("unchecked")
        Collection<Participant> assignedParticipants = (Collection<Participant>) sourceShape.getUnboundProperty("assignedParticipants");
        if (assignedParticipants != null) {
            List<Assignment> oldOnes = new ArrayList<Assignment>(object.getRoleAssignment());
            for (Participant participant : assignedParticipants) {
                if (!hasAssignmentFor(object, participant)) {
                    Assignment as = VDMLFactory.eINSTANCE.createAssignment();
                    object.getRoleAssignment().add(as);
                    as.setParticipant(participant);
                    owningCollaboration.getOwnedAssignment().add(as);
                }
            }
            for (Assignment assignment : oldOnes) {
                if(assignment.getParticipant()!=null && !assignedParticipants.contains(assignment.getParticipant())){
                    owningCollaboration.getOwnedAssignment().remove(assignment);
                    object.getRoleAssignment().remove(assignment);
                }
            }
        }
    }

    protected boolean hasAssignmentFor(Role object, Participant participant) {
        boolean found=false;
        for (Assignment assignment : object.getRoleAssignment()) {
            if (assignment.getParticipant() != null && assignment.getParticipant().equals(participant)) {
                found = true;
                break;
            }
        }
        return found;
    }

    protected BusinessItem buildBusinessItem(String name) {
        BusinessItem result = null;
        BusinessItemDefinition deliverableDefinition = (BusinessItemDefinition) sourceShape.getUnboundProperty(name);
        if (deliverableDefinition != null) {
            result=VdmlHelper.findOrCreateBusinessItemFor(deliverableDefinition, owningCollaboration);
        }
        return result;
    }

    @Override
    public DiagramElement createElements(Shape shape) {
        String diagramElementId = shape.getProperty("diagramElementId");
        VDMLDiagramElement de = null;
        if (!(diagramElementId == null || diagramElementId.trim().isEmpty())) {
            de = (VDMLDiagramElement) shapeMap.getResource().getEObject(diagramElementId);
        }
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

    @Override
    public Object convertFromString(LinkedProperty property, String string, Class<?> targetType) {
        return null;
    }

    @Override
    public void refineEmfElements(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        super.doSwitch(shapeMap.getModelElement(sourceShape.getResourceId()));
    }

    public VDMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        if (result.getContents().isEmpty()) {
            VDMLDiagram dgm = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
            result.getContents().add(dgm);
            this.setDiagram(dgm);
        } else {
            this.setDiagram((VDMLDiagram) result.getContents().get(0));
        }
        this.getDiagram().setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
        URI collaborationUri = result.getURI().trimFileExtension().appendFileExtension("vdcol");
        this.owningCollaboration = VdmlHelper.getCollaboration((XMLResource) result.getResourceSet().getResource(collaborationUri, true));
        this.getDiagram().setVdmlElement(this.owningCollaboration);
        // We assume that Oryx always owns the diagram
        this.getDiagram().getOwnedVdmlDiagramElement().clear();
        return this.getDiagram();
    }

    @Override
    public EObject create(EClass eType) {
        if (eType == PACKAGE.getRole()) {
            return VdmlHelper.createRole(owningCollaboration);
        }
        return VDMLFactory.eINSTANCE.create(eType);
    }

    @Override
    public void postprocessResource() {
        Collection<VdmlElement> orphans = collectOrphans();
        ((XMLResource) owningCollaboration.eResource()).setModified(true);
        VdmlElementDeleter ved = new VdmlElementDeleter(owningCollaboration, getManagedClassSet());
        for (VdmlElement orphan : orphans) {
            ved.doSwitch(orphan);
        }
        ved.deleteOrphanedEdges();
    }

}