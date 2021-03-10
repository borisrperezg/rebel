/**
 */
package rebel_core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ELEMENTTYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rebel_core.Rebel_corePackage#getELEMENTTYPE()
 * @model
 * @generated
 */
public enum ELEMENTTYPE implements Enumerator {
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
	 * The '<em><b>BUSINESS SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_SERVICE(1, "BUSINESS_SERVICE", "BUSINESS_SERVICE"),

	/**
	 * The '<em><b>APPLICATION SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_SERVICE(2, "APPLICATION_SERVICE", "APPLICATION_SERVICE"),

	/**
	 * The '<em><b>DEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(3, "DEVICE", "DEVICE"),

	/**
	 * The '<em><b>ASSESSMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSESSMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSESSMENT(4, "ASSESSMENT", "ASSESSMENT"),

	/**
	 * The '<em><b>APPLICATION COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_COMPONENT(5, "APPLICATION_COMPONENT", "APPLICATION_COMPONENT"),

	/**
	 * The '<em><b>BUSINESS PROCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_PROCESS(6, "BUSINESS_PROCESS", "BUSINESS_PROCESS"),
	/**
	 * The '<em><b>APPLICATION COLLABORATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #APPLICATION_COLLABORATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_COLLABORATION(7, "APPLICATION_COLLABORATION", "APPLICATION_COLLABORATION"),
	/**
	 * The '<em><b>DATAOBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DATAOBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	DATAOBJECT(8, "DATAOBJECT", "DATAOBJECT"),
	/**
	 * The '<em><b>MOTIVATION STAKEHOLDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MOTIVATION_STAKEHOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	MOTIVATION_STAKEHOLDER(9, "MOTIVATION_STAKEHOLDER", "MOTIVATION_STAKEHOLDER"),
	/**
	 * The '<em><b>MOTIVATION DRIVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MOTIVATION_DRIVER_VALUE
	 * @generated
	 * @ordered
	 */
	MOTIVATION_DRIVER(10, "MOTIVATION_DRIVER", "MOTIVATION_DRIVER"),
	/**
	 * The '<em><b>MOTIVATION GOAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MOTIVATION_GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	MOTIVATION_GOAL(11, "MOTIVATION_GOAL", "MOTIVATION_GOAL"),
	/**
	 * The '<em><b>MOTIVATION OUTCOME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MOTIVATION_OUTCOME_VALUE
	 * @generated
	 * @ordered
	 */
	MOTIVATION_OUTCOME(12, "MOTIVATION_OUTCOME", "MOTIVATION_OUTCOME"),
	/**
	 * The '<em><b>MOTIVATION REQUIREMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MOTIVATION_REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MOTIVATION_REQUIREMENT(13, "MOTIVATION_REQUIREMENT", "MOTIVATION_REQUIREMENT"),
	/**
	 * The '<em><b>BUSINESS COLLABORATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_COLLABORATION_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_COLLABORATION(14, "BUSINESS_COLLABORATION", "BUSINESS_COLLABORATION"),
	/**
	 * The '<em><b>APPLICATION INTERFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #APPLICATION_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_INTERFACE(15, "APPLICATION_INTERFACE", "APPLICATION_INTERFACE");

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
	 * The '<em><b>BUSINESS SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_SERVICE_VALUE = 1;

	/**
	 * The '<em><b>APPLICATION SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_SERVICE_VALUE = 2;

	/**
	 * The '<em><b>DEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 3;

	/**
	 * The '<em><b>ASSESSMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSESSMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSESSMENT_VALUE = 4;

	/**
	 * The '<em><b>APPLICATION COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_COMPONENT_VALUE = 5;

	/**
	 * The '<em><b>BUSINESS PROCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_PROCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_PROCESS_VALUE = 6;

	/**
	 * The '<em><b>APPLICATION COLLABORATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_COLLABORATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_COLLABORATION_VALUE = 7;

	/**
	 * The '<em><b>DATAOBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATAOBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATAOBJECT_VALUE = 8;

	/**
	 * The '<em><b>MOTIVATION STAKEHOLDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION_STAKEHOLDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTIVATION_STAKEHOLDER_VALUE = 9;

	/**
	 * The '<em><b>MOTIVATION DRIVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION_DRIVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTIVATION_DRIVER_VALUE = 10;

	/**
	 * The '<em><b>MOTIVATION GOAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION_GOAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTIVATION_GOAL_VALUE = 11;

	/**
	 * The '<em><b>MOTIVATION OUTCOME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION_OUTCOME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTIVATION_OUTCOME_VALUE = 12;

	/**
	 * The '<em><b>MOTIVATION REQUIREMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION_REQUIREMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTIVATION_REQUIREMENT_VALUE = 13;

	/**
	 * The '<em><b>BUSINESS COLLABORATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_COLLABORATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_COLLABORATION_VALUE = 14;

	/**
	 * The '<em><b>APPLICATION INTERFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_INTERFACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_INTERFACE_VALUE = 15;

	/**
	 * An array of all the '<em><b>ELEMENTTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ELEMENTTYPE[] VALUES_ARRAY = new ELEMENTTYPE[] { NONE, BUSINESS_SERVICE, APPLICATION_SERVICE,
			DEVICE, ASSESSMENT, APPLICATION_COMPONENT, BUSINESS_PROCESS, APPLICATION_COLLABORATION, DATAOBJECT,
			MOTIVATION_STAKEHOLDER, MOTIVATION_DRIVER, MOTIVATION_GOAL, MOTIVATION_OUTCOME, MOTIVATION_REQUIREMENT,
			BUSINESS_COLLABORATION, APPLICATION_INTERFACE, };

	/**
	 * A public read-only list of all the '<em><b>ELEMENTTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ELEMENTTYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ELEMENTTYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ELEMENTTYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ELEMENTTYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ELEMENTTYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ELEMENTTYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ELEMENTTYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ELEMENTTYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ELEMENTTYPE get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case BUSINESS_SERVICE_VALUE:
			return BUSINESS_SERVICE;
		case APPLICATION_SERVICE_VALUE:
			return APPLICATION_SERVICE;
		case DEVICE_VALUE:
			return DEVICE;
		case ASSESSMENT_VALUE:
			return ASSESSMENT;
		case APPLICATION_COMPONENT_VALUE:
			return APPLICATION_COMPONENT;
		case BUSINESS_PROCESS_VALUE:
			return BUSINESS_PROCESS;
		case APPLICATION_COLLABORATION_VALUE:
			return APPLICATION_COLLABORATION;
		case DATAOBJECT_VALUE:
			return DATAOBJECT;
		case MOTIVATION_STAKEHOLDER_VALUE:
			return MOTIVATION_STAKEHOLDER;
		case MOTIVATION_DRIVER_VALUE:
			return MOTIVATION_DRIVER;
		case MOTIVATION_GOAL_VALUE:
			return MOTIVATION_GOAL;
		case MOTIVATION_OUTCOME_VALUE:
			return MOTIVATION_OUTCOME;
		case MOTIVATION_REQUIREMENT_VALUE:
			return MOTIVATION_REQUIREMENT;
		case BUSINESS_COLLABORATION_VALUE:
			return BUSINESS_COLLABORATION;
		case APPLICATION_INTERFACE_VALUE:
			return APPLICATION_INTERFACE;
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
	private ELEMENTTYPE(int value, String name, String literal) {
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

} //ELEMENTTYPE
