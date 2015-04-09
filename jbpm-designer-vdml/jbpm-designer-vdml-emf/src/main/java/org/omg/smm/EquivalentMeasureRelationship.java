/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.smm.EquivalentMeasureRelationship#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getEquivalentMeasureRelationship()
 * @model
 * @generated
 */
public interface EquivalentMeasureRelationship extends MeasureRelationship {
    /**
     * Returns the value of the '<em><b>Mapping</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapping</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapping</em>' reference.
     * @see #setMapping(Operation)
     * @see org.omg.smm.SMMPackage#getEquivalentMeasureRelationship_Mapping()
     * @model ordered="false"
     * @generated
     */
    Operation getMapping();

    /**
     * Sets the value of the '{@link org.omg.smm.EquivalentMeasureRelationship#getMapping <em>Mapping</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapping</em>' reference.
     * @see #getMapping()
     * @generated
     */
    void setMapping(Operation value);

} // EquivalentMeasureRelationship
