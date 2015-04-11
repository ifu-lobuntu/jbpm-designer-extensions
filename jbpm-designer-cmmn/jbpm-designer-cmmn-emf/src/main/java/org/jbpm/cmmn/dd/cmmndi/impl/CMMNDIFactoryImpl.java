/**
 */
package org.jbpm.cmmn.dd.cmmndi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIFactory;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagram;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement;
import org.jbpm.cmmn.dd.cmmndi.CMMNEdge;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.cmmn.dd.cmmndi.CMMNStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNDIFactoryImpl extends EFactoryImpl implements CMMNDIFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CMMNDIFactory init() {
        try {
            CMMNDIFactory theCMMNDIFactory = (CMMNDIFactory)EPackage.Registry.INSTANCE.getEFactory(CMMNDIPackage.eNS_URI);
            if (theCMMNDIFactory != null) {
                return theCMMNDIFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CMMNDIFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNDIFactoryImpl() {
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
            case CMMNDIPackage.CMMN_DIAGRAM: return createCMMNDiagram();
            case CMMNDIPackage.CMMN_EDGE: return createCMMNEdge();
            case CMMNDIPackage.CMMN_SHAPE: return createCMMNShape();
            case CMMNDIPackage.CMMN_DIAGRAM_ELEMENT: return createCMMNDiagramElement();
            case CMMNDIPackage.CMMN_STYLE: return createCMMNStyle();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNDiagram createCMMNDiagram() {
        CMMNDiagramImpl cmmnDiagram = new CMMNDiagramImpl();
        return cmmnDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNEdge createCMMNEdge() {
        CMMNEdgeImpl cmmnEdge = new CMMNEdgeImpl();
        return cmmnEdge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNShape createCMMNShape() {
        CMMNShapeImpl cmmnShape = new CMMNShapeImpl();
        return cmmnShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNDiagramElement createCMMNDiagramElement() {
        CMMNDiagramElementImpl cmmnDiagramElement = new CMMNDiagramElementImpl();
        return cmmnDiagramElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNStyle createCMMNStyle() {
        CMMNStyleImpl cmmnStyle = new CMMNStyleImpl();
        return cmmnStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNDIPackage getCMMNDIPackage() {
        return (CMMNDIPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CMMNDIPackage getPackage() {
        return CMMNDIPackage.eINSTANCE;
    }

} //CMMNDIFactoryImpl
