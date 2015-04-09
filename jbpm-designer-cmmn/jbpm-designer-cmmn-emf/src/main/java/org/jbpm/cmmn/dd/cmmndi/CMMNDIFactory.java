/**
 */
package org.jbpm.cmmn.dd.cmmndi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jbpm.cmmn.dd.cmmndi.CMMNDIPackage
 * @generated
 */
public interface CMMNDIFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CMMNDIFactory eINSTANCE = org.jbpm.cmmn.dd.cmmndi.impl.CMMNDIFactoryImpl.init();

    /**
     * Returns a new object of class '<em>CMMN Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CMMN Diagram</em>'.
     * @generated
     */
    CMMNDiagram createCMMNDiagram();

    /**
     * Returns a new object of class '<em>CMMN Edge</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CMMN Edge</em>'.
     * @generated
     */
    CMMNEdge createCMMNEdge();

    /**
     * Returns a new object of class '<em>CMMN Shape</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CMMN Shape</em>'.
     * @generated
     */
    CMMNShape createCMMNShape();

    /**
     * Returns a new object of class '<em>CMMN Diagram Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CMMN Diagram Element</em>'.
     * @generated
     */
    CMMNDiagramElement createCMMNDiagramElement();

    /**
     * Returns a new object of class '<em>CMMN Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CMMN Style</em>'.
     * @generated
     */
    CMMNStyle createCMMNStyle();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CMMNDIPackage getCMMNDIPackage();

} //CMMNDIFactory
