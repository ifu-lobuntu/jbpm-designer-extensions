/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.Scenario#getHorizon <em>Horizon</em>}</li>
 *   <li>{@link org.omg.vdml.Scenario#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.vdml.Scenario#getReleaseControl <em>Release Control</em>}</li>
 *   <li>{@link org.omg.vdml.Scenario#getIsCommon <em>Is Common</em>}</li>
 *   <li>{@link org.omg.vdml.Scenario#getHeatThreshold <em>Heat Threshold</em>}</li>
 *   <li>{@link org.omg.vdml.Scenario#getContextActor <em>Context Actor</em>}</li>
 *   <li>{@link org.omg.vdml.Scenario#getContextCollaboration <em>Context Collaboration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends AnalysisContext {
    /**
     * Returns the value of the '<em><b>Horizon</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Horizon</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Horizon</em>' containment reference.
     * @see #setHorizon(MeasuredCharacteristic)
     * @see org.omg.vdml.VDMLPackage#getScenario_Horizon()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getHorizon();

    /**
     * Sets the value of the '{@link org.omg.vdml.Scenario#getHorizon <em>Horizon</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Horizon</em>' containment reference.
     * @see #getHorizon()
     * @generated
     */
    void setHorizon(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.omg.vdml.VDMLPackage#getScenario_Type()
     * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.omg.vdml.Scenario#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Release Control</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.ReleaseControl}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.ReleaseControl#getScenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Release Control</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Release Control</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getScenario_ReleaseControl()
     * @see org.omg.vdml.ReleaseControl#getScenario
     * @model opposite="scenario" ordered="false"
     * @generated
     */
    EList<ReleaseControl> getReleaseControl();

    /**
     * Returns the value of the '<em><b>Is Common</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Common</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Common</em>' attribute.
     * @see #setIsCommon(Boolean)
     * @see org.omg.vdml.VDMLPackage#getScenario_IsCommon()
     * @model default="false" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsCommon();

    /**
     * Sets the value of the '{@link org.omg.vdml.Scenario#getIsCommon <em>Is Common</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Common</em>' attribute.
     * @see #getIsCommon()
     * @generated
     */
    void setIsCommon(Boolean value);

    /**
     * Returns the value of the '<em><b>Heat Threshold</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heat Threshold</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heat Threshold</em>' containment reference.
     * @see #setHeatThreshold(MeasuredCharacteristic)
     * @see org.omg.vdml.VDMLPackage#getScenario_HeatThreshold()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getHeatThreshold();

    /**
     * Sets the value of the '{@link org.omg.vdml.Scenario#getHeatThreshold <em>Heat Threshold</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heat Threshold</em>' containment reference.
     * @see #getHeatThreshold()
     * @generated
     */
    void setHeatThreshold(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Context Actor</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.Actor}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.Actor#getScenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Actor</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Actor</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getScenario_ContextActor()
     * @see org.omg.vdml.Actor#getScenario
     * @model opposite="scenario" ordered="false"
     * @generated
     */
    EList<Actor> getContextActor();

    /**
     * Returns the value of the '<em><b>Context Collaboration</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.Collaboration}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.Collaboration#getScenario <em>Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Collaboration</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Collaboration</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getScenario_ContextCollaboration()
     * @see org.omg.vdml.Collaboration#getScenario
     * @model opposite="scenario" ordered="false"
     * @generated
     */
    EList<Collaboration> getContextCollaboration();

} // Scenario
