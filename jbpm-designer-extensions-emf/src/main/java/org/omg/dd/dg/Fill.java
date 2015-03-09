/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Fill#getCanvas <em>Canvas</em>}</li>
 *   <li>{@link org.omg.dd.dg.Fill#getTransform <em>Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getFill()
 * @model abstract="true"
 * @generated
 */
public interface Fill extends EObject {
    /**
     * Returns the value of the '<em><b>Canvas</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.omg.dd.dg.Canvas#getPackagedFill <em>Packaged Fill</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Canvas</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Canvas</em>' container reference.
     * @see #setCanvas(Canvas)
     * @see org.omg.dd.dg.DGPackage#getFill_Canvas()
     * @see org.omg.dd.dg.Canvas#getPackagedFill
     * @model opposite="packagedFill" required="true" transient="false" ordered="false"
     * @generated
     */
    Canvas getCanvas();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Fill#getCanvas <em>Canvas</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Canvas</em>' container reference.
     * @see #getCanvas()
     * @generated
     */
    void setCanvas(Canvas value);

    /**
     * Returns the value of the '<em><b>Transform</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.dg.Transform}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transform</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transform</em>' containment reference list.
     * @see org.omg.dd.dg.DGPackage#getFill_Transform()
     * @model containment="true"
     * @generated
     */
    EList<Transform> getTransform();

} // Fill
