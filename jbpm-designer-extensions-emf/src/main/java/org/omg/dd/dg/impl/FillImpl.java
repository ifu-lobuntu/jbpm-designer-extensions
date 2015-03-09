/**
 */
package org.omg.dd.dg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.dd.dg.Canvas;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.Fill;
import org.omg.dd.dg.Transform;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.FillImpl#getCanvas <em>Canvas</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.FillImpl#getTransform <em>Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FillImpl extends MinimalEObjectImpl.Container implements Fill {
    /**
     * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransform()
     * @generated
     * @ordered
     */
    protected EList<Transform> transform;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FillImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.FILL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Canvas getCanvas() {
        if (eContainerFeatureID() != DGPackage.FILL__CANVAS) return null;
        return (Canvas)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCanvas(Canvas newCanvas, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newCanvas, DGPackage.FILL__CANVAS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCanvas(Canvas newCanvas) {
        if (newCanvas != eInternalContainer() || (eContainerFeatureID() != DGPackage.FILL__CANVAS && newCanvas != null)) {
            if (EcoreUtil.isAncestor(this, newCanvas))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newCanvas != null)
                msgs = ((InternalEObject)newCanvas).eInverseAdd(this, DGPackage.CANVAS__PACKAGED_FILL, Canvas.class, msgs);
            msgs = basicSetCanvas(newCanvas, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.FILL__CANVAS, newCanvas, newCanvas));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Transform> getTransform() {
        if (transform == null) {
            transform = new EObjectContainmentEList<Transform>(Transform.class, this, DGPackage.FILL__TRANSFORM);
        }
        return transform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DGPackage.FILL__CANVAS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetCanvas((Canvas)otherEnd, msgs);
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
            case DGPackage.FILL__CANVAS:
                return basicSetCanvas(null, msgs);
            case DGPackage.FILL__TRANSFORM:
                return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case DGPackage.FILL__CANVAS:
                return eInternalContainer().eInverseRemove(this, DGPackage.CANVAS__PACKAGED_FILL, Canvas.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DGPackage.FILL__CANVAS:
                return getCanvas();
            case DGPackage.FILL__TRANSFORM:
                return getTransform();
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
            case DGPackage.FILL__CANVAS:
                setCanvas((Canvas)newValue);
                return;
            case DGPackage.FILL__TRANSFORM:
                getTransform().clear();
                getTransform().addAll((Collection<? extends Transform>)newValue);
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
            case DGPackage.FILL__CANVAS:
                setCanvas((Canvas)null);
                return;
            case DGPackage.FILL__TRANSFORM:
                getTransform().clear();
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
            case DGPackage.FILL__CANVAS:
                return getCanvas() != null;
            case DGPackage.FILL__TRANSFORM:
                return transform != null && !transform.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //FillImpl
