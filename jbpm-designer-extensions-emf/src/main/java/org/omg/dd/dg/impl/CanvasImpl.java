/**
 */
package org.omg.dd.dg.impl;
import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.util.*;
import org.omg.dd.dc.*;
import org.omg.dd.dg.*;
import org.omg.dd.di.*;

import java.util.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.CanvasImpl#getBackgroundFill <em>Background Fill</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.CanvasImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.CanvasImpl#getPackagedMarker <em>Packaged Marker</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.CanvasImpl#getPackagedStyle <em>Packaged Style</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.CanvasImpl#getPackagedFill <em>Packaged Fill</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasImpl extends GroupImpl implements Canvas {
    /**
     * The cached value of the '{@link #getBackgroundFill() <em>Background Fill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBackgroundFill()
     * @generated
     * @ordered
     */
    protected Fill backgroundFill;

    /**
     * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBackgroundColor()
     * @generated
     * @ordered
     */
    protected Color backgroundColor;

    /**
     * The cached value of the '{@link #getPackagedMarker() <em>Packaged Marker</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackagedMarker()
     * @generated
     * @ordered
     */
    protected EList<Marker> packagedMarker;

    /**
     * The cached value of the '{@link #getPackagedStyle() <em>Packaged Style</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackagedStyle()
     * @generated
     * @ordered
     */
    protected EList<Style> packagedStyle;

    /**
     * The cached value of the '{@link #getPackagedFill() <em>Packaged Fill</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackagedFill()
     * @generated
     * @ordered
     */
    protected EList<Fill> packagedFill;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CanvasImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.CANVAS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fill getBackgroundFill() {
        if (backgroundFill != null && backgroundFill.eIsProxy()) {
            InternalEObject oldBackgroundFill = (InternalEObject)backgroundFill;
            backgroundFill = (Fill)eResolveProxy(oldBackgroundFill);
            if (backgroundFill != oldBackgroundFill) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DGPackage.CANVAS__BACKGROUND_FILL, oldBackgroundFill, backgroundFill));
            }
        }
        return backgroundFill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fill basicGetBackgroundFill() {
        return backgroundFill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBackgroundFill(Fill newBackgroundFill) {
        Fill oldBackgroundFill = backgroundFill;
        backgroundFill = newBackgroundFill;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.CANVAS__BACKGROUND_FILL, oldBackgroundFill, backgroundFill));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBackgroundColor(Color newBackgroundColor, NotificationChain msgs) {
        Color oldBackgroundColor = backgroundColor;
        backgroundColor = newBackgroundColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.CANVAS__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBackgroundColor(Color newBackgroundColor) {
        if (newBackgroundColor != backgroundColor) {
            NotificationChain msgs = null;
            if (backgroundColor != null)
                msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.CANVAS__BACKGROUND_COLOR, null, msgs);
            if (newBackgroundColor != null)
                msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.CANVAS__BACKGROUND_COLOR, null, msgs);
            msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.CANVAS__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Marker> getPackagedMarker() {
        if (packagedMarker == null) {
            packagedMarker = new EObjectContainmentWithInverseEList<Marker>(Marker.class, this, DGPackage.CANVAS__PACKAGED_MARKER, DGPackage.MARKER__CANVAS);
        }
        return packagedMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Style> getPackagedStyle() {
        if (packagedStyle == null) {
            packagedStyle = new EObjectContainmentEList<Style>(Style.class, this, DGPackage.CANVAS__PACKAGED_STYLE);
        }
        return packagedStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Fill> getPackagedFill() {
        if (packagedFill == null) {
            packagedFill = new EObjectContainmentWithInverseEList<Fill>(Fill.class, this, DGPackage.CANVAS__PACKAGED_FILL, DGPackage.FILL__CANVAS);
        }
        return packagedFill;
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
            case DGPackage.CANVAS__PACKAGED_MARKER:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackagedMarker()).basicAdd(otherEnd, msgs);
            case DGPackage.CANVAS__PACKAGED_FILL:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackagedFill()).basicAdd(otherEnd, msgs);
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
            case DGPackage.CANVAS__BACKGROUND_COLOR:
                return basicSetBackgroundColor(null, msgs);
            case DGPackage.CANVAS__PACKAGED_MARKER:
                return ((InternalEList<?>)getPackagedMarker()).basicRemove(otherEnd, msgs);
            case DGPackage.CANVAS__PACKAGED_STYLE:
                return ((InternalEList<?>)getPackagedStyle()).basicRemove(otherEnd, msgs);
            case DGPackage.CANVAS__PACKAGED_FILL:
                return ((InternalEList<?>)getPackagedFill()).basicRemove(otherEnd, msgs);
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
            case DGPackage.CANVAS__BACKGROUND_FILL:
                if (resolve) return getBackgroundFill();
                return basicGetBackgroundFill();
            case DGPackage.CANVAS__BACKGROUND_COLOR:
                return getBackgroundColor();
            case DGPackage.CANVAS__PACKAGED_MARKER:
                return getPackagedMarker();
            case DGPackage.CANVAS__PACKAGED_STYLE:
                return getPackagedStyle();
            case DGPackage.CANVAS__PACKAGED_FILL:
                return getPackagedFill();
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
            case DGPackage.CANVAS__BACKGROUND_FILL:
                setBackgroundFill((Fill)newValue);
                return;
            case DGPackage.CANVAS__BACKGROUND_COLOR:
                setBackgroundColor((Color)newValue);
                return;
            case DGPackage.CANVAS__PACKAGED_MARKER:
                getPackagedMarker().clear();
                getPackagedMarker().addAll((Collection<? extends Marker>)newValue);
                return;
            case DGPackage.CANVAS__PACKAGED_STYLE:
                getPackagedStyle().clear();
                getPackagedStyle().addAll((Collection<? extends Style>)newValue);
                return;
            case DGPackage.CANVAS__PACKAGED_FILL:
                getPackagedFill().clear();
                getPackagedFill().addAll((Collection<? extends Fill>)newValue);
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
            case DGPackage.CANVAS__BACKGROUND_FILL:
                setBackgroundFill((Fill)null);
                return;
            case DGPackage.CANVAS__BACKGROUND_COLOR:
                setBackgroundColor((Color)null);
                return;
            case DGPackage.CANVAS__PACKAGED_MARKER:
                getPackagedMarker().clear();
                return;
            case DGPackage.CANVAS__PACKAGED_STYLE:
                getPackagedStyle().clear();
                return;
            case DGPackage.CANVAS__PACKAGED_FILL:
                getPackagedFill().clear();
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
            case DGPackage.CANVAS__BACKGROUND_FILL:
                return backgroundFill != null;
            case DGPackage.CANVAS__BACKGROUND_COLOR:
                return backgroundColor != null;
            case DGPackage.CANVAS__PACKAGED_MARKER:
                return packagedMarker != null && !packagedMarker.isEmpty();
            case DGPackage.CANVAS__PACKAGED_STYLE:
                return packagedStyle != null && !packagedStyle.isEmpty();
            case DGPackage.CANVAS__PACKAGED_FILL:
                return packagedFill != null && !packagedFill.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CanvasImpl
