/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.StoreLibrary#getStoreDefinitions <em>Store Definitions</em>}</li>
 *   <li>{@link org.omg.vdml.StoreLibrary#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getStoreLibrary()
 * @model
 * @generated
 */
public interface StoreLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Store Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.StoreDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Definitions</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getStoreLibrary_StoreDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StoreDefinition> getStoreDefinitions();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' reference.
	 * @see #setLibrary(StoreLibrary)
	 * @see org.omg.vdml.VDMLPackage#getStoreLibrary_Library()
	 * @model
	 * @generated
	 */
	StoreLibrary getLibrary();

	/**
	 * Sets the value of the '{@link org.omg.vdml.StoreLibrary#getLibrary <em>Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(StoreLibrary value);

} // StoreLibrary
