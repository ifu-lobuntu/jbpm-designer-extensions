package org.jbpm.designer.vdlib;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.ucd.ClassDiagramJsonToEmfHelper;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.Measure;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.BusinessItemLibrary;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;

public class VdmlLibraryJsonToEmfHelper extends ClassDiagramJsonToEmfHelper {
    BusinessItemLibrary owningBusinessItemLibrary;

    public VdmlLibraryJsonToEmfHelper(ShapeMap resource) {
        super(resource);
    }

    @Override
    public Object caseClass(Class object) {
        if(sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.BUSINESS_ITEM_DEFINITION.getStencilId())){
            BusinessItemDefinition bid = createBusinessDefinition(shapeMap.getResource(), object, owningBusinessItemLibrary);
            bid.setIsFungible("true".equals(sourceShape.getProperty("isFungible")));
            bid.setIsShareable("true".equals(sourceShape.getProperty("isShareable")));
        }
        return super.caseClass(object);
    }

    @Override
    public Object caseProperty(Property object) {
        if(sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.CHARACTERISTIC_DEFINITION.getStencilId())){
            LinkedProperty prop = currentStencil.getProperties().get("measure");
            Measure measure = (Measure) sourceShape.getUnboundProperty("measure");
            if(measure!=null){
                forceGetAnnotation(object).getReferences().add(measure.getTrait());
                Class clss = (Class) object.getOwner();
                BusinessItemDefinition bid=(BusinessItemDefinition) clss.getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
                bid.getCharacteristicDefinition().add(measure.getTrait());
                object.setName(measure.getName());
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

    public static  ValueDeliveryModel createValueDeliveryModel(XMLResource result, Package pkg) {
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
            return de;
        }
    }

    public static BusinessItemDefinition createBusinessDefinition(XMLResource inputResource, Class clss, BusinessItemLibrary businessItemLibrary) {
        BusinessItemDefinition bid=VDMLFactory.eINSTANCE.createBusinessItemDefinition();
        bid.setName(clss.getName());
        businessItemLibrary.getBusinessItemLibraryElement().add(bid);
        bid.setId(inputResource.getID(clss)+"bid");
        forceGetAnnotation(clss).getReferences().add(bid);
        return bid;
    }

    protected static EAnnotation forceGetAnnotation(Element clss) {
        EAnnotation a = clss.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        if(a==null){
            a = clss.createEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        }
        return a;
    }
}
