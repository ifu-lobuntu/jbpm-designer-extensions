/**
 */
package org.pavanecce.vdml.metamodel.smm.util;

import org.eclipse.cmmn1.Switch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage
 * @generated
 */
public class SmmSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SmmPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmSwitch() {
        if (modelPackage == null) {
            modelPackage = SmmPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case SmmPackage.CHARACTERISTIC: {
                Characteristic characteristic = (Characteristic)theEObject;
                T result = caseCharacteristic(characteristic);
                if (result == null) result = caseAbstractMeasureElement(characteristic);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SmmPackage.ABSTRACT_MEASURE_ELEMENT: {
                AbstractMeasureElement abstractMeasureElement = (AbstractMeasureElement)theEObject;
                T result = caseAbstractMeasureElement(abstractMeasureElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SmmPackage.MEASURE_LIBRARY: {
                MeasureLibrary measureLibrary = (MeasureLibrary)theEObject;
                T result = caseMeasureLibrary(measureLibrary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SmmPackage.MEASURE: {
                Measure measure = (Measure)theEObject;
                T result = caseMeasure(measure);
                if (result == null) result = caseAbstractMeasureElement(measure);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SmmPackage.OBSERVED_MEASURE: {
                ObservedMeasure observedMeasure = (ObservedMeasure)theEObject;
                T result = caseObservedMeasure(observedMeasure);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SmmPackage.OBSERVATION: {
                Observation observation = (Observation)theEObject;
                T result = caseObservation(observation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SmmPackage.MEASUREMENT: {
                Measurement measurement = (Measurement)theEObject;
                T result = caseMeasurement(measurement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SmmPackage.SMM_MODEL: {
                SmmModel smmModel = (SmmModel)theEObject;
                T result = caseSmmModel(smmModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCharacteristic(Characteristic object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Measure Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Measure Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractMeasureElement(AbstractMeasureElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measure Library</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measure Library</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasureLibrary(MeasureLibrary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasure(Measure object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Observed Measure</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Observed Measure</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObservedMeasure(ObservedMeasure object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObservation(Observation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurement(Measurement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSmmModel(SmmModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //SmmSwitch
