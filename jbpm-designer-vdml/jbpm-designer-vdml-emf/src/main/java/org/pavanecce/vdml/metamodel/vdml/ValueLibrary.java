/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueLibrary#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueLibrary#getValueCategory <em>Value Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueLibrary()
 * @model
 * @generated
 */
public interface ValueLibrary extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Value Definition</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.ValueDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Definition</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Definition</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueLibrary_ValueDefinition()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ValueDefinition> getValueDefinition();

    /**
     * Returns the value of the '<em><b>Value Category</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.ValueCategory}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Category</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Category</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueLibrary_ValueCategory()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ValueCategory> getValueCategory();

} // ValueLibrary
