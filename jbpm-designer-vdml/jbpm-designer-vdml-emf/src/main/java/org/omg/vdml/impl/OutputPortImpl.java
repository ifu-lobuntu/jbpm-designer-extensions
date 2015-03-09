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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.BusinessItemLibraryElement;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueAdd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.vdml.impl.OutputPortImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.vdml.impl.OutputPortImpl#getOutputDefinition <em>Output Definition</em>}</li>
 *   <li>{@link org.omg.vdml.impl.OutputPortImpl#getValueAdd <em>Value Add</em>}</li>
 *   <li>{@link org.omg.vdml.impl.OutputPortImpl#getDelegatedOutput <em>Delegated Output</em>}</li>
 *   <li>{@link org.omg.vdml.impl.OutputPortImpl#getOutputDelegation <em>Output Delegation</em>}</li>
 *   <li>{@link org.omg.vdml.impl.OutputPortImpl#getResourceUse <em>Resource Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPortImpl extends PortImpl implements OutputPort {
    /**
     * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
    protected DeliverableFlow output;

    /**
     * The cached value of the '{@link #getOutputDefinition() <em>Output Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputDefinition()
     * @generated
     * @ordered
     */
    protected BusinessItemLibraryElement outputDefinition;

    /**
     * The cached value of the '{@link #getValueAdd() <em>Value Add</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueAdd()
     * @generated
     * @ordered
     */
    protected EList<ValueAdd> valueAdd;

    /**
     * The cached value of the '{@link #getDelegatedOutput() <em>Delegated Output</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelegatedOutput()
     * @generated
     * @ordered
     */
    protected EList<OutputDelegation> delegatedOutput;

    /**
     * The cached value of the '{@link #getOutputDelegation() <em>Output Delegation</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputDelegation()
     * @generated
     * @ordered
     */
    protected EList<OutputDelegation> outputDelegation;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutputPortImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VDMLPackage.Literals.OUTPUT_PORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeliverableFlow getOutput() {
        if (output != null && output.eIsProxy()) {
            InternalEObject oldOutput = (InternalEObject)output;
            output = (DeliverableFlow)eResolveProxy(oldOutput);
            if (output != oldOutput) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.OUTPUT_PORT__OUTPUT, oldOutput, output));
            }
        }
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeliverableFlow basicGetOutput() {
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutput(DeliverableFlow newOutput, NotificationChain msgs) {
        DeliverableFlow oldOutput = output;
        output = newOutput;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VDMLPackage.OUTPUT_PORT__OUTPUT, oldOutput, newOutput);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutput(DeliverableFlow newOutput) {
        if (newOutput != output) {
            NotificationChain msgs = null;
            if (output != null)
                msgs = ((InternalEObject)output).eInverseRemove(this, VDMLPackage.DELIVERABLE_FLOW__PROVIDER, DeliverableFlow.class, msgs);
            if (newOutput != null)
                msgs = ((InternalEObject)newOutput).eInverseAdd(this, VDMLPackage.DELIVERABLE_FLOW__PROVIDER, DeliverableFlow.class, msgs);
            msgs = basicSetOutput(newOutput, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.OUTPUT_PORT__OUTPUT, newOutput, newOutput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessItemLibraryElement getOutputDefinition() {
        if (outputDefinition != null && outputDefinition.eIsProxy()) {
            InternalEObject oldOutputDefinition = (InternalEObject)outputDefinition;
            outputDefinition = (BusinessItemLibraryElement)eResolveProxy(oldOutputDefinition);
            if (outputDefinition != oldOutputDefinition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VDMLPackage.OUTPUT_PORT__OUTPUT_DEFINITION, oldOutputDefinition, outputDefinition));
            }
        }
        return outputDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessItemLibraryElement basicGetOutputDefinition() {
        return outputDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputDefinition(BusinessItemLibraryElement newOutputDefinition) {
        BusinessItemLibraryElement oldOutputDefinition = outputDefinition;
        outputDefinition = newOutputDefinition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.OUTPUT_PORT__OUTPUT_DEFINITION, oldOutputDefinition, outputDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueAdd> getValueAdd() {
        if (valueAdd == null) {
            valueAdd = new EObjectContainmentEList<ValueAdd>(ValueAdd.class, this, VDMLPackage.OUTPUT_PORT__VALUE_ADD);
        }
        return valueAdd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OutputDelegation> getDelegatedOutput() {
        if (delegatedOutput == null) {
            delegatedOutput = new EObjectWithInverseResolvingEList<OutputDelegation>(OutputDelegation.class, this, VDMLPackage.OUTPUT_PORT__DELEGATED_OUTPUT, VDMLPackage.OUTPUT_DELEGATION__TARGET);
        }
        return delegatedOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OutputDelegation> getOutputDelegation() {
        if (outputDelegation == null) {
            outputDelegation = new EObjectWithInverseResolvingEList<OutputDelegation>(OutputDelegation.class, this, VDMLPackage.OUTPUT_PORT__OUTPUT_DELEGATION, VDMLPackage.OUTPUT_DELEGATION__SOURCE);
        }
        return outputDelegation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ResourceUse> getResourceUse() {
        if (resourceUse == null) {
            resourceUse = new EObjectWithInverseResolvingEList<ResourceUse>(ResourceUse.class, this, VDMLPackage.OUTPUT_PORT__RESOURCE_USE, VDMLPackage.RESOURCE_USE__DELIVERABLE);
        }
        return resourceUse;
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
            case VDMLPackage.OUTPUT_PORT__OUTPUT:
                if (output != null)
                    msgs = ((InternalEObject)output).eInverseRemove(this, VDMLPackage.DELIVERABLE_FLOW__PROVIDER, DeliverableFlow.class, msgs);
                return basicSetOutput((DeliverableFlow)otherEnd, msgs);
            case VDMLPackage.OUTPUT_PORT__DELEGATED_OUTPUT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegatedOutput()).basicAdd(otherEnd, msgs);
            case VDMLPackage.OUTPUT_PORT__OUTPUT_DELEGATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputDelegation()).basicAdd(otherEnd, msgs);
            case VDMLPackage.OUTPUT_PORT__RESOURCE_USE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceUse()).basicAdd(otherEnd, msgs);
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
            case VDMLPackage.OUTPUT_PORT__OUTPUT:
                return basicSetOutput(null, msgs);
            case VDMLPackage.OUTPUT_PORT__VALUE_ADD:
                return ((InternalEList<?>)getValueAdd()).basicRemove(otherEnd, msgs);
            case VDMLPackage.OUTPUT_PORT__DELEGATED_OUTPUT:
                return ((InternalEList<?>)getDelegatedOutput()).basicRemove(otherEnd, msgs);
            case VDMLPackage.OUTPUT_PORT__OUTPUT_DELEGATION:
                return ((InternalEList<?>)getOutputDelegation()).basicRemove(otherEnd, msgs);
            case VDMLPackage.OUTPUT_PORT__RESOURCE_USE:
                return ((InternalEList<?>)getResourceUse()).basicRemove(otherEnd, msgs);
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
            case VDMLPackage.OUTPUT_PORT__OUTPUT:
                if (resolve) return getOutput();
                return basicGetOutput();
            case VDMLPackage.OUTPUT_PORT__OUTPUT_DEFINITION:
                if (resolve) return getOutputDefinition();
                return basicGetOutputDefinition();
            case VDMLPackage.OUTPUT_PORT__VALUE_ADD:
                return getValueAdd();
            case VDMLPackage.OUTPUT_PORT__DELEGATED_OUTPUT:
                return getDelegatedOutput();
            case VDMLPackage.OUTPUT_PORT__OUTPUT_DELEGATION:
                return getOutputDelegation();
            case VDMLPackage.OUTPUT_PORT__RESOURCE_USE:
                return getResourceUse();
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
            case VDMLPackage.OUTPUT_PORT__OUTPUT:
                setOutput((DeliverableFlow)newValue);
                return;
            case VDMLPackage.OUTPUT_PORT__OUTPUT_DEFINITION:
                setOutputDefinition((BusinessItemLibraryElement)newValue);
                return;
            case VDMLPackage.OUTPUT_PORT__VALUE_ADD:
                getValueAdd().clear();
                getValueAdd().addAll((Collection<? extends ValueAdd>)newValue);
                return;
            case VDMLPackage.OUTPUT_PORT__DELEGATED_OUTPUT:
                getDelegatedOutput().clear();
                getDelegatedOutput().addAll((Collection<? extends OutputDelegation>)newValue);
                return;
            case VDMLPackage.OUTPUT_PORT__OUTPUT_DELEGATION:
                getOutputDelegation().clear();
                getOutputDelegation().addAll((Collection<? extends OutputDelegation>)newValue);
                return;
            case VDMLPackage.OUTPUT_PORT__RESOURCE_USE:
                getResourceUse().clear();
                getResourceUse().addAll((Collection<? extends ResourceUse>)newValue);
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
            case VDMLPackage.OUTPUT_PORT__OUTPUT:
                setOutput((DeliverableFlow)null);
                return;
            case VDMLPackage.OUTPUT_PORT__OUTPUT_DEFINITION:
                setOutputDefinition((BusinessItemLibraryElement)null);
                return;
            case VDMLPackage.OUTPUT_PORT__VALUE_ADD:
                getValueAdd().clear();
                return;
            case VDMLPackage.OUTPUT_PORT__DELEGATED_OUTPUT:
                getDelegatedOutput().clear();
                return;
            case VDMLPackage.OUTPUT_PORT__OUTPUT_DELEGATION:
                getOutputDelegation().clear();
                return;
            case VDMLPackage.OUTPUT_PORT__RESOURCE_USE:
                getResourceUse().clear();
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
            case VDMLPackage.OUTPUT_PORT__OUTPUT:
                return output != null;
            case VDMLPackage.OUTPUT_PORT__OUTPUT_DEFINITION:
                return outputDefinition != null;
            case VDMLPackage.OUTPUT_PORT__VALUE_ADD:
                return valueAdd != null && !valueAdd.isEmpty();
            case VDMLPackage.OUTPUT_PORT__DELEGATED_OUTPUT:
                return delegatedOutput != null && !delegatedOutput.isEmpty();
            case VDMLPackage.OUTPUT_PORT__OUTPUT_DELEGATION:
                return outputDelegation != null && !outputDelegation.isEmpty();
            case VDMLPackage.OUTPUT_PORT__RESOURCE_USE:
                return resourceUse != null && !resourceUse.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //OutputPortImpl
