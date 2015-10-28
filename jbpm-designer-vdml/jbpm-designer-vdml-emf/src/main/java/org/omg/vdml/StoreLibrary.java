/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.StoreLibrary#getStoreLibraryElement <em>Store Library Element</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getStoreLibrary()
 * @model
 * @generated
 */
public interface StoreLibrary extends VdmlElement {
	/**
	 * Returns the value of the '<em><b>Store Library Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.StoreLibraryElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Library Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Library Element</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getStoreLibrary_StoreLibraryElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<StoreLibraryElement> getStoreLibraryElement();

} // StoreLibrary
