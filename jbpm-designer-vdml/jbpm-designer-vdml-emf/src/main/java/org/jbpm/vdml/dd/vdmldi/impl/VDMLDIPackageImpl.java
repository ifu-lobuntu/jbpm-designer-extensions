/**
 */
package org.jbpm.vdml.dd.vdmldi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.jbpm.vdml.dd.vdmldi.VDMLStyle;
import org.omg.dd.di.DIPackage;
import org.omg.smm.SMMPackage;
import org.omg.smm.impl.SMMPackageImpl;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.impl.VDMLPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VDMLDIPackageImpl extends EPackageImpl implements VDMLDIPackage {
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
    private EClass vdmlShapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdmlDiagramElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vdmlStyleEClass = null;

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
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private VDMLDIPackageImpl() {
        super(eNS_URI, VDMLDIFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link VDMLDIPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static VDMLDIPackage init() {
        if (isInited) return (VDMLDIPackage)EPackage.Registry.INSTANCE.getEPackage(VDMLDIPackage.eNS_URI);

        // Obtain or create and register package
        VDMLDIPackageImpl theVDMLDIPackage = (VDMLDIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VDMLDIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VDMLDIPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        JBPMDDPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        VDMLPackageImpl theVDMLPackage = (VDMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VDMLPackage.eNS_URI) instanceof VDMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VDMLPackage.eNS_URI) : VDMLPackage.eINSTANCE);
        SMMPackageImpl theSMMPackage = (SMMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SMMPackage.eNS_URI) instanceof SMMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SMMPackage.eNS_URI) : SMMPackage.eINSTANCE);

        // Create package meta-data objects
        theVDMLDIPackage.createPackageContents();
        theVDMLPackage.createPackageContents();
        theSMMPackage.createPackageContents();

        // Initialize created meta-data
        theVDMLDIPackage.initializePackageContents();
        theVDMLPackage.initializePackageContents();
        theSMMPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theVDMLDIPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(VDMLDIPackage.eNS_URI, theVDMLDIPackage);
        return theVDMLDIPackage;
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
    public EReference getVDMLDiagram_OwnedVdmlDiagramElement() {
        return (EReference)vdmlDiagramEClass.getEStructuralFeatures().get(0);
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
    public EReference getVDMLEdge_SourceShape() {
        return (EReference)vdmlEdgeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLEdge_TargetShape() {
        return (EReference)vdmlEdgeEClass.getEStructuralFeatures().get(1);
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
    public EReference getVDMLShape_OwnedShape() {
        return (EReference)vdmlShapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDMLDiagramElement() {
        return vdmlDiagramElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVDMLDiagramElement_VdmlElement() {
        return (EReference)vdmlDiagramElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVDMLStyle() {
        return vdmlStyleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLDIFactory getVDMLDIFactory() {
        return (VDMLDIFactory)getEFactoryInstance();
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
        createEReference(vdmlDiagramEClass, VDML_DIAGRAM__OWNED_VDML_DIAGRAM_ELEMENT);

        vdmlEdgeEClass = createEClass(VDML_EDGE);
        createEReference(vdmlEdgeEClass, VDML_EDGE__SOURCE_SHAPE);
        createEReference(vdmlEdgeEClass, VDML_EDGE__TARGET_SHAPE);

        vdmlShapeEClass = createEClass(VDML_SHAPE);
        createEReference(vdmlShapeEClass, VDML_SHAPE__OWNED_SHAPE);

        vdmlDiagramElementEClass = createEClass(VDML_DIAGRAM_ELEMENT);
        createEReference(vdmlDiagramElementEClass, VDML_DIAGRAM_ELEMENT__VDML_ELEMENT);

        vdmlStyleEClass = createEClass(VDML_STYLE);
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
        DIPackage theDIPackage = (DIPackage)EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);
        JBPMDDPackage theJBPMDDPackage = (JBPMDDPackage)EPackage.Registry.INSTANCE.getEPackage(JBPMDDPackage.eNS_URI);
        VDMLPackage theVDMLPackage = (VDMLPackage)EPackage.Registry.INSTANCE.getEPackage(VDMLPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        vdmlDiagramEClass.getESuperTypes().add(theDIPackage.getDiagram());
        vdmlDiagramEClass.getESuperTypes().add(this.getVDMLDiagramElement());
        vdmlEdgeEClass.getESuperTypes().add(theDIPackage.getEdge());
        vdmlEdgeEClass.getESuperTypes().add(this.getVDMLDiagramElement());
        vdmlShapeEClass.getESuperTypes().add(theJBPMDDPackage.getBoundariedShape());
        vdmlShapeEClass.getESuperTypes().add(this.getVDMLDiagramElement());
        vdmlShapeEClass.getESuperTypes().add(theJBPMDDPackage.getCollapsibleShape());
        vdmlDiagramElementEClass.getESuperTypes().add(theDIPackage.getDiagramElement());
        vdmlStyleEClass.getESuperTypes().add(theDIPackage.getStyle());

        // Initialize classes, features, and operations; add parameters
        initEClass(vdmlDiagramEClass, VDMLDiagram.class, "VDMLDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVDMLDiagram_OwnedVdmlDiagramElement(), this.getVDMLDiagramElement(), null, "ownedVdmlDiagramElement", null, 0, -1, VDMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vdmlEdgeEClass, VDMLEdge.class, "VDMLEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVDMLEdge_SourceShape(), this.getVDMLShape(), null, "sourceShape", null, 0, 1, VDMLEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getVDMLEdge_TargetShape(), this.getVDMLShape(), null, "targetShape", null, 0, 1, VDMLEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vdmlShapeEClass, VDMLShape.class, "VDMLShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVDMLShape_OwnedShape(), this.getVDMLShape(), null, "ownedShape", null, 0, -1, VDMLShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vdmlDiagramElementEClass, VDMLDiagramElement.class, "VDMLDiagramElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVDMLDiagramElement_VdmlElement(), theVDMLPackage.getVdmlElement(), null, "vdmlElement", null, 0, 1, VDMLDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vdmlStyleEClass, VDMLStyle.class, "VDMLStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //VDMLDIPackageImpl
