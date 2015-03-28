/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base2 Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.Base2MeasureRelationship#getFromBinaryMeasure <em>From Binary Measure</em>}</li>
 *   <li>{@link org.omg.smm.Base2MeasureRelationship#getToDimensionalMeasure <em>To Dimensional Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getBase2MeasureRelationship()
 * @model
 * @generated
 */
public interface Base2MeasureRelationship extends BaseMeasureRelationship {

    /**
     * Returns the value of the '<em><b>From Binary Measure</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.omg.smm.BinaryMeasure#getBaseMeasure2To <em>Base Measure2 To</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Binary Measure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Binary Measure</em>' container reference.
     * @see #setFromBinaryMeasure(BinaryMeasure)
     * @see org.omg.smm.SMMPackage#getBase2MeasureRelationship_FromBinaryMeasure()
     * @see org.omg.smm.BinaryMeasure#getBaseMeasure2To
     * @model opposite="baseMeasure2To" transient="false"
     * @generated
     */
    BinaryMeasure getFromBinaryMeasure();

    /**
     * Sets the value of the '{@link org.omg.smm.Base2MeasureRelationship#getFromBinaryMeasure <em>From Binary Measure</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Binary Measure</em>' container reference.
     * @see #getFromBinaryMeasure()
     * @generated
     */
    void setFromBinaryMeasure(BinaryMeasure value);

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
     * @see org.omg.smm.SMMPackage#getBase2MeasureRelationship_ToDimensionalMeasure()
     * @model
     * @generated
     */
    DimensionalMeasure getToDimensionalMeasure();

    /**
     * Sets the value of the '{@link org.omg.smm.Base2MeasureRelationship#getToDimensionalMeasure <em>To Dimensional Measure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To Dimensional Measure</em>' reference.
     * @see #getToDimensionalMeasure()
     * @generated
     */
    void setToDimensionalMeasure(DimensionalMeasure value);
} // Base2MeasureRelationship
