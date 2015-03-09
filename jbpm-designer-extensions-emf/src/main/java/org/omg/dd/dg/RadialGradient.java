/**
 */
package org.omg.dd.dg;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radial Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.RadialGradient#getCenterX <em>Center X</em>}</li>
 *   <li>{@link org.omg.dd.dg.RadialGradient#getCenterY <em>Center Y</em>}</li>
 *   <li>{@link org.omg.dd.dg.RadialGradient#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.omg.dd.dg.RadialGradient#getFocusX <em>Focus X</em>}</li>
 *   <li>{@link org.omg.dd.dg.RadialGradient#getFocusY <em>Focus Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getRadialGradient()
 * @model
 * @generated
 */
public interface RadialGradient extends Gradient {
    /**
     * Returns the value of the '<em><b>Center X</b></em>' attribute.
     * The default value is <code>"0.5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Center X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Center X</em>' attribute.
     * @see #setCenterX(Double)
     * @see org.omg.dd.dg.DGPackage#getRadialGradient_CenterX()
     * @model default="0.5" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getCenterX();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.RadialGradient#getCenterX <em>Center X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Center X</em>' attribute.
     * @see #getCenterX()
     * @generated
     */
    void setCenterX(Double value);

    /**
     * Returns the value of the '<em><b>Center Y</b></em>' attribute.
     * The default value is <code>"0.5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Center Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Center Y</em>' attribute.
     * @see #setCenterY(Double)
     * @see org.omg.dd.dg.DGPackage#getRadialGradient_CenterY()
     * @model default="0.5" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getCenterY();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.RadialGradient#getCenterY <em>Center Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Center Y</em>' attribute.
     * @see #getCenterY()
     * @generated
     */
    void setCenterY(Double value);

    /**
     * Returns the value of the '<em><b>Radius</b></em>' attribute.
     * The default value is <code>"0.5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Radius</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Radius</em>' attribute.
     * @see #setRadius(Double)
     * @see org.omg.dd.dg.DGPackage#getRadialGradient_Radius()
     * @model default="0.5" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getRadius();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.RadialGradient#getRadius <em>Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Radius</em>' attribute.
     * @see #getRadius()
     * @generated
     */
    void setRadius(Double value);

    /**
     * Returns the value of the '<em><b>Focus X</b></em>' attribute.
     * The default value is <code>"0.5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Focus X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Focus X</em>' attribute.
     * @see #setFocusX(Double)
     * @see org.omg.dd.dg.DGPackage#getRadialGradient_FocusX()
     * @model default="0.5" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getFocusX();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.RadialGradient#getFocusX <em>Focus X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Focus X</em>' attribute.
     * @see #getFocusX()
     * @generated
     */
    void setFocusX(Double value);

    /**
     * Returns the value of the '<em><b>Focus Y</b></em>' attribute.
     * The default value is <code>"0.5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Focus Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Focus Y</em>' attribute.
     * @see #setFocusY(Double)
     * @see org.omg.dd.dg.DGPackage#getRadialGradient_FocusY()
     * @model default="0.5" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getFocusY();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.RadialGradient#getFocusY <em>Focus Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Focus Y</em>' attribute.
     * @see #getFocusY()
     * @generated
     */
    void setFocusY(Double value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * centerX>=0 and centerX<=1 and centerY>=0 and centerY<=1
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_center_point(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * focusX>=0 and focusX<=1 and focusY>=0 and focusY<=1
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_focus_point(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * radius>=0 and radius<=1
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_radius(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RadialGradient
