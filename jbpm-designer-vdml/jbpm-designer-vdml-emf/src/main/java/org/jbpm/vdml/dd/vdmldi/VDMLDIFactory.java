/**
 */
package org.jbpm.vdml.dd.vdmldi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage
 * @generated
 */
public interface VDMLDIFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VDMLDIFactory eINSTANCE = org.jbpm.vdml.dd.vdmldi.impl.VDMLDIFactoryImpl.init();

    /**
     * Returns a new object of class '<em>VDML Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VDML Diagram</em>'.
     * @generated
     */
    VDMLDiagram createVDMLDiagram();

    /**
     * Returns a new object of class '<em>VDML Edge</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VDML Edge</em>'.
     * @generated
     */
    VDMLEdge createVDMLEdge();

    /**
     * Returns a new object of class '<em>VDML Shape</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VDML Shape</em>'.
     * @generated
     */
    VDMLShape createVDMLShape();

    /**
     * Returns a new object of class '<em>VDML Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VDML Style</em>'.
     * @generated
     */
    VDMLStyle createVDMLStyle();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    VDMLDIPackage getVDMLDIPackage();

} //VDMLDIFactory
