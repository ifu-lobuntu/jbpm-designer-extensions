/**
 */
package org.omg.dd.dg;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.LinearGradient#getX1 <em>X1</em>}</li>
 *   <li>{@link org.omg.dd.dg.LinearGradient#getX2 <em>X2</em>}</li>
 *   <li>{@link org.omg.dd.dg.LinearGradient#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.omg.dd.dg.LinearGradient#getY2 <em>Y2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getLinearGradient()
 * @model
 * @generated
 */
public interface LinearGradient extends Gradient {
    /**
     * Returns the value of the '<em><b>X1</b></em>' attribute.
     * The default value is <code>"0.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X1</em>' attribute.
     * @see #setX1(Double)
     * @see org.omg.dd.dg.DGPackage#getLinearGradient_X1()
     * @model default="0.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getX1();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.LinearGradient#getX1 <em>X1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X1</em>' attribute.
     * @see #getX1()
     * @generated
     */
    void setX1(Double value);

    /**
     * Returns the value of the '<em><b>X2</b></em>' attribute.
     * The default value is <code>"1.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X2</em>' attribute.
     * @see #setX2(Double)
     * @see org.omg.dd.dg.DGPackage#getLinearGradient_X2()
     * @model default="1.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getX2();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.LinearGradient#getX2 <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X2</em>' attribute.
     * @see #getX2()
     * @generated
     */
    void setX2(Double value);

    /**
     * Returns the value of the '<em><b>Y1</b></em>' attribute.
     * The default value is <code>"0.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y1</em>' attribute.
     * @see #setY1(Double)
     * @see org.omg.dd.dg.DGPackage#getLinearGradient_Y1()
     * @model default="0.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getY1();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.LinearGradient#getY1 <em>Y1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y1</em>' attribute.
     * @see #getY1()
     * @generated
     */
    void setY1(Double value);

    /**
     * Returns the value of the '<em><b>Y2</b></em>' attribute.
     * The default value is <code>"1.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y2</em>' attribute.
     * @see #setY2(Double)
     * @see org.omg.dd.dg.DGPackage#getLinearGradient_Y2()
     * @model default="1.0" dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getY2();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.LinearGradient#getY2 <em>Y2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y2</em>' attribute.
     * @see #getY2()
     * @generated
     */
    void setY2(Double value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * x1>=0 and x1<=1 and x2>=0 and x2<=1 and y1>=0 and y1<=1 and y2>=0 and y2<=1
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_gradient_vector(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LinearGradient
