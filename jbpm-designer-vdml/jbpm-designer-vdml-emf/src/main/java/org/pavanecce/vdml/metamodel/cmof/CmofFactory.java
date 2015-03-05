/**
 */
package org.pavanecce.vdml.metamodel.cmof;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.cmof.CmofPackage
 * @generated
 */
public interface CmofFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CmofFactory eINSTANCE = org.pavanecce.vdml.metamodel.cmof.impl.CmofFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Element</em>'.
     * @generated
     */
    Element createElement();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CmofPackage getCmofPackage();

} //CmofFactory
