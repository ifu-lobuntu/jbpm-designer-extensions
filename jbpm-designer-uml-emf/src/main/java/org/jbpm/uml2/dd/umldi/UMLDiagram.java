/**
 */
package org.jbpm.uml2.dd.umldi;

import org.eclipse.emf.common.util.EList;
import org.omg.dd.di.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.uml2.dd.umldi.UMLDiagram#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.UMLDiagram#getOwnedUmlStyle <em>Owned Uml Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLDiagram()
 * @model
 * @generated
 */
public interface UMLDiagram extends Diagram, UMLDiagramElement {
    /**
     * Returns the value of the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.uml2.dd.umldi.UMLDiagramElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Uml Diagram Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Uml Diagram Element</em>' containment reference list.
     * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLDiagram_OwnedUmlDiagramElement()
     * @model containment="true"
     * @generated
     */
    EList<UMLDiagramElement> getOwnedUmlDiagramElement();

    /**
     * Returns the value of the '<em><b>Owned Uml Style</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.uml2.dd.umldi.UMLStyle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Uml Style</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Uml Style</em>' containment reference list.
     * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLDiagram_OwnedUmlStyle()
     * @model containment="true"
     * @generated
     */
    EList<UMLStyle> getOwnedUmlStyle();

} // UMLDiagram
