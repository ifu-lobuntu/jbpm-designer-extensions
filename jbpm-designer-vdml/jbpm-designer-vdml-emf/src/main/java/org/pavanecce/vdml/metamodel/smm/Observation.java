/**
 */
package org.pavanecce.vdml.metamodel.smm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.Observation#getSmmModel <em>Smm Model</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.Observation#getObservedMeasure <em>Observed Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends EObject {
    /**
     * Returns the value of the '<em><b>Smm Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.SmmModel#getObservation <em>Observation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smm Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Smm Model</em>' container reference.
     * @see #setSmmModel(SmmModel)
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getObservation_SmmModel()
     * @see org.pavanecce.vdml.metamodel.smm.SmmModel#getObservation
     * @model opposite="observation" required="true" transient="false" ordered="false"
     * @generated
     */
    SmmModel getSmmModel();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.smm.Observation#getSmmModel <em>Smm Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smm Model</em>' container reference.
     * @see #getSmmModel()
     * @generated
     */
    void setSmmModel(SmmModel value);

    /**
     * Returns the value of the '<em><b>Observed Measure</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getObservation <em>Observation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Observed Measure</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Observed Measure</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getObservation_ObservedMeasure()
     * @see org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getObservation
     * @model opposite="observation" containment="true" ordered="false"
     * @generated
     */
    EList<ObservedMeasure> getObservedMeasure();

} // Observation
