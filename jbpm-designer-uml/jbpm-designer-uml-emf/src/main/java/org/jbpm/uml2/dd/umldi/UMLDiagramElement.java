/**
 */
package org.jbpm.uml2.dd.umldi;

import org.eclipse.uml2.uml.Element;
import org.omg.dd.di.DiagramElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.uml2.dd.umldi.UMLDiagramElement#getUmlElement <em>Uml Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLDiagramElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UMLDiagramElement extends DiagramElement {
    /**
     * Returns the value of the '<em><b>Uml Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uml Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uml Element</em>' reference.
     * @see #setUmlElement(Element)
     * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLDiagramElement_UmlElement()
     * @model
     * @generated
     */
    Element getUmlElement();

    /**
     * Sets the value of the '{@link org.jbpm.uml2.dd.umldi.UMLDiagramElement#getUmlElement <em>Uml Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Element</em>' reference.
     * @see #getUmlElement()
     * @generated
     */
    void setUmlElement(Element value);

} // UMLDiagramElement
