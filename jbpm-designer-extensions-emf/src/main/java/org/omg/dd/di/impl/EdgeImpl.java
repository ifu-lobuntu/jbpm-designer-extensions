/**
 */
package org.omg.dd.di.impl;
import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.plugin.*;
import org.eclipse.emf.ecore.util.*;
import org.jbpm.designer.dd.jbpmdd.*;
import org.omg.dd.dc.*;
import org.omg.dd.dg.*;
import org.omg.dd.dg.util.*;
import org.omg.dd.di.impl.ShapeImpl;
import org.omg.dd.di.util.*;
import org.omg.dd.dc.util.*;
import org.omg.dd.di.*;

import java.lang.reflect.*;
import java.util.*;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.di.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.EdgeImpl#getWaypoint <em>Waypoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EdgeImpl extends DiagramElementImpl implements Edge {
    /**
     * The cached value of the '{@link #getWaypoint() <em>Waypoint</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWaypoint()
     * @generated
     * @ordered
     */
    protected EList<Point> waypoint;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EdgeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DIPackage.Literals.EDGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement getSource() {
        DiagramElement source = basicGetSource();
        return source != null && source.eIsProxy() ? (DiagramElement)eResolveProxy((InternalEObject)source) : source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement basicGetSource() {
        // TODO: implement this method to return the 'Source' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement getTarget() {
        DiagramElement target = basicGetTarget();
        return target != null && target.eIsProxy() ? (DiagramElement)eResolveProxy((InternalEObject)target) : target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement basicGetTarget() {
        // TODO: implement this method to return the 'Target' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Point> getWaypoint() {
        if (waypoint == null) {
            waypoint = new EObjectContainmentEList<Point>(Point.class, this, DIPackage.EDGE__WAYPOINT);
        }
        return waypoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DIPackage.EDGE__WAYPOINT:
                return ((InternalEList<?>)getWaypoint()).basicRemove(otherEnd, msgs);
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
            case DIPackage.EDGE__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case DIPackage.EDGE__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case DIPackage.EDGE__WAYPOINT:
                return getWaypoint();
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
            case DIPackage.EDGE__WAYPOINT:
                getWaypoint().clear();
                getWaypoint().addAll((Collection<? extends Point>)newValue);
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
            case DIPackage.EDGE__WAYPOINT:
                getWaypoint().clear();
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
            case DIPackage.EDGE__SOURCE:
                return basicGetSource() != null;
            case DIPackage.EDGE__TARGET:
                return basicGetTarget() != null;
            case DIPackage.EDGE__WAYPOINT:
                return waypoint != null && !waypoint.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EdgeImpl
