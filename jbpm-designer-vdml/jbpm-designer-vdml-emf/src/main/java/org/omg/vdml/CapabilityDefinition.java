/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.CapabilityDefinition#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityDefinition#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityDefinition#getCapabilityResourceDefinition <em>Capability Resource Definition</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityDefinition#getPracticeDefinition <em>Practice Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getCapabilityDefinition()
 * @model
 * @generated
 */
public interface CapabilityDefinition extends Capability {
    /**
     * Returns the value of the '<em><b>Output</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.CapabilityDependency}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityDependency#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getCapabilityDefinition_Output()
     * @see org.omg.vdml.CapabilityDependency#getSource
     * @model opposite="source" ordered="false"
     * @generated
     */
    EList<CapabilityDependency> getOutput();

    /**
     * Returns the value of the '<em><b>Input</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.CapabilityDependency}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityDependency#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getCapabilityDefinition_Input()
     * @see org.omg.vdml.CapabilityDependency#getTarget
     * @model opposite="target" ordered="false"
     * @generated
     */
    EList<CapabilityDependency> getInput();

    /**
     * Returns the value of the '<em><b>Capability Resource Definition</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.BusinessItemDefinition}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.BusinessItemDefinition#getSupportedCapability <em>Supported Capability</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Resource Definition</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Resource Definition</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getCapabilityDefinition_CapabilityResourceDefinition()
     * @see org.omg.vdml.BusinessItemDefinition#getSupportedCapability
     * @model opposite="supportedCapability" ordered="false"
     * @generated
     */
    EList<BusinessItemDefinition> getCapabilityResourceDefinition();

    /**
     * Returns the value of the '<em><b>Practice Definition</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.PracticeDefinition}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.PracticeDefinition#getCapability <em>Capability</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Practice Definition</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Practice Definition</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getCapabilityDefinition_PracticeDefinition()
     * @see org.omg.vdml.PracticeDefinition#getCapability
     * @model opposite="capability" ordered="false"
     * @generated
     */
    EList<PracticeDefinition> getPracticeDefinition();

} // CapabilityDefinition
