/**
 */
package org.pavanecce.vdml.metamodel.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getSource <em>Source</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOutputDelegation()
 * @model
 * @generated
 */
public interface OutputDelegation extends PortDelegation {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutputDelegation <em>Output Delegation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(OutputPort)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOutputDelegation_Source()
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutputDelegation
     * @model opposite="outputDelegation" required="true" ordered="false"
     * @generated
     */
    OutputPort getSource();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(OutputPort value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getDelegatedOutput <em>Delegated Output</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(OutputPort)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getOutputDelegation_Target()
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort#getDelegatedOutput
     * @model opposite="delegatedOutput" required="true" ordered="false"
     * @generated
     */
    OutputPort getTarget();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.OutputDelegation#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(OutputPort value);

} // OutputDelegation
