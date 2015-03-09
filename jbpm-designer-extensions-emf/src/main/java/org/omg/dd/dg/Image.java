/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.Bounds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Image#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.dd.dg.Image#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.omg.dd.dg.Image#getIsAspectRatioPreserved <em>Is Aspect Ratio Preserved</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends GraphicalElement {
    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see org.omg.dd.dg.DGPackage#getImage_Source()
     * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Image#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
    void setSource(String value);

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
     * @see org.omg.dd.dg.DGPackage#getImage_Bounds()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Bounds getBounds();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Image#getBounds <em>Bounds</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bounds</em>' containment reference.
     * @see #getBounds()
     * @generated
     */
    void setBounds(Bounds value);

    /**
     * Returns the value of the '<em><b>Is Aspect Ratio Preserved</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Aspect Ratio Preserved</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Aspect Ratio Preserved</em>' attribute.
     * @see #setIsAspectRatioPreserved(Boolean)
     * @see org.omg.dd.dg.DGPackage#getImage_IsAspectRatioPreserved()
     * @model dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsAspectRatioPreserved();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Image#getIsAspectRatioPreserved <em>Is Aspect Ratio Preserved</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Aspect Ratio Preserved</em>' attribute.
     * @see #getIsAspectRatioPreserved()
     * @generated
     */
    void setIsAspectRatioPreserved(Boolean value);

} // Image
