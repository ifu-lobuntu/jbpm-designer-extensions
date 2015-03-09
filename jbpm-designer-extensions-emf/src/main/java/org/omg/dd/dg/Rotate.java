/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Rotate#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.omg.dd.dg.Rotate#getCenter <em>Center</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends Transform {
    /**
     * Returns the value of the '<em><b>Angle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Angle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Angle</em>' attribute.
     * @see #setAngle(Double)
     * @see org.omg.dd.dg.DGPackage#getRotate_Angle()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getAngle();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Rotate#getAngle <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle</em>' attribute.
     * @see #getAngle()
     * @generated
     */
    void setAngle(Double value);

    /**
     * Returns the value of the '<em><b>Center</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Center</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Center</em>' containment reference.
     * @see #setCenter(Point)
     * @see org.omg.dd.dg.DGPackage#getRotate_Center()
     * @model containment="true" ordered="false"
     * @generated
     */
    Point getCenter();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Rotate#getCenter <em>Center</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Center</em>' containment reference.
     * @see #getCenter()
     * @generated
     */
    void setCenter(Point value);

} // Rotate
