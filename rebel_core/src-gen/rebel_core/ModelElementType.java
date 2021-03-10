/**
 */
package rebel_core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rebel_core.Rebel_corePackage#getModelElementType()
 * @model
 * @generated
 */
public enum ModelElementType implements Enumerator {
	/**
	 * The '<em><b>COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(0, "COMPONENT", "COMPONENT"),

	/**
	 * The '<em><b>CONNECTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTOR(1, "CONNECTOR", "CONNECTOR"),
	/**
	 * The '<em><b>ARCHIMATE ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ARCHIMATE_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIMATE_ELEMENT(2, "ARCHIMATE_ELEMENT", "ARCHIMATE_ELEMENT"),
	/**
	 * The '<em><b>ARCHIMATE RELATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ARCHIMATE_RELATION_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIMATE_RELATION(3, "ARCHIMATE_RELATION", "ARCHIMATE_RELATION");

	/**
	 * The '<em><b>COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 0;

	/**
	 * The '<em><b>CONNECTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR_VALUE = 1;

	/**
	 * The '<em><b>ARCHIMATE ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIMATE_ELEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIMATE_ELEMENT_VALUE = 2;

	/**
	 * The '<em><b>ARCHIMATE RELATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIMATE_RELATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIMATE_RELATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Model Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelElementType[] VALUES_ARRAY = new ModelElementType[] { COMPONENT, CONNECTOR,
			ARCHIMATE_ELEMENT, ARCHIMATE_RELATION, };

	/**
	 * A public read-only list of all the '<em><b>Model Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelElementType get(int value) {
		switch (value) {
		case COMPONENT_VALUE:
			return COMPONENT;
		case CONNECTOR_VALUE:
			return CONNECTOR;
		case ARCHIMATE_ELEMENT_VALUE:
			return ARCHIMATE_ELEMENT;
		case ARCHIMATE_RELATION_VALUE:
			return ARCHIMATE_RELATION;
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
	private ModelElementType(int value, String name, String literal) {
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

} //ModelElementType
