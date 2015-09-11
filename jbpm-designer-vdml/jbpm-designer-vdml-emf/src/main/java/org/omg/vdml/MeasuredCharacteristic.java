/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;
import org.omg.smm.Characteristic;
import org.omg.smm.Measurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.MeasuredCharacteristic#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.omg.vdml.MeasuredCharacteristic#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getMeasuredCharacteristic()
 * @model
 * @generated
 */
public interface MeasuredCharacteristic extends VdmlElement {
    /**
	 * Returns the value of the '<em><b>Measurement</b></em>' reference list.
	 * The list contents are of type {@link org.omg.smm.Measurement}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getMeasuredCharacteristic_Measurement()
	 * @model ordered="false"
	 * @generated
	 */
    EList<Measurement> getMeasurement();

    /**
	 * Returns the value of the '<em><b>Characteristic Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Characteristic Definition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Definition</em>' reference.
	 * @see #setCharacteristicDefinition(Characteristic)
	 * @see org.omg.vdml.VDMLPackage#getMeasuredCharacteristic_CharacteristicDefinition()
	 * @model ordered="false"
	 * @generated
	 */
    Characteristic getCharacteristicDefinition();

    /**
	 * Sets the value of the '{@link org.omg.vdml.MeasuredCharacteristic#getCharacteristicDefinition <em>Characteristic Definition</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic Definition</em>' reference.
	 * @see #getCharacteristicDefinition()
	 * @generated
	 */
    void setCharacteristicDefinition(Characteristic value);

} // MeasuredCharacteristic
