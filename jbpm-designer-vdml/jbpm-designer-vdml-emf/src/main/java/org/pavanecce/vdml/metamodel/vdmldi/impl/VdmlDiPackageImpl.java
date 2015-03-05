/**
 */
package org.pavanecce.vdml.metamodel.vdmldi.impl;

import org.eclipse.dd.cmmn.dc.DcPackage;
import org.eclipse.dd.cmmn.dc.impl.DcPackageImpl;
import org.eclipse.dd.cmmn.di.DiPackage;
import org.eclipse.dd.cmmn.di.impl.DiPackageImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.pavanecce.vdml.metamodel.cmof.CmofPackage;
import org.pavanecce.vdml.metamodel.cmof.impl.CmofPackageImpl;
import org.pavanecce.vdml.metamodel.smm.SmmPackage;
import org.pavanecce.vdml.metamodel.smm.impl.SmmPackageImpl;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;
import org.pavanecce.vdml.metamodel.vdml.impl.VdmlPackageImpl;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VdmlDiPackageImpl extends EPackageImpl implements VdmlDiPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdmlDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdmlEdgeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdmlLabelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdmlLabelStyleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdmlPlaneEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdmlShapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

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
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private VdmlDiPackageImpl() {
        super(eNS_URI, VdmlDiFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link VdmlDiPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static VdmlDiPackage init() {
        if (isInited) return (VdmlDiPackage)EPackage.Registry.INSTANCE.getEPackage(VdmlDiPackage.eNS_URI);

        // Obtain or create and register package
        VdmlDiPackageImpl theVdmlDiPackage = (VdmlDiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VdmlDiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VdmlDiPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        VdmlPackageImpl theVdmlPackage = (VdmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VdmlPackage.eNS_URI) instanceof VdmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VdmlPackage.eNS_URI) : VdmlPackage.eINSTANCE);
        SmmPackageImpl theSmmPackage = (SmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI) instanceof SmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI) : SmmPackage.eINSTANCE);
        CmofPackageImpl theCmofPackage = (CmofPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CmofPackage.eNS_URI) instanceof CmofPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CmofPackage.eNS_URI) : CmofPackage.eINSTANCE);
        DcPackageImpl theDcPackage = (DcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DcPackage.eNS_URI) instanceof DcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DcPackage.eNS_URI) : DcPackage.eINSTANCE);
        DiPackageImpl theDiPackage = (DiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DiPackage.eNS_URI) instanceof DiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DiPackage.eNS_URI) : DiPackage.eINSTANCE);

        // Create package meta-data objects
        theVdmlDiPackage.createPackageContents();
        theVdmlPackage.createPackageContents();
        theSmmPackage.createPackageContents();
        theCmofPackage.createPackageContents();
        theDcPackage.createPackageContents();
        theDiPackage.createPackageContents();

        // Initialize created meta-data
        theVdmlDiPackage.initializePackageContents();
        theVdmlPackage.initializePackageContents();
        theSmmPackage.initializePackageContents();
        theCmofPackage.initializePackageContents();
        theDcPackage.initializePackageContents();
        theDiPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theVdmlDiPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(VdmlDiPackage.eNS_URI, theVdmlDiPackage);
        return theVdmlDiPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDMLDiagram() {
        return vdmlDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLDiagram_VDMLPlane() {
        return (EReference)vdmlDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLDiagram_LabelStyle() {
        return (EReference)vdmlDiagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDMLEdge() {
        return vdmlEdgeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLEdge_Label() {
        return (EReference)vdmlEdgeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLEdge_VDMLElement() {
        return (EReference)vdmlEdgeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLEdge_SourceElement() {
        return (EReference)vdmlEdgeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLEdge_TargetElement() {
        return (EReference)vdmlEdgeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDMLLabel() {
        return vdmlLabelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLLabel_LabelStyle() {
        return (EReference)vdmlLabelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDMLLabelStyle() {
        return vdmlLabelStyleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLLabelStyle_Font() {
        return (EReference)vdmlLabelStyleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDMLPlane() {
        return vdmlPlaneEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLPlane_VDMLElement() {
        return (EReference)vdmlPlaneEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDMLShape() {
        return vdmlShapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLShape_Label() {
        return (EReference)vdmlShapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLShape_VDMLElement() {
        return (EReference)vdmlShapeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVDMLShape_IsExpanded() {
        return (EAttribute)vdmlShapeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVDMLShape_IsHorizontal() {
        return (EAttribute)vdmlShapeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVDMLShape_IsMarkerVisible() {
        return (EAttribute)vdmlShapeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLShape_OwnedShape() {
        return (EReference)vdmlShapeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Diagram() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Edge() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Label() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_LabelStyle() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Plane() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Shape() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlDiFactory getVdmlDiFactory() {
        return (VdmlDiFactory)getEFactoryInstance();
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
        vdmlDiagramEClass = createEClass(VDML_DIAGRAM);
        createEReference(vdmlDiagramEClass, VDML_DIAGRAM__VDML_PLANE);
        createEReference(vdmlDiagramEClass, VDML_DIAGRAM__LABEL_STYLE);

        vdmlEdgeEClass = createEClass(VDML_EDGE);
        createEReference(vdmlEdgeEClass, VDML_EDGE__LABEL);
        createEReference(vdmlEdgeEClass, VDML_EDGE__VDML_ELEMENT);
        createEReference(vdmlEdgeEClass, VDML_EDGE__SOURCE_ELEMENT);
        createEReference(vdmlEdgeEClass, VDML_EDGE__TARGET_ELEMENT);

        vdmlLabelEClass = createEClass(VDML_LABEL);
        createEReference(vdmlLabelEClass, VDML_LABEL__LABEL_STYLE);

        vdmlLabelStyleEClass = createEClass(VDML_LABEL_STYLE);
        createEReference(vdmlLabelStyleEClass, VDML_LABEL_STYLE__FONT);

        vdmlPlaneEClass = createEClass(VDML_PLANE);
        createEReference(vdmlPlaneEClass, VDML_PLANE__VDML_ELEMENT);

        vdmlShapeEClass = createEClass(VDML_SHAPE);
        createEReference(vdmlShapeEClass, VDML_SHAPE__LABEL);
        createEReference(vdmlShapeEClass, VDML_SHAPE__VDML_ELEMENT);
        createEAttribute(vdmlShapeEClass, VDML_SHAPE__IS_EXPANDED);
        createEAttribute(vdmlShapeEClass, VDML_SHAPE__IS_HORIZONTAL);
        createEAttribute(vdmlShapeEClass, VDML_SHAPE__IS_MARKER_VISIBLE);
        createEReference(vdmlShapeEClass, VDML_SHAPE__OWNED_SHAPE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DIAGRAM);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EDGE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LABEL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LABEL_STYLE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PLANE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SHAPE);
    }
public static void main(String[] args) {
EList<EStructuralFeature> eAllStructuralFeatures = DiPackage.eINSTANCE.getPlane().getEAllStructuralFeatures();
System.out.println(eAllStructuralFeatures);
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
        DiPackage theDiPackage = (DiPackage)EPackage.Registry.INSTANCE.getEPackage(DiPackage.eNS_URI);
        VdmlPackage theVdmlPackage = (VdmlPackage)EPackage.Registry.INSTANCE.getEPackage(VdmlPackage.eNS_URI);
        DcPackage theDcPackage = (DcPackage)EPackage.Registry.INSTANCE.getEPackage(DcPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        vdmlDiagramEClass.getESuperTypes().add(theDiPackage.getDiagram());
        vdmlEdgeEClass.getESuperTypes().add(theDiPackage.getLabeledEdge());
        vdmlLabelEClass.getESuperTypes().add(theDiPackage.getLabel());
        vdmlLabelStyleEClass.getESuperTypes().add(theDiPackage.getStyle());
        vdmlPlaneEClass.getESuperTypes().add(theDiPackage.getPlane());
        vdmlShapeEClass.getESuperTypes().add(theDiPackage.getLabeledShape());

        // Initialize classes, features, and operations; add parameters
        initEClass(vdmlDiagramEClass, VDMLDiagram.class, "VDMLDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVDMLDiagram_VDMLPlane(), this.getVDMLPlane(), null, "VDMLPlane", null, 1, 1, VDMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVDMLDiagram_LabelStyle(), this.getVDMLLabelStyle(), null, "LabelStyle", null, 0, -1, VDMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vdmlEdgeEClass, VDMLEdge.class, "VDMLEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVDMLEdge_Label(), this.getVDMLLabel(), null, "Label", null, 0, 1, VDMLEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVDMLEdge_VDMLElement(), theVdmlPackage.getVdmlElement(), null, "VDMLElement", null, 0, 1, VDMLEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVDMLEdge_SourceElement(), theDiPackage.getDiagramElement(), null, "sourceElement", null, 0, 1, VDMLEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVDMLEdge_TargetElement(), theDiPackage.getDiagramElement(), null, "targetElement", null, 0, 1, VDMLEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vdmlLabelEClass, VDMLLabel.class, "VDMLLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVDMLLabel_LabelStyle(), this.getVDMLLabelStyle(), null, "labelStyle", null, 0, 1, VDMLLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vdmlLabelStyleEClass, VDMLLabelStyle.class, "VDMLLabelStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVDMLLabelStyle_Font(), theDcPackage.getFont(), null, "font", null, 1, 1, VDMLLabelStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vdmlPlaneEClass, VDMLPlane.class, "VDMLPlane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVDMLPlane_VDMLElement(), theVdmlPackage.getVdmlElement(), null, "VDMLElement", null, 0, 1, VDMLPlane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vdmlShapeEClass, VDMLShape.class, "VDMLShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVDMLShape_Label(), this.getVDMLLabel(), null, "Label", null, 0, 1, VDMLShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVDMLShape_VDMLElement(), theVdmlPackage.getVdmlElement(), null, "VDMLElement", null, 0, 1, VDMLShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVDMLShape_IsExpanded(), theXMLTypePackage.getBoolean(), "isExpanded", null, 0, 1, VDMLShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVDMLShape_IsHorizontal(), theXMLTypePackage.getBoolean(), "isHorizontal", null, 0, 1, VDMLShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVDMLShape_IsMarkerVisible(), theXMLTypePackage.getBoolean(), "isMarkerVisible", null, 0, 1, VDMLShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVDMLShape_OwnedShape(), theDiPackage.getDiagramElement(), null, "ownedShape", null, 0, -1, VDMLShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Diagram(), this.getVDMLDiagram(), null, "Diagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Edge(), this.getVDMLEdge(), null, "Edge", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Label(), this.getVDMLLabel(), null, "Label", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_LabelStyle(), this.getVDMLLabelStyle(), null, "LabelStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Plane(), this.getVDMLPlane(), null, "Plane", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Shape(), this.getVDMLShape(), null, "Shape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
        addAnnotation
          (vdmlDiagramEClass, 
           source, 
           new String[] {
             "name", "VDMLDiagram",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getVDMLDiagram_VDMLPlane(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "VDMLPlane",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getVDMLDiagram_LabelStyle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "VDMLLabelStyle",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (vdmlEdgeEClass, 
           source, 
           new String[] {
             "name", "VDMLEdge",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getVDMLEdge_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "VDMLLabel",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getVDMLEdge_VDMLElement(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "VDMLElement"
           });	
        addAnnotation
          (getVDMLEdge_SourceElement(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "sourceElement"
           });	
        addAnnotation
          (getVDMLEdge_TargetElement(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "targetElement"
           });	
        addAnnotation
          (vdmlLabelEClass, 
           source, 
           new String[] {
             "name", "VDMLLabel",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getVDMLLabel_LabelStyle(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "labelStyle"
           });	
        addAnnotation
          (vdmlLabelStyleEClass, 
           source, 
           new String[] {
             "name", "VDMLLabelStyle",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getVDMLLabelStyle_Font(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "Font",
             "namespace", "http://www.omg.org/spec/DD/20100524/DC"
           });	
        addAnnotation
          (vdmlPlaneEClass, 
           source, 
           new String[] {
             "name", "VDMLPlane",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getVDMLPlane_VDMLElement(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "VDMLElement"
           });	
        addAnnotation
          (vdmlShapeEClass, 
           source, 
           new String[] {
             "name", "VDMLShape",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getVDMLShape_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "VDMLLabel",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getVDMLShape_VDMLElement(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "VDMLElement"
           });	
        addAnnotation
          (getVDMLShape_IsExpanded(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "isExpanded"
           });	
        addAnnotation
          (getVDMLShape_IsHorizontal(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "isHorizontal"
           });	
        addAnnotation
          (getVDMLShape_IsMarkerVisible(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "isMarkerVisible"
           });	
        addAnnotation
          (documentRootEClass, 
           source, 
           new String[] {
             "name", "",
             "kind", "mixed"
           });	
        addAnnotation
          (getDocumentRoot_Mixed(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "name", ":mixed"
           });	
        addAnnotation
          (getDocumentRoot_XMLNSPrefixMap(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xmlns:prefix"
           });	
        addAnnotation
          (getDocumentRoot_XSISchemaLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xsi:schemaLocation"
           });	
        addAnnotation
          (getDocumentRoot_Diagram(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "VDMLDiagram",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Edge(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "VDMLEdge",
             "namespace", "##targetNamespace",
             "affiliation", "http://www.omg.org/spec/DD/20100524/DI#DiagramElement"
           });	
        addAnnotation
          (getDocumentRoot_Label(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "VDMLLabel",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_LabelStyle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "VDMLLabelStyle",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Plane(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "VDMLPlane",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Shape(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "VDMLShape",
             "namespace", "##targetNamespace",
             "affiliation", "http://www.omg.org/spec/DD/20100524/DI#DiagramElement"
           });
    }

} //VdmlDiPackageImpl
