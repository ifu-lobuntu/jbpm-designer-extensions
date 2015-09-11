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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.vdml.Annotation;
import org.omg.vdml.Attribute;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.impl.VdmlElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.vdml.impl.VdmlElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omg.vdml.impl.VdmlElementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.omg.vdml.impl.VdmlElementImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.omg.vdml.impl.VdmlElementImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.vdml.impl.VdmlElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.omg.vdml.impl.VdmlElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VdmlElementImpl extends MinimalEObjectImpl.Container implements VdmlElement {
    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
    protected EList<Attribute> attribute;

    /**
	 * The default value of the '{@link #getRepresents() <em>Represents</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
    protected static final String REPRESENTS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
    protected String represents = REPRESENTS_EDEFAULT;

    /**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
    protected EList<Annotation> annotation;

    /**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected static final String ID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected String id = ID_EDEFAULT;

    /**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
    protected static final String QUALIFIED_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
    protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected VdmlElementImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VDMLPackage.Literals.VDML_ELEMENT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VDML_ELEMENT__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getDescription() {
		return description;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VDML_ELEMENT__DESCRIPTION, oldDescription, description));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, VDMLPackage.VDML_ELEMENT__ATTRIBUTE);
		}
		return attribute;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getRepresents() {
		return represents;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRepresents(String newRepresents) {
		String oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VDML_ELEMENT__REPRESENTS, oldRepresents, represents));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, VDMLPackage.VDML_ELEMENT__ANNOTATION);
		}
		return annotation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getId() {
		return id;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VDML_ELEMENT__ID, oldId, id));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getQualifiedName() {
        StringBuilder sb = new StringBuilder();
        appendQualifiedName(sb,getQualifiedNameDepth());
        return sb.toString();
    }
    protected int getQualifiedNameDepth(){
        return 2;
    }

    private void appendQualifiedName(StringBuilder sb, int level) {
        if(level>0 && eContainer() instanceof VdmlElementImpl && !(eContainer() instanceof ValueDeliveryModel)){
            ((VdmlElementImpl) eContainer()).appendQualifiedName(sb, level-1);
            sb.append("::");
        }
        sb.append(getName());
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setQualifiedName(String newQualifiedName) {
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VDMLPackage.VDML_ELEMENT__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VDMLPackage.VDML_ELEMENT__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case VDMLPackage.VDML_ELEMENT__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case VDMLPackage.VDML_ELEMENT__NAME:
				return getName();
			case VDMLPackage.VDML_ELEMENT__DESCRIPTION:
				return getDescription();
			case VDMLPackage.VDML_ELEMENT__ATTRIBUTE:
				return getAttribute();
			case VDMLPackage.VDML_ELEMENT__REPRESENTS:
				return getRepresents();
			case VDMLPackage.VDML_ELEMENT__ANNOTATION:
				return getAnnotation();
			case VDMLPackage.VDML_ELEMENT__ID:
				return getId();
			case VDMLPackage.VDML_ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
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
			case VDMLPackage.VDML_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case VDMLPackage.VDML_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case VDMLPackage.VDML_ELEMENT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case VDMLPackage.VDML_ELEMENT__REPRESENTS:
				setRepresents((String)newValue);
				return;
			case VDMLPackage.VDML_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case VDMLPackage.VDML_ELEMENT__ID:
				setId((String)newValue);
				return;
			case VDMLPackage.VDML_ELEMENT__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
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
			case VDMLPackage.VDML_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VDMLPackage.VDML_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case VDMLPackage.VDML_ELEMENT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case VDMLPackage.VDML_ELEMENT__REPRESENTS:
				setRepresents(REPRESENTS_EDEFAULT);
				return;
			case VDMLPackage.VDML_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				return;
			case VDMLPackage.VDML_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case VDMLPackage.VDML_ELEMENT__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
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
			case VDMLPackage.VDML_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VDMLPackage.VDML_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case VDMLPackage.VDML_ELEMENT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case VDMLPackage.VDML_ELEMENT__REPRESENTS:
				return REPRESENTS_EDEFAULT == null ? represents != null : !REPRESENTS_EDEFAULT.equals(represents);
			case VDMLPackage.VDML_ELEMENT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case VDMLPackage.VDML_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VDMLPackage.VDML_ELEMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", represents: ");
		result.append(represents);
		result.append(", id: ");
		result.append(id);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(')');
		return result.toString();
	}

} //VdmlElementImpl
