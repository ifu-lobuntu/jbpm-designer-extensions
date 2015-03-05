/**
 */
package org.pavanecce.vdml.metamodel.vdmldi;

import org.eclipse.dd.cmmn.dc.Font;
import org.eclipse.dd.cmmn.di.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDML Label Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLLabelStyle()
 * @model extendedMetaData="name='VDMLLabelStyle' kind='elementOnly'"
 * @generated
 */
public interface VDMLLabelStyle extends Style {
    /**
     * Returns the value of the '<em><b>Font</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font</em>' containment reference.
     * @see #setFont(Font)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getVDMLLabelStyle_Font()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='Font' namespace='http://www.omg.org/spec/DD/20100524/DC'"
     * @generated
     */
    Font getFont();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle#getFont <em>Font</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font</em>' containment reference.
     * @see #getFont()
     * @generated
     */
    void setFont(Font value);

} // VDMLLabelStyle
