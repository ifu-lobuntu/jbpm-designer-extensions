/**
 */
package org.pavanecce.vdml.metamodel.smm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pavanecce.vdml.metamodel.smm.Characteristic;
import org.pavanecce.vdml.metamodel.smm.MeasureLibrary;
import org.pavanecce.vdml.metamodel.smm.Observation;
import org.pavanecce.vdml.metamodel.smm.ObservedMeasure;
import org.pavanecce.vdml.metamodel.smm.SmmFactory;
import org.pavanecce.vdml.metamodel.smm.SmmModel;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmmFactoryImpl extends EFactoryImpl implements SmmFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SmmFactory init() {
        try {
            SmmFactory theSmmFactory = (SmmFactory)EPackage.Registry.INSTANCE.getEFactory(SmmPackage.eNS_URI);
            if (theSmmFactory != null) {
                return theSmmFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SmmFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case SmmPackage.CHARACTERISTIC: return createCharacteristic();
            case SmmPackage.MEASURE_LIBRARY: return createMeasureLibrary();
            case SmmPackage.OBSERVED_MEASURE: return createObservedMeasure();
            case SmmPackage.OBSERVATION: return createObservation();
            case SmmPackage.SMM_MODEL: return createSmmModel();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Characteristic createCharacteristic() {
        CharacteristicImpl characteristic = new CharacteristicImpl();
        return characteristic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasureLibrary createMeasureLibrary() {
        MeasureLibraryImpl measureLibrary = new MeasureLibraryImpl();
        return measureLibrary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObservedMeasure createObservedMeasure() {
        ObservedMeasureImpl observedMeasure = new ObservedMeasureImpl();
        return observedMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Observation createObservation() {
        ObservationImpl observation = new ObservationImpl();
        return observation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmModel createSmmModel() {
        SmmModelImpl smmModel = new SmmModelImpl();
        return smmModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmPackage getSmmPackage() {
        return (SmmPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SmmPackage getPackage() {
        return SmmPackage.eINSTANCE;
    }

} //SmmFactoryImpl
