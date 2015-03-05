/**
 */
package org.pavanecce.vdml.metamodel.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Proposition Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getPercentageWeight <em>Percentage Weight</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getValueImpactForProvider <em>Value Impact For Provider</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getValueImpactForRecipient <em>Value Impact For Recipient</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getArticulatedValue <em>Articulated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValuePropositionComponent()
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValuePropositionComponent_PercentageWeight()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getPercentageWeight();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getPercentageWeight <em>Percentage Weight</em>}' containment reference.
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValuePropositionComponent_SatisfactionLevel()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getSatisfactionLevel();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getSatisfactionLevel <em>Satisfaction Level</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Satisfaction Level</em>' containment reference.
     * @see #getSatisfactionLevel()
     * @generated
     */
    void setSatisfactionLevel(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Value Impact For Provider</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Impact For Provider</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Impact For Provider</em>' containment reference.
     * @see #setValueImpactForProvider(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValuePropositionComponent_ValueImpactForProvider()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getValueImpactForProvider();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getValueImpactForProvider <em>Value Impact For Provider</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Impact For Provider</em>' containment reference.
     * @see #getValueImpactForProvider()
     * @generated
     */
    void setValueImpactForProvider(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Value Impact For Recipient</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Impact For Recipient</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Impact For Recipient</em>' containment reference.
     * @see #setValueImpactForRecipient(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValuePropositionComponent_ValueImpactForRecipient()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getValueImpactForRecipient();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getValueImpactForRecipient <em>Value Impact For Recipient</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Impact For Recipient</em>' containment reference.
     * @see #getValueImpactForRecipient()
     * @generated
     */
    void setValueImpactForRecipient(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Articulated Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd#getPropositionComponent <em>Proposition Component</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Articulated Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Articulated Value</em>' reference.
     * @see #setArticulatedValue(ValueAdd)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValuePropositionComponent_ArticulatedValue()
     * @see org.pavanecce.vdml.metamodel.vdml.ValueAdd#getPropositionComponent
     * @model opposite="propositionComponent" ordered="false"
     * @generated
     */
    ValueAdd getArticulatedValue();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getArticulatedValue <em>Articulated Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Articulated Value</em>' reference.
     * @see #getArticulatedValue()
     * @generated
     */
    void setArticulatedValue(ValueAdd value);

} // ValuePropositionComponent
