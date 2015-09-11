/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.omg.dd.dc.Point;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Circle#getCenter <em>Center</em>}</li>
 *   <li>{@link org.omg.dd.dg.Circle#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends GraphicalElement {
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
     * @see org.omg.dd.dg.DGPackage#getCircle_Center()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Point getCenter();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Circle#getCenter <em>Center</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Center</em>' containment reference.
     * @see #getCenter()
     * @generated
     */
    void setCenter(Point value);

    /**
     * Returns the value of the '<em><b>Radius</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Radius</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Radius</em>' attribute.
     * @see #setRadius(Double)
     * @see org.omg.dd.dg.DGPackage#getCircle_Radius()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getRadius();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Circle#getRadius <em>Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Radius</em>' attribute.
     * @see #getRadius()
     * @generated
     */
    void setRadius(Double value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * radius >= 0
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean non_negative_radius(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Circle
