/**
 */
package org.pavanecce.vdml.metamodel.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.InputDelegation#getSource <em>Source</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.InputDelegation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputDelegation()
 * @model
 * @generated
 */
public interface InputDelegation extends PortDelegation {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getInputDelegation <em>Input Delegation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(InputPort)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputDelegation_Source()
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getInputDelegation
     * @model opposite="inputDelegation" required="true" ordered="false"
     * @generated
     */
    InputPort getSource();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.InputDelegation#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(InputPort value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getDelegatedInput <em>Delegated Input</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(InputPort)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputDelegation_Target()
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getDelegatedInput
     * @model opposite="delegatedInput" required="true" ordered="false"
     * @generated
     */
    InputPort getTarget();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.InputDelegation#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(InputPort value);

} // InputDelegation
