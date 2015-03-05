/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Store#getStoreOwner <em>Store Owner</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Store#getStoreContext <em>Store Context</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Store#getSupportedCapability <em>Supported Capability</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Store#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Store#getInventoryLevel <em>Inventory Level</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Store#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends PortContainer {
    /**
     * Returns the value of the '<em><b>Store Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.OrgUnit#getOwnedStore <em>Owned Store</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Store Owner</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Store Owner</em>' container reference.
     * @see #setStoreOwner(OrgUnit)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getStore_StoreOwner()
     * @see org.pavanecce.vdml.metamodel.vdml.OrgUnit#getOwnedStore
     * @model opposite="ownedStore" required="true" transient="false" ordered="false"
     * @generated
     */
    OrgUnit getStoreOwner();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Store#getStoreOwner <em>Store Owner</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Store Owner</em>' container reference.
     * @see #getStoreOwner()
     * @generated
     */
    void setStoreOwner(OrgUnit value);

    /**
     * Returns the value of the '<em><b>Store Context</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextStore <em>Context Store</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Store Context</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Store Context</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getStore_StoreContext()
     * @see org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextStore
     * @model opposite="contextStore" ordered="false"
     * @generated
     */
    EList<AnalysisContext> getStoreContext();

    /**
     * Returns the value of the '<em><b>Supported Capability</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getCapabilityResource <em>Capability Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supported Capability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supported Capability</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getStore_SupportedCapability()
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityOffer#getCapabilityResource
     * @model opposite="capabilityResource" ordered="false"
     * @generated
     */
    EList<CapabilityOffer> getSupportedCapability();

    /**
     * Returns the value of the '<em><b>Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duration</em>' containment reference.
     * @see #setDuration(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getStore_Duration()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getDuration();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Store#getDuration <em>Duration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration</em>' containment reference.
     * @see #getDuration()
     * @generated
     */
    void setDuration(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Inventory Level</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inventory Level</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inventory Level</em>' containment reference.
     * @see #setInventoryLevel(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getStore_InventoryLevel()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getInventoryLevel();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Store#getInventoryLevel <em>Inventory Level</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inventory Level</em>' containment reference.
     * @see #getInventoryLevel()
     * @generated
     */
    void setInventoryLevel(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Resource</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getStore <em>Store</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' reference.
     * @see #setResource(BusinessItem)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getStore_Resource()
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItem#getStore
     * @model opposite="store" required="true" ordered="false"
     * @generated
     */
    BusinessItem getResource();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Store#getResource <em>Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource</em>' reference.
     * @see #getResource()
     * @generated
     */
    void setResource(BusinessItem value);

} // Store
