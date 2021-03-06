/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.RoleCategory#getCategoryRole <em>Category Role</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getRoleCategory()
 * @model
 * @generated
 */
public interface RoleCategory extends VdmlElement {
    /**
	 * Returns the value of the '<em><b>Category Role</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.RoleDefinition}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.RoleDefinition#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Role</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Role</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getRoleCategory_CategoryRole()
	 * @see org.omg.vdml.RoleDefinition#getCategory
	 * @model opposite="category" ordered="false"
	 * @generated
	 */
    EList<RoleDefinition> getCategoryRole();

} // RoleCategory
