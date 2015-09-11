/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counting Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.CountingMeasure#getCountedMeasureTo <em>Counted Measure To</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getCountingMeasure()
 * @model
 * @generated
 */
public interface CountingMeasure extends DirectMeasure {

	/**
	 * Returns the value of the '<em><b>Counted Measure To</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.CountingMeasureRelationship#getFromCountingMeasure <em>From Counting Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counted Measure To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counted Measure To</em>' containment reference.
	 * @see #setCountedMeasureTo(CountingMeasureRelationship)
	 * @see org.omg.smm.SMMPackage#getCountingMeasure_CountedMeasureTo()
	 * @see org.omg.smm.CountingMeasureRelationship#getFromCountingMeasure
	 * @model opposite="fromCountingMeasure" containment="true"
	 * @generated
	 */
	CountingMeasureRelationship getCountedMeasureTo();

	/**
	 * Sets the value of the '{@link org.omg.smm.CountingMeasure#getCountedMeasureTo <em>Counted Measure To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counted Measure To</em>' containment reference.
	 * @see #getCountedMeasureTo()
	 * @generated
	 */
	void setCountedMeasureTo(CountingMeasureRelationship value);
} // CountingMeasure
