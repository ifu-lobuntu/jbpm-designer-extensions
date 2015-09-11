/**
 */
package org.omg.dd.dg.impl;
import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.plugin.*;
import org.eclipse.emf.ecore.util.*;
import org.omg.dd.dc.*;
import org.omg.dd.dg.*;
import org.omg.dd.dg.util.*;
import org.omg.dd.di.util.*;
import org.omg.dd.dc.util.*;
import org.omg.dd.di.*;

import java.lang.reflect.*;
import java.util.*;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.PolygonImpl#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolygonImpl extends MarkedElementImpl implements Polygon {
    /**
     * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPoint()
     * @generated
     * @ordered
     */
    protected EList<Point> point;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PolygonImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.POLYGON;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Point> getPoint() {
        if (point == null) {
            point = new EObjectContainmentEList<Point>(Point.class, this, DGPackage.POLYGON__POINT);
        }
        return point;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DGPackage.POLYGON__POINT:
                return ((InternalEList<?>)getPoint()).basicRemove(otherEnd, msgs);
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
            case DGPackage.POLYGON__POINT:
                return getPoint();
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
            case DGPackage.POLYGON__POINT:
                getPoint().clear();
                getPoint().addAll((Collection<? extends Point>)newValue);
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
            case DGPackage.POLYGON__POINT:
                getPoint().clear();
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
            case DGPackage.POLYGON__POINT:
                return point != null && !point.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PolygonImpl
