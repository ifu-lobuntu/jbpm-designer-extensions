/**
 */
package org.jbpm.cmmn.dd.cmmndi;

import org.eclipse.emf.common.util.EList;

import org.omg.cmmn.TDefinitions;
import org.omg.dd.di.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#getOwnedCmmnDiagramElement <em>Owned Cmmn Diagram Element</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#getOwnedCmmnStyles <em>Owned Cmmn Styles</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#getCmmnElement <em>Cmmn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNDiagram()
 * @model
 * @generated
 */
public interface CMMNDiagram extends Diagram, CMMNDiagramElement {
    /**
     * Returns the value of the '<em><b>Owned Cmmn Diagram Element</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Cmmn Diagram Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Cmmn Diagram Element</em>' containment reference list.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNDiagram_OwnedCmmnDiagramElement()
     * @model containment="true"
     * @generated
     */
    EList<CMMNDiagramElement> getOwnedCmmnDiagramElement();

    /**
     * Returns the value of the '<em><b>Owned Cmmn Styles</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.cmmn.dd.cmmndi.CMMNStyle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Cmmn Styles</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Cmmn Styles</em>' containment reference list.
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNDiagram_OwnedCmmnStyles()
     * @model containment="true"
     * @generated
     */
    EList<CMMNStyle> getOwnedCmmnStyles();

    /**
     * Returns the value of the '<em><b>Cmmn Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cmmn Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cmmn Element</em>' reference.
     * @see #setCmmnElement(TDefinitions)
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNDiagram_CmmnElement()
     * @model
     * @generated
     */
    TDefinitions getCmmnElement();

    /**
     * Sets the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#getCmmnElement <em>Cmmn Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cmmn Element</em>' reference.
     * @see #getCmmnElement()
     * @generated
     */
    void setCmmnElement(TDefinitions value);

} // CMMNDiagram
