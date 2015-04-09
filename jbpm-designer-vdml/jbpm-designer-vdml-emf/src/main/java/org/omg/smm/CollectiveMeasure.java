/**
 */
package org.omg.smm;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link org.omg.smm.CollectiveMeasure#getCustomAccumulator <em>Custom Accumulator</em>}</li>
 *   <li>{@link org.omg.smm.CollectiveMeasure#getBaseMeasureTo <em>Base Measure To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getCollectiveMeasure()
 * @model
 * @generated
 */
public interface CollectiveMeasure extends DimensionalMeasure {
    /**
     * Returns the value of the '<em><b>Accumulator</b></em>' attribute.
     * The literals are from the enumeration {@link org.omg.smm.Accumulator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accumulator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Accumulator</em>' attribute.
     * @see org.omg.smm.Accumulator
     * @see #setAccumulator(Accumulator)
     * @see org.omg.smm.SMMPackage#getCollectiveMeasure_Accumulator()
     * @model required="true" ordered="false"
     * @generated
     */
    Accumulator getAccumulator();

    /**
     * Sets the value of the '{@link org.omg.smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accumulator</em>' attribute.
     * @see org.omg.smm.Accumulator
     * @see #getAccumulator()
     * @generated
     */
    void setAccumulator(Accumulator value);

    /**
     * Returns the value of the '<em><b>Custom Accumulator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Custom Accumulator</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Custom Accumulator</em>' reference.
     * @see #setCustomAccumulator(Operation)
     * @see org.omg.smm.SMMPackage#getCollectiveMeasure_CustomAccumulator()
     * @model ordered="false"
     * @generated
     */
    Operation getCustomAccumulator();

    /**
     * Sets the value of the '{@link org.omg.smm.CollectiveMeasure#getCustomAccumulator <em>Custom Accumulator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Custom Accumulator</em>' reference.
     * @see #getCustomAccumulator()
     * @generated
     */
    void setCustomAccumulator(Operation value);

    /**
     * Returns the value of the '<em><b>Base Measure To</b></em>' containment reference list.
     * The list contents are of type {@link org.omg.smm.BaseNMeasureRelationship}.
     * It is bidirectional and its opposite is '{@link org.omg.smm.BaseNMeasureRelationship#getFromCollectiveMeasure <em>From Collective Measure</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Measure To</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Measure To</em>' containment reference list.
     * @see org.omg.smm.SMMPackage#getCollectiveMeasure_BaseMeasureTo()
     * @see org.omg.smm.BaseNMeasureRelationship#getFromCollectiveMeasure
     * @model opposite="fromCollectiveMeasure" containment="true"
     * @generated
     */
    EList<BaseNMeasureRelationship> getBaseMeasureTo();

} // CollectiveMeasure
