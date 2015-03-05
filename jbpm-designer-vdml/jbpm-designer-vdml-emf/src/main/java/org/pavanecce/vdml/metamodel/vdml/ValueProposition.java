/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getComponent <em>Component</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getPropositionValue <em>Proposition Value</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getValueImpactForProvider <em>Value Impact For Provider</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getValueImpactForRecipient <em>Value Impact For Recipient</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueProposition()
 * @model
 * @generated
 */
public interface ValueProposition extends MeasurableElement {
    /**
     * Returns the value of the '<em><b>Component</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueProposition_Component()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ValuePropositionComponent> getComponent();

    /**
     * Returns the value of the '<em><b>Recipient</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Role#getReceivedProposition <em>Received Proposition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recipient</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Recipient</em>' reference.
     * @see #setRecipient(Role)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueProposition_Recipient()
     * @see org.pavanecce.vdml.metamodel.vdml.Role#getReceivedProposition
     * @model opposite="receivedProposition" ordered="false"
     * @generated
     */
    Role getRecipient();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getRecipient <em>Recipient</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recipient</em>' reference.
     * @see #getRecipient()
     * @generated
     */
    void setRecipient(Role value);

    /**
     * Returns the value of the '<em><b>Proposition Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Proposition Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Proposition Value</em>' containment reference.
     * @see #setPropositionValue(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueProposition_PropositionValue()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getPropositionValue();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getPropositionValue <em>Proposition Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Proposition Value</em>' containment reference.
     * @see #getPropositionValue()
     * @generated
     */
    void setPropositionValue(MeasuredCharacteristic value);

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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueProposition_SatisfactionLevel()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getSatisfactionLevel();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getSatisfactionLevel <em>Satisfaction Level</em>}' containment reference.
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueProposition_ValueImpactForProvider()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getValueImpactForProvider();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getValueImpactForProvider <em>Value Impact For Provider</em>}' containment reference.
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueProposition_ValueImpactForRecipient()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getValueImpactForRecipient();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getValueImpactForRecipient <em>Value Impact For Recipient</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Impact For Recipient</em>' containment reference.
     * @see #getValueImpactForRecipient()
     * @generated
     */
    void setValueImpactForRecipient(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Provider</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Role#getProvidedProposition <em>Provided Proposition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider</em>' container reference.
     * @see #setProvider(Role)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueProposition_Provider()
     * @see org.pavanecce.vdml.metamodel.vdml.Role#getProvidedProposition
     * @model opposite="providedProposition" required="true" transient="false" ordered="false"
     * @generated
     */
    Role getProvider();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ValueProposition#getProvider <em>Provider</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider</em>' container reference.
     * @see #getProvider()
     * @generated
     */
    void setProvider(Role value);

} // ValueProposition
