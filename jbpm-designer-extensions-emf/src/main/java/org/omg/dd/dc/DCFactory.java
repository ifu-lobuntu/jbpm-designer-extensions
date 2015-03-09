/**
 */
package org.omg.dd.dc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.dd.dc.DCPackage
 * @generated
 */
public interface DCFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DCFactory eINSTANCE = org.omg.dd.dc.impl.DCFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Color</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Color</em>'.
     * @generated
     */
    Color createColor();

    /**
     * Returns a new object of class '<em>Dimension</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dimension</em>'.
     * @generated
     */
    Dimension createDimension();

    /**
     * Returns a new object of class '<em>Bounds</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bounds</em>'.
     * @generated
     */
    Bounds createBounds();

    /**
     * Returns a new object of class '<em>Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Point</em>'.
     * @generated
     */
    Point createPoint();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DCPackage getDCPackage();

} //DCFactory
