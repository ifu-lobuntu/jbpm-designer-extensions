/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutput <em>Output</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutputDefinition <em>Output Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getValueAdd <em>Value Add</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getDelegatedOutput <em>Delegated Output</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutputDelegation <em>Output Delegation</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getResourceUse <em>Resource Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends Port {
    /**
     * Returns the value of the '<em><b>Output</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getProvider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' reference.
     * @see #setOutput(DeliverableFlow)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOutputPort_Output()
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getProvider
     * @model opposite="provider" ordered="false"
     * @generated
     */
    DeliverableFlow getOutput();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutput <em>Output</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' reference.
     * @see #getOutput()
     * @generated
     */
    void setOutput(DeliverableFlow value);

    /**
     * Returns the value of the '<em><b>Output Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Definition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Definition</em>' reference.
     * @see #setOutputDefinition(BusinessItemLibraryElement)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOutputPort_OutputDefinition()
     * @model ordered="false"
     * @generated
     */
    BusinessItemLibraryElement getOutputDefinition();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutputDefinition <em>Output Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Definition</em>' reference.
     * @see #getOutputDefinition()
     * @generated
     */
    void setOutputDefinition(BusinessItemLibraryElement value);

    /**
     * Returns the value of the '<em><b>Value Add</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.ValueAdd}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Add</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Add</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOutputPort_ValueAdd()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ValueAdd> getValueAdd();

    /**
     * Returns the value of the '<em><b>Delegated Output</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegated Output</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delegated Output</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOutputPort_DelegatedOutput()
     * @see org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getTarget
     * @model opposite="target" ordered="false"
     * @generated
     */
    EList<OutputDelegation> getDelegatedOutput();

    /**
     * Returns the value of the '<em><b>Output Delegation</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Delegation</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Delegation</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOutputPort_OutputDelegation()
     * @see org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getSource
     * @model opposite="source" ordered="false"
     * @generated
     */
    EList<OutputDelegation> getOutputDelegation();

    /**
     * Returns the value of the '<em><b>Resource Use</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.ResourceUse}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.ResourceUse#getDeliverable <em>Deliverable</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Use</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Use</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOutputPort_ResourceUse()
     * @see org.pavanecce.vdml.metamodel.vdml.ResourceUse#getDeliverable
     * @model opposite="deliverable" ordered="false"
     * @generated
     */
    EList<ResourceUse> getResourceUse();

} // OutputPort
