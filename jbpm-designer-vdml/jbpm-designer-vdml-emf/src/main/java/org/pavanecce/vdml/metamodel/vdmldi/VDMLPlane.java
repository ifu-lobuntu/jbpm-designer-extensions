/**
 */
package org.pavanecce.vdml.metamodel.vdmldi;

import org.eclipse.dd.cmmn.di.Plane;
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane#getVDMLElement <em>VDML Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLPlane()
 * @model extendedMetaData="name='VDMLPlane' kind='elementOnly'"
 * @generated
 */
public interface VDMLPlane extends Plane {
    /**
     * Returns the value of the '<em><b>VDML Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VDML Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VDML Element</em>' reference.
     * @see #setVDMLElement(VdmlElement)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLPlane_VDMLElement()
     * @model extendedMetaData="kind='attribute' name='VDMLElement'"
     * @generated
     */
    VdmlElement getVDMLElement();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane#getVDMLElement <em>VDML Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VDML Element</em>' reference.
     * @see #getVDMLElement()
     * @generated
     */
    void setVDMLElement(VdmlElement value);

} // VDMLPlane
