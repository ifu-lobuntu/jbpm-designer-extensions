/**
 */
package org.omg.dd.di;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.di.DiagramElement#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getLocalStyle <em>Local Style</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getSharedStyle <em>Shared Style</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.omg.dd.di.DiagramElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.di.DIPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends EObject {
    /**
     * Returns the value of the '<em><b>Model Element</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Element</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Element</em>' reference list.
     * @see org.omg.dd.di.DIPackage#getDiagramElement_ModelElement()
     * @model derived="true"
     * @generated
     */
    EList<EObject> getModelElement();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.omg.dd.di.DIPackage#getDiagramElement_Id()
     * @model id="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.omg.dd.di.DiagramElement#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Owning Element</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.omg.dd.di.DiagramElement#getOwnedElement <em>Owned Element</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owning Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owning Element</em>' reference.
     * @see org.omg.dd.di.DIPackage#getDiagramElement_OwningElement()
     * @see org.omg.dd.di.DiagramElement#getOwnedElement
     * @model opposite="ownedElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    DiagramElement getOwningElement();

    /**
     * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
     * The list contents are of type {@link org.omg.dd.di.DiagramElement}.
     * It is bidirectional and its opposite is '{@link org.omg.dd.di.DiagramElement#getOwningElement <em>Owning Element</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Element</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Element</em>' reference list.
     * @see org.omg.dd.di.DIPackage#getDiagramElement_OwnedElement()
     * @see org.omg.dd.di.DiagramElement#getOwningElement
     * @model opposite="owningElement" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    EList<DiagramElement> getOwnedElement();

    /**
     * Returns the value of the '<em><b>Local Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Style</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Style</em>' containment reference.
     * @see #setLocalStyle(Style)
     * @see org.omg.dd.di.DIPackage#getDiagramElement_LocalStyle()
     * @model containment="true" ordered="false"
     * @generated
     */
    Style getLocalStyle();

    /**
     * Sets the value of the '{@link org.omg.dd.di.DiagramElement#getLocalStyle <em>Local Style</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Style</em>' containment reference.
     * @see #getLocalStyle()
     * @generated
     */
    void setLocalStyle(Style value);

    /**
     * Returns the value of the '<em><b>Shared Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shared Style</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shared Style</em>' reference.
     * @see #setSharedStyle(Style)
     * @see org.omg.dd.di.DIPackage#getDiagramElement_SharedStyle()
     * @model ordered="false"
     * @generated
     */
    Style getSharedStyle();

    /**
     * Sets the value of the '{@link org.omg.dd.di.DiagramElement#getSharedStyle <em>Shared Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shared Style</em>' reference.
     * @see #getSharedStyle()
     * @generated
     */
    void setSharedStyle(Style value);

} // DiagramElement
