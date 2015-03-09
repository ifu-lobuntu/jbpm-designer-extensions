/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.CapabilityOffer#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityOffer#getCapabilityResource <em>Capability Resource</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityOffer#getMethod <em>Method</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityOffer#getReleaseControl <em>Release Control</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityOffer#getApplyingActivity <em>Applying Activity</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityOffer#getHeatIndex <em>Heat Index</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityOffer#getLocation <em>Location</em>}</li>
 *   <li>{@link org.omg.vdml.CapabilityOffer#getCapabilityProvider <em>Capability Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getCapabilityOffer()
 * @model
 * @generated
 */
public interface CapabilityOffer extends MeasurableElement {
    /**
     * Returns the value of the '<em><b>Capability</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability</em>' reference.
     * @see #setCapability(Capability)
     * @see org.omg.vdml.VDMLPackage#getCapabilityOffer_Capability()
     * @model ordered="false"
     * @generated
     */
    Capability getCapability();

    /**
     * Sets the value of the '{@link org.omg.vdml.CapabilityOffer#getCapability <em>Capability</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capability</em>' reference.
     * @see #getCapability()
     * @generated
     */
    void setCapability(Capability value);

    /**
     * Returns the value of the '<em><b>Capability Resource</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.Store}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.Store#getSupportedCapability <em>Supported Capability</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Resource</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Resource</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getCapabilityOffer_CapabilityResource()
     * @see org.omg.vdml.Store#getSupportedCapability
     * @model opposite="supportedCapability" ordered="false"
     * @generated
     */
    EList<Store> getCapabilityResource();

    /**
     * Returns the value of the '<em><b>Method</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.CapabilityMethod}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityMethod#getSupportedCapability <em>Supported Capability</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Method</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Method</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getCapabilityOffer_Method()
     * @see org.omg.vdml.CapabilityMethod#getSupportedCapability
     * @model opposite="supportedCapability" ordered="false"
     * @generated
     */
    EList<CapabilityMethod> getMethod();

    /**
     * Returns the value of the '<em><b>Release Control</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.ReleaseControl}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Release Control</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Release Control</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getCapabilityOffer_ReleaseControl()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ReleaseControl> getReleaseControl();

    /**
     * Returns the value of the '<em><b>Applying Activity</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.Activity}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.Activity#getAppliedCapabilityOffer <em>Applied Capability Offer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applying Activity</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applying Activity</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getCapabilityOffer_ApplyingActivity()
     * @see org.omg.vdml.Activity#getAppliedCapabilityOffer
     * @model opposite="appliedCapabilityOffer" ordered="false"
     * @generated
     */
    EList<Activity> getApplyingActivity();

    /**
     * Returns the value of the '<em><b>Heat Index</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heat Index</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heat Index</em>' containment reference.
     * @see #setHeatIndex(MeasuredCharacteristic)
     * @see org.omg.vdml.VDMLPackage#getCapabilityOffer_HeatIndex()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getHeatIndex();

    /**
     * Sets the value of the '{@link org.omg.vdml.CapabilityOffer#getHeatIndex <em>Heat Index</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heat Index</em>' containment reference.
     * @see #getHeatIndex()
     * @generated
     */
    void setHeatIndex(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' attribute.
     * @see #setLocation(String)
     * @see org.omg.vdml.VDMLPackage#getCapabilityOffer_Location()
     * @model dataType="org.omg.dd.primitivetypes.String" ordered="false"
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the '{@link org.omg.vdml.CapabilityOffer#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
    void setLocation(String value);

    /**
     * Returns the value of the '<em><b>Capability Provider</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.OrgUnit#getCapabilityOffer <em>Capability Offer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Provider</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Provider</em>' container reference.
     * @see #setCapabilityProvider(OrgUnit)
     * @see org.omg.vdml.VDMLPackage#getCapabilityOffer_CapabilityProvider()
     * @see org.omg.vdml.OrgUnit#getCapabilityOffer
     * @model opposite="capabilityOffer" required="true" transient="false" ordered="false"
     * @generated
     */
    OrgUnit getCapabilityProvider();

    /**
     * Sets the value of the '{@link org.omg.vdml.CapabilityOffer#getCapabilityProvider <em>Capability Provider</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capability Provider</em>' container reference.
     * @see #getCapabilityProvider()
     * @generated
     */
    void setCapabilityProvider(OrgUnit value);

} // CapabilityOffer
