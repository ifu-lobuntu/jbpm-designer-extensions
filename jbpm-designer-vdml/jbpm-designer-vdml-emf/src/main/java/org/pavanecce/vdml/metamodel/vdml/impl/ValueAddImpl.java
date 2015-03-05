/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.ValueAdd;
import org.pavanecce.vdml.metamodel.vdml.ValuePropositionComponent;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Add</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueAddImpl#getPropositionComponent <em>Proposition Component</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueAddImpl#getAggregatedFrom <em>Aggregated From</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueAddImpl#getAggregatedTo <em>Aggregated To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueAddImpl extends ValueElementImpl implements ValueAdd {
    /**
     * The cached value of the '{@link #getPropositionComponent() <em>Proposition Component</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropositionComponent()
     * @generated
     * @ordered
     */
    protected EList<ValuePropositionComponent> propositionComponent;

    /**
     * The cached value of the '{@link #getAggregatedFrom() <em>Aggregated From</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregatedFrom()
     * @generated
     * @ordered
     */
    protected EList<ValueAdd> aggregatedFrom;

    /**
     * The cached value of the '{@link #getAggregatedTo() <em>Aggregated To</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregatedTo()
     * @generated
     * @ordered
     */
    protected EList<ValueAdd> aggregatedTo;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueAddImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.VALUE_ADD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValuePropositionComponent> getPropositionComponent() {
        if (propositionComponent == null) {
            propositionComponent = new EObjectWithInverseResolvingEList<ValuePropositionComponent>(ValuePropositionComponent.class, this, VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT, VdmlPackage.VALUE_PROPOSITION_COMPONENT__ARTICULATED_VALUE);
        }
        return propositionComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueAdd> getAggregatedFrom() {
        if (aggregatedFrom == null) {
            aggregatedFrom = new EObjectWithInverseResolvingEList.ManyInverse<ValueAdd>(ValueAdd.class, this, VdmlPackage.VALUE_ADD__AGGREGATED_FROM, VdmlPackage.VALUE_ADD__AGGREGATED_TO);
        }
        return aggregatedFrom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueAdd> getAggregatedTo() {
        if (aggregatedTo == null) {
            aggregatedTo = new EObjectWithInverseResolvingEList.ManyInverse<ValueAdd>(ValueAdd.class, this, VdmlPackage.VALUE_ADD__AGGREGATED_TO, VdmlPackage.VALUE_ADD__AGGREGATED_FROM);
        }
        return aggregatedTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropositionComponent()).basicAdd(otherEnd, msgs);
            case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAggregatedFrom()).basicAdd(otherEnd, msgs);
            case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAggregatedTo()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
                return ((InternalEList<?>)getPropositionComponent()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
                return ((InternalEList<?>)getAggregatedFrom()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
                return ((InternalEList<?>)getAggregatedTo()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
                return getPropositionComponent();
            case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
                return getAggregatedFrom();
            case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
                return getAggregatedTo();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
                getPropositionComponent().clear();
                getPropositionComponent().addAll((Collection<? extends ValuePropositionComponent>)newValue);
                return;
            case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
                getAggregatedFrom().clear();
                getAggregatedFrom().addAll((Collection<? extends ValueAdd>)newValue);
                return;
            case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
                getAggregatedTo().clear();
                getAggregatedTo().addAll((Collection<? extends ValueAdd>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
                getPropositionComponent().clear();
                return;
            case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
                getAggregatedFrom().clear();
                return;
            case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
                getAggregatedTo().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case VdmlPackage.VALUE_ADD__PROPOSITION_COMPONENT:
                return propositionComponent != null && !propositionComponent.isEmpty();
            case VdmlPackage.VALUE_ADD__AGGREGATED_FROM:
                return aggregatedFrom != null && !aggregatedFrom.isEmpty();
            case VdmlPackage.VALUE_ADD__AGGREGATED_TO:
                return aggregatedTo != null && !aggregatedTo.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ValueAddImpl
