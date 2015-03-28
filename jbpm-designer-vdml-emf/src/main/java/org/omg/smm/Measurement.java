/**
 */
package org.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.Measurement#getBreakValue <em>Break Value</em>}</li>
 *   <li>{@link org.omg.smm.Measurement#getError <em>Error</em>}</li>
 *   <li>{@link org.omg.smm.Measurement#getMeasurementRelationships <em>Measurement Relationships</em>}</li>
 *   <li>{@link org.omg.smm.Measurement#getObservedMeasure <em>Observed Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface Measurement extends SmmElement {
    /**
     * Returns the value of the '<em><b>Break Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Break Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Break Value</em>' attribute.
     * @see #setBreakValue(String)
     * @see org.omg.smm.SMMPackage#getMeasurement_BreakValue()
     * @model dataType="org.omg.dd.primitivetypes.String" ordered="false"
     * @generated
     */
    String getBreakValue();

    /**
     * Sets the value of the '{@link org.omg.smm.Measurement#getBreakValue <em>Break Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Break Value</em>' attribute.
     * @see #getBreakValue()
     * @generated
     */
    void setBreakValue(String value);

    /**
     * Returns the value of the '<em><b>Error</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error</em>' attribute.
     * @see #setError(String)
     * @see org.omg.smm.SMMPackage#getMeasurement_Error()
     * @model dataType="org.omg.dd.primitivetypes.String" ordered="false"
     * @generated
     */
    String getError();

    /**
     * Sets the value of the '{@link org.omg.smm.Measurement#getError <em>Error</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error</em>' attribute.
     * @see #getError()
     * @generated
     */
    void setError(String value);

    /**
     * Returns the value of the '<em><b>Measurement Relationships</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.smm.MeasurementRelationship}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Relationships</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement Relationships</em>' containment reference list.
     * @see org.omg.smm.SMMPackage#getMeasurement_MeasurementRelationships()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<MeasurementRelationship> getMeasurementRelationships();

    /**
     * Returns the value of the '<em><b>Observed Measure</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.omg.smm.ObservedMeasure#getMeasurements <em>Measurements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Observed Measure</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Observed Measure</em>' container reference.
     * @see #setObservedMeasure(ObservedMeasure)
     * @see org.omg.smm.SMMPackage#getMeasurement_ObservedMeasure()
     * @see org.omg.smm.ObservedMeasure#getMeasurements
     * @model opposite="measurements" required="true" transient="false" ordered="false"
     * @generated
     */
    ObservedMeasure getObservedMeasure();

    /**
     * Sets the value of the '{@link org.omg.smm.Measurement#getObservedMeasure <em>Observed Measure</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Observed Measure</em>' container reference.
     * @see #getObservedMeasure()
     * @generated
     */
    void setObservedMeasure(ObservedMeasure value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getMeasureLabel();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getMeasurementLabel();

} // Measurement
