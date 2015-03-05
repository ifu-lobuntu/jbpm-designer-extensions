/**
 */
package org.pavanecce.vdml.metamodel.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Party#getValueMargin <em>Value Margin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getParty()
 * @model
 * @generated
 */
public interface Party extends Role {
    /**
     * Returns the value of the '<em><b>Value Margin</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Margin</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Margin</em>' containment reference.
     * @see #setValueMargin(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getParty_ValueMargin()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getValueMargin();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Party#getValueMargin <em>Value Margin</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Margin</em>' containment reference.
     * @see #getValueMargin()
     * @generated
     */
    void setValueMargin(MeasuredCharacteristic value);

} // Party
