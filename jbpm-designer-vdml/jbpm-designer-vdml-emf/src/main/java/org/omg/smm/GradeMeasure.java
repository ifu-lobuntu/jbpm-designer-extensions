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
 * <ul>
 *   <li>{@link org.omg.smm.GradeMeasure#getInterval <em>Interval</em>}</li>
 * </ul>
 * </p>
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

} // GradeMeasure
