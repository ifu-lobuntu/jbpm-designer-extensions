/**
 */
package org.pavanecce.vdml.metamodel.vdmldi;

import org.eclipse.dd.cmmn.di.Diagram;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram#getVDMLPlane <em>VDML Plane</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLDiagram()
 * @model extendedMetaData="name='VDMLDiagram' kind='elementOnly'"
 * @generated
 */
public interface VDMLDiagram extends Diagram {
    /**
     * Returns the value of the '<em><b>VDML Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>VDML Plane</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>VDML Plane</em>' containment reference.
     * @see #setVDMLPlane(VDMLPlane)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLDiagram_VDMLPlane()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='VDMLPlane' namespace='##targetNamespace'"
     * @generated
     */
    VDMLPlane getVDMLPlane();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram#getVDMLPlane <em>VDML Plane</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VDML Plane</em>' containment reference.
     * @see #getVDMLPlane()
     * @generated
     */
    void setVDMLPlane(VDMLPlane value);

    /**
     * Returns the value of the '<em><b>Label Style</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label Style</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label Style</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLDiagram_LabelStyle()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='VDMLLabelStyle' namespace='##targetNamespace'"
     * @generated
     */
    EList<VDMLLabelStyle> getLabelStyle();

} // VDMLDiagram
