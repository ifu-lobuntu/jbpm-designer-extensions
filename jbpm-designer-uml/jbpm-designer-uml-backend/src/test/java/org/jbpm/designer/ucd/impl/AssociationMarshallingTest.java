package org.jbpm.designer.ucd.impl;

import static org.junit.Assert.fail;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;
public class AssociationMarshallingTest extends AbstractClassDiagramMarshallingTest {
    @Test
    public void testComposition() throws Exception{
        Class class1=UMLFactory.eINSTANCE.createClass();
        class1.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class1);
        addShapeFor(class1);
        Class class2=UMLFactory.eINSTANCE.createClass();
        class2.setName("MyOtherClass");
        jbpmPackage.getOwnedTypes().add(class2);
        addShapeFor(class2);
        Association composition = UMLFactory.eINSTANCE.createAssociation();
        composition.setName("myAsso1");
        composition.getMemberEnds().add(class2.getOwnedAttribute("myClass", class1, false, UMLPackage.eINSTANCE.getProperty(), true));
        composition.getMemberEnds().add(class1.getOwnedAttribute("myOtherClass", class2, false, UMLPackage.eINSTANCE.getProperty(), true));
        composition.getMemberEnds().get(1).setAggregation(AggregationKind.COMPOSITE_LITERAL);
        composition.getMemberEnds().get(1).setLower(0);
        composition.getMemberEnds().get(1).setUpper(-1);
       jbpmPackage.getOwnedTypes().add(composition);
        addEdge( composition, class1, class2);
        super.assertOutputValid();
    }
    @Test
    public void testBidiAssociations() throws Exception{
        Class class2=UMLFactory.eINSTANCE.createClass();
        class2.setName("MyOtherClass");
        jbpmPackage.getOwnedTypes().add(class2);
        addShapeFor(class2);
        Class class3=UMLFactory.eINSTANCE.createClass();
        class3.setName("MyThirdClass");
        jbpmPackage.getOwnedTypes().add(class3);
        addShapeFor(class3);
        Association bidirectionalAssociation = UMLFactory.eINSTANCE.createAssociation();
        bidirectionalAssociation.setName("myAsso2");
        bidirectionalAssociation.getMemberEnds().add(class3.getOwnedAttribute("mySecondClass", class2, false, UMLPackage.eINSTANCE.getProperty(), true));
        bidirectionalAssociation.getMemberEnds().add(class2.getOwnedAttribute("myThirdClass", class3, false, UMLPackage.eINSTANCE.getProperty(), true));
        bidirectionalAssociation.getMemberEnds().get(1).setUpper(-1);
        bidirectionalAssociation.getMemberEnds().get(0).setUpper(-1);
        bidirectionalAssociation.getMemberEnds().get(1).setLower(1);
        bidirectionalAssociation.getMemberEnds().get(0).setLower(0);
        jbpmPackage.getOwnedTypes().add(bidirectionalAssociation);
        addEdge( bidirectionalAssociation, class2, class3);
        super.assertOutputValid();
    }
    @Test
    public void testDirectedAssociations() throws Exception{
        Class class1=UMLFactory.eINSTANCE.createClass();
        class1.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class1);
        addShapeFor(class1);
        Class class3=UMLFactory.eINSTANCE.createClass();
        class3.setName("MyThirdClass");
        jbpmPackage.getOwnedTypes().add(class3);
        addShapeFor(class3);
        Association directedlAssociation = UMLFactory.eINSTANCE.createAssociation();
        directedlAssociation.setName("myAsso3");
        directedlAssociation.getOwnedEnd("myThirdClass", class3, false, UMLPackage.eINSTANCE.getProperty(), true).setIsNavigable(false);
        directedlAssociation.getMemberEnds().add(class3.getOwnedAttribute("myFirstClass", class1, false, UMLPackage.eINSTANCE.getProperty(), true));
        directedlAssociation.getMemberEnds().get(1).setUpper(-1);
        directedlAssociation.getMemberEnds().get(1).setLower(0);
        jbpmPackage.getOwnedTypes().add(directedlAssociation);
        addEdge( directedlAssociation, class3,class1);
        super.assertOutputValid();
    }
    @Test
    public void testInvalidComposition() throws Exception{
        Class class1=UMLFactory.eINSTANCE.createClass();
        class1.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class1);
        addShapeFor(class1);
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
        asso.getMemberEnds().add(class2.getOwnedAttribute("myThirdClass", class3, false, UMLPackage.eINSTANCE.getProperty(), true));
        asso.getMemberEnds().add(class3.getOwnedAttribute("mySecondClass", class2, false, UMLPackage.eINSTANCE.getProperty(), true));
        asso.getMemberEnds().get(1).setAggregation(AggregationKind.COMPOSITE_LITERAL);
        jbpmPackage.getOwnedTypes().add(asso);
        addEdge( asso, class3, class2);
        try {
            super.assertOutputValid();
            fail("Should have failed because of multiple parent composition");
        } catch (IllegalStateException e) {

        }
    }
}
