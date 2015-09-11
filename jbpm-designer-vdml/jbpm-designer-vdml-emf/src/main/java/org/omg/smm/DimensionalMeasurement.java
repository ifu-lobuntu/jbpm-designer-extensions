/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensional Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.DimensionalMeasurement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getDimensionalMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface DimensionalMeasurement extends Measurement {
    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see org.omg.smm.SMMPackage#getDimensionalMeasurement_Value()
	 * @model dataType="org.omg.dd.primitivetypes.Real" ordered="false"
	 * @generated
	 */
    Double getValue();

    /**
	 * Sets the value of the '{@link org.omg.smm.DimensionalMeasurement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(Double value);

} // DimensionalMeasurement
