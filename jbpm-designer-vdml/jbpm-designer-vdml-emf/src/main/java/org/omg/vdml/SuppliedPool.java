/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplied Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.SuppliedPool#getPoolCalendar <em>Pool Calendar</em>}</li>
 *   <li>{@link org.omg.vdml.SuppliedPool#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.omg.vdml.SuppliedPool#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getSuppliedPool()
 * @model
 * @generated
 */
public interface SuppliedPool extends SuppliedStore {
	/**
	 * Returns the value of the '<em><b>Pool Calendar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Calendar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Calendar</em>' containment reference.
	 * @see #setPoolCalendar(CalendarService)
	 * @see org.omg.vdml.VDMLPackage#getSuppliedPool_PoolCalendar()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CalendarService getPoolCalendar();

	/**
	 * Sets the value of the '{@link org.omg.vdml.SuppliedPool#getPoolCalendar <em>Pool Calendar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Calendar</em>' containment reference.
	 * @see #getPoolCalendar()
	 * @generated
	 */
	void setPoolCalendar(CalendarService value);

	/**
	 * Returns the value of the '<em><b>Pool Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Size</em>' containment reference.
	 * @see #setPoolSize(MeasuredCharacteristic)
	 * @see org.omg.vdml.VDMLPackage#getSuppliedPool_PoolSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MeasuredCharacteristic getPoolSize();

	/**
	 * Sets the value of the '{@link org.omg.vdml.SuppliedPool#getPoolSize <em>Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size</em>' containment reference.
	 * @see #getPoolSize()
	 * @generated
	 */
	void setPoolSize(MeasuredCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference list.
	 * The list contents are of type {@link org.omg.vdml.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference list.
	 * @see org.omg.vdml.VDMLPackage#getSuppliedPool_Position()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Position> getPosition();

} // SuppliedPool
