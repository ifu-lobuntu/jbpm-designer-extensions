/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.common.util.EList;
import org.omg.dd.dc.Color;
import org.omg.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Canvas#getBackgroundFill <em>Background Fill</em>}</li>
 *   <li>{@link org.omg.dd.dg.Canvas#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.omg.dd.dg.Canvas#getPackagedMarker <em>Packaged Marker</em>}</li>
 *   <li>{@link org.omg.dd.dg.Canvas#getPackagedStyle <em>Packaged Style</em>}</li>
 *   <li>{@link org.omg.dd.dg.Canvas#getPackagedFill <em>Packaged Fill</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getCanvas()
 * @model
 * @generated
 */
public interface Canvas extends Group {
    /**
     * Returns the value of the '<em><b>Background Fill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Background Fill</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Background Fill</em>' reference.
     * @see #setBackgroundFill(Fill)
     * @see org.omg.dd.dg.DGPackage#getCanvas_BackgroundFill()
     * @model ordered="false"
     * @generated
     */
    Fill getBackgroundFill();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Canvas#getBackgroundFill <em>Background Fill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Background Fill</em>' reference.
     * @see #getBackgroundFill()
     * @generated
     */
    void setBackgroundFill(Fill value);

    /**
     * Returns the value of the '<em><b>Background Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Background Color</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Background Color</em>' containment reference.
     * @see #setBackgroundColor(Color)
     * @see org.omg.dd.dg.DGPackage#getCanvas_BackgroundColor()
     * @model containment="true" ordered="false"
     * @generated
     */
    Color getBackgroundColor();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Canvas#getBackgroundColor <em>Background Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Background Color</em>' containment reference.
     * @see #getBackgroundColor()
     * @generated
     */
    void setBackgroundColor(Color value);

    /**
     * Returns the value of the '<em><b>Packaged Marker</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.dg.Marker}.
     * It is bidirectional and its opposite is '{@link org.omg.dd.dg.Marker#getCanvas <em>Canvas</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packaged Marker</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packaged Marker</em>' containment reference list.
     * @see org.omg.dd.dg.DGPackage#getCanvas_PackagedMarker()
     * @see org.omg.dd.dg.Marker#getCanvas
     * @model opposite="canvas" containment="true" ordered="false"
     * @generated
     */
    EList<Marker> getPackagedMarker();

    /**
     * Returns the value of the '<em><b>Packaged Style</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.di.Style}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packaged Style</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packaged Style</em>' containment reference list.
     * @see org.omg.dd.dg.DGPackage#getCanvas_PackagedStyle()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Style> getPackagedStyle();

    /**
     * Returns the value of the '<em><b>Packaged Fill</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.dg.Fill}.
     * It is bidirectional and its opposite is '{@link org.omg.dd.dg.Fill#getCanvas <em>Canvas</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packaged Fill</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packaged Fill</em>' containment reference list.
     * @see org.omg.dd.dg.DGPackage#getCanvas_PackagedFill()
     * @see org.omg.dd.dg.Fill#getCanvas
     * @model opposite="canvas" containment="true" ordered="false"
     * @generated
     */
    EList<Fill> getPackagedFill();

} // Canvas
