/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practice Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.PracticeCategory#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.omg.vdml.PracticeCategory#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link org.omg.vdml.PracticeCategory#getCategoryPractice <em>Category Practice</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getPracticeCategory()
 * @model
 * @generated
 */
public interface PracticeCategory extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Parent Category</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.PracticeCategory}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.PracticeCategory#getChildCategory <em>Child Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Category</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getPracticeCategory_ParentCategory()
     * @see org.omg.vdml.PracticeCategory#getChildCategory
     * @model opposite="childCategory" ordered="false"
     * @generated
     */
    EList<PracticeCategory> getParentCategory();

    /**
     * Returns the value of the '<em><b>Child Category</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.PracticeCategory}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.PracticeCategory#getParentCategory <em>Parent Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child Category</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getPracticeCategory_ChildCategory()
     * @see org.omg.vdml.PracticeCategory#getParentCategory
     * @model opposite="parentCategory" ordered="false"
     * @generated
     */
    EList<PracticeCategory> getChildCategory();

    /**
     * Returns the value of the '<em><b>Category Practice</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.PracticeDefinition}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.PracticeDefinition#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Practice</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Practice</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getPracticeCategory_CategoryPractice()
     * @see org.omg.vdml.PracticeDefinition#getCategory
     * @model opposite="category" ordered="false"
     * @generated
     */
    EList<PracticeDefinition> getCategoryPractice();

} // PracticeCategory
