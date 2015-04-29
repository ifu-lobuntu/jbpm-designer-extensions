/**
 */
package org.omg.cmmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.cmmn.CMMNPackage;
import org.omg.cmmn.CaseFileItemTransition;
import org.omg.cmmn.TCaseFileItem;
import org.omg.cmmn.TCaseFileItemOnPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCase File Item On Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.cmmn.impl.TCaseFileItemOnPartImpl#getStandardEvent <em>Standard Event</em>}</li>
 *   <li>{@link org.omg.cmmn.impl.TCaseFileItemOnPartImpl#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCaseFileItemOnPartImpl extends TOnPartImpl implements TCaseFileItemOnPart {
    /**
     * The default value of the '{@link #getStandardEvent() <em>Standard Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStandardEvent()
     * @generated
     * @ordered
     */
    protected static final CaseFileItemTransition STANDARD_EVENT_EDEFAULT = CaseFileItemTransition.ADD_CHILD;

    /**
     * The cached value of the '{@link #getStandardEvent() <em>Standard Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStandardEvent()
     * @generated
     * @ordered
     */
    protected CaseFileItemTransition standardEvent = STANDARD_EVENT_EDEFAULT;

    /**
     * This is true if the Standard Event attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean standardEventESet;

    /**
     * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected TCaseFileItem sourceRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TCaseFileItemOnPartImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CMMNPackage.Literals.TCASE_FILE_ITEM_ON_PART;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CaseFileItemTransition getStandardEvent() {
        return standardEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStandardEvent(CaseFileItemTransition newStandardEvent) {
        CaseFileItemTransition oldStandardEvent = standardEvent;
        standardEvent = newStandardEvent == null ? STANDARD_EVENT_EDEFAULT : newStandardEvent;
        boolean oldStandardEventESet = standardEventESet;
        standardEventESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT, oldStandardEvent, standardEvent, !oldStandardEventESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStandardEvent() {
        CaseFileItemTransition oldStandardEvent = standardEvent;
        boolean oldStandardEventESet = standardEventESet;
        standardEvent = STANDARD_EVENT_EDEFAULT;
        standardEventESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, CMMNPackage.TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT, oldStandardEvent, STANDARD_EVENT_EDEFAULT, oldStandardEventESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetStandardEvent() {
        return standardEventESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TCaseFileItem getSourceRef() {
        return sourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceRef(TCaseFileItem newSourceRef) {
        TCaseFileItem oldSourceRef = sourceRef;
        sourceRef = newSourceRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CMMNPackage.TCASE_FILE_ITEM_ON_PART__SOURCE_REF, oldSourceRef, sourceRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CMMNPackage.TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT:
                return getStandardEvent();
            case CMMNPackage.TCASE_FILE_ITEM_ON_PART__SOURCE_REF:
                return getSourceRef();
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
            case CMMNPackage.TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT:
                setStandardEvent((CaseFileItemTransition)newValue);
                return;
            case CMMNPackage.TCASE_FILE_ITEM_ON_PART__SOURCE_REF:
                setSourceRef((TCaseFileItem)newValue);
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
            case CMMNPackage.TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT:
                unsetStandardEvent();
                return;
            case CMMNPackage.TCASE_FILE_ITEM_ON_PART__SOURCE_REF:
                setSourceRef((TCaseFileItem)null);
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
            case CMMNPackage.TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT:
                return isSetStandardEvent();
            case CMMNPackage.TCASE_FILE_ITEM_ON_PART__SOURCE_REF:
                return sourceRef != null;
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
        result.append(" (standardEvent: ");
        if (standardEventESet) result.append(standardEvent); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TCaseFileItemOnPartImpl
