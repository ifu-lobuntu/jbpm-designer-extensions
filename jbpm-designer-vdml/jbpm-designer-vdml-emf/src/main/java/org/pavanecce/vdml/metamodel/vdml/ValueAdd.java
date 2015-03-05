/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd#getPropositionComponent <em>Proposition Component</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd#getAggregatedFrom <em>Aggregated From</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd#getAggregatedTo <em>Aggregated To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueAdd()
 * @model
 * @generated
 */
public interface ValueAdd extends ValueElement {
    /**
     * Returns the value of the '<em><b>Proposition Component</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getArticulatedValue <em>Articulated Value</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Proposition Component</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Proposition Component</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueAdd_PropositionComponent()
     * @see org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent#getArticulatedValue
     * @model opposite="articulatedValue" ordered="false"
     * @generated
     */
    EList<ValuePropositionComponent> getPropositionComponent();

    /**
     * Returns the value of the '<em><b>Aggregated From</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.ValueAdd}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd#getAggregatedTo <em>Aggregated To</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregated From</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregated From</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueAdd_AggregatedFrom()
     * @see org.pavanecce.vdml.metamodel.vdml.ValueAdd#getAggregatedTo
     * @model opposite="aggregatedTo" ordered="false"
     * @generated
     */
    EList<ValueAdd> getAggregatedFrom();

    /**
     * Returns the value of the '<em><b>Aggregated To</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.ValueAdd}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.ValueAdd#getAggregatedFrom <em>Aggregated From</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregated To</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregated To</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueAdd_AggregatedTo()
     * @see org.pavanecce.vdml.metamodel.vdml.ValueAdd#getAggregatedFrom
     * @model opposite="aggregatedFrom" ordered="false"
     * @generated
     */
    EList<ValueAdd> getAggregatedTo();

} // ValueAdd
