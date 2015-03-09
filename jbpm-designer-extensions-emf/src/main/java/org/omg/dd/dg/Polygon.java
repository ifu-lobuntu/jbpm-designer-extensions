/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.common.util.EList;
import org.omg.dd.dc.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Polygon#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon extends MarkedElement {
    /**
     * Returns the value of the '<em><b>Point</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.dc.Point}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Point</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Point</em>' containment reference list.
     * @see org.omg.dd.dg.DGPackage#getPolygon_Point()
     * @model containment="true" lower="3"
     * @generated
     */
    EList<Point> getPoint();

} // Polygon
