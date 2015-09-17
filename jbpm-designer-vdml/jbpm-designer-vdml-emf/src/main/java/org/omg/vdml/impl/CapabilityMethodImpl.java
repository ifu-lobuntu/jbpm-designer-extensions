/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.Activity;
import org.omg.vdml.BusinessItem;
import org.omg.vdml.Capability;
import org.omg.vdml.CapabilityMethod;
import org.omg.vdml.CapabilityOffer;
import org.omg.vdml.Milestone;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.Performer;
import org.omg.vdml.PracticeDefinition;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.CapabilityMethodImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityMethodImpl#getMethodOwner <em>Method Owner</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityMethodImpl#getImplementedPractice <em>Implemented Practice</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityMethodImpl#getMethodResource <em>Method Resource</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityMethodImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityMethodImpl#getSupportedCapability <em>Supported Capability</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityMethodImpl#getInitialActivity <em>Initial Activity</em>}</li>
 *   <li>{@link org.omg.vdml.impl.CapabilityMethodImpl#getMilestone <em>Milestone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityMethodImpl extends CollaborationImpl implements CapabilityMethod {
    /**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
    protected EList<Performer> performer;

    /**
	 * The cached value of the '{@link #getImplementedPractice() <em>Implemented Practice</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getImplementedPractice()
	 * @generated
	 * @ordered
	 */
    protected EList<PracticeDefinition> implementedPractice;

    /**
	 * The cached value of the '{@link #getMethodResource() <em>Method Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMethodResource()
	 * @generated
	 * @ordered
	 */
    protected EList<BusinessItem> methodResource;

    /**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Capability definition;

				/**
	 * The cached value of the '{@link #getSupportedCapability() <em>Supported Capability</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSupportedCapability()
	 * @generated
	 * @ordered
	 */
    protected EList<CapabilityOffer> supportedCapability;

    /**
	 * The cached value of the '{@link #getInitialActivity() <em>Initial Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity initialActivity;

				/**
	 * The cached value of the '{@link #getMilestone() <em>Milestone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestone()
	 * @generated
	 * @ordered
	 */
	protected EList<Milestone> milestone;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CapabilityMethodImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.CAPABILITY_METHOD;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Performer> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Performer>(Performer.class, this, VDMLPackage.CAPABILITY_METHOD__PERFORMER);
		}
		return performer;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OrgUnit getMethodOwner() {
		if (eContainerFeatureID() != VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER) return null;
		return (OrgUnit)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMethodOwner(OrgUnit newMethodOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMethodOwner, VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMethodOwner(OrgUnit newMethodOwner) {
		if (newMethodOwner != eInternalContainer() || (eContainerFeatureID() != VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER && newMethodOwner != null)) {
			if (EcoreUtil.isAncestor(this, newMethodOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMethodOwner != null)
				msgs = ((InternalEObject)newMethodOwner).eInverseAdd(this, VDMLPackage.ORG_UNIT__OWNED_METHOD, OrgUnit.class, msgs);
			msgs = basicSetMethodOwner(newMethodOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER, newMethodOwner, newMethodOwner));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<PracticeDefinition> getImplementedPractice() {
		if (implementedPractice == null) {
			implementedPractice = new EObjectResolvingEList<PracticeDefinition>(PracticeDefinition.class, this, VDMLPackage.CAPABILITY_METHOD__IMPLEMENTED_PRACTICE);
		}
		return implementedPractice;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<BusinessItem> getMethodResource() {
		if (methodResource == null) {
			methodResource = new EObjectWithInverseResolvingEList.ManyInverse<BusinessItem>(BusinessItem.class, this, VDMLPackage.CAPABILITY_METHOD__METHOD_RESOURCE, VDMLPackage.BUSINESS_ITEM__METHOD);
		}
		return methodResource;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (Capability)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.CAPABILITY_METHOD__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetDefinition() {
		return definition;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Capability newDefinition) {
		Capability oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_METHOD__DEFINITION, oldDefinition, definition));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<CapabilityOffer> getSupportedCapability() {
		if (supportedCapability == null) {
			supportedCapability = new EObjectWithInverseResolvingEList.ManyInverse<CapabilityOffer>(CapabilityOffer.class, this, VDMLPackage.CAPABILITY_METHOD__SUPPORTED_CAPABILITY, VDMLPackage.CAPABILITY_OFFER__METHOD);
		}
		return supportedCapability;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getInitialActivity() {
		if (initialActivity != null && initialActivity.eIsProxy()) {
			InternalEObject oldInitialActivity = (InternalEObject)initialActivity;
			initialActivity = (Activity)eResolveProxy(oldInitialActivity);
			if (initialActivity != oldInitialActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.CAPABILITY_METHOD__INITIAL_ACTIVITY, oldInitialActivity, initialActivity));
			}
		}
		return initialActivity;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetInitialActivity() {
		return initialActivity;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialActivity(Activity newInitialActivity) {
		Activity oldInitialActivity = initialActivity;
		initialActivity = newInitialActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.CAPABILITY_METHOD__INITIAL_ACTIVITY, oldInitialActivity, initialActivity));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Milestone> getMilestone() {
		if (milestone == null) {
			milestone = new EObjectContainmentEList<Milestone>(Milestone.class, this, VDMLPackage.CAPABILITY_METHOD__MILESTONE);
		}
		return milestone;
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
			case VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMethodOwner((OrgUnit)otherEnd, msgs);
			case VDMLPackage.CAPABILITY_METHOD__METHOD_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethodResource()).basicAdd(otherEnd, msgs);
			case VDMLPackage.CAPABILITY_METHOD__SUPPORTED_CAPABILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportedCapability()).basicAdd(otherEnd, msgs);
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
			case VDMLPackage.CAPABILITY_METHOD__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER:
				return basicSetMethodOwner(null, msgs);
			case VDMLPackage.CAPABILITY_METHOD__METHOD_RESOURCE:
				return ((InternalEList<?>)getMethodResource()).basicRemove(otherEnd, msgs);
			case VDMLPackage.CAPABILITY_METHOD__SUPPORTED_CAPABILITY:
				return ((InternalEList<?>)getSupportedCapability()).basicRemove(otherEnd, msgs);
			case VDMLPackage.CAPABILITY_METHOD__MILESTONE:
				return ((InternalEList<?>)getMilestone()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER:
				return eInternalContainer().eInverseRemove(this, VDMLPackage.ORG_UNIT__OWNED_METHOD, OrgUnit.class, msgs);
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
			case VDMLPackage.CAPABILITY_METHOD__PERFORMER:
				return getPerformer();
			case VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER:
				return getMethodOwner();
			case VDMLPackage.CAPABILITY_METHOD__IMPLEMENTED_PRACTICE:
				return getImplementedPractice();
			case VDMLPackage.CAPABILITY_METHOD__METHOD_RESOURCE:
				return getMethodResource();
			case VDMLPackage.CAPABILITY_METHOD__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case VDMLPackage.CAPABILITY_METHOD__SUPPORTED_CAPABILITY:
				return getSupportedCapability();
			case VDMLPackage.CAPABILITY_METHOD__INITIAL_ACTIVITY:
				if (resolve) return getInitialActivity();
				return basicGetInitialActivity();
			case VDMLPackage.CAPABILITY_METHOD__MILESTONE:
				return getMilestone();
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
			case VDMLPackage.CAPABILITY_METHOD__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Performer>)newValue);
				return;
			case VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER:
				setMethodOwner((OrgUnit)newValue);
				return;
			case VDMLPackage.CAPABILITY_METHOD__IMPLEMENTED_PRACTICE:
				getImplementedPractice().clear();
				getImplementedPractice().addAll((Collection<? extends PracticeDefinition>)newValue);
				return;
			case VDMLPackage.CAPABILITY_METHOD__METHOD_RESOURCE:
				getMethodResource().clear();
				getMethodResource().addAll((Collection<? extends BusinessItem>)newValue);
				return;
			case VDMLPackage.CAPABILITY_METHOD__DEFINITION:
				setDefinition((Capability)newValue);
				return;
			case VDMLPackage.CAPABILITY_METHOD__SUPPORTED_CAPABILITY:
				getSupportedCapability().clear();
				getSupportedCapability().addAll((Collection<? extends CapabilityOffer>)newValue);
				return;
			case VDMLPackage.CAPABILITY_METHOD__INITIAL_ACTIVITY:
				setInitialActivity((Activity)newValue);
				return;
			case VDMLPackage.CAPABILITY_METHOD__MILESTONE:
				getMilestone().clear();
				getMilestone().addAll((Collection<? extends Milestone>)newValue);
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
			case VDMLPackage.CAPABILITY_METHOD__PERFORMER:
				getPerformer().clear();
				return;
			case VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER:
				setMethodOwner((OrgUnit)null);
				return;
			case VDMLPackage.CAPABILITY_METHOD__IMPLEMENTED_PRACTICE:
				getImplementedPractice().clear();
				return;
			case VDMLPackage.CAPABILITY_METHOD__METHOD_RESOURCE:
				getMethodResource().clear();
				return;
			case VDMLPackage.CAPABILITY_METHOD__DEFINITION:
				setDefinition((Capability)null);
				return;
			case VDMLPackage.CAPABILITY_METHOD__SUPPORTED_CAPABILITY:
				getSupportedCapability().clear();
				return;
			case VDMLPackage.CAPABILITY_METHOD__INITIAL_ACTIVITY:
				setInitialActivity((Activity)null);
				return;
			case VDMLPackage.CAPABILITY_METHOD__MILESTONE:
				getMilestone().clear();
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
			case VDMLPackage.CAPABILITY_METHOD__PERFORMER:
				return performer != null && !performer.isEmpty();
			case VDMLPackage.CAPABILITY_METHOD__METHOD_OWNER:
				return getMethodOwner() != null;
			case VDMLPackage.CAPABILITY_METHOD__IMPLEMENTED_PRACTICE:
				return implementedPractice != null && !implementedPractice.isEmpty();
			case VDMLPackage.CAPABILITY_METHOD__METHOD_RESOURCE:
				return methodResource != null && !methodResource.isEmpty();
			case VDMLPackage.CAPABILITY_METHOD__DEFINITION:
				return definition != null;
			case VDMLPackage.CAPABILITY_METHOD__SUPPORTED_CAPABILITY:
				return supportedCapability != null && !supportedCapability.isEmpty();
			case VDMLPackage.CAPABILITY_METHOD__INITIAL_ACTIVITY:
				return initialActivity != null;
			case VDMLPackage.CAPABILITY_METHOD__MILESTONE:
				return milestone != null && !milestone.isEmpty();
		}
		return super.eIsSet(featureID);
	}
    @Override
    public EList<Role> getCollaborationRole() {
        return (EList)getPerformer();
    }

} //CapabilityMethodImpl
