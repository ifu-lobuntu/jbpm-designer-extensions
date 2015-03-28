/**
 */
package org.omg.cmmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>THuman Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tHumanTask defines the type of element "humanTask"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.cmmn.THumanTask#getPlanningTable <em>Planning Table</em>}</li>
 *   <li>{@link org.omg.cmmn.THumanTask#getPerformerRef <em>Performer Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.cmmn.CMMNPackage#getTHumanTask()
 * @model extendedMetaData="name='tHumanTask' kind='elementOnly'"
 * @generated
 */
public interface THumanTask extends TTask {
    /**
     * Returns the value of the '<em><b>Planning Table</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.cmmn.TPlanningTable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Planning Table</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Planning Table</em>' containment reference list.
     * @see org.omg.cmmn.CMMNPackage#getTHumanTask_PlanningTable()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='planningTable' namespace='##targetNamespace'"
     * @generated
     */
    EList<TPlanningTable> getPlanningTable();

    /**
     * Returns the value of the '<em><b>Performer Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               performerRef refers a "role" element
     *             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Performer Ref</em>' reference.
     * @see #setPerformerRef(TRole)
     * @see org.omg.cmmn.CMMNPackage#getTHumanTask_PerformerRef()
     * @model extendedMetaData="kind='attribute' name='performerRef'"
     * @generated
     */
    TRole getPerformerRef();

    /**
     * Sets the value of the '{@link org.omg.cmmn.THumanTask#getPerformerRef <em>Performer Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Performer Ref</em>' reference.
     * @see #getPerformerRef()
     * @generated
     */
    void setPerformerRef(TRole value);

} // THumanTask
