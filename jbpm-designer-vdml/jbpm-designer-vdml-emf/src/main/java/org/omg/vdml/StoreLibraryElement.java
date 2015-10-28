/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;
import org.omg.smm.Characteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Library Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.StoreLibraryElement#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 *   <li>{@link org.omg.vdml.StoreLibraryElement#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getStoreLibraryElement()
 * @model
 * @generated
 */
public interface StoreLibraryElement extends VdmlElement {
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
	 * @see org.omg.vdml.VDMLPackage#getStoreLibraryElement_CharacteristicDefinition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Characteristic> getCharacteristicDefinition();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(BusinessItemLibraryElement)
	 * @see org.omg.vdml.VDMLPackage#getStoreLibraryElement_Resource()
	 * @model ordered="false"
	 * @generated
	 */
	BusinessItemLibraryElement getResource();

	/**
	 * Sets the value of the '{@link org.omg.vdml.StoreLibraryElement#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(BusinessItemLibraryElement value);

} // StoreLibraryElement
