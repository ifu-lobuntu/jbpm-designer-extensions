/**
 */
package org.omg.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.Milestone#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends MeasurableElement {

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' reference.
	 * @see #setOffset(MeasuredCharacteristic)
	 * @see org.omg.vdml.VDMLPackage#getMilestone_Offset()
	 * @model
	 * @generated
	 */
	MeasuredCharacteristic getOffset();

	/**
	 * Sets the value of the '{@link org.omg.vdml.Milestone#getOffset <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(MeasuredCharacteristic value);
} // Milestone
