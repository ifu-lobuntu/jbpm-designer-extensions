/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rescaled Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.RescaledMeasureRelationship#getFromDimensionalMeasure <em>From Dimensional Measure</em>}</li>
 *   <li>{@link org.omg.smm.RescaledMeasureRelationship#getToRescaledMeasure <em>To Rescaled Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getRescaledMeasureRelationship()
 * @model
 * @generated
 */
public interface RescaledMeasureRelationship extends MeasureRelationship {

    /**
     * Returns the value of the '<em><b>From Dimensional Measure</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Dimensional Measure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Dimensional Measure</em>' reference.
     * @see #setFromDimensionalMeasure(DimensionalMeasure)
     * @see org.omg.smm.SMMPackage#getRescaledMeasureRelationship_FromDimensionalMeasure()
     * @model required="true"
     * @generated
     */
    DimensionalMeasure getFromDimensionalMeasure();

    /**
     * Sets the value of the '{@link org.omg.smm.RescaledMeasureRelationship#getFromDimensionalMeasure <em>From Dimensional Measure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Dimensional Measure</em>' reference.
     * @see #getFromDimensionalMeasure()
     * @generated
     */
    void setFromDimensionalMeasure(DimensionalMeasure value);

    /**
     * Returns the value of the '<em><b>To Rescaled Measure</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.omg.smm.RescaledMeasure#getRescalesFrom <em>Rescales From</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To Rescaled Measure</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To Rescaled Measure</em>' container reference.
     * @see #setToRescaledMeasure(RescaledMeasure)
     * @see org.omg.smm.SMMPackage#getRescaledMeasureRelationship_ToRescaledMeasure()
     * @see org.omg.smm.RescaledMeasure#getRescalesFrom
     * @model opposite="rescalesFrom" transient="false"
     * @generated
     */
    RescaledMeasure getToRescaledMeasure();

    /**
     * Sets the value of the '{@link org.omg.smm.RescaledMeasureRelationship#getToRescaledMeasure <em>To Rescaled Measure</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To Rescaled Measure</em>' container reference.
     * @see #getToRescaledMeasure()
     * @generated
     */
    void setToRescaledMeasure(RescaledMeasure value);
} // RescaledMeasureRelationship
