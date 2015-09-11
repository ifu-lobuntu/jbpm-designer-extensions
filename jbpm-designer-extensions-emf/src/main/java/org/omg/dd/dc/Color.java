/**
 */
package org.omg.dd.dc;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dc.Color#getRed <em>Red</em>}</li>
 *   <li>{@link org.omg.dd.dc.Color#getGreen <em>Green</em>}</li>
 *   <li>{@link org.omg.dd.dc.Color#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dc.DCPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends EObject {
    /**
     * Returns the value of the '<em><b>Red</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Red</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Red</em>' attribute.
     * @see #setRed(Integer)
     * @see org.omg.dd.dc.DCPackage#getColor_Red()
     * @model dataType="org.omg.dd.primitivetypes.Integer" required="true" ordered="false"
     * @generated
     */
    Integer getRed();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Color#getRed <em>Red</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Red</em>' attribute.
     * @see #getRed()
     * @generated
     */
    void setRed(Integer value);

    /**
     * Returns the value of the '<em><b>Green</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Green</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Green</em>' attribute.
     * @see #setGreen(Integer)
     * @see org.omg.dd.dc.DCPackage#getColor_Green()
     * @model dataType="org.omg.dd.primitivetypes.Integer" required="true" ordered="false"
     * @generated
     */
    Integer getGreen();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Color#getGreen <em>Green</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Green</em>' attribute.
     * @see #getGreen()
     * @generated
     */
    void setGreen(Integer value);

    /**
     * Returns the value of the '<em><b>Blue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Blue</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Blue</em>' attribute.
     * @see #setBlue(Integer)
     * @see org.omg.dd.dc.DCPackage#getColor_Blue()
     * @model dataType="org.omg.dd.primitivetypes.Integer" required="true" ordered="false"
     * @generated
     */
    Integer getBlue();

    /**
     * Sets the value of the '{@link org.omg.dd.dc.Color#getBlue <em>Blue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Blue</em>' attribute.
     * @see #getBlue()
     * @generated
     */
    void setBlue(Integer value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * red >= 0 and red <=255 and green >= 0 and green <=255 and blue >= 0 and blue <=255
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_rgb(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Color
