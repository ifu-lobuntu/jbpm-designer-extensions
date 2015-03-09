/**
 */
package org.omg.dd.di.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.dc.impl.DCPackageImpl;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.dg.impl.DGPackageImpl;
import org.omg.dd.di.DIFactory;
import org.omg.dd.di.DIPackage;
import org.omg.dd.di.Diagram;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Edge;
import org.omg.dd.di.Shape;
import org.omg.dd.di.Style;
import org.omg.dd.di.util.DIValidator;
import org.omg.dd.primitivetypes.PrimitiveTypesPackage;
import org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DIPackageImpl extends EPackageImpl implements DIPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass edgeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass styleEClass = null;

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
     * @see org.omg.dd.di.DIPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DIPackageImpl() {
        super(eNS_URI, DIFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DIPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DIPackage init() {
        if (isInited) return (DIPackage)EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);

        // Obtain or create and register package
        DIPackageImpl theDIPackage = (DIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DIPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        DGPackageImpl theDGPackage = (DGPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DGPackage.eNS_URI) instanceof DGPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DGPackage.eNS_URI) : DGPackage.eINSTANCE);
        DCPackageImpl theDCPackage = (DCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI) instanceof DCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI) : DCPackage.eINSTANCE);
        PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) instanceof PrimitiveTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) : PrimitiveTypesPackage.eINSTANCE);

        // Create package meta-data objects
        theDIPackage.createPackageContents();
        theDGPackage.createPackageContents();
        theDCPackage.createPackageContents();
        thePrimitiveTypesPackage.createPackageContents();

        // Initialize created meta-data
        theDIPackage.initializePackageContents();
        theDGPackage.initializePackageContents();
        theDCPackage.initializePackageContents();
        thePrimitiveTypesPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theDIPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return DIValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theDIPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DIPackage.eNS_URI, theDIPackage);
        return theDIPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagramElement() {
        return diagramElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElement_ModelElement() {
        return (EReference)diagramElementEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramElement_Id() {
        return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElement_OwningElement() {
        return (EReference)diagramElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElement_OwnedElement() {
        return (EReference)diagramElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElement_LocalStyle() {
        return (EReference)diagramElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElement_SharedStyle() {
        return (EReference)diagramElementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEdge() {
        return edgeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEdge_Source() {
        return (EReference)edgeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEdge_Target() {
        return (EReference)edgeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEdge_Waypoint() {
        return (EReference)edgeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagram() {
        return diagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagram_Name() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagram_Documentation() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagram_Resolution() {
        return (EAttribute)diagramEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getShape() {
        return shapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getShape_Bounds() {
        return (EReference)shapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStyle() {
        return styleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStyle_Fill() {
        return (EReference)styleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStyle_FillColor() {
        return (EReference)styleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_FillOpacity() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_StrokeWidth() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_StrokeOpacity() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStyle_StrokeColor() {
        return (EReference)styleEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_StrokeDashLength() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_FontSize() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_FontName() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStyle_FontColor() {
        return (EReference)styleEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_FontItalic() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_FontBold() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_FontUnderline() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyle_FontStrikeThrough() {
        return (EAttribute)styleEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getStyle__Valid_font_size__DiagnosticChain_Map() {
        return styleEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getStyle__Valid_fill_opacity__DiagnosticChain_Map() {
        return styleEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getStyle__Valid_stroke_width__DiagnosticChain_Map() {
        return styleEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getStyle__Valid_dash_length_size__DiagnosticChain_Map() {
        return styleEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getStyle__Valid_stroke_opacity__DiagnosticChain_Map() {
        return styleEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DIFactory getDIFactory() {
        return (DIFactory)getEFactoryInstance();
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
        diagramElementEClass = createEClass(DIAGRAM_ELEMENT);
        createEReference(diagramElementEClass, DIAGRAM_ELEMENT__OWNING_ELEMENT);
        createEReference(diagramElementEClass, DIAGRAM_ELEMENT__OWNED_ELEMENT);
        createEReference(diagramElementEClass, DIAGRAM_ELEMENT__LOCAL_STYLE);
        createEReference(diagramElementEClass, DIAGRAM_ELEMENT__SHARED_STYLE);
        createEReference(diagramElementEClass, DIAGRAM_ELEMENT__MODEL_ELEMENT);
        createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__ID);

        edgeEClass = createEClass(EDGE);
        createEReference(edgeEClass, EDGE__SOURCE);
        createEReference(edgeEClass, EDGE__TARGET);
        createEReference(edgeEClass, EDGE__WAYPOINT);

        diagramEClass = createEClass(DIAGRAM);
        createEAttribute(diagramEClass, DIAGRAM__NAME);
        createEAttribute(diagramEClass, DIAGRAM__DOCUMENTATION);
        createEAttribute(diagramEClass, DIAGRAM__RESOLUTION);

        shapeEClass = createEClass(SHAPE);
        createEReference(shapeEClass, SHAPE__BOUNDS);

        styleEClass = createEClass(STYLE);
        createEReference(styleEClass, STYLE__FILL);
        createEReference(styleEClass, STYLE__FILL_COLOR);
        createEAttribute(styleEClass, STYLE__FILL_OPACITY);
        createEAttribute(styleEClass, STYLE__STROKE_WIDTH);
        createEAttribute(styleEClass, STYLE__STROKE_OPACITY);
        createEReference(styleEClass, STYLE__STROKE_COLOR);
        createEAttribute(styleEClass, STYLE__STROKE_DASH_LENGTH);
        createEAttribute(styleEClass, STYLE__FONT_SIZE);
        createEAttribute(styleEClass, STYLE__FONT_NAME);
        createEReference(styleEClass, STYLE__FONT_COLOR);
        createEAttribute(styleEClass, STYLE__FONT_ITALIC);
        createEAttribute(styleEClass, STYLE__FONT_BOLD);
        createEAttribute(styleEClass, STYLE__FONT_UNDERLINE);
        createEAttribute(styleEClass, STYLE__FONT_STRIKE_THROUGH);
        createEOperation(styleEClass, STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP);
        createEOperation(styleEClass, STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP);
        createEOperation(styleEClass, STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP);
        createEOperation(styleEClass, STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP);
        createEOperation(styleEClass, STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP);
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
        DCPackage theDCPackage = (DCPackage)EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);
        PrimitiveTypesPackage thePrimitiveTypesPackage = (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
        DGPackage theDGPackage = (DGPackage)EPackage.Registry.INSTANCE.getEPackage(DGPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        edgeEClass.getESuperTypes().add(this.getDiagramElement());
        diagramEClass.getESuperTypes().add(this.getShape());
        shapeEClass.getESuperTypes().add(this.getDiagramElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDiagramElement_OwningElement(), this.getDiagramElement(), this.getDiagramElement_OwnedElement(), "owningElement", null, 0, 1, DiagramElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
        initEReference(getDiagramElement_OwnedElement(), this.getDiagramElement(), this.getDiagramElement_OwningElement(), "ownedElement", null, 0, -1, DiagramElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramElement_LocalStyle(), this.getStyle(), null, "localStyle", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getDiagramElement_SharedStyle(), this.getStyle(), null, "sharedStyle", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getDiagramElement_ModelElement(), ecorePackage.getEObject(), null, "modelElement", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEdge_Source(), this.getDiagramElement(), null, "source", null, 1, 1, Edge.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
        initEReference(getEdge_Target(), this.getDiagramElement(), null, "target", null, 1, 1, Edge.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
        initEReference(getEdge_Waypoint(), theDCPackage.getPoint(), null, "waypoint", null, 0, -1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramEClass, Diagram.class, "Diagram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDiagram_Name(), thePrimitiveTypesPackage.getString(), "name", "", 1, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getDiagram_Documentation(), thePrimitiveTypesPackage.getString(), "documentation", "", 1, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getDiagram_Resolution(), thePrimitiveTypesPackage.getReal(), "resolution", "300.0", 1, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getShape_Bounds(), theDCPackage.getBounds(), null, "bounds", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(styleEClass, Style.class, "Style", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStyle_Fill(), theDGPackage.getFill(), null, "fill", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getStyle_FillColor(), theDCPackage.getColor(), null, "fillColor", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getStyle_FillOpacity(), thePrimitiveTypesPackage.getReal(), "fillOpacity", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getStyle_StrokeWidth(), thePrimitiveTypesPackage.getReal(), "strokeWidth", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getStyle_StrokeOpacity(), thePrimitiveTypesPackage.getReal(), "strokeOpacity", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getStyle_StrokeColor(), theDCPackage.getColor(), null, "strokeColor", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getStyle_StrokeDashLength(), thePrimitiveTypesPackage.getReal(), "strokeDashLength", null, 0, -1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStyle_FontSize(), thePrimitiveTypesPackage.getReal(), "fontSize", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getStyle_FontName(), thePrimitiveTypesPackage.getString(), "fontName", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getStyle_FontColor(), theDCPackage.getColor(), null, "fontColor", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getStyle_FontItalic(), thePrimitiveTypesPackage.getBoolean(), "fontItalic", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getStyle_FontBold(), thePrimitiveTypesPackage.getBoolean(), "fontBold", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getStyle_FontUnderline(), thePrimitiveTypesPackage.getBoolean(), "fontUnderline", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getStyle_FontStrikeThrough(), thePrimitiveTypesPackage.getBoolean(), "fontStrikeThrough", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        EOperation op = initEOperation(getStyle__Valid_font_size__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_font_size", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getStyle__Valid_fill_opacity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_fill_opacity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getStyle__Valid_stroke_width__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_stroke_width", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getStyle__Valid_dash_length_size__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_dash_length_size", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getStyle__Valid_stroke_opacity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valid_stroke_opacity", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //DIPackageImpl
