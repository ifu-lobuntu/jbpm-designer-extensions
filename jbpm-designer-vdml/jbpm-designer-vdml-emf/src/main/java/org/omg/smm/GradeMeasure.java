/**
 */
package org.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.GradeMeasure#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.omg.smm.GradeMeasure#getGradeTo <em>Grade To</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getGradeMeasure()
 * @model
 * @generated
 */
public interface GradeMeasure extends Measure {
    /**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.smm.GradeInterval}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interval</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference list.
	 * @see org.omg.smm.SMMPackage#getGradeMeasure_Interval()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
    EList<GradeInterval> getInterval();

    /**
	 * Returns the value of the '<em><b>Grade To</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.GradeMeasureRelationship#getFromGradeMeasure <em>From Grade Measure</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grade To</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade To</em>' containment reference.
	 * @see #setGradeTo(GradeMeasureRelationship)
	 * @see org.omg.smm.SMMPackage#getGradeMeasure_GradeTo()
	 * @see org.omg.smm.GradeMeasureRelationship#getFromGradeMeasure
	 * @model opposite="fromGradeMeasure" containment="true"
	 * @generated
	 */
    GradeMeasureRelationship getGradeTo();

    /**
	 * Sets the value of the '{@link org.omg.smm.GradeMeasure#getGradeTo <em>Grade To</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade To</em>' containment reference.
	 * @see #getGradeTo()
	 * @generated
	 */
    void setGradeTo(GradeMeasureRelationship value);

} // GradeMeasure
