/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemDefinition;
import org.pavanecce.vdml.metamodel.vdml.CapabilityDefinition;
import org.pavanecce.vdml.metamodel.vdml.CapabilityDependency;
import org.pavanecce.vdml.metamodel.vdml.PracticeDefinition;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDefinitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDefinitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDefinitionImpl#getCapabilityResourceDefinition <em>Capability Resource Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.CapabilityDefinitionImpl#getPracticeDefinition <em>Practice Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityDefinitionImpl extends CapabilityImpl implements CapabilityDefinition {
    /**
     * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
    protected EList<CapabilityDependency> output;

    /**
     * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected EList<CapabilityDependency> input;

    /**
     * The cached value of the '{@link #getCapabilityResourceDefinition() <em>Capability Resource Definition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityResourceDefinition()
     * @generated
     * @ordered
     */
    protected EList<BusinessItemDefinition> capabilityResourceDefinition;

    /**
     * The cached value of the '{@link #getPracticeDefinition() <em>Practice Definition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPracticeDefinition()
     * @generated
     * @ordered
     */
    protected EList<PracticeDefinition> practiceDefinition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CapabilityDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.CAPABILITY_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityDependency> getOutput() {
        if (output == null) {
            output = new EObjectWithInverseResolvingEList<CapabilityDependency>(CapabilityDependency.class, this, VdmlPackage.CAPABILITY_DEFINITION__OUTPUT, VdmlPackage.CAPABILITY_DEPENDENCY__SOURCE);
        }
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityDependency> getInput() {
        if (input == null) {
            input = new EObjectWithInverseResolvingEList<CapabilityDependency>(CapabilityDependency.class, this, VdmlPackage.CAPABILITY_DEFINITION__INPUT, VdmlPackage.CAPABILITY_DEPENDENCY__TARGET);
        }
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessItemDefinition> getCapabilityResourceDefinition() {
        if (capabilityResourceDefinition == null) {
            capabilityResourceDefinition = new EObjectWithInverseResolvingEList.ManyInverse<BusinessItemDefinition>(BusinessItemDefinition.class, this, VdmlPackage.CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION, VdmlPackage.BUSINESS_ITEM_DEFINITION__SUPPORTED_CAPABILITY);
        }
        return capabilityResourceDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeDefinition> getPracticeDefinition() {
        if (practiceDefinition == null) {
            practiceDefinition = new EObjectWithInverseResolvingEList.ManyInverse<PracticeDefinition>(PracticeDefinition.class, this, VdmlPackage.CAPABILITY_DEFINITION__PRACTICE_DEFINITION, VdmlPackage.PRACTICE_DEFINITION__CAPABILITY);
        }
        return practiceDefinition;
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
            case VdmlPackage.CAPABILITY_DEFINITION__OUTPUT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutput()).basicAdd(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_DEFINITION__INPUT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput()).basicAdd(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilityResourceDefinition()).basicAdd(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_DEFINITION__PRACTICE_DEFINITION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPracticeDefinition()).basicAdd(otherEnd, msgs);
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
            case VdmlPackage.CAPABILITY_DEFINITION__OUTPUT:
                return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_DEFINITION__INPUT:
                return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION:
                return ((InternalEList<?>)getCapabilityResourceDefinition()).basicRemove(otherEnd, msgs);
            case VdmlPackage.CAPABILITY_DEFINITION__PRACTICE_DEFINITION:
                return ((InternalEList<?>)getPracticeDefinition()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.CAPABILITY_DEFINITION__OUTPUT:
                return getOutput();
            case VdmlPackage.CAPABILITY_DEFINITION__INPUT:
                return getInput();
            case VdmlPackage.CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION:
                return getCapabilityResourceDefinition();
            case VdmlPackage.CAPABILITY_DEFINITION__PRACTICE_DEFINITION:
                return getPracticeDefinition();
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
            case VdmlPackage.CAPABILITY_DEFINITION__OUTPUT:
                getOutput().clear();
                getOutput().addAll((Collection<? extends CapabilityDependency>)newValue);
                return;
            case VdmlPackage.CAPABILITY_DEFINITION__INPUT:
                getInput().clear();
                getInput().addAll((Collection<? extends CapabilityDependency>)newValue);
                return;
            case VdmlPackage.CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION:
                getCapabilityResourceDefinition().clear();
                getCapabilityResourceDefinition().addAll((Collection<? extends BusinessItemDefinition>)newValue);
                return;
            case VdmlPackage.CAPABILITY_DEFINITION__PRACTICE_DEFINITION:
                getPracticeDefinition().clear();
                getPracticeDefinition().addAll((Collection<? extends PracticeDefinition>)newValue);
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
            case VdmlPackage.CAPABILITY_DEFINITION__OUTPUT:
                getOutput().clear();
                return;
            case VdmlPackage.CAPABILITY_DEFINITION__INPUT:
                getInput().clear();
                return;
            case VdmlPackage.CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION:
                getCapabilityResourceDefinition().clear();
                return;
            case VdmlPackage.CAPABILITY_DEFINITION__PRACTICE_DEFINITION:
                getPracticeDefinition().clear();
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
            case VdmlPackage.CAPABILITY_DEFINITION__OUTPUT:
                return output != null && !output.isEmpty();
            case VdmlPackage.CAPABILITY_DEFINITION__INPUT:
                return input != null && !input.isEmpty();
            case VdmlPackage.CAPABILITY_DEFINITION__CAPABILITY_RESOURCE_DEFINITION:
                return capabilityResourceDefinition != null && !capabilityResourceDefinition.isEmpty();
            case VdmlPackage.CAPABILITY_DEFINITION__PRACTICE_DEFINITION:
                return practiceDefinition != null && !practiceDefinition.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CapabilityDefinitionImpl
