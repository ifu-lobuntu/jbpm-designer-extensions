/**
 */
package org.omg.dd.dc;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dc.Dimension#getWidth <em>Width</em>}</li>
 *   <li>{@link org.omg.dd.dc.Dimension#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dc.DCPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject {
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
     * @see org.omg.dd.dc.DCPackage#getDimension_Width()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getWidth();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Dimension#getWidth <em>Width</em>}' attribute.
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
     * @see org.omg.dd.dc.DCPackage#getDimension_Height()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getHeight();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Dimension#getHeight <em>Height</em>}' attribute.
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
    boolean non_negative_dimension(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Dimension
