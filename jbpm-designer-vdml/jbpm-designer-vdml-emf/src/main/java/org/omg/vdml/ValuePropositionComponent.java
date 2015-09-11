/**
 */
package org.omg.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Proposition Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.ValuePropositionComponent#getPercentageWeight <em>Percentage Weight</em>}</li>
 *   <li>{@link org.omg.vdml.ValuePropositionComponent#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getValuePropositionComponent()
 * @model
 * @generated
 */
public interface ValuePropositionComponent extends ValueElement {
    /**
	 * Returns the value of the '<em><b>Percentage Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Percentage Weight</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Weight</em>' containment reference.
	 * @see #setPercentageWeight(MeasuredCharacteristic)
	 * @see org.omg.vdml.VDMLPackage#getValuePropositionComponent_PercentageWeight()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    MeasuredCharacteristic getPercentageWeight();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ValuePropositionComponent#getPercentageWeight <em>Percentage Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Weight</em>' containment reference.
	 * @see #getPercentageWeight()
	 * @generated
	 */
    void setPercentageWeight(MeasuredCharacteristic value);

    /**
	 * Returns the value of the '<em><b>Satisfaction Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Satisfaction Level</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfaction Level</em>' containment reference.
	 * @see #setSatisfactionLevel(MeasuredCharacteristic)
	 * @see org.omg.vdml.VDMLPackage#getValuePropositionComponent_SatisfactionLevel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    MeasuredCharacteristic getSatisfactionLevel();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ValuePropositionComponent#getSatisfactionLevel <em>Satisfaction Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfaction Level</em>' containment reference.
	 * @see #getSatisfactionLevel()
	 * @generated
	 */
    void setSatisfactionLevel(MeasuredCharacteristic value);

} // ValuePropositionComponent
