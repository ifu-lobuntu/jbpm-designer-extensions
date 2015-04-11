/**
 */
package org.jbpm.uml2.dd.umldi.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.jbpm.designer.dd.jbpmdd.Compartment;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.jbpm.uml2.dd.umldi.UMLEdge;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.jbpm.uml2.dd.umldi.UMLStyle;
import org.omg.dd.di.Diagram;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Edge;
import org.omg.dd.di.Shape;
import org.omg.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jbpm.uml2.dd.umldi.UMLDIPackage
 * @generated
 */
public class UMLDIAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UMLDIPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UMLDIAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = UMLDIPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UMLDISwitch<Adapter> modelSwitch =
        new UMLDISwitch<Adapter>() {
            @Override
            public Adapter caseUMLDiagram(UMLDiagram object) {
                return createUMLDiagramAdapter();
            }
            @Override
            public Adapter caseUMLEdge(UMLEdge object) {
                return createUMLEdgeAdapter();
            }
            @Override
            public Adapter caseUMLShape(UMLShape object) {
                return createUMLShapeAdapter();
            }
            @Override
            public Adapter caseUMLCompartment(UMLCompartment object) {
                return createUMLCompartmentAdapter();
            }
            @Override
            public Adapter caseUMLStyle(UMLStyle object) {
                return createUMLStyleAdapter();
            }
            @Override
            public Adapter caseUMLDiagramElement(UMLDiagramElement object) {
                return createUMLDiagramElementAdapter();
            }
            @Override
            public Adapter caseDiagramElement(DiagramElement object) {
                return createDiagramElementAdapter();
            }
            @Override
            public Adapter caseShape(Shape object) {
                return createShapeAdapter();
            }
            @Override
            public Adapter caseDiagram(Diagram object) {
                return createDiagramAdapter();
            }
            @Override
            public Adapter caseEdge(Edge object) {
                return createEdgeAdapter();
            }
            @Override
            public Adapter caseCollapsibleShape(CollapsibleShape object) {
                return createCollapsibleShapeAdapter();
            }
            @Override
            public Adapter caseCompartment(Compartment object) {
                return createCompartmentAdapter();
            }
            @Override
            public Adapter caseStyle(Style object) {
                return createStyleAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.uml2.dd.umldi.UMLDiagram <em>UML Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.uml2.dd.umldi.UMLDiagram
     * @generated
     */
    public Adapter createUMLDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.uml2.dd.umldi.UMLEdge <em>UML Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.uml2.dd.umldi.UMLEdge
     * @generated
     */
    public Adapter createUMLEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.uml2.dd.umldi.UMLShape <em>UML Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.uml2.dd.umldi.UMLShape
     * @generated
     */
    public Adapter createUMLShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.uml2.dd.umldi.UMLCompartment <em>UML Compartment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.uml2.dd.umldi.UMLCompartment
     * @generated
     */
    public Adapter createUMLCompartmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.uml2.dd.umldi.UMLStyle <em>UML Style</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.uml2.dd.umldi.UMLStyle
     * @generated
     */
    public Adapter createUMLStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.uml2.dd.umldi.UMLDiagramElement <em>UML Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.uml2.dd.umldi.UMLDiagramElement
     * @generated
     */
    public Adapter createUMLDiagramElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.di.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.di.Diagram
     * @generated
     */
    public Adapter createDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.di.DiagramElement <em>Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.di.DiagramElement
     * @generated
     */
    public Adapter createDiagramElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.di.Edge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.di.Edge
     * @generated
     */
    public Adapter createEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.designer.dd.jbpmdd.CollapsibleShape <em>Collapsible Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.designer.dd.jbpmdd.CollapsibleShape
     * @generated
     */
    public Adapter createCollapsibleShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.designer.dd.jbpmdd.Compartment <em>Compartment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.designer.dd.jbpmdd.Compartment
     * @generated
     */
    public Adapter createCompartmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.di.Style <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.di.Style
     * @generated
     */
    public Adapter createStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.omg.dd.di.Shape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.omg.dd.di.Shape
     * @generated
     */
    public Adapter createShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //UMLDIAdapterFactory
