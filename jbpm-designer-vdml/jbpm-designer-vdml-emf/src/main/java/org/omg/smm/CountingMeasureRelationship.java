/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counting Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.CountingMeasureRelationship#getFromCountingMeasure <em>From Counting Measure</em>}</li>
 *   <li>{@link org.omg.smm.CountingMeasureRelationship#getToCountedMeasure <em>To Counted Measure</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getCountingMeasureRelationship()
 * @model
 * @generated
 */
public interface CountingMeasureRelationship extends MeasureRelationship {
	/**
	 * Returns the value of the '<em><b>From Counting Measure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.CountingMeasure#getCountedMeasureTo <em>Counted Measure To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Counting Measure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Counting Measure</em>' container reference.
	 * @see #setFromCountingMeasure(CountingMeasure)
	 * @see org.omg.smm.SMMPackage#getCountingMeasureRelationship_FromCountingMeasure()
	 * @see org.omg.smm.CountingMeasure#getCountedMeasureTo
	 * @model opposite="countedMeasureTo" required="true" transient="false"
	 * @generated
	 */
	CountingMeasure getFromCountingMeasure();

	/**
	 * Sets the value of the '{@link org.omg.smm.CountingMeasureRelationship#getFromCountingMeasure <em>From Counting Measure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Counting Measure</em>' container reference.
	 * @see #getFromCountingMeasure()
	 * @generated
	 */
	void setFromCountingMeasure(CountingMeasure value);

	/**
	 * Returns the value of the '<em><b>To Counted Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Counted Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Counted Measure</em>' reference.
	 * @see #setToCountedMeasure(Measure)
	 * @see org.omg.smm.SMMPackage#getCountingMeasureRelationship_ToCountedMeasure()
	 * @model
	 * @generated
	 */
	Measure getToCountedMeasure();

	/**
	 * Sets the value of the '{@link org.omg.smm.CountingMeasureRelationship#getToCountedMeasure <em>To Counted Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Counted Measure</em>' reference.
	 * @see #getToCountedMeasure()
	 * @generated
	 */
	void setToCountedMeasure(Measure value);

} // CountingMeasureRelationship
