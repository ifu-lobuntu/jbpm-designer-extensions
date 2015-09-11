/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.omg.dd.dc.Color;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gradient Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.GradientStop#getColor <em>Color</em>}</li>
 *   <li>{@link org.omg.dd.dg.GradientStop#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.omg.dd.dg.GradientStop#getOpacity <em>Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getGradientStop()
 * @model
 * @generated
 */
public interface GradientStop extends EObject {
    /**
     * Returns the value of the '<em><b>Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Color</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Color</em>' containment reference.
     * @see #setColor(Color)
     * @see org.omg.dd.dg.DGPackage#getGradientStop_Color()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Color getColor();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.GradientStop#getColor <em>Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Color</em>' containment reference.
     * @see #getColor()
     * @generated
     */
    void setColor(Color value);

    /**
     * Returns the value of the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset</em>' attribute.
     * @see #setOffset(Double)
     * @see org.omg.dd.dg.DGPackage#getGradientStop_Offset()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getOffset();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.GradientStop#getOffset <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset</em>' attribute.
     * @see #getOffset()
     * @generated
     */
    void setOffset(Double value);

    /**
     * Returns the value of the '<em><b>Opacity</b></em>' attribute.
     * The default value is <code>"1.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Opacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Opacity</em>' attribute.
     * @see #setOpacity(Double)
     * @see org.omg.dd.dg.DGPackage#getGradientStop_Opacity()
     * @model default="1.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getOpacity();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.GradientStop#getOpacity <em>Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Opacity</em>' attribute.
     * @see #getOpacity()
     * @generated
     */
    void setOpacity(Double value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * offset>=0 and offset<=1
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_offset(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * opacity>=0 and opacity<=1
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_opacity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // GradientStop
