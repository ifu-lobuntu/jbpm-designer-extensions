/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.Collaboration#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link org.omg.vdml.Collaboration#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.omg.vdml.Collaboration#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.omg.vdml.Collaboration#getBusinessItem <em>Business Item</em>}</li>
 *   <li>{@link org.omg.vdml.Collaboration#getInternalPortDelegation <em>Internal Port Delegation</em>}</li>
 *   <li>{@link org.omg.vdml.Collaboration#getDelegationContext <em>Delegation Context</em>}</li>
 *   <li>{@link org.omg.vdml.Collaboration#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.omg.vdml.Collaboration#getOwnedAssignment <em>Owned Assignment</em>}</li>
 *   <li>{@link org.omg.vdml.Collaboration#getSupplyingStore <em>Supplying Store</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends Participant, PortContainer {
    /**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.Role}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collaboration Role</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getCollaboration_CollaborationRole()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<Role> getCollaborationRole();

    /**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.Activity}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Activity#getOwningCollaboration <em>Owning Collaboration</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getCollaboration_Activity()
	 * @see org.omg.vdml.Activity#getOwningCollaboration
	 * @model opposite="owningCollaboration" containment="true" ordered="false"
	 * @generated
	 */
    EList<Activity> getActivity();

    /**
	 * Returns the value of the '<em><b>Flow</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.DeliverableFlow}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getCollaboration_Flow()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<DeliverableFlow> getFlow();

    /**
	 * Returns the value of the '<em><b>Business Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.BusinessItem}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Item</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Item</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getCollaboration_BusinessItem()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<BusinessItem> getBusinessItem();

    /**
	 * Returns the value of the '<em><b>Internal Port Delegation</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.PortDelegation}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Internal Port Delegation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Port Delegation</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getCollaboration_InternalPortDelegation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<PortDelegation> getInternalPortDelegation();

    /**
	 * Returns the value of the '<em><b>Delegation Context</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.DelegationContext}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.DelegationContext#getContextCollaboration <em>Context Collaboration</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegation Context</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Context</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getCollaboration_DelegationContext()
	 * @see org.omg.vdml.DelegationContext#getContextCollaboration
	 * @model opposite="contextCollaboration" ordered="false"
	 * @generated
	 */
    EList<DelegationContext> getDelegationContext();

    /**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.Scenario}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Scenario#getContextCollaboration <em>Context Collaboration</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scenario</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getCollaboration_Scenario()
	 * @see org.omg.vdml.Scenario#getContextCollaboration
	 * @model opposite="contextCollaboration" ordered="false"
	 * @generated
	 */
    EList<Scenario> getScenario();

    /**
	 * Returns the value of the '<em><b>Owned Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.Assignment}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Assignment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Assignment</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getCollaboration_OwnedAssignment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<Assignment> getOwnedAssignment();

				/**
	 * Returns the value of the '<em><b>Supplying Store</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.SupplyingStore}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.SupplyingStore#getCollaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplying Store</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplying Store</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getCollaboration_SupplyingStore()
	 * @see org.omg.vdml.SupplyingStore#getCollaboration
	 * @model opposite="collaboration" containment="true"
	 * @generated
	 */
	EList<SupplyingStore> getSupplyingStore();

} // Collaboration
