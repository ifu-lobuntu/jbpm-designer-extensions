package org.jbpm.designer.vdlib;

import java.beans.Introspector;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.designer.ucd.ClassDiagramJsonToEmfHelper;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.DirectMeasure;
import org.omg.smm.GradeMeasure;
import org.omg.smm.Measure;
import org.omg.smm.RankingMeasure;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.BusinessItemLibrary;
import org.omg.vdml.BusinessItemLibraryElement;
import org.omg.vdml.Capability;
import org.omg.vdml.CapabilityCategory;
import org.omg.vdml.CapabilityDefinition;
import org.omg.vdml.CapabilityLibrary;
import org.omg.vdml.Collaboration;
import org.omg.vdml.MeasurableElement;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.RoleDefinition;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDefinition;
import org.omg.vdml.ValueDeliveryModel;

public class VdmlLibraryJsonToEmfHelper extends ClassDiagramJsonToEmfHelper {
    BusinessItemLibrary owningBusinessItemLibrary;
    private CapabilityLibrary owningCapabilityLibrary;
    private Package cmmnTypes;
    private Collaboration owningCollaboration;
    private UMLDiagram diagram;

    public VdmlLibraryJsonToEmfHelper(ShapeMap resource) {
        super(resource);
    }

    @Override
    public Object caseClass(Class object) {
        if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.BUSINESS_ITEM_DEFINITION.getStencilId())) {
            BusinessItemDefinition bid = createBusinessDefinition(object, owningBusinessItemLibrary);
            bid.setIsFungible("true".equals(sourceShape.getProperty("isFungible")));
            bid.setIsShareable("true".equals(sourceShape.getProperty("isShareable")));
        } else if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.CAPABILITY_CATEGORY.getStencilId())) {
            CapabilityCategory cc = createCapabilityCategory(object, owningCapabilityLibrary);
        } else if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.CAPABILITY_DEFINITION.getStencilId())) {
            CapabilityDefinition cd = createCapabilityDefinition(object, owningCapabilityLibrary);
        }
        return super.caseClass(object);
    }

    @Override
    public void refineEmfElements(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        EObject modelElement = shapeMap.getModelElement(sourceShape.getResourceId());
        if (modelElement instanceof Element) {
            super.doSwitch(modelElement);
        } else {

        }
    }
    

    @Override
    public Object caseProperty(Property object) {
        if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.CHARACTERISTIC.getStencilId())) {
            Measure measure = (Measure) sourceShape.getUnboundProperty("measure");
            if (measure != null) {
                EList<EObject> references = forceGetAnnotation(object).getReferences();
                if (references.size() > 0) {
                    references.set(0, measure.getTrait());
                } else {
                    references.add(measure.getTrait());
                }
                Class clss = (Class) object.getOwner();
                EObject ref = clss.getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
                object.setName(measure.getName());
                if (ref instanceof BusinessItemLibraryElement) {
                    ((BusinessItemLibraryElement) ref).getCharacteristicDefinition().add(measure.getTrait());
                } else if (ref instanceof Capability) {
                    ((Capability) ref).getCharacteristicDefinition().add(measure.getTrait());
                } else if (ref instanceof RoleDefinition) {
                    ((RoleDefinition) ref).getCharacteristicDefinition().add(measure.getTrait());
                } else if (ref instanceof ValueDefinition) {
                    ((ValueDefinition) ref).getCharacteristicDefinition().add(measure.getTrait());
                } else if (ref instanceof MeasurableElement) {
                    object.eResource().setModified(true);
                    MeasurableElement me = (MeasurableElement) ref;
                    boolean found = false;
                    for (MeasuredCharacteristic mc : me.getMeasuredCharacteristic()) {
                        if (mc.getCharacteristicDefinition().equals(measure.getTrait())) {
                            found = true;
                        }
                    }
                    if (!found) {
                        me.eResource().setModified(true);
                        MeasuredCharacteristic mc = VDMLFactory.eINSTANCE.createMeasuredCharacteristic();
                        mc.setCharacteristicDefinition(measure.getTrait());
                        mc.setName(measure.getTrait().getName());
                        me.getMeasuredCharacteristic().add(mc);
                    }
                    XMLResource resource = (XMLResource) object.eResource();
                    if (resource.getID(object) == null) {
                        resource.setID(object, ((XMLResource) measure.eResource()).getID(measure) + "prop");
                    }
                }
                if (measure instanceof DirectMeasure) {
                    if (cmmnTypes != null) {
                        object.setType(cmmnTypes.getOwnedType("Double"));
                    }
                } else if (measure instanceof GradeMeasure || measure instanceof RankingMeasure) {
                    for (EObject e : measure.eResource().getContents()) {
                        if (e instanceof Package) {
                            object.setType(((Package) e).getOwnedType(measure.getName()));
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void postprocessResource() {
        super.postprocessResource();
        TreeIterator<EObject> eAllContents = thisPackage.eAllContents();
        Set<Element> orphanUmlElements=new HashSet<Element>();
        while (eAllContents.hasNext()) {
            EObject eObject = eAllContents.next();
            if(eObject instanceof Element && ((Element) eObject).getEAnnotation(VdmlLibraryStencil.VDLIB_URI)!=null){
                EAnnotation en= ((EModelElement) eObject).getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
                if(en.getReferences().isEmpty() || en.getReferences().get(0).eResource()==null){
                    orphanUmlElements.add((Element) eObject);
                }
            }
        }
        TreeIterator<EObject> eAllContents2 = this.diagram.eAllContents();
    }

    @Override
    public UMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        this.diagram = UMLDIFactory.eINSTANCE.createUMLDiagram();
        result.getContents().add(diagram);
        URI collaborationUri = result.getURI().trimFileExtension().appendFileExtension("vdcol");
        this.owningCollaboration = VdmlHelper.getCollaboration((XMLResource) result.getResourceSet().getResource(collaborationUri, true));
        Package pkg = null;
        for (EObject eo : owningCollaboration.eResource().getContents()) {
            if (eo instanceof Package) {
                pkg = (Package) eo;
                break;
            }
        }
        if(pkg==null){
            pkg=UMLFactory.eINSTANCE.createPackage();
            pkg.setName(this.owningCollaboration.getName().toLowerCase());
            this.owningCollaboration.eResource().getContents().add(pkg);
        }
        diagram.setUmlElement(pkg);
        ValueDeliveryModel vdm = findOrcreateValueDeliveryModel(pkg);
        CapabilityLibrary cl = findOrCreateCapabilityLibrary(pkg, vdm);
        cl.setName(json.getProperty("name"));
        owningCapabilityLibrary = cl;
        BusinessItemLibrary bil = findOrCreateBusinessItemLibrary(pkg, vdm);
        bil.setName(json.getProperty("name"));
        owningBusinessItemLibrary = bil;
        this.cmmnTypes = AbstractClassDiagramProfileImpl.getCmmnTypes(result.getResourceSet());
        return diagram;
    }

    public static BusinessItemLibrary findOrCreateBusinessItemLibrary(Package pkg, ValueDeliveryModel vdm) {
        for (BusinessItemLibrary bil : vdm.getBusinessItemLibrary()) {
            return bil;
        }
        BusinessItemLibrary bil = VDMLFactory.eINSTANCE.createBusinessItemLibrary();
        bil.setId(((XMLResource) vdm.eResource()).getID(pkg) + "bil");
        vdm.getBusinessItemLibrary().add(bil);
        return bil;
    }

    public static CapabilityLibrary findOrCreateCapabilityLibrary(Package pkg, ValueDeliveryModel vdm) {
        XMLResource resource=(XMLResource) pkg.eResource();
        for (CapabilityLibrary cl : vdm.getCapabilitylibrary()) {
            return cl;
        }
        CapabilityLibrary cl = VDMLFactory.eINSTANCE.createCapabilityLibrary();
        cl.setId(resource.getID(pkg) + "cl");
        vdm.getCapabilitylibrary().add(cl);
        return cl;
    }

    public static ValueDeliveryModel findOrcreateValueDeliveryModel(Package pkg) {
        XMLResource resource=(XMLResource) pkg.eResource();
        for (EObject eo : resource.getContents()) {
            if (eo instanceof ValueDeliveryModel) {
                return (ValueDeliveryModel) eo;
            }
        }
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        vdm.setId(resource.getID(pkg) + "vdm");
        resource.getContents().add(vdm);
        return vdm;
    }

    @Override
    public DiagramElement createElements(Shape shape) {
        VdmlLibraryStencil st = VdmlLibraryStencil.findStencilById(shape.getStencilId());
        if (st == null) {
            return super.createElements(shape);
        } else {
            UMLDiagramElement de = super.createElements(st.getBaseStencil().getStencilId());
            if (de instanceof UMLCompartment) {
                ((UMLCompartment) de).setFeatureName(Introspector.decapitalize(shape.getStencilId()));
            }
            return de;
        }
    }

    public static BusinessItemDefinition createBusinessDefinition(Class clss, BusinessItemLibrary library) {
        XMLResource resource=(XMLResource) clss.eResource();
        BusinessItemDefinition bid = VDMLFactory.eINSTANCE.createBusinessItemDefinition();
        bid.setName(clss.getName());
        library.getBusinessItemLibraryElement().add(bid);
        bid.setId(resource.getID(clss) + "bid");
        forceGetAnnotation(clss).getReferences().add(bid);
        return bid;
    }

    public static CapabilityDefinition createCapabilityDefinition(Class clss, CapabilityLibrary library) {
        CapabilityDefinition cd = VDMLFactory.eINSTANCE.createCapabilityDefinition();
        cd.setName(clss.getName());
        library.getCapability().add(cd);
        cd.setId(((XMLResource) clss.eResource()).getID(clss) + "cd");
        forceGetAnnotation(clss).getReferences().add(cd);
        return cd;
    }

    public static CapabilityCategory createCapabilityCategory(Class clss, CapabilityLibrary library) {
        CapabilityCategory cd = VDMLFactory.eINSTANCE.createCapabilityCategory();
        cd.setName(clss.getName());
        library.getCapability().add(cd);
        cd.setId(((XMLResource) clss.eResource()).getID(clss) + "cc");
        forceGetAnnotation(clss).getReferences().add(cd);
        return cd;
    }

    protected static EAnnotation forceGetAnnotation(Element clss) {
        EAnnotation a = clss.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        if (a == null) {
            a = clss.createEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        }
        return a;
    }
}
