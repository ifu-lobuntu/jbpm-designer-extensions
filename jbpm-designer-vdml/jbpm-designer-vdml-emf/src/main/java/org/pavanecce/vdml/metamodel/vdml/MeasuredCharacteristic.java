/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;
import org.pavanecce.vdml.metamodel.smm.Characteristic;
import org.pavanecce.vdml.metamodel.smm.Measurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getMeasuredCharacteristic()
 * @model
 * @generated
 */
public interface MeasuredCharacteristic extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Measurement</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.Measurement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getMeasuredCharacteristic_Measurement()
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getMeasuredCharacteristic_CharacteristicDefinition()
     * @model ordered="false"
     * @generated
     */
    Characteristic getCharacteristicDefinition();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic#getCharacteristicDefinition <em>Characteristic Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Characteristic Definition</em>' reference.
     * @see #getCharacteristicDefinition()
     * @generated
     */
    void setCharacteristicDefinition(Characteristic value);

} // MeasuredCharacteristic
