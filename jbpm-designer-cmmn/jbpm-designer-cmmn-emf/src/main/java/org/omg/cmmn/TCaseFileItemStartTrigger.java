/**
 */
package org.omg.cmmn;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCase File Item Start Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.cmmn.TCaseFileItemStartTrigger#getStandardEvent <em>Standard Event</em>}</li>
 *   <li>{@link org.omg.cmmn.TCaseFileItemStartTrigger#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.cmmn.CMMNPackage#getTCaseFileItemStartTrigger()
 * @model extendedMetaData="name='tCaseFileItemStartTrigger' kind='elementOnly'"
 * @generated
 */
public interface TCaseFileItemStartTrigger extends TStartTrigger {
    /**
     * Returns the value of the '<em><b>Standard Event</b></em>' attribute.
     * The literals are from the enumeration {@link org.omg.cmmn.CaseFileItemTransition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Standard Event</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Event</em>' attribute.
     * @see org.omg.cmmn.CaseFileItemTransition
     * @see #isSetStandardEvent()
     * @see #unsetStandardEvent()
     * @see #setStandardEvent(CaseFileItemTransition)
     * @see org.omg.cmmn.CMMNPackage#getTCaseFileItemStartTrigger_StandardEvent()
     * @model unsettable="true"
     *        extendedMetaData="kind='element' name='standardEvent' namespace='##targetNamespace'"
     * @generated
     */
    CaseFileItemTransition getStandardEvent();

    /**
     * Sets the value of the '{@link org.omg.cmmn.TCaseFileItemStartTrigger#getStandardEvent <em>Standard Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Event</em>' attribute.
     * @see org.omg.cmmn.CaseFileItemTransition
     * @see #isSetStandardEvent()
     * @see #unsetStandardEvent()
     * @see #getStandardEvent()
     * @generated
     */
    void setStandardEvent(CaseFileItemTransition value);

    /**
     * Unsets the value of the '{@link org.omg.cmmn.TCaseFileItemStartTrigger#getStandardEvent <em>Standard Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStandardEvent()
     * @see #getStandardEvent()
     * @see #setStandardEvent(CaseFileItemTransition)
     * @generated
     */
    void unsetStandardEvent();

    /**
     * Returns whether the value of the '{@link org.omg.cmmn.TCaseFileItemStartTrigger#getStandardEvent <em>Standard Event</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Standard Event</em>' attribute is set.
     * @see #unsetStandardEvent()
     * @see #getStandardEvent()
     * @see #setStandardEvent(CaseFileItemTransition)
     * @generated
     */
    boolean isSetStandardEvent();

    /**
     * Returns the value of the '<em><b>Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               sourceRef refers a "caseFileItem" element
     *             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Ref</em>' reference.
     * @see #setSourceRef(TCaseFileItem)
     * @see org.omg.cmmn.CMMNPackage#getTCaseFileItemStartTrigger_SourceRef()
     * @model resolveProxies="false"
     *        extendedMetaData="kind='attribute' name='sourceRef'"
     * @generated
     */
    TCaseFileItem getSourceRef();

    /**
     * Sets the value of the '{@link org.omg.cmmn.TCaseFileItemStartTrigger#getSourceRef <em>Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Ref</em>' reference.
     * @see #getSourceRef()
     * @generated
     */
    void setSourceRef(TCaseFileItem value);

} // TCaseFileItemStartTrigger
