/**
 */
package org.jbpm.uml2.dd.umldi.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.jbpm.uml2.dd.umldi.UMLEdge;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.jbpm.uml2.dd.umldi.UMLStyle;
import org.omg.dd.di.DIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLDIPackageImpl extends EPackageImpl implements UMLDIPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass umlDiagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass umlEdgeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass umlShapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass umlCompartmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass umlStyleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass umlDiagramElementEClass = null;

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
     * @see org.jbpm.uml2.dd.umldi.UMLDIPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private UMLDIPackageImpl() {
        super(eNS_URI, UMLDIFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link UMLDIPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static UMLDIPackage init() {
        if (isInited) return (UMLDIPackage)EPackage.Registry.INSTANCE.getEPackage(UMLDIPackage.eNS_URI);

        // Obtain or create and register package
        UMLDIPackageImpl theUMLDIPackage = (UMLDIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UMLDIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UMLDIPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        JBPMDDPackage.eINSTANCE.eClass();
        UMLPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theUMLDIPackage.createPackageContents();

        // Initialize created meta-data
        theUMLDIPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theUMLDIPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(UMLDIPackage.eNS_URI, theUMLDIPackage);
        return theUMLDIPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUMLDiagram() {
        return umlDiagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUMLDiagram_OwnedUmlDiagramElement() {
        return (EReference)umlDiagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUMLDiagram_OwnedUmlStyle() {
        return (EReference)umlDiagramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUMLEdge() {
        return umlEdgeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUMLEdge_SourceShape() {
        return (EReference)umlEdgeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUMLEdge_TargetShape() {
        return (EReference)umlEdgeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUMLShape() {
        return umlShapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUMLShape_OwnedCompartment() {
        return (EReference)umlShapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUMLCompartment() {
        return umlCompartmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUMLCompartment_OwnedShape() {
        return (EReference)umlCompartmentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUMLCompartment_FeatureName() {
        return (EAttribute)umlCompartmentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUMLStyle() {
        return umlStyleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUMLDiagramElement() {
        return umlDiagramElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUMLDiagramElement_UmlElement() {
        return (EReference)umlDiagramElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UMLDIFactory getUMLDIFactory() {
        return (UMLDIFactory)getEFactoryInstance();
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
        umlDiagramEClass = createEClass(UML_DIAGRAM);
        createEReference(umlDiagramEClass, UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT);
        createEReference(umlDiagramEClass, UML_DIAGRAM__OWNED_UML_STYLE);

        umlEdgeEClass = createEClass(UML_EDGE);
        createEReference(umlEdgeEClass, UML_EDGE__SOURCE_SHAPE);
        createEReference(umlEdgeEClass, UML_EDGE__TARGET_SHAPE);

        umlShapeEClass = createEClass(UML_SHAPE);
        createEReference(umlShapeEClass, UML_SHAPE__OWNED_COMPARTMENT);

        umlCompartmentEClass = createEClass(UML_COMPARTMENT);
        createEReference(umlCompartmentEClass, UML_COMPARTMENT__OWNED_SHAPE);
        createEAttribute(umlCompartmentEClass, UML_COMPARTMENT__FEATURE_NAME);

        umlStyleEClass = createEClass(UML_STYLE);

        umlDiagramElementEClass = createEClass(UML_DIAGRAM_ELEMENT);
        createEReference(umlDiagramElementEClass, UML_DIAGRAM_ELEMENT__UML_ELEMENT);
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
        UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        umlDiagramEClass.getESuperTypes().add(theDIPackage.getDiagram());
        umlDiagramEClass.getESuperTypes().add(this.getUMLDiagramElement());
        umlEdgeEClass.getESuperTypes().add(theDIPackage.getEdge());
        umlEdgeEClass.getESuperTypes().add(this.getUMLDiagramElement());
        umlShapeEClass.getESuperTypes().add(theDIPackage.getShape());
        umlShapeEClass.getESuperTypes().add(this.getUMLDiagramElement());
        umlShapeEClass.getESuperTypes().add(theJBPMDDPackage.getCollapsibleShape());
        umlCompartmentEClass.getESuperTypes().add(theJBPMDDPackage.getCompartment());
        umlCompartmentEClass.getESuperTypes().add(this.getUMLDiagramElement());
        umlCompartmentEClass.getESuperTypes().add(theJBPMDDPackage.getCollapsibleShape());
        umlStyleEClass.getESuperTypes().add(theDIPackage.getStyle());
        umlDiagramElementEClass.getESuperTypes().add(theDIPackage.getDiagramElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(umlDiagramEClass, UMLDiagram.class, "UMLDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUMLDiagram_OwnedUmlDiagramElement(), this.getUMLDiagramElement(), null, "ownedUmlDiagramElement", null, 0, -1, UMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUMLDiagram_OwnedUmlStyle(), this.getUMLStyle(), null, "ownedUmlStyle", null, 0, -1, UMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(umlEdgeEClass, UMLEdge.class, "UMLEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUMLEdge_SourceShape(), this.getUMLShape(), null, "sourceShape", null, 0, 1, UMLEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUMLEdge_TargetShape(), this.getUMLShape(), null, "targetShape", null, 0, 1, UMLEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(umlShapeEClass, UMLShape.class, "UMLShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUMLShape_OwnedCompartment(), this.getUMLCompartment(), null, "ownedCompartment", null, 0, -1, UMLShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(umlCompartmentEClass, UMLCompartment.class, "UMLCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUMLCompartment_OwnedShape(), this.getUMLShape(), null, "ownedShape", null, 0, -1, UMLCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUMLCompartment_FeatureName(), theUMLPackage.getString(), "featureName", null, 1, 1, UMLCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(umlStyleEClass, UMLStyle.class, "UMLStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(umlDiagramElementEClass, UMLDiagramElement.class, "UMLDiagramElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUMLDiagramElement_UmlElement(), theUMLPackage.getElement(), null, "umlElement", null, 0, 1, UMLDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //UMLDIPackageImpl
