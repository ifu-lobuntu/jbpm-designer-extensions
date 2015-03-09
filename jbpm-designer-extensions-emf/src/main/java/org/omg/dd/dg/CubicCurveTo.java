/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cubic Curve To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.CubicCurveTo#getPoint <em>Point</em>}</li>
 *   <li>{@link org.omg.dd.dg.CubicCurveTo#getStartControl <em>Start Control</em>}</li>
 *   <li>{@link org.omg.dd.dg.CubicCurveTo#getEndControl <em>End Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getCubicCurveTo()
 * @model
 * @generated
 */
public interface CubicCurveTo extends PathCommand {
    /**
     * Returns the value of the '<em><b>Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Point</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Point</em>' containment reference.
     * @see #setPoint(Point)
     * @see org.omg.dd.dg.DGPackage#getCubicCurveTo_Point()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Point getPoint();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.CubicCurveTo#getPoint <em>Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Point</em>' containment reference.
     * @see #getPoint()
     * @generated
     */
    void setPoint(Point value);

    /**
     * Returns the value of the '<em><b>Start Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Control</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Control</em>' containment reference.
     * @see #setStartControl(Point)
     * @see org.omg.dd.dg.DGPackage#getCubicCurveTo_StartControl()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Point getStartControl();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.CubicCurveTo#getStartControl <em>Start Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Control</em>' containment reference.
     * @see #getStartControl()
     * @generated
     */
    void setStartControl(Point value);

    /**
     * Returns the value of the '<em><b>End Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Control</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Control</em>' containment reference.
     * @see #setEndControl(Point)
     * @see org.omg.dd.dg.DGPackage#getCubicCurveTo_EndControl()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Point getEndControl();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.CubicCurveTo#getEndControl <em>End Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Control</em>' containment reference.
     * @see #getEndControl()
     * @generated
     */
    void setEndControl(Point value);

} // CubicCurveTo
