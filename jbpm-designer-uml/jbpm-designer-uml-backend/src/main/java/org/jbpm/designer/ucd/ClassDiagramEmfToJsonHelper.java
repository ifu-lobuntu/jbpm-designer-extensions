package org.jbpm.designer.ucd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
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
        if(object.getType() !=null){
            //TODO support external types
            targetShape.putProperty("type", object.getType().getName());
        }
        return super.caseProperty(object);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, DiagramElement de) {
        return ClassDiagramStencil.findStencilByElement(me, de);
    }

    @Override
    public void linkElements(DiagramElement diagramElement, Shape shape) {
        if(diagramElement instanceof UMLCompartment){
            //Do it here because we don't have a UML Element to switch
            shape.putProperty("isexpanded", ((UMLCompartment) diagramElement).isIsExpanded()+"");
        }
    }


}
