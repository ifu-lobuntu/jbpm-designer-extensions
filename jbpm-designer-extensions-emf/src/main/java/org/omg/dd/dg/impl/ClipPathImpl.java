/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.dd.dg.ClipPath;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.GraphicalElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clip Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.ClipPathImpl#getClippedElement <em>Clipped Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClipPathImpl extends GroupImpl implements ClipPath {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClipPathImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.CLIP_PATH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GraphicalElement getClippedElement() {
        if (eContainerFeatureID() != DGPackage.CLIP_PATH__CLIPPED_ELEMENT) return null;
        return (GraphicalElement)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetClippedElement(GraphicalElement newClippedElement, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newClippedElement, DGPackage.CLIP_PATH__CLIPPED_ELEMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClippedElement(GraphicalElement newClippedElement) {
        if (newClippedElement != eInternalContainer() || (eContainerFeatureID() != DGPackage.CLIP_PATH__CLIPPED_ELEMENT && newClippedElement != null)) {
            if (EcoreUtil.isAncestor(this, newClippedElement))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newClippedElement != null)
                msgs = ((InternalEObject)newClippedElement).eInverseAdd(this, DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH, GraphicalElement.class, msgs);
            msgs = basicSetClippedElement(newClippedElement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.CLIP_PATH__CLIPPED_ELEMENT, newClippedElement, newClippedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DGPackage.CLIP_PATH__CLIPPED_ELEMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetClippedElement((GraphicalElement)otherEnd, msgs);
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
            case DGPackage.CLIP_PATH__CLIPPED_ELEMENT:
                return basicSetClippedElement(null, msgs);
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
            case DGPackage.CLIP_PATH__CLIPPED_ELEMENT:
                return eInternalContainer().eInverseRemove(this, DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH, GraphicalElement.class, msgs);
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
            case DGPackage.CLIP_PATH__CLIPPED_ELEMENT:
                return getClippedElement();
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
            case DGPackage.CLIP_PATH__CLIPPED_ELEMENT:
                setClippedElement((GraphicalElement)newValue);
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
            case DGPackage.CLIP_PATH__CLIPPED_ELEMENT:
                setClippedElement((GraphicalElement)null);
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
            case DGPackage.CLIP_PATH__CLIPPED_ELEMENT:
                return getClippedElement() != null;
        }
        return super.eIsSet(featureID);
    }

} //ClipPathImpl
