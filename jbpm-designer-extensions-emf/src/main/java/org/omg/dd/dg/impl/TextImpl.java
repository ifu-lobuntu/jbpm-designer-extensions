/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.dd.dc.AlignmentKind;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.TextImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.TextImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.TextImpl#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextImpl extends GraphicalElementImpl implements Text {
    /**
     * The default value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected static final String DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected String data = DATA_EDEFAULT;

    /**
     * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBounds()
     * @generated
     * @ordered
     */
    protected Bounds bounds;

    /**
     * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlignment()
     * @generated
     * @ordered
     */
    protected static final AlignmentKind ALIGNMENT_EDEFAULT = AlignmentKind.START;

    /**
     * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlignment()
     * @generated
     * @ordered
     */
    protected AlignmentKind alignment = ALIGNMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.TEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getData() {
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setData(String newData) {
        String oldData = data;
        data = newData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.TEXT__DATA, oldData, data));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bounds getBounds() {
        return bounds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBounds(Bounds newBounds, NotificationChain msgs) {
        Bounds oldBounds = bounds;
        bounds = newBounds;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.TEXT__BOUNDS, oldBounds, newBounds);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBounds(Bounds newBounds) {
        if (newBounds != bounds) {
            NotificationChain msgs = null;
            if (bounds != null)
                msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.TEXT__BOUNDS, null, msgs);
            if (newBounds != null)
                msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.TEXT__BOUNDS, null, msgs);
            msgs = basicSetBounds(newBounds, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.TEXT__BOUNDS, newBounds, newBounds));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlignmentKind getAlignment() {
        return alignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlignment(AlignmentKind newAlignment) {
        AlignmentKind oldAlignment = alignment;
        alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.TEXT__ALIGNMENT, oldAlignment, alignment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DGPackage.TEXT__BOUNDS:
                return basicSetBounds(null, msgs);
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
            case DGPackage.TEXT__DATA:
                return getData();
            case DGPackage.TEXT__BOUNDS:
                return getBounds();
            case DGPackage.TEXT__ALIGNMENT:
                return getAlignment();
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
            case DGPackage.TEXT__DATA:
                setData((String)newValue);
                return;
            case DGPackage.TEXT__BOUNDS:
                setBounds((Bounds)newValue);
                return;
            case DGPackage.TEXT__ALIGNMENT:
                setAlignment((AlignmentKind)newValue);
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
            case DGPackage.TEXT__DATA:
                setData(DATA_EDEFAULT);
                return;
            case DGPackage.TEXT__BOUNDS:
                setBounds((Bounds)null);
                return;
            case DGPackage.TEXT__ALIGNMENT:
                setAlignment(ALIGNMENT_EDEFAULT);
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
            case DGPackage.TEXT__DATA:
                return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
            case DGPackage.TEXT__BOUNDS:
                return bounds != null;
            case DGPackage.TEXT__ALIGNMENT:
                return alignment != ALIGNMENT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (data: ");
        result.append(data);
        result.append(", alignment: ");
        result.append(alignment);
        result.append(')');
        return result.toString();
    }

} //TextImpl
