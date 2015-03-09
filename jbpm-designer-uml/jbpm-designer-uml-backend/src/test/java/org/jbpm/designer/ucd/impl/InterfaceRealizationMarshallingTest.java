package org.jbpm.designer.ucd.impl;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.Test;
public class InterfaceRealizationMarshallingTest extends AbstractClassDiagramMarshallingTest {
    @Test
    public void testRealization() throws Exception{
        Interface intf=UMLFactory.eINSTANCE.createInterface();
        intf.setName("MyInterface");
        jbpmPackage.getOwnedTypes().add(intf);
        addShapeFor(intf);
        Class class2=UMLFactory.eINSTANCE.createClass();
        class2.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class2);
        addShapeFor(class2);
        InterfaceRealization rel = UMLFactory.eINSTANCE.createInterfaceRealization();
        class2.getInterfaceRealizations().add(rel);
        rel.setContract(intf);
        addEdge( rel, class2, intf);
        super.assertOutputValid();
    }
}
