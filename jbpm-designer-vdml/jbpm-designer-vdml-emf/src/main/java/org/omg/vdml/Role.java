/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.Role#getPerformedWork <em>Performed Work</em>}</li>
 *   <li>{@link org.omg.vdml.Role#getPort <em>Port</em>}</li>
 *   <li>{@link org.omg.vdml.Role#getProvidedProposition <em>Provided Proposition</em>}</li>
 *   <li>{@link org.omg.vdml.Role#getReceivedProposition <em>Received Proposition</em>}</li>
 *   <li>{@link org.omg.vdml.Role#getIsLead <em>Is Lead</em>}</li>
 *   <li>{@link org.omg.vdml.Role#getRoleDefinition <em>Role Definition</em>}</li>
 *   <li>{@link org.omg.vdml.Role#getRoleAssignment <em>Role Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Participant {
    /**
     * Returns the value of the '<em><b>Performed Work</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.Activity}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.Activity#getPerformingRole <em>Performing Role</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Performed Work</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Performed Work</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getRole_PerformedWork()
     * @see org.omg.vdml.Activity#getPerformingRole
     * @model opposite="performingRole" ordered="false"
     * @generated
     */
    EList<Activity> getPerformedWork();

    /**
     * Returns the value of the '<em><b>Port</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.Port}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.Port#getHandler <em>Handler</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getRole_Port()
     * @see org.omg.vdml.Port#getHandler
     * @model opposite="handler" ordered="false"
     * @generated
     */
    EList<Port> getPort();

    /**
     * Returns the value of the '<em><b>Provided Proposition</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.ValueProposition}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.ValueProposition#getProvider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provided Proposition</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provided Proposition</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getRole_ProvidedProposition()
     * @see org.omg.vdml.ValueProposition#getProvider
     * @model opposite="provider" containment="true" ordered="false"
     * @generated
     */
    EList<ValueProposition> getProvidedProposition();

    /**
     * Returns the value of the '<em><b>Received Proposition</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.ValueProposition}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.ValueProposition#getRecipient <em>Recipient</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Received Proposition</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Received Proposition</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getRole_ReceivedProposition()
     * @see org.omg.vdml.ValueProposition#getRecipient
     * @model opposite="recipient" ordered="false"
     * @generated
     */
    EList<ValueProposition> getReceivedProposition();

    /**
     * Returns the value of the '<em><b>Is Lead</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Lead</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Lead</em>' attribute.
     * @see #setIsLead(Boolean)
     * @see org.omg.vdml.VDMLPackage#getRole_IsLead()
     * @model default="false" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsLead();

    /**
     * Sets the value of the '{@link org.omg.vdml.Role#getIsLead <em>Is Lead</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Lead</em>' attribute.
     * @see #getIsLead()
     * @generated
     */
    void setIsLead(Boolean value);

    /**
     * Returns the value of the '<em><b>Role Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Definition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Definition</em>' reference.
     * @see #setRoleDefinition(RoleDefinition)
     * @see org.omg.vdml.VDMLPackage#getRole_RoleDefinition()
     * @model ordered="false"
     * @generated
     */
    RoleDefinition getRoleDefinition();

    /**
     * Sets the value of the '{@link org.omg.vdml.Role#getRoleDefinition <em>Role Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role Definition</em>' reference.
     * @see #getRoleDefinition()
     * @generated
     */
    void setRoleDefinition(RoleDefinition value);

    /**
     * Returns the value of the '<em><b>Role Assignment</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.Assignment}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.Assignment#getAssignedRole <em>Assigned Role</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Assignment</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Assignment</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getRole_RoleAssignment()
     * @see org.omg.vdml.Assignment#getAssignedRole
     * @model opposite="assignedRole" ordered="false"
     * @generated
     */
    EList<Assignment> getRoleAssignment();

} // Role
