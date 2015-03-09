/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.Bounds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Rectangle#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.omg.dd.dg.Rectangle#getCornerRadius <em>Corner Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends GraphicalElement {
    /**
     * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bounds</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bounds</em>' containment reference.
     * @see #setBounds(Bounds)
     * @see org.omg.dd.dg.DGPackage#getRectangle_Bounds()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Bounds getBounds();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Rectangle#getBounds <em>Bounds</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bounds</em>' containment reference.
     * @see #getBounds()
     * @generated
     */
    void setBounds(Bounds value);

    /**
     * Returns the value of the '<em><b>Corner Radius</b></em>' attribute.
     * The default value is <code>"0.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Corner Radius</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Corner Radius</em>' attribute.
     * @see #setCornerRadius(Double)
     * @see org.omg.dd.dg.DGPackage#getRectangle_CornerRadius()
     * @model default="0.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getCornerRadius();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Rectangle#getCornerRadius <em>Corner Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Corner Radius</em>' attribute.
     * @see #getCornerRadius()
     * @generated
     */
    void setCornerRadius(Double value);

} // Rectangle
