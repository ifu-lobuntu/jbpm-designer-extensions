/**
 */
package org.omg.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.CapabilityDependency#getIsTangible <em>Is Tangible</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityDependency#getDeliverableDefinition <em>Deliverable Definition</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityDependency#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityDependency#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityDependency#getIsFromExternalSource <em>Is From External Source</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityDependency#getIsForExternalTarget <em>Is For External Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getCapabilityDependency()
 * @model
 * @generated
 */
public interface CapabilityDependency extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Is Tangible</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Tangible</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Tangible</em>' attribute.
     * @see #setIsTangible(Boolean)
     * @see org.omg.vdml.VDMLPackage#getCapabilityDependency_IsTangible()
     * @model default="true" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsTangible();

    /**
     * Sets the value of the '{@link org.omg.vdml.CapabilityDependency#getIsTangible <em>Is Tangible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Tangible</em>' attribute.
     * @see #getIsTangible()
     * @generated
     */
    void setIsTangible(Boolean value);

    /**
     * Returns the value of the '<em><b>Deliverable Definition</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.BusinessItemDefinition#getCapabilityDependency <em>Capability Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deliverable Definition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deliverable Definition</em>' reference.
     * @see #setDeliverableDefinition(BusinessItemDefinition)
     * @see org.omg.vdml.VDMLPackage#getCapabilityDependency_DeliverableDefinition()
     * @see org.omg.vdml.BusinessItemDefinition#getCapabilityDependency
     * @model opposite="capabilityDependency" required="true" ordered="false"
     * @generated
     */
    BusinessItemDefinition getDeliverableDefinition();

    /**
     * Sets the value of the '{@link org.omg.vdml.CapabilityDependency#getDeliverableDefinition <em>Deliverable Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deliverable Definition</em>' reference.
     * @see #getDeliverableDefinition()
     * @generated
     */
    void setDeliverableDefinition(BusinessItemDefinition value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityDefinition#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(CapabilityDefinition)
     * @see org.omg.vdml.VDMLPackage#getCapabilityDependency_Source()
     * @see org.omg.vdml.CapabilityDefinition#getOutput
     * @model opposite="output" ordered="false"
     * @generated
     */
    CapabilityDefinition getSource();

    /**
     * Sets the value of the '{@link org.omg.vdml.CapabilityDependency#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(CapabilityDefinition value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityDefinition#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(CapabilityDefinition)
     * @see org.omg.vdml.VDMLPackage#getCapabilityDependency_Target()
     * @see org.omg.vdml.CapabilityDefinition#getInput
     * @model opposite="input" ordered="false"
     * @generated
     */
    CapabilityDefinition getTarget();

    /**
     * Sets the value of the '{@link org.omg.vdml.CapabilityDependency#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(CapabilityDefinition value);

    /**
     * Returns the value of the '<em><b>Is From External Source</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is From External Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is From External Source</em>' attribute.
     * @see #setIsFromExternalSource(Boolean)
     * @see org.omg.vdml.VDMLPackage#getCapabilityDependency_IsFromExternalSource()
     * @model default="true" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsFromExternalSource();

    /**
     * Sets the value of the '{@link org.omg.vdml.CapabilityDependency#getIsFromExternalSource <em>Is From External Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is From External Source</em>' attribute.
     * @see #getIsFromExternalSource()
     * @generated
     */
    void setIsFromExternalSource(Boolean value);

    /**
     * Returns the value of the '<em><b>Is For External Target</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is For External Target</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is For External Target</em>' attribute.
     * @see #setIsForExternalTarget(Boolean)
     * @see org.omg.vdml.VDMLPackage#getCapabilityDependency_IsForExternalTarget()
     * @model default="true" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsForExternalTarget();

    /**
     * Sets the value of the '{@link org.omg.vdml.CapabilityDependency#getIsForExternalTarget <em>Is For External Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is For External Target</em>' attribute.
     * @see #getIsForExternalTarget()
     * @generated
     */
    void setIsForExternalTarget(Boolean value);

} // CapabilityDependency
