/**
 */
package rebel_core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rebel_core.Rebel_corePackage#getStateType()
 * @model
 * @generated
 */
public enum StateType implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>PROPOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROPOSED(1, "PROPOSED", "PROPOSED"),

	/**
	 * The '<em><b>DEPRECATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEPRECATED(2, "DEPRECATED", "DEPRECATED"),

	/**
	 * The '<em><b>SUPERCEDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERCEDES_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERCEDES(3, "SUPERCEDES", "SUPERCEDES"),

	/**
	 * The '<em><b>REJECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(4, "REJECTED", "REJECTED"),

	/**
	 * The '<em><b>ACCEPTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(5, "ACCEPTED", "ACCEPTED");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>PROPOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROPOSED_VALUE = 1;

	/**
	 * The '<em><b>DEPRECATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPRECATED_VALUE = 2;

	/**
	 * The '<em><b>SUPERCEDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERCEDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUPERCEDES_VALUE = 3;

	/**
	 * The '<em><b>REJECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 4;

	/**
	 * The '<em><b>ACCEPTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 5;

	/**
	 * An array of all the '<em><b>State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StateType[] VALUES_ARRAY = new StateType[] { NONE, PROPOSED, DEPRECATED, SUPERCEDES, REJECTED,
			ACCEPTED, };

	/**
	 * A public read-only list of all the '<em><b>State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StateType get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case PROPOSED_VALUE:
			return PROPOSED;
		case DEPRECATED_VALUE:
			return DEPRECATED;
		case SUPERCEDES_VALUE:
			return SUPERCEDES;
		case REJECTED_VALUE:
			return REJECTED;
		case ACCEPTED_VALUE:
			return ACCEPTED;
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
	private StateType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //StateType
