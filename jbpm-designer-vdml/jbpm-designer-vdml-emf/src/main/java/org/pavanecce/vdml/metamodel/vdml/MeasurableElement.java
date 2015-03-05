/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.MeasurableElement#getMeasuredCharacteristic <em>Measured Characteristic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getMeasurableElement()
 * @model abstract="true"
 * @generated
 */
public interface MeasurableElement extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Measured Characteristic</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measured Characteristic</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measured Characteristic</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getMeasurableElement_MeasuredCharacteristic()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<MeasuredCharacteristic> getMeasuredCharacteristic();

} // MeasurableElement
