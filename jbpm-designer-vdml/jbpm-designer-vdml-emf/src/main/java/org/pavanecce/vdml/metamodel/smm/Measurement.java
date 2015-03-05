/**
 */
package org.pavanecce.vdml.metamodel.smm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.Measurement#getObservedMeasure <em>Observed Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface Measurement extends EObject {
    /**
     * Returns the value of the '<em><b>Observed Measure</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasurement <em>Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Observed Measure</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Observed Measure</em>' container reference.
     * @see #setObservedMeasure(ObservedMeasure)
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getMeasurement_ObservedMeasure()
     * @see org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasurement
     * @model opposite="measurement" required="true" transient="false" ordered="false"
     * @generated
     */
    ObservedMeasure getObservedMeasure();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.smm.Measurement#getObservedMeasure <em>Observed Measure</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Observed Measure</em>' container reference.
     * @see #getObservedMeasure()
     * @generated
     */
    void setObservedMeasure(ObservedMeasure value);

} // Measurement
