/**
 */
package org.pavanecce.vdml.metamodel.vdmldi.util;

import org.eclipse.dd.cmmn.di.Diagram;
import org.eclipse.dd.cmmn.di.DiagramElement;
import org.eclipse.dd.cmmn.di.Edge;
import org.eclipse.dd.cmmn.di.Label;
import org.eclipse.dd.cmmn.di.LabeledEdge;
import org.eclipse.dd.cmmn.di.LabeledShape;
import org.eclipse.dd.cmmn.di.Node;
import org.eclipse.dd.cmmn.di.Plane;
import org.eclipse.dd.cmmn.di.Shape;
import org.eclipse.dd.cmmn.di.Style;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLShape;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage
 * @generated
 */
public class VdmlDiAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static VdmlDiPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlDiAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = VdmlDiPackage.eINSTANCE;
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
    protected VdmlDiSwitch<Adapter> modelSwitch =
        new VdmlDiSwitch<Adapter>() {
            @Override
            public Adapter caseVDMLDiagram(VDMLDiagram object) {
                return createVDMLDiagramAdapter();
            }
            @Override
            public Adapter caseVDMLEdge(VDMLEdge object) {
                return createVDMLEdgeAdapter();
            }
            @Override
            public Adapter caseVDMLLabel(VDMLLabel object) {
                return createVDMLLabelAdapter();
            }
            @Override
            public Adapter caseVDMLLabelStyle(VDMLLabelStyle object) {
                return createVDMLLabelStyleAdapter();
            }
            @Override
            public Adapter caseVDMLPlane(VDMLPlane object) {
                return createVDMLPlaneAdapter();
            }
            @Override
            public Adapter caseVDMLShape(VDMLShape object) {
                return createVDMLShapeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseDiagram(Diagram object) {
                return createDiagramAdapter();
            }
            @Override
            public Adapter caseDiagramElement(DiagramElement object) {
                return createDiagramElementAdapter();
            }
            @Override
            public Adapter caseEdge(Edge object) {
                return createEdgeAdapter();
            }
            @Override
            public Adapter caseLabeledEdge(LabeledEdge object) {
                return createLabeledEdgeAdapter();
            }
            @Override
            public Adapter caseNode(Node object) {
                return createNodeAdapter();
            }
            @Override
            public Adapter caseLabel(Label object) {
                return createLabelAdapter();
            }
            @Override
            public Adapter caseStyle(Style object) {
                return createStyleAdapter();
            }
            @Override
            public Adapter casePlane(Plane object) {
                return createPlaneAdapter();
            }
            @Override
            public Adapter caseShape(Shape object) {
                return createShapeAdapter();
            }
            @Override
            public Adapter caseLabeledShape(LabeledShape object) {
                return createLabeledShapeAdapter();
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
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram <em>VDML Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram
     * @generated
     */
    public Adapter createVDMLDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge <em>VDML Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLEdge
     * @generated
     */
    public Adapter createVDMLEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel <em>VDML Label</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLLabel
     * @generated
     */
    public Adapter createVDMLLabelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle <em>VDML Label Style</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLLabelStyle
     * @generated
     */
    public Adapter createVDMLLabelStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane <em>VDML Plane</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLPlane
     * @generated
     */
    public Adapter createVDMLPlaneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdmldi.VDMLShape <em>VDML Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VDMLShape
     * @generated
     */
    public Adapter createVDMLShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dd.cmmn.di.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dd.cmmn.di.Diagram
     * @generated
     */
    public Adapter createDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dd.cmmn.di.DiagramElement <em>Diagram Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dd.cmmn.di.DiagramElement
     * @generated
     */
    public Adapter createDiagramElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dd.cmmn.di.Edge <em>Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dd.cmmn.di.Edge
     * @generated
     */
    public Adapter createEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dd.cmmn.di.LabeledEdge <em>Labeled Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dd.cmmn.di.LabeledEdge
     * @generated
     */
    public Adapter createLabeledEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dd.cmmn.di.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dd.cmmn.di.Node
     * @generated
     */
    public Adapter createNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dd.cmmn.di.Label <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dd.cmmn.di.Label
     * @generated
     */
    public Adapter createLabelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dd.cmmn.di.Style <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dd.cmmn.di.Style
     * @generated
     */
    public Adapter createStyleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dd.cmmn.di.Plane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dd.cmmn.di.Plane
     * @generated
     */
    public Adapter createPlaneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dd.cmmn.di.Shape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dd.cmmn.di.Shape
     * @generated
     */
    public Adapter createShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dd.cmmn.di.LabeledShape <em>Labeled Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dd.cmmn.di.LabeledShape
     * @generated
     */
    public Adapter createLabeledShapeAdapter() {
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

} //VdmlDiAdapterFactory
