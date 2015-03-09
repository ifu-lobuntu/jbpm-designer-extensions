/**
 */
package org.omg.smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.smm.Annotation;
import org.omg.smm.Attribute;
import org.omg.smm.SMMPackage;
import org.omg.smm.SmmElement;
import org.omg.smm.SmmRelationship;
import org.omg.smm.string;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smm Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.SmmElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omg.smm.impl.SmmElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.smm.impl.SmmElementImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.omg.smm.impl.SmmElementImpl#getInRelationships <em>In Relationships</em>}</li>
 *   <li>{@link org.omg.smm.impl.SmmElementImpl#getOutRelationships <em>Out Relationships</em>}</li>
 *   <li>{@link org.omg.smm.impl.SmmElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.omg.smm.impl.SmmElementImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SmmElementImpl extends MinimalEObjectImpl.Container implements SmmElement {
    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected string description;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected string name;

    /**
     * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortDescription()
     * @generated
     * @ordered
     */
    protected string shortDescription;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<Attribute> attributes;

    /**
     * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotations()
     * @generated
     * @ordered
     */
    protected EList<Annotation> annotations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SmmElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.SMM_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string getDescription() {
        if (description != null && description.eIsProxy()) {
            InternalEObject oldDescription = (InternalEObject)description;
            description = (string)eResolveProxy(oldDescription);
            if (description != oldDescription) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.SMM_ELEMENT__DESCRIPTION, oldDescription, description));
            }
        }
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string basicGetDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(string newDescription) {
        string oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.SMM_ELEMENT__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string getName() {
        if (name != null && name.eIsProxy()) {
            InternalEObject oldName = (InternalEObject)name;
            name = (string)eResolveProxy(oldName);
            if (name != oldName) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.SMM_ELEMENT__NAME, oldName, name));
            }
        }
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string basicGetName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(string newName) {
        string oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.SMM_ELEMENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string getShortDescription() {
        if (shortDescription != null && shortDescription.eIsProxy()) {
            InternalEObject oldShortDescription = (InternalEObject)shortDescription;
            shortDescription = (string)eResolveProxy(oldShortDescription);
            if (shortDescription != oldShortDescription) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.SMM_ELEMENT__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
            }
        }
        return shortDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public string basicGetShortDescription() {
        return shortDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setShortDescription(string newShortDescription) {
        string oldShortDescription = shortDescription;
        shortDescription = newShortDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.SMM_ELEMENT__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SmmRelationship> getInRelationships() {
        // TODO: implement this method to return the 'In Relationships' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SmmRelationship> getOutRelationships() {
        // TODO: implement this method to return the 'Out Relationships' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, SMMPackage.SMM_ELEMENT__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Annotation> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, SMMPackage.SMM_ELEMENT__ANNOTATIONS);
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SMMPackage.SMM_ELEMENT__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case SMMPackage.SMM_ELEMENT__ANNOTATIONS:
                return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
            case SMMPackage.SMM_ELEMENT__DESCRIPTION:
                if (resolve) return getDescription();
                return basicGetDescription();
            case SMMPackage.SMM_ELEMENT__NAME:
                if (resolve) return getName();
                return basicGetName();
            case SMMPackage.SMM_ELEMENT__SHORT_DESCRIPTION:
                if (resolve) return getShortDescription();
                return basicGetShortDescription();
            case SMMPackage.SMM_ELEMENT__IN_RELATIONSHIPS:
                return getInRelationships();
            case SMMPackage.SMM_ELEMENT__OUT_RELATIONSHIPS:
                return getOutRelationships();
            case SMMPackage.SMM_ELEMENT__ATTRIBUTES:
                return getAttributes();
            case SMMPackage.SMM_ELEMENT__ANNOTATIONS:
                return getAnnotations();
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
            case SMMPackage.SMM_ELEMENT__DESCRIPTION:
                setDescription((string)newValue);
                return;
            case SMMPackage.SMM_ELEMENT__NAME:
                setName((string)newValue);
                return;
            case SMMPackage.SMM_ELEMENT__SHORT_DESCRIPTION:
                setShortDescription((string)newValue);
                return;
            case SMMPackage.SMM_ELEMENT__IN_RELATIONSHIPS:
                getInRelationships().clear();
                getInRelationships().addAll((Collection<? extends SmmRelationship>)newValue);
                return;
            case SMMPackage.SMM_ELEMENT__OUT_RELATIONSHIPS:
                getOutRelationships().clear();
                getOutRelationships().addAll((Collection<? extends SmmRelationship>)newValue);
                return;
            case SMMPackage.SMM_ELEMENT__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
                return;
            case SMMPackage.SMM_ELEMENT__ANNOTATIONS:
                getAnnotations().clear();
                getAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
            case SMMPackage.SMM_ELEMENT__DESCRIPTION:
                setDescription((string)null);
                return;
            case SMMPackage.SMM_ELEMENT__NAME:
                setName((string)null);
                return;
            case SMMPackage.SMM_ELEMENT__SHORT_DESCRIPTION:
                setShortDescription((string)null);
                return;
            case SMMPackage.SMM_ELEMENT__IN_RELATIONSHIPS:
                getInRelationships().clear();
                return;
            case SMMPackage.SMM_ELEMENT__OUT_RELATIONSHIPS:
                getOutRelationships().clear();
                return;
            case SMMPackage.SMM_ELEMENT__ATTRIBUTES:
                getAttributes().clear();
                return;
            case SMMPackage.SMM_ELEMENT__ANNOTATIONS:
                getAnnotations().clear();
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
            case SMMPackage.SMM_ELEMENT__DESCRIPTION:
                return description != null;
            case SMMPackage.SMM_ELEMENT__NAME:
                return name != null;
            case SMMPackage.SMM_ELEMENT__SHORT_DESCRIPTION:
                return shortDescription != null;
            case SMMPackage.SMM_ELEMENT__IN_RELATIONSHIPS:
                return !getInRelationships().isEmpty();
            case SMMPackage.SMM_ELEMENT__OUT_RELATIONSHIPS:
                return !getOutRelationships().isEmpty();
            case SMMPackage.SMM_ELEMENT__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case SMMPackage.SMM_ELEMENT__ANNOTATIONS:
                return annotations != null && !annotations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SmmElementImpl
