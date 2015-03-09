/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.dd.dc.Dimension;
import org.omg.dd.dc.Point;
import org.omg.dd.dg.Canvas;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.Marker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.MarkerImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.MarkerImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.MarkerImpl#getCanvas <em>Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkerImpl extends GroupImpl implements Marker {
    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected Dimension size;

    /**
     * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReference()
     * @generated
     * @ordered
     */
    protected Point reference;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MarkerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.MARKER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dimension getSize() {
        return size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSize(Dimension newSize, NotificationChain msgs) {
        Dimension oldSize = size;
        size = newSize;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.MARKER__SIZE, oldSize, newSize);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSize(Dimension newSize) {
        if (newSize != size) {
            NotificationChain msgs = null;
            if (size != null)
                msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.MARKER__SIZE, null, msgs);
            if (newSize != null)
                msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.MARKER__SIZE, null, msgs);
            msgs = basicSetSize(newSize, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MARKER__SIZE, newSize, newSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Point getReference() {
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReference(Point newReference, NotificationChain msgs) {
        Point oldReference = reference;
        reference = newReference;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.MARKER__REFERENCE, oldReference, newReference);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReference(Point newReference) {
        if (newReference != reference) {
            NotificationChain msgs = null;
            if (reference != null)
                msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.MARKER__REFERENCE, null, msgs);
            if (newReference != null)
                msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.MARKER__REFERENCE, null, msgs);
            msgs = basicSetReference(newReference, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MARKER__REFERENCE, newReference, newReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Canvas getCanvas() {
        if (eContainerFeatureID() != DGPackage.MARKER__CANVAS) return null;
        return (Canvas)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCanvas(Canvas newCanvas, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newCanvas, DGPackage.MARKER__CANVAS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCanvas(Canvas newCanvas) {
        if (newCanvas != eInternalContainer() || (eContainerFeatureID() != DGPackage.MARKER__CANVAS && newCanvas != null)) {
            if (EcoreUtil.isAncestor(this, newCanvas))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newCanvas != null)
                msgs = ((InternalEObject)newCanvas).eInverseAdd(this, DGPackage.CANVAS__PACKAGED_MARKER, Canvas.class, msgs);
            msgs = basicSetCanvas(newCanvas, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.MARKER__CANVAS, newCanvas, newCanvas));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DGPackage.MARKER__CANVAS:
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
            case DGPackage.MARKER__SIZE:
                return basicSetSize(null, msgs);
            case DGPackage.MARKER__REFERENCE:
                return basicSetReference(null, msgs);
            case DGPackage.MARKER__CANVAS:
                return basicSetCanvas(null, msgs);
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
            case DGPackage.MARKER__CANVAS:
                return eInternalContainer().eInverseRemove(this, DGPackage.CANVAS__PACKAGED_MARKER, Canvas.class, msgs);
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
            case DGPackage.MARKER__SIZE:
                return getSize();
            case DGPackage.MARKER__REFERENCE:
                return getReference();
            case DGPackage.MARKER__CANVAS:
                return getCanvas();
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
            case DGPackage.MARKER__SIZE:
                setSize((Dimension)newValue);
                return;
            case DGPackage.MARKER__REFERENCE:
                setReference((Point)newValue);
                return;
            case DGPackage.MARKER__CANVAS:
                setCanvas((Canvas)newValue);
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
            case DGPackage.MARKER__SIZE:
                setSize((Dimension)null);
                return;
            case DGPackage.MARKER__REFERENCE:
                setReference((Point)null);
                return;
            case DGPackage.MARKER__CANVAS:
                setCanvas((Canvas)null);
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
            case DGPackage.MARKER__SIZE:
                return size != null;
            case DGPackage.MARKER__REFERENCE:
                return reference != null;
            case DGPackage.MARKER__CANVAS:
                return getCanvas() != null;
        }
        return super.eIsSet(featureID);
    }

} //MarkerImpl
