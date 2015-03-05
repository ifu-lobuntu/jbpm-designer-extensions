/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;
import org.pavanecce.vdml.metamodel.smm.Characteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getPracticeDefinition <em>Practice Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getSupportedCapability <em>Supported Capability</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#isFungible <em>Is Fungible</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCategory <em>Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#isShareable <em>Is Shareable</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#getCapabilityDependency <em>Capability Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemDefinition()
 * @model
 * @generated
 */
public interface BusinessItemDefinition extends BusinessItemLibraryElement {
    /**
     * Returns the value of the '<em><b>Practice Definition</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.PracticeDefinition}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.PracticeDefinition#getResourceDefinition <em>Resource Definition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Practice Definition</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Practice Definition</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemDefinition_PracticeDefinition()
     * @see org.pavanecce.vdml.metamodel.vdml.PracticeDefinition#getResourceDefinition
     * @model opposite="resourceDefinition" ordered="false"
     * @generated
     */
    EList<PracticeDefinition> getPracticeDefinition();

    /**
     * Returns the value of the '<em><b>Supported Capability</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition#getCapabilityResourceDefinition <em>Capability Resource Definition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supported Capability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supported Capability</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemDefinition_SupportedCapability()
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition#getCapabilityResourceDefinition
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
     * @see #setIsFungible(boolean)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemDefinition_IsFungible()
     * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isFungible();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#isFungible <em>Is Fungible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Fungible</em>' attribute.
     * @see #isFungible()
     * @generated
     */
    void setIsFungible(boolean value);

    /**
     * Returns the value of the '<em><b>Category</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getCategoryItem <em>Category Item</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemDefinition_Category()
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItemCategory#getCategoryItem
     * @model opposite="categoryItem" ordered="false"
     * @generated
     */
    EList<BusinessItemCategory> getCategory();

    /**
     * Returns the value of the '<em><b>Characteristic Definition</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.Characteristic}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Characteristic Definition</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Characteristic Definition</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemDefinition_CharacteristicDefinition()
     * @model ordered="false"
     * @generated
     */
    EList<Characteristic> getCharacteristicDefinition();

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
     * @see #setIsShareable(boolean)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemDefinition_IsShareable()
     * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isShareable();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition#isShareable <em>Is Shareable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Shareable</em>' attribute.
     * @see #isShareable()
     * @generated
     */
    void setIsShareable(boolean value);

    /**
     * Returns the value of the '<em><b>Capability Dependency</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#getDeliverableDefinition <em>Deliverable Definition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Dependency</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Dependency</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItemDefinition_CapabilityDependency()
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityDependency#getDeliverableDefinition
     * @model opposite="deliverableDefinition" ordered="false"
     * @generated
     */
    EList<CapabilityDependency> getCapabilityDependency();

} // BusinessItemDefinition
