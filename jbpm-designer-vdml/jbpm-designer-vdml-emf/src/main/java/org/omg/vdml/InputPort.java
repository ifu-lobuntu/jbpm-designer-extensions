/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.InputPort#getResourceUse <em>Resource Use</em>}</li>
 *   <li>{@link org.omg.vdml.InputPort#getDelegatedInput <em>Delegated Input</em>}</li>
 *   <li>{@link org.omg.vdml.InputPort#getInputDelegation <em>Input Delegation</em>}</li>
 *   <li>{@link org.omg.vdml.InputPort#getInputDefinition <em>Input Definition</em>}</li>
 *   <li>{@link org.omg.vdml.InputPort#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link org.omg.vdml.InputPort#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.omg.vdml.InputPort#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
    /**
	 * Returns the value of the '<em><b>Resource Use</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.ResourceUse}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.ResourceUse#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Use</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Use</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getInputPort_ResourceUse()
	 * @see org.omg.vdml.ResourceUse#getResource
	 * @model opposite="resource" ordered="false"
	 * @generated
	 */
    EList<ResourceUse> getResourceUse();

    /**
	 * Returns the value of the '<em><b>Delegated Input</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.InputDelegation}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.InputDelegation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegated Input</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Input</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getInputPort_DelegatedInput()
	 * @see org.omg.vdml.InputDelegation#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
    EList<InputDelegation> getDelegatedInput();

    /**
	 * Returns the value of the '<em><b>Input Delegation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.InputDelegation}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.InputDelegation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Delegation</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Delegation</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getInputPort_InputDelegation()
	 * @see org.omg.vdml.InputDelegation#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
    EList<InputDelegation> getInputDelegation();

    /**
	 * Returns the value of the '<em><b>Input Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Definition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Definition</em>' reference.
	 * @see #setInputDefinition(BusinessItemLibraryElement)
	 * @see org.omg.vdml.VDMLPackage#getInputPort_InputDefinition()
	 * @model ordered="false"
	 * @generated
	 */
    BusinessItemLibraryElement getInputDefinition();

    /**
	 * Sets the value of the '{@link org.omg.vdml.InputPort#getInputDefinition <em>Input Definition</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Definition</em>' reference.
	 * @see #getInputDefinition()
	 * @generated
	 */
    void setInputDefinition(BusinessItemLibraryElement value);

    /**
	 * Returns the value of the '<em><b>Correlation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #setCorrelationExpression(Expression)
	 * @see org.omg.vdml.VDMLPackage#getInputPort_CorrelationExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    Expression getCorrelationExpression();

    /**
	 * Sets the value of the '{@link org.omg.vdml.InputPort#getCorrelationExpression <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Expression</em>' containment reference.
	 * @see #getCorrelationExpression()
	 * @generated
	 */
    void setCorrelationExpression(Expression value);

    /**
	 * Returns the value of the '<em><b>Assignment</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.Assignment}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Assignment#getRoleResource <em>Role Resource</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getInputPort_Assignment()
	 * @see org.omg.vdml.Assignment#getRoleResource
	 * @model opposite="roleResource" ordered="false"
	 * @generated
	 */
    EList<Assignment> getAssignment();

    /**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.DeliverableFlow#getRecipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(DeliverableFlow)
	 * @see org.omg.vdml.VDMLPackage#getInputPort_Input()
	 * @see org.omg.vdml.DeliverableFlow#getRecipient
	 * @model opposite="recipient" ordered="false"
	 * @generated
	 */
    DeliverableFlow getInput();

    /**
	 * Sets the value of the '{@link org.omg.vdml.InputPort#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
    void setInput(DeliverableFlow value);

} // InputPort
