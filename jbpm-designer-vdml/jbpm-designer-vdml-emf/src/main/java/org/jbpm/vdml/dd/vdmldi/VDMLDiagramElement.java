/**
 */
package org.jbpm.vdml.dd.vdmldi;

import org.omg.dd.di.DiagramElement;

import org.omg.vdml.VdmlElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement#getVdmlElement <em>Vdml Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLDiagramElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface VDMLDiagramElement extends DiagramElement {
    /**
     * Returns the value of the '<em><b>Vdml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vdml Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vdml Element</em>' reference.
     * @see #setVdmlElement(VdmlElement)
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLDiagramElement_VdmlElement()
     * @model
     * @generated
     */
    VdmlElement getVdmlElement();

    /**
     * Sets the value of the '{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement#getVdmlElement <em>Vdml Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vdml Element</em>' reference.
     * @see #getVdmlElement()
     * @generated
     */
    void setVdmlElement(VdmlElement value);

} // VDMLDiagramElement
