package org.jbpm.designer.ucd;

import org.eclipse.dd.cmmn.di.Diagram;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.di.umldi.DocumentRoot;
import org.eclipse.uml2.di.umldi.UMLCompartment;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.jbpm.designer.emf.util.ShapeMap;
import org.jbpm.designer.emf.util.EmfToJsonHelper;
import org.jbpm.designer.emf.util.StencilInfo;
import org.jbpm.designer.server.diagram.json.Shape;
import org.jbpm.designer.stencilset.linkage.LinkedStencil;

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
        DocumentRoot dr = (DocumentRoot) shapeMap.getResource().getContents().get(0);
        return dr.getDiagram().get(i);
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
