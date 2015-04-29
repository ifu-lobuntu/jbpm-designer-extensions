/**
 */
package org.omg.cmmn;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TApplicability Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.cmmn.TApplicabilityRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.cmmn.TApplicabilityRule#getContextRef <em>Context Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.cmmn.CMMNPackage#getTApplicabilityRule()
 * @model extendedMetaData="name='tApplicabilityRule' kind='elementOnly'"
 * @generated
 */
public interface TApplicabilityRule extends TCmmnElement {
    /**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(TExpression)
     * @see org.omg.cmmn.CMMNPackage#getTApplicabilityRule_Condition()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
     * @generated
     */
    TExpression getCondition();

    /**
     * Sets the value of the '{@link org.omg.cmmn.TApplicabilityRule#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(TExpression value);

    /**
     * Returns the value of the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               contexRef refers a "caseFileItem" element
     *             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Context Ref</em>' reference.
     * @see #setContextRef(TCaseFileItem)
     * @see org.omg.cmmn.CMMNPackage#getTApplicabilityRule_ContextRef()
     * @model resolveProxies="false"
     *        extendedMetaData="kind='attribute' name='contextRef'"
     * @generated
     */
    TCaseFileItem getContextRef();

    /**
     * Sets the value of the '{@link org.omg.cmmn.TApplicabilityRule#getContextRef <em>Context Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Ref</em>' reference.
     * @see #getContextRef()
     * @generated
     */
    void setContextRef(TCaseFileItem value);

} // TApplicabilityRule
