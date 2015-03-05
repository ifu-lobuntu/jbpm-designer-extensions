package org.jbpm.designer.ucd;

import java.beans.Introspector;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Edge;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.di.umldi.DocumentRoot;
import org.eclipse.uml2.di.umldi.UMLCompartment;
import org.eclipse.uml2.di.umldi.UMLDIFactory;
import org.eclipse.uml2.di.umldi.UMLDiagram;
import org.eclipse.uml2.di.umldi.UMLEdge;
import org.eclipse.uml2.di.umldi.UMLLabel;
import org.eclipse.uml2.di.umldi.UMLPlane;
import org.eclipse.uml2.di.umldi.UMLShape;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.jbpm.designer.emf.util.JsonToEmfHelper;
import org.jbpm.designer.emf.util.ShapeMap;
import org.jbpm.designer.server.diagram.json.Diagram;
import org.jbpm.designer.server.diagram.json.Shape;
import org.jbpm.designer.server.diagram.json.ShapeReference;
import org.jbpm.designer.stencilset.linkage.LinkedStencil;

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
            case GENERALIZATION:
                Generalization g = (Generalization) getModelElement(shapeReference.getResourceId());
                object.getGeneralizations().add(g);
                break;
            case INTERFACE_REALIZATION:
                InterfaceRealization ir = (InterfaceRealization) getModelElement(shapeReference.getResourceId());
                object.getInterfaceRealizations().add(ir);
                break;

            default:
            }
        }
        return super.caseClass(object);
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
        for (ShapeReference shapeReference : sourceShape.getOutgoing()) {
            Shape shape = getShape(shapeReference.getResourceId());
            ClassDiagramStencil stencil = ClassDiagramStencil.findStencilById(shape.getStencilId());
            switch (stencil) {
            case INTERFACE:
                Interface c = (Interface) getModelElement(shapeReference.getResourceId());
                object.setContract(c);
                break;
            }
        }
        return super.caseInterfaceRealization(object);
    }

    @Override
    public Object caseProperty(Property object) {
        Classifier classifier = (Classifier) shapeMap.getDiagramElement(sourceShape).getOwningElement().getOwningElement().getModelElement();
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
    public void linkElements(Shape shape, DiagramElement de, EObject modelElement) {
        if (de instanceof UMLShape) {
            ((UMLShape) de).setUmlElement((Element) modelElement);
        } else if (de instanceof UMLEdge) {
            ((UMLEdge) de).setUmlElement((Element) modelElement);
        } else if (de instanceof UMLCompartment) {
            ((UMLCompartment) de).setIsExpanded("true".equals(shape.getProperty("isexpanded")));
            ((UMLCompartment) de).setFeatureName(Introspector.decapitalize(shape.getStencilId()));
        }
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

    public UMLPlane prepareEmfDiagram(Diagram json, XMLResource result) {
        UMLDiagram umlDiagram = UMLDIFactory.eINSTANCE.createUMLDiagram();
        UMLPlane umlPlane = UMLDIFactory.eINSTANCE.createUMLPlane();
        umlDiagram.setUmlPlane(umlPlane);
        thisPackage = UMLFactory.eINSTANCE.createPackage();
        DocumentRoot documentRoot = UMLDIFactory.eINSTANCE.createDocumentRoot();
        result.getContents().add(documentRoot);
        result.setID(thisPackage, json.getResourceId());
        umlPlane.setUmlElement(thisPackage);
        documentRoot.getPackages().add(thisPackage);
        documentRoot.getDiagram().add(umlDiagram);
        linkElements(json, umlPlane, thisPackage);
        this.cmmnTypes=(Package) result.getResourceSet().getResource(URI.createURI("libraries/cmmntypes.uml"), false).getContents().get(0);
        return umlPlane;
    }

    public UMLLabel setupDiagramElement(EObject el, DiagramElement de) {
        UMLLabel label = null;
        if (de instanceof UMLShape) {
            ((UMLShape) de).setUmlElement((Element) el);
            // ((UMLShape) de).setUMLLabel(label =
            // CmmnDiFactory.eINSTANCE.createUMLLabel());
        } else if (de instanceof UMLEdge) {
            ((UMLEdge) de).setUmlElement((Element) el);
            // ((UMLEdge) de).setUMLLabel(label =
            // CmmnDiFactory.eINSTANCE.createUMLLabel());
        }
        return label;
    }

    @Override
    public EObject create(EClass eType) {
        return UMLFactory.eINSTANCE.create(eType);
    }

    @Override
    public void setTargetElement(Edge edge, ShapeReference target) {
        ((UMLEdge) edge).setTargetElement(getDiagramElement(target.getResourceId()));
    }

    private DiagramElement getDiagramElement(String resourceId) {
        return shapeMap.getDiagramElement(resourceId);
    }

    @Override
    public void setSourceElement(Edge edge, Shape source) {
        ((UMLEdge) edge).setSourceElement(getDiagramElement(source.getResourceId()));
    }

    @Override
    public EObject createElement(String stencilId) {
        return ClassDiagramStencil.createElement(stencilId);
    }

    @Override
    public DiagramElement createDiagramElement(String stencilId) {
        return ClassDiagramStencil.createDiagramElement(stencilId);
    }
}
