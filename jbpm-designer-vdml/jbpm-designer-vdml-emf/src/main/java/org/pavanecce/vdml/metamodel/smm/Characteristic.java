/**
 */
package org.pavanecce.vdml.metamodel.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.Characteristic#getMeasure <em>Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getCharacteristic()
 * @model
 * @generated
 */
public interface Characteristic extends AbstractMeasureElement {
    /**
     * Returns the value of the '<em><b>Measure</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.Measure}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.Measure#getTrait <em>Trait</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measure</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measure</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getCharacteristic_Measure()
     * @see org.pavanecce.vdml.metamodel.smm.Measure#getTrait
     * @model opposite="trait" ordered="false"
     * @generated
     */
    EList<Measure> getMeasure();

} // Characteristic
