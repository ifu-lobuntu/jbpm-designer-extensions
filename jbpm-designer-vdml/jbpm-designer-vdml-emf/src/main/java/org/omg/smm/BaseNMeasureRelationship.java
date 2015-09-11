/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base NMeasure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.BaseNMeasureRelationship#getFromCollectiveMeasure <em>From Collective Measure</em>}</li>
 *   <li>{@link org.omg.smm.BaseNMeasureRelationship#getToDimensionalMeasure <em>To Dimensional Measure</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getBaseNMeasureRelationship()
 * @model
 * @generated
 */
public interface BaseNMeasureRelationship extends BaseMeasureRelationship {

    /**
	 * Returns the value of the '<em><b>From Collective Measure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.CollectiveMeasure#getBaseMeasureTo <em>Base Measure To</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Collective Measure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>From Collective Measure</em>' container reference.
	 * @see #setFromCollectiveMeasure(CollectiveMeasure)
	 * @see org.omg.smm.SMMPackage#getBaseNMeasureRelationship_FromCollectiveMeasure()
	 * @see org.omg.smm.CollectiveMeasure#getBaseMeasureTo
	 * @model opposite="baseMeasureTo" transient="false"
	 * @generated
	 */
    CollectiveMeasure getFromCollectiveMeasure();

    /**
	 * Sets the value of the '{@link org.omg.smm.BaseNMeasureRelationship#getFromCollectiveMeasure <em>From Collective Measure</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Collective Measure</em>' container reference.
	 * @see #getFromCollectiveMeasure()
	 * @generated
	 */
    void setFromCollectiveMeasure(CollectiveMeasure value);

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
	 * @see org.omg.smm.SMMPackage#getBaseNMeasureRelationship_ToDimensionalMeasure()
	 * @model
	 * @generated
	 */
    DimensionalMeasure getToDimensionalMeasure();

    /**
	 * Sets the value of the '{@link org.omg.smm.BaseNMeasureRelationship#getToDimensionalMeasure <em>To Dimensional Measure</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Dimensional Measure</em>' reference.
	 * @see #getToDimensionalMeasure()
	 * @generated
	 */
    void setToDimensionalMeasure(DimensionalMeasure value);
} // BaseNMeasureRelationship
