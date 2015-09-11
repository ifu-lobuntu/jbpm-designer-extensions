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
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.di.impl.DiagramElementImpl#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.DiagramElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.DiagramElementImpl#getLocalStyle <em>Local Style</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.DiagramElementImpl#getSharedStyle <em>Shared Style</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.DiagramElementImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.DiagramElementImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends MinimalEObjectImpl.Container implements DiagramElement {
    /**
     * The cached value of the '{@link #getLocalStyle() <em>Local Style</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalStyle()
     * @generated
     * @ordered
     */
    protected Style localStyle;

    /**
     * The cached value of the '{@link #getSharedStyle() <em>Shared Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSharedStyle()
     * @generated
     * @ordered
     */
    protected Style sharedStyle;

    /**
     * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelElement()
     * @generated
     * @ordered
     */
    protected EList<EObject> modelElement;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DIPackage.Literals.DIAGRAM_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObject> getModelElement() {
        if (modelElement == null) {
            modelElement = new EObjectResolvingEList<EObject>(EObject.class, this, DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT);
        }
        return modelElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.DIAGRAM_ELEMENT__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElement getOwningElement() {
        DiagramElement owningElement = basicGetOwningElement();
        return owningElement != null && owningElement.eIsProxy() ? (DiagramElement)eResolveProxy((InternalEObject)owningElement) : owningElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public DiagramElement basicGetOwningElement() {
        if(eContainer() instanceof DiagramElement){
            return (DiagramElement) eContainer();
        }else{
            return null;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DiagramElement> getOwnedElement() {
        // TODO: implement this method to return the 'Owned Element' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Style getLocalStyle() {
        return localStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocalStyle(Style newLocalStyle, NotificationChain msgs) {
        Style oldLocalStyle = localStyle;
        localStyle = newLocalStyle;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE, oldLocalStyle, newLocalStyle);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalStyle(Style newLocalStyle) {
        if (newLocalStyle != localStyle) {
            NotificationChain msgs = null;
            if (localStyle != null)
                msgs = ((InternalEObject)localStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE, null, msgs);
            if (newLocalStyle != null)
                msgs = ((InternalEObject)newLocalStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE, null, msgs);
            msgs = basicSetLocalStyle(newLocalStyle, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE, newLocalStyle, newLocalStyle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Style getSharedStyle() {
        if (sharedStyle != null && sharedStyle.eIsProxy()) {
            InternalEObject oldSharedStyle = (InternalEObject)sharedStyle;
            sharedStyle = (Style)eResolveProxy(oldSharedStyle);
            if (sharedStyle != oldSharedStyle) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE, oldSharedStyle, sharedStyle));
            }
        }
        return sharedStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Style basicGetSharedStyle() {
        return sharedStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSharedStyle(Style newSharedStyle) {
        Style oldSharedStyle = sharedStyle;
        sharedStyle = newSharedStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE, oldSharedStyle, sharedStyle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE:
                return basicSetLocalStyle(null, msgs);
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
            case DIPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
                if (resolve) return getOwningElement();
                return basicGetOwningElement();
            case DIPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
                return getOwnedElement();
            case DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE:
                return getLocalStyle();
            case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
                if (resolve) return getSharedStyle();
                return basicGetSharedStyle();
            case DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
                return getModelElement();
            case DIPackage.DIAGRAM_ELEMENT__ID:
                return getId();
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
            case DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE:
                setLocalStyle((Style)newValue);
                return;
            case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
                setSharedStyle((Style)newValue);
                return;
            case DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
                getModelElement().clear();
                getModelElement().addAll((Collection<? extends EObject>)newValue);
                return;
            case DIPackage.DIAGRAM_ELEMENT__ID:
                setId((String)newValue);
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
            case DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE:
                setLocalStyle((Style)null);
                return;
            case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
                setSharedStyle((Style)null);
                return;
            case DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
                getModelElement().clear();
                return;
            case DIPackage.DIAGRAM_ELEMENT__ID:
                setId(ID_EDEFAULT);
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
            case DIPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
                return basicGetOwningElement() != null;
            case DIPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
                return !getOwnedElement().isEmpty();
            case DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE:
                return localStyle != null;
            case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
                return sharedStyle != null;
            case DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
                return modelElement != null && !modelElement.isEmpty();
            case DIPackage.DIAGRAM_ELEMENT__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
        result.append(" (id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //DiagramElementImpl
