/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.RankingMeasureRelationship#getFromRankingMeasure <em>From Ranking Measure</em>}</li>
 *   <li>{@link org.omg.smm.RankingMeasureRelationship#getToDimensionalMeasure <em>To Dimensional Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getRankingMeasureRelationship()
 * @model
 * @generated
 */
public interface RankingMeasureRelationship extends BaseMeasureRelationship {

    /**
     * Returns the value of the '<em><b>From Ranking Measure</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.omg.smm.RankingMeasure#getRankingTo <em>Ranking To</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Ranking Measure</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Ranking Measure</em>' container reference.
     * @see #setFromRankingMeasure(RankingMeasure)
     * @see org.omg.smm.SMMPackage#getRankingMeasureRelationship_FromRankingMeasure()
     * @see org.omg.smm.RankingMeasure#getRankingTo
     * @model opposite="rankingTo" required="true" transient="false"
     * @generated
     */
    RankingMeasure getFromRankingMeasure();

    /**
     * Sets the value of the '{@link org.omg.smm.RankingMeasureRelationship#getFromRankingMeasure <em>From Ranking Measure</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Ranking Measure</em>' container reference.
     * @see #getFromRankingMeasure()
     * @generated
     */
    void setFromRankingMeasure(RankingMeasure value);

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
     * @see org.omg.smm.SMMPackage#getRankingMeasureRelationship_ToDimensionalMeasure()
     * @model
     * @generated
     */
    DimensionalMeasure getToDimensionalMeasure();

    /**
     * Sets the value of the '{@link org.omg.smm.RankingMeasureRelationship#getToDimensionalMeasure <em>To Dimensional Measure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To Dimensional Measure</em>' reference.
     * @see #getToDimensionalMeasure()
     * @generated
     */
    void setToDimensionalMeasure(DimensionalMeasure value);
} // RankingMeasureRelationship
