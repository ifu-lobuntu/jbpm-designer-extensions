package org.jbpm.designer.ucd.impl;

import static org.junit.Assert.fail;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.server.service.AssetHelper;
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
