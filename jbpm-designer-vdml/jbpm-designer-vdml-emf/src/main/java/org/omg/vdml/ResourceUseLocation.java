/**
 */
package org.omg.vdml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Use Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.vdml.VDMLPackage#getResourceUseLocation()
 * @model
 * @generated
 */
public enum ResourceUseLocation implements Enumerator {
	/**
	 * The '<em><b>Role Participant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_PARTICIPANT_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE_PARTICIPANT(0, "roleParticipant", "roleParticipant"),

	/**
	 * The '<em><b>Providing Store</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDING_STORE_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDING_STORE(1, "providingStore", "providingStore"),

	/**
	 * The '<em><b>Receiving Store</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVING_STORE_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVING_STORE(2, "receivingStore", "receivingStore"),

	/**
	 * The '<em><b>Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(3, "resource", "resource"),

	/**
	 * The '<em><b>Collaboration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLABORATION(4, "collaboration", "collaboration");

	/**
	 * The '<em><b>Role Participant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Role Participant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROLE_PARTICIPANT
	 * @model name="roleParticipant"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_PARTICIPANT_VALUE = 0;

	/**
	 * The '<em><b>Providing Store</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Providing Store</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDING_STORE
	 * @model name="providingStore"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDING_STORE_VALUE = 1;

	/**
	 * The '<em><b>Receiving Store</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Receiving Store</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEIVING_STORE
	 * @model name="receivingStore"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVING_STORE_VALUE = 2;

	/**
	 * The '<em><b>Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE
	 * @model name="resource"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 3;

	/**
	 * The '<em><b>Collaboration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collaboration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION
	 * @model name="collaboration"
	 * @generated
	 * @ordered
	 */
	public static final int COLLABORATION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Resource Use Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceUseLocation[] VALUES_ARRAY =
		new ResourceUseLocation[] {
			ROLE_PARTICIPANT,
			PROVIDING_STORE,
			RECEIVING_STORE,
			RESOURCE,
			COLLABORATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Use Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceUseLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Use Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceUseLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceUseLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Use Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceUseLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceUseLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Use Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceUseLocation get(int value) {
		switch (value) {
			case ROLE_PARTICIPANT_VALUE: return ROLE_PARTICIPANT;
			case PROVIDING_STORE_VALUE: return PROVIDING_STORE;
			case RECEIVING_STORE_VALUE: return RECEIVING_STORE;
			case RESOURCE_VALUE: return RESOURCE;
			case COLLABORATION_VALUE: return COLLABORATION;
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
	private ResourceUseLocation(int value, String name, String literal) {
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
	
} //ResourceUseLocation
