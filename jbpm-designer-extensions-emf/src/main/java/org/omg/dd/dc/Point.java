/**
 */
package org.omg.dd.dc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dc.Point#getX <em>X</em>}</li>
 *   <li>{@link org.omg.dd.dc.Point#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dc.DCPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject {
    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * The default value is <code>"0.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #setX(Double)
     * @see org.omg.dd.dc.DCPackage#getPoint_X()
     * @model default="0.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getX();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Point#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X</em>' attribute.
     * @see #getX()
     * @generated
     */
    void setX(Double value);

    /**
     * Returns the value of the '<em><b>Y</b></em>' attribute.
     * The default value is <code>"0.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y</em>' attribute.
     * @see #setY(Double)
     * @see org.omg.dd.dc.DCPackage#getPoint_Y()
     * @model default="0.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getY();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Point#getY <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y</em>' attribute.
     * @see #getY()
     * @generated
     */
    void setY(Double value);

} // Point
