package org.jbpm.designer.ucd;

import static org.jbpm.designer.ucd.ClassDiagramStencil.*;

import java.beans.Introspector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.jbpm.uml2.dd.umldi.UMLEdge;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.omg.dd.di.DiagramElement;

public class ClassDiagramJsonToEmfHelper extends UMLSwitch<Object> implements JsonToEmfHelper {
    protected Shape sourceShape;
    protected LinkedStencil currentStencil;
    protected ShapeMap shapeMap;
    protected Package thisPackage;

    public ClassDiagramJsonToEmfHelper(ShapeMap shapeMap) {
        this.shapeMap = shapeMap;
    }

    @Override
    public Object caseClass(Class object) {
        doAssociations(object);
        return super.caseClass(object);
    }

    private void doAssociations(Classifier object) {
        for (ShapeReference shapeReference : sourceShape.getOutgoing()) {
            Shape shape = shapeMap.get(shapeReference);
            ClassDiagramStencil stencil = ClassDiagramStencil.findStencilById(shape.getStencilId());
            switch (stencil) {
            case COMPOSITION:
            case DIRECTED_ASSOCIATION:
            case BI_DIRECTIONAL_ASSOCIATION:
                Association asso = (Association) getModelElement(shapeReference.getResourceId());
                @SuppressWarnings("unchecked")
                EList<Property> ownedAttributes = (EList<Property>) object.eGet(object.eClass().getEStructuralFeature("ownedAttribute"));
                ownedAttributes.add(asso.getMemberEnds().get(1));
                Property end1 = asso.getMemberEnds().get(0);
                end1.setType(object);
                if (stencil != BI_DIRECTIONAL_ASSOCIATION) {
                    end1.setName(Introspector.decapitalize(end1.getType().getName()));
                }
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
        doAssociations(object);
        return super.caseInterface(object);
    }

    @Override
    public Object caseEnumeration(Enumeration object) {
        doAssociations(object);
        return super.caseEnumeration(object);
    }

    @Override
    public Object caseGeneralization(Generalization object) {
        return super.caseGeneralization(object);
    }

    @Override
    public Object caseInterfaceRealization(InterfaceRealization object) {
        return super.caseInterfaceRealization(object);
    }

    @Override
    public Object caseProperty(Property object) {
        setMultiplicity("multiplicity", object);
        return super.caseProperty(object);
    }

    private void setMultiplicity(String key, Property object) {
        String multiplicity = sourceShape.getProperty(key);
        if (multiplicity != null) {
            if (multiplicity.equals("[0..1]")) {
                object.setLower(0);
                object.setUpper(1);
            } else if (multiplicity.equals("[1]")) {
                object.setLower(1);
                object.setUpper(1);
            } else if (multiplicity.equals("[*]")) {
                object.setLower(0);
                object.setUpper(-1);
            } else if (multiplicity.equals("[1..*]")) {
                object.setLower(1);
                object.setUpper(-1);
            }
        }
    }

    @Override
    public Object caseAssociation(Association object) {
        for (ShapeReference shapeReference : sourceShape.getOutgoing()) {
            Classifier clss = (Classifier) getModelElement(shapeReference.getResourceId());
            if (sourceShape.getStencilId().equalsIgnoreCase(DIRECTED_ASSOCIATION.getStencilId())) {
                object.getOwnedEnds().add(object.getMemberEnds().get(0));
            } else {
                @SuppressWarnings("unchecked")
                EList<Property> ownedAttributes = (EList<Property>) clss.eGet(clss.eClass().getEStructuralFeature("ownedAttribute"));
                ownedAttributes.add(object.getMemberEnds().get(0));
            }
            object.getMemberEnds().get(1).setType(clss);
        }
        if (sourceShape.getStencilId().equals(ClassDiagramStencil.BI_DIRECTIONAL_ASSOCIATION.getStencilId())) {
            setMultiplicity("end1Multiplicity", object.getMemberEnds().get(0));
            setMultiplicity("end2Multiplicity", object.getMemberEnds().get(1));
        } else {
            setMultiplicity("multiplicity", object.getMemberEnds().get(1));
            if (sourceShape.getStencilId().equalsIgnoreCase(DIRECTED_ASSOCIATION.getStencilId())) {
                object.getMemberEnds().get(0).setLower(0);
                object.getMemberEnds().get(0).setUpper(-1);
            } else if (sourceShape.getStencilId().equalsIgnoreCase(COMPOSITION.getStencilId())) {
                object.getMemberEnds().get(0).setLower(1);
                object.getMemberEnds().get(0).setUpper(1);
            }
        }
        return super.caseAssociation(object);
    }

    @Override
    public DiagramElement createElements(Shape shape) {
        return createElements(shape.getStencilId());
    }

    protected UMLDiagramElement createElements(String stencilId) {
        UMLDiagramElement de = ClassDiagramStencil.createDiagramElement(stencilId);
        Element modelElement = ClassDiagramStencil.createElement(stencilId);
        if (de instanceof UMLShape) {
            ((UMLShape) de).setUmlElement((Element) modelElement);
        } else if (de instanceof UMLEdge) {
            ((UMLEdge) de).setUmlElement((Element) modelElement);
        } else if (de instanceof UMLCompartment) {
            ((UMLCompartment) de).setFeatureName(Introspector.decapitalize(stencilId));
        }
        de.setLocalStyle(UMLDIFactory.eINSTANCE.createUMLStyle());
        return de;
    }

    @Override
    public void refineEmfElements(LinkedStencil sv, Shape sourceShape) {
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
        return d;
    }

    @Override
    public EObject create(EClass eType) {
        return UMLFactory.eINSTANCE.create(eType);
    }

    @Override
    public Object convertFromString(LinkedProperty property, String string, java.lang.Class<?> targetType) {
        return null;
    }

    @Override
    public void postprocessResource() {
    }
}
