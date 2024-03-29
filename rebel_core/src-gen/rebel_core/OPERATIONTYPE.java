/**
 */
package rebel_core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OPERATIONTYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rebel_core.Rebel_corePackage#getOPERATIONTYPE()
 * @model
 * @generated
 */
public enum OPERATIONTYPE implements Enumerator {
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
	 * The '<em><b>FIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIX_VALUE
	 * @generated
	 * @ordered
	 */
	FIX(1, "FIX", "FIX"),

	/**
	 * The '<em><b>REFACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	REFACTOR(2, "REFACTOR", "REFACTOR"),

	/**
	 * The '<em><b>MODELS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODELS_VALUE
	 * @generated
	 * @ordered
	 */
	MODELS(3, "MODELS", "MODELS"),

	/**
	 * The '<em><b>DOCS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCS_VALUE
	 * @generated
	 * @ordered
	 */
	DOCS(4, "DOCS", "DOCS"),

	/**
	 * The '<em><b>FEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEAT_VALUE
	 * @generated
	 * @ordered
	 */
	FEAT(5, "FEAT", "FEAT");

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
	 * The '<em><b>FIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIX_VALUE = 1;

	/**
	 * The '<em><b>REFACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFACTOR_VALUE = 2;

	/**
	 * The '<em><b>MODELS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODELS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODELS_VALUE = 3;

	/**
	 * The '<em><b>DOCS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOCS_VALUE = 4;

	/**
	 * The '<em><b>FEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEAT_VALUE = 5;

	/**
	 * An array of all the '<em><b>OPERATIONTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OPERATIONTYPE[] VALUES_ARRAY = new OPERATIONTYPE[] { NONE, FIX, REFACTOR, MODELS, DOCS,
			FEAT, };

	/**
	 * A public read-only list of all the '<em><b>OPERATIONTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OPERATIONTYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OPERATIONTYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OPERATIONTYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OPERATIONTYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OPERATIONTYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OPERATIONTYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OPERATIONTYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OPERATIONTYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OPERATIONTYPE get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case FIX_VALUE:
			return FIX;
		case REFACTOR_VALUE:
			return REFACTOR;
		case MODELS_VALUE:
			return MODELS;
		case DOCS_VALUE:
			return DOCS;
		case FEAT_VALUE:
			return FEAT;
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
	private OPERATIONTYPE(int value, String name, String literal) {
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

} //OPERATIONTYPE
