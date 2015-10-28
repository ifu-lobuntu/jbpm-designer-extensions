/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.StoreCategory#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link org.omg.vdml.StoreCategory#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.omg.vdml.StoreCategory#getCategoryStore <em>Category Store</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getStoreCategory()
 * @model
 * @generated
 */
public interface StoreCategory extends StoreLibraryElement {
	/**
	 * Returns the value of the '<em><b>Child Category</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.StoreCategory}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.StoreCategory#getParentCategory <em>Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Category</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getStoreCategory_ChildCategory()
	 * @see org.omg.vdml.StoreCategory#getParentCategory
	 * @model opposite="parentCategory"
	 * @generated
	 */
	EList<StoreCategory> getChildCategory();

	/**
	 * Returns the value of the '<em><b>Parent Category</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.StoreCategory}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.StoreCategory#getChildCategory <em>Child Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Category</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getStoreCategory_ParentCategory()
	 * @see org.omg.vdml.StoreCategory#getChildCategory
	 * @model opposite="childCategory"
	 * @generated
	 */
	EList<StoreCategory> getParentCategory();

	/**
	 * Returns the value of the '<em><b>Category Store</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.StoreDefinition}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.StoreDefinition#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Store</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Store</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getStoreCategory_CategoryStore()
	 * @see org.omg.vdml.StoreDefinition#getCategory
	 * @model opposite="category"
	 * @generated
	 */
	EList<StoreDefinition> getCategoryStore();

} // StoreCategory
