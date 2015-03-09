/**
 */
package org.omg.dd.dc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.omg.dd.dc.AlignmentKind;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.Color;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.dc.Dimension;
import org.omg.dd.dc.KnownColor;
import org.omg.dd.dc.Point;
import org.omg.dd.dc.util.DCValidator;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.impl.DGPackageImpl;
import org.omg.dd.di.DIPackage;
import org.omg.dd.di.impl.DIPackageImpl;
import org.omg.dd.primitivetypes.PrimitiveTypesPackage;
import org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DCPackageImpl extends EPackageImpl implements DCPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass colorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dimensionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boundsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum alignmentKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum knownColorEEnum = null;

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
     * @see org.omg.dd.dc.DCPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DCPackageImpl() {
        super(eNS_URI, DCFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DCPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DCPackage init() {
        if (isInited) return (DCPackage)EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);

        // Obtain or create and register package
        DCPackageImpl theDCPackage = (DCPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DCPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        DGPackageImpl theDGPackage = (DGPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DGPackage.eNS_URI) instanceof DGPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DGPackage.eNS_URI) : DGPackage.eINSTANCE);
        DIPackageImpl theDIPackage = (DIPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI) instanceof DIPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI) : DIPackage.eINSTANCE);
        PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) instanceof PrimitiveTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) : PrimitiveTypesPackage.eINSTANCE);

        // Create package meta-data objects
        theDCPackage.createPackageContents();
        theDGPackage.createPackageContents();
        theDIPackage.createPackageContents();
        thePrimitiveTypesPackage.createPackageContents();

        // Initialize created meta-data
        theDCPackage.initializePackageContents();
        theDGPackage.initializePackageContents();
        theDIPackage.initializePackageContents();
        thePrimitiveTypesPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theDCPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return DCValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theDCPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DCPackage.eNS_URI, theDCPackage);
        return theDCPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColor() {
        return colorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColor_Red() {
        return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColor_Green() {
        return (EAttribute)colorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColor_Blue() {
        return (EAttribute)colorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getColor__Valid_rgb__DiagnosticChain_Map() {
        return colorEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDimension() {
        return dimensionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDimension_Width() {
        return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDimension_Height() {
        return (EAttribute)dimensionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getDimension__Non_negative_dimension__DiagnosticChain_Map() {
        return dimensionEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBounds() {
        return boundsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBounds_X() {
        return (EAttribute)boundsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBounds_Y() {
        return (EAttribute)boundsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBounds_Width() {
        return (EAttribute)boundsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBounds_Height() {
        return (EAttribute)boundsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getBounds__Non_negative_size__DiagnosticChain_Map() {
        return boundsEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPoint() {
        return pointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPoint_X() {
        return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPoint_Y() {
        return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAlignmentKind() {
        return alignmentKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getKnownColor() {
        return knownColorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DCFactory getDCFactory() {
        return (DCFactory)getEFactoryInstance();
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
        colorEClass = createEClass(COLOR);
        createEAttribute(colorEClass, COLOR__RED);
        createEAttribute(colorEClass, COLOR__GREEN);
        createEAttribute(colorEClass, COLOR__BLUE);
        createEOperation(colorEClass, COLOR___VALID_RGB__DIAGNOSTICCHAIN_MAP);

        dimensionEClass = createEClass(DIMENSION);
        createEAttribute(dimensionEClass, DIMENSION__WIDTH);
        createEAttribute(dimensionEClass, DIMENSION__HEIGHT);
        createEOperation(dimensionEClass, DIMENSION___NON_NEGATIVE_DIMENSION__DIAGNOSTICCHAIN_MAP);

        boundsEClass = createEClass(BOUNDS);
        createEAttribute(boundsEClass, BOUNDS__X);
        createEAttribute(boundsEClass, BOUNDS__Y);
        createEAttribute(boundsEClass, BOUNDS__WIDTH);
        createEAttribute(boundsEClass, BOUNDS__HEIGHT);
        createEOperation(boundsEClass, BOUNDS___NON_NEGATIVE_SIZE__DIAGNOSTICCHAIN_MAP);

        pointEClass = createEClass(POINT);
        createEAttribute(pointEClass, POINT__X);
        createEAttribute(pointEClass, POINT__Y);

        // Create enums
        alignmentKindEEnum = createEEnum(ALIGNMENT_KIND);
        knownColorEEnum = createEEnum(KNOWN_COLOR);
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
        PrimitiveTypesPackage thePrimitiveTypesPackage = (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getColor_Red(), thePrimitiveTypesPackage.getInteger(), "red", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getColor_Green(), thePrimitiveTypesPackage.getInteger(), "green", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getColor_Blue(), thePrimitiveTypesPackage.getInteger(), "blue", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        EOperation op = initEOperation(getColor__Valid_rgb__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_rgb", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDimension_Width(), thePrimitiveTypesPackage.getReal(), "width", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getDimension_Height(), thePrimitiveTypesPackage.getReal(), "height", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = initEOperation(getDimension__Non_negative_dimension__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "non_negative_dimension", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(boundsEClass, Bounds.class, "Bounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBounds_X(), thePrimitiveTypesPackage.getReal(), "x", "0.0", 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBounds_Y(), thePrimitiveTypesPackage.getReal(), "y", "0.0", 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBounds_Width(), thePrimitiveTypesPackage.getReal(), "width", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getBounds_Height(), thePrimitiveTypesPackage.getReal(), "height", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = initEOperation(getBounds__Non_negative_size__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "non_negative_size", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPoint_X(), thePrimitiveTypesPackage.getReal(), "x", "0.0", 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getPoint_Y(), thePrimitiveTypesPackage.getReal(), "y", "0.0", 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(alignmentKindEEnum, AlignmentKind.class, "AlignmentKind");
        addEEnumLiteral(alignmentKindEEnum, AlignmentKind.START);
        addEEnumLiteral(alignmentKindEEnum, AlignmentKind.END);
        addEEnumLiteral(alignmentKindEEnum, AlignmentKind.CENTER);

        initEEnum(knownColorEEnum, KnownColor.class, "KnownColor");
        addEEnumLiteral(knownColorEEnum, KnownColor.MAROON);
        addEEnumLiteral(knownColorEEnum, KnownColor.RED);
        addEEnumLiteral(knownColorEEnum, KnownColor.ORANGE);
        addEEnumLiteral(knownColorEEnum, KnownColor.YELLOW);
        addEEnumLiteral(knownColorEEnum, KnownColor.OLIVE);
        addEEnumLiteral(knownColorEEnum, KnownColor.PURPLE);
        addEEnumLiteral(knownColorEEnum, KnownColor.FUCHSIA);
        addEEnumLiteral(knownColorEEnum, KnownColor.WHITE);
        addEEnumLiteral(knownColorEEnum, KnownColor.LIME);
        addEEnumLiteral(knownColorEEnum, KnownColor.GREEN);
        addEEnumLiteral(knownColorEEnum, KnownColor.NAVY);
        addEEnumLiteral(knownColorEEnum, KnownColor.BLUE);
        addEEnumLiteral(knownColorEEnum, KnownColor.AQUA);
        addEEnumLiteral(knownColorEEnum, KnownColor.TEAL);
        addEEnumLiteral(knownColorEEnum, KnownColor.BLACK);
        addEEnumLiteral(knownColorEEnum, KnownColor.SILVER);
        addEEnumLiteral(knownColorEEnum, KnownColor.GRAY);

        // Create resource
        createResource(eNS_URI);
    }

} //DCPackageImpl
