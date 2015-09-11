/**
 */
package org.omg.smm.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.omg.smm.Operation;
import org.omg.smm.SMMPackage;
import org.omg.smm.Scope;
import org.omg.smm.util.SMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.impl.ScopeImpl#getBreakCondition <em>Break Condition</em>}</li>
 *   <li>{@link org.omg.smm.impl.ScopeImpl#getRecognizer <em>Recognizer</em>}</li>
 *   <li>{@link org.omg.smm.impl.ScopeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.omg.smm.impl.ScopeImpl#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeImpl extends AbstractMeasureElementImpl implements Scope {
    /**
	 * The cached value of the '{@link #getBreakCondition() <em>Break Condition</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBreakCondition()
	 * @generated
	 * @ordered
	 */
    protected Operation breakCondition;

    /**
	 * The cached value of the '{@link #getRecognizer() <em>Recognizer</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRecognizer()
	 * @generated
	 * @ordered
	 */
    protected Operation recognizer;

    /**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
    protected static final String CLASS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
    protected String class_ = CLASS_EDEFAULT;

    /**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
    protected static final String STEREOTYPE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
    protected String stereotype = STEREOTYPE_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ScopeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SMMPackage.Literals.SCOPE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getBreakCondition() {
		if (breakCondition != null && breakCondition.eIsProxy()) {
			InternalEObject oldBreakCondition = (InternalEObject)breakCondition;
			breakCondition = (Operation)eResolveProxy(oldBreakCondition);
			if (breakCondition != oldBreakCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.SCOPE__BREAK_CONDITION, oldBreakCondition, breakCondition));
			}
		}
		return breakCondition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation basicGetBreakCondition() {
		return breakCondition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBreakCondition(Operation newBreakCondition) {
		Operation oldBreakCondition = breakCondition;
		breakCondition = newBreakCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.SCOPE__BREAK_CONDITION, oldBreakCondition, breakCondition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation getRecognizer() {
		if (recognizer != null && recognizer.eIsProxy()) {
			InternalEObject oldRecognizer = (InternalEObject)recognizer;
			recognizer = (Operation)eResolveProxy(oldRecognizer);
			if (recognizer != oldRecognizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.SCOPE__RECOGNIZER, oldRecognizer, recognizer));
			}
		}
		return recognizer;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation basicGetRecognizer() {
		return recognizer;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRecognizer(Operation newRecognizer) {
		Operation oldRecognizer = recognizer;
		recognizer = newRecognizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.SCOPE__RECOGNIZER, oldRecognizer, recognizer));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getClass_() {
		return class_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.SCOPE__CLASS, oldClass, class_));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getStereotype() {
		return stereotype;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStereotype(String newStereotype) {
		String oldStereotype = stereotype;
		stereotype = newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.SCOPE__STEREOTYPE, oldStereotype, stereotype));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean IsSpecified(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SMMValidator.DIAGNOSTIC_SOURCE,
						 SMMValidator.SCOPE__IS_SPECIFIED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "IsSpecified", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SMMPackage.SCOPE__BREAK_CONDITION:
				if (resolve) return getBreakCondition();
				return basicGetBreakCondition();
			case SMMPackage.SCOPE__RECOGNIZER:
				if (resolve) return getRecognizer();
				return basicGetRecognizer();
			case SMMPackage.SCOPE__CLASS:
				return getClass_();
			case SMMPackage.SCOPE__STEREOTYPE:
				return getStereotype();
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
			case SMMPackage.SCOPE__BREAK_CONDITION:
				setBreakCondition((Operation)newValue);
				return;
			case SMMPackage.SCOPE__RECOGNIZER:
				setRecognizer((Operation)newValue);
				return;
			case SMMPackage.SCOPE__CLASS:
				setClass((String)newValue);
				return;
			case SMMPackage.SCOPE__STEREOTYPE:
				setStereotype((String)newValue);
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
			case SMMPackage.SCOPE__BREAK_CONDITION:
				setBreakCondition((Operation)null);
				return;
			case SMMPackage.SCOPE__RECOGNIZER:
				setRecognizer((Operation)null);
				return;
			case SMMPackage.SCOPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case SMMPackage.SCOPE__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
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
			case SMMPackage.SCOPE__BREAK_CONDITION:
				return breakCondition != null;
			case SMMPackage.SCOPE__RECOGNIZER:
				return recognizer != null;
			case SMMPackage.SCOPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case SMMPackage.SCOPE__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SMMPackage.SCOPE___IS_SPECIFIED__DIAGNOSTICCHAIN_MAP:
				return IsSpecified((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (class: ");
		result.append(class_);
		result.append(", stereotype: ");
		result.append(stereotype);
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
