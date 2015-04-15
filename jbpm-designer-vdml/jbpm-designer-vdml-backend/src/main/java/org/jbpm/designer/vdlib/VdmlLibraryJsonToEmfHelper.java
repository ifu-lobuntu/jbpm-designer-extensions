package org.jbpm.designer.vdlib;

import java.beans.Introspector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.designer.ucd.ClassDiagramJsonToEmfHelper;
import org.jbpm.designer.ucd.ClassDiagramStencil;
import org.jbpm.designer.vdml.AbstractVdmlJsonToEmfHelper;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.DirectMeasure;
import org.omg.smm.Measure;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.BusinessItemLibrary;
import org.omg.vdml.MeasurableElement;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;

public class VdmlLibraryJsonToEmfHelper extends ClassDiagramJsonToEmfHelper {
    private class VdmlLibraryJsonToEmfSwitch extends AbstractVdmlJsonToEmfHelper {

        public VdmlLibraryJsonToEmfSwitch(ShapeMap resource) {
            super(resource, VdmlLibraryStencil.class);
        }

        @Override
        protected VDMLDiagramElement createDiagramElement(String stencilId) {
            return null;
        }

        @Override
        protected VdmlElement createElement(String stencilId) {
            return null;
        }

    }

    BusinessItemLibrary owningBusinessItemLibrary;
    private VdmlLibraryJsonToEmfSwitch vdmlSwitch;

    public VdmlLibraryJsonToEmfHelper(ShapeMap resource) {
        super(resource);
        this.vdmlSwitch = new VdmlLibraryJsonToEmfSwitch(resource);
    }

    @Override
    public Object caseClass(Class object) {
        if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.BUSINESS_ITEM_DEFINITION.getStencilId())) {
            BusinessItemDefinition bid = createBusinessDefinition(shapeMap.getResource(), object, owningBusinessItemLibrary);
            bid.setIsFungible("true".equals(sourceShape.getProperty("isFungible")));
            bid.setIsShareable("true".equals(sourceShape.getProperty("isShareable")));
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
        if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.CHARACTERISTIC_DEFINITION.getStencilId())) {
            LinkedProperty prop = currentStencil.getProperties().get("measure");
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
                if (ref instanceof BusinessItemDefinition) {
                    BusinessItemDefinition bid = (BusinessItemDefinition) ref;
                    bid.getCharacteristicDefinition().add(measure.getTrait());
                    object.setName(measure.getName());
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
                    if(resource.getID(object)==null){
                        resource.setID(object, ((XMLResource) measure.eResource()).getID(measure)+"prop");
                    }
                    System.out.println(resource.getID(object));
                }
                if(measure instanceof DirectMeasure){
                    URI uri = URI.createURI(AbstractClassDiagramProfileImpl.CMMNTYPES_PATHMAP);
                    Resource cmmnTypes = object.eResource().getResourceSet().getResource(uri, true);
                    if(cmmnTypes!=null && cmmnTypes.getContents().size()>0){
                        Package pkg = (Package) cmmnTypes.getContents().get(0);
                        object.setType(pkg.getOwnedType("Double"));
                    }

                }
            }
        }
        return null;
    }

    @Override
    public UMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        UMLDiagram d = super.prepareEmfDiagram(json, result);
        Package pkg = (Package) d.getUmlElement();
        ValueDeliveryModel vdm = createValueDeliveryModel(result, pkg);
        BusinessItemLibrary bil = createBusinessItemLibrary(result, pkg, vdm);
        bil.setName(json.getProperty("name"));
        owningBusinessItemLibrary = bil;
        return d;
    }

    public static BusinessItemLibrary createBusinessItemLibrary(XMLResource result, Package pkg, ValueDeliveryModel vdm) {
        BusinessItemLibrary bil = VDMLFactory.eINSTANCE.createBusinessItemLibrary();
        bil.setId(result.getID(pkg) + "bil");
        vdm.getBusinessItemLibrary().add(bil);
        return bil;
    }

    public static ValueDeliveryModel createValueDeliveryModel(XMLResource result, Package pkg) {
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        vdm.setId(result.getID(pkg) + "vdm");
        result.getContents().add(vdm);
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

    public static BusinessItemDefinition createBusinessDefinition(XMLResource inputResource, Class clss, BusinessItemLibrary businessItemLibrary) {
        BusinessItemDefinition bid = VDMLFactory.eINSTANCE.createBusinessItemDefinition();
        bid.setName(clss.getName());
        businessItemLibrary.getBusinessItemLibraryElement().add(bid);
        bid.setId(inputResource.getID(clss) + "bid");
        forceGetAnnotation(clss).getReferences().add(bid);
        return bid;
    }

    protected static EAnnotation forceGetAnnotation(Element clss) {
        EAnnotation a = clss.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        if (a == null) {
            a = clss.createEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        }
        return a;
    }
}
