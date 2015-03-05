/**
 */
package org.pavanecce.vdml.metamodel.vdmldi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLShape;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiFactory;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VdmlDiFactoryImpl extends EFactoryImpl implements VdmlDiFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VdmlDiFactory init() {
        try {
            VdmlDiFactory theVdmlDiFactory = (VdmlDiFactory)EPackage.Registry.INSTANCE.getEFactory(VdmlDiPackage.eNS_URI);
            if (theVdmlDiFactory != null) {
                return theVdmlDiFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new VdmlDiFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlDiFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case VdmlDiPackage.VDML_DIAGRAM: return createVDMLDiagram();
            case VdmlDiPackage.VDML_EDGE: return createVDMLEdge();
            case VdmlDiPackage.VDML_LABEL: return createVDMLLabel();
            case VdmlDiPackage.VDML_LABEL_STYLE: return createVDMLLabelStyle();
            case VdmlDiPackage.VDML_PLANE: return createVDMLPlane();
            case VdmlDiPackage.VDML_SHAPE: return createVDMLShape();
            case VdmlDiPackage.DOCUMENT_ROOT: return createDocumentRoot();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLDiagram createVDMLDiagram() {
        VDMLDiagramImpl vdmlDiagram = new VDMLDiagramImpl();
        return vdmlDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLEdge createVDMLEdge() {
        VDMLEdgeImpl vdmlEdge = new VDMLEdgeImpl();
        return vdmlEdge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLLabel createVDMLLabel() {
        VDMLLabelImpl vdmlLabel = new VDMLLabelImpl();
        return vdmlLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLLabelStyle createVDMLLabelStyle() {
        VDMLLabelStyleImpl vdmlLabelStyle = new VDMLLabelStyleImpl();
        return vdmlLabelStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLPlane createVDMLPlane() {
        VDMLPlaneImpl vdmlPlane = new VDMLPlaneImpl();
        return vdmlPlane;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLShape createVDMLShape() {
        VDMLShapeImpl vdmlShape = new VDMLShapeImpl();
        return vdmlShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlDiPackage getVdmlDiPackage() {
        return (VdmlDiPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static VdmlDiPackage getPackage() {
        return VdmlDiPackage.eINSTANCE;
    }

} //VdmlDiFactoryImpl
