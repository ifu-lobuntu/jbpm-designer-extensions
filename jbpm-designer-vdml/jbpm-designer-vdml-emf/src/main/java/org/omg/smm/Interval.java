/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.Interval#getMaximumEndpoint <em>Maximum Endpoint</em>}</li>
 *   <li>{@link org.omg.smm.Interval#getMaximumOpen <em>Maximum Open</em>}</li>
 *   <li>{@link org.omg.smm.Interval#getMinimumEndpoint <em>Minimum Endpoint</em>}</li>
 *   <li>{@link org.omg.smm.Interval#getMinimumOpen <em>Minimum Open</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getInterval()
 * @model abstract="true"
 * @generated
 */
public interface Interval extends SmmElement {
    /**
     * Returns the value of the '<em><b>Maximum Endpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Endpoint</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Endpoint</em>' attribute.
     * @see #setMaximumEndpoint(Double)
     * @see org.omg.smm.SMMPackage#getInterval_MaximumEndpoint()
     * @model dataType="org.omg.dd.primitivetypes.Real" ordered="false"
     * @generated
     */
    Double getMaximumEndpoint();

    /**
     * Sets the value of the '{@link org.omg.smm.Interval#getMaximumEndpoint <em>Maximum Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Endpoint</em>' attribute.
     * @see #getMaximumEndpoint()
     * @generated
     */
    void setMaximumEndpoint(Double value);

    /**
     * Returns the value of the '<em><b>Maximum Open</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Open</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Open</em>' attribute.
     * @see #setMaximumOpen(Boolean)
     * @see org.omg.smm.SMMPackage#getInterval_MaximumOpen()
     * @model default="false" dataType="org.omg.dd.primitivetypes.Boolean" ordered="false"
     * @generated
     */
    Boolean getMaximumOpen();

    /**
     * Sets the value of the '{@link org.omg.smm.Interval#getMaximumOpen <em>Maximum Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Open</em>' attribute.
     * @see #getMaximumOpen()
     * @generated
     */
    void setMaximumOpen(Boolean value);

    /**
     * Returns the value of the '<em><b>Minimum Endpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimum Endpoint</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimum Endpoint</em>' attribute.
     * @see #setMinimumEndpoint(Double)
     * @see org.omg.smm.SMMPackage#getInterval_MinimumEndpoint()
     * @model dataType="org.omg.dd.primitivetypes.Real" ordered="false"
     * @generated
     */
    Double getMinimumEndpoint();

    /**
     * Sets the value of the '{@link org.omg.smm.Interval#getMinimumEndpoint <em>Minimum Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimum Endpoint</em>' attribute.
     * @see #getMinimumEndpoint()
     * @generated
     */
    void setMinimumEndpoint(Double value);

    /**
     * Returns the value of the '<em><b>Minimum Open</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimum Open</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimum Open</em>' attribute.
     * @see #setMinimumOpen(Boolean)
     * @see org.omg.smm.SMMPackage#getInterval_MinimumOpen()
     * @model default="false" dataType="org.omg.dd.primitivetypes.Boolean" ordered="false"
     * @generated
     */
    Boolean getMinimumOpen();

    /**
     * Sets the value of the '{@link org.omg.smm.Interval#getMinimumOpen <em>Minimum Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimum Open</em>' attribute.
     * @see #getMinimumOpen()
     * @generated
     */
    void setMinimumOpen(Boolean value);

} // Interval
