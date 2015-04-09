/**
 */
package org.jbpm.smm.dd.smmdi;

import org.omg.dd.di.Edge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMM Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.smm.dd.smmdi.SMMEdge#getSourceShape <em>Source Shape</em>}</li>
 *   <li>{@link org.jbpm.smm.dd.smmdi.SMMEdge#getTargetShape <em>Target Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.smm.dd.smmdi.SMMDIPackage#getSMMEdge()
 * @model
 * @generated
 */
public interface SMMEdge extends Edge, SMMDiagramElement {
    /**
     * Returns the value of the '<em><b>Source Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Shape</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Shape</em>' reference.
     * @see #setSourceShape(SMMShape)
     * @see org.jbpm.smm.dd.smmdi.SMMDIPackage#getSMMEdge_SourceShape()
     * @model
     * @generated
     */
    SMMShape getSourceShape();

    /**
     * Sets the value of the '{@link org.jbpm.smm.dd.smmdi.SMMEdge#getSourceShape <em>Source Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Shape</em>' reference.
     * @see #getSourceShape()
     * @generated
     */
    void setSourceShape(SMMShape value);

    /**
     * Returns the value of the '<em><b>Target Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Shape</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Shape</em>' reference.
     * @see #setTargetShape(SMMShape)
     * @see org.jbpm.smm.dd.smmdi.SMMDIPackage#getSMMEdge_TargetShape()
     * @model
     * @generated
     */
    SMMShape getTargetShape();

    /**
     * Sets the value of the '{@link org.jbpm.smm.dd.smmdi.SMMEdge#getTargetShape <em>Target Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Shape</em>' reference.
     * @see #getTargetShape()
     * @generated
     */
    void setTargetShape(SMMShape value);

} // SMMEdge
