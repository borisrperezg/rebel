/**
 */
package rebel_chatlogs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Log Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessageLogType()
 * @model
 * @generated
 */
public enum MessageLogType implements Enumerator {
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
	* The '<em><b>EMAIL</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #EMAIL_VALUE
	* @generated
	* @ordered
	*/
	EMAIL(1, "EMAIL", "EMAIL"),
	/**
	* The '<em><b>CHATLOG</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #CHATLOG_VALUE
	* @generated
	* @ordered
	*/
	CHATLOG(2, "CHATLOG", "CHATLOG");

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
	 * The '<em><b>EMAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 1;

	/**
	 * The '<em><b>CHATLOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHATLOG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHATLOG_VALUE = 2;

	/**
	 * An array of all the '<em><b>Message Log Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageLogType[] VALUES_ARRAY = new MessageLogType[] { NONE, EMAIL, CHATLOG, };

	/**
	 * A public read-only list of all the '<em><b>Message Log Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageLogType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Log Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageLogType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageLogType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Log Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageLogType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageLogType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Log Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageLogType get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case EMAIL_VALUE:
			return EMAIL;
		case CHATLOG_VALUE:
			return CHATLOG;
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
	private MessageLogType(int value, String name, String literal) {
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

} //MessageLogType
