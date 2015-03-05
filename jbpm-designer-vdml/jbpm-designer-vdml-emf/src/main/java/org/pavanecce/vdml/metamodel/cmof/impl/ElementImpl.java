/**
 */
package org.pavanecce.vdml.metamodel.cmof.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.pavanecce.vdml.metamodel.cmof.CmofPackage;
import org.pavanecce.vdml.metamodel.cmof.Element;
import org.pavanecce.vdml.metamodel.smm.Measurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.cmof.impl.ElementImpl#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
    /**
     * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurement()
     * @generated
     * @ordered
     */
    protected EList<Measurement> measurement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CmofPackage.Literals.ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Measurement> getMeasurement() {
        if (measurement == null) {
            measurement = new EObjectResolvingEList<Measurement>(Measurement.class, this, CmofPackage.ELEMENT__MEASUREMENT);
        }
        return measurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CmofPackage.ELEMENT__MEASUREMENT:
                return getMeasurement();
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
            case CmofPackage.ELEMENT__MEASUREMENT:
                getMeasurement().clear();
                getMeasurement().addAll((Collection<? extends Measurement>)newValue);
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
            case CmofPackage.ELEMENT__MEASUREMENT:
                getMeasurement().clear();
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
            case CmofPackage.ELEMENT__MEASUREMENT:
                return measurement != null && !measurement.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ElementImpl
