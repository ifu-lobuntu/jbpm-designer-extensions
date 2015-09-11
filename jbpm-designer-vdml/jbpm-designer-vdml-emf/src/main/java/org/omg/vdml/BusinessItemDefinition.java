/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.BusinessItemDefinition#getPracticeDefinition <em>Practice Definition</em>}</li>
 *   <li>{@link org.omg.vdml.BusinessItemDefinition#getSupportedCapability <em>Supported Capability</em>}</li>
 *   <li>{@link org.omg.vdml.BusinessItemDefinition#getIsFungible <em>Is Fungible</em>}</li>
 *   <li>{@link org.omg.vdml.BusinessItemDefinition#getCategory <em>Category</em>}</li>
 *   <li>{@link org.omg.vdml.BusinessItemDefinition#getIsShareable <em>Is Shareable</em>}</li>
 *   <li>{@link org.omg.vdml.BusinessItemDefinition#getCapabilityDependency <em>Capability Dependency</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getBusinessItemDefinition()
 * @model
 * @generated
 */
public interface BusinessItemDefinition extends BusinessItemLibraryElement {
    /**
	 * Returns the value of the '<em><b>Practice Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.PracticeDefinition}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.PracticeDefinition#getResourceDefinition <em>Resource Definition</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Practice Definition</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Practice Definition</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getBusinessItemDefinition_PracticeDefinition()
	 * @see org.omg.vdml.PracticeDefinition#getResourceDefinition
	 * @model opposite="resourceDefinition" ordered="false"
	 * @generated
	 */
    EList<PracticeDefinition> getPracticeDefinition();

    /**
	 * Returns the value of the '<em><b>Supported Capability</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.CapabilityDefinition}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityDefinition#getCapabilityResourceDefinition <em>Capability Resource Definition</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supported Capability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Capability</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getBusinessItemDefinition_SupportedCapability()
	 * @see org.omg.vdml.CapabilityDefinition#getCapabilityResourceDefinition
	 * @model opposite="capabilityResourceDefinition" ordered="false"
	 * @generated
	 */
    EList<CapabilityDefinition> getSupportedCapability();

    /**
	 * Returns the value of the '<em><b>Is Fungible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Fungible</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fungible</em>' attribute.
	 * @see #setIsFungible(Boolean)
	 * @see org.omg.vdml.VDMLPackage#getBusinessItemDefinition_IsFungible()
	 * @model default="true" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
    Boolean getIsFungible();

    /**
	 * Sets the value of the '{@link org.omg.vdml.BusinessItemDefinition#getIsFungible <em>Is Fungible</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fungible</em>' attribute.
	 * @see #getIsFungible()
	 * @generated
	 */
    void setIsFungible(Boolean value);

    /**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.BusinessItemCategory}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.BusinessItemCategory#getCategoryItem <em>Category Item</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getBusinessItemDefinition_Category()
	 * @see org.omg.vdml.BusinessItemCategory#getCategoryItem
	 * @model opposite="categoryItem" ordered="false"
	 * @generated
	 */
    EList<BusinessItemCategory> getCategory();

    /**
	 * Returns the value of the '<em><b>Is Shareable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Shareable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Shareable</em>' attribute.
	 * @see #setIsShareable(Boolean)
	 * @see org.omg.vdml.VDMLPackage#getBusinessItemDefinition_IsShareable()
	 * @model default="false" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
    Boolean getIsShareable();

    /**
	 * Sets the value of the '{@link org.omg.vdml.BusinessItemDefinition#getIsShareable <em>Is Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Shareable</em>' attribute.
	 * @see #getIsShareable()
	 * @generated
	 */
    void setIsShareable(Boolean value);

    /**
	 * Returns the value of the '<em><b>Capability Dependency</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.CapabilityDependency}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityDependency#getDeliverableDefinition <em>Deliverable Definition</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Dependency</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Dependency</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getBusinessItemDefinition_CapabilityDependency()
	 * @see org.omg.vdml.CapabilityDependency#getDeliverableDefinition
	 * @model opposite="deliverableDefinition" ordered="false"
	 * @generated
	 */
    EList<CapabilityDependency> getCapabilityDependency();

} // BusinessItemDefinition
