/**
 */
package org.jbpm.uml2.dd.umldi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jbpm.uml2.dd.umldi.UMLDIPackage
 * @generated
 */
public interface UMLDIFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UMLDIFactory eINSTANCE = org.jbpm.uml2.dd.umldi.impl.UMLDIFactoryImpl.init();

    /**
     * Returns a new object of class '<em>UML Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>UML Diagram</em>'.
     * @generated
     */
    UMLDiagram createUMLDiagram();

    /**
     * Returns a new object of class '<em>UML Edge</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>UML Edge</em>'.
     * @generated
     */
    UMLEdge createUMLEdge();

    /**
     * Returns a new object of class '<em>UML Shape</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>UML Shape</em>'.
     * @generated
     */
    UMLShape createUMLShape();

    /**
     * Returns a new object of class '<em>UML Compartment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>UML Compartment</em>'.
     * @generated
     */
    UMLCompartment createUMLCompartment();

    /**
     * Returns a new object of class '<em>UML Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>UML Style</em>'.
     * @generated
     */
    UMLStyle createUMLStyle();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    UMLDIPackage getUMLDIPackage();

} //UMLDIFactory
