/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practice Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.PracticeDefinition#getCategory <em>Category</em>}</li>
 *   <li>{@link org.omg.vdml.PracticeDefinition#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.omg.vdml.PracticeDefinition#getResourceDefinition <em>Resource Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getPracticeDefinition()
 * @model
 * @generated
 */
public interface PracticeDefinition extends VdmlElement {
    /**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.PracticeCategory}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.PracticeCategory#getCategoryPractice <em>Category Practice</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getPracticeDefinition_Category()
	 * @see org.omg.vdml.PracticeCategory#getCategoryPractice
	 * @model opposite="categoryPractice" ordered="false"
	 * @generated
	 */
    EList<PracticeCategory> getCategory();

    /**
	 * Returns the value of the '<em><b>Capability</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.CapabilityDefinition}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityDefinition#getPracticeDefinition <em>Practice Definition</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getPracticeDefinition_Capability()
	 * @see org.omg.vdml.CapabilityDefinition#getPracticeDefinition
	 * @model opposite="practiceDefinition" ordered="false"
	 * @generated
	 */
    EList<CapabilityDefinition> getCapability();

    /**
	 * Returns the value of the '<em><b>Resource Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.BusinessItemDefinition}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.BusinessItemDefinition#getPracticeDefinition <em>Practice Definition</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Definition</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Definition</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getPracticeDefinition_ResourceDefinition()
	 * @see org.omg.vdml.BusinessItemDefinition#getPracticeDefinition
	 * @model opposite="practiceDefinition" ordered="false"
	 * @generated
	 */
    EList<BusinessItemDefinition> getResourceDefinition();

} // PracticeDefinition
