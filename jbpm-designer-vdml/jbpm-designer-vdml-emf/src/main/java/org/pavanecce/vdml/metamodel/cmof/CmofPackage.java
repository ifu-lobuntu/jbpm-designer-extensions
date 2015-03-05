/**
 */
package org.pavanecce.vdml.metamodel.cmof;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.cmof.CmofFactory
 * @model kind="package"
 * @generated
 */
public interface CmofPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cmof";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///Data/CMOF.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "cmof";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CmofPackage eINSTANCE = org.pavanecce.vdml.metamodel.cmof.impl.CmofPackageImpl.init();

    /**
     * The meta object id for the '{@link org.pavanecce.vdml.metamodel.cmof.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pavanecce.vdml.metamodel.cmof.impl.ElementImpl
     * @see org.pavanecce.vdml.metamodel.cmof.impl.CmofPackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__MEASUREMENT = 0;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.pavanecce.vdml.metamodel.cmof.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see org.pavanecce.vdml.metamodel.cmof.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for the reference list '{@link org.pavanecce.vdml.metamodel.cmof.Element#getMeasurement <em>Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Measurement</em>'.
     * @see org.pavanecce.vdml.metamodel.cmof.Element#getMeasurement()
     * @see #getElement()
     * @generated
     */
    EReference getElement_Measurement();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CmofFactory getCmofFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.pavanecce.vdml.metamodel.cmof.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.pavanecce.vdml.metamodel.cmof.impl.ElementImpl
         * @see org.pavanecce.vdml.metamodel.cmof.impl.CmofPackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '<em><b>Measurement</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__MEASUREMENT = eINSTANCE.getElement_Measurement();

    }

} //CmofPackage
