/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

import org.omg.smm.Characteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.StoreDefinition#getInventoryLevel <em>Inventory Level</em>}</li>
 *   <li>{@link org.omg.vdml.StoreDefinition#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.omg.vdml.StoreDefinition#getExchangeConfiguration <em>Exchange Configuration</em>}</li>
 *   <li>{@link org.omg.vdml.StoreDefinition#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getStoreDefinition()
 * @model
 * @generated
 */
public interface StoreDefinition extends StoreLibraryElement {
	/**
	 * Returns the value of the '<em><b>Inventory Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Level</em>' reference.
	 * @see #setInventoryLevel(Characteristic)
	 * @see org.omg.vdml.VDMLPackage#getStoreDefinition_InventoryLevel()
	 * @model
	 * @generated
	 */
	Characteristic getInventoryLevel();

	/**
	 * Sets the value of the '{@link org.omg.vdml.StoreDefinition#getInventoryLevel <em>Inventory Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Level</em>' reference.
	 * @see #getInventoryLevel()
	 * @generated
	 */
	void setInventoryLevel(Characteristic value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' reference.
	 * @see #setDuration(Characteristic)
	 * @see org.omg.vdml.VDMLPackage#getStoreDefinition_Duration()
	 * @model
	 * @generated
	 */
	Characteristic getDuration();

	/**
	 * Sets the value of the '{@link org.omg.vdml.StoreDefinition#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Characteristic value);

	/**
	 * Returns the value of the '<em><b>Exchange Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Configuration</em>' containment reference.
	 * @see #setExchangeConfiguration(ExchangeConfiguration)
	 * @see org.omg.vdml.VDMLPackage#getStoreDefinition_ExchangeConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	ExchangeConfiguration getExchangeConfiguration();

	/**
	 * Sets the value of the '{@link org.omg.vdml.StoreDefinition#getExchangeConfiguration <em>Exchange Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Configuration</em>' containment reference.
	 * @see #getExchangeConfiguration()
	 * @generated
	 */
	void setExchangeConfiguration(ExchangeConfiguration value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.StoreCategory}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.StoreCategory#getCategoryStore <em>Category Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getStoreDefinition_Category()
	 * @see org.omg.vdml.StoreCategory#getCategoryStore
	 * @model opposite="categoryStore"
	 * @generated
	 */
	EList<StoreCategory> getCategory();

} // StoreDefinition
