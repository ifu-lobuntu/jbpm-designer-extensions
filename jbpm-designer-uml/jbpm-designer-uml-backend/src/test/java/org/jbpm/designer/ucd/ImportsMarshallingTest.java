package org.jbpm.designer.ucd;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.Test;

public class ImportsMarshallingTest extends AbstractClassDiagramMarshallingTest {
    @Test
    public void testClassImport() throws Exception {
        Package pkg = (Package) resourceSet.getResource(URI.createPlatformResourceURI("/jbpm-designer-ucd-backend/src/test/resources/imports.uml", true), true)
                .getContents().get(0);
        Class myClass = (Class) jbpmPackage.getOwnedType("MyClass", false, UMLPackage.eINSTANCE.getClass_(), true);
        addShapeFor(myClass);
        Classifier importedClass = (Classifier) pkg.getOwnedType("ImportedClass");
        addShapeFor(importedClass);
        addEdge(myClass.getGeneralization(importedClass, true),myClass, importedClass);
        assertOutputValid();
    }
    @Test
    public void testInterfaceImport() throws Exception {
        Package pkg = (Package) resourceSet.getResource(URI.createPlatformResourceURI("/jbpm-designer-ucd-backend/src/test/resources/imports.uml", true), true)
                .getContents().get(0);
        Class myClass = (Class) jbpmPackage.getOwnedType("MyClass", false, UMLPackage.eINSTANCE.getClass_(), true);
        addShapeFor(myClass);
        Interface importedClass = (Interface) pkg.getOwnedType("ImportedInterface");
        addShapeFor(importedClass);
        InterfaceRealization ir = UMLFactory.eINSTANCE.createInterfaceRealization();
        ir.setContract(importedClass);
        ir.setImplementingClassifier(myClass);
        addEdge(ir,myClass, importedClass);
        assertOutputValid();
    }
    @Test
    public void testAssociationToEnumeration() throws Exception{
        Package pkg = (Package) resourceSet.getResource(URI.createPlatformResourceURI("/jbpm-designer-ucd-backend/src/test/resources/imports.uml", true), true)
                .getContents().get(0);
        Class class1=UMLFactory.eINSTANCE.createClass();
        class1.setName("MyClass");
        jbpmPackage.getOwnedTypes().add(class1);
        addShapeFor(class1);
        Classifier importedClass = (Classifier) pkg.getOwnedType("ImportedEnumeration");
        addShapeFor(importedClass);
        Association directedlAssociation = UMLFactory.eINSTANCE.createAssociation();
        directedlAssociation.setName("myAsso3");
        directedlAssociation.getOwnedEnd("myClass", class1, false, UMLPackage.eINSTANCE.getProperty(), true).setIsNavigable(false);
        directedlAssociation.getMemberEnds().add(class1.getOwnedAttribute("myEnumeration", importedClass, false, UMLPackage.eINSTANCE.getProperty(), true));
        directedlAssociation.getMemberEnds().get(1).setLower(0);
        directedlAssociation.getMemberEnds().get(1).setUpper(1);
        jbpmPackage.getOwnedTypes().add(directedlAssociation);
        addEdge( directedlAssociation, class1,importedClass);
        super.assertOutputValid();
    }

}
