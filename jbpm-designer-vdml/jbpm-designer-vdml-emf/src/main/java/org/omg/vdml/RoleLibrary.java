/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.RoleLibrary#getRoleDefinition <em>Role Definition</em>}</li>
 *   <li>{@link org.omg.vdml.RoleLibrary#getRoleCategory <em>Role Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getRoleLibrary()
 * @model
 * @generated
 */
public interface RoleLibrary extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Role Definition</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.RoleDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Definition</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Definition</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getRoleLibrary_RoleDefinition()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<RoleDefinition> getRoleDefinition();

    /**
     * Returns the value of the '<em><b>Role Category</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.RoleCategory}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Category</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Category</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getRoleLibrary_RoleCategory()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<RoleCategory> getRoleCategory();

} // RoleLibrary
