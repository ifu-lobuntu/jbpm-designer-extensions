/**
 */
package org.jbpm.designer.dd.jbpmdd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jbpm.designer.dd.jbpmdd.JBPMDDPackage
 * @generated
 */
public interface JBPMDDFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    JBPMDDFactory eINSTANCE = org.jbpm.designer.dd.jbpmdd.impl.JBPMDDFactoryImpl.init();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    JBPMDDPackage getJBPMDDPackage();

} //JBPMDDFactory
