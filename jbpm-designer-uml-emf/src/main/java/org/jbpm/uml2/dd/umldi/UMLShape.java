/**
 */
package org.jbpm.uml2.dd.umldi;

import org.eclipse.emf.common.util.EList;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.omg.dd.di.Shape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.uml2.dd.umldi.UMLShape#getOwnedCompartment <em>Owned Compartment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLShape()
 * @model
 * @generated
 */
public interface UMLShape extends Shape, UMLDiagramElement, CollapsibleShape {
    /**
     * Returns the value of the '<em><b>Owned Compartment</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.uml2.dd.umldi.UMLCompartment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Compartment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Compartment</em>' containment reference list.
     * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLShape_OwnedCompartment()
     * @model containment="true"
     * @generated
     */
    EList<UMLCompartment> getOwnedCompartment();

} // UMLShape
