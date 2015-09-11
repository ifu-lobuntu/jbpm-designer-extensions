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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.Assignment;
import org.omg.vdml.BusinessItemLibraryElement;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.Expression;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.InputPortImpl#getResourceUse <em>Resource Use</em>}</li>
 *   <li>{@link org.omg.vdml.impl.InputPortImpl#getDelegatedInput <em>Delegated Input</em>}</li>
 *   <li>{@link org.omg.vdml.impl.InputPortImpl#getInputDelegation <em>Input Delegation</em>}</li>
 *   <li>{@link org.omg.vdml.impl.InputPortImpl#getInputDefinition <em>Input Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.InputPortImpl#getCorrelationExpression <em>Correlation Expression</em>}</li>
 *   <li>{@link org.omg.vdml.impl.InputPortImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.omg.vdml.impl.InputPortImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPortImpl extends PortImpl implements InputPort {
    /**
	 * The cached value of the '{@link #getResourceUse() <em>Resource Use</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResourceUse()
	 * @generated
	 * @ordered
	 */
    protected EList<ResourceUse> resourceUse;

    /**
	 * The cached value of the '{@link #getDelegatedInput() <em>Delegated Input</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDelegatedInput()
	 * @generated
	 * @ordered
	 */
    protected EList<InputDelegation> delegatedInput;

    /**
	 * The cached value of the '{@link #getInputDelegation() <em>Input Delegation</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInputDelegation()
	 * @generated
	 * @ordered
	 */
    protected EList<InputDelegation> inputDelegation;

    /**
	 * The cached value of the '{@link #getInputDefinition() <em>Input Definition</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInputDefinition()
	 * @generated
	 * @ordered
	 */
    protected BusinessItemLibraryElement inputDefinition;

    /**
	 * The cached value of the '{@link #getCorrelationExpression() <em>Correlation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCorrelationExpression()
	 * @generated
	 * @ordered
	 */
    protected Expression correlationExpression;

    /**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
    protected EList<Assignment> assignment;

    /**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
    protected DeliverableFlow input;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected InputPortImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.INPUT_PORT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ResourceUse> getResourceUse() {
		if (resourceUse == null) {
			resourceUse = new EObjectWithInverseResolvingEList.ManyInverse<ResourceUse>(ResourceUse.class, this, VDMLPackage.INPUT_PORT__RESOURCE_USE, VDMLPackage.RESOURCE_USE__RESOURCE);
		}
		return resourceUse;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<InputDelegation> getDelegatedInput() {
		if (delegatedInput == null) {
			delegatedInput = new EObjectWithInverseResolvingEList<InputDelegation>(InputDelegation.class, this, VDMLPackage.INPUT_PORT__DELEGATED_INPUT, VDMLPackage.INPUT_DELEGATION__TARGET);
		}
		return delegatedInput;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<InputDelegation> getInputDelegation() {
		if (inputDelegation == null) {
			inputDelegation = new EObjectWithInverseResolvingEList<InputDelegation>(InputDelegation.class, this, VDMLPackage.INPUT_PORT__INPUT_DELEGATION, VDMLPackage.INPUT_DELEGATION__SOURCE);
		}
		return inputDelegation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessItemLibraryElement getInputDefinition() {
		if (inputDefinition != null && inputDefinition.eIsProxy()) {
			InternalEObject oldInputDefinition = (InternalEObject)inputDefinition;
			inputDefinition = (BusinessItemLibraryElement)eResolveProxy(oldInputDefinition);
			if (inputDefinition != oldInputDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.INPUT_PORT__INPUT_DEFINITION, oldInputDefinition, inputDefinition));
			}
		}
		return inputDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BusinessItemLibraryElement basicGetInputDefinition() {
		return inputDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInputDefinition(BusinessItemLibraryElement newInputDefinition) {
		BusinessItemLibraryElement oldInputDefinition = inputDefinition;
		inputDefinition = newInputDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.INPUT_PORT__INPUT_DEFINITION, oldInputDefinition, inputDefinition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Expression getCorrelationExpression() {
		return correlationExpression;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCorrelationExpression(Expression newCorrelationExpression, NotificationChain msgs) {
		Expression oldCorrelationExpression = correlationExpression;
		correlationExpression = newCorrelationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.INPUT_PORT__CORRELATION_EXPRESSION, oldCorrelationExpression, newCorrelationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCorrelationExpression(Expression newCorrelationExpression) {
		if (newCorrelationExpression != correlationExpression) {
			NotificationChain msgs = null;
			if (correlationExpression != null)
				msgs = ((InternalEObject)correlationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.INPUT_PORT__CORRELATION_EXPRESSION, null, msgs);
			if (newCorrelationExpression != null)
				msgs = ((InternalEObject)newCorrelationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VDMLPackage.INPUT_PORT__CORRELATION_EXPRESSION, null, msgs);
			msgs = basicSetCorrelationExpression(newCorrelationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.INPUT_PORT__CORRELATION_EXPRESSION, newCorrelationExpression, newCorrelationExpression));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Assignment> getAssignment() {
		if (assignment == null) {
			assignment = new EObjectWithInverseResolvingEList.ManyInverse<Assignment>(Assignment.class, this, VDMLPackage.INPUT_PORT__ASSIGNMENT, VDMLPackage.ASSIGNMENT__ROLE_RESOURCE);
		}
		return assignment;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DeliverableFlow getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = (DeliverableFlow)eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.INPUT_PORT__INPUT, oldInput, input));
			}
		}
		return input;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DeliverableFlow basicGetInput() {
		return input;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetInput(DeliverableFlow newInput, NotificationChain msgs) {
		DeliverableFlow oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.INPUT_PORT__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInput(DeliverableFlow newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, VDMLPackage.DELIVERABLE_FLOW__RECIPIENT, DeliverableFlow.class, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, VDMLPackage.DELIVERABLE_FLOW__RECIPIENT, DeliverableFlow.class, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.INPUT_PORT__INPUT, newInput, newInput));
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
			case VDMLPackage.INPUT_PORT__RESOURCE_USE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceUse()).basicAdd(otherEnd, msgs);
			case VDMLPackage.INPUT_PORT__DELEGATED_INPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegatedInput()).basicAdd(otherEnd, msgs);
			case VDMLPackage.INPUT_PORT__INPUT_DELEGATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputDelegation()).basicAdd(otherEnd, msgs);
			case VDMLPackage.INPUT_PORT__ASSIGNMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignment()).basicAdd(otherEnd, msgs);
			case VDMLPackage.INPUT_PORT__INPUT:
				if (input != null)
					msgs = ((InternalEObject)input).eInverseRemove(this, VDMLPackage.DELIVERABLE_FLOW__RECIPIENT, DeliverableFlow.class, msgs);
				return basicSetInput((DeliverableFlow)otherEnd, msgs);
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
			case VDMLPackage.INPUT_PORT__RESOURCE_USE:
				return ((InternalEList<?>)getResourceUse()).basicRemove(otherEnd, msgs);
			case VDMLPackage.INPUT_PORT__DELEGATED_INPUT:
				return ((InternalEList<?>)getDelegatedInput()).basicRemove(otherEnd, msgs);
			case VDMLPackage.INPUT_PORT__INPUT_DELEGATION:
				return ((InternalEList<?>)getInputDelegation()).basicRemove(otherEnd, msgs);
			case VDMLPackage.INPUT_PORT__CORRELATION_EXPRESSION:
				return basicSetCorrelationExpression(null, msgs);
			case VDMLPackage.INPUT_PORT__ASSIGNMENT:
				return ((InternalEList<?>)getAssignment()).basicRemove(otherEnd, msgs);
			case VDMLPackage.INPUT_PORT__INPUT:
				return basicSetInput(null, msgs);
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
			case VDMLPackage.INPUT_PORT__RESOURCE_USE:
				return getResourceUse();
			case VDMLPackage.INPUT_PORT__DELEGATED_INPUT:
				return getDelegatedInput();
			case VDMLPackage.INPUT_PORT__INPUT_DELEGATION:
				return getInputDelegation();
			case VDMLPackage.INPUT_PORT__INPUT_DEFINITION:
				if (resolve) return getInputDefinition();
				return basicGetInputDefinition();
			case VDMLPackage.INPUT_PORT__CORRELATION_EXPRESSION:
				return getCorrelationExpression();
			case VDMLPackage.INPUT_PORT__ASSIGNMENT:
				return getAssignment();
			case VDMLPackage.INPUT_PORT__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
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
			case VDMLPackage.INPUT_PORT__RESOURCE_USE:
				getResourceUse().clear();
				getResourceUse().addAll((Collection<? extends ResourceUse>)newValue);
				return;
			case VDMLPackage.INPUT_PORT__DELEGATED_INPUT:
				getDelegatedInput().clear();
				getDelegatedInput().addAll((Collection<? extends InputDelegation>)newValue);
				return;
			case VDMLPackage.INPUT_PORT__INPUT_DELEGATION:
				getInputDelegation().clear();
				getInputDelegation().addAll((Collection<? extends InputDelegation>)newValue);
				return;
			case VDMLPackage.INPUT_PORT__INPUT_DEFINITION:
				setInputDefinition((BusinessItemLibraryElement)newValue);
				return;
			case VDMLPackage.INPUT_PORT__CORRELATION_EXPRESSION:
				setCorrelationExpression((Expression)newValue);
				return;
			case VDMLPackage.INPUT_PORT__ASSIGNMENT:
				getAssignment().clear();
				getAssignment().addAll((Collection<? extends Assignment>)newValue);
				return;
			case VDMLPackage.INPUT_PORT__INPUT:
				setInput((DeliverableFlow)newValue);
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
			case VDMLPackage.INPUT_PORT__RESOURCE_USE:
				getResourceUse().clear();
				return;
			case VDMLPackage.INPUT_PORT__DELEGATED_INPUT:
				getDelegatedInput().clear();
				return;
			case VDMLPackage.INPUT_PORT__INPUT_DELEGATION:
				getInputDelegation().clear();
				return;
			case VDMLPackage.INPUT_PORT__INPUT_DEFINITION:
				setInputDefinition((BusinessItemLibraryElement)null);
				return;
			case VDMLPackage.INPUT_PORT__CORRELATION_EXPRESSION:
				setCorrelationExpression((Expression)null);
				return;
			case VDMLPackage.INPUT_PORT__ASSIGNMENT:
				getAssignment().clear();
				return;
			case VDMLPackage.INPUT_PORT__INPUT:
				setInput((DeliverableFlow)null);
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
			case VDMLPackage.INPUT_PORT__RESOURCE_USE:
				return resourceUse != null && !resourceUse.isEmpty();
			case VDMLPackage.INPUT_PORT__DELEGATED_INPUT:
				return delegatedInput != null && !delegatedInput.isEmpty();
			case VDMLPackage.INPUT_PORT__INPUT_DELEGATION:
				return inputDelegation != null && !inputDelegation.isEmpty();
			case VDMLPackage.INPUT_PORT__INPUT_DEFINITION:
				return inputDefinition != null;
			case VDMLPackage.INPUT_PORT__CORRELATION_EXPRESSION:
				return correlationExpression != null;
			case VDMLPackage.INPUT_PORT__ASSIGNMENT:
				return assignment != null && !assignment.isEmpty();
			case VDMLPackage.INPUT_PORT__INPUT:
				return input != null;
		}
		return super.eIsSet(featureID);
	}

} //InputPortImpl
