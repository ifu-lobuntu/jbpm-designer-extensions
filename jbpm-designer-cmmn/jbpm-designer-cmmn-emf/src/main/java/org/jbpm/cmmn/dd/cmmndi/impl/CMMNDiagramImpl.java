/**
 */
package org.jbpm.cmmn.dd.cmmndi.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagram;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement;
import org.jbpm.cmmn.dd.cmmndi.CMMNStyle;
import org.jbpm.designer.dd.util.Collections;
import org.omg.cmmn.TDefinitions;
import org.omg.dd.di.impl.DiagramImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramImpl#getOwnedCmmnDiagramElement <em>Owned Cmmn Diagram Element</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramImpl#getOwnedCmmnStyles <em>Owned Cmmn Styles</em>}</li>
 *   <li>{@link org.jbpm.cmmn.dd.cmmndi.impl.CMMNDiagramImpl#getCmmnElement <em>Cmmn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CMMNDiagramImpl extends DiagramImpl implements CMMNDiagram {
    /**
     * The cached value of the '{@link #getOwnedCmmnDiagramElement() <em>Owned Cmmn Diagram Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedCmmnDiagramElement()
     * @generated
     * @ordered
     */
    protected EList<CMMNDiagramElement> ownedCmmnDiagramElement;

    /**
     * The cached value of the '{@link #getOwnedCmmnStyles() <em>Owned Cmmn Styles</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedCmmnStyles()
     * @generated
     * @ordered
     */
    protected EList<CMMNStyle> ownedCmmnStyles;

    /**
     * The cached value of the '{@link #getCmmnElement() <em>Cmmn Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCmmnElement()
     * @generated
     * @ordered
     */
    protected TDefinitions cmmnElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CMMNDiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNDIPackage.Literals.CMMN_DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDefinitions getCmmnElement() {
        if (cmmnElement != null && cmmnElement.eIsProxy()) {
            InternalEObject oldCmmnElement = (InternalEObject)cmmnElement;
            cmmnElement = (TDefinitions)eResolveProxy(oldCmmnElement);
            if (cmmnElement != oldCmmnElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT, oldCmmnElement, cmmnElement));
            }
        }
        return cmmnElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDefinitions basicGetCmmnElement() {
        return cmmnElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCmmnElement(TDefinitions newCmmnElement) {
        TDefinitions oldCmmnElement = cmmnElement;
        cmmnElement = newCmmnElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT, oldCmmnElement, cmmnElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CMMNDiagramElement> getOwnedCmmnDiagramElement() {
        if (ownedCmmnDiagramElement == null) {
            ownedCmmnDiagramElement = new EObjectContainmentEList<CMMNDiagramElement>(CMMNDiagramElement.class, this, CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_DIAGRAM_ELEMENT);
        }
        return ownedCmmnDiagramElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CMMNStyle> getOwnedCmmnStyles() {
        if (ownedCmmnStyles == null) {
            ownedCmmnStyles = new EObjectContainmentEList<CMMNStyle>(CMMNStyle.class, this, CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_STYLES);
        }
        return ownedCmmnStyles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_DIAGRAM_ELEMENT:
                return ((InternalEList<?>)getOwnedCmmnDiagramElement()).basicRemove(otherEnd, msgs);
            case CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_STYLES:
                return ((InternalEList<?>)getOwnedCmmnStyles()).basicRemove(otherEnd, msgs);
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
            case CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_DIAGRAM_ELEMENT:
                return getOwnedCmmnDiagramElement();
            case CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_STYLES:
                return getOwnedCmmnStyles();
            case CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT:
                if (resolve) return getCmmnElement();
                return basicGetCmmnElement();
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
            case CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_DIAGRAM_ELEMENT:
                getOwnedCmmnDiagramElement().clear();
                getOwnedCmmnDiagramElement().addAll((Collection<? extends CMMNDiagramElement>)newValue);
                return;
            case CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_STYLES:
                getOwnedCmmnStyles().clear();
                getOwnedCmmnStyles().addAll((Collection<? extends CMMNStyle>)newValue);
                return;
            case CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT:
                setCmmnElement((TDefinitions)newValue);
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
            case CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_DIAGRAM_ELEMENT:
                getOwnedCmmnDiagramElement().clear();
                return;
            case CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_STYLES:
                getOwnedCmmnStyles().clear();
                return;
            case CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT:
                setCmmnElement((TDefinitions)null);
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
            case CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_DIAGRAM_ELEMENT:
                return ownedCmmnDiagramElement != null && !ownedCmmnDiagramElement.isEmpty();
            case CMMNDIPackage.CMMN_DIAGRAM__OWNED_CMMN_STYLES:
                return ownedCmmnStyles != null && !ownedCmmnStyles.isEmpty();
            case CMMNDIPackage.CMMN_DIAGRAM__CMMN_ELEMENT:
                return cmmnElement != null;
        }
        return super.eIsSet(featureID);
    }

    @Override
    public EList<EObject> getModelElement() {
        return  Collections.asList(getCmmnElement());
    }
    @Override
    public EList getOwnedElement() {
        return getOwnedCmmnDiagramElement();
    }

} //CMMNDiagramImpl
