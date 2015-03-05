/**
 */
package org.pavanecce.vdml.metamodel.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Operand#getMeasuredCharacteristic <em>Measured Characteristic</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Operand#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOperand()
 * @model
 * @generated
 */
public interface Operand extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alias</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alias</em>' attribute.
     * @see #setAlias(String)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOperand_Alias()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getAlias();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Operand#getAlias <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alias</em>' attribute.
     * @see #getAlias()
     * @generated
     */
    void setAlias(String value);

    /**
     * Returns the value of the '<em><b>Measured Characteristic</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measured Characteristic</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measured Characteristic</em>' reference.
     * @see #setMeasuredCharacteristic(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOperand_MeasuredCharacteristic()
     * @model required="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getMeasuredCharacteristic();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Operand#getMeasuredCharacteristic <em>Measured Characteristic</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measured Characteristic</em>' reference.
     * @see #getMeasuredCharacteristic()
     * @generated
     */
    void setMeasuredCharacteristic(MeasuredCharacteristic value);

} // Operand
