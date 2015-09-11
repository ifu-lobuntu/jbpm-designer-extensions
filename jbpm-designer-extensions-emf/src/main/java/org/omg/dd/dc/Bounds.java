/**
 */
package org.omg.dd.dc;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dc.Bounds#getX <em>X</em>}</li>
 *   <li>{@link org.omg.dd.dc.Bounds#getY <em>Y</em>}</li>
 *   <li>{@link org.omg.dd.dc.Bounds#getWidth <em>Width</em>}</li>
 *   <li>{@link org.omg.dd.dc.Bounds#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dc.DCPackage#getBounds()
 * @model
 * @generated
 */
public interface Bounds extends EObject {
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
     * @see org.omg.dd.dc.DCPackage#getBounds_X()
     * @model default="0.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getX();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Bounds#getX <em>X</em>}' attribute.
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
     * @see org.omg.dd.dc.DCPackage#getBounds_Y()
     * @model default="0.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getY();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Bounds#getY <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y</em>' attribute.
     * @see #getY()
     * @generated
     */
    void setY(Double value);

    /**
     * Returns the value of the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Width</em>' attribute.
     * @see #setWidth(Double)
     * @see org.omg.dd.dc.DCPackage#getBounds_Width()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getWidth();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Bounds#getWidth <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Width</em>' attribute.
     * @see #getWidth()
     * @generated
     */
    void setWidth(Double value);

    /**
     * Returns the value of the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Height</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Height</em>' attribute.
     * @see #setHeight(Double)
     * @see org.omg.dd.dc.DCPackage#getBounds_Height()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getHeight();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Bounds#getHeight <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Height</em>' attribute.
     * @see #getHeight()
     * @generated
     */
    void setHeight(Double value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * width >= 0 and height >=0
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean non_negative_size(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Bounds
