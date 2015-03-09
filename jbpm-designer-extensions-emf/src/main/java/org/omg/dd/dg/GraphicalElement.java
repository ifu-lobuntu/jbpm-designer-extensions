/**
 */
package org.omg.dd.dg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.omg.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.GraphicalElement#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.dd.dg.GraphicalElement#getLocalStyle <em>Local Style</em>}</li>
 *   <li>{@link org.omg.dd.dg.GraphicalElement#getSharedStyle <em>Shared Style</em>}</li>
 *   <li>{@link org.omg.dd.dg.GraphicalElement#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.omg.dd.dg.GraphicalElement#getClipPath <em>Clip Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getGraphicalElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphicalElement extends EObject {
    /**
     * Returns the value of the '<em><b>Group</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.omg.dd.dg.Group#getMember <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' container reference.
     * @see #setGroup(Group)
     * @see org.omg.dd.dg.DGPackage#getGraphicalElement_Group()
     * @see org.omg.dd.dg.Group#getMember
     * @model opposite="member" transient="false" ordered="false"
     * @generated
     */
    Group getGroup();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.GraphicalElement#getGroup <em>Group</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group</em>' container reference.
     * @see #getGroup()
     * @generated
     */
    void setGroup(Group value);

    /**
     * Returns the value of the '<em><b>Local Style</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.di.Style}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Style</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Style</em>' containment reference list.
     * @see org.omg.dd.dg.DGPackage#getGraphicalElement_LocalStyle()
     * @model containment="true"
     * @generated
     */
    EList<Style> getLocalStyle();

    /**
     * Returns the value of the '<em><b>Shared Style</b></em>' reference list.
     * The list contents are of type {@link org.omg.dd.di.Style}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shared Style</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shared Style</em>' reference list.
     * @see org.omg.dd.dg.DGPackage#getGraphicalElement_SharedStyle()
     * @model
     * @generated
     */
    EList<Style> getSharedStyle();

    /**
     * Returns the value of the '<em><b>Transform</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.dd.dg.Transform}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transform</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transform</em>' containment reference list.
     * @see org.omg.dd.dg.DGPackage#getGraphicalElement_Transform()
     * @model containment="true"
     * @generated
     */
    EList<Transform> getTransform();

    /**
     * Returns the value of the '<em><b>Clip Path</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.omg.dd.dg.ClipPath#getClippedElement <em>Clipped Element</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Clip Path</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Clip Path</em>' containment reference.
     * @see #setClipPath(ClipPath)
     * @see org.omg.dd.dg.DGPackage#getGraphicalElement_ClipPath()
     * @see org.omg.dd.dg.ClipPath#getClippedElement
     * @model opposite="clippedElement" containment="true" ordered="false"
     * @generated
     */
    ClipPath getClipPath();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.GraphicalElement#getClipPath <em>Clip Path</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Clip Path</em>' containment reference.
     * @see #getClipPath()
     * @generated
     */
    void setClipPath(ClipPath value);

} // GraphicalElement
