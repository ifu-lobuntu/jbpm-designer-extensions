/**
 */
package org.omg.dd.dc;

import org.eclipse.emf.common.util.Enumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Alignment Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.dd.dc.DCPackage#getAlignmentKind()
 * @model
 * @generated
 */
public enum AlignmentKind implements Enumerator {
    /**
     * The '<em><b>Start</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #START_VALUE
     * @generated
     * @ordered
     */
    START(0, "start", "start"),

    /**
     * The '<em><b>End</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #END_VALUE
     * @generated
     * @ordered
     */
    END(1, "end", "end"),

    /**
     * The '<em><b>Center</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CENTER_VALUE
     * @generated
     * @ordered
     */
    CENTER(2, "center", "center");

    /**
     * The '<em><b>Start</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Start</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #START
     * @model name="start"
     * @generated
     * @ordered
     */
    public static final int START_VALUE = 0;

    /**
     * The '<em><b>End</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>End</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #END
     * @model name="end"
     * @generated
     * @ordered
     */
    public static final int END_VALUE = 1;

    /**
     * The '<em><b>Center</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Center</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CENTER
     * @model name="center"
     * @generated
     * @ordered
     */
    public static final int CENTER_VALUE = 2;

    /**
     * An array of all the '<em><b>Alignment Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AlignmentKind[] VALUES_ARRAY =
        new AlignmentKind[] {
            START,
            END,
            CENTER,
        };

    /**
     * A public read-only list of all the '<em><b>Alignment Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AlignmentKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Alignment Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AlignmentKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AlignmentKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Alignment Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AlignmentKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AlignmentKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Alignment Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AlignmentKind get(int value) {
        switch (value) {
            case START_VALUE: return START;
            case END_VALUE: return END;
            case CENTER_VALUE: return CENTER;
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
    private AlignmentKind(int value, String name, String literal) {
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
    
} //AlignmentKind
