/**
 */
package org.jbpm.uml2.dd.umldi;

import org.eclipse.emf.common.util.EList;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.jbpm.designer.dd.jbpmdd.Compartment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.uml2.dd.umldi.UMLCompartment#getOwnedShape <em>Owned Shape</em>}</li>
 *   <li>{@link org.jbpm.uml2.dd.umldi.UMLCompartment#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLCompartment()
 * @model
 * @generated
 */
public interface UMLCompartment extends Compartment, UMLDiagramElement, CollapsibleShape {
    /**
     * Returns the value of the '<em><b>Owned Shape</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.uml2.dd.umldi.UMLShape}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Shape</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Shape</em>' containment reference list.
     * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLCompartment_OwnedShape()
     * @model containment="true"
     * @generated
     */
    EList<UMLShape> getOwnedShape();

    /**
     * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature Name</em>' attribute.
     * @see #setFeatureName(String)
     * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#getUMLCompartment_FeatureName()
     * @model dataType="org.eclipse.uml2.uml.String" required="true"
     * @generated
     */
    String getFeatureName();

    /**
     * Sets the value of the '{@link org.jbpm.uml2.dd.umldi.UMLCompartment#getFeatureName <em>Feature Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feature Name</em>' attribute.
     * @see #getFeatureName()
     * @generated
     */
    void setFeatureName(String value);

} // UMLCompartment
