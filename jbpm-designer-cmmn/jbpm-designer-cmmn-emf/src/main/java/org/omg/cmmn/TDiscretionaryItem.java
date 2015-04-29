/**
 */
package org.omg.cmmn;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDiscretionary Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.cmmn.TDiscretionaryItem#getItemControl <em>Item Control</em>}</li>
 *   <li>{@link org.omg.cmmn.TDiscretionaryItem#getDefinitionRef <em>Definition Ref</em>}</li>
 *   <li>{@link org.omg.cmmn.TDiscretionaryItem#getEntryCriteriaRefs <em>Entry Criteria Refs</em>}</li>
 *   <li>{@link org.omg.cmmn.TDiscretionaryItem#getExitCriteriaRefs <em>Exit Criteria Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.cmmn.CMMNPackage#getTDiscretionaryItem()
 * @model extendedMetaData="name='tDiscretionaryItem' kind='elementOnly'"
 * @generated
 */
public interface TDiscretionaryItem extends TTableItem {
    /**
     * Returns the value of the '<em><b>Item Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Item Control</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Item Control</em>' containment reference.
     * @see #setItemControl(TPlanItemControl)
     * @see org.omg.cmmn.CMMNPackage#getTDiscretionaryItem_ItemControl()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='itemControl' namespace='##targetNamespace'"
     * @generated
     */
    TPlanItemControl getItemControl();

    /**
     * Sets the value of the '{@link org.omg.cmmn.TDiscretionaryItem#getItemControl <em>Item Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Item Control</em>' containment reference.
     * @see #getItemControl()
     * @generated
     */
    void setItemControl(TPlanItemControl value);

    /**
     * Returns the value of the '<em><b>Definition Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               definitionRef refers a "planItemDefinition" element
     *             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Definition Ref</em>' reference.
     * @see #setDefinitionRef(TPlanItemDefinition)
     * @see org.omg.cmmn.CMMNPackage#getTDiscretionaryItem_DefinitionRef()
     * @model resolveProxies="false"
     *        extendedMetaData="kind='attribute' name='definitionRef'"
     * @generated
     */
    TPlanItemDefinition getDefinitionRef();

    /**
     * Sets the value of the '{@link org.omg.cmmn.TDiscretionaryItem#getDefinitionRef <em>Definition Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definition Ref</em>' reference.
     * @see #getDefinitionRef()
     * @generated
     */
    void setDefinitionRef(TPlanItemDefinition value);

    /**
     * Returns the value of the '<em><b>Entry Criteria Refs</b></em>' reference list.
     * The list contents are of type {@link org.omg.cmmn.TSentry}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               entryCriteriaRefs refers "sentry" elements.
     *             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Entry Criteria Refs</em>' reference list.
     * @see org.omg.cmmn.CMMNPackage#getTDiscretionaryItem_EntryCriteriaRefs()
     * @model resolveProxies="false"
     *        extendedMetaData="kind='attribute' name='entryCriteriaRefs'"
     * @generated
     */
    EList<TSentry> getEntryCriteriaRefs();

    /**
     * Returns the value of the '<em><b>Exit Criteria Refs</b></em>' reference list.
     * The list contents are of type {@link org.omg.cmmn.TSentry}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               exitCriteriaRefs refers "sentry" elements.
     *             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Exit Criteria Refs</em>' reference list.
     * @see org.omg.cmmn.CMMNPackage#getTDiscretionaryItem_ExitCriteriaRefs()
     * @model resolveProxies="false"
     *        extendedMetaData="kind='attribute' name='exitCriteriaRefs'"
     * @generated
     */
    EList<TSentry> getExitCriteriaRefs();

} // TDiscretionaryItem
