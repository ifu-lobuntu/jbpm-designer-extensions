/**
 */
package org.jbpm.smm.dd.smmdi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.jbpm.smm.dd.smmdi.SMMDIFactory;
import org.jbpm.smm.dd.smmdi.SMMDIPackage;
import org.jbpm.smm.dd.smmdi.SMMDiagram;
import org.jbpm.smm.dd.smmdi.SMMDiagramElement;
import org.jbpm.smm.dd.smmdi.SMMEdge;
import org.jbpm.smm.dd.smmdi.SMMShape;
import org.jbpm.smm.dd.smmdi.SMMStyle;
import org.omg.dd.di.DIPackage;
import org.omg.smm.SMMPackage;
import org.omg.smm.impl.SMMPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SMMDIPackageImpl extends EPackageImpl implements SMMDIPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smmDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smmEdgeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smmShapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smmDiagramElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smmStyleEClass = null;

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
     * @see org.jbpm.smm.dd.smmdi.SMMDIPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SMMDIPackageImpl() {
        super(eNS_URI, SMMDIFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SMMDIPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SMMDIPackage init() {
        if (isInited) return (SMMDIPackage)EPackage.Registry.INSTANCE.getEPackage(SMMDIPackage.eNS_URI);

        // Obtain or create and register package
        SMMDIPackageImpl theSMMDIPackage = (SMMDIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SMMDIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SMMDIPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        JBPMDDPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        SMMPackageImpl theSMMPackage = (SMMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SMMPackage.eNS_URI) instanceof SMMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SMMPackage.eNS_URI) : SMMPackage.eINSTANCE);

        // Create package meta-data objects
        theSMMDIPackage.createPackageContents();
        theSMMPackage.createPackageContents();

        // Initialize created meta-data
        theSMMDIPackage.initializePackageContents();
        theSMMPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSMMDIPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SMMDIPackage.eNS_URI, theSMMDIPackage);
        return theSMMDIPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSMMDiagram() {
        return smmDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSMMDiagram_OwnedSmmDiagramElement() {
        return (EReference)smmDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSMMEdge() {
        return smmEdgeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSMMEdge_SourceShape() {
        return (EReference)smmEdgeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSMMEdge_TargetShape() {
        return (EReference)smmEdgeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSMMShape() {
        return smmShapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSMMShape_OwnedShape() {
        return (EReference)smmShapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSMMDiagramElement() {
        return smmDiagramElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSMMDiagramElement_SmmElement() {
        return (EReference)smmDiagramElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSMMStyle() {
        return smmStyleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMMDIFactory getSMMDIFactory() {
        return (SMMDIFactory)getEFactoryInstance();
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
        smmDiagramEClass = createEClass(SMM_DIAGRAM);
        createEReference(smmDiagramEClass, SMM_DIAGRAM__OWNED_SMM_DIAGRAM_ELEMENT);

        smmEdgeEClass = createEClass(SMM_EDGE);
        createEReference(smmEdgeEClass, SMM_EDGE__SOURCE_SHAPE);
        createEReference(smmEdgeEClass, SMM_EDGE__TARGET_SHAPE);

        smmShapeEClass = createEClass(SMM_SHAPE);
        createEReference(smmShapeEClass, SMM_SHAPE__OWNED_SHAPE);

        smmDiagramElementEClass = createEClass(SMM_DIAGRAM_ELEMENT);
        createEReference(smmDiagramElementEClass, SMM_DIAGRAM_ELEMENT__SMM_ELEMENT);

        smmStyleEClass = createEClass(SMM_STYLE);
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
        SMMPackage theSMMPackage = (SMMPackage)EPackage.Registry.INSTANCE.getEPackage(SMMPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        smmDiagramEClass.getESuperTypes().add(theDIPackage.getDiagram());
        smmDiagramEClass.getESuperTypes().add(this.getSMMDiagramElement());
        smmEdgeEClass.getESuperTypes().add(theDIPackage.getEdge());
        smmEdgeEClass.getESuperTypes().add(this.getSMMDiagramElement());
        smmShapeEClass.getESuperTypes().add(theJBPMDDPackage.getBoundariedShape());
        smmShapeEClass.getESuperTypes().add(this.getSMMDiagramElement());
        smmShapeEClass.getESuperTypes().add(theJBPMDDPackage.getCollapsibleShape());
        smmDiagramElementEClass.getESuperTypes().add(theDIPackage.getDiagramElement());
        smmStyleEClass.getESuperTypes().add(theDIPackage.getStyle());

        // Initialize classes, features, and operations; add parameters
        initEClass(smmDiagramEClass, SMMDiagram.class, "SMMDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSMMDiagram_OwnedSmmDiagramElement(), this.getSMMDiagramElement(), null, "ownedSmmDiagramElement", null, 0, -1, SMMDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(smmEdgeEClass, SMMEdge.class, "SMMEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSMMEdge_SourceShape(), this.getSMMShape(), null, "sourceShape", null, 0, 1, SMMEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSMMEdge_TargetShape(), this.getSMMShape(), null, "targetShape", null, 0, 1, SMMEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(smmShapeEClass, SMMShape.class, "SMMShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSMMShape_OwnedShape(), this.getSMMShape(), null, "ownedShape", null, 0, -1, SMMShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(smmDiagramElementEClass, SMMDiagramElement.class, "SMMDiagramElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSMMDiagramElement_SmmElement(), theSMMPackage.getSmmElement(), null, "smmElement", null, 0, 1, SMMDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(smmStyleEClass, SMMStyle.class, "SMMStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //SMMDIPackageImpl
