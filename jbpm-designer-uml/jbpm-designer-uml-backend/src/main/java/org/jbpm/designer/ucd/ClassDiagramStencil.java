package org.jbpm.designer.ucd;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.extensions.emf.util.StencilInfo;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.omg.dd.di.DiagramElement;

public enum ClassDiagramStencil implements StencilInfo {
    CLASS_DIAGRAM(UMLPackage.eINSTANCE.getPackage(), UMLDIPackage.eINSTANCE.getUMLDiagram(), "ClassDiagram"),
    CLASS(UMLPackage.eINSTANCE.getClass_(), UMLDIPackage.eINSTANCE.getUMLShape(), "Class"),
    ENUMERATION(UMLPackage.eINSTANCE.getEnumeration(), UMLDIPackage.eINSTANCE.getUMLShape(), "Enumeration"),
    INTERFACE(UMLPackage.eINSTANCE.getInterface(), UMLDIPackage.eINSTANCE.getUMLShape(), "Interface"),
    PROPERTY(UMLPackage.eINSTANCE.getProperty(), UMLDIPackage.eINSTANCE.getUMLShape(), "Property"),
    OPERATION(UMLPackage.eINSTANCE.getOperation(), UMLDIPackage.eINSTANCE.getUMLShape(), "Operation"),
    COMPOSITION(UMLPackage.eINSTANCE.getAssociation(), UMLDIPackage.eINSTANCE.getUMLEdge(), "Composition"),
    GENERALIZATION(UMLPackage.eINSTANCE.getGeneralization(), UMLDIPackage.eINSTANCE.getUMLEdge(), "Generalization"),
    INTERFACE_REALIZATION(UMLPackage.eINSTANCE.getInterfaceRealization(), UMLDIPackage.eINSTANCE.getUMLEdge(), "InterfaceRealization"),
    ASSOCIATION(UMLPackage.eINSTANCE.getAssociation(), UMLDIPackage.eINSTANCE.getUMLEdge(), "Association"),
    OWNED_ATTRIBUTE((EClass) null, UMLDIPackage.eINSTANCE.getUMLCompartment(), "OwnedAttribute"),
    OWNED_OPERATION((EClass) null, UMLDIPackage.eINSTANCE.getUMLCompartment(), "OwnedOperation"),
    OWNED_LITERAL((EClass) null, UMLDIPackage.eINSTANCE.getUMLCompartment(), "OwnedLiteral");
    private EClass type;
    private EClass shapeType;
    private String stencilId;
    private static Map<String, ClassDiagramStencil> nameMap = new HashMap<String, ClassDiagramStencil>();

    private ClassDiagramStencil(EClass type, EClass shapeType, String name) {
        this.type = type;
        this.stencilId = name;
        this.shapeType = shapeType;
    }

    private ClassDiagramStencil(EReference type, EClass shapeType, String name) {
        this.stencilId = name;
        this.shapeType = shapeType;
    }

    public EClass getType() {
        return type;
    }

    public String getStencilId() {
        return stencilId;
    }

    static {
        for (ClassDiagramStencil stencil : values()) {
            nameMap.put(stencil.stencilId, stencil);
        }
    }

    public static DiagramElement createDiagramElement(String stencilId) {
        ClassDiagramStencil stencil = findStencilById(stencilId);
        if (stencil.shapeType == null) {
            return null;
        }
        return (DiagramElement) UMLDIFactory.eINSTANCE.create(stencil.shapeType);
    }

    public static Element createElement(String stencilId) {
        ClassDiagramStencil stencil = findStencilById(stencilId);
        if (stencil.type == null) {
            return null;
        } else if (stencil == COMPOSITION || stencil == ASSOCIATION) {
            Association asso = UMLFactory.eINSTANCE.createAssociation();
            asso.getMemberEnds().add(UMLFactory.eINSTANCE.createProperty());
            asso.getMemberEnds().add(UMLFactory.eINSTANCE.createProperty());
            if (stencil == COMPOSITION) {
                asso.getMemberEnds().get(1).setAggregation(AggregationKind.COMPOSITE_LITERAL);
            }
            return asso;
        }
        return (Element) UMLFactory.eINSTANCE.create(stencil.type);
    }

    public static ClassDiagramStencil findStencilById(String stencilId) {
        ClassDiagramStencil stencil = nameMap.get(stencilId);
        if (stencil == null) {
            throw new IllegalArgumentException("unregistered stencil id: " + stencilId);
        }
        return stencil;
    }

    public static ClassDiagramStencil findStencilByElement(EObject me, DiagramElement de) {
        ClassDiagramStencil[] possibilities = values();
        if (me instanceof Association) {
            EList<Property> memberEnds = ((Association) me).getMemberEnds();
            for (Property property : memberEnds) {
                if (property.isComposite()) {
                    return COMPOSITION;
                }
            }
            return ASSOCIATION;
        } else if (de instanceof UMLCompartment) {
            char[] charArray = ((UMLCompartment) de).getFeatureName().toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            return findStencilById(new String(charArray));
        } else if (possibilities != null) {
            for (ClassDiagramStencil umlStencil : possibilities) {
                if (umlStencil.type!=null &&
                        umlStencil.type.isSuperTypeOf(me.eClass())) {
                    return umlStencil;
                }
            }
        }
        return null;
    }

}
