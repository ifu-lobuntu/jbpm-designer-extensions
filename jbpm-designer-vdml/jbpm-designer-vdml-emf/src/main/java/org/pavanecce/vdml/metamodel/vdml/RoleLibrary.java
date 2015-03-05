/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.RoleLibrary#getRoleDefinition <em>Role Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.RoleLibrary#getRoleCategory <em>Role Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getRoleLibrary()
 * @model
 * @generated
 */
public interface RoleLibrary extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Role Definition</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.RoleDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Definition</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Definition</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getRoleLibrary_RoleDefinition()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<RoleDefinition> getRoleDefinition();

    /**
     * Returns the value of the '<em><b>Role Category</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.RoleCategory}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Category</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Category</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getRoleLibrary_RoleCategory()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<RoleCategory> getRoleCategory();

} // RoleLibrary
