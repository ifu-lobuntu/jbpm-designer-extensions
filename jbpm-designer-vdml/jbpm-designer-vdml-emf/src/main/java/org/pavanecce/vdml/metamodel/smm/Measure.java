/**
 */
package org.pavanecce.vdml.metamodel.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.Measure#getObservedMeasure <em>Observed Measure</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.smm.Measure#getTrait <em>Trait</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getMeasure()
 * @model abstract="true"
 * @generated
 */
public interface Measure extends AbstractMeasureElement {
    /**
     * Returns the value of the '<em><b>Observed Measure</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Observed Measure</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Observed Measure</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getMeasure_ObservedMeasure()
     * @see org.pavanecce.vdml.metamodel.smm.ObservedMeasure#getMeasure
     * @model opposite="measure" ordered="false"
     * @generated
     */
    EList<ObservedMeasure> getObservedMeasure();

    /**
     * Returns the value of the '<em><b>Trait</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.smm.Characteristic#getMeasure <em>Measure</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trait</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trait</em>' reference.
     * @see #setTrait(Characteristic)
     * @see org.pavanecce.vdml.metamodel.smm.SmmPackage#getMeasure_Trait()
     * @see org.pavanecce.vdml.metamodel.smm.Characteristic#getMeasure
     * @model opposite="measure" required="true" ordered="false"
     * @generated
     */
    Characteristic getTrait();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.smm.Measure#getTrait <em>Trait</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trait</em>' reference.
     * @see #getTrait()
     * @generated
     */
    void setTrait(Characteristic value);

} // Measure
