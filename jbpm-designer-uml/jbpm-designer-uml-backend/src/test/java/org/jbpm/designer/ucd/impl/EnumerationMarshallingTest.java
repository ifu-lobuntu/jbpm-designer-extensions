package org.jbpm.designer.ucd.impl;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

public class EnumerationMarshallingTest extends AbstractClassDiagramMarshallingTest {
    @Test
    public void testEnumeration() throws Exception {
        Enumeration class1 = UMLFactory.eINSTANCE.createEnumeration();
        class1.setName("MyEnumeratoin");
        jbpmPackage.getOwnedTypes().add(class1);
        addShapeFor(class1);
        addCompartmentFor(class1, UMLPackage.eINSTANCE.getEnumeration_OwnedLiteral());
        EnumerationLiteral lit = class1.getOwnedLiteral("lit1", true, true);
        addShapeToCompartment(class1, UMLPackage.eINSTANCE.getEnumeration_OwnedLiteral(), lit);
        EnumerationLiteral lit2 = class1.getOwnedLiteral("lit2", true, true);
        addShapeToCompartment(class1, UMLPackage.eINSTANCE.getEnumeration_OwnedLiteral(), lit2);
        super.assertOutputValid();
    }
}
