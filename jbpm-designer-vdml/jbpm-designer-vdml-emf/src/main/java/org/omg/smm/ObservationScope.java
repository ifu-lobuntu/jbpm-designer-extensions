/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.ObservationScope#getScopeUri <em>Scope Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getObservationScope()
 * @model
 * @generated
 */
public interface ObservationScope extends SmmElement {
    /**
     * Returns the value of the '<em><b>Scope Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scope Uri</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scope Uri</em>' attribute.
     * @see #setScopeUri(String)
     * @see org.omg.smm.SMMPackage#getObservationScope_ScopeUri()
     * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
     * @generated
     */
    String getScopeUri();

    /**
     * Sets the value of the '{@link org.omg.smm.ObservationScope#getScopeUri <em>Scope Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope Uri</em>' attribute.
     * @see #getScopeUri()
     * @generated
     */
    void setScopeUri(String value);

} // ObservationScope
