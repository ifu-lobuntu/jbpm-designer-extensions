/**
 */
package org.omg.dd.primitivetypes;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.omg.dd.primitivetypes.PrimitiveTypesFactory
 * @model kind="package"
 * @generated
 */
public interface PrimitiveTypesPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "primitivetypes";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/PrimitiveTypes/20131001";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "PrimitiveTypes";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PrimitiveTypesPackage eINSTANCE = org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl.init();

    /**
     * The meta object id for the '<em>Boolean</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Boolean
     * @see org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl#getBoolean()
     * @generated
     */
    int BOOLEAN = 0;

    /**
     * The meta object id for the '<em>Real</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Double
     * @see org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl#getReal()
     * @generated
     */
    int REAL = 1;

    /**
     * The meta object id for the '<em>String</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl#getString()
     * @generated
     */
    int STRING = 2;

    /**
     * The meta object id for the '<em>Unlimited Natural</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Integer
     * @see org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl#getUnlimitedNatural()
     * @generated
     */
    int UNLIMITED_NATURAL = 3;

    /**
     * The meta object id for the '<em>Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Integer
     * @see org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl#getInteger()
     * @generated
     */
    int INTEGER = 4;


    /**
     * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Boolean</em>'.
     * @see java.lang.Boolean
     * @model instanceClass="java.lang.Boolean"
     * @generated
     */
    EDataType getBoolean();

    /**
     * Returns the meta object for data type '{@link java.lang.Double <em>Real</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Real</em>'.
     * @see java.lang.Double
     * @model instanceClass="java.lang.Double"
     * @generated
     */
    EDataType getReal();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>String</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getString();

    /**
     * Returns the meta object for data type '{@link java.lang.Integer <em>Unlimited Natural</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Unlimited Natural</em>'.
     * @see java.lang.Integer
     * @model instanceClass="java.lang.Integer"
     * @generated
     */
    EDataType getUnlimitedNatural();

    /**
     * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Integer</em>'.
     * @see java.lang.Integer
     * @model instanceClass="java.lang.Integer"
     * @generated
     */
    EDataType getInteger();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PrimitiveTypesFactory getPrimitiveTypesFactory();

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
         * The meta object literal for the '<em>Boolean</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Boolean
         * @see org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl#getBoolean()
         * @generated
         */
        EDataType BOOLEAN = eINSTANCE.getBoolean();

        /**
         * The meta object literal for the '<em>Real</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Double
         * @see org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl#getReal()
         * @generated
         */
        EDataType REAL = eINSTANCE.getReal();

        /**
         * The meta object literal for the '<em>String</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl#getString()
         * @generated
         */
        EDataType STRING = eINSTANCE.getString();

        /**
         * The meta object literal for the '<em>Unlimited Natural</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Integer
         * @see org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl#getUnlimitedNatural()
         * @generated
         */
        EDataType UNLIMITED_NATURAL = eINSTANCE.getUnlimitedNatural();

        /**
         * The meta object literal for the '<em>Integer</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Integer
         * @see org.omg.dd.primitivetypes.impl.PrimitiveTypesPackageImpl#getInteger()
         * @generated
         */
        EDataType INTEGER = eINSTANCE.getInteger();

    }

} //PrimitiveTypesPackage
