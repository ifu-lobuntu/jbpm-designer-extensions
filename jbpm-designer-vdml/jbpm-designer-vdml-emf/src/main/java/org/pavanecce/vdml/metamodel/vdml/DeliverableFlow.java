/**
 */
package org.pavanecce.vdml.metamodel.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deliverable Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#isTangible <em>Is Tangible</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getDeliverable <em>Deliverable</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDeliverableFlow()
 * @model
 * @generated
 */
public interface DeliverableFlow extends MeasurableElement {
    /**
     * Returns the value of the '<em><b>Recipient</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.InputPort#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recipient</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Recipient</em>' reference.
     * @see #setRecipient(InputPort)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDeliverableFlow_Recipient()
     * @see org.pavanecce.vdml.metamodel.vdml.InputPort#getInput
     * @model opposite="input" required="true" ordered="false"
     * @generated
     */
    InputPort getRecipient();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getRecipient <em>Recipient</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recipient</em>' reference.
     * @see #getRecipient()
     * @generated
     */
    void setRecipient(InputPort value);

    /**
     * Returns the value of the '<em><b>Is Tangible</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Tangible</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Tangible</em>' attribute.
     * @see #setIsTangible(boolean)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDeliverableFlow_IsTangible()
     * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isTangible();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#isTangible <em>Is Tangible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Tangible</em>' attribute.
     * @see #isTangible()
     * @generated
     */
    void setIsTangible(boolean value);

    /**
     * Returns the value of the '<em><b>Deliverable</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getFlow <em>Flow</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deliverable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deliverable</em>' reference.
     * @see #setDeliverable(BusinessItem)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDeliverableFlow_Deliverable()
     * @see org.pavanecce.vdml.metamodel.vdml.BusinessItem#getFlow
     * @model opposite="flow" required="true" ordered="false"
     * @generated
     */
    BusinessItem getDeliverable();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getDeliverable <em>Deliverable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deliverable</em>' reference.
     * @see #getDeliverable()
     * @generated
     */
    void setDeliverable(BusinessItem value);

    /**
     * Returns the value of the '<em><b>Duration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duration</em>' containment reference.
     * @see #setDuration(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDeliverableFlow_Duration()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getDuration();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getDuration <em>Duration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration</em>' containment reference.
     * @see #getDuration()
     * @generated
     */
    void setDuration(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Channel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channel</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Channel</em>' attribute.
     * @see #setChannel(String)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDeliverableFlow_Channel()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getChannel();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getChannel <em>Channel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Channel</em>' attribute.
     * @see #getChannel()
     * @generated
     */
    void setChannel(String value);

    /**
     * Returns the value of the '<em><b>Provider</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider</em>' reference.
     * @see #setProvider(OutputPort)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getDeliverableFlow_Provider()
     * @see org.pavanecce.vdml.metamodel.vdml.OutputPort#getOutput
     * @model opposite="output" required="true" ordered="false"
     * @generated
     */
    OutputPort getProvider();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getProvider <em>Provider</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider</em>' reference.
     * @see #getProvider()
     * @generated
     */
    void setProvider(OutputPort value);

} // DeliverableFlow
