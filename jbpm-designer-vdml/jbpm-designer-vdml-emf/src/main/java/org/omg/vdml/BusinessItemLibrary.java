/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Item Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.BusinessItemLibrary#getBusinessItemLibraryElement <em>Business Item Library Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getBusinessItemLibrary()
 * @model
 * @generated
 */
public interface BusinessItemLibrary extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Business Item Library Element</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.BusinessItemLibraryElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Item Library Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Business Item Library Element</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getBusinessItemLibrary_BusinessItemLibraryElement()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<BusinessItemLibraryElement> getBusinessItemLibraryElement();

} // BusinessItemLibrary
