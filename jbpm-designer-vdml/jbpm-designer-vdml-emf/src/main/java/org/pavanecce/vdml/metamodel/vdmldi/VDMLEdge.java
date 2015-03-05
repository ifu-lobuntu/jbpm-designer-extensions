/**
 */
package org.pavanecce.vdml.metamodel.vdmldi;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.LabeledEdge;
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getLabel <em>Label</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getVDMLElement <em>VDML Element</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLEdge()
 * @model extendedMetaData="name='VDMLEdge' kind='elementOnly'"
 * @generated
 */
public interface VDMLEdge extends LabeledEdge {
    /**
     * Returns the value of the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' containment reference.
     * @see #setLabel(VDMLLabel)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLEdge_Label()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='VDMLLabel' namespace='##targetNamespace'"
     * @generated
     */
    VDMLLabel getLabel();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getLabel <em>Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' containment reference.
     * @see #getLabel()
     * @generated
     */
    void setLabel(VDMLLabel value);

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
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLEdge_VDMLElement()
     * @model extendedMetaData="kind='attribute' name='VDMLElement'"
     * @generated
     */
    VdmlElement getVDMLElement();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getVDMLElement <em>VDML Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VDML Element</em>' reference.
     * @see #getVDMLElement()
     * @generated
     */
    void setVDMLElement(VdmlElement value);

    /**
     * Returns the value of the '<em><b>Source Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Element</em>' reference.
     * @see #setSourceElement(DiagramElement)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLEdge_SourceElement()
     * @model extendedMetaData="kind='attribute' name='sourceElement'"
     * @generated
     */
    DiagramElement getSourceElement();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getSourceElement <em>Source Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Element</em>' reference.
     * @see #getSourceElement()
     * @generated
     */
    void setSourceElement(DiagramElement value);

    /**
     * Returns the value of the '<em><b>Target Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Element</em>' reference.
     * @see #setTargetElement(DiagramElement)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLEdge_TargetElement()
     * @model extendedMetaData="kind='attribute' name='targetElement'"
     * @generated
     */
    DiagramElement getTargetElement();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge#getTargetElement <em>Target Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Element</em>' reference.
     * @see #getTargetElement()
     * @generated
     */
    void setTargetElement(DiagramElement value);

} // VDMLEdge
