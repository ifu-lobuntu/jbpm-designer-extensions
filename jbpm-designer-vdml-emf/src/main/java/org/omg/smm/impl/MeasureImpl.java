/**
 */
package org.omg.smm.impl;

import java.lang.reflect.InvocationTargetException;
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
import org.omg.smm.Characteristic;
import org.omg.smm.Measure;
import org.omg.smm.MeasureCategory;
import org.omg.smm.MeasureRelationship;
import org.omg.smm.Operation;
import org.omg.smm.SMMPackage;
import org.omg.smm.ScaleOfMeasurement;
import org.omg.smm.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getMeasureLabelFormat <em>Measure Label Format</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getMeasurementLabelFormat <em>Measurement Label Format</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getDefaultQuery <em>Default Query</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getMeasureRelationships <em>Measure Relationships</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getTrait <em>Trait</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.omg.smm.impl.MeasureImpl#getCustomScale <em>Custom Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasureImpl extends AbstractMeasureElementImpl implements Measure {
    /**
     * The default value of the '{@link #getMeasureLabelFormat() <em>Measure Label Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasureLabelFormat()
     * @generated
     * @ordered
     */
    protected static final String MEASURE_LABEL_FORMAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMeasureLabelFormat() <em>Measure Label Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasureLabelFormat()
     * @generated
     * @ordered
     */
    protected String measureLabelFormat = MEASURE_LABEL_FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #getMeasurementLabelFormat() <em>Measurement Label Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementLabelFormat()
     * @generated
     * @ordered
     */
    protected static final String MEASUREMENT_LABEL_FORMAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMeasurementLabelFormat() <em>Measurement Label Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementLabelFormat()
     * @generated
     * @ordered
     */
    protected String measurementLabelFormat = MEASUREMENT_LABEL_FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisible()
     * @generated
     * @ordered
     */
    protected static final Boolean VISIBLE_EDEFAULT = Boolean.TRUE;

    /**
     * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisible()
     * @generated
     * @ordered
     */
    protected Boolean visible = VISIBLE_EDEFAULT;

    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected String source = SOURCE_EDEFAULT;

    /**
     * The cached value of the '{@link #getDefaultQuery() <em>Default Query</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultQuery()
     * @generated
     * @ordered
     */
    protected Operation defaultQuery;

    /**
     * The cached value of the '{@link #getMeasureRelationships() <em>Measure Relationships</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasureRelationships()
     * @generated
     * @ordered
     */
    protected EList<MeasureRelationship> measureRelationships;

    /**
     * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected EList<MeasureCategory> category;

    /**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected Scope scope;

    /**
     * The cached value of the '{@link #getTrait() <em>Trait</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrait()
     * @generated
     * @ordered
     */
    protected Characteristic trait;

    /**
     * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected static final ScaleOfMeasurement SCALE_EDEFAULT = ScaleOfMeasurement.NOMINAL;

    /**
     * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected ScaleOfMeasurement scale = SCALE_EDEFAULT;

    /**
     * The default value of the '{@link #getCustomScale() <em>Custom Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomScale()
     * @generated
     * @ordered
     */
    protected static final String CUSTOM_SCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomScale() <em>Custom Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomScale()
     * @generated
     * @ordered
     */
    protected String customScale = CUSTOM_SCALE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SMMPackage.Literals.MEASURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMeasureLabelFormat() {
        return measureLabelFormat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMeasureLabelFormat(String newMeasureLabelFormat) {
        String oldMeasureLabelFormat = measureLabelFormat;
        measureLabelFormat = newMeasureLabelFormat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASURE__MEASURE_LABEL_FORMAT, oldMeasureLabelFormat, measureLabelFormat));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMeasurementLabelFormat() {
        return measurementLabelFormat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMeasurementLabelFormat(String newMeasurementLabelFormat) {
        String oldMeasurementLabelFormat = measurementLabelFormat;
        measurementLabelFormat = newMeasurementLabelFormat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASURE__MEASUREMENT_LABEL_FORMAT, oldMeasurementLabelFormat, measurementLabelFormat));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getVisible() {
        return visible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisible(Boolean newVisible) {
        Boolean oldVisible = visible;
        visible = newVisible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASURE__VISIBLE, oldVisible, visible));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(String newSource) {
        String oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASURE__SOURCE, oldSource, source));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getDefaultQuery() {
        if (defaultQuery != null && defaultQuery.eIsProxy()) {
            InternalEObject oldDefaultQuery = (InternalEObject)defaultQuery;
            defaultQuery = (Operation)eResolveProxy(oldDefaultQuery);
            if (defaultQuery != oldDefaultQuery) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.MEASURE__DEFAULT_QUERY, oldDefaultQuery, defaultQuery));
            }
        }
        return defaultQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation basicGetDefaultQuery() {
        return defaultQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultQuery(Operation newDefaultQuery) {
        Operation oldDefaultQuery = defaultQuery;
        defaultQuery = newDefaultQuery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASURE__DEFAULT_QUERY, oldDefaultQuery, defaultQuery));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MeasureRelationship> getMeasureRelationships() {
        if (measureRelationships == null) {
            measureRelationships = new EObjectContainmentEList<MeasureRelationship>(MeasureRelationship.class, this, SMMPackage.MEASURE__MEASURE_RELATIONSHIPS);
        }
        return measureRelationships;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MeasureCategory> getCategory() {
        if (category == null) {
            category = new EObjectWithInverseResolvingEList.ManyInverse<MeasureCategory>(MeasureCategory.class, this, SMMPackage.MEASURE__CATEGORY, SMMPackage.MEASURE_CATEGORY__CATEGORY_MEASURE);
        }
        return category;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope getScope() {
        if (scope != null && scope.eIsProxy()) {
            InternalEObject oldScope = (InternalEObject)scope;
            scope = (Scope)eResolveProxy(oldScope);
            if (scope != oldScope) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.MEASURE__SCOPE, oldScope, scope));
            }
        }
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope basicGetScope() {
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScope(Scope newScope) {
        Scope oldScope = scope;
        scope = newScope;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASURE__SCOPE, oldScope, scope));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Characteristic getTrait() {
        if (trait != null && trait.eIsProxy()) {
            InternalEObject oldTrait = (InternalEObject)trait;
            trait = (Characteristic)eResolveProxy(oldTrait);
            if (trait != oldTrait) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMMPackage.MEASURE__TRAIT, oldTrait, trait));
            }
        }
        return trait;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Characteristic basicGetTrait() {
        return trait;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTrait(Characteristic newTrait, NotificationChain msgs) {
        Characteristic oldTrait = trait;
        trait = newTrait;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMMPackage.MEASURE__TRAIT, oldTrait, newTrait);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrait(Characteristic newTrait) {
        if (newTrait != trait) {
            NotificationChain msgs = null;
            if (trait != null)
                msgs = ((InternalEObject)trait).eInverseRemove(this, SMMPackage.CHARACTERISTIC__MEASURE, Characteristic.class, msgs);
            if (newTrait != null)
                msgs = ((InternalEObject)newTrait).eInverseAdd(this, SMMPackage.CHARACTERISTIC__MEASURE, Characteristic.class, msgs);
            msgs = basicSetTrait(newTrait, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASURE__TRAIT, newTrait, newTrait));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScaleOfMeasurement getScale() {
        return scale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScale(ScaleOfMeasurement newScale) {
        ScaleOfMeasurement oldScale = scale;
        scale = newScale == null ? SCALE_EDEFAULT : newScale;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASURE__SCALE, oldScale, scale));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCustomScale() {
        return customScale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCustomScale(String newCustomScale) {
        String oldCustomScale = customScale;
        customScale = newCustomScale;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SMMPackage.MEASURE__CUSTOM_SCALE, oldCustomScale, customScale));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void getAllArguments() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void getArguments() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            case SMMPackage.MEASURE__CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
            case SMMPackage.MEASURE__TRAIT:
                if (trait != null)
                    msgs = ((InternalEObject)trait).eInverseRemove(this, SMMPackage.CHARACTERISTIC__MEASURE, Characteristic.class, msgs);
                return basicSetTrait((Characteristic)otherEnd, msgs);
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
            case SMMPackage.MEASURE__MEASURE_RELATIONSHIPS:
                return ((InternalEList<?>)getMeasureRelationships()).basicRemove(otherEnd, msgs);
            case SMMPackage.MEASURE__CATEGORY:
                return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
            case SMMPackage.MEASURE__TRAIT:
                return basicSetTrait(null, msgs);
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
            case SMMPackage.MEASURE__MEASURE_LABEL_FORMAT:
                return getMeasureLabelFormat();
            case SMMPackage.MEASURE__MEASUREMENT_LABEL_FORMAT:
                return getMeasurementLabelFormat();
            case SMMPackage.MEASURE__VISIBLE:
                return getVisible();
            case SMMPackage.MEASURE__SOURCE:
                return getSource();
            case SMMPackage.MEASURE__DEFAULT_QUERY:
                if (resolve) return getDefaultQuery();
                return basicGetDefaultQuery();
            case SMMPackage.MEASURE__MEASURE_RELATIONSHIPS:
                return getMeasureRelationships();
            case SMMPackage.MEASURE__CATEGORY:
                return getCategory();
            case SMMPackage.MEASURE__SCOPE:
                if (resolve) return getScope();
                return basicGetScope();
            case SMMPackage.MEASURE__TRAIT:
                if (resolve) return getTrait();
                return basicGetTrait();
            case SMMPackage.MEASURE__SCALE:
                return getScale();
            case SMMPackage.MEASURE__CUSTOM_SCALE:
                return getCustomScale();
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
            case SMMPackage.MEASURE__MEASURE_LABEL_FORMAT:
                setMeasureLabelFormat((String)newValue);
                return;
            case SMMPackage.MEASURE__MEASUREMENT_LABEL_FORMAT:
                setMeasurementLabelFormat((String)newValue);
                return;
            case SMMPackage.MEASURE__VISIBLE:
                setVisible((Boolean)newValue);
                return;
            case SMMPackage.MEASURE__SOURCE:
                setSource((String)newValue);
                return;
            case SMMPackage.MEASURE__DEFAULT_QUERY:
                setDefaultQuery((Operation)newValue);
                return;
            case SMMPackage.MEASURE__MEASURE_RELATIONSHIPS:
                getMeasureRelationships().clear();
                getMeasureRelationships().addAll((Collection<? extends MeasureRelationship>)newValue);
                return;
            case SMMPackage.MEASURE__CATEGORY:
                getCategory().clear();
                getCategory().addAll((Collection<? extends MeasureCategory>)newValue);
                return;
            case SMMPackage.MEASURE__SCOPE:
                setScope((Scope)newValue);
                return;
            case SMMPackage.MEASURE__TRAIT:
                setTrait((Characteristic)newValue);
                return;
            case SMMPackage.MEASURE__SCALE:
                setScale((ScaleOfMeasurement)newValue);
                return;
            case SMMPackage.MEASURE__CUSTOM_SCALE:
                setCustomScale((String)newValue);
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
            case SMMPackage.MEASURE__MEASURE_LABEL_FORMAT:
                setMeasureLabelFormat(MEASURE_LABEL_FORMAT_EDEFAULT);
                return;
            case SMMPackage.MEASURE__MEASUREMENT_LABEL_FORMAT:
                setMeasurementLabelFormat(MEASUREMENT_LABEL_FORMAT_EDEFAULT);
                return;
            case SMMPackage.MEASURE__VISIBLE:
                setVisible(VISIBLE_EDEFAULT);
                return;
            case SMMPackage.MEASURE__SOURCE:
                setSource(SOURCE_EDEFAULT);
                return;
            case SMMPackage.MEASURE__DEFAULT_QUERY:
                setDefaultQuery((Operation)null);
                return;
            case SMMPackage.MEASURE__MEASURE_RELATIONSHIPS:
                getMeasureRelationships().clear();
                return;
            case SMMPackage.MEASURE__CATEGORY:
                getCategory().clear();
                return;
            case SMMPackage.MEASURE__SCOPE:
                setScope((Scope)null);
                return;
            case SMMPackage.MEASURE__TRAIT:
                setTrait((Characteristic)null);
                return;
            case SMMPackage.MEASURE__SCALE:
                setScale(SCALE_EDEFAULT);
                return;
            case SMMPackage.MEASURE__CUSTOM_SCALE:
                setCustomScale(CUSTOM_SCALE_EDEFAULT);
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
            case SMMPackage.MEASURE__MEASURE_LABEL_FORMAT:
                return MEASURE_LABEL_FORMAT_EDEFAULT == null ? measureLabelFormat != null : !MEASURE_LABEL_FORMAT_EDEFAULT.equals(measureLabelFormat);
            case SMMPackage.MEASURE__MEASUREMENT_LABEL_FORMAT:
                return MEASUREMENT_LABEL_FORMAT_EDEFAULT == null ? measurementLabelFormat != null : !MEASUREMENT_LABEL_FORMAT_EDEFAULT.equals(measurementLabelFormat);
            case SMMPackage.MEASURE__VISIBLE:
                return VISIBLE_EDEFAULT == null ? visible != null : !VISIBLE_EDEFAULT.equals(visible);
            case SMMPackage.MEASURE__SOURCE:
                return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
            case SMMPackage.MEASURE__DEFAULT_QUERY:
                return defaultQuery != null;
            case SMMPackage.MEASURE__MEASURE_RELATIONSHIPS:
                return measureRelationships != null && !measureRelationships.isEmpty();
            case SMMPackage.MEASURE__CATEGORY:
                return category != null && !category.isEmpty();
            case SMMPackage.MEASURE__SCOPE:
                return scope != null;
            case SMMPackage.MEASURE__TRAIT:
                return trait != null;
            case SMMPackage.MEASURE__SCALE:
                return scale != SCALE_EDEFAULT;
            case SMMPackage.MEASURE__CUSTOM_SCALE:
                return CUSTOM_SCALE_EDEFAULT == null ? customScale != null : !CUSTOM_SCALE_EDEFAULT.equals(customScale);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case SMMPackage.MEASURE___GET_ALL_ARGUMENTS:
                getAllArguments();
                return null;
            case SMMPackage.MEASURE___GET_ARGUMENTS:
                getArguments();
                return null;
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
        result.append(" (measureLabelFormat: ");
        result.append(measureLabelFormat);
        result.append(", measurementLabelFormat: ");
        result.append(measurementLabelFormat);
        result.append(", visible: ");
        result.append(visible);
        result.append(", source: ");
        result.append(source);
        result.append(", scale: ");
        result.append(scale);
        result.append(", customScale: ");
        result.append(customScale);
        result.append(')');
        return result.toString();
    }

} //MeasureImpl
