/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.Assignment#getAssignedRole <em>Assigned Role</em>}</li>
 *   <li>{@link org.omg.vdml.Assignment#getRoleResource <em>Role Resource</em>}</li>
 *   <li>{@link org.omg.vdml.Assignment#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends VdmlElement {
    /**
	 * Returns the value of the '<em><b>Assigned Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Role#getRoleAssignment <em>Role Assignment</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assigned Role</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Role</em>' reference.
	 * @see #setAssignedRole(Role)
	 * @see org.omg.vdml.VDMLPackage#getAssignment_AssignedRole()
	 * @see org.omg.vdml.Role#getRoleAssignment
	 * @model opposite="roleAssignment" required="true" ordered="false"
	 * @generated
	 */
    Role getAssignedRole();

    /**
	 * Sets the value of the '{@link org.omg.vdml.Assignment#getAssignedRole <em>Assigned Role</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Role</em>' reference.
	 * @see #getAssignedRole()
	 * @generated
	 */
    void setAssignedRole(Role value);

    /**
	 * Returns the value of the '<em><b>Role Resource</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.InputPort}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.InputPort#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Resource</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Resource</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getAssignment_RoleResource()
	 * @see org.omg.vdml.InputPort#getAssignment
	 * @model opposite="assignment" ordered="false"
	 * @generated
	 */
    EList<InputPort> getRoleResource();

    /**
	 * Returns the value of the '<em><b>Participant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Participant#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference.
	 * @see #setParticipant(Participant)
	 * @see org.omg.vdml.VDMLPackage#getAssignment_Participant()
	 * @see org.omg.vdml.Participant#getAssignment
	 * @model opposite="assignment" ordered="false"
	 * @generated
	 */
    Participant getParticipant();

    /**
	 * Sets the value of the '{@link org.omg.vdml.Assignment#getParticipant <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' reference.
	 * @see #getParticipant()
	 * @generated
	 */
    void setParticipant(Participant value);

} // Assignment
