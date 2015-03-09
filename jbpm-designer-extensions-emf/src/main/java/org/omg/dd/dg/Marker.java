/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.Dimension;
import org.omg.dd.dc.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Marker#getSize <em>Size</em>}</li>
 *   <li>{@link org.omg.dd.dg.Marker#getReference <em>Reference</em>}</li>
 *   <li>{@link org.omg.dd.dg.Marker#getCanvas <em>Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getMarker()
 * @model
 * @generated
 */
public interface Marker extends Group {
    /**
     * Returns the value of the '<em><b>Size</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size</em>' containment reference.
     * @see #setSize(Dimension)
     * @see org.omg.dd.dg.DGPackage#getMarker_Size()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Dimension getSize();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Marker#getSize <em>Size</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' containment reference.
     * @see #getSize()
     * @generated
     */
    void setSize(Dimension value);

    /**
     * Returns the value of the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' containment reference.
     * @see #setReference(Point)
     * @see org.omg.dd.dg.DGPackage#getMarker_Reference()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Point getReference();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Marker#getReference <em>Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' containment reference.
     * @see #getReference()
     * @generated
     */
    void setReference(Point value);

    /**
     * Returns the value of the '<em><b>Canvas</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.omg.dd.dg.Canvas#getPackagedMarker <em>Packaged Marker</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Canvas</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Canvas</em>' container reference.
     * @see #setCanvas(Canvas)
     * @see org.omg.dd.dg.DGPackage#getMarker_Canvas()
     * @see org.omg.dd.dg.Canvas#getPackagedMarker
     * @model opposite="packagedMarker" required="true" transient="false" ordered="false"
     * @generated
     */
    Canvas getCanvas();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Marker#getCanvas <em>Canvas</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Canvas</em>' container reference.
     * @see #getCanvas()
     * @generated
     */
    void setCanvas(Canvas value);

} // Marker
