/**
 */
package org.pavanecce.vdml.metamodel.vdmldi;

import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.LabeledShape;
import org.eclipse.emf.common.util.EList;
import org.pavanecce.vdml.metamodel.vdml.VdmlElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getLabel <em>Label</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getVDMLElement <em>VDML Element</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isHorizontal <em>Is Horizontal</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isMarkerVisible <em>Is Marker Visible</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getOwnedShape <em>Owned Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLShape()
 * @model extendedMetaData="name='VDMLShape' kind='elementOnly'"
 * @generated
 */
public interface VDMLShape extends LabeledShape {
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
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLShape_Label()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='VDMLLabel' namespace='##targetNamespace'"
     * @generated
     */
    VDMLLabel getLabel();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getLabel <em>Label</em>}' containment reference.
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
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLShape_VDMLElement()
     * @model extendedMetaData="kind='attribute' name='VDMLElement'"
     * @generated
     */
    VdmlElement getVDMLElement();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#getVDMLElement <em>VDML Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VDML Element</em>' reference.
     * @see #getVDMLElement()
     * @generated
     */
    void setVDMLElement(VdmlElement value);

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
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLShape_IsExpanded()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isExpanded'"
     * @generated
     */
    boolean isExpanded();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isExpanded <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Expanded</em>' attribute.
     * @see #isSetIsExpanded()
     * @see #unsetIsExpanded()
     * @see #isExpanded()
     * @generated
     */
    void setIsExpanded(boolean value);

    /**
     * Unsets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isExpanded <em>Is Expanded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsExpanded()
     * @see #isExpanded()
     * @see #setIsExpanded(boolean)
     * @generated
     */
    void unsetIsExpanded();

    /**
     * Returns whether the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isExpanded <em>Is Expanded</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Expanded</em>' attribute is set.
     * @see #unsetIsExpanded()
     * @see #isExpanded()
     * @see #setIsExpanded(boolean)
     * @generated
     */
    boolean isSetIsExpanded();

    /**
     * Returns the value of the '<em><b>Is Horizontal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Horizontal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Horizontal</em>' attribute.
     * @see #isSetIsHorizontal()
     * @see #unsetIsHorizontal()
     * @see #setIsHorizontal(boolean)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLShape_IsHorizontal()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isHorizontal'"
     * @generated
     */
    boolean isHorizontal();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isHorizontal <em>Is Horizontal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Horizontal</em>' attribute.
     * @see #isSetIsHorizontal()
     * @see #unsetIsHorizontal()
     * @see #isHorizontal()
     * @generated
     */
    void setIsHorizontal(boolean value);

    /**
     * Unsets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isHorizontal <em>Is Horizontal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsHorizontal()
     * @see #isHorizontal()
     * @see #setIsHorizontal(boolean)
     * @generated
     */
    void unsetIsHorizontal();

    /**
     * Returns whether the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isHorizontal <em>Is Horizontal</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Horizontal</em>' attribute is set.
     * @see #unsetIsHorizontal()
     * @see #isHorizontal()
     * @see #setIsHorizontal(boolean)
     * @generated
     */
    boolean isSetIsHorizontal();

    /**
     * Returns the value of the '<em><b>Is Marker Visible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Marker Visible</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Marker Visible</em>' attribute.
     * @see #isSetIsMarkerVisible()
     * @see #unsetIsMarkerVisible()
     * @see #setIsMarkerVisible(boolean)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLShape_IsMarkerVisible()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isMarkerVisible'"
     * @generated
     */
    boolean isMarkerVisible();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isMarkerVisible <em>Is Marker Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Marker Visible</em>' attribute.
     * @see #isSetIsMarkerVisible()
     * @see #unsetIsMarkerVisible()
     * @see #isMarkerVisible()
     * @generated
     */
    void setIsMarkerVisible(boolean value);

    /**
     * Unsets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isMarkerVisible <em>Is Marker Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsMarkerVisible()
     * @see #isMarkerVisible()
     * @see #setIsMarkerVisible(boolean)
     * @generated
     */
    void unsetIsMarkerVisible();

    /**
     * Returns whether the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape#isMarkerVisible <em>Is Marker Visible</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Marker Visible</em>' attribute is set.
     * @see #unsetIsMarkerVisible()
     * @see #isMarkerVisible()
     * @see #setIsMarkerVisible(boolean)
     * @generated
     */
    boolean isSetIsMarkerVisible();

    /**
     * Returns the value of the '<em><b>Owned Shape</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.dd.cmmn.di.DiagramElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Shape</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Shape</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLShape_OwnedShape()
     * @model containment="true"
     * @generated
     */
    EList<DiagramElement> getOwnedShape();

} // VDMLShape
