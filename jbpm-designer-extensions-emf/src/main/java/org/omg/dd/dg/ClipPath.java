/**
 */
package org.omg.dd.dg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clip Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.ClipPath#getClippedElement <em>Clipped Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getClipPath()
 * @model
 * @generated
 */
public interface ClipPath extends Group {
    /**
     * Returns the value of the '<em><b>Clipped Element</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.omg.dd.dg.GraphicalElement#getClipPath <em>Clip Path</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Clipped Element</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Clipped Element</em>' container reference.
     * @see #setClippedElement(GraphicalElement)
     * @see org.omg.dd.dg.DGPackage#getClipPath_ClippedElement()
     * @see org.omg.dd.dg.GraphicalElement#getClipPath
     * @model opposite="clipPath" required="true" transient="false" ordered="false"
     * @generated
     */
    GraphicalElement getClippedElement();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.ClipPath#getClippedElement <em>Clipped Element</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Clipped Element</em>' container reference.
     * @see #getClippedElement()
     * @generated
     */
    void setClippedElement(GraphicalElement value);

} // ClipPath
