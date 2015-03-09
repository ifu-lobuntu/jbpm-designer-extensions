/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;
import org.omg.smm.Characteristic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Item Library Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.BusinessItemLibraryElement#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getBusinessItemLibraryElement()
 * @model abstract="true"
 * @generated
 */
public interface BusinessItemLibraryElement extends VdmlElement {

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
     * @see org.omg.vdml.VDMLPackage#getBusinessItemLibraryElement_CharacteristicDefinition()
     * @model ordered="false"
     * @generated
     */
    EList<Characteristic> getCharacteristicDefinition();
} // BusinessItemLibraryElement
