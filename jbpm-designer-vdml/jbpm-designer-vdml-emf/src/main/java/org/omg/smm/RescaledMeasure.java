/**
 */
package org.omg.smm;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rescaled Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.RescaledMeasure#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.omg.smm.RescaledMeasure#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.omg.smm.RescaledMeasure#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link org.omg.smm.RescaledMeasure#getRescales <em>Rescales</em>}</li>
 *   <li>{@link org.omg.smm.RescaledMeasure#getRescalesFrom <em>Rescales From</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getRescaledMeasure()
 * @model
 * @generated
 */
public interface RescaledMeasure extends DimensionalMeasure {
    /**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see org.omg.smm.SMMPackage#getRescaledMeasure_Operation()
	 * @model ordered="false"
	 * @generated
	 */
    Operation getOperation();

    /**
	 * Sets the value of the '{@link org.omg.smm.RescaledMeasure#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
    void setOperation(Operation value);

    /**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(Double)
	 * @see org.omg.smm.SMMPackage#getRescaledMeasure_Offset()
	 * @model dataType="org.omg.dd.primitivetypes.Real" ordered="false"
	 * @generated
	 */
    Double getOffset();

    /**
	 * Sets the value of the '{@link org.omg.smm.RescaledMeasure#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
    void setOffset(Double value);

    /**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see #setMultiplier(Double)
	 * @see org.omg.smm.SMMPackage#getRescaledMeasure_Multiplier()
	 * @model dataType="org.omg.dd.primitivetypes.Real" ordered="false"
	 * @generated
	 */
    Double getMultiplier();

    /**
	 * Sets the value of the '{@link org.omg.smm.RescaledMeasure#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see #getMultiplier()
	 * @generated
	 */
    void setMultiplier(Double value);

    /**
	 * Returns the value of the '<em><b>Rescales</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.BaseMeasureRelationship#getRescaledMeasure <em>Rescaled Measure</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rescales</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescales</em>' container reference.
	 * @see #setRescales(BaseMeasureRelationship)
	 * @see org.omg.smm.SMMPackage#getRescaledMeasure_Rescales()
	 * @see org.omg.smm.BaseMeasureRelationship#getRescaledMeasure
	 * @model opposite="rescaledMeasure" transient="false" ordered="false"
	 * @generated
	 */
    BaseMeasureRelationship getRescales();

    /**
	 * Sets the value of the '{@link org.omg.smm.RescaledMeasure#getRescales <em>Rescales</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rescales</em>' container reference.
	 * @see #getRescales()
	 * @generated
	 */
    void setRescales(BaseMeasureRelationship value);

    /**
	 * Returns the value of the '<em><b>Rescales From</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.smm.RescaledMeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link org.omg.smm.RescaledMeasureRelationship#getToRescaledMeasure <em>To Rescaled Measure</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rescales From</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Rescales From</em>' containment reference list.
	 * @see org.omg.smm.SMMPackage#getRescaledMeasure_RescalesFrom()
	 * @see org.omg.smm.RescaledMeasureRelationship#getToRescaledMeasure
	 * @model opposite="toRescaledMeasure" containment="true"
	 * @generated
	 */
    EList<RescaledMeasureRelationship> getRescalesFrom();

} // RescaledMeasure
