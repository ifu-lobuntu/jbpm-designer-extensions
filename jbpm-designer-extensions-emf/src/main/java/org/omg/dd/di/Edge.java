/**
 */
package org.omg.dd.di;

import org.eclipse.emf.common.util.EList;
import org.omg.dd.dc.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.di.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.dd.di.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.dd.di.Edge#getWaypoint <em>Waypoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.di.DIPackage#getEdge()
 * @model abstract="true"
 * @generated
 */
public interface Edge extends DiagramElement {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see org.omg.dd.di.DIPackage#getEdge_Source()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    DiagramElement getSource();

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see org.omg.dd.di.DIPackage#getEdge_Target()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    DiagramElement getTarget();

    /**
     * Returns the value of the '<em><b>Waypoint</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.dc.Point}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Waypoint</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Waypoint</em>' containment reference list.
     * @see org.omg.dd.di.DIPackage#getEdge_Waypoint()
     * @model containment="true"
     * @generated
     */
    EList<Point> getWaypoint();

} // Edge
