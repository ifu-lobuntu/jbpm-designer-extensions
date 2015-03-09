/**
 */
package org.omg.dd.dg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Translate#getDeltaX <em>Delta X</em>}</li>
 *   <li>{@link org.omg.dd.dg.Translate#getDeltaY <em>Delta Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getTranslate()
 * @model
 * @generated
 */
public interface Translate extends Transform {
    /**
     * Returns the value of the '<em><b>Delta X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delta X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delta X</em>' attribute.
     * @see #setDeltaX(Double)
     * @see org.omg.dd.dg.DGPackage#getTranslate_DeltaX()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getDeltaX();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Translate#getDeltaX <em>Delta X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delta X</em>' attribute.
     * @see #getDeltaX()
     * @generated
     */
    void setDeltaX(Double value);

    /**
     * Returns the value of the '<em><b>Delta Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delta Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delta Y</em>' attribute.
     * @see #setDeltaY(Double)
     * @see org.omg.dd.dg.DGPackage#getTranslate_DeltaY()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getDeltaY();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Translate#getDeltaY <em>Delta Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delta Y</em>' attribute.
     * @see #getDeltaY()
     * @generated
     */
    void setDeltaY(Double value);

} // Translate
