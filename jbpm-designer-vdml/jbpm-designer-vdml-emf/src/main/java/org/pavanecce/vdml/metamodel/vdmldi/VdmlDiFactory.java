/**
 */
package org.pavanecce.vdml.metamodel.vdmldi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage
 * @generated
 */
public interface VdmlDiFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VdmlDiFactory eINSTANCE = org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiFactoryImpl.init();

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
     * Returns a new object of class '<em>VDML Label</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VDML Label</em>'.
     * @generated
     */
    VDMLLabel createVDMLLabel();

    /**
     * Returns a new object of class '<em>VDML Label Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VDML Label Style</em>'.
     * @generated
     */
    VDMLLabelStyle createVDMLLabelStyle();

    /**
     * Returns a new object of class '<em>VDML Plane</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VDML Plane</em>'.
     * @generated
     */
    VDMLPlane createVDMLPlane();

    /**
     * Returns a new object of class '<em>VDML Shape</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VDML Shape</em>'.
     * @generated
     */
    VDMLShape createVDMLShape();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    VdmlDiPackage getVdmlDiPackage();

} //VdmlDiFactory
