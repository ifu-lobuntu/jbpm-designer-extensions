/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.AlignmentKind;
import org.omg.dd.dc.Bounds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Text#getData <em>Data</em>}</li>
 *   <li>{@link org.omg.dd.dg.Text#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.omg.dd.dg.Text#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getText()
 * @model
 * @generated
 */
public interface Text extends GraphicalElement {
    /**
     * Returns the value of the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data</em>' attribute.
     * @see #setData(String)
     * @see org.omg.dd.dg.DGPackage#getText_Data()
     * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getData();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Text#getData <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data</em>' attribute.
     * @see #getData()
     * @generated
     */
    void setData(String value);

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
     * @see org.omg.dd.dg.DGPackage#getText_Bounds()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Bounds getBounds();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Text#getBounds <em>Bounds</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bounds</em>' containment reference.
     * @see #getBounds()
     * @generated
     */
    void setBounds(Bounds value);

    /**
     * Returns the value of the '<em><b>Alignment</b></em>' attribute.
     * The literals are from the enumeration {@link org.omg.dd.dc.AlignmentKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alignment</em>' attribute.
     * @see org.omg.dd.dc.AlignmentKind
     * @see #setAlignment(AlignmentKind)
     * @see org.omg.dd.dg.DGPackage#getText_Alignment()
     * @model required="true" ordered="false"
     * @generated
     */
    AlignmentKind getAlignment();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Text#getAlignment <em>Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alignment</em>' attribute.
     * @see org.omg.dd.dc.AlignmentKind
     * @see #getAlignment()
     * @generated
     */
    void setAlignment(AlignmentKind value);

} // Text
