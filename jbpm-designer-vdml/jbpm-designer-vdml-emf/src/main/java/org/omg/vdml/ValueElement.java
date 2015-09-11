/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.ValueElement#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link org.omg.vdml.ValueElement#getValueMeasurement <em>Value Measurement</em>}</li>
 *   <li>{@link org.omg.vdml.ValueElement#getBenchmark <em>Benchmark</em>}</li>
 *   <li>{@link org.omg.vdml.ValueElement#getAggregatedFrom <em>Aggregated From</em>}</li>
 *   <li>{@link org.omg.vdml.ValueElement#getAggregatedTo <em>Aggregated To</em>}</li>
 *   <li>{@link org.omg.vdml.ValueElement#getIsAtomic <em>Is Atomic</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getValueElement()
 * @model abstract="true"
 * @generated
 */
public interface ValueElement extends MeasurableElement {
    /**
	 * Returns the value of the '<em><b>Value Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Definition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Definition</em>' reference.
	 * @see #setValueDefinition(ValueDefinition)
	 * @see org.omg.vdml.VDMLPackage#getValueElement_ValueDefinition()
	 * @model ordered="false"
	 * @generated
	 */
    ValueDefinition getValueDefinition();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ValueElement#getValueDefinition <em>Value Definition</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Definition</em>' reference.
	 * @see #getValueDefinition()
	 * @generated
	 */
    void setValueDefinition(ValueDefinition value);

    /**
	 * Returns the value of the '<em><b>Value Measurement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Measurement</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Measurement</em>' containment reference.
	 * @see #setValueMeasurement(MeasuredCharacteristic)
	 * @see org.omg.vdml.VDMLPackage#getValueElement_ValueMeasurement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    MeasuredCharacteristic getValueMeasurement();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ValueElement#getValueMeasurement <em>Value Measurement</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Measurement</em>' containment reference.
	 * @see #getValueMeasurement()
	 * @generated
	 */
    void setValueMeasurement(MeasuredCharacteristic value);

    /**
	 * Returns the value of the '<em><b>Benchmark</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.MeasuredCharacteristic}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Benchmark</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Benchmark</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueElement_Benchmark()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<MeasuredCharacteristic> getBenchmark();

    /**
	 * Returns the value of the '<em><b>Aggregated From</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.ValueElement}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.ValueElement#getAggregatedTo <em>Aggregated To</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregated From</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated From</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueElement_AggregatedFrom()
	 * @see org.omg.vdml.ValueElement#getAggregatedTo
	 * @model opposite="aggregatedTo" ordered="false"
	 * @generated
	 */
    EList<ValueElement> getAggregatedFrom();

    /**
	 * Returns the value of the '<em><b>Aggregated To</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.ValueElement}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.ValueElement#getAggregatedFrom <em>Aggregated From</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregated To</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated To</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueElement_AggregatedTo()
	 * @see org.omg.vdml.ValueElement#getAggregatedFrom
	 * @model opposite="aggregatedFrom" ordered="false"
	 * @generated
	 */
    EList<ValueElement> getAggregatedTo();

    /**
	 * Returns the value of the '<em><b>Is Atomic</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Atomic</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Atomic</em>' attribute.
	 * @see #setIsAtomic(Boolean)
	 * @see org.omg.vdml.VDMLPackage#getValueElement_IsAtomic()
	 * @model default="true" dataType="org.omg.dd.primitivetypes.Boolean" ordered="false"
	 * @generated
	 */
    Boolean getIsAtomic();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ValueElement#getIsAtomic <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atomic</em>' attribute.
	 * @see #getIsAtomic()
	 * @generated
	 */
    void setIsAtomic(Boolean value);

} // ValueElement
