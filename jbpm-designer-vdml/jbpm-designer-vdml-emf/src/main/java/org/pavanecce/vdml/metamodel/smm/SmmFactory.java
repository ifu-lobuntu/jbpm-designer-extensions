/**
 */
package org.pavanecce.vdml.metamodel.smm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage
 * @generated
 */
public interface SmmFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SmmFactory eINSTANCE = org.pavanecce.vdml.metamodel.smm.impl.SmmFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Characteristic</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Characteristic</em>'.
     * @generated
     */
    Characteristic createCharacteristic();

    /**
     * Returns a new object of class '<em>Measure Library</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measure Library</em>'.
     * @generated
     */
    MeasureLibrary createMeasureLibrary();

    /**
     * Returns a new object of class '<em>Observed Measure</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Observed Measure</em>'.
     * @generated
     */
    ObservedMeasure createObservedMeasure();

    /**
     * Returns a new object of class '<em>Observation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Observation</em>'.
     * @generated
     */
    Observation createObservation();

    /**
     * Returns a new object of class '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model</em>'.
     * @generated
     */
    SmmModel createSmmModel();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SmmPackage getSmmPackage();

} //SmmFactory
