/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Item Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getCategoryItem <em>Category Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemCategory()
 * @model
 * @generated
 */
public interface BusinessItemCategory extends BusinessItemLibraryElement {
    /**
     * Returns the value of the '<em><b>Parent Category</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getChildCategory <em>Child Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Category</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemCategory_ParentCategory()
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getChildCategory
     * @model opposite="childCategory" ordered="false"
     * @generated
     */
    EList<BusinessItemCategory> getParentCategory();

    /**
     * Returns the value of the '<em><b>Child Category</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getParentCategory <em>Parent Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child Category</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemCategory_ChildCategory()
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getParentCategory
     * @model opposite="parentCategory" ordered="false"
     * @generated
     */
    EList<BusinessItemCategory> getChildCategory();

    /**
     * Returns the value of the '<em><b>Category Item</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Item</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Item</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemCategory_CategoryItem()
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCategory
     * @model opposite="category" ordered="false"
     * @generated
     */
    EList<BusinessItemDefinition> getCategoryItem();

} // BusinessItemCategory
