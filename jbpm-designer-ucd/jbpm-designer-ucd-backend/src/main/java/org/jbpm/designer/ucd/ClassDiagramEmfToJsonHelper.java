package org.jbpm.designer.ucd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.omg.dd.di.Diagram;
import org.omg.dd.di.DiagramElement;

public class ClassDiagramEmfToJsonHelper extends UMLSwitch<Object> implements EmfToJsonHelper {
    private ShapeMap shapeMap;
    private Shape targetShape;
    public ClassDiagramEmfToJsonHelper(ShapeMap diagramStateHolder) {
        super();
        this.shapeMap = diagramStateHolder;
    }

    @Override
    public void doSwitch(LinkedStencil validator, Shape targetShape, EObject me) {
        this.targetShape = targetShape;
        doSwitch(me);
    }

    @Override
    public Object caseAssociation(Association object) {
        if(targetShape.getStencilId().equals(ClassDiagramStencil.BI_DIRECTIONAL_ASSOCIATION.getStencilId())){
            putMultiplicity("end1Multiplicity", object.getMemberEnds().get(0));
            putMultiplicity("end2Multiplicity", object.getMemberEnds().get(1));
        }else{
            putMultiplicity("multiplicity", object.getMemberEnds().get(1));
        }
        return super.caseAssociation(object);
    }

    @Override
    public Diagram getDiagram(int i) {
        EList<EObject> contents = shapeMap.getResource().getContents();
        for (EObject eObject : contents) {
            if(eObject instanceof UMLDiagram){
                if(i==0){
                    return (Diagram) eObject;
                }else{
                    i--;
                }
            }
        }
        return null;
    }
    @Override
    public Object caseProperty(Property object) {
        putMultiplicity("multiplicity", object);
        return super.caseProperty(object);
    }

    private void putMultiplicity(String key, Property object) {
        String multiplicity=null;
        if(object.isMultivalued()){
            if(object.getLower()==1){
                multiplicity="[1..*]";
            }else{
                multiplicity="[*]";
            }
        }else{
            if(object.getLower()==1){
                multiplicity="[1]";
            }else{
                multiplicity="[0..1]";
            }
        }
        targetShape.putProperty(key, multiplicity);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, DiagramElement de) {
        return ClassDiagramStencil.findStencilByElement(me, de);
    }

    @Override
    public void linkElements(DiagramElement diagramElement, Shape shape) {
    }


    @Override
    public String convertToString(LinkedProperty property, Object val) {
        return null;
    }
    @Override
    public void preprocessResource(XMLResource resource) {
    }
}
