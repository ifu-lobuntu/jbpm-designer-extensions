package org.jbpm.designer.vdcm;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdlib.VdmlLibraryStencil;
import org.jbpm.designer.vdml.AbstractVdmlJsonToEmfHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.vdml.CapabilityOffer;
import org.omg.vdml.Collaboration;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.Pool;
import org.omg.vdml.Position;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VdmlElement;

public class VdmlCapabilityManagementJsonToEmfHelper extends AbstractVdmlJsonToEmfHelper {
    private OrgUnit owningOrgUnit;
    private Map<VdmlElement, Element> vdmlUmlElementMap = new HashMap<VdmlElement, Element>();
    private Package umlPackage;

    public VdmlCapabilityManagementJsonToEmfHelper(ShapeMap resource) {
        super(resource, VdmlCapabilityManagementStencil.class);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseRole(Role object) {
        return super.caseRole(object);
    }

    @Override
    public Object casePosition(Position object) {
        owningOrgUnit.getPosition().add(object);
        return super.casePosition(object);
    }

    @Override
    public Object casePool(Pool object) {
        object.setPoolSize(buildMeasuredCharacteristic("poolSizeMeasure"));
        return super.casePool(object);
    }

    @Override
    public Object caseOrgUnit(OrgUnit object) {
        syncUmlClass(object);
        return super.caseOrgUnit(object);
    }

    @Override
    public Object caseStore(Store object) {
        owningOrgUnit.getOwnedStore().add(object);
        object.setDuration(buildMeasuredCharacteristic("durationMeasure"));
        object.setInventoryLevel(buildMeasuredCharacteristic("inventoryLevelMeasure"));
        object.setResource(buildBusinessItem("resourceDefinition"));
        syncUmlClass(object);
        return super.caseStore(object);
    }

    private void syncUmlClass(VdmlElement object) {
        Class cls = (Class) this.vdmlUmlElementMap.get(object);
        if (cls == null) {
            cls = UMLFactory.eINSTANCE.createClass();
            cls.createEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().add(object);
            umlPackage.getOwnedTypes().add(cls);
        }
        cls.setName(object.getName());
    }

    @Override
    public VDMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        VDMLDiagram diagram = super.prepareEmfDiagram(json, result);
        if (super.owningCollaboration != null) {
            this.owningOrgUnit = (OrgUnit) super.owningCollaboration;
            for (CapabilityOffer co : this.owningOrgUnit.getCapabilityOffer()) {
                co.getMethod().clear();
                co.getCapabilityResource().clear();
            }
            for (Position p : this.owningOrgUnit.getPosition()) {
                // TODO this is a problem for externally referenced pools
                p.getActorPool().clear();
            }
        }
        this.umlPackage = null;
        for (EObject o : result.getContents()) {
            if (o instanceof Package) {
               this. umlPackage = (Package) o;
            }
        }
        if (umlPackage == null) {
            umlPackage = UMLFactory.eINSTANCE.createPackage();
            result.getContents().add(umlPackage);
        }
        umlPackage.setName(owningOrgUnit.getName().toLowerCase());
        TreeIterator<EObject> eAllContents = umlPackage.eAllContents();
        while (eAllContents.hasNext()) {
            EObject e = (EObject) eAllContents.next();
            if (e instanceof Element) {
                Element el = (Element) e;
                if (el.getEAnnotation(VdmlLibraryStencil.VDLIB_URI) != null) {
                    VdmlElement ve = (VdmlElement) el.getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
                    this.vdmlUmlElementMap.put(ve, el);
                }
            }
        }
        return diagram;
    }

    @Override
    protected VDMLDiagramElement createDiagramElement(String stencilId) {
        return VdmlCapabilityManagementStencil.createDiagramElement(stencilId);
    }

    @Override
    protected VdmlElement createElement(String stencilId) {
        EClass elementType = VdmlCapabilityManagementStencil.findStencilById(stencilId).getElementType();
        if (elementType == null) {
            return null;
        }
        return (VdmlElement) super.create(elementType);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void postprocessResource() {
        super.postprocessResource();
        for (Map.Entry<VdmlElement, Element> entry : this.vdmlUmlElementMap.entrySet()) {
            if (entry.getKey().eResource() == null) {
                EReference cf = entry.getValue().eContainmentFeature();
                EObject container = entry.getValue().eContainer();
                if (cf.isMany()) {
                    Object c = container.eGet(cf);
                    ((EList) c).remove(entry.getValue());
                } else {
                    container.eSet(cf, null);
                }
            }
        }
    }
}
