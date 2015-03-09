/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.Bounds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Pattern#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.omg.dd.dg.Pattern#getTile <em>Tile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends Fill {
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
     * @see org.omg.dd.dg.DGPackage#getPattern_Bounds()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Bounds getBounds();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Pattern#getBounds <em>Bounds</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bounds</em>' containment reference.
     * @see #getBounds()
     * @generated
     */
    void setBounds(Bounds value);

    /**
     * Returns the value of the '<em><b>Tile</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tile</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tile</em>' containment reference.
     * @see #setTile(GraphicalElement)
     * @see org.omg.dd.dg.DGPackage#getPattern_Tile()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    GraphicalElement getTile();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Pattern#getTile <em>Tile</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tile</em>' containment reference.
     * @see #getTile()
     * @generated
     */
    void setTile(GraphicalElement value);

} // Pattern
