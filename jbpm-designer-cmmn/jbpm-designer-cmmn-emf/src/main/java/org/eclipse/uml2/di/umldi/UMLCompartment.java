/**
 */
package org.eclipse.uml2.di.umldi;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Shape;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.di.umldi.UMLCompartment#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.eclipse.uml2.di.umldi.UMLCompartment#getChildShapes <em>Child Shapes</em>}</li>
 *   <li>{@link org.eclipse.uml2.di.umldi.UMLCompartment#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.di.umldi.UMLDIPackage#getUMLCompartment()
 * @model extendedMetaData="name='UMLCompartment' kind='elementOnly'"
 * @generated
 */
public interface UMLCompartment extends Shape {
    /**
     * Returns the value of the '<em><b>Is Expanded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Expanded</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Expanded</em>' attribute.
     * @see #isSetIsExpanded()
     * @see #unsetIsExpanded()
     * @see #setIsExpanded(boolean)
     * @see org.eclipse.uml2.di.umldi.UMLDIPackage#getUMLCompartment_IsExpanded()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isExpanded'"
     * @generated
     */
    boolean isIsExpanded();

    /**
     * Sets the value of the '{@link org.eclipse.uml2.di.umldi.UMLCompartment#isIsExpanded <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Expanded</em>' attribute.
     * @see #isSetIsExpanded()
     * @see #unsetIsExpanded()
     * @see #isIsExpanded()
     * @generated
     */
    void setIsExpanded(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.uml2.di.umldi.UMLCompartment#isIsExpanded <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsExpanded()
     * @see #isIsExpanded()
     * @see #setIsExpanded(boolean)
     * @generated
     */
    void unsetIsExpanded();

    /**
     * Returns whether the value of the '{@link org.eclipse.uml2.di.umldi.UMLCompartment#isIsExpanded <em>Is Expanded</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Expanded</em>' attribute is set.
     * @see #unsetIsExpanded()
     * @see #isIsExpanded()
     * @see #setIsExpanded(boolean)
     * @generated
     */
    boolean isSetIsExpanded();

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
     * @see org.eclipse.uml2.di.umldi.UMLDIPackage#getUMLCompartment_ChildShapes()
     * @model containment="true"
     * @generated
     */
    EList<DiagramElement> getChildShapes();

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
     * @see org.eclipse.uml2.di.umldi.UMLDIPackage#getUMLCompartment_FeatureName()
     * @model dataType="org.eclipse.uml2.uml.String" required="true"
     * @generated
     */
    String getFeatureName();

    /**
     * Sets the value of the '{@link org.eclipse.uml2.di.umldi.UMLCompartment#getFeatureName <em>Feature Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feature Name</em>' attribute.
     * @see #getFeatureName()
     * @generated
     */
    void setFeatureName(String value);

} // UMLCompartment
