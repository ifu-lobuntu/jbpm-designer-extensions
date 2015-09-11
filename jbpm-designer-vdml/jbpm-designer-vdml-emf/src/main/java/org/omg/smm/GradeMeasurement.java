/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.GradeMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.omg.smm.GradeMeasurement#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.smm.GradeMeasurement#getBaseQuery <em>Base Query</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getGradeMeasurement()
 * @model
 * @generated
 */
public interface GradeMeasurement extends Measurement {
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
	 * @see org.omg.smm.SMMPackage#getGradeMeasurement_IsBaseSupplied()
	 * @model dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
    Boolean getIsBaseSupplied();

    /**
	 * Sets the value of the '{@link org.omg.smm.GradeMeasurement#getIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #getIsBaseSupplied()
	 * @generated
	 */
    void setIsBaseSupplied(Boolean value);

    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.omg.smm.SMMPackage#getGradeMeasurement_Value()
	 * @model dataType="org.omg.dd.primitivetypes.String" ordered="false"
	 * @generated
	 */
    String getValue();

    /**
	 * Sets the value of the '{@link org.omg.smm.GradeMeasurement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(String value);

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
	 * @see org.omg.smm.SMMPackage#getGradeMeasurement_BaseQuery()
	 * @model ordered="false"
	 * @generated
	 */
    Operation getBaseQuery();

    /**
	 * Sets the value of the '{@link org.omg.smm.GradeMeasurement#getBaseQuery <em>Base Query</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Query</em>' reference.
	 * @see #getBaseQuery()
	 * @generated
	 */
    void setBaseQuery(Operation value);

} // GradeMeasurement
