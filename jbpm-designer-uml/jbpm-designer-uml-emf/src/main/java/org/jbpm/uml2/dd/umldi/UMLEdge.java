/**
 */
package org.jbpm.uml2.dd.umldi;

import org.omg.dd.di.Edge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.uml2.dd.umldi.UMLEdge#getSourceShape <em>Source Shape</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.UMLEdge#getTargetShape <em>Target Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLEdge()
 * @model
 * @generated
 */
public interface UMLEdge extends Edge, UMLDiagramElement {
    /**
     * Returns the value of the '<em><b>Source Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Shape</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Shape</em>' reference.
     * @see #setSourceShape(UMLShape)
     * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLEdge_SourceShape()
     * @model
     * @generated
     */
    UMLShape getSourceShape();

    /**
     * Sets the value of the '{@link org.jbpm.uml2.dd.umldi.UMLEdge#getSourceShape <em>Source Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Shape</em>' reference.
     * @see #getSourceShape()
     * @generated
     */
    void setSourceShape(UMLShape value);

    /**
     * Returns the value of the '<em><b>Target Shape</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Shape</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Shape</em>' reference.
     * @see #setTargetShape(UMLShape)
     * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLEdge_TargetShape()
     * @model
     * @generated
     */
    UMLShape getTargetShape();

    /**
     * Sets the value of the '{@link org.jbpm.uml2.dd.umldi.UMLEdge#getTargetShape <em>Target Shape</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Shape</em>' reference.
     * @see #getTargetShape()
     * @generated
     */
    void setTargetShape(UMLShape value);

} // UMLEdge
