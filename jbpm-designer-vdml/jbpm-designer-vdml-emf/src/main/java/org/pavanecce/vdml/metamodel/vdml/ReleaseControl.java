/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ReleaseControl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ReleaseControl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getReleaseControl()
 * @model
 * @generated
 */
public interface ReleaseControl extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Strategy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Strategy</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Strategy</em>' attribute.
     * @see #setStrategy(String)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getReleaseControl_Strategy()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getStrategy();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.ReleaseControl#getStrategy <em>Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Strategy</em>' attribute.
     * @see #getStrategy()
     * @generated
     */
    void setStrategy(String value);

    /**
     * Returns the value of the '<em><b>Scenario</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Scenario}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Scenario#getReleaseControl <em>Release Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scenario</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scenario</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getReleaseControl_Scenario()
     * @see org.pavanecce.vdml.metamodel.vdml.Scenario#getReleaseControl
     * @model opposite="releaseControl" ordered="false"
     * @generated
     */
    EList<Scenario> getScenario();

} // ReleaseControl
