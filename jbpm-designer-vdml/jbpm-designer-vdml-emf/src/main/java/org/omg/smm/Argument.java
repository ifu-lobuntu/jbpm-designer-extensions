/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.Argument#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.smm.Argument#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.smm.Argument#getObservedMeasure <em>Observed Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends SmmElement {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.omg.smm.SMMPackage#getArgument_Type()
     * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.omg.smm.Argument#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.omg.smm.SMMPackage#getArgument_Value()
     * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.omg.smm.Argument#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Observed Measure</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.omg.smm.ObservedMeasure#getArguments <em>Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Observed Measure</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Observed Measure</em>' container reference.
     * @see #setObservedMeasure(ObservedMeasure)
     * @see org.omg.smm.SMMPackage#getArgument_ObservedMeasure()
     * @see org.omg.smm.ObservedMeasure#getArguments
     * @model opposite="arguments" transient="false" ordered="false"
     * @generated
     */
    ObservedMeasure getObservedMeasure();

    /**
     * Sets the value of the '{@link org.omg.smm.Argument#getObservedMeasure <em>Observed Measure</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Observed Measure</em>' container reference.
     * @see #getObservedMeasure()
     * @generated
     */
    void setObservedMeasure(ObservedMeasure value);

} // Argument
