/**
 */
package org.pavanecce.vdml.metamodel.cmof.impl;

import org.eclipse.dd.cmmn.dc.DcPackage;
import org.eclipse.dd.cmmn.dc.impl.DcPackageImpl;
import org.eclipse.dd.cmmn.di.DiPackage;
import org.eclipse.dd.cmmn.di.impl.DiPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pavanecce.vdml.metamodel.cmof.CmofFactory;
import org.pavanecce.vdml.metamodel.cmof.CmofPackage;
import org.pavanecce.vdml.metamodel.cmof.Element;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;
import org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;
import org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;
import org.pavanecce.vdml.metamodel.vdmldi.impl.VdmlDiPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmofPackageImpl extends EPackageImpl implements CmofPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elementEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.pavanecce.vdml.metamodel.cmof.CmofPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CmofPackageImpl() {
        super(eNS_URI, CmofFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link CmofPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CmofPackage init() {
        if (isInited) return (CmofPackage)EPackage.Registry.INSTANCE.getEPackage(CmofPackage.eNS_URI);

        // Obtain or create and register package
        CmofPackageImpl theCmofPackage = (CmofPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CmofPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CmofPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        VdmlPackageImpl theVdmlPackage = (VdmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VdmlPackage.eNS_URI) instanceof VdmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VdmlPackage.eNS_URI) : VdmlPackage.eINSTANCE);
        SmmPackageImpl theSmmPackage = (SmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI) instanceof SmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI) : SmmPackage.eINSTANCE);
        DcPackageImpl theDcPackage = (DcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DcPackage.eNS_URI) instanceof DcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DcPackage.eNS_URI) : DcPackage.eINSTANCE);
        DiPackageImpl theDiPackage = (DiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DiPackage.eNS_URI) instanceof DiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DiPackage.eNS_URI) : DiPackage.eINSTANCE);
        VdmlDiPackageImpl theVdmlDiPackage = (VdmlDiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VdmlDiPackage.eNS_URI) instanceof VdmlDiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VdmlDiPackage.eNS_URI) : VdmlDiPackage.eINSTANCE);

        // Create package meta-data objects
        theCmofPackage.createPackageContents();
        theVdmlPackage.createPackageContents();
        theSmmPackage.createPackageContents();
        theDcPackage.createPackageContents();
        theDiPackage.createPackageContents();
        theVdmlDiPackage.createPackageContents();

        // Initialize created meta-data
        theCmofPackage.initializePackageContents();
        theVdmlPackage.initializePackageContents();
        theSmmPackage.initializePackageContents();
        theDcPackage.initializePackageContents();
        theDiPackage.initializePackageContents();
        theVdmlDiPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCmofPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CmofPackage.eNS_URI, theCmofPackage);
        return theCmofPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElement() {
        return elementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElement_Measurement() {
        return (EReference)elementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CmofFactory getCmofFactory() {
        return (CmofFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        elementEClass = createEClass(ELEMENT);
        createEReference(elementEClass, ELEMENT__MEASUREMENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        SmmPackage theSmmPackage = (SmmPackage)EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getElement_Measurement(), theSmmPackage.getMeasurement(), null, "measurement", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //CmofPackageImpl
