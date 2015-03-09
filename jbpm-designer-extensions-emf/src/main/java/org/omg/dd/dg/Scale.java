/**
 */
package org.omg.dd.dg;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.Scale#getFactorX <em>Factor X</em>}</li>
 *   <li>{@link org.omg.dd.dg.Scale#getFactorY <em>Factor Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getScale()
 * @model
 * @generated
 */
public interface Scale extends Transform {
    /**
     * Returns the value of the '<em><b>Factor X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Factor X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Factor X</em>' attribute.
     * @see #setFactorX(Double)
     * @see org.omg.dd.dg.DGPackage#getScale_FactorX()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getFactorX();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Scale#getFactorX <em>Factor X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Factor X</em>' attribute.
     * @see #getFactorX()
     * @generated
     */
    void setFactorX(Double value);

    /**
     * Returns the value of the '<em><b>Factor Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Factor Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Factor Y</em>' attribute.
     * @see #setFactorY(Double)
     * @see org.omg.dd.dg.DGPackage#getScale_FactorY()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getFactorY();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.Scale#getFactorY <em>Factor Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Factor Y</em>' attribute.
     * @see #getFactorY()
     * @generated
     */
    void setFactorY(Double value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * factorX>=0 and factorY>=0
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='non-negative-scale'"
     * @generated
     */
    boolean nonnegativescale(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Scale
