/**
 */
package org.jbpm.cmmn.dd.cmmndi.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.jbpm.cmmn.dd.cmmndi.CMMNDIFactory;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagram;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement;
import org.jbpm.cmmn.dd.cmmndi.CMMNEdge;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.cmmn.dd.cmmndi.CMMNStyle;

import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;

import org.omg.cmmn.CMMNPackage;

import org.omg.cmmn.impl.CMMNPackageImpl;

import org.omg.dd.di.DIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNDIPackageImpl extends EPackageImpl implements CMMNDIPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cmmnDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cmmnEdgeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cmmnShapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cmmnDiagramElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cmmnStyleEClass = null;

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
     * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CMMNDIPackageImpl() {
        super(eNS_URI, CMMNDIFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CMMNDIPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CMMNDIPackage init() {
        if (isInited) return (CMMNDIPackage)EPackage.Registry.INSTANCE.getEPackage(CMMNDIPackage.eNS_URI);

        // Obtain or create and register package
        CMMNDIPackageImpl theCMMNDIPackage = (CMMNDIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CMMNDIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CMMNDIPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        JBPMDDPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        CMMNPackageImpl theCMMNPackage = (CMMNPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CMMNPackage.eNS_URI) instanceof CMMNPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CMMNPackage.eNS_URI) : CMMNPackage.eINSTANCE);

        // Create package meta-data objects
        theCMMNDIPackage.createPackageContents();
        theCMMNPackage.createPackageContents();

        // Initialize created meta-data
        theCMMNDIPackage.initializePackageContents();
        theCMMNPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCMMNDIPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CMMNDIPackage.eNS_URI, theCMMNDIPackage);
        return theCMMNDIPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCMMNDiagram() {
        return cmmnDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCMMNDiagram_OwnedCmmnDiagramElement() {
        return (EReference)cmmnDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCMMNDiagram_OwnedCmmnStyles() {
        return (EReference)cmmnDiagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCMMNDiagram_IsPlanningTableExpanded() {
        return (EAttribute)cmmnDiagramEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCMMNEdge() {
        return cmmnEdgeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCMMNEdge_SourceShape() {
        return (EReference)cmmnEdgeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCMMNEdge_TargetShape() {
        return (EReference)cmmnEdgeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCMMNShape() {
        return cmmnShapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCMMNShape_OwnedShape() {
        return (EReference)cmmnShapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCMMNShape_IsPlanningTableExpanded() {
        return (EAttribute)cmmnShapeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCMMNDiagramElement() {
        return cmmnDiagramElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCMMNDiagramElement_CmmnElement() {
        return (EReference)cmmnDiagramElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCMMNStyle() {
        return cmmnStyleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNDIFactory getCMMNDIFactory() {
        return (CMMNDIFactory)getEFactoryInstance();
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
        cmmnDiagramEClass = createEClass(CMMN_DIAGRAM);
        createEReference(cmmnDiagramEClass, CMMN_DIAGRAM__OWNED_CMMN_DIAGRAM_ELEMENT);
        createEReference(cmmnDiagramEClass, CMMN_DIAGRAM__OWNED_CMMN_STYLES);
        createEAttribute(cmmnDiagramEClass, CMMN_DIAGRAM__IS_PLANNING_TABLE_EXPANDED);

        cmmnEdgeEClass = createEClass(CMMN_EDGE);
        createEReference(cmmnEdgeEClass, CMMN_EDGE__SOURCE_SHAPE);
        createEReference(cmmnEdgeEClass, CMMN_EDGE__TARGET_SHAPE);

        cmmnShapeEClass = createEClass(CMMN_SHAPE);
        createEReference(cmmnShapeEClass, CMMN_SHAPE__OWNED_SHAPE);
        createEAttribute(cmmnShapeEClass, CMMN_SHAPE__IS_PLANNING_TABLE_EXPANDED);

        cmmnDiagramElementEClass = createEClass(CMMN_DIAGRAM_ELEMENT);
        createEReference(cmmnDiagramElementEClass, CMMN_DIAGRAM_ELEMENT__CMMN_ELEMENT);

        cmmnStyleEClass = createEClass(CMMN_STYLE);
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
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
        JBPMDDPackage theJBPMDDPackage = (JBPMDDPackage)EPackage.Registry.INSTANCE.getEPackage(JBPMDDPackage.eNS_URI);
        CMMNPackage theCMMNPackage = (CMMNPackage)EPackage.Registry.INSTANCE.getEPackage(CMMNPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        cmmnDiagramEClass.getESuperTypes().add(theDIPackage.getDiagram());
        cmmnDiagramEClass.getESuperTypes().add(this.getCMMNDiagramElement());
        cmmnEdgeEClass.getESuperTypes().add(theDIPackage.getEdge());
        cmmnEdgeEClass.getESuperTypes().add(this.getCMMNDiagramElement());
        cmmnShapeEClass.getESuperTypes().add(theJBPMDDPackage.getBoundariedShape());
        cmmnShapeEClass.getESuperTypes().add(this.getCMMNDiagramElement());
        cmmnShapeEClass.getESuperTypes().add(theJBPMDDPackage.getCollapsibleShape());
        cmmnDiagramElementEClass.getESuperTypes().add(theDIPackage.getDiagramElement());
        cmmnStyleEClass.getESuperTypes().add(theDIPackage.getStyle());

        // Initialize classes, features, and operations; add parameters
        initEClass(cmmnDiagramEClass, CMMNDiagram.class, "CMMNDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCMMNDiagram_OwnedCmmnDiagramElement(), this.getCMMNDiagramElement(), null, "ownedCmmnDiagramElement", null, 0, -1, CMMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCMMNDiagram_OwnedCmmnStyles(), this.getCMMNStyle(), null, "ownedCmmnStyles", null, 0, -1, CMMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCMMNDiagram_IsPlanningTableExpanded(), theXMLTypePackage.getBoolean(), "isPlanningTableExpanded", "true", 0, 1, CMMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cmmnEdgeEClass, CMMNEdge.class, "CMMNEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCMMNEdge_SourceShape(), this.getCMMNShape(), null, "sourceShape", null, 0, 1, CMMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCMMNEdge_TargetShape(), this.getCMMNShape(), null, "targetShape", null, 0, 1, CMMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cmmnShapeEClass, CMMNShape.class, "CMMNShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCMMNShape_OwnedShape(), this.getCMMNShape(), null, "ownedShape", null, 0, -1, CMMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCMMNShape_IsPlanningTableExpanded(), theXMLTypePackage.getBoolean(), "isPlanningTableExpanded", "true", 0, 1, CMMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cmmnDiagramElementEClass, CMMNDiagramElement.class, "CMMNDiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCMMNDiagramElement_CmmnElement(), theCMMNPackage.getTCmmnElement(), null, "cmmnElement", null, 0, 1, CMMNDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cmmnStyleEClass, CMMNStyle.class, "CMMNStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //CMMNDIPackageImpl
