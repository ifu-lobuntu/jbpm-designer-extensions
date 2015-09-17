/**
 */
package org.omg.vdml;

import org.omg.smm.Characteristic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.PoolDefinition#getPoolSize <em>Pool Size</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getPoolDefinition()
 * @model
 * @generated
 */
public interface PoolDefinition extends StoreDefinition {

	/**
	 * Returns the value of the '<em><b>Pool Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Size</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Size</em>' reference.
	 * @see #setPoolSize(Characteristic)
	 * @see org.omg.vdml.VDMLPackage#getPoolDefinition_PoolSize()
	 * @model
	 * @generated
	 */
	Characteristic getPoolSize();

	/**
	 * Sets the value of the '{@link org.omg.vdml.PoolDefinition#getPoolSize <em>Pool Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size</em>' reference.
	 * @see #getPoolSize()
	 * @generated
	 */
	void setPoolSize(Characteristic value);
} // PoolDefinition
