package org.jbpm.designer.ucd;

import static org.jbpm.designer.ucd.ClassDiagramStencil.INTERFACE;

import java.beans.Introspector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.JsonToEmfHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLEdge;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.omg.dd.di.DiagramElement;

public class ClassDiagramJsonToEmfHelper extends UMLSwitch<Object> implements JsonToEmfHelper {
    protected Shape sourceShape;
    private LinkedStencil currentStencil;
    private Package thisPackage;
    private ShapeMap shapeMap;
    private Package cmmnTypes;

    public ClassDiagramJsonToEmfHelper(ShapeMap shapeMap) {
        this.shapeMap = shapeMap;
    }

    @Override
    public Object caseClass(Class object) {
        if (sourceShape.getStencilId().equals(ClassDiagramStencil.CLASS.getStencilId())) {
            thisPackage.getOwnedTypes().add(object);
        }
        doAssocatiations(object);
        return super.caseClass(object);
    }

    private void doAssocatiations(Class object) {
        for (ShapeReference shapeReference : sourceShape.getOutgoing()) {
            Shape shape = getShape(shapeReference.getResourceId());
            ClassDiagramStencil stencil = ClassDiagramStencil.findStencilById(shape.getStencilId());
            switch (stencil) {
            case COMPOSITION:
            case ASSOCIATION:
                Association asso = (Association) getModelElement(shapeReference.getResourceId());
                object.getOwnedAttributes().add(asso.getMemberEnds().get(1));
                asso.getMemberEnds().get(0).setType(object);
                break;
            default:
            }
        }
    }

    private Element getModelElement(String resourceId) {
        return (Element) shapeMap.getModelElement(resourceId);
    }

    @Override
    public Object caseInterface(Interface object) {
        thisPackage.getOwnedTypes().add(object);
        return super.caseInterface(object);
    }
    @Override
    public Object caseEnumeration(Enumeration object) {
        thisPackage.getOwnedTypes().add(object);
        return super.caseEnumeration(object);
    }

    @Override
    public Object caseGeneralization(Generalization object) {
        for (ShapeReference shapeReference : sourceShape.getOutgoing()) {
            Shape shape = getShape(shapeReference.getResourceId());
            ClassDiagramStencil stencil = ClassDiagramStencil.findStencilById(shape.getStencilId());
            switch (stencil) {
            case CLASS:
                Class c = (Class) getModelElement(shapeReference.getResourceId());
                object.setGeneral(c);
                break;
            }
        }
        return super.caseGeneralization(object);
    }

    @Override
    public Object caseInterfaceRealization(InterfaceRealization object) {
        for(Interface c:shapeMap.<Interface>getOutgoingModelElements(sourceShape, INTERFACE)){
            object.setContract(c);
        }
        return super.caseInterfaceRealization(object);
    }

    @Override
    public Object caseProperty(Property object) {
        UMLShape classifierShape = (UMLShape) shapeMap.getDiagramElement(sourceShape).getOwningElement().getOwningElement();
        Classifier classifier = (Classifier) classifierShape.getUmlElement();
        EStructuralFeature ownedAttributeFeature = classifier.eClass().getEStructuralFeature("ownedAttribute");
        EList<Property> feature = (EList<Property>) classifier.eGet(ownedAttributeFeature);
        object.setType(cmmnTypes.getOwnedType(sourceShape.getProperty("type")));
        feature.add(object);
        return super.caseProperty(object);
    }

    @Override
    public Object caseAssociation(Association object) {
        thisPackage.getOwnedTypes().add(object);
        for (ShapeReference shapeReference : sourceShape.getOutgoing()) {
            Shape shape = getShape(shapeReference.getResourceId());
            ClassDiagramStencil stencil = ClassDiagramStencil.findStencilById(shape.getStencilId());
            if (stencil == ClassDiagramStencil.CLASS) {
                Class clss = (Class) getModelElement(shapeReference.getResourceId());
                clss.getOwnedAttributes().add(object.getMemberEnds().get(0));
                object.getMemberEnds().get(1).setType(clss);
            }
        }
        return super.caseAssociation(object);
    }

    @Override
    public DiagramElement createElements(Shape shape) {
        DiagramElement de= ClassDiagramStencil.createDiagramElement(shape.getStencilId());
        Element modelElement=ClassDiagramStencil.createElement(shape.getStencilId());
        if (de instanceof UMLShape) {
            ((UMLShape) de).setUmlElement((Element) modelElement);
        } else if (de instanceof UMLEdge) {
            ((UMLEdge) de).setUmlElement((Element) modelElement);
        } else if (de instanceof UMLCompartment) {
            ((UMLCompartment) de).setIsExpanded("true".equals(shape.getProperty("isexpanded")));
            ((UMLCompartment) de).setFeatureName(Introspector.decapitalize(shape.getStencilId()));
        }
        de.setLocalStyle(UMLDIFactory.eINSTANCE.createUMLStyle());
        return de;
    }

    public Shape getShape(String id) {
        return shapeMap.get(id);
    }

    @Override
    public void doSwitch(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        super.doSwitch(getModelElement(sourceShape.getResourceId()));
    }

    public UMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        UMLDiagram d = UMLDIFactory.eINSTANCE.createUMLDiagram();
        thisPackage = UMLFactory.eINSTANCE.createPackage();
        result.setID(thisPackage, json.getResourceId());
        d.setUmlElement(thisPackage);
        result.getContents().add(thisPackage);
        result.getContents().add(d);
        this.cmmnTypes=(Package) result.getResourceSet().getResource(URI.createURI("libraries/cmmntypes.uml"), false).getContents().get(0);
        return d;
    }



    @Override
    public EObject create(EClass eType) {
        return UMLFactory.eINSTANCE.create(eType);
    }

    private DiagramElement getDiagramElement(String resourceId) {
        return shapeMap.getDiagramElement(resourceId);
    }
}
