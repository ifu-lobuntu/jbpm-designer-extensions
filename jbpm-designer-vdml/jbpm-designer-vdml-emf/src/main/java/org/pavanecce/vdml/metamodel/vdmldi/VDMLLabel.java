/**
 */
package org.pavanecce.vdml.metamodel.vdmldi;

import org.eclipse.dd.cmmn.di.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLLabel()
 * @model extendedMetaData="name='VDMLLabel' kind='elementOnly'"
 * @generated
 */
public interface VDMLLabel extends Label {
    /**
     * Returns the value of the '<em><b>Label Style</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label Style</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label Style</em>' reference.
     * @see #setLabelStyle(VDMLLabelStyle)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLLabel_LabelStyle()
     * @model extendedMetaData="kind='attribute' name='labelStyle'"
     * @generated
     */
    VDMLLabelStyle getLabelStyle();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel#getLabelStyle <em>Label Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label Style</em>' reference.
     * @see #getLabelStyle()
     * @generated
     */
    void setLabelStyle(VDMLLabelStyle value);

} // VDMLLabel
