/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;
import org.omg.smm.Characteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.ValueDefinition#getCategory <em>Category</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDefinition#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getValueDefinition()
 * @model
 * @generated
 */
public interface ValueDefinition extends VdmlElement {
    /**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.ValueCategory}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.ValueCategory#getCategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDefinition_Category()
	 * @see org.omg.vdml.ValueCategory#getCategoryValue
	 * @model opposite="categoryValue" ordered="false"
	 * @generated
	 */
    EList<ValueCategory> getCategory();

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
	 * @see org.omg.vdml.VDMLPackage#getValueDefinition_CharacteristicDefinition()
	 * @model ordered="false"
	 * @generated
	 */
    EList<Characteristic> getCharacteristicDefinition();

} // ValueDefinition
