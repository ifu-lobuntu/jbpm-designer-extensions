/**
 */
package org.pavanecce.vdml.metamodel.smm.impl;

import org.eclipse.dd.cmmn.dc.DcPackage;
import org.eclipse.dd.cmmn.dc.impl.DcPackageImpl;
import org.eclipse.dd.cmmn.di.DiPackage;
import org.eclipse.dd.cmmn.di.impl.DiPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pavanecce.vdml.metamodel.cmof.CmofPackage;
import org.pavanecce.vdml.metamodel.cmof.impl.CmofPackageImpl;
import org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement;
import org.pavanecce.vdml.metamodel.smm.Characteristic;
import org.pavanecce.vdml.metamodel.smm.Measure;
import org.pavanecce.vdml.metamodel.smm.MeasureLibrary;
import org.pavanecce.vdml.metamodel.smm.Measurement;
import org.pavanecce.vdml.metamodel.smm.Observation;
import org.pavanecce.vdml.metamodel.smm.ObservedMeasure;
import org.pavanecce.vdml.metamodel.smm.SmmFactory;
import org.pavanecce.vdml.metamodel.smm.SmmModel;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;
import org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;
import org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmmPackageImpl extends EPackageImpl implements SmmPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass characteristicEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractMeasureElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass measureLibraryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass measureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass observedMeasureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass observationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass measurementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smmModelEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SmmPackageImpl() {
        super(eNS_URI, SmmFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link SmmPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SmmPackage init() {
        if (isInited) return (SmmPackage)EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI);

        // Obtain or create and register package
        SmmPackageImpl theSmmPackage = (SmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmmPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        VdmlPackageImpl theVdmlPackage = (VdmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VdmlPackage.eNS_URI) instanceof VdmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VdmlPackage.eNS_URI) : VdmlPackage.eINSTANCE);
        CmofPackageImpl theCmofPackage = (CmofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CmofPackage.eNS_URI) instanceof CmofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CmofPackage.eNS_URI) : CmofPackage.eINSTANCE);
        DcPackageImpl theDcPackage = (DcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DcPackage.eNS_URI) instanceof DcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DcPackage.eNS_URI) : DcPackage.eINSTANCE);
        DiPackageImpl theDiPackage = (DiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DiPackage.eNS_URI) instanceof DiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DiPackage.eNS_URI) : DiPackage.eINSTANCE);
        VdmlDiPackageImpl theVdmlDiPackage = (VdmlDiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VdmlDiPackage.eNS_URI) instanceof VdmlDiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VdmlDiPackage.eNS_URI) : VdmlDiPackage.eINSTANCE);

        // Create package meta-data objects
        theSmmPackage.createPackageContents();
        theVdmlPackage.createPackageContents();
        theCmofPackage.createPackageContents();
        theDcPackage.createPackageContents();
        theDiPackage.createPackageContents();
        theVdmlDiPackage.createPackageContents();

        // Initialize created meta-data
        theSmmPackage.initializePackageContents();
        theVdmlPackage.initializePackageContents();
        theCmofPackage.initializePackageContents();
        theDcPackage.initializePackageContents();
        theDiPackage.initializePackageContents();
        theVdmlDiPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSmmPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SmmPackage.eNS_URI, theSmmPackage);
        return theSmmPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCharacteristic() {
        return characteristicEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacteristic_Measure() {
        return (EReference)characteristicEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractMeasureElement() {
        return abstractMeasureElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractMeasureElement_Library() {
        return (EReference)abstractMeasureElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMeasureLibrary() {
        return measureLibraryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMeasureLibrary_Model() {
        return (EReference)measureLibraryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMeasureLibrary_MeasureElement() {
        return (EReference)measureLibraryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMeasure() {
        return measureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMeasure_ObservedMeasure() {
        return (EReference)measureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMeasure_Trait() {
        return (EReference)measureEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getObservedMeasure() {
        return observedMeasureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getObservedMeasure_Observation() {
        return (EReference)observedMeasureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getObservedMeasure_Measurement() {
        return (EReference)observedMeasureEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getObservedMeasure_Measure() {
        return (EReference)observedMeasureEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getObservation() {
        return observationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getObservation_SmmModel() {
        return (EReference)observationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getObservation_ObservedMeasure() {
        return (EReference)observationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMeasurement() {
        return measurementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMeasurement_ObservedMeasure() {
        return (EReference)measurementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSmmModel() {
        return smmModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSmmModel_Library() {
        return (EReference)smmModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSmmModel_Observation() {
        return (EReference)smmModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmFactory getSmmFactory() {
        return (SmmFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        characteristicEClass = createEClass(CHARACTERISTIC);
        createEReference(characteristicEClass, CHARACTERISTIC__MEASURE);

        abstractMeasureElementEClass = createEClass(ABSTRACT_MEASURE_ELEMENT);
        createEReference(abstractMeasureElementEClass, ABSTRACT_MEASURE_ELEMENT__LIBRARY);

        measureLibraryEClass = createEClass(MEASURE_LIBRARY);
        createEReference(measureLibraryEClass, MEASURE_LIBRARY__MODEL);
        createEReference(measureLibraryEClass, MEASURE_LIBRARY__MEASURE_ELEMENT);

        measureEClass = createEClass(MEASURE);
        createEReference(measureEClass, MEASURE__OBSERVED_MEASURE);
        createEReference(measureEClass, MEASURE__TRAIT);

        observedMeasureEClass = createEClass(OBSERVED_MEASURE);
        createEReference(observedMeasureEClass, OBSERVED_MEASURE__OBSERVATION);
        createEReference(observedMeasureEClass, OBSERVED_MEASURE__MEASUREMENT);
        createEReference(observedMeasureEClass, OBSERVED_MEASURE__MEASURE);

        observationEClass = createEClass(OBSERVATION);
        createEReference(observationEClass, OBSERVATION__SMM_MODEL);
        createEReference(observationEClass, OBSERVATION__OBSERVED_MEASURE);

        measurementEClass = createEClass(MEASUREMENT);
        createEReference(measurementEClass, MEASUREMENT__OBSERVED_MEASURE);

        smmModelEClass = createEClass(SMM_MODEL);
        createEReference(smmModelEClass, SMM_MODEL__LIBRARY);
        createEReference(smmModelEClass, SMM_MODEL__OBSERVATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        characteristicEClass.getESuperTypes().add(this.getAbstractMeasureElement());
        measureEClass.getESuperTypes().add(this.getAbstractMeasureElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(characteristicEClass, Characteristic.class, "Characteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCharacteristic_Measure(), this.getMeasure(), this.getMeasure_Trait(), "measure", null, 0, -1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(abstractMeasureElementEClass, AbstractMeasureElement.class, "AbstractMeasureElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractMeasureElement_Library(), this.getMeasureLibrary(), this.getMeasureLibrary_MeasureElement(), "library", null, 1, 1, AbstractMeasureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(measureLibraryEClass, MeasureLibrary.class, "MeasureLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMeasureLibrary_Model(), this.getSmmModel(), this.getSmmModel_Library(), "model", null, 1, 1, MeasureLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getMeasureLibrary_MeasureElement(), this.getAbstractMeasureElement(), this.getAbstractMeasureElement_Library(), "measureElement", null, 0, -1, MeasureLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(measureEClass, Measure.class, "Measure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMeasure_ObservedMeasure(), this.getObservedMeasure(), this.getObservedMeasure_Measure(), "observedMeasure", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getMeasure_Trait(), this.getCharacteristic(), this.getCharacteristic_Measure(), "trait", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(observedMeasureEClass, ObservedMeasure.class, "ObservedMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getObservedMeasure_Observation(), this.getObservation(), this.getObservation_ObservedMeasure(), "observation", null, 1, 1, ObservedMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getObservedMeasure_Measurement(), this.getMeasurement(), this.getMeasurement_ObservedMeasure(), "measurement", null, 0, -1, ObservedMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getObservedMeasure_Measure(), this.getMeasure(), this.getMeasure_ObservedMeasure(), "measure", null, 1, 1, ObservedMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(observationEClass, Observation.class, "Observation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getObservation_SmmModel(), this.getSmmModel(), this.getSmmModel_Observation(), "smmModel", null, 1, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getObservation_ObservedMeasure(), this.getObservedMeasure(), this.getObservedMeasure_Observation(), "observedMeasure", null, 0, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(measurementEClass, Measurement.class, "Measurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMeasurement_ObservedMeasure(), this.getObservedMeasure(), this.getObservedMeasure_Measurement(), "observedMeasure", null, 1, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(smmModelEClass, SmmModel.class, "SmmModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSmmModel_Library(), this.getMeasureLibrary(), this.getMeasureLibrary_Model(), "library", null, 0, -1, SmmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getSmmModel_Observation(), this.getObservation(), this.getObservation_SmmModel(), "observation", null, 0, -1, SmmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //SmmPackageImpl
