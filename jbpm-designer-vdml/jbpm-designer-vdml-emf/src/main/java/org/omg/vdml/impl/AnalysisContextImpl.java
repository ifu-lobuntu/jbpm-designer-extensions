/**
 */
package org.omg.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.smm.Observation;
import org.omg.vdml.AnalysisContext;
import org.omg.vdml.Assignment;
import org.omg.vdml.DelegationContext;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.AnalysisContextImpl#getDelegationtContext <em>Delegationt Context</em>}</li>
 *   <li>{@link org.omg.vdml.impl.AnalysisContextImpl#getContextObservation <em>Context Observation</em>}</li>
 *   <li>{@link org.omg.vdml.impl.AnalysisContextImpl#getContextStore <em>Context Store</em>}</li>
 *   <li>{@link org.omg.vdml.impl.AnalysisContextImpl#getContextBasedAssignment <em>Context Based Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnalysisContextImpl extends VdmlElementImpl implements AnalysisContext {
    /**
	 * The cached value of the '{@link #getDelegationtContext() <em>Delegationt Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDelegationtContext()
	 * @generated
	 * @ordered
	 */
    protected EList<DelegationContext> delegationtContext;

    /**
	 * The cached value of the '{@link #getContextObservation() <em>Context Observation</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContextObservation()
	 * @generated
	 * @ordered
	 */
    protected EList<Observation> contextObservation;

    /**
	 * The cached value of the '{@link #getContextStore() <em>Context Store</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContextStore()
	 * @generated
	 * @ordered
	 */
    protected EList<Store> contextStore;

    /**
	 * The cached value of the '{@link #getContextBasedAssignment() <em>Context Based Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContextBasedAssignment()
	 * @generated
	 * @ordered
	 */
    protected EList<Assignment> contextBasedAssignment;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected AnalysisContextImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.ANALYSIS_CONTEXT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DelegationContext> getDelegationtContext() {
		if (delegationtContext == null) {
			delegationtContext = new EObjectContainmentWithInverseEList<DelegationContext>(DelegationContext.class, this, VDMLPackage.ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT, VDMLPackage.DELEGATION_CONTEXT__PARENT_CONTEXT);
		}
		return delegationtContext;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Observation> getContextObservation() {
		if (contextObservation == null) {
			contextObservation = new EObjectResolvingEList<Observation>(Observation.class, this, VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_OBSERVATION);
		}
		return contextObservation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Store> getContextStore() {
		if (contextStore == null) {
			contextStore = new EObjectWithInverseResolvingEList.ManyInverse<Store>(Store.class, this, VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_STORE, VDMLPackage.STORE__STORE_CONTEXT);
		}
		return contextStore;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Assignment> getContextBasedAssignment() {
		if (contextBasedAssignment == null) {
			contextBasedAssignment = new EObjectContainmentEList<Assignment>(Assignment.class, this, VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_BASED_ASSIGNMENT);
		}
		return contextBasedAssignment;
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
			case VDMLPackage.ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegationtContext()).basicAdd(otherEnd, msgs);
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_STORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextStore()).basicAdd(otherEnd, msgs);
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
			case VDMLPackage.ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT:
				return ((InternalEList<?>)getDelegationtContext()).basicRemove(otherEnd, msgs);
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_STORE:
				return ((InternalEList<?>)getContextStore()).basicRemove(otherEnd, msgs);
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_BASED_ASSIGNMENT:
				return ((InternalEList<?>)getContextBasedAssignment()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT:
				return getDelegationtContext();
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_OBSERVATION:
				return getContextObservation();
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_STORE:
				return getContextStore();
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_BASED_ASSIGNMENT:
				return getContextBasedAssignment();
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
			case VDMLPackage.ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT:
				getDelegationtContext().clear();
				getDelegationtContext().addAll((Collection<? extends DelegationContext>)newValue);
				return;
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_OBSERVATION:
				getContextObservation().clear();
				getContextObservation().addAll((Collection<? extends Observation>)newValue);
				return;
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_STORE:
				getContextStore().clear();
				getContextStore().addAll((Collection<? extends Store>)newValue);
				return;
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_BASED_ASSIGNMENT:
				getContextBasedAssignment().clear();
				getContextBasedAssignment().addAll((Collection<? extends Assignment>)newValue);
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
			case VDMLPackage.ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT:
				getDelegationtContext().clear();
				return;
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_OBSERVATION:
				getContextObservation().clear();
				return;
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_STORE:
				getContextStore().clear();
				return;
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_BASED_ASSIGNMENT:
				getContextBasedAssignment().clear();
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
			case VDMLPackage.ANALYSIS_CONTEXT__DELEGATIONT_CONTEXT:
				return delegationtContext != null && !delegationtContext.isEmpty();
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_OBSERVATION:
				return contextObservation != null && !contextObservation.isEmpty();
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_STORE:
				return contextStore != null && !contextStore.isEmpty();
			case VDMLPackage.ANALYSIS_CONTEXT__CONTEXT_BASED_ASSIGNMENT:
				return contextBasedAssignment != null && !contextBasedAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnalysisContextImpl
