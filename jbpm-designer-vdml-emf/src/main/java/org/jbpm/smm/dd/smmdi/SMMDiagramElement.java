/**
 */
package org.jbpm.smm.dd.smmdi;

import org.omg.dd.di.DiagramElement;

import org.omg.smm.SmmElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMM Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.smm.dd.smmdi.SMMDiagramElement#getSmmElement <em>Smm Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.smm.dd.smmdi.SMMDIPackage#getSMMDiagramElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SMMDiagramElement extends DiagramElement {
    /**
     * Returns the value of the '<em><b>Smm Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smm Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Smm Element</em>' reference.
     * @see #setSmmElement(SmmElement)
     * @see org.jbpm.smm.dd.smmdi.SMMDIPackage#getSMMDiagramElement_SmmElement()
     * @model
     * @generated
     */
    SmmElement getSmmElement();

    /**
     * Sets the value of the '{@link org.jbpm.smm.dd.smmdi.SMMDiagramElement#getSmmElement <em>Smm Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smm Element</em>' reference.
     * @see #getSmmElement()
     * @generated
     */
    void setSmmElement(SmmElement value);

} // SMMDiagramElement
