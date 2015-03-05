/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Expression#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Expression#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' attribute.
     * @see #setBody(String)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getExpression_Body()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getBody();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Expression#getBody <em>Body</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' attribute.
     * @see #getBody()
     * @generated
     */
    void setBody(String value);

    /**
     * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Operand}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operand</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getExpression_Operand()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Operand> getOperand();

} // Expression
