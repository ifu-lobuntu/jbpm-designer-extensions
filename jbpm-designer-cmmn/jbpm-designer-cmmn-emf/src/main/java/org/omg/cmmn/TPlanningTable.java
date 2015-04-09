/**
 */
package org.omg.cmmn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPlanning Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.cmmn.TPlanningTable#getTableItemGroup <em>Table Item Group</em>}</li>
 *   <li>{@link org.omg.cmmn.TPlanningTable#getTableItem <em>Table Item</em>}</li>
 *   <li>{@link org.omg.cmmn.TPlanningTable#getApplicabilityRule <em>Applicability Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.cmmn.CMMNPackage#getTPlanningTable()
 * @model extendedMetaData="name='tPlanningTable' kind='elementOnly'"
 * @generated
 */
public interface TPlanningTable extends TTableItem {
    /**
     * Returns the value of the '<em><b>Table Item Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Table Item Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table Item Group</em>' attribute list.
     * @see org.omg.cmmn.CMMNPackage#getTPlanningTable_TableItemGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='tableItem:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getTableItemGroup();

    /**
     * Returns the value of the '<em><b>Table Item</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.cmmn.TTableItem}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Table Item</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table Item</em>' containment reference list.
     * @see org.omg.cmmn.CMMNPackage#getTPlanningTable_TableItem()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='tableItem' namespace='##targetNamespace' group='tableItem:group'"
     * @generated
     */
    EList<TTableItem> getTableItem();

    /**
     * Returns the value of the '<em><b>Applicability Rule</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.cmmn.TApplicabilityRule}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applicability Rule</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applicability Rule</em>' containment reference list.
     * @see org.omg.cmmn.CMMNPackage#getTPlanningTable_ApplicabilityRule()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='applicabilityRule' namespace='##targetNamespace'"
     * @generated
     */
    EList<TApplicabilityRule> getApplicabilityRule();

} // TPlanningTable
