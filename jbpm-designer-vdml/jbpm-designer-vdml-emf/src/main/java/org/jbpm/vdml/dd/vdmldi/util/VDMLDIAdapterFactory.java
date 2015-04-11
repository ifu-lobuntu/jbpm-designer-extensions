/**
 */
package org.jbpm.vdml.dd.vdmldi.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.jbpm.vdml.dd.vdmldi.VDMLStyle;
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
 * @see org.jbpm.vdml.dd.vdmldi.VDMLDIPackage
 * @generated
 */
public class VDMLDIAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static VDMLDIPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLDIAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = VDMLDIPackage.eINSTANCE;
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
    protected VDMLDISwitch<Adapter> modelSwitch =
        new VDMLDISwitch<Adapter>() {
            @Override
            public Adapter caseVDMLDiagram(VDMLDiagram object) {
                return createVDMLDiagramAdapter();
            }
            @Override
            public Adapter caseVDMLEdge(VDMLEdge object) {
                return createVDMLEdgeAdapter();
            }
            @Override
            public Adapter caseVDMLShape(VDMLShape object) {
                return createVDMLShapeAdapter();
            }
            @Override
            public Adapter caseVDMLDiagramElement(VDMLDiagramElement object) {
                return createVDMLDiagramElementAdapter();
            }
            @Override
            public Adapter caseVDMLStyle(VDMLStyle object) {
                return createVDMLStyleAdapter();
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
            public Adapter caseBoundariedShape(BoundariedShape object) {
                return createBoundariedShapeAdapter();
            }
            @Override
            public Adapter caseCollapsibleShape(CollapsibleShape object) {
                return createCollapsibleShapeAdapter();
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
     * Creates a new adapter for an object of class '{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagram <em>VDML Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDiagram
     * @generated
     */
    public Adapter createVDMLDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.vdml.dd.vdmldi.VDMLEdge <em>VDML Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLEdge
     * @generated
     */
    public Adapter createVDMLEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.vdml.dd.vdmldi.VDMLShape <em>VDML Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLShape
     * @generated
     */
    public Adapter createVDMLShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement <em>VDML Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement
     * @generated
     */
    public Adapter createVDMLDiagramElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.jbpm.vdml.dd.vdmldi.VDMLStyle <em>VDML Style</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.vdml.dd.vdmldi.VDMLStyle
     * @generated
     */
    public Adapter createVDMLStyleAdapter() {
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
     * Creates a new adapter for an object of class '{@link org.jbpm.designer.dd.jbpmdd.BoundariedShape <em>Boundaried Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jbpm.designer.dd.jbpmdd.BoundariedShape
     * @generated
     */
    public Adapter createBoundariedShapeAdapter() {
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

} //VDMLDIAdapterFactory
