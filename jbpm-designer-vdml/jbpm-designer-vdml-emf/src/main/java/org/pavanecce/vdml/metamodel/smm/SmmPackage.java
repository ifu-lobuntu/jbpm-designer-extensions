/**
 */
package org.pavanecce.vdml.metamodel.smm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.smm.SmmFactory
 * @model kind="package"
 * @generated
 */
public interface SmmPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "smm";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/SMM/20131201/SMM.cmof";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "smm";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SmmPackage eINSTANCE = org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl.init();

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.smm.impl.AbstractMeasureElementImpl <em>Abstract Measure Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.smm.impl.AbstractMeasureElementImpl
     * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getAbstractMeasureElement()
     * @generated
     */
    int ABSTRACT_MEASURE_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Library</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MEASURE_ELEMENT__LIBRARY = 0;

    /**
     * The number of structural features of the '<em>Abstract Measure Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Abstract Measure Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_MEASURE_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.smm.impl.CharacteristicImpl <em>Characteristic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.smm.impl.CharacteristicImpl
     * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getCharacteristic()
     * @generated
     */
    int CHARACTERISTIC = 0;

    /**
     * The feature id for the '<em><b>Library</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERISTIC__LIBRARY = ABSTRACT_MEASURE_ELEMENT__LIBRARY;

    /**
     * The feature id for the '<em><b>Measure</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERISTIC__MEASURE = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Characteristic</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERISTIC_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Characteristic</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTERISTIC_OPERATION_COUNT = ABSTRACT_MEASURE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.smm.impl.MeasureLibraryImpl <em>Measure Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.smm.impl.MeasureLibraryImpl
     * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getMeasureLibrary()
     * @generated
     */
    int MEASURE_LIBRARY = 2;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE_LIBRARY__MODEL = 0;

    /**
     * The feature id for the '<em><b>Measure Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE_LIBRARY__MEASURE_ELEMENT = 1;

    /**
     * The number of structural features of the '<em>Measure Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE_LIBRARY_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Measure Library</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE_LIBRARY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.smm.impl.MeasureImpl <em>Measure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.smm.impl.MeasureImpl
     * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getMeasure()
     * @generated
     */
    int MEASURE = 3;

    /**
     * The feature id for the '<em><b>Library</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE__LIBRARY = ABSTRACT_MEASURE_ELEMENT__LIBRARY;

    /**
     * The feature id for the '<em><b>Observed Measure</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE__OBSERVED_MEASURE = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Trait</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE__TRAIT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Measure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Measure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURE_OPERATION_COUNT = ABSTRACT_MEASURE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.smm.impl.ObservedMeasureImpl <em>Observed Measure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.smm.impl.ObservedMeasureImpl
     * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getObservedMeasure()
     * @generated
     */
    int OBSERVED_MEASURE = 4;

    /**
     * The feature id for the '<em><b>Observation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBSERVED_MEASURE__OBSERVATION = 0;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBSERVED_MEASURE__MEASUREMENT = 1;

    /**
     * The feature id for the '<em><b>Measure</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBSERVED_MEASURE__MEASURE = 2;

    /**
     * The number of structural features of the '<em>Observed Measure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBSERVED_MEASURE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Observed Measure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBSERVED_MEASURE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.smm.impl.ObservationImpl <em>Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.smm.impl.ObservationImpl
     * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getObservation()
     * @generated
     */
    int OBSERVATION = 5;

    /**
     * The feature id for the '<em><b>Smm Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBSERVATION__SMM_MODEL = 0;

    /**
     * The feature id for the '<em><b>Observed Measure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBSERVATION__OBSERVED_MEASURE = 1;

    /**
     * The number of structural features of the '<em>Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBSERVATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBSERVATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.smm.impl.MeasurementImpl <em>Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.smm.impl.MeasurementImpl
     * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getMeasurement()
     * @generated
     */
    int MEASUREMENT = 6;

    /**
     * The feature id for the '<em><b>Observed Measure</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASUREMENT__OBSERVED_MEASURE = 0;

    /**
     * The number of structural features of the '<em>Measurement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASUREMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Measurement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASUREMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.smm.impl.SmmModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.smm.impl.SmmModelImpl
     * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getSmmModel()
     * @generated
     */
    int SMM_MODEL = 7;

    /**
     * The feature id for the '<em><b>Library</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_MODEL__LIBRARY = 0;

    /**
     * The feature id for the '<em><b>Observation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_MODEL__OBSERVATION = 1;

    /**
     * The number of structural features of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_MODEL_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMM_MODEL_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.smm.Characteristic <em>Characteristic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Characteristic</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.Characteristic
     * @generated
     */
    EClass getCharacteristic();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.smm.Characteristic#getMeasure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Measure</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.Characteristic#getMeasure()
     * @see #getCharacteristic()
     * @generated
     */
    EReference getCharacteristic_Measure();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement <em>Abstract Measure Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Measure Element</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement
     * @generated
     */
    EClass getAbstractMeasureElement();

    /**
     * Returns the meta object for the container reference '{@link org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement#getLibrary <em>Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Library</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement#getLibrary()
     * @see #getAbstractMeasureElement()
     * @generated
     */
    EReference getAbstractMeasureElement_Library();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.smm.MeasureLibrary <em>Measure Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Measure Library</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.MeasureLibrary
     * @generated
     */
    EClass getMeasureLibrary();

    /**
     * Returns the meta object for the container reference '{@link org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getModel()
     * @see #getMeasureLibrary()
     * @generated
     */
    EReference getMeasureLibrary_Model();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getMeasureElement <em>Measure Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Measure Element</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.MeasureLibrary#getMeasureElement()
     * @see #getMeasureLibrary()
     * @generated
     */
    EReference getMeasureLibrary_MeasureElement();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.smm.Measure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Measure</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.Measure
     * @generated
     */
    EClass getMeasure();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.smm.Measure#getObservedMeasure <em>Observed Measure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Observed Measure</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.Measure#getObservedMeasure()
     * @see #getMeasure()
     * @generated
     */
    EReference getMeasure_ObservedMeasure();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.smm.Measure#getTrait <em>Trait</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Trait</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.Measure#getTrait()
     * @see #getMeasure()
     * @generated
     */
    EReference getMeasure_Trait();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure <em>Observed Measure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Observed Measure</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.ObservedMeasure
     * @generated
     */
    EClass getObservedMeasure();

    /**
     * Returns the meta object for the container reference '{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getObservation <em>Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Observation</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getObservation()
     * @see #getObservedMeasure()
     * @generated
     */
    EReference getObservedMeasure_Observation();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasurement <em>Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Measurement</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasurement()
     * @see #getObservedMeasure()
     * @generated
     */
    EReference getObservedMeasure_Measurement();

    /**
     * Returns the meta object for the reference '{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Measure</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasure()
     * @see #getObservedMeasure()
     * @generated
     */
    EReference getObservedMeasure_Measure();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.smm.Observation <em>Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Observation</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.Observation
     * @generated
     */
    EClass getObservation();

    /**
     * Returns the meta object for the container reference '{@link org.pavanecce.vdml.metamodel.smm.Observation#getSmmModel <em>Smm Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Smm Model</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.Observation#getSmmModel()
     * @see #getObservation()
     * @generated
     */
    EReference getObservation_SmmModel();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.smm.Observation#getObservedMeasure <em>Observed Measure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Observed Measure</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.Observation#getObservedMeasure()
     * @see #getObservation()
     * @generated
     */
    EReference getObservation_ObservedMeasure();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.smm.Measurement <em>Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Measurement</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.Measurement
     * @generated
     */
    EClass getMeasurement();

    /**
     * Returns the meta object for the container reference '{@link org.pavanecce.vdml.metamodel.smm.Measurement#getObservedMeasure <em>Observed Measure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Observed Measure</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.Measurement#getObservedMeasure()
     * @see #getMeasurement()
     * @generated
     */
    EReference getMeasurement_ObservedMeasure();

    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.smm.SmmModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.SmmModel
     * @generated
     */
    EClass getSmmModel();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.smm.SmmModel#getLibrary <em>Library</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Library</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.SmmModel#getLibrary()
     * @see #getSmmModel()
     * @generated
     */
    EReference getSmmModel_Library();

    /**
     * Returns the meta object for the containment reference list '{@link org.pavanecce.vdml.metamodel.smm.SmmModel#getObservation <em>Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Observation</em>'.
     * @see org.pavanecce.vdml.metamodel.smm.SmmModel#getObservation()
     * @see #getSmmModel()
     * @generated
     */
    EReference getSmmModel_Observation();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SmmFactory getSmmFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.smm.impl.CharacteristicImpl <em>Characteristic</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.smm.impl.CharacteristicImpl
         * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getCharacteristic()
         * @generated
         */
        EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

        /**
         * The meta object literal for the '<em><b>Measure</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHARACTERISTIC__MEASURE = eINSTANCE.getCharacteristic_Measure();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.smm.impl.AbstractMeasureElementImpl <em>Abstract Measure Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.smm.impl.AbstractMeasureElementImpl
         * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getAbstractMeasureElement()
         * @generated
         */
        EClass ABSTRACT_MEASURE_ELEMENT = eINSTANCE.getAbstractMeasureElement();

        /**
         * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_MEASURE_ELEMENT__LIBRARY = eINSTANCE.getAbstractMeasureElement_Library();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.smm.impl.MeasureLibraryImpl <em>Measure Library</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.smm.impl.MeasureLibraryImpl
         * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getMeasureLibrary()
         * @generated
         */
        EClass MEASURE_LIBRARY = eINSTANCE.getMeasureLibrary();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEASURE_LIBRARY__MODEL = eINSTANCE.getMeasureLibrary_Model();

        /**
         * The meta object literal for the '<em><b>Measure Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEASURE_LIBRARY__MEASURE_ELEMENT = eINSTANCE.getMeasureLibrary_MeasureElement();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.smm.impl.MeasureImpl <em>Measure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.smm.impl.MeasureImpl
         * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getMeasure()
         * @generated
         */
        EClass MEASURE = eINSTANCE.getMeasure();

        /**
         * The meta object literal for the '<em><b>Observed Measure</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEASURE__OBSERVED_MEASURE = eINSTANCE.getMeasure_ObservedMeasure();

        /**
         * The meta object literal for the '<em><b>Trait</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEASURE__TRAIT = eINSTANCE.getMeasure_Trait();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.smm.impl.ObservedMeasureImpl <em>Observed Measure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.smm.impl.ObservedMeasureImpl
         * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getObservedMeasure()
         * @generated
         */
        EClass OBSERVED_MEASURE = eINSTANCE.getObservedMeasure();

        /**
         * The meta object literal for the '<em><b>Observation</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OBSERVED_MEASURE__OBSERVATION = eINSTANCE.getObservedMeasure_Observation();

        /**
         * The meta object literal for the '<em><b>Measurement</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OBSERVED_MEASURE__MEASUREMENT = eINSTANCE.getObservedMeasure_Measurement();

        /**
         * The meta object literal for the '<em><b>Measure</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OBSERVED_MEASURE__MEASURE = eINSTANCE.getObservedMeasure_Measure();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.smm.impl.ObservationImpl <em>Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.smm.impl.ObservationImpl
         * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getObservation()
         * @generated
         */
        EClass OBSERVATION = eINSTANCE.getObservation();

        /**
         * The meta object literal for the '<em><b>Smm Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OBSERVATION__SMM_MODEL = eINSTANCE.getObservation_SmmModel();

        /**
         * The meta object literal for the '<em><b>Observed Measure</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OBSERVATION__OBSERVED_MEASURE = eINSTANCE.getObservation_ObservedMeasure();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.smm.impl.MeasurementImpl <em>Measurement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.smm.impl.MeasurementImpl
         * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getMeasurement()
         * @generated
         */
        EClass MEASUREMENT = eINSTANCE.getMeasurement();

        /**
         * The meta object literal for the '<em><b>Observed Measure</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEASUREMENT__OBSERVED_MEASURE = eINSTANCE.getMeasurement_ObservedMeasure();

        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.smm.impl.SmmModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.smm.impl.SmmModelImpl
         * @see org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl#getSmmModel()
         * @generated
         */
        EClass SMM_MODEL = eINSTANCE.getSmmModel();

        /**
         * The meta object literal for the '<em><b>Library</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SMM_MODEL__LIBRARY = eINSTANCE.getSmmModel_Library();

        /**
         * The meta object literal for the '<em><b>Observation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SMM_MODEL__OBSERVATION = eINSTANCE.getSmmModel_Observation();

    }

} //SmmPackage
