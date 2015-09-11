/**
 */
package org.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.RankingMeasure#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.omg.smm.RankingMeasure#getRankingTo <em>Ranking To</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getRankingMeasure()
 * @model
 * @generated
 */
public interface RankingMeasure extends DimensionalMeasure {
    /**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.smm.RankingInterval}.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.RankingInterval#getRanking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interval</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference list.
	 * @see org.omg.smm.SMMPackage#getRankingMeasure_Interval()
	 * @see org.omg.smm.RankingInterval#getRanking
	 * @model opposite="ranking" containment="true" required="true" ordered="false"
	 * @generated
	 */
    EList<RankingInterval> getInterval();

    /**
	 * Returns the value of the '<em><b>Ranking To</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.RankingMeasureRelationship#getFromRankingMeasure <em>From Ranking Measure</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ranking To</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranking To</em>' containment reference.
	 * @see #setRankingTo(RankingMeasureRelationship)
	 * @see org.omg.smm.SMMPackage#getRankingMeasure_RankingTo()
	 * @see org.omg.smm.RankingMeasureRelationship#getFromRankingMeasure
	 * @model opposite="fromRankingMeasure" containment="true"
	 * @generated
	 */
    RankingMeasureRelationship getRankingTo();

    /**
	 * Sets the value of the '{@link org.omg.smm.RankingMeasure#getRankingTo <em>Ranking To</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranking To</em>' containment reference.
	 * @see #getRankingTo()
	 * @generated
	 */
    void setRankingTo(RankingMeasureRelationship value);

} // RankingMeasure
