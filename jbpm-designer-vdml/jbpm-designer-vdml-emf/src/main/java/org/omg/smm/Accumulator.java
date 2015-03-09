/**
 */
package org.omg.smm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Accumulator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.smm.SMMPackage#getAccumulator()
 * @model
 * @generated
 */
public enum Accumulator implements Enumerator {
    /**
     * The '<em><b>Sum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUM_VALUE
     * @generated
     * @ordered
     */
    SUM(0, "sum", "sum"),

    /**
     * The '<em><b>Maximum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAXIMUM_VALUE
     * @generated
     * @ordered
     */
    MAXIMUM(1, "maximum", "maximum"),

    /**
     * The '<em><b>Minimum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINIMUM_VALUE
     * @generated
     * @ordered
     */
    MINIMUM(2, "minimum", "minimum"),

    /**
     * The '<em><b>Average</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AVERAGE_VALUE
     * @generated
     * @ordered
     */
    AVERAGE(3, "average", "average"),

    /**
     * The '<em><b>Standard Deviation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STANDARD_DEVIATION_VALUE
     * @generated
     * @ordered
     */
    STANDARD_DEVIATION(4, "standardDeviation", "standardDeviation"),

    /**
     * The '<em><b>Product</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRODUCT_VALUE
     * @generated
     * @ordered
     */
    PRODUCT(5, "product", "product"),

    /**
     * The '<em><b>Custom</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CUSTOM_VALUE
     * @generated
     * @ordered
     */
    CUSTOM(6, "custom", "custom");

    /**
     * The '<em><b>Sum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUM
     * @model name="sum"
     * @generated
     * @ordered
     */
    public static final int SUM_VALUE = 0;

    /**
     * The '<em><b>Maximum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Maximum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAXIMUM
     * @model name="maximum"
     * @generated
     * @ordered
     */
    public static final int MAXIMUM_VALUE = 1;

    /**
     * The '<em><b>Minimum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Minimum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MINIMUM
     * @model name="minimum"
     * @generated
     * @ordered
     */
    public static final int MINIMUM_VALUE = 2;

    /**
     * The '<em><b>Average</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Average</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AVERAGE
     * @model name="average"
     * @generated
     * @ordered
     */
    public static final int AVERAGE_VALUE = 3;

    /**
     * The '<em><b>Standard Deviation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Standard Deviation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STANDARD_DEVIATION
     * @model name="standardDeviation"
     * @generated
     * @ordered
     */
    public static final int STANDARD_DEVIATION_VALUE = 4;

    /**
     * The '<em><b>Product</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Product</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PRODUCT
     * @model name="product"
     * @generated
     * @ordered
     */
    public static final int PRODUCT_VALUE = 5;

    /**
     * The '<em><b>Custom</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Custom</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CUSTOM
     * @model name="custom"
     * @generated
     * @ordered
     */
    public static final int CUSTOM_VALUE = 6;

    /**
     * An array of all the '<em><b>Accumulator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Accumulator[] VALUES_ARRAY =
        new Accumulator[] {
            SUM,
            MAXIMUM,
            MINIMUM,
            AVERAGE,
            STANDARD_DEVIATION,
            PRODUCT,
            CUSTOM,
        };

    /**
     * A public read-only list of all the '<em><b>Accumulator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<Accumulator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Accumulator</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Accumulator get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Accumulator result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Accumulator</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Accumulator getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Accumulator result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Accumulator</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Accumulator get(int value) {
        switch (value) {
            case SUM_VALUE: return SUM;
            case MAXIMUM_VALUE: return MAXIMUM;
            case MINIMUM_VALUE: return MINIMUM;
            case AVERAGE_VALUE: return AVERAGE;
            case STANDARD_DEVIATION_VALUE: return STANDARD_DEVIATION;
            case PRODUCT_VALUE: return PRODUCT;
            case CUSTOM_VALUE: return CUSTOM;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private Accumulator(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //Accumulator
