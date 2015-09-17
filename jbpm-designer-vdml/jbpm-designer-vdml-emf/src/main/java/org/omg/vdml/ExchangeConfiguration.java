/**
 */
package org.omg.vdml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.ExchangeConfiguration#getExchangeMethod <em>Exchange Method</em>}</li>
 *   <li>{@link org.omg.vdml.ExchangeConfiguration#getSupplierRole <em>Supplier Role</em>}</li>
 *   <li>{@link org.omg.vdml.ExchangeConfiguration#getResourceUseFromPool <em>Resource Use From Pool</em>}</li>
 *   <li>{@link org.omg.vdml.ExchangeConfiguration#getExchangeMilestone <em>Exchange Milestone</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getExchangeConfiguration()
 * @model
 * @generated
 */
public interface ExchangeConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Exchange Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Method</em>' reference.
	 * @see #setExchangeMethod(CapabilityMethod)
	 * @see org.omg.vdml.VDMLPackage#getExchangeConfiguration_ExchangeMethod()
	 * @model
	 * @generated
	 */
	CapabilityMethod getExchangeMethod();

	/**
	 * Sets the value of the '{@link org.omg.vdml.ExchangeConfiguration#getExchangeMethod <em>Exchange Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Method</em>' reference.
	 * @see #getExchangeMethod()
	 * @generated
	 */
	void setExchangeMethod(CapabilityMethod value);

	/**
	 * Returns the value of the '<em><b>Supplier Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Role</em>' reference.
	 * @see #setSupplierRole(Role)
	 * @see org.omg.vdml.VDMLPackage#getExchangeConfiguration_SupplierRole()
	 * @model
	 * @generated
	 */
	Role getSupplierRole();

	/**
	 * Sets the value of the '{@link org.omg.vdml.ExchangeConfiguration#getSupplierRole <em>Supplier Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Role</em>' reference.
	 * @see #getSupplierRole()
	 * @generated
	 */
	void setSupplierRole(Role value);

	/**
	 * Returns the value of the '<em><b>Resource Use From Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Use From Pool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Use From Pool</em>' reference.
	 * @see #setResourceUseFromPool(ResourceUse)
	 * @see org.omg.vdml.VDMLPackage#getExchangeConfiguration_ResourceUseFromPool()
	 * @model
	 * @generated
	 */
	ResourceUse getResourceUseFromPool();

	/**
	 * Sets the value of the '{@link org.omg.vdml.ExchangeConfiguration#getResourceUseFromPool <em>Resource Use From Pool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Use From Pool</em>' reference.
	 * @see #getResourceUseFromPool()
	 * @generated
	 */
	void setResourceUseFromPool(ResourceUse value);

	/**
	 * Returns the value of the '<em><b>Exchange Milestone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Milestone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Milestone</em>' reference.
	 * @see #setExchangeMilestone(Milestone)
	 * @see org.omg.vdml.VDMLPackage#getExchangeConfiguration_ExchangeMilestone()
	 * @model
	 * @generated
	 */
	Milestone getExchangeMilestone();

	/**
	 * Sets the value of the '{@link org.omg.vdml.ExchangeConfiguration#getExchangeMilestone <em>Exchange Milestone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Milestone</em>' reference.
	 * @see #getExchangeMilestone()
	 * @generated
	 */
	void setExchangeMilestone(Milestone value);

} // ExchangeConfiguration
