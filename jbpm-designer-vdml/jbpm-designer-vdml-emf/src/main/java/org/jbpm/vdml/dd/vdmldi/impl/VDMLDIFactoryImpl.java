/**
 */
package org.jbpm.vdml.dd.vdmldi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.jbpm.vdml.dd.vdmldi.VDMLStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VDMLDIFactoryImpl extends EFactoryImpl implements VDMLDIFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VDMLDIFactory init() {
        try {
            VDMLDIFactory theVDMLDIFactory = (VDMLDIFactory)EPackage.Registry.INSTANCE.getEFactory(VDMLDIPackage.eNS_URI);
            if (theVDMLDIFactory != null) {
                return theVDMLDIFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new VDMLDIFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLDIFactoryImpl() {
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
            case VDMLDIPackage.VDML_DIAGRAM: return createVDMLDiagram();
            case VDMLDIPackage.VDML_EDGE: return createVDMLEdge();
            case VDMLDIPackage.VDML_SHAPE: return createVDMLShape();
            case VDMLDIPackage.VDML_STYLE: return createVDMLStyle();
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
    public VDMLShape createVDMLShape() {
        VDMLShapeImpl vdmlShape = new VDMLShapeImpl();
        return vdmlShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLStyle createVDMLStyle() {
        VDMLStyleImpl vdmlStyle = new VDMLStyleImpl();
        return vdmlStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLDIPackage getVDMLDIPackage() {
        return (VDMLDIPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static VDMLDIPackage getPackage() {
        return VDMLDIPackage.eINSTANCE;
    }

} //VDMLDIFactoryImpl
