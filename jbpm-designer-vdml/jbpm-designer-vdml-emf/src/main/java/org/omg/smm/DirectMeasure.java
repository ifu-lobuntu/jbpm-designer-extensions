/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.DirectMeasure#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getDirectMeasure()
 * @model
 * @generated
 */
public interface DirectMeasure extends DimensionalMeasure {
    /**
     * Returns the value of the '<em><b>Operation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' reference.
     * @see #setOperation(Operation)
     * @see org.omg.smm.SMMPackage#getDirectMeasure_Operation()
     * @model ordered="false"
     * @generated
     */
    Operation getOperation();

    /**
     * Sets the value of the '{@link org.omg.smm.DirectMeasure#getOperation <em>Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' reference.
     * @see #getOperation()
     * @generated
     */
    void setOperation(Operation value);

} // DirectMeasure
