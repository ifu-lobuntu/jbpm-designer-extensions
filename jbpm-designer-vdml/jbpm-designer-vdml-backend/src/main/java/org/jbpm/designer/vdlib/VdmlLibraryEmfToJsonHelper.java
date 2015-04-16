package org.jbpm.designer.vdlib;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.jbpm.designer.dd.jbpmdd.Compartment;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.ucd.ClassDiagramEmfToJsonHelper;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.Characteristic;
import org.omg.vdml.BusinessItemDefinition;
import org.omg.vdml.CapabilityCategory;
import org.omg.vdml.CapabilityDefinition;
import org.omg.vdml.CapabilityOffer;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.Store;

public class VdmlLibraryEmfToJsonHelper extends ClassDiagramEmfToJsonHelper {

    public VdmlLibraryEmfToJsonHelper(ShapeMap resource) {
        super(resource);
    }
    @Override
    public Object caseClass(Class object) {
        if(targetShape.getStencilId().equals(VdmlLibraryStencil.BUSINESS_ITEM_DEFINITION.getStencilId())){
            BusinessItemDefinition bid=(BusinessItemDefinition) object.getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
            targetShape.putProperty("isShareable", bid.getIsShareable().toString());
            targetShape.putProperty("isFungible", bid.getIsFungible().toString());
        }
        return super.caseClass(object);
    }
    @Override
    public Object caseProperty(Property object) {
        if(targetShape.getStencilId().equals(VdmlLibraryStencil.CHARACTERISTIC.getStencilId())){
            Characteristic ch=(Characteristic) object.getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
            if(ch.eResource()!=null && ch.getMeasure().size()>0){
                targetShape.putProperty("measure", ch.getMeasure().get(0).getName() + "|" + ch.eResource().getURI().toPlatformString(true));
            }
        }
        return super.caseProperty(object);
    }
    @Override
    public StencilInfo findStencilByElement(EObject me, DiagramElement de) {
        if(me instanceof EModelElement){
            EAnnotation ann = ((EModelElement) me).getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
            if(ann!=null){
                EObject ref = ann.getReferences().get(0);
                if(ref instanceof BusinessItemDefinition){
                    return VdmlLibraryStencil.BUSINESS_ITEM_DEFINITION;
                }
                if(ref instanceof Characteristic){
                    return VdmlLibraryStencil.CHARACTERISTIC;
                }
                if(ref instanceof CapabilityCategory){
                    return VdmlLibraryStencil.CAPABILITY_CATEGORY;
                }
                if(ref instanceof CapabilityDefinition){
                    return VdmlLibraryStencil.CAPABILITY_DEFINITION;
                }
                if(ref instanceof OrgUnit || ref instanceof Store || ref instanceof CapabilityOffer){
                    return VdmlLibraryStencil.IMPORTED_ORG_ELEMENT;
                }
            }
        }else if(de instanceof Compartment && ((UMLShape)de.eContainer()).getUmlElement() !=null ){
            EAnnotation ann = ((UMLShape)de.eContainer()).getUmlElement().getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
            if(ann!=null){
                if(VdmlLibraryStencil.CHARACTERISTIC_DEFINITION.getStencilId().equalsIgnoreCase(((UMLCompartment) de).getFeatureName())){
                    return VdmlLibraryStencil.CHARACTERISTIC_DEFINITION;
                }
            }
        }
        return super.findStencilByElement(me, de);
    }
}
