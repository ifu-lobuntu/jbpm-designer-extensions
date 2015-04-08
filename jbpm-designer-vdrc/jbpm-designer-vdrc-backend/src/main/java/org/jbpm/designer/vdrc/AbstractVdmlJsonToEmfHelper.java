package org.jbpm.designer.vdrc;

import java.util.Collection;

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
import org.omg.smm.Measure;
import org.omg.vdml.Collaboration;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
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
    static {
        COLLABORATION_TYPE_MAP.put("CapabilityMethod", VDMLPackage.eINSTANCE.getCapabilityMethod());
        COLLABORATION_TYPE_MAP.put("OrgUnit", VDMLPackage.eINSTANCE.getOrgUnit());
        COLLABORATION_TYPE_MAP.put("BusinessNetwork", VDMLPackage.eINSTANCE.getBusinessNetwork());
        COLLABORATION_TYPE_MAP.put("Community", VDMLPackage.eINSTANCE.getCommunity());
    }

    public AbstractVdmlJsonToEmfHelper(ShapeMap shapeMap, Class<? extends VdmlStencilInfo> stencil) {
        super(shapeMap, stencil);
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

    protected MeasuredCharacteristic ensureMeasuredCharacteristicDefinition(Measure valueMeasure, MeasuredCharacteristic mc) {
        if (mc == null) {
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

    public VDMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        ValueDeliveryModel vdm = null;
        if (result.getContents().isEmpty()) {
            vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
            result.getContents().add(vdm);
        } else {
            vdm = (ValueDeliveryModel) result.getContents().get(0);
        }
        if (vdm.getDiagram().isEmpty()) {
            this.setDiagram(VDMLDIFactory.eINSTANCE.createVDMLDiagram());
            vdm.getDiagram().add(this.getDiagram());
        } else {
            this.setDiagram(vdm.getDiagram().get(0));
        }
        this.getDiagram().setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
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