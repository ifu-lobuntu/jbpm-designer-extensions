/**
 */
package org.pavanecce.vdml.metamodel.cmof.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pavanecce.vdml.metamodel.cmof.CmofFactory;
import org.pavanecce.vdml.metamodel.cmof.CmofPackage;
import org.pavanecce.vdml.metamodel.cmof.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmofFactoryImpl extends EFactoryImpl implements CmofFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CmofFactory init() {
        try {
            CmofFactory theCmofFactory = (CmofFactory)EPackage.Registry.INSTANCE.getEFactory(CmofPackage.eNS_URI);
            if (theCmofFactory != null) {
                return theCmofFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CmofFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CmofFactoryImpl() {
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
            case CmofPackage.ELEMENT: return createElement();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element createElement() {
        ElementImpl element = new ElementImpl();
        return element;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CmofPackage getCmofPackage() {
        return (CmofPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CmofPackage getPackage() {
        return CmofPackage.eINSTANCE;
    }

} //CmofFactoryImpl
