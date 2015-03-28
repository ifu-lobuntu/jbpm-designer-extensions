package org.jbpm.designer.ucd;

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
        property.setLower(0);
        property.setUpper(1);
        addShapeToCompartment(class1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), property);
        Property property2 = class1.getOwnedAttribute("testProperty2", cmmnTypes.getOwnedType("String"), false, UMLPackage.eINSTANCE.getProperty(), true);
        property2.setLower(1);
        property2.setUpper(1);
        addShapeToCompartment(class1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), property2);
        Property property3 = class1.getOwnedAttribute("testProperty3", cmmnTypes.getOwnedType("String"), false, UMLPackage.eINSTANCE.getProperty(), true);
        property3.setLower(0);
        property3.setUpper(-1);
        addShapeToCompartment(class1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), property3);
        Property property4 = class1.getOwnedAttribute("testProperty4", cmmnTypes.getOwnedType("String"), false, UMLPackage.eINSTANCE.getProperty(), true);
        property4.setLower(1);
        property4.setUpper(-1);
        addShapeToCompartment(class1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), property4);
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
        property.setLower(1);
        property.setUpper(1);
        addShapeToCompartment(class1, UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute(), property);
        Class class2=UMLFactory.eINSTANCE.createClass();
        class2.setName("MyOtherClass");
        jbpmPackage.getOwnedTypes().add(class2);
        addShapeFor(class2);
        Association composition = UMLFactory.eINSTANCE.createAssociation();
        composition.setName("myAsso");
        composition.getMemberEnds().add(class2.getOwnedAttribute("myClass", class1, false, UMLPackage.eINSTANCE.getProperty(), true));
        composition.getMemberEnds().add(class1.getOwnedAttribute("myOtherClass", class2, false, UMLPackage.eINSTANCE.getProperty(), true));
        composition.getMemberEnds().get(1).setAggregation(AggregationKind.COMPOSITE_LITERAL);
        composition.getMemberEnds().get(1).setLower(0);
        composition.getMemberEnds().get(1).setUpper(-1);
        jbpmPackage.getOwnedTypes().add(composition);
        addEdge( composition, class1, class2);
        Class class3=UMLFactory.eINSTANCE.createClass();
        class3.setName("MyThirdClass");
        jbpmPackage.getOwnedTypes().add(class3);
        addShapeFor(class3);
        Association asso = UMLFactory.eINSTANCE.createAssociation();
        asso.setName("myAsso2");
        asso.getMemberEnds().add(class3.getOwnedAttribute("mySecondClass", class2, false, UMLPackage.eINSTANCE.getProperty(), true));
        asso.getMemberEnds().add(class2.getOwnedAttribute("myThirdClass", class3, false, UMLPackage.eINSTANCE.getProperty(), true));
        asso.getMemberEnds().get(0).setLower(0);
        asso.getMemberEnds().get(0).setUpper(-1);
        asso.getMemberEnds().get(1).setLower(0);
        asso.getMemberEnds().get(1).setUpper(-1);
        jbpmPackage.getOwnedTypes().add(asso);
        addEdge( asso, class2, class3);
        super.assertOutputValid();
    }
}
