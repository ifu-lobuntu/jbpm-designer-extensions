package org.jbpm.designer.vdlib;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.jbpm.designer.dd.jbpmdd.Compartment;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.designer.ucd.ClassDiagramEmfToJsonHelper;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.Characteristic;
import org.omg.vdml.BusinessItemDefinition;

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
        if(targetShape.getStencilId().equals(VdmlLibraryStencil.CHARACTERISTIC_DEFINITION.getStencilId())){
            Characteristic ch=(Characteristic) object.getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
            targetShape.putProperty("measure", ch.getMeasure().get(0).getName() + "|" + ch.eResource().getURI().toPlatformString(true));
        }
        return super.caseProperty(object);
    }
    @Override
    public StencilInfo findStencilByElement(EObject me, DiagramElement de) {
        if(me instanceof EModelElement){
            EAnnotation ann = ((EModelElement) me).getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
            if(ann!=null){
                if(ann.getReferences().get(0) instanceof BusinessItemDefinition){
                    return VdmlLibraryStencil.BUSINESS_ITEM_DEFINITION;
                }
                if(ann.getReferences().get(0) instanceof Characteristic){
                    return VdmlLibraryStencil.CHARACTERISTIC_DEFINITION;
                }
            }
        }else if(de instanceof Compartment && ((UMLShape)de.eContainer()).getUmlElement() !=null ){
            EAnnotation ann = ((UMLShape)de.eContainer()).getUmlElement().getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
            if(ann!=null){
                if(ann.getReferences().get(0) instanceof BusinessItemDefinition){
                    return VdmlLibraryStencil.CHARACTERISTIC_DEFINITION_COMPARTMENT;
                }
            }
        }
        return super.findStencilByElement(me, de);
    }
}
