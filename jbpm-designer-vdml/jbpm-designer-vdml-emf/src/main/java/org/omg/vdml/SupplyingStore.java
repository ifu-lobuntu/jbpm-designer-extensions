/**
 */
package org.omg.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplying Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.SupplyingStore#getSupplyingRole <em>Supplying Role</em>}</li>
 *   <li>{@link org.omg.vdml.SupplyingStore#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.omg.vdml.SupplyingStore#getInventoryLevel <em>Inventory Level</em>}</li>
 *   <li>{@link org.omg.vdml.SupplyingStore#getResource <em>Resource</em>}</li>
 *   <li>{@link org.omg.vdml.SupplyingStore#getStoreRequirement <em>Store Requirement</em>}</li>
 *   <li>{@link org.omg.vdml.SupplyingStore#getCollaboration <em>Collaboration</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getSupplyingStore()
 * @model
 * @generated
 */
public interface SupplyingStore extends PortContainer {
	/**
	 * Returns the value of the '<em><b>Supplying Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Role#getSupplyingStore <em>Supplying Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplying Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplying Role</em>' reference.
	 * @see #setSupplyingRole(Role)
	 * @see org.omg.vdml.VDMLPackage#getSupplyingStore_SupplyingRole()
	 * @see org.omg.vdml.Role#getSupplyingStore
	 * @model opposite="supplyingStore" required="true" ordered="false"
	 * @generated
	 */
	Role getSupplyingRole();

	/**
	 * Sets the value of the '{@link org.omg.vdml.SupplyingStore#getSupplyingRole <em>Supplying Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplying Role</em>' reference.
	 * @see #getSupplyingRole()
	 * @generated
	 */
	void setSupplyingRole(Role value);

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
	 * @see org.omg.vdml.VDMLPackage#getSupplyingStore_Duration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getDuration();

	/**
	 * Sets the value of the '{@link org.omg.vdml.SupplyingStore#getDuration <em>Duration</em>}' containment reference.
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
	 * @see org.omg.vdml.VDMLPackage#getSupplyingStore_InventoryLevel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getInventoryLevel();

	/**
	 * Sets the value of the '{@link org.omg.vdml.SupplyingStore#getInventoryLevel <em>Inventory Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Level</em>' containment reference.
	 * @see #getInventoryLevel()
	 * @generated
	 */
	void setInventoryLevel(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(BusinessItem)
	 * @see org.omg.vdml.VDMLPackage#getSupplyingStore_Resource()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BusinessItem getResource();

	/**
	 * Sets the value of the '{@link org.omg.vdml.SupplyingStore#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(BusinessItem value);

	/**
	 * Returns the value of the '<em><b>Store Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Requirement</em>' reference.
	 * @see #setStoreRequirement(StoreDefinition)
	 * @see org.omg.vdml.VDMLPackage#getSupplyingStore_StoreRequirement()
	 * @model
	 * @generated
	 */
	StoreDefinition getStoreRequirement();

	/**
	 * Sets the value of the '{@link org.omg.vdml.SupplyingStore#getStoreRequirement <em>Store Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Requirement</em>' reference.
	 * @see #getStoreRequirement()
	 * @generated
	 */
	void setStoreRequirement(StoreDefinition value);

	/**
	 * Returns the value of the '<em><b>Collaboration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Collaboration#getSupplyingStore <em>Supplying Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration</em>' container reference.
	 * @see #setCollaboration(Collaboration)
	 * @see org.omg.vdml.VDMLPackage#getSupplyingStore_Collaboration()
	 * @see org.omg.vdml.Collaboration#getSupplyingStore
	 * @model opposite="supplyingStore" transient="false"
	 * @generated
	 */
	Collaboration getCollaboration();

	/**
	 * Sets the value of the '{@link org.omg.vdml.SupplyingStore#getCollaboration <em>Collaboration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaboration</em>' container reference.
	 * @see #getCollaboration()
	 * @generated
	 */
	void setCollaboration(Collaboration value);

} // SupplyingStore
