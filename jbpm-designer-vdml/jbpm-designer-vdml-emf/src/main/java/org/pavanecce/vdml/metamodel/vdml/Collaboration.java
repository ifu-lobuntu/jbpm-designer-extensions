/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getBusinessItem <em>Business Item</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getInternalPortDelegation <em>Internal Port Delegation</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getDelegationContext <em>Delegation Context</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Collaboration#getOwnedAssignment <em>Owned Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends Participant, PortContainer {
    /**
     * Returns the value of the '<em><b>Collaboration Role</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Role}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collaboration Role</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collaboration Role</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCollaboration_CollaborationRole()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Role> getCollaborationRole();

    /**
     * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Activity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCollaboration_Activity()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Activity> getActivity();

    /**
     * Returns the value of the '<em><b>Flow</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCollaboration_Flow()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<DeliverableFlow> getFlow();

    /**
     * Returns the value of the '<em><b>Business Item</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.BusinessItem}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Item</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Business Item</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCollaboration_BusinessItem()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<BusinessItem> getBusinessItem();

    /**
     * Returns the value of the '<em><b>Internal Port Delegation</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.PortDelegation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Internal Port Delegation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Internal Port Delegation</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCollaboration_InternalPortDelegation()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<PortDelegation> getInternalPortDelegation();

    /**
     * Returns the value of the '<em><b>Delegation Context</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.DelegationContext}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getContextCollaboration <em>Context Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegation Context</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delegation Context</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCollaboration_DelegationContext()
     * @see org.pavanecce.vdml.metamodel.vdml.DelegationContext#getContextCollaboration
     * @model opposite="contextCollaboration" ordered="false"
     * @generated
     */
    EList<DelegationContext> getDelegationContext();

    /**
     * Returns the value of the '<em><b>Scenario</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Scenario}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Scenario#getContextCollaboration <em>Context Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scenario</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scenario</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCollaboration_Scenario()
     * @see org.pavanecce.vdml.metamodel.vdml.Scenario#getContextCollaboration
     * @model opposite="contextCollaboration" ordered="false"
     * @generated
     */
    EList<Scenario> getScenario();

    /**
     * Returns the value of the '<em><b>Owned Assignment</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Assignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Assignment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Assignment</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getCollaboration_OwnedAssignment()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Assignment> getOwnedAssignment();

} // Collaboration
