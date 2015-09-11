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
 *   <li>{@link org.omg.vdml.StoreDefinition#getResource <em>Resource</em>}</li>
 *   <li>{@link org.omg.vdml.StoreDefinition#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getStoreDefinition()
 * @model
 * @generated
 */
public interface StoreDefinition extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.BusinessItemDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getStoreDefinition_Resource()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BusinessItemDefinition> getResource();

	/**
	 * Returns the value of the '<em><b>Characteristic Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.smm.Characteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Definition</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getStoreDefinition_CharacteristicDefinition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Characteristic> getCharacteristicDefinition();

} // StoreDefinition
