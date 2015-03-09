/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.BaseMeasureRelationship#getRescaledMeasure <em>Rescaled Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getBaseMeasureRelationship()
 * @model abstract="true"
 * @generated
 */
public interface BaseMeasureRelationship extends MeasureRelationship {
    /**
     * Returns the value of the '<em><b>Rescaled Measure</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.omg.smm.RescaledMeasure#getRescales <em>Rescales</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rescaled Measure</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rescaled Measure</em>' containment reference.
     * @see #setRescaledMeasure(RescaledMeasure)
     * @see org.omg.smm.SMMPackage#getBaseMeasureRelationship_RescaledMeasure()
     * @see org.omg.smm.RescaledMeasure#getRescales
     * @model opposite="rescales" containment="true" ordered="false"
     * @generated
     */
    RescaledMeasure getRescaledMeasure();

    /**
     * Sets the value of the '{@link org.omg.smm.BaseMeasureRelationship#getRescaledMeasure <em>Rescaled Measure</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rescaled Measure</em>' containment reference.
     * @see #getRescaledMeasure()
     * @generated
     */
    void setRescaledMeasure(RescaledMeasure value);

} // BaseMeasureRelationship
