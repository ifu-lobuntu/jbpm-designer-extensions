/**
 */
package org.pavanecce.vdml.metamodel.vdmldi.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLShape;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.impl.DocumentRootImpl#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlDiPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, VdmlDiPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, VdmlDiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, VdmlDiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLDiagram getDiagram() {
        return (VDMLDiagram)getMixed().get(VdmlDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagram(VDMLDiagram newDiagram, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(VdmlDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM, newDiagram, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagram(VDMLDiagram newDiagram) {
        ((FeatureMap.Internal)getMixed()).set(VdmlDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM, newDiagram);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLEdge getEdge() {
        return (VDMLEdge)getMixed().get(VdmlDiPackage.Literals.DOCUMENT_ROOT__EDGE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEdge(VDMLEdge newEdge, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(VdmlDiPackage.Literals.DOCUMENT_ROOT__EDGE, newEdge, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEdge(VDMLEdge newEdge) {
        ((FeatureMap.Internal)getMixed()).set(VdmlDiPackage.Literals.DOCUMENT_ROOT__EDGE, newEdge);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLLabel getLabel() {
        return (VDMLLabel)getMixed().get(VdmlDiPackage.Literals.DOCUMENT_ROOT__LABEL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabel(VDMLLabel newLabel, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(VdmlDiPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(VDMLLabel newLabel) {
        ((FeatureMap.Internal)getMixed()).set(VdmlDiPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLLabelStyle getLabelStyle() {
        return (VDMLLabelStyle)getMixed().get(VdmlDiPackage.Literals.DOCUMENT_ROOT__LABEL_STYLE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabelStyle(VDMLLabelStyle newLabelStyle, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(VdmlDiPackage.Literals.DOCUMENT_ROOT__LABEL_STYLE, newLabelStyle, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabelStyle(VDMLLabelStyle newLabelStyle) {
        ((FeatureMap.Internal)getMixed()).set(VdmlDiPackage.Literals.DOCUMENT_ROOT__LABEL_STYLE, newLabelStyle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLPlane getPlane() {
        return (VDMLPlane)getMixed().get(VdmlDiPackage.Literals.DOCUMENT_ROOT__PLANE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPlane(VDMLPlane newPlane, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(VdmlDiPackage.Literals.DOCUMENT_ROOT__PLANE, newPlane, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPlane(VDMLPlane newPlane) {
        ((FeatureMap.Internal)getMixed()).set(VdmlDiPackage.Literals.DOCUMENT_ROOT__PLANE, newPlane);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLShape getShape() {
        return (VDMLShape)getMixed().get(VdmlDiPackage.Literals.DOCUMENT_ROOT__SHAPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetShape(VDMLShape newShape, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(VdmlDiPackage.Literals.DOCUMENT_ROOT__SHAPE, newShape, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setShape(VDMLShape newShape) {
        ((FeatureMap.Internal)getMixed()).set(VdmlDiPackage.Literals.DOCUMENT_ROOT__SHAPE, newShape);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlDiPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case VdmlDiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case VdmlDiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
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
            case VdmlDiPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case VdmlDiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case VdmlDiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case VdmlDiPackage.DOCUMENT_ROOT__DIAGRAM:
                return getDiagram();
            case VdmlDiPackage.DOCUMENT_ROOT__EDGE:
                return getEdge();
            case VdmlDiPackage.DOCUMENT_ROOT__LABEL:
                return getLabel();
            case VdmlDiPackage.DOCUMENT_ROOT__LABEL_STYLE:
                return getLabelStyle();
            case VdmlDiPackage.DOCUMENT_ROOT__PLANE:
                return getPlane();
            case VdmlDiPackage.DOCUMENT_ROOT__SHAPE:
                return getShape();
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
            case VdmlDiPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__DIAGRAM:
                setDiagram((VDMLDiagram)newValue);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__EDGE:
                setEdge((VDMLEdge)newValue);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__LABEL:
                setLabel((VDMLLabel)newValue);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__LABEL_STYLE:
                setLabelStyle((VDMLLabelStyle)newValue);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__PLANE:
                setPlane((VDMLPlane)newValue);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__SHAPE:
                setShape((VDMLShape)newValue);
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
            case VdmlDiPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__DIAGRAM:
                setDiagram((VDMLDiagram)null);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__EDGE:
                setEdge((VDMLEdge)null);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__LABEL:
                setLabel((VDMLLabel)null);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__LABEL_STYLE:
                setLabelStyle((VDMLLabelStyle)null);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__PLANE:
                setPlane((VDMLPlane)null);
                return;
            case VdmlDiPackage.DOCUMENT_ROOT__SHAPE:
                setShape((VDMLShape)null);
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
            case VdmlDiPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case VdmlDiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case VdmlDiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case VdmlDiPackage.DOCUMENT_ROOT__DIAGRAM:
                return getDiagram() != null;
            case VdmlDiPackage.DOCUMENT_ROOT__EDGE:
                return getEdge() != null;
            case VdmlDiPackage.DOCUMENT_ROOT__LABEL:
                return getLabel() != null;
            case VdmlDiPackage.DOCUMENT_ROOT__LABEL_STYLE:
                return getLabelStyle() != null;
            case VdmlDiPackage.DOCUMENT_ROOT__PLANE:
                return getPlane() != null;
            case VdmlDiPackage.DOCUMENT_ROOT__SHAPE:
                return getShape() != null;
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
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
