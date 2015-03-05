/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Assignment#getAssignedRole <em>Assigned Role</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Assignment#getRoleResource <em>Role Resource</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Assignment#getParticipant <em>Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Assigned Role</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Role#getRoleAssignment <em>Role Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assigned Role</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assigned Role</em>' reference.
     * @see #setAssignedRole(Role)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getAssignment_AssignedRole()
     * @see org.pavanecce.vdml.metamodel.vdml.Role#getRoleAssignment
     * @model opposite="roleAssignment" required="true" ordered="false"
     * @generated
     */
    Role getAssignedRole();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Assignment#getAssignedRole <em>Assigned Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Assigned Role</em>' reference.
     * @see #getAssignedRole()
     * @generated
     */
    void setAssignedRole(Role value);

    /**
     * Returns the value of the '<em><b>Role Resource</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.InputPort}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Resource</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Resource</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getAssignment_RoleResource()
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getAssignment
     * @model opposite="assignment" ordered="false"
     * @generated
     */
    EList<InputPort> getRoleResource();

    /**
     * Returns the value of the '<em><b>Participant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Participant#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant</em>' reference.
     * @see #setParticipant(Participant)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getAssignment_Participant()
     * @see org.pavanecce.vdml.metamodel.vdml.Participant#getAssignment
     * @model opposite="assignment" ordered="false"
     * @generated
     */
    Participant getParticipant();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Assignment#getParticipant <em>Participant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Participant</em>' reference.
     * @see #getParticipant()
     * @generated
     */
    void setParticipant(Participant value);

} // Assignment
