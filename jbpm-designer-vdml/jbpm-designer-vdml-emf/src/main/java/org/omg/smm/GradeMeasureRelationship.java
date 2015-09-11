/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.GradeMeasureRelationship#getFromGradeMeasure <em>From Grade Measure</em>}</li>
 *   <li>{@link org.omg.smm.GradeMeasureRelationship#getToDimensionalMeasure <em>To Dimensional Measure</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getGradeMeasureRelationship()
 * @model
 * @generated
 */
public interface GradeMeasureRelationship extends MeasureRelationship {

    /**
	 * Returns the value of the '<em><b>From Grade Measure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.GradeMeasure#getGradeTo <em>Grade To</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Grade Measure</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>From Grade Measure</em>' container reference.
	 * @see #setFromGradeMeasure(GradeMeasure)
	 * @see org.omg.smm.SMMPackage#getGradeMeasureRelationship_FromGradeMeasure()
	 * @see org.omg.smm.GradeMeasure#getGradeTo
	 * @model opposite="gradeTo" required="true" transient="false"
	 * @generated
	 */
    GradeMeasure getFromGradeMeasure();

    /**
	 * Sets the value of the '{@link org.omg.smm.GradeMeasureRelationship#getFromGradeMeasure <em>From Grade Measure</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Grade Measure</em>' container reference.
	 * @see #getFromGradeMeasure()
	 * @generated
	 */
    void setFromGradeMeasure(GradeMeasure value);

    /**
	 * Returns the value of the '<em><b>To Dimensional Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To Dimensional Measure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>To Dimensional Measure</em>' reference.
	 * @see #setToDimensionalMeasure(DimensionalMeasure)
	 * @see org.omg.smm.SMMPackage#getGradeMeasureRelationship_ToDimensionalMeasure()
	 * @model
	 * @generated
	 */
    DimensionalMeasure getToDimensionalMeasure();

    /**
	 * Sets the value of the '{@link org.omg.smm.GradeMeasureRelationship#getToDimensionalMeasure <em>To Dimensional Measure</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Dimensional Measure</em>' reference.
	 * @see #getToDimensionalMeasure()
	 * @generated
	 */
    void setToDimensionalMeasure(DimensionalMeasure value);
} // GradeMeasureRelationship
