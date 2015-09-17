/**
 */
package org.omg.vdml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.vdml.BusinessItem;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputPort;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.Milestone;
import org.omg.vdml.OutputPort;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deliverable Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.DeliverableFlowImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.omg.vdml.impl.DeliverableFlowImpl#getIsTangible <em>Is Tangible</em>}</li>
 *   <li>{@link org.omg.vdml.impl.DeliverableFlowImpl#getDeliverable <em>Deliverable</em>}</li>
 *   <li>{@link org.omg.vdml.impl.DeliverableFlowImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.omg.vdml.impl.DeliverableFlowImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.omg.vdml.impl.DeliverableFlowImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.omg.vdml.impl.DeliverableFlowImpl#getMilestone <em>Milestone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliverableFlowImpl extends MeasurableElementImpl implements DeliverableFlow {
    /**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
    protected InputPort recipient;

    /**
	 * The default value of the '{@link #getIsTangible() <em>Is Tangible</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsTangible()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean IS_TANGIBLE_EDEFAULT = Boolean.TRUE;

    /**
	 * The cached value of the '{@link #getIsTangible() <em>Is Tangible</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsTangible()
	 * @generated
	 * @ordered
	 */
    protected Boolean isTangible = IS_TANGIBLE_EDEFAULT;

    /**
	 * The cached value of the '{@link #getDeliverable() <em>Deliverable</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDeliverable()
	 * @generated
	 * @ordered
	 */
    protected BusinessItem deliverable;

    /**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
    protected MeasuredCharacteristic duration;

    /**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
    protected static final String CHANNEL_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
    protected String channel = CHANNEL_EDEFAULT;

    /**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
    protected OutputPort provider;

    /**
	 * The cached value of the '{@link #getMilestone() <em>Milestone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestone()
	 * @generated
	 * @ordered
	 */
	protected Milestone milestone;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DeliverableFlowImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.DELIVERABLE_FLOW;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InputPort getRecipient() {
		if (recipient != null && recipient.eIsProxy()) {
			InternalEObject oldRecipient = (InternalEObject)recipient;
			recipient = (InputPort)eResolveProxy(oldRecipient);
			if (recipient != oldRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.DELIVERABLE_FLOW__RECIPIENT, oldRecipient, recipient));
			}
		}
		return recipient;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public InputPort basicGetRecipient() {
		return recipient;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRecipient(InputPort newRecipient, NotificationChain msgs) {
		InputPort oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__RECIPIENT, oldRecipient, newRecipient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRecipient(InputPort newRecipient) {
		if (newRecipient != recipient) {
			NotificationChain msgs = null;
			if (recipient != null)
				msgs = ((InternalEObject)recipient).eInverseRemove(this, VDMLPackage.INPUT_PORT__INPUT, InputPort.class, msgs);
			if (newRecipient != null)
				msgs = ((InternalEObject)newRecipient).eInverseAdd(this, VDMLPackage.INPUT_PORT__INPUT, InputPort.class, msgs);
			msgs = basicSetRecipient(newRecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__RECIPIENT, newRecipient, newRecipient));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getIsTangible() {
		return isTangible;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsTangible(Boolean newIsTangible) {
		Boolean oldIsTangible = isTangible;
		isTangible = newIsTangible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__IS_TANGIBLE, oldIsTangible, isTangible));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessItem getDeliverable() {
		if (deliverable != null && deliverable.eIsProxy()) {
			InternalEObject oldDeliverable = (InternalEObject)deliverable;
			deliverable = (BusinessItem)eResolveProxy(oldDeliverable);
			if (deliverable != oldDeliverable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.DELIVERABLE_FLOW__DELIVERABLE, oldDeliverable, deliverable));
			}
		}
		return deliverable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessItem basicGetDeliverable() {
		return deliverable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDeliverable(BusinessItem newDeliverable, NotificationChain msgs) {
		BusinessItem oldDeliverable = deliverable;
		deliverable = newDeliverable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__DELIVERABLE, oldDeliverable, newDeliverable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDeliverable(BusinessItem newDeliverable) {
		if (newDeliverable != deliverable) {
			NotificationChain msgs = null;
			if (deliverable != null)
				msgs = ((InternalEObject)deliverable).eInverseRemove(this, VDMLPackage.BUSINESS_ITEM__FLOW, BusinessItem.class, msgs);
			if (newDeliverable != null)
				msgs = ((InternalEObject)newDeliverable).eInverseAdd(this, VDMLPackage.BUSINESS_ITEM__FLOW, BusinessItem.class, msgs);
			msgs = basicSetDeliverable(newDeliverable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__DELIVERABLE, newDeliverable, newDeliverable));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MeasuredCharacteristic getDuration() {
		return duration;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDuration(MeasuredCharacteristic newDuration, NotificationChain msgs) {
		MeasuredCharacteristic oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDuration(MeasuredCharacteristic newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.DELIVERABLE_FLOW__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.DELIVERABLE_FLOW__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__DURATION, newDuration, newDuration));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getChannel() {
		return channel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setChannel(String newChannel) {
		String oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__CHANNEL, oldChannel, channel));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPort getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (OutputPort)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.DELIVERABLE_FLOW__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OutputPort basicGetProvider() {
		return provider;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetProvider(OutputPort newProvider, NotificationChain msgs) {
		OutputPort oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__PROVIDER, oldProvider, newProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setProvider(OutputPort newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, VDMLPackage.OUTPUT_PORT__OUTPUT, OutputPort.class, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, VDMLPackage.OUTPUT_PORT__OUTPUT, OutputPort.class, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__PROVIDER, newProvider, newProvider));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone getMilestone() {
		if (milestone != null && milestone.eIsProxy()) {
			InternalEObject oldMilestone = (InternalEObject)milestone;
			milestone = (Milestone)eResolveProxy(oldMilestone);
			if (milestone != oldMilestone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.DELIVERABLE_FLOW__MILESTONE, oldMilestone, milestone));
			}
		}
		return milestone;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone basicGetMilestone() {
		return milestone;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMilestone(Milestone newMilestone) {
		Milestone oldMilestone = milestone;
		milestone = newMilestone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.DELIVERABLE_FLOW__MILESTONE, oldMilestone, milestone));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.DELIVERABLE_FLOW__RECIPIENT:
				if (recipient != null)
					msgs = ((InternalEObject)recipient).eInverseRemove(this, VDMLPackage.INPUT_PORT__INPUT, InputPort.class, msgs);
				return basicSetRecipient((InputPort)otherEnd, msgs);
			case VDMLPackage.DELIVERABLE_FLOW__DELIVERABLE:
				if (deliverable != null)
					msgs = ((InternalEObject)deliverable).eInverseRemove(this, VDMLPackage.BUSINESS_ITEM__FLOW, BusinessItem.class, msgs);
				return basicSetDeliverable((BusinessItem)otherEnd, msgs);
			case VDMLPackage.DELIVERABLE_FLOW__PROVIDER:
				if (provider != null)
					msgs = ((InternalEObject)provider).eInverseRemove(this, VDMLPackage.OUTPUT_PORT__OUTPUT, OutputPort.class, msgs);
				return basicSetProvider((OutputPort)otherEnd, msgs);
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
			case VDMLPackage.DELIVERABLE_FLOW__RECIPIENT:
				return basicSetRecipient(null, msgs);
			case VDMLPackage.DELIVERABLE_FLOW__DELIVERABLE:
				return basicSetDeliverable(null, msgs);
			case VDMLPackage.DELIVERABLE_FLOW__DURATION:
				return basicSetDuration(null, msgs);
			case VDMLPackage.DELIVERABLE_FLOW__PROVIDER:
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VDMLPackage.DELIVERABLE_FLOW__RECIPIENT:
				if (resolve) return getRecipient();
				return basicGetRecipient();
			case VDMLPackage.DELIVERABLE_FLOW__IS_TANGIBLE:
				return getIsTangible();
			case VDMLPackage.DELIVERABLE_FLOW__DELIVERABLE:
				if (resolve) return getDeliverable();
				return basicGetDeliverable();
			case VDMLPackage.DELIVERABLE_FLOW__DURATION:
				return getDuration();
			case VDMLPackage.DELIVERABLE_FLOW__CHANNEL:
				return getChannel();
			case VDMLPackage.DELIVERABLE_FLOW__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case VDMLPackage.DELIVERABLE_FLOW__MILESTONE:
				if (resolve) return getMilestone();
				return basicGetMilestone();
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
			case VDMLPackage.DELIVERABLE_FLOW__RECIPIENT:
				setRecipient((InputPort)newValue);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__IS_TANGIBLE:
				setIsTangible((Boolean)newValue);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__DELIVERABLE:
				setDeliverable((BusinessItem)newValue);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__DURATION:
				setDuration((MeasuredCharacteristic)newValue);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__CHANNEL:
				setChannel((String)newValue);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__PROVIDER:
				setProvider((OutputPort)newValue);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__MILESTONE:
				setMilestone((Milestone)newValue);
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
			case VDMLPackage.DELIVERABLE_FLOW__RECIPIENT:
				setRecipient((InputPort)null);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__IS_TANGIBLE:
				setIsTangible(IS_TANGIBLE_EDEFAULT);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__DELIVERABLE:
				setDeliverable((BusinessItem)null);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__DURATION:
				setDuration((MeasuredCharacteristic)null);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__PROVIDER:
				setProvider((OutputPort)null);
				return;
			case VDMLPackage.DELIVERABLE_FLOW__MILESTONE:
				setMilestone((Milestone)null);
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
			case VDMLPackage.DELIVERABLE_FLOW__RECIPIENT:
				return recipient != null;
			case VDMLPackage.DELIVERABLE_FLOW__IS_TANGIBLE:
				return IS_TANGIBLE_EDEFAULT == null ? isTangible != null : !IS_TANGIBLE_EDEFAULT.equals(isTangible);
			case VDMLPackage.DELIVERABLE_FLOW__DELIVERABLE:
				return deliverable != null;
			case VDMLPackage.DELIVERABLE_FLOW__DURATION:
				return duration != null;
			case VDMLPackage.DELIVERABLE_FLOW__CHANNEL:
				return CHANNEL_EDEFAULT == null ? channel != null : !CHANNEL_EDEFAULT.equals(channel);
			case VDMLPackage.DELIVERABLE_FLOW__PROVIDER:
				return provider != null;
			case VDMLPackage.DELIVERABLE_FLOW__MILESTONE:
				return milestone != null;
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
		result.append(" (isTangible: ");
		result.append(isTangible);
		result.append(", channel: ");
		result.append(channel);
		result.append(')');
		return result.toString();
	}

} //DeliverableFlowImpl
