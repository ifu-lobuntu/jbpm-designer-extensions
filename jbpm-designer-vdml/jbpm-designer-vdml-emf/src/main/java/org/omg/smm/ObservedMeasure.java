/**
 */
package org.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observed Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.ObservedMeasure#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link org.omg.smm.ObservedMeasure#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.omg.smm.ObservedMeasure#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getObservedMeasure()
 * @model
 * @generated
 */
public interface ObservedMeasure extends SmmElement {
    /**
     * Returns the value of the '<em><b>Measurements</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.smm.Measurement}.
     * It is bidirectional and its opposite is '{@link org.omg.smm.Measurement#getObservedMeasure <em>Observed Measure</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurements</em>' containment reference list.
     * @see org.omg.smm.SMMPackage#getObservedMeasure_Measurements()
     * @see org.omg.smm.Measurement#getObservedMeasure
     * @model opposite="observedMeasure" containment="true" ordered="false"
     * @generated
     */
    EList<Measurement> getMeasurements();

    /**
     * Returns the value of the '<em><b>Measure</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measure</em>' reference.
     * @see #setMeasure(Measure)
     * @see org.omg.smm.SMMPackage#getObservedMeasure_Measure()
     * @model required="true" ordered="false"
     * @generated
     */
    Measure getMeasure();

    /**
     * Sets the value of the '{@link org.omg.smm.ObservedMeasure#getMeasure <em>Measure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measure</em>' reference.
     * @see #getMeasure()
     * @generated
     */
    void setMeasure(Measure value);

    /**
     * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.smm.Argument}.
     * It is bidirectional and its opposite is '{@link org.omg.smm.Argument#getObservedMeasure <em>Observed Measure</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arguments</em>' containment reference list.
     * @see org.omg.smm.SMMPackage#getObservedMeasure_Arguments()
     * @see org.omg.smm.Argument#getObservedMeasure
     * @model opposite="observedMeasure" containment="true" ordered="false"
     * @generated
     */
    EList<Argument> getArguments();

} // ObservedMeasure
