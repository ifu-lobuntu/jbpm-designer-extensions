/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Line#getStart <em>Start</em>}</li>
 *   <li>{@link org.omg.dd.dg.Line#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends MarkedElement {
    /**
     * Returns the value of the '<em><b>Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start</em>' containment reference.
     * @see #setStart(Point)
     * @see org.omg.dd.dg.DGPackage#getLine_Start()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Point getStart();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Line#getStart <em>Start</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start</em>' containment reference.
     * @see #getStart()
     * @generated
     */
    void setStart(Point value);

    /**
     * Returns the value of the '<em><b>End</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End</em>' containment reference.
     * @see #setEnd(Point)
     * @see org.omg.dd.dg.DGPackage#getLine_End()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Point getEnd();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Line#getEnd <em>End</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End</em>' containment reference.
     * @see #getEnd()
     * @generated
     */
    void setEnd(Point value);

} // Line
