/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.MoveTo#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getMoveTo()
 * @model
 * @generated
 */
public interface MoveTo extends PathCommand {
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
     * @see org.omg.dd.dg.DGPackage#getMoveTo_Point()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Point getPoint();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.MoveTo#getPoint <em>Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Point</em>' containment reference.
     * @see #getPoint()
     * @generated
     */
    void setPoint(Point value);

} // MoveTo
