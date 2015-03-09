/**
 */
package org.jbpm.cmmn.dd.cmmndi;

import org.omg.cmmn.TCmmnElement;

import org.omg.dd.di.DiagramElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMMN Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement#getCmmnElement <em>Cmmn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNDiagramElement()
 * @model
 * @generated
 */
public interface CMMNDiagramElement extends DiagramElement {
    /**
     * Returns the value of the '<em><b>Cmmn Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cmmn Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cmmn Element</em>' reference.
     * @see #setCmmnElement(TCmmnElement)
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNDiagramElement_CmmnElement()
     * @model
     * @generated
     */
    TCmmnElement getCmmnElement();

    /**
     * Sets the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement#getCmmnElement <em>Cmmn Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cmmn Element</em>' reference.
     * @see #getCmmnElement()
     * @generated
     */
    void setCmmnElement(TCmmnElement value);

} // CMMNDiagramElement
