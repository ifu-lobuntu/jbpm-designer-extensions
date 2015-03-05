/**
 */
package org.pavanecce.vdml.metamodel.smm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement;
import org.pavanecce.vdml.metamodel.smm.Characteristic;
import org.pavanecce.vdml.metamodel.smm.Measure;
import org.pavanecce.vdml.metamodel.smm.MeasureLibrary;
import org.pavanecce.vdml.metamodel.smm.Measurement;
import org.pavanecce.vdml.metamodel.smm.Observation;
import org.pavanecce.vdml.metamodel.smm.ObservedMeasure;
import org.pavanecce.vdml.metamodel.smm.SmmModel;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage
 * @generated
 */
public class SmmAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SmmPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SmmPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SmmSwitch<Adapter> modelSwitch =
        new SmmSwitch<Adapter>() {
            @Override
            public Adapter caseCharacteristic(Characteristic object) {
                return createCharacteristicAdapter();
            }
            @Override
            public Adapter caseAbstractMeasureElement(AbstractMeasureElement object) {
                return createAbstractMeasureElementAdapter();
            }
            @Override
            public Adapter caseMeasureLibrary(MeasureLibrary object) {
                return createMeasureLibraryAdapter();
            }
            @Override
            public Adapter caseMeasure(Measure object) {
                return createMeasureAdapter();
            }
            @Override
            public Adapter caseObservedMeasure(ObservedMeasure object) {
                return createObservedMeasureAdapter();
            }
            @Override
            public Adapter caseObservation(Observation object) {
                return createObservationAdapter();
            }
            @Override
            public Adapter caseMeasurement(Measurement object) {
                return createMeasurementAdapter();
            }
            @Override
            public Adapter caseSmmModel(SmmModel object) {
                return createSmmModelAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.smm.Characteristic <em>Characteristic</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.smm.Characteristic
     * @generated
     */
    public Adapter createCharacteristicAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement <em>Abstract Measure Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.smm.AbstractMeasureElement
     * @generated
     */
    public Adapter createAbstractMeasureElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.smm.MeasureLibrary <em>Measure Library</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.smm.MeasureLibrary
     * @generated
     */
    public Adapter createMeasureLibraryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.smm.Measure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.smm.Measure
     * @generated
     */
    public Adapter createMeasureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure <em>Observed Measure</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.smm.ObservedMeasure
     * @generated
     */
    public Adapter createObservedMeasureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.smm.Observation <em>Observation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.smm.Observation
     * @generated
     */
    public Adapter createObservationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.smm.Measurement <em>Measurement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.smm.Measurement
     * @generated
     */
    public Adapter createMeasurementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.smm.SmmModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.smm.SmmModel
     * @generated
     */
    public Adapter createSmmModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //SmmAdapterFactory
