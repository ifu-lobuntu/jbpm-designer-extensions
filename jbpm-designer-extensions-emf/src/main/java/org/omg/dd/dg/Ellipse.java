/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.Dimension;
import org.omg.dd.dc.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Ellipse#getCenter <em>Center</em>}</li>
 *   <li>{@link org.omg.dd.dg.Ellipse#getRadii <em>Radii</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getEllipse()
 * @model
 * @generated
 */
public interface Ellipse extends GraphicalElement {
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
     * @see org.omg.dd.dg.DGPackage#getEllipse_Center()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Point getCenter();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Ellipse#getCenter <em>Center</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Center</em>' containment reference.
     * @see #getCenter()
     * @generated
     */
    void setCenter(Point value);

    /**
     * Returns the value of the '<em><b>Radii</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Radii</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Radii</em>' containment reference.
     * @see #setRadii(Dimension)
     * @see org.omg.dd.dg.DGPackage#getEllipse_Radii()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Dimension getRadii();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Ellipse#getRadii <em>Radii</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Radii</em>' containment reference.
     * @see #getRadii()
     * @generated
     */
    void setRadii(Dimension value);

} // Ellipse
