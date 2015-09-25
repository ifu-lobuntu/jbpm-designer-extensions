/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.CapabilityMethod#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityMethod#getMethodOwner <em>Method Owner</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityMethod#getImplementedPractice <em>Implemented Practice</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityMethod#getMethodResource <em>Method Resource</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityMethod#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityMethod#getSupportedCapability <em>Supported Capability</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityMethod#getInitialActivity <em>Initial Activity</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityMethod#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityMethod#getPlanningRole <em>Planning Role</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getCapabilityMethod()
 * @model
 * @generated
 */
public interface CapabilityMethod extends Collaboration {
    /**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.Performer}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Performer</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getCapabilityMethod_Performer()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<Performer> getPerformer();

    /**
	 * Returns the value of the '<em><b>Method Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.OrgUnit#getOwnedMethod <em>Owned Method</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Method Owner</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Owner</em>' container reference.
	 * @see #setMethodOwner(OrgUnit)
	 * @see org.omg.vdml.VDMLPackage#getCapabilityMethod_MethodOwner()
	 * @see org.omg.vdml.OrgUnit#getOwnedMethod
	 * @model opposite="ownedMethod" required="true" transient="false" ordered="false"
	 * @generated
	 */
    OrgUnit getMethodOwner();

    /**
	 * Sets the value of the '{@link org.omg.vdml.CapabilityMethod#getMethodOwner <em>Method Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Owner</em>' container reference.
	 * @see #getMethodOwner()
	 * @generated
	 */
    void setMethodOwner(OrgUnit value);

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
	 * @see org.omg.vdml.VDMLPackage#getCapabilityMethod_ImplementedPractice()
	 * @model ordered="false"
	 * @generated
	 */
    EList<PracticeDefinition> getImplementedPractice();

    /**
	 * Returns the value of the '<em><b>Method Resource</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.BusinessItem}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.BusinessItem#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Method Resource</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Resource</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getCapabilityMethod_MethodResource()
	 * @see org.omg.vdml.BusinessItem#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
    EList<BusinessItem> getMethodResource();

    /**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(Capability)
	 * @see org.omg.vdml.VDMLPackage#getCapabilityMethod_Definition()
	 * @model ordered="false"
	 * @generated
	 */
	Capability getDefinition();

				/**
	 * Sets the value of the '{@link org.omg.vdml.CapabilityMethod#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Capability value);

				/**
	 * Returns the value of the '<em><b>Supported Capability</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.CapabilityOffer}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityOffer#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supported Capability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Capability</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getCapabilityMethod_SupportedCapability()
	 * @see org.omg.vdml.CapabilityOffer#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
    EList<CapabilityOffer> getSupportedCapability();

				/**
	 * Returns the value of the '<em><b>Initial Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Activity</em>' reference.
	 * @see #setInitialActivity(Activity)
	 * @see org.omg.vdml.VDMLPackage#getCapabilityMethod_InitialActivity()
	 * @model
	 * @generated
	 */
	Activity getInitialActivity();

				/**
	 * Sets the value of the '{@link org.omg.vdml.CapabilityMethod#getInitialActivity <em>Initial Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Activity</em>' reference.
	 * @see #getInitialActivity()
	 * @generated
	 */
	void setInitialActivity(Activity value);

				/**
	 * Returns the value of the '<em><b>Milestone</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.Milestone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Milestone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestone</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getCapabilityMethod_Milestone()
	 * @model containment="true"
	 * @generated
	 */
	EList<Milestone> getMilestone();

				/**
	 * Returns the value of the '<em><b>Planning Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planning Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Role</em>' reference.
	 * @see #setPlanningRole(Role)
	 * @see org.omg.vdml.VDMLPackage#getCapabilityMethod_PlanningRole()
	 * @model
	 * @generated
	 */
	Role getPlanningRole();

				/**
	 * Sets the value of the '{@link org.omg.vdml.CapabilityMethod#getPlanningRole <em>Planning Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Role</em>' reference.
	 * @see #getPlanningRole()
	 * @generated
	 */
	void setPlanningRole(Role value);

} // CapabilityMethod
