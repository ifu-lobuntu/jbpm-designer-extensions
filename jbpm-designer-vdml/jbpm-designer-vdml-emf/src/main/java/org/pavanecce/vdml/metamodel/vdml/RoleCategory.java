/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.RoleCategory#getCategoryRole <em>Category Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getRoleCategory()
 * @model
 * @generated
 */
public interface RoleCategory extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Category Role</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.RoleDefinition}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.RoleDefinition#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Role</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Role</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getRoleCategory_CategoryRole()
     * @see org.pavanecce.vdml.metamodel.vdml.RoleDefinition#getCategory
     * @model opposite="category" ordered="false"
     * @generated
     */
    EList<RoleDefinition> getCategoryRole();

} // RoleCategory
