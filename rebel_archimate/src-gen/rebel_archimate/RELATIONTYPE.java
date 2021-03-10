/**
 */
package rebel_archimate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>RELATIONTYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rebel_archimate.Rebel_archimatePackage#getRELATIONTYPE()
 * @model
 * @generated
 */
public enum RELATIONTYPE implements Enumerator {
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
	 * The '<em><b>REALIZATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	REALIZATION(1, "REALIZATION", "REALIZATION"),

	/**
	 * The '<em><b>INFLUENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFLUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	INFLUENCE(2, "INFLUENCE", "INFLUENCE"),

	/**
	 * The '<em><b>AGGREGATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATION(3, "AGGREGATION", "AGGREGATION"),
	/**
	 * The '<em><b>TRIGGERING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGERING_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGERING(4, "TRIGGERING", "TRIGGERING"),
	/**
	 * The '<em><b>SERVING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SERVING_VALUE
	 * @generated
	 * @ordered
	 */
	SERVING(5, "SERVING", "SERVING"),
	/**
	 * The '<em><b>ACCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS(6, "ACCESS", "ACCESS"),
	/**
	 * The '<em><b>COMPOSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION(7, "COMPOSITION", "COMPOSITION"),
	/**
	 * The '<em><b>ASSOCIATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATION(8, "ASSOCIATION", "ASSOCIATION");

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
	 * The '<em><b>REALIZATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALIZATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REALIZATION_VALUE = 1;

	/**
	 * The '<em><b>INFLUENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFLUENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFLUENCE_VALUE = 2;

	/**
	 * The '<em><b>AGGREGATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATION_VALUE = 3;

	/**
	 * The '<em><b>TRIGGERING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGERING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGERING_VALUE = 4;

	/**
	 * The '<em><b>SERVING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVING_VALUE = 5;

	/**
	 * The '<em><b>ACCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_VALUE = 6;

	/**
	 * The '<em><b>COMPOSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_VALUE = 7;

	/**
	 * The '<em><b>ASSOCIATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_VALUE = 8;

	/**
	 * An array of all the '<em><b>RELATIONTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RELATIONTYPE[] VALUES_ARRAY = new RELATIONTYPE[] { NONE, REALIZATION, INFLUENCE, AGGREGATION,
			TRIGGERING, SERVING, ACCESS, COMPOSITION, ASSOCIATION, };

	/**
	 * A public read-only list of all the '<em><b>RELATIONTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RELATIONTYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>RELATIONTYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RELATIONTYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RELATIONTYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>RELATIONTYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RELATIONTYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RELATIONTYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>RELATIONTYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RELATIONTYPE get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case REALIZATION_VALUE:
			return REALIZATION;
		case INFLUENCE_VALUE:
			return INFLUENCE;
		case AGGREGATION_VALUE:
			return AGGREGATION;
		case TRIGGERING_VALUE:
			return TRIGGERING;
		case SERVING_VALUE:
			return SERVING;
		case ACCESS_VALUE:
			return ACCESS;
		case COMPOSITION_VALUE:
			return COMPOSITION;
		case ASSOCIATION_VALUE:
			return ASSOCIATION;
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
	private RELATIONTYPE(int value, String name, String literal) {
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

} //RELATIONTYPE
