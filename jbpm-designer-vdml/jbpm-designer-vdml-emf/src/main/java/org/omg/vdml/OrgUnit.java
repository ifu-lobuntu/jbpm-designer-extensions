/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.OrgUnit#getCapabilityOffer <em>Capability Offer</em>}</li>
 *   <li>{@link org.omg.vdml.OrgUnit#getOwnedMethod <em>Owned Method</em>}</li>
 *   <li>{@link org.omg.vdml.OrgUnit#getPosition <em>Position</em>}</li>
 *   <li>{@link org.omg.vdml.OrgUnit#getLocation <em>Location</em>}</li>
 *   <li>{@link org.omg.vdml.OrgUnit#getOwnedStore <em>Owned Store</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getOrgUnit()
 * @model
 * @generated
 */
public interface OrgUnit extends Collaboration {
    /**
     * Returns the value of the '<em><b>Capability Offer</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.CapabilityOffer}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityOffer#getCapabilityProvider <em>Capability Provider</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Offer</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Offer</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getOrgUnit_CapabilityOffer()
     * @see org.omg.vdml.CapabilityOffer#getCapabilityProvider
     * @model opposite="capabilityProvider" containment="true" ordered="false"
     * @generated
     */
    EList<CapabilityOffer> getCapabilityOffer();

    /**
     * Returns the value of the '<em><b>Owned Method</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.CapabilityMethod}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityMethod#getMethodOwner <em>Method Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Method</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Method</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getOrgUnit_OwnedMethod()
     * @see org.omg.vdml.CapabilityMethod#getMethodOwner
     * @model opposite="methodOwner" containment="true" ordered="false"
     * @generated
     */
    EList<CapabilityMethod> getOwnedMethod();

    /**
     * Returns the value of the '<em><b>Position</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.Position}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getOrgUnit_Position()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Position> getPosition();

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
     * @see org.omg.vdml.VDMLPackage#getOrgUnit_Location()
     * @model dataType="org.omg.dd.primitivetypes.String" ordered="false"
     * @generated
     */
    String getLocation();

    /**
     * Sets the value of the '{@link org.omg.vdml.OrgUnit#getLocation <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' attribute.
     * @see #getLocation()
     * @generated
     */
    void setLocation(String value);

    /**
     * Returns the value of the '<em><b>Owned Store</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.vdml.Store}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.Store#getStoreOwner <em>Store Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Store</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Store</em>' containment reference list.
     * @see org.omg.vdml.VDMLPackage#getOrgUnit_OwnedStore()
     * @see org.omg.vdml.Store#getStoreOwner
     * @model opposite="storeOwner" containment="true" ordered="false"
     * @generated
     */
    EList<Store> getOwnedStore();

} // OrgUnit
