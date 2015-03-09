/**
 */
package org.jbpm.vdml.dd.vdmldi;

import org.eclipse.emf.common.util.EList;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.VDMLShape#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.jbpm.vdml.dd.vdmldi.VDMLShape#getOwnedShape <em>Owned Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLShape()
 * @model
 * @generated
 */
public interface VDMLShape extends BoundariedShape, VDMLDiagramElement {
    /**
     * Returns the value of the '<em><b>Is Expanded</b></em>' attribute.
     * The default value is <code>"true"</code>.
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
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLShape_IsExpanded()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     * @generated
     */
    boolean isIsExpanded();

    /**
     * Sets the value of the '{@link org.jbpm.vdml.dd.vdmldi.VDMLShape#isIsExpanded <em>Is Expanded</em>}' attribute.
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
     * Unsets the value of the '{@link org.jbpm.vdml.dd.vdmldi.VDMLShape#isIsExpanded <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsExpanded()
     * @see #isIsExpanded()
     * @see #setIsExpanded(boolean)
     * @generated
     */
    void unsetIsExpanded();

    /**
     * Returns whether the value of the '{@link org.jbpm.vdml.dd.vdmldi.VDMLShape#isIsExpanded <em>Is Expanded</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Owned Shape</b></em>' containment reference list.
     * The list contents are of type {@link org.jbpm.vdml.dd.vdmldi.VDMLShape}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Shape</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Shape</em>' containment reference list.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#getVDMLShape_OwnedShape()
     * @model containment="true"
     * @generated
     */
    EList<VDMLShape> getOwnedShape();

} // VDMLShape
