/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.ReleaseControl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.omg.vdml.ReleaseControl#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getReleaseControl()
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
     * @see org.omg.vdml.VDMLPackage#getReleaseControl_Strategy()
     * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getStrategy();

    /**
     * Sets the value of the '{@link org.omg.vdml.ReleaseControl#getStrategy <em>Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Strategy</em>' attribute.
     * @see #getStrategy()
     * @generated
     */
    void setStrategy(String value);

    /**
     * Returns the value of the '<em><b>Scenario</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.Scenario}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.Scenario#getReleaseControl <em>Release Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scenario</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scenario</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getReleaseControl_Scenario()
     * @see org.omg.vdml.Scenario#getReleaseControl
     * @model opposite="releaseControl" ordered="false"
     * @generated
     */
    EList<Scenario> getScenario();

} // ReleaseControl
