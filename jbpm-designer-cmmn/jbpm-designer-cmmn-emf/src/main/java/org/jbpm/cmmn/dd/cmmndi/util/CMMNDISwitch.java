/**
 */
package org.jbpm.cmmn.dd.cmmndi.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagram;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement;
import org.jbpm.cmmn.dd.cmmndi.CMMNEdge;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.cmmn.dd.cmmndi.CMMNStyle;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.jbpm.designer.dd.util.Switch;
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
 * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage
 * @generated
 */
public class CMMNDISwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CMMNDIPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNDISwitch() {
        if (modelPackage == null) {
            modelPackage = CMMNDIPackage.eINSTANCE;
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
            case CMMNDIPackage.CMMN_DIAGRAM: {
                CMMNDiagram cmmnDiagram = (CMMNDiagram)theEObject;
                T result = caseCMMNDiagram(cmmnDiagram);
                if (result == null) result = caseDiagram(cmmnDiagram);
                if (result == null) result = caseCMMNDiagramElement(cmmnDiagram);
                if (result == null) result = caseShape(cmmnDiagram);
                if (result == null) result = caseDiagramElement(cmmnDiagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNDIPackage.CMMN_EDGE: {
                CMMNEdge cmmnEdge = (CMMNEdge)theEObject;
                T result = caseCMMNEdge(cmmnEdge);
                if (result == null) result = caseEdge(cmmnEdge);
                if (result == null) result = caseCMMNDiagramElement(cmmnEdge);
                if (result == null) result = caseDiagramElement(cmmnEdge);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNDIPackage.CMMN_SHAPE: {
                CMMNShape cmmnShape = (CMMNShape)theEObject;
                T result = caseCMMNShape(cmmnShape);
                if (result == null) result = caseBoundariedShape(cmmnShape);
                if (result == null) result = caseCMMNDiagramElement(cmmnShape);
                if (result == null) result = caseCollapsibleShape(cmmnShape);
                if (result == null) result = caseShape(cmmnShape);
                if (result == null) result = caseDiagramElement(cmmnShape);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNDIPackage.CMMN_DIAGRAM_ELEMENT: {
                CMMNDiagramElement cmmnDiagramElement = (CMMNDiagramElement)theEObject;
                T result = caseCMMNDiagramElement(cmmnDiagramElement);
                if (result == null) result = caseDiagramElement(cmmnDiagramElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CMMNDIPackage.CMMN_STYLE: {
                CMMNStyle cmmnStyle = (CMMNStyle)theEObject;
                T result = caseCMMNStyle(cmmnStyle);
                if (result == null) result = caseStyle(cmmnStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CMMN Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CMMN Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCMMNDiagram(CMMNDiagram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CMMN Edge</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CMMN Edge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCMMNEdge(CMMNEdge object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CMMN Shape</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CMMN Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCMMNShape(CMMNShape object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CMMN Diagram Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CMMN Diagram Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCMMNDiagramElement(CMMNDiagramElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CMMN Style</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CMMN Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCMMNStyle(CMMNStyle object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Boundaried Shape</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boundaried Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoundariedShape(BoundariedShape object) {
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

} //CMMNDISwitch
