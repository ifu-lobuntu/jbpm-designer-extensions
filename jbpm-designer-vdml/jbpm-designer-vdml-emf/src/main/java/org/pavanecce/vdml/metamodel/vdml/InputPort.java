/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getResourceUse <em>Resource Use</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getDelegatedInput <em>Delegated Input</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getInputDelegation <em>Input Delegation</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getInputDefinition <em>Input Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
    /**
     * Returns the value of the '<em><b>Resource Use</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.ResourceUse}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Use</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Use</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputPort_ResourceUse()
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#getResource
     * @model opposite="resource" ordered="false"
     * @generated
     */
    EList<ResourceUse> getResourceUse();

    /**
     * Returns the value of the '<em><b>Delegated Input</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.InputDelegation}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.InputDelegation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegated Input</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delegated Input</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputPort_DelegatedInput()
     * @see org.pavanecce.vdml.metamodel.vdml.InputDelegation#getTarget
     * @model opposite="target" ordered="false"
     * @generated
     */
    EList<InputDelegation> getDelegatedInput();

    /**
     * Returns the value of the '<em><b>Input Delegation</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.InputDelegation}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.InputDelegation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Delegation</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Delegation</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputPort_InputDelegation()
     * @see org.pavanecce.vdml.metamodel.vdml.InputDelegation#getSource
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputPort_InputDefinition()
     * @model ordered="false"
     * @generated
     */
    BusinessItemLibraryElement getInputDefinition();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getInputDefinition <em>Input Definition</em>}' reference.
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputPort_CorrelationExpression()
     * @model containment="true" ordered="false"
     * @generated
     */
    Expression getCorrelationExpression();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getCorrelationExpression <em>Correlation Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Expression</em>' containment reference.
     * @see #getCorrelationExpression()
     * @generated
     */
    void setCorrelationExpression(Expression value);

    /**
     * Returns the value of the '<em><b>Assignment</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Assignment}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Assignment#getRoleResource <em>Role Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignment</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputPort_Assignment()
     * @see org.pavanecce.vdml.metamodel.vdml.Assignment#getRoleResource
     * @model opposite="roleResource" ordered="false"
     * @generated
     */
    EList<Assignment> getAssignment();

    /**
     * Returns the value of the '<em><b>Input</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getRecipient <em>Recipient</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' reference.
     * @see #setInput(DeliverableFlow)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getInputPort_Input()
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getRecipient
     * @model opposite="recipient" ordered="false"
     * @generated
     */
    DeliverableFlow getInput();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getInput <em>Input</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' reference.
     * @see #getInput()
     * @generated
     */
    void setInput(DeliverableFlow value);

} // InputPort
