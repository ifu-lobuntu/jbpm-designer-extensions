/**
 */
package org.pavanecce.vdml.metamodel.smm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observed Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasure <em>Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getObservedMeasure()
 * @model
 * @generated
 */
public interface ObservedMeasure extends EObject {
    /**
     * Returns the value of the '<em><b>Observation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.Observation#getObservedMeasure <em>Observed Measure</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Observation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Observation</em>' container reference.
     * @see #setObservation(Observation)
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getObservedMeasure_Observation()
     * @see org.pavanecce.vdml.metamodel.smm.Observation#getObservedMeasure
     * @model opposite="observedMeasure" required="true" transient="false" ordered="false"
     * @generated
     */
    Observation getObservation();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getObservation <em>Observation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Observation</em>' container reference.
     * @see #getObservation()
     * @generated
     */
    void setObservation(Observation value);

    /**
     * Returns the value of the '<em><b>Measurement</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.Measurement}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.Measurement#getObservedMeasure <em>Observed Measure</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getObservedMeasure_Measurement()
     * @see org.pavanecce.vdml.metamodel.smm.Measurement#getObservedMeasure
     * @model opposite="observedMeasure" containment="true" ordered="false"
     * @generated
     */
    EList<Measurement> getMeasurement();

    /**
     * Returns the value of the '<em><b>Measure</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.Measure#getObservedMeasure <em>Observed Measure</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measure</em>' reference.
     * @see #setMeasure(Measure)
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getObservedMeasure_Measure()
     * @see org.pavanecce.vdml.metamodel.smm.Measure#getObservedMeasure
     * @model opposite="observedMeasure" required="true" ordered="false"
     * @generated
     */
    Measure getMeasure();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasure <em>Measure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measure</em>' reference.
     * @see #getMeasure()
     * @generated
     */
    void setMeasure(Measure value);

} // ObservedMeasure
