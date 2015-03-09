/**
 */
package org.omg.dd.dg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skew</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Skew#getAngleX <em>Angle X</em>}</li>
 *   <li>{@link org.omg.dd.dg.Skew#getAngleY <em>Angle Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getSkew()
 * @model
 * @generated
 */
public interface Skew extends Transform {
    /**
     * Returns the value of the '<em><b>Angle X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Angle X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Angle X</em>' attribute.
     * @see #setAngleX(Double)
     * @see org.omg.dd.dg.DGPackage#getSkew_AngleX()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getAngleX();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Skew#getAngleX <em>Angle X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle X</em>' attribute.
     * @see #getAngleX()
     * @generated
     */
    void setAngleX(Double value);

    /**
     * Returns the value of the '<em><b>Angle Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Angle Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Angle Y</em>' attribute.
     * @see #setAngleY(Double)
     * @see org.omg.dd.dg.DGPackage#getSkew_AngleY()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getAngleY();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Skew#getAngleY <em>Angle Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle Y</em>' attribute.
     * @see #getAngleY()
     * @generated
     */
    void setAngleY(Double value);

} // Skew
