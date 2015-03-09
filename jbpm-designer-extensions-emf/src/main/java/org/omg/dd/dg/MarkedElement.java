/**
 */
package org.omg.dd.dg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marked Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.MarkedElement#getStartMarker <em>Start Marker</em>}</li>
 *   <li>{@link org.omg.dd.dg.MarkedElement#getEndMarker <em>End Marker</em>}</li>
 *   <li>{@link org.omg.dd.dg.MarkedElement#getMidMarker <em>Mid Marker</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getMarkedElement()
 * @model abstract="true"
 * @generated
 */
public interface MarkedElement extends GraphicalElement {
    /**
     * Returns the value of the '<em><b>Start Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Marker</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Marker</em>' reference.
     * @see #setStartMarker(Marker)
     * @see org.omg.dd.dg.DGPackage#getMarkedElement_StartMarker()
     * @model ordered="false"
     * @generated
     */
    Marker getStartMarker();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.MarkedElement#getStartMarker <em>Start Marker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Marker</em>' reference.
     * @see #getStartMarker()
     * @generated
     */
    void setStartMarker(Marker value);

    /**
     * Returns the value of the '<em><b>End Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Marker</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Marker</em>' reference.
     * @see #setEndMarker(Marker)
     * @see org.omg.dd.dg.DGPackage#getMarkedElement_EndMarker()
     * @model ordered="false"
     * @generated
     */
    Marker getEndMarker();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.MarkedElement#getEndMarker <em>End Marker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Marker</em>' reference.
     * @see #getEndMarker()
     * @generated
     */
    void setEndMarker(Marker value);

    /**
     * Returns the value of the '<em><b>Mid Marker</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mid Marker</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mid Marker</em>' reference.
     * @see #setMidMarker(Marker)
     * @see org.omg.dd.dg.DGPackage#getMarkedElement_MidMarker()
     * @model ordered="false"
     * @generated
     */
    Marker getMidMarker();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.MarkedElement#getMidMarker <em>Mid Marker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mid Marker</em>' reference.
     * @see #getMidMarker()
     * @generated
     */
    void setMidMarker(Marker value);

} // MarkedElement
