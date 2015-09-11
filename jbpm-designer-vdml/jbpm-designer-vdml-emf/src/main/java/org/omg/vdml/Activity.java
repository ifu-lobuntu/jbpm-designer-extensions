/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.Activity#getCapabilityRequirement <em>Capability Requirement</em>}</li>
 *   <li>{@link org.omg.vdml.Activity#getResourceUse <em>Resource Use</em>}</li>
 *   <li>{@link org.omg.vdml.Activity#getDelegationContext <em>Delegation Context</em>}</li>
 *   <li>{@link org.omg.vdml.Activity#getAppliedCapabilityOffer <em>Applied Capability Offer</em>}</li>
 *   <li>{@link org.omg.vdml.Activity#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.omg.vdml.Activity#getImplementedPractice <em>Implemented Practice</em>}</li>
 *   <li>{@link org.omg.vdml.Activity#getRecurrenceInterval <em>Recurrence Interval</em>}</li>
 *   <li>{@link org.omg.vdml.Activity#getPerformingRole <em>Performing Role</em>}</li>
 *   <li>{@link org.omg.vdml.Activity#getOwningCollaboration <em>Owning Collaboration</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends PortContainer {
    /**
	 * Returns the value of the '<em><b>Capability Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Requirement</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Requirement</em>' reference.
	 * @see #setCapabilityRequirement(Capability)
	 * @see org.omg.vdml.VDMLPackage#getActivity_CapabilityRequirement()
	 * @model ordered="false"
	 * @generated
	 */
    Capability getCapabilityRequirement();

    /**
	 * Sets the value of the '{@link org.omg.vdml.Activity#getCapabilityRequirement <em>Capability Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Requirement</em>' reference.
	 * @see #getCapabilityRequirement()
	 * @generated
	 */
    void setCapabilityRequirement(Capability value);

    /**
	 * Returns the value of the '<em><b>Resource Use</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.ResourceUse}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Use</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Use</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getActivity_ResourceUse()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<ResourceUse> getResourceUse();

    /**
	 * Returns the value of the '<em><b>Delegation Context</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.DelegationContext}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.DelegationContext#getDelegatedActivity <em>Delegated Activity</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegation Context</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Context</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getActivity_DelegationContext()
	 * @see org.omg.vdml.DelegationContext#getDelegatedActivity
	 * @model opposite="delegatedActivity" ordered="false"
	 * @generated
	 */
    EList<DelegationContext> getDelegationContext();

    /**
	 * Returns the value of the '<em><b>Applied Capability Offer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityOffer#getApplyingActivity <em>Applying Activity</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applied Capability Offer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Capability Offer</em>' reference.
	 * @see #setAppliedCapabilityOffer(CapabilityOffer)
	 * @see org.omg.vdml.VDMLPackage#getActivity_AppliedCapabilityOffer()
	 * @see org.omg.vdml.CapabilityOffer#getApplyingActivity
	 * @model opposite="applyingActivity" ordered="false"
	 * @generated
	 */
    CapabilityOffer getAppliedCapabilityOffer();

    /**
	 * Sets the value of the '{@link org.omg.vdml.Activity#getAppliedCapabilityOffer <em>Applied Capability Offer</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Capability Offer</em>' reference.
	 * @see #getAppliedCapabilityOffer()
	 * @generated
	 */
    void setAppliedCapabilityOffer(CapabilityOffer value);

    /**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(MeasuredCharacteristic)
	 * @see org.omg.vdml.VDMLPackage#getActivity_Duration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
    MeasuredCharacteristic getDuration();

    /**
	 * Sets the value of the '{@link org.omg.vdml.Activity#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
    void setDuration(MeasuredCharacteristic value);

    /**
	 * Returns the value of the '<em><b>Implemented Practice</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.PracticeDefinition}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Implemented Practice</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented Practice</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getActivity_ImplementedPractice()
	 * @model ordered="false"
	 * @generated
	 */
    EList<PracticeDefinition> getImplementedPractice();

    /**
	 * Returns the value of the '<em><b>Recurrence Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recurrence Interval</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Interval</em>' containment reference.
	 * @see #setRecurrenceInterval(MeasuredCharacteristic)
	 * @see org.omg.vdml.VDMLPackage#getActivity_RecurrenceInterval()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    MeasuredCharacteristic getRecurrenceInterval();

    /**
	 * Sets the value of the '{@link org.omg.vdml.Activity#getRecurrenceInterval <em>Recurrence Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Interval</em>' containment reference.
	 * @see #getRecurrenceInterval()
	 * @generated
	 */
    void setRecurrenceInterval(MeasuredCharacteristic value);

    /**
	 * Returns the value of the '<em><b>Performing Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Role#getPerformedWork <em>Performed Work</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Performing Role</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Performing Role</em>' reference.
	 * @see #setPerformingRole(Role)
	 * @see org.omg.vdml.VDMLPackage#getActivity_PerformingRole()
	 * @see org.omg.vdml.Role#getPerformedWork
	 * @model opposite="performedWork" ordered="false"
	 * @generated
	 */
    Role getPerformingRole();

    /**
	 * Sets the value of the '{@link org.omg.vdml.Activity#getPerformingRole <em>Performing Role</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performing Role</em>' reference.
	 * @see #getPerformingRole()
	 * @generated
	 */
    void setPerformingRole(Role value);

				/**
	 * Returns the value of the '<em><b>Owning Collaboration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Collaboration#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Collaboration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Collaboration</em>' container reference.
	 * @see #setOwningCollaboration(Collaboration)
	 * @see org.omg.vdml.VDMLPackage#getActivity_OwningCollaboration()
	 * @see org.omg.vdml.Collaboration#getActivity
	 * @model opposite="activity" transient="false"
	 * @generated
	 */
	Collaboration getOwningCollaboration();

				/**
	 * Sets the value of the '{@link org.omg.vdml.Activity#getOwningCollaboration <em>Owning Collaboration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Collaboration</em>' container reference.
	 * @see #getOwningCollaboration()
	 * @generated
	 */
	void setOwningCollaboration(Collaboration value);

} // Activity
