/**
 */
package org.omg.cmmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCase File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tCaseFile defines the type of element "caseFile".
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.cmmn.TCaseFile#getCaseFileItem <em>Case File Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.cmmn.CMMNPackage#getTCaseFile()
 * @model extendedMetaData="name='tCaseFile' kind='elementOnly'"
 * @generated
 */
public interface TCaseFile extends TCmmnElement {
    /**
     * Returns the value of the '<em><b>Case File Item</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.cmmn.TCaseFileItem}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         caseFileItem is the root element for CMMN data.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Case File Item</em>' containment reference list.
     * @see org.omg.cmmn.CMMNPackage#getTCaseFile_CaseFileItem()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='caseFileItem' namespace='##targetNamespace'"
     * @generated
     */
    EList<TCaseFileItem> getCaseFileItem();

} // TCaseFile
