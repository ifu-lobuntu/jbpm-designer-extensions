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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Proposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.ValuePropositionImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValuePropositionImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValuePropositionImpl#getOverallSatisfaction <em>Overall Satisfaction</em>}</li>
 *   <li>{@link org.omg.vdml.impl.ValuePropositionImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePropositionImpl extends MeasurableElementImpl implements ValueProposition {
    /**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
    protected EList<ValuePropositionComponent> component;

    /**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
    protected Role recipient;

    /**
	 * The cached value of the '{@link #getOverallSatisfaction() <em>Overall Satisfaction</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOverallSatisfaction()
	 * @generated
	 * @ordered
	 */
    protected ValuePropositionComponent overallSatisfaction;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ValuePropositionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.VALUE_PROPOSITION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ValuePropositionComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ValuePropositionComponent>(ValuePropositionComponent.class, this, VDMLPackage.VALUE_PROPOSITION__COMPONENT);
		}
		return component;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Role getRecipient() {
		if (recipient != null && recipient.eIsProxy()) {
			InternalEObject oldRecipient = (InternalEObject)recipient;
			recipient = (Role)eResolveProxy(oldRecipient);
			if (recipient != oldRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.VALUE_PROPOSITION__RECIPIENT, oldRecipient, recipient));
			}
		}
		return recipient;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Role basicGetRecipient() {
		return recipient;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRecipient(Role newRecipient, NotificationChain msgs) {
		Role oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_PROPOSITION__RECIPIENT, oldRecipient, newRecipient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRecipient(Role newRecipient) {
		if (newRecipient != recipient) {
			NotificationChain msgs = null;
			if (recipient != null)
				msgs = ((InternalEObject)recipient).eInverseRemove(this, VDMLPackage.ROLE__RECEIVED_PROPOSITION, Role.class, msgs);
			if (newRecipient != null)
				msgs = ((InternalEObject)newRecipient).eInverseAdd(this, VDMLPackage.ROLE__RECEIVED_PROPOSITION, Role.class, msgs);
			msgs = basicSetRecipient(newRecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_PROPOSITION__RECIPIENT, newRecipient, newRecipient));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValuePropositionComponent getOverallSatisfaction() {
		if (overallSatisfaction != null && overallSatisfaction.eIsProxy()) {
			InternalEObject oldOverallSatisfaction = (InternalEObject)overallSatisfaction;
			overallSatisfaction = (ValuePropositionComponent)eResolveProxy(oldOverallSatisfaction);
			if (overallSatisfaction != oldOverallSatisfaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.VALUE_PROPOSITION__OVERALL_SATISFACTION, oldOverallSatisfaction, overallSatisfaction));
			}
		}
		return overallSatisfaction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValuePropositionComponent basicGetOverallSatisfaction() {
		return overallSatisfaction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setOverallSatisfaction(ValuePropositionComponent newOverallSatisfaction) {
		ValuePropositionComponent oldOverallSatisfaction = overallSatisfaction;
		overallSatisfaction = newOverallSatisfaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_PROPOSITION__OVERALL_SATISFACTION, oldOverallSatisfaction, overallSatisfaction));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Role getProvider() {
		if (eContainerFeatureID() != VDMLPackage.VALUE_PROPOSITION__PROVIDER) return null;
		return (Role)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetProvider(Role newProvider, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProvider, VDMLPackage.VALUE_PROPOSITION__PROVIDER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setProvider(Role newProvider) {
		if (newProvider != eInternalContainer() || (eContainerFeatureID() != VDMLPackage.VALUE_PROPOSITION__PROVIDER && newProvider != null)) {
			if (EcoreUtil.isAncestor(this, newProvider))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, VDMLPackage.ROLE__PROVIDED_PROPOSITION, Role.class, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VALUE_PROPOSITION__PROVIDER, newProvider, newProvider));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.VALUE_PROPOSITION__RECIPIENT:
				if (recipient != null)
					msgs = ((InternalEObject)recipient).eInverseRemove(this, VDMLPackage.ROLE__RECEIVED_PROPOSITION, Role.class, msgs);
				return basicSetRecipient((Role)otherEnd, msgs);
			case VDMLPackage.VALUE_PROPOSITION__PROVIDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProvider((Role)otherEnd, msgs);
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
			case VDMLPackage.VALUE_PROPOSITION__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case VDMLPackage.VALUE_PROPOSITION__RECIPIENT:
				return basicSetRecipient(null, msgs);
			case VDMLPackage.VALUE_PROPOSITION__PROVIDER:
				return basicSetProvider(null, msgs);
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
			case VDMLPackage.VALUE_PROPOSITION__PROVIDER:
				return eInternalContainer().eInverseRemove(this, VDMLPackage.ROLE__PROVIDED_PROPOSITION, Role.class, msgs);
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
			case VDMLPackage.VALUE_PROPOSITION__COMPONENT:
				return getComponent();
			case VDMLPackage.VALUE_PROPOSITION__RECIPIENT:
				if (resolve) return getRecipient();
				return basicGetRecipient();
			case VDMLPackage.VALUE_PROPOSITION__OVERALL_SATISFACTION:
				if (resolve) return getOverallSatisfaction();
				return basicGetOverallSatisfaction();
			case VDMLPackage.VALUE_PROPOSITION__PROVIDER:
				return getProvider();
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
			case VDMLPackage.VALUE_PROPOSITION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ValuePropositionComponent>)newValue);
				return;
			case VDMLPackage.VALUE_PROPOSITION__RECIPIENT:
				setRecipient((Role)newValue);
				return;
			case VDMLPackage.VALUE_PROPOSITION__OVERALL_SATISFACTION:
				setOverallSatisfaction((ValuePropositionComponent)newValue);
				return;
			case VDMLPackage.VALUE_PROPOSITION__PROVIDER:
				setProvider((Role)newValue);
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
			case VDMLPackage.VALUE_PROPOSITION__COMPONENT:
				getComponent().clear();
				return;
			case VDMLPackage.VALUE_PROPOSITION__RECIPIENT:
				setRecipient((Role)null);
				return;
			case VDMLPackage.VALUE_PROPOSITION__OVERALL_SATISFACTION:
				setOverallSatisfaction((ValuePropositionComponent)null);
				return;
			case VDMLPackage.VALUE_PROPOSITION__PROVIDER:
				setProvider((Role)null);
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
			case VDMLPackage.VALUE_PROPOSITION__COMPONENT:
				return component != null && !component.isEmpty();
			case VDMLPackage.VALUE_PROPOSITION__RECIPIENT:
				return recipient != null;
			case VDMLPackage.VALUE_PROPOSITION__OVERALL_SATISFACTION:
				return overallSatisfaction != null;
			case VDMLPackage.VALUE_PROPOSITION__PROVIDER:
				return getProvider() != null;
		}
		return super.eIsSet(featureID);
	}

} //ValuePropositionImpl
