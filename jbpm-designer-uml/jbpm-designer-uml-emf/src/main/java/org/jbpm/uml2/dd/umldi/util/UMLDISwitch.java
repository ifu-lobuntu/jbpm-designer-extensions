/**
 */
package org.jbpm.uml2.dd.umldi.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.jbpm.designer.dd.jbpmdd.Compartment;
import org.jbpm.designer.dd.util.Switch;
import org.jbpm.uml2.dd.umldi.*;
import org.omg.dd.di.Diagram;
import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.Edge;
import org.omg.dd.di.Shape;
import org.omg.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.jbpm.uml2.dd.umldi.UMLDIPackage
 * @generated
 */
public class UMLDISwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UMLDIPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UMLDISwitch() {
        if (modelPackage == null) {
            modelPackage = UMLDIPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case UMLDIPackage.UML_DIAGRAM: {
                UMLDiagram umlDiagram = (UMLDiagram)theEObject;
                T result = caseUMLDiagram(umlDiagram);
                if (result == null) result = caseDiagram(umlDiagram);
                if (result == null) result = caseUMLDiagramElement(umlDiagram);
                if (result == null) result = caseShape(umlDiagram);
                if (result == null) result = caseDiagramElement(umlDiagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UMLDIPackage.UML_EDGE: {
                UMLEdge umlEdge = (UMLEdge)theEObject;
                T result = caseUMLEdge(umlEdge);
                if (result == null) result = caseEdge(umlEdge);
                if (result == null) result = caseUMLDiagramElement(umlEdge);
                if (result == null) result = caseDiagramElement(umlEdge);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UMLDIPackage.UML_SHAPE: {
                UMLShape umlShape = (UMLShape)theEObject;
                T result = caseUMLShape(umlShape);
                if (result == null) result = caseShape(umlShape);
                if (result == null) result = caseUMLDiagramElement(umlShape);
                if (result == null) result = caseCollapsibleShape(umlShape);
                if (result == null) result = caseDiagramElement(umlShape);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UMLDIPackage.UML_COMPARTMENT: {
                UMLCompartment umlCompartment = (UMLCompartment)theEObject;
                T result = caseUMLCompartment(umlCompartment);
                if (result == null) result = caseCompartment(umlCompartment);
                if (result == null) result = caseUMLDiagramElement(umlCompartment);
                if (result == null) result = caseCollapsibleShape(umlCompartment);
                if (result == null) result = caseShape(umlCompartment);
                if (result == null) result = caseDiagramElement(umlCompartment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UMLDIPackage.UML_STYLE: {
                UMLStyle umlStyle = (UMLStyle)theEObject;
                T result = caseUMLStyle(umlStyle);
                if (result == null) result = caseStyle(umlStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UMLDIPackage.UML_DIAGRAM_ELEMENT: {
                UMLDiagramElement umlDiagramElement = (UMLDiagramElement)theEObject;
                T result = caseUMLDiagramElement(umlDiagramElement);
                if (result == null) result = caseDiagramElement(umlDiagramElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UML Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UML Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUMLDiagram(UMLDiagram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UML Edge</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UML Edge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUMLEdge(UMLEdge object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UML Shape</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UML Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUMLShape(UMLShape object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UML Compartment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UML Compartment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUMLCompartment(UMLCompartment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UML Style</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UML Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUMLStyle(UMLStyle object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UML Diagram Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UML Diagram Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUMLDiagramElement(UMLDiagramElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagram(Diagram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramElement(DiagramElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEdge(Edge object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Collapsible Shape</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Collapsible Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCollapsibleShape(CollapsibleShape object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompartment(Compartment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStyle(Style object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShape(Shape object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //UMLDISwitch
