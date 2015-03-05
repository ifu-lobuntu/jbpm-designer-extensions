/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practice Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.PracticeLibrary#getPracticeDefinition <em>Practice Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.PracticeLibrary#getPracticeCategory <em>Practice Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPracticeLibrary()
 * @model
 * @generated
 */
public interface PracticeLibrary extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Practice Definition</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.PracticeDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Practice Definition</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Practice Definition</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPracticeLibrary_PracticeDefinition()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<PracticeDefinition> getPracticeDefinition();

    /**
     * Returns the value of the '<em><b>Practice Category</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.PracticeCategory}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Practice Category</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Practice Category</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPracticeLibrary_PracticeCategory()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<PracticeCategory> getPracticeCategory();

} // PracticeLibrary
