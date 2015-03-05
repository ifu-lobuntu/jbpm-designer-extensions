/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueElement#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueElement#getValueMeasurement <em>Value Measurement</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueElement#getBenchmark <em>Benchmark</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueElement()
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueElement_ValueDefinition()
     * @model ordered="false"
     * @generated
     */
    ValueDefinition getValueDefinition();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValueElement#getValueDefinition <em>Value Definition</em>}' reference.
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueElement_ValueMeasurement()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getValueMeasurement();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValueElement#getValueMeasurement <em>Value Measurement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Measurement</em>' containment reference.
     * @see #getValueMeasurement()
     * @generated
     */
    void setValueMeasurement(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Benchmark</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Benchmark</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Benchmark</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueElement_Benchmark()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<MeasuredCharacteristic> getBenchmark();

} // ValueElement
