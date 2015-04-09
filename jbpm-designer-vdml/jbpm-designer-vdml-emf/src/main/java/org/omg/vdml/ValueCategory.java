/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.ValueCategory#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.omg.vdml.ValueCategory#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link org.omg.vdml.ValueCategory#getCategoryValue <em>Category Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getValueCategory()
 * @model
 * @generated
 */
public interface ValueCategory extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Parent Category</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.ValueCategory}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.ValueCategory#getChildCategory <em>Child Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Category</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getValueCategory_ParentCategory()
     * @see org.omg.vdml.ValueCategory#getChildCategory
     * @model opposite="childCategory" ordered="false"
     * @generated
     */
    EList<ValueCategory> getParentCategory();

    /**
     * Returns the value of the '<em><b>Child Category</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.ValueCategory}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.ValueCategory#getParentCategory <em>Parent Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child Category</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getValueCategory_ChildCategory()
     * @see org.omg.vdml.ValueCategory#getParentCategory
     * @model opposite="parentCategory" ordered="false"
     * @generated
     */
    EList<ValueCategory> getChildCategory();

    /**
     * Returns the value of the '<em><b>Category Value</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.ValueDefinition}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.ValueDefinition#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Value</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Value</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getValueCategory_CategoryValue()
     * @see org.omg.vdml.ValueDefinition#getCategory
     * @model opposite="category" ordered="false"
     * @generated
     */
    EList<ValueDefinition> getCategoryValue();

} // ValueCategory
