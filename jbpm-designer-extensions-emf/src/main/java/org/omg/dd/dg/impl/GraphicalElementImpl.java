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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.dd.dg.ClipPath;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.GraphicalElement;
import org.omg.dd.dg.Group;
import org.omg.dd.dg.Transform;
import org.omg.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.GraphicalElementImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.GraphicalElementImpl#getLocalStyle <em>Local Style</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.GraphicalElementImpl#getSharedStyle <em>Shared Style</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.GraphicalElementImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.omg.dd.dg.impl.GraphicalElementImpl#getClipPath <em>Clip Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GraphicalElementImpl extends MinimalEObjectImpl.Container implements GraphicalElement {
    /**
     * The cached value of the '{@link #getLocalStyle() <em>Local Style</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalStyle()
     * @generated
     * @ordered
     */
    protected EList<Style> localStyle;

    /**
     * The cached value of the '{@link #getSharedStyle() <em>Shared Style</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSharedStyle()
     * @generated
     * @ordered
     */
    protected EList<Style> sharedStyle;

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
     * The cached value of the '{@link #getClipPath() <em>Clip Path</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClipPath()
     * @generated
     * @ordered
     */
    protected ClipPath clipPath;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GraphicalElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.GRAPHICAL_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Group getGroup() {
        if (eContainerFeatureID() != DGPackage.GRAPHICAL_ELEMENT__GROUP) return null;
        return (Group)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newGroup, DGPackage.GRAPHICAL_ELEMENT__GROUP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroup(Group newGroup) {
        if (newGroup != eInternalContainer() || (eContainerFeatureID() != DGPackage.GRAPHICAL_ELEMENT__GROUP && newGroup != null)) {
            if (EcoreUtil.isAncestor(this, newGroup))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newGroup != null)
                msgs = ((InternalEObject)newGroup).eInverseAdd(this, DGPackage.GROUP__MEMBER, Group.class, msgs);
            msgs = basicSetGroup(newGroup, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.GRAPHICAL_ELEMENT__GROUP, newGroup, newGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Style> getLocalStyle() {
        if (localStyle == null) {
            localStyle = new EObjectContainmentEList<Style>(Style.class, this, DGPackage.GRAPHICAL_ELEMENT__LOCAL_STYLE);
        }
        return localStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Style> getSharedStyle() {
        if (sharedStyle == null) {
            sharedStyle = new EObjectResolvingEList<Style>(Style.class, this, DGPackage.GRAPHICAL_ELEMENT__SHARED_STYLE);
        }
        return sharedStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Transform> getTransform() {
        if (transform == null) {
            transform = new EObjectContainmentEList<Transform>(Transform.class, this, DGPackage.GRAPHICAL_ELEMENT__TRANSFORM);
        }
        return transform;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClipPath getClipPath() {
        return clipPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetClipPath(ClipPath newClipPath, NotificationChain msgs) {
        ClipPath oldClipPath = clipPath;
        clipPath = newClipPath;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH, oldClipPath, newClipPath);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClipPath(ClipPath newClipPath) {
        if (newClipPath != clipPath) {
            NotificationChain msgs = null;
            if (clipPath != null)
                msgs = ((InternalEObject)clipPath).eInverseRemove(this, DGPackage.CLIP_PATH__CLIPPED_ELEMENT, ClipPath.class, msgs);
            if (newClipPath != null)
                msgs = ((InternalEObject)newClipPath).eInverseAdd(this, DGPackage.CLIP_PATH__CLIPPED_ELEMENT, ClipPath.class, msgs);
            msgs = basicSetClipPath(newClipPath, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH, newClipPath, newClipPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DGPackage.GRAPHICAL_ELEMENT__GROUP:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetGroup((Group)otherEnd, msgs);
            case DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH:
                if (clipPath != null)
                    msgs = ((InternalEObject)clipPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH, null, msgs);
                return basicSetClipPath((ClipPath)otherEnd, msgs);
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
            case DGPackage.GRAPHICAL_ELEMENT__GROUP:
                return basicSetGroup(null, msgs);
            case DGPackage.GRAPHICAL_ELEMENT__LOCAL_STYLE:
                return ((InternalEList<?>)getLocalStyle()).basicRemove(otherEnd, msgs);
            case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
                return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
            case DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH:
                return basicSetClipPath(null, msgs);
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
            case DGPackage.GRAPHICAL_ELEMENT__GROUP:
                return eInternalContainer().eInverseRemove(this, DGPackage.GROUP__MEMBER, Group.class, msgs);
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
            case DGPackage.GRAPHICAL_ELEMENT__GROUP:
                return getGroup();
            case DGPackage.GRAPHICAL_ELEMENT__LOCAL_STYLE:
                return getLocalStyle();
            case DGPackage.GRAPHICAL_ELEMENT__SHARED_STYLE:
                return getSharedStyle();
            case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
                return getTransform();
            case DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH:
                return getClipPath();
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
            case DGPackage.GRAPHICAL_ELEMENT__GROUP:
                setGroup((Group)newValue);
                return;
            case DGPackage.GRAPHICAL_ELEMENT__LOCAL_STYLE:
                getLocalStyle().clear();
                getLocalStyle().addAll((Collection<? extends Style>)newValue);
                return;
            case DGPackage.GRAPHICAL_ELEMENT__SHARED_STYLE:
                getSharedStyle().clear();
                getSharedStyle().addAll((Collection<? extends Style>)newValue);
                return;
            case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
                getTransform().clear();
                getTransform().addAll((Collection<? extends Transform>)newValue);
                return;
            case DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH:
                setClipPath((ClipPath)newValue);
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
            case DGPackage.GRAPHICAL_ELEMENT__GROUP:
                setGroup((Group)null);
                return;
            case DGPackage.GRAPHICAL_ELEMENT__LOCAL_STYLE:
                getLocalStyle().clear();
                return;
            case DGPackage.GRAPHICAL_ELEMENT__SHARED_STYLE:
                getSharedStyle().clear();
                return;
            case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
                getTransform().clear();
                return;
            case DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH:
                setClipPath((ClipPath)null);
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
            case DGPackage.GRAPHICAL_ELEMENT__GROUP:
                return getGroup() != null;
            case DGPackage.GRAPHICAL_ELEMENT__LOCAL_STYLE:
                return localStyle != null && !localStyle.isEmpty();
            case DGPackage.GRAPHICAL_ELEMENT__SHARED_STYLE:
                return sharedStyle != null && !sharedStyle.isEmpty();
            case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
                return transform != null && !transform.isEmpty();
            case DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH:
                return clipPath != null;
        }
        return super.eIsSet(featureID);
    }

} //GraphicalElementImpl
