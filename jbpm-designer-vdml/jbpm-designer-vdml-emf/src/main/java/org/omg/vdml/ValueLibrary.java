/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.ValueLibrary#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link org.omg.vdml.ValueLibrary#getValueCategory <em>Value Category</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getValueLibrary()
 * @model
 * @generated
 */
public interface ValueLibrary extends VdmlElement {
    /**
	 * Returns the value of the '<em><b>Value Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.ValueDefinition}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Definition</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Definition</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueLibrary_ValueDefinition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<ValueDefinition> getValueDefinition();

    /**
	 * Returns the value of the '<em><b>Value Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.ValueCategory}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Category</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Category</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueLibrary_ValueCategory()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<ValueCategory> getValueCategory();

} // ValueLibrary
