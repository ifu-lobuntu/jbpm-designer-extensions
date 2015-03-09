/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.Characteristic#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getCharacteristic()
 * @model
 * @generated
 */
public interface Characteristic extends AbstractMeasureElement {
    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(Characteristic)
     * @see org.omg.smm.SMMPackage#getCharacteristic_Parent()
     * @model ordered="false"
     * @generated
     */
    Characteristic getParent();

    /**
     * Sets the value of the '{@link org.omg.smm.Characteristic#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(Characteristic value);

} // Characteristic
