/**
 */
package org.omg.smm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.smm.DimensionalMeasure;
import org.omg.smm.SMMPackage;
import org.omg.smm.UnitOfMeasure;
import org.omg.smm.string;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimensional Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.DimensionalMeasureImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.omg.smm.impl.DimensionalMeasureImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DimensionalMeasureImpl extends MeasureImpl implements DimensionalMeasure {
    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected UnitOfMeasure unit;

    /**
     * The cached value of the '{@link #getFormula() <em>Formula</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormula()
     * @generated
     * @ordered
     */
    protected string formula;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DimensionalMeasureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.DIMENSIONAL_MEASURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitOfMeasure getUnit() {
        if (unit != null && unit.eIsProxy()) {
            InternalEObject oldUnit = (InternalEObject)unit;
            unit = (UnitOfMeasure)eResolveProxy(oldUnit);
            if (unit != oldUnit) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.DIMENSIONAL_MEASURE__UNIT, oldUnit, unit));
            }
        }
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitOfMeasure basicGetUnit() {
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnit(UnitOfMeasure newUnit) {
        UnitOfMeasure oldUnit = unit;
        unit = newUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.DIMENSIONAL_MEASURE__UNIT, oldUnit, unit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string getFormula() {
        if (formula != null && formula.eIsProxy()) {
            InternalEObject oldFormula = (InternalEObject)formula;
            formula = (string)eResolveProxy(oldFormula);
            if (formula != oldFormula) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.DIMENSIONAL_MEASURE__FORMULA, oldFormula, formula));
            }
        }
        return formula;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string basicGetFormula() {
        return formula;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFormula(string newFormula) {
        string oldFormula = formula;
        formula = newFormula;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.DIMENSIONAL_MEASURE__FORMULA, oldFormula, formula));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SMMPackage.DIMENSIONAL_MEASURE__UNIT:
                if (resolve) return getUnit();
                return basicGetUnit();
            case SMMPackage.DIMENSIONAL_MEASURE__FORMULA:
                if (resolve) return getFormula();
                return basicGetFormula();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SMMPackage.DIMENSIONAL_MEASURE__UNIT:
                setUnit((UnitOfMeasure)newValue);
                return;
            case SMMPackage.DIMENSIONAL_MEASURE__FORMULA:
                setFormula((string)newValue);
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
            case SMMPackage.DIMENSIONAL_MEASURE__UNIT:
                setUnit((UnitOfMeasure)null);
                return;
            case SMMPackage.DIMENSIONAL_MEASURE__FORMULA:
                setFormula((string)null);
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
            case SMMPackage.DIMENSIONAL_MEASURE__UNIT:
                return unit != null;
            case SMMPackage.DIMENSIONAL_MEASURE__FORMULA:
                return formula != null;
        }
        return super.eIsSet(featureID);
    }

} //DimensionalMeasureImpl
