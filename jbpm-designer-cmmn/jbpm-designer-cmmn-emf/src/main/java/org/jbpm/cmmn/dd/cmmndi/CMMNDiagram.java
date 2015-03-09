/**
 */
package org.jbpm.cmmn.dd.cmmndi;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#isIsPlanningTableExpanded <em>Is Planning Table Expanded</em>}</li>
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
     * Returns the value of the '<em><b>Is Planning Table Expanded</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Planning Table Expanded</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Planning Table Expanded</em>' attribute.
     * @see #isSetIsPlanningTableExpanded()
     * @see #unsetIsPlanningTableExpanded()
     * @see #setIsPlanningTableExpanded(boolean)
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNDiagram_IsPlanningTableExpanded()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     * @generated
     */
    boolean isIsPlanningTableExpanded();

    /**
     * Sets the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#isIsPlanningTableExpanded <em>Is Planning Table Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Planning Table Expanded</em>' attribute.
     * @see #isSetIsPlanningTableExpanded()
     * @see #unsetIsPlanningTableExpanded()
     * @see #isIsPlanningTableExpanded()
     * @generated
     */
    void setIsPlanningTableExpanded(boolean value);

    /**
     * Unsets the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#isIsPlanningTableExpanded <em>Is Planning Table Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPlanningTableExpanded()
     * @see #isIsPlanningTableExpanded()
     * @see #setIsPlanningTableExpanded(boolean)
     * @generated
     */
    void unsetIsPlanningTableExpanded();

    /**
     * Returns whether the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagram#isIsPlanningTableExpanded <em>Is Planning Table Expanded</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Planning Table Expanded</em>' attribute is set.
     * @see #unsetIsPlanningTableExpanded()
     * @see #isIsPlanningTableExpanded()
     * @see #setIsPlanningTableExpanded(boolean)
     * @generated
     */
    boolean isSetIsPlanningTableExpanded();

} // CMMNDiagram
