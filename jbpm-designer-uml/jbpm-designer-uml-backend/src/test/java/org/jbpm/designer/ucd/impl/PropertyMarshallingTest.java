package org.jbpm.designer.ucd.impl;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

public class PropertyMarshallingTest extends AbstractClassDiagramMarshallingTest {
    @Test
    public void testPropertyCompartment() throws Exception {
        Class class1 = UMLFactory.eINSTANCE.createClass();
        class1.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class1);
        addShapeFor(class1);
        addCompartmentFor(class1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        super.assertOutputValid();
    }

    @Test
    public void testProperties() throws Exception {
        Class class1 = UMLFactory.eINSTANCE.createClass();
        class1.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class1);
        addShapeFor(class1);
        addCompartmentFor(class1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Property property = class1.getOwnedAttribute("testProperty", cmmnTypes.getOwnedType("String"), false, UMLPackage.eINSTANCE.getProperty(), true);
        addShapeToCompartment(class1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), property);
        super.assertOutputValid();
    }

    @Test
    public void testAssociationBug() throws Exception {
        Class class1 = UMLFactory.eINSTANCE.createClass();
        class1.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class1);
        addShapeFor(class1);
        addCompartmentFor(class1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
        Property property = class1.getOwnedAttribute("testProperty", cmmnTypes.getOwnedType("String"), false, UMLPackage.eINSTANCE.getProperty(), true);
        addShapeToCompartment(class1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), property);
        Class class2=UMLFactory.eINSTANCE.createClass();
        class2.setName("MyOtherClass");
        jbpmPackage.getOwnedTypes().add(class2);
        addShapeFor(class2);
        Association asso1 = UMLFactory.eINSTANCE.createAssociation();
        asso1.setName("myAsso");
        asso1.getMemberEnds().add(class2.getOwnedAttribute("myClass", class1, false, UMLPackage.eINSTANCE.getProperty(), true));
        asso1.getMemberEnds().add(class1.getOwnedAttribute("myOtherClass", class2, false, UMLPackage.eINSTANCE.getProperty(), true));
        asso1.getMemberEnds().get(1).setAggregation(AggregationKind.COMPOSITE_LITERAL);
        jbpmPackage.getOwnedTypes().add(asso1);
        addEdge( asso1, class1, class2);
        Class class3=UMLFactory.eINSTANCE.createClass();
        class3.setName("MyThirdClass");
        jbpmPackage.getOwnedTypes().add(class3);
        addShapeFor(class3);
        Association asso = UMLFactory.eINSTANCE.createAssociation();
        asso.setName("myAsso2");
        asso.getMemberEnds().add(class3.getOwnedAttribute("mySecondClass", class2, false, UMLPackage.eINSTANCE.getProperty(), true));
        asso.getMemberEnds().add(class2.getOwnedAttribute("myThirdClass", class3, false, UMLPackage.eINSTANCE.getProperty(), true));
        jbpmPackage.getOwnedTypes().add(asso);
        addEdge( asso, class2, class3);
        super.assertOutputValid();
    }
}
