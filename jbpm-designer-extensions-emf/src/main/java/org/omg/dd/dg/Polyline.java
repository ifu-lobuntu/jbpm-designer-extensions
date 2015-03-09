/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.common.util.EList;
import org.omg.dd.dc.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polyline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Polyline#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getPolyline()
 * @model
 * @generated
 */
public interface Polyline extends MarkedElement {
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
     * @see org.omg.dd.dg.DGPackage#getPolyline_Point()
     * @model containment="true" lower="2"
     * @generated
     */
    EList<Point> getPoint();

} // Polyline
