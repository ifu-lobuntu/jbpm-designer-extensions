/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practice Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getCategoryPractice <em>Category Practice</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPracticeCategory()
 * @model
 * @generated
 */
public interface PracticeCategory extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Parent Category</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getChildCategory <em>Child Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Category</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPracticeCategory_ParentCategory()
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getChildCategory
     * @model opposite="childCategory" ordered="false"
     * @generated
     */
    EList<PracticeCategory> getParentCategory();

    /**
     * Returns the value of the '<em><b>Child Category</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getParentCategory <em>Parent Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child Category</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPracticeCategory_ChildCategory()
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeCategory#getParentCategory
     * @model opposite="parentCategory" ordered="false"
     * @generated
     */
    EList<PracticeCategory> getChildCategory();

    /**
     * Returns the value of the '<em><b>Category Practice</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.PracticeDefinition}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.PracticeDefinition#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Practice</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Practice</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPracticeCategory_CategoryPractice()
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeDefinition#getCategory
     * @model opposite="category" ordered="false"
     * @generated
     */
    EList<PracticeDefinition> getCategoryPractice();

} // PracticeCategory
