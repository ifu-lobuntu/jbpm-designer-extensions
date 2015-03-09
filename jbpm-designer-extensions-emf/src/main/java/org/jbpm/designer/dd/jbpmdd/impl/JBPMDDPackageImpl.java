/**
 */
package org.jbpm.designer.dd.jbpmdd.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.jbpm.designer.dd.jbpmdd.Compartment;
import org.jbpm.designer.dd.jbpmdd.JBPMDDFactory;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.di.DIPackage;
import org.omg.dd.primitivetypes.PrimitiveTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JBPMDDPackageImpl extends EPackageImpl implements JBPMDDPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boundariedShapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compartmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass collapsibleShapeEClass = null;

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
     * @see org.jbpm.designer.dd.jbpmdd.JBPMDDPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private JBPMDDPackageImpl() {
        super(eNS_URI, JBPMDDFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link JBPMDDPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static JBPMDDPackage init() {
        if (isInited) return (JBPMDDPackage)EPackage.Registry.INSTANCE.getEPackage(JBPMDDPackage.eNS_URI);

        // Obtain or create and register package
        JBPMDDPackageImpl theJBPMDDPackage = (JBPMDDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JBPMDDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JBPMDDPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        DGPackage.eINSTANCE.eClass();
        DIPackage.eINSTANCE.eClass();
        DCPackage.eINSTANCE.eClass();
        PrimitiveTypesPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theJBPMDDPackage.createPackageContents();

        // Initialize created meta-data
        theJBPMDDPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theJBPMDDPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(JBPMDDPackage.eNS_URI, theJBPMDDPackage);
        return theJBPMDDPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBoundariedShape() {
        return boundariedShapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBoundariedShape_BoundaryShapes() {
        return (EReference)boundariedShapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompartment() {
        return compartmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCollapsibleShape() {
        return collapsibleShapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCollapsibleShape_IsExpanded() {
        return (EAttribute)collapsibleShapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCollapsibleShape_PreviousWidth() {
        return (EAttribute)collapsibleShapeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCollapsibleShape_PreviousHeight() {
        return (EAttribute)collapsibleShapeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JBPMDDFactory getJBPMDDFactory() {
        return (JBPMDDFactory)getEFactoryInstance();
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
        boundariedShapeEClass = createEClass(BOUNDARIED_SHAPE);
        createEReference(boundariedShapeEClass, BOUNDARIED_SHAPE__BOUNDARY_SHAPES);

        compartmentEClass = createEClass(COMPARTMENT);

        collapsibleShapeEClass = createEClass(COLLAPSIBLE_SHAPE);
        createEAttribute(collapsibleShapeEClass, COLLAPSIBLE_SHAPE__IS_EXPANDED);
        createEAttribute(collapsibleShapeEClass, COLLAPSIBLE_SHAPE__PREVIOUS_WIDTH);
        createEAttribute(collapsibleShapeEClass, COLLAPSIBLE_SHAPE__PREVIOUS_HEIGHT);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        boundariedShapeEClass.getESuperTypes().add(theDIPackage.getShape());
        compartmentEClass.getESuperTypes().add(theDIPackage.getShape());

        // Initialize classes, features, and operations; add parameters
        initEClass(boundariedShapeEClass, BoundariedShape.class, "BoundariedShape", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBoundariedShape_BoundaryShapes(), theDIPackage.getShape(), null, "boundaryShapes", null, 0, -1, BoundariedShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(compartmentEClass, Compartment.class, "Compartment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(collapsibleShapeEClass, CollapsibleShape.class, "CollapsibleShape", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCollapsibleShape_IsExpanded(), ecorePackage.getEBoolean(), "isExpanded", null, 0, 1, CollapsibleShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCollapsibleShape_PreviousWidth(), ecorePackage.getEDouble(), "previousWidth", null, 0, 1, CollapsibleShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCollapsibleShape_PreviousHeight(), ecorePackage.getEDouble(), "previousHeight", null, 0, 1, CollapsibleShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //JBPMDDPackageImpl
