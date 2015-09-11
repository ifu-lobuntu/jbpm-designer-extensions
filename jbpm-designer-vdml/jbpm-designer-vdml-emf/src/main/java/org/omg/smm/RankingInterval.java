/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranking Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.RankingInterval#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.smm.RankingInterval#getRanking <em>Ranking</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getRankingInterval()
 * @model
 * @generated
 */
public interface RankingInterval extends Interval {
    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see org.omg.smm.SMMPackage#getRankingInterval_Value()
	 * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
	 * @generated
	 */
    Double getValue();

    /**
	 * Sets the value of the '{@link org.omg.smm.RankingInterval#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(Double value);

    /**
	 * Returns the value of the '<em><b>Ranking</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.RankingMeasure#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ranking</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranking</em>' container reference.
	 * @see #setRanking(RankingMeasure)
	 * @see org.omg.smm.SMMPackage#getRankingInterval_Ranking()
	 * @see org.omg.smm.RankingMeasure#getInterval
	 * @model opposite="interval" required="true" transient="false" ordered="false"
	 * @generated
	 */
    RankingMeasure getRanking();

    /**
	 * Sets the value of the '{@link org.omg.smm.RankingInterval#getRanking <em>Ranking</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranking</em>' container reference.
	 * @see #getRanking()
	 * @generated
	 */
    void setRanking(RankingMeasure value);

} // RankingInterval
