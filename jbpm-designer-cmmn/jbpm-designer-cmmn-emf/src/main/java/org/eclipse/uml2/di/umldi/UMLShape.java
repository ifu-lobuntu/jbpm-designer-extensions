/**
 */
package org.eclipse.uml2.di.umldi;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.LabeledShape;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.di.umldi.UMLShape#getUmlLabel <em>Uml Label</em>}</li>
 *   <li>{@link org.eclipse.uml2.di.umldi.UMLShape#getUmlElement <em>Uml Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.di.umldi.UMLShape#getChildShapes <em>Child Shapes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.di.umldi.UMLDIPackage#getUMLShape()
 * @model extendedMetaData="name='UMLShape' kind='elementOnly'"
 * @generated
 */
public interface UMLShape extends LabeledShape {
    /**
     * Returns the value of the '<em><b>Uml Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uml Label</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uml Label</em>' containment reference.
     * @see #setUmlLabel(UMLLabel)
     * @see org.eclipse.uml2.di.umldi.UMLDIPackage#getUMLShape_UmlLabel()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='UMLLabel' namespace='##targetNamespace'"
     * @generated
     */
    UMLLabel getUmlLabel();

    /**
     * Sets the value of the '{@link org.eclipse.uml2.di.umldi.UMLShape#getUmlLabel <em>Uml Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Label</em>' containment reference.
     * @see #getUmlLabel()
     * @generated
     */
    void setUmlLabel(UMLLabel value);

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
     * @see org.eclipse.uml2.di.umldi.UMLDIPackage#getUMLShape_UmlElement()
     * @model extendedMetaData="kind='attribute' name='UMLElement'"
     * @generated
     */
    Element getUmlElement();

    /**
     * Sets the value of the '{@link org.eclipse.uml2.di.umldi.UMLShape#getUmlElement <em>Uml Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uml Element</em>' reference.
     * @see #getUmlElement()
     * @generated
     */
    void setUmlElement(Element value);

    /**
     * Returns the value of the '<em><b>Child Shapes</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.dd.cmmn.di.DiagramElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child Shapes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child Shapes</em>' containment reference list.
     * @see org.eclipse.uml2.di.umldi.UMLDIPackage#getUMLShape_ChildShapes()
     * @model containment="true"
     * @generated
     */
    EList<DiagramElement> getChildShapes();

} // UMLShape
