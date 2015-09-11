/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensional Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.DimensionalMeasure#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.omg.smm.DimensionalMeasure#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getDimensionalMeasure()
 * @model abstract="true"
 * @generated
 */
public interface DimensionalMeasure extends Measure {
    /**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(UnitOfMeasure)
	 * @see org.omg.smm.SMMPackage#getDimensionalMeasure_Unit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
    UnitOfMeasure getUnit();

    /**
	 * Sets the value of the '{@link org.omg.smm.DimensionalMeasure#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
    void setUnit(UnitOfMeasure value);

    /**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formula</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see org.omg.smm.SMMPackage#getDimensionalMeasure_Formula()
	 * @model dataType="org.omg.dd.primitivetypes.String" ordered="false"
	 * @generated
	 */
    String getFormula();

    /**
	 * Sets the value of the '{@link org.omg.smm.DimensionalMeasure#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
    void setFormula(String value);

} // DimensionalMeasure
