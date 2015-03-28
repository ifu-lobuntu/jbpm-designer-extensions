/**
 */
package org.jbpm.cmmn.dd.cmmndi;

import org.omg.cmmn.TCmmnElement;
import org.omg.dd.di.Edge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMMN Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getSourceShape <em>Source Shape</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getTargetShape <em>Target Shape</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getCmmnElement <em>Cmmn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNEdge()
 * @model
 * @generated
 */
public interface CMMNEdge extends Edge, CMMNDiagramElement {
    /**
     * Returns the value of the '<em><b>Source Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Shape</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Shape</em>' reference.
     * @see #setSourceShape(CMMNShape)
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNEdge_SourceShape()
     * @model
     * @generated
     */
    CMMNShape getSourceShape();

    /**
     * Sets the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getSourceShape <em>Source Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Shape</em>' reference.
     * @see #getSourceShape()
     * @generated
     */
    void setSourceShape(CMMNShape value);

    /**
     * Returns the value of the '<em><b>Target Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Shape</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Shape</em>' reference.
     * @see #setTargetShape(CMMNShape)
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNEdge_TargetShape()
     * @model
     * @generated
     */
    CMMNShape getTargetShape();

    /**
     * Sets the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getTargetShape <em>Target Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Shape</em>' reference.
     * @see #getTargetShape()
     * @generated
     */
    void setTargetShape(CMMNShape value);

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
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#getCMMNEdge_CmmnElement()
     * @model
     * @generated
     */
    TCmmnElement getCmmnElement();

    /**
     * Sets the value of the '{@link org.jbpm.cmmn.dd.cmmndi.CMMNEdge#getCmmnElement <em>Cmmn Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cmmn Element</em>' reference.
     * @see #getCmmnElement()
     * @generated
     */
    void setCmmnElement(TCmmnElement value);

} // CMMNEdge
