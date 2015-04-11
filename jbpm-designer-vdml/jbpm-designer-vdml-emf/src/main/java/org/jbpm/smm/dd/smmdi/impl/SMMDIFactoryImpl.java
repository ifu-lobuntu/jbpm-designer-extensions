/**
 */
package org.jbpm.smm.dd.smmdi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.jbpm.smm.dd.smmdi.SMMDIFactory;
import org.jbpm.smm.dd.smmdi.SMMDIPackage;
import org.jbpm.smm.dd.smmdi.SMMDiagram;
import org.jbpm.smm.dd.smmdi.SMMEdge;
import org.jbpm.smm.dd.smmdi.SMMShape;
import org.jbpm.smm.dd.smmdi.SMMStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SMMDIFactoryImpl extends EFactoryImpl implements SMMDIFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SMMDIFactory init() {
        try {
            SMMDIFactory theSMMDIFactory = (SMMDIFactory)EPackage.Registry.INSTANCE.getEFactory(SMMDIPackage.eNS_URI);
            if (theSMMDIFactory != null) {
                return theSMMDIFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SMMDIFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMDIFactoryImpl() {
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
            case SMMDIPackage.SMM_DIAGRAM: return createSMMDiagram();
            case SMMDIPackage.SMM_EDGE: return createSMMEdge();
            case SMMDIPackage.SMM_SHAPE: return createSMMShape();
            case SMMDIPackage.SMM_STYLE: return createSMMStyle();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMDiagram createSMMDiagram() {
        SMMDiagramImpl smmDiagram = new SMMDiagramImpl();
        return smmDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMEdge createSMMEdge() {
        SMMEdgeImpl smmEdge = new SMMEdgeImpl();
        return smmEdge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMShape createSMMShape() {
        SMMShapeImpl smmShape = new SMMShapeImpl();
        return smmShape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMStyle createSMMStyle() {
        SMMStyleImpl smmStyle = new SMMStyleImpl();
        return smmStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMDIPackage getSMMDIPackage() {
        return (SMMDIPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SMMDIPackage getPackage() {
        return SMMDIPackage.eINSTANCE;
    }

} //SMMDIFactoryImpl
