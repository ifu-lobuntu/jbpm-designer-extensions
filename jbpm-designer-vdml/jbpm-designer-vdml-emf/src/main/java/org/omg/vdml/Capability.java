/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;
import org.omg.smm.Characteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.Capability#getParentCabability <em>Parent Cabability</em>}</li>
 *   <li>{@link org.omg.vdml.Capability#getChildCapability <em>Child Capability</em>}</li>
 *   <li>{@link org.omg.vdml.Capability#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getCapability()
 * @model abstract="true"
 * @generated
 */
public interface Capability extends VdmlElement {
    /**
	 * Returns the value of the '<em><b>Parent Cabability</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.Capability}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Capability#getChildCapability <em>Child Capability</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Cabability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Cabability</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getCapability_ParentCabability()
	 * @see org.omg.vdml.Capability#getChildCapability
	 * @model opposite="childCapability" ordered="false"
	 * @generated
	 */
    EList<Capability> getParentCabability();

    /**
	 * Returns the value of the '<em><b>Child Capability</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.Capability}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Capability#getParentCabability <em>Parent Cabability</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child Capability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Capability</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getCapability_ChildCapability()
	 * @see org.omg.vdml.Capability#getParentCabability
	 * @model opposite="parentCabability" ordered="false"
	 * @generated
	 */
    EList<Capability> getChildCapability();

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
	 * @see org.omg.vdml.VDMLPackage#getCapability_CharacteristicDefinition()
	 * @model ordered="false"
	 * @generated
	 */
    EList<Characteristic> getCharacteristicDefinition();

} // Capability
