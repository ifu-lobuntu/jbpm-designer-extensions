/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.BinaryMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.omg.smm.BinaryMeasurement#getBaseQuery <em>Base Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getBinaryMeasurement()
 * @model
 * @generated
 */
public interface BinaryMeasurement extends DimensionalMeasurement {
    /**
     * Returns the value of the '<em><b>Is Base Supplied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Base Supplied</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Base Supplied</em>' attribute.
     * @see #setIsBaseSupplied(Boolean)
     * @see org.omg.smm.SMMPackage#getBinaryMeasurement_IsBaseSupplied()
     * @model dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsBaseSupplied();

    /**
     * Sets the value of the '{@link org.omg.smm.BinaryMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Base Supplied</em>' attribute.
     * @see #getIsBaseSupplied()
     * @generated
     */
    void setIsBaseSupplied(Boolean value);

    /**
     * Returns the value of the '<em><b>Base Query</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Query</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Query</em>' reference.
     * @see #setBaseQuery(Operation)
     * @see org.omg.smm.SMMPackage#getBinaryMeasurement_BaseQuery()
     * @model ordered="false"
     * @generated
     */
    Operation getBaseQuery();

    /**
     * Sets the value of the '{@link org.omg.smm.BinaryMeasurement#getBaseQuery <em>Base Query</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Query</em>' reference.
     * @see #getBaseQuery()
     * @generated
     */
    void setBaseQuery(Operation value);

} // BinaryMeasurement
