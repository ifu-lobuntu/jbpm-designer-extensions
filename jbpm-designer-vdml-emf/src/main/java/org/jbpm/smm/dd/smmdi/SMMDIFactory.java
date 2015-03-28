/**
 */
package org.jbpm.smm.dd.smmdi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jbpm.smm.dd.smmdi.SMMDIPackage
 * @generated
 */
public interface SMMDIFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SMMDIFactory eINSTANCE = org.jbpm.smm.dd.smmdi.impl.SMMDIFactoryImpl.init();

    /**
     * Returns a new object of class '<em>SMM Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SMM Diagram</em>'.
     * @generated
     */
    SMMDiagram createSMMDiagram();

    /**
     * Returns a new object of class '<em>SMM Edge</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SMM Edge</em>'.
     * @generated
     */
    SMMEdge createSMMEdge();

    /**
     * Returns a new object of class '<em>SMM Shape</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SMM Shape</em>'.
     * @generated
     */
    SMMShape createSMMShape();

    /**
     * Returns a new object of class '<em>SMM Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SMM Style</em>'.
     * @generated
     */
    SMMStyle createSMMStyle();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SMMDIPackage getSMMDIPackage();

} //SMMDIFactory
