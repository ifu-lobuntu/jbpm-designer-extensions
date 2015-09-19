/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.ResourceUse#getDeliverable <em>Deliverable</em>}</li>
 *   <li>{@link org.omg.vdml.ResourceUse#getResource <em>Resource</em>}</li>
 *   <li>{@link org.omg.vdml.ResourceUse#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.omg.vdml.ResourceUse#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.omg.vdml.ResourceUse#getPlanningPercentage <em>Planning Percentage</em>}</li>
 *   <li>{@link org.omg.vdml.ResourceUse#getInputDriven <em>Input Driven</em>}</li>
 *   <li>{@link org.omg.vdml.ResourceUse#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.vdml.ResourceUse#getIsExclusive <em>Is Exclusive</em>}</li>
 *   <li>{@link org.omg.vdml.ResourceUse#getResourceIsConsumed <em>Resource Is Consumed</em>}</li>
 *   <li>{@link org.omg.vdml.ResourceUse#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getResourceUse()
 * @model
 * @generated
 */
public interface ResourceUse extends MeasurableElement {
    /**
	 * Returns the value of the '<em><b>Deliverable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.OutputPort#getResourceUse <em>Resource Use</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deliverable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverable</em>' reference.
	 * @see #setDeliverable(OutputPort)
	 * @see org.omg.vdml.VDMLPackage#getResourceUse_Deliverable()
	 * @see org.omg.vdml.OutputPort#getResourceUse
	 * @model opposite="resourceUse" ordered="false"
	 * @generated
	 */
    OutputPort getDeliverable();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ResourceUse#getDeliverable <em>Deliverable</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverable</em>' reference.
	 * @see #getDeliverable()
	 * @generated
	 */
    void setDeliverable(OutputPort value);

    /**
	 * Returns the value of the '<em><b>Resource</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.InputPort}.
	 * It is bidirectional and its opposite is '{@link org.omg.vdml.InputPort#getResourceUse <em>Resource Use</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getResourceUse_Resource()
	 * @see org.omg.vdml.InputPort#getResourceUse
	 * @model opposite="resourceUse"
	 * @generated
	 */
    EList<InputPort> getResource();

    /**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(MeasuredCharacteristic)
	 * @see org.omg.vdml.VDMLPackage#getResourceUse_Quantity()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
    MeasuredCharacteristic getQuantity();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ResourceUse#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
    void setQuantity(MeasuredCharacteristic value);

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
	 * @see org.omg.vdml.VDMLPackage#getResourceUse_Duration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    MeasuredCharacteristic getDuration();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ResourceUse#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
    void setDuration(MeasuredCharacteristic value);

    /**
	 * Returns the value of the '<em><b>Planning Percentage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Planning Percentage</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Percentage</em>' containment reference.
	 * @see #setPlanningPercentage(MeasuredCharacteristic)
	 * @see org.omg.vdml.VDMLPackage#getResourceUse_PlanningPercentage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    MeasuredCharacteristic getPlanningPercentage();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ResourceUse#getPlanningPercentage <em>Planning Percentage</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Percentage</em>' containment reference.
	 * @see #getPlanningPercentage()
	 * @generated
	 */
    void setPlanningPercentage(MeasuredCharacteristic value);

    /**
	 * Returns the value of the '<em><b>Input Driven</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Driven</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Driven</em>' attribute.
	 * @see #setInputDriven(Boolean)
	 * @see org.omg.vdml.VDMLPackage#getResourceUse_InputDriven()
	 * @model default="false" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
    Boolean getInputDriven();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ResourceUse#getInputDriven <em>Input Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Driven</em>' attribute.
	 * @see #getInputDriven()
	 * @generated
	 */
    void setInputDriven(Boolean value);

    /**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.omg.vdml.VDMLPackage#getResourceUse_Condition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    Expression getCondition();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ResourceUse#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
    void setCondition(Expression value);

    /**
	 * Returns the value of the '<em><b>Is Exclusive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Exclusive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exclusive</em>' attribute.
	 * @see #setIsExclusive(Boolean)
	 * @see org.omg.vdml.VDMLPackage#getResourceUse_IsExclusive()
	 * @model default="false" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
    Boolean getIsExclusive();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ResourceUse#getIsExclusive <em>Is Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exclusive</em>' attribute.
	 * @see #getIsExclusive()
	 * @generated
	 */
    void setIsExclusive(Boolean value);

    /**
	 * Returns the value of the '<em><b>Resource Is Consumed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Is Consumed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Is Consumed</em>' attribute.
	 * @see #setResourceIsConsumed(Boolean)
	 * @see org.omg.vdml.VDMLPackage#getResourceUse_ResourceIsConsumed()
	 * @model default="true" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
    Boolean getResourceIsConsumed();

    /**
	 * Sets the value of the '{@link org.omg.vdml.ResourceUse#getResourceIsConsumed <em>Resource Is Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Is Consumed</em>' attribute.
	 * @see #getResourceIsConsumed()
	 * @generated
	 */
    void setResourceIsConsumed(Boolean value);

				/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.vdml.ResourceUseLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see org.omg.vdml.ResourceUseLocation
	 * @see #setLocation(ResourceUseLocation)
	 * @see org.omg.vdml.VDMLPackage#getResourceUse_Location()
	 * @model
	 * @generated
	 */
	ResourceUseLocation getLocation();

				/**
	 * Sets the value of the '{@link org.omg.vdml.ResourceUse#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see org.omg.vdml.ResourceUseLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ResourceUseLocation value);

} // ResourceUse
