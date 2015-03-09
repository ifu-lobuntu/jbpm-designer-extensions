/**
 */
package org.jbpm.vdml.dd.vdmldi;

import org.omg.dd.di.Edge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.VDMLEdge#getSourceShape <em>Source Shape</em>}</li>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.VDMLEdge#getTargetShape <em>Target Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLEdge()
 * @model
 * @generated
 */
public interface VDMLEdge extends Edge, VDMLDiagramElement {
    /**
     * Returns the value of the '<em><b>Source Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Shape</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Shape</em>' reference.
     * @see #setSourceShape(VDMLShape)
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLEdge_SourceShape()
     * @model
     * @generated
     */
    VDMLShape getSourceShape();

    /**
     * Sets the value of the '{@link org.jbpm.vdml.dd.vdmldi.VDMLEdge#getSourceShape <em>Source Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Shape</em>' reference.
     * @see #getSourceShape()
     * @generated
     */
    void setSourceShape(VDMLShape value);

    /**
     * Returns the value of the '<em><b>Target Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Shape</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Shape</em>' reference.
     * @see #setTargetShape(VDMLShape)
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLEdge_TargetShape()
     * @model
     * @generated
     */
    VDMLShape getTargetShape();

    /**
     * Sets the value of the '{@link org.jbpm.vdml.dd.vdmldi.VDMLEdge#getTargetShape <em>Target Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Shape</em>' reference.
     * @see #getTargetShape()
     * @generated
     */
    void setTargetShape(VDMLShape value);

} // VDMLEdge
