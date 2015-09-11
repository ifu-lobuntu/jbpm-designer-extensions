/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.ValueProposition#getComponent <em>Component</em>}</li>
 *   <li>{@link org.omg.vdml.ValueProposition#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.omg.vdml.ValueProposition#getOverallSatisfaction <em>Overall Satisfaction</em>}</li>
 *   <li>{@link org.omg.vdml.ValueProposition#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getValueProposition()
 * @model
 * @generated
 */
public interface ValueProposition extends MeasurableElement {
    /**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.ValuePropositionComponent}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueProposition_Component()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<ValuePropositionComponent> getComponent();

    /**
	 * Returns the value of the '<em><b>Recipient</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Role#getReceivedProposition <em>Received Proposition</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recipient</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' reference.
	 * @see #setRecipient(Role)
	 * @see org.omg.vdml.VDMLPackage#getValueProposition_Recipient()
	 * @see org.omg.vdml.Role#getReceivedProposition
	 * @model opposite="receivedProposition" ordered="false"
	 * @generated
	 */
    Role getRecipient();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ValueProposition#getRecipient <em>Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' reference.
	 * @see #getRecipient()
	 * @generated
	 */
    void setRecipient(Role value);

    /**
	 * Returns the value of the '<em><b>Overall Satisfaction</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Overall Satisfaction</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Satisfaction</em>' reference.
	 * @see #setOverallSatisfaction(ValuePropositionComponent)
	 * @see org.omg.vdml.VDMLPackage#getValueProposition_OverallSatisfaction()
	 * @model ordered="false"
	 * @generated
	 */
    ValuePropositionComponent getOverallSatisfaction();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ValueProposition#getOverallSatisfaction <em>Overall Satisfaction</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Satisfaction</em>' reference.
	 * @see #getOverallSatisfaction()
	 * @generated
	 */
    void setOverallSatisfaction(ValuePropositionComponent value);

    /**
	 * Returns the value of the '<em><b>Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.Role#getProvidedProposition <em>Provided Proposition</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' container reference.
	 * @see #setProvider(Role)
	 * @see org.omg.vdml.VDMLPackage#getValueProposition_Provider()
	 * @see org.omg.vdml.Role#getProvidedProposition
	 * @model opposite="providedProposition" transient="false" ordered="false"
	 * @generated
	 */
    Role getProvider();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ValueProposition#getProvider <em>Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' container reference.
	 * @see #getProvider()
	 * @generated
	 */
    void setProvider(Role value);

} // ValueProposition
