package org.jbpm.designer.ucd;

import static org.junit.Assert.fail;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.Test;
public class GeneralizationMarshallingTest extends AbstractClassDiagramMarshallingTest {
    @Test
    public void testInvalidGeneralizationToInterface() throws Exception{
        Interface intf=UMLFactory.eINSTANCE.createInterface();
        intf.setName("MyInterface");
        jbpmPackage.getOwnedTypes().add(intf);
        addShapeFor(intf);
        Class class2=UMLFactory.eINSTANCE.createClass();
        class2.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class2);
        addShapeFor(class2);
        Generalization rel = UMLFactory.eINSTANCE.createGeneralization();
        class2.getGeneralizations().add(rel);
        rel.setGeneral(intf);
        addEdge( rel, class2, intf);
        try{
            super.assertOutputValid();
            fail("Should have failed");
        }catch(IllegalStateException e){

        }
    }
    @Test
    public void testGeneralization() throws Exception{
        Class class1=UMLFactory.eINSTANCE.createClass();
        class1.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class1);
        addShapeFor(class1);
        Class class2=UMLFactory.eINSTANCE.createClass();
        class2.setName("MyOtherClass");
        jbpmPackage.getOwnedTypes().add(class2);
        addShapeFor(class2);
        Generalization gen = UMLFactory.eINSTANCE.createGeneralization();
        class2.getGeneralizations().add(gen);
        gen.setGeneral(class1);
        addEdge( gen, class2, class1);
        super.assertOutputValid();
    }
    @Test
    public void testInvalidGeneralization() throws Exception{
        Class class1=UMLFactory.eINSTANCE.createClass();
        class1.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class1);
        addShapeFor(class1);
        Class class2=UMLFactory.eINSTANCE.createClass();
        class2.setName("MyOtherClass");
        jbpmPackage.getOwnedTypes().add(class2);
        addShapeFor(class2);
        Generalization gen = UMLFactory.eINSTANCE.createGeneralization();
        class2.getGeneralizations().add(gen);
        gen.setGeneral(class1);
        addEdge( gen, class2, class1);
        Class class3=UMLFactory.eINSTANCE.createClass();
        class3.setName("MyThirdClass");
        jbpmPackage.getOwnedTypes().add(class3);
        addShapeFor(class3);
        Generalization gen2 = UMLFactory.eINSTANCE.createGeneralization();
        class2.getGeneralizations().add(gen2);
        gen2.setGeneral(class3);
        addEdge( gen2, class2, class3);
        try {
            super.assertOutputValid();
            fail("Should have failed because of multiple inheritance");
        } catch (IllegalStateException e) {

        }
    }
}
