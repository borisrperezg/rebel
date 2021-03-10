/**
 */
package rebel_componentandconnector;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Processing Model</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getProcessingModel()
 * @model
 * @generated
 */
public enum ProcessingModel implements Enumerator {
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
	* The '<em><b>BATCH</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #BATCH_VALUE
	* @generated
	* @ordered
	*/
	BATCH(1, "BATCH", "BATCH"),
	/**
	* The '<em><b>MICROBATCH</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #MICROBATCH_VALUE
	* @generated
	* @ordered
	*/
	MICROBATCH(2, "MICROBATCH", "MICROBATCH"),
	/**
	* The '<em><b>STREAM</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #STREAM_VALUE
	* @generated
	* @ordered
	*/
	STREAM(3, "STREAM", "STREAM");

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
	 * The '<em><b>BATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BATCH_VALUE = 1;

	/**
	 * The '<em><b>MICROBATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROBATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICROBATCH_VALUE = 2;

	/**
	 * The '<em><b>STREAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STREAM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Processing Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessingModel[] VALUES_ARRAY = new ProcessingModel[] { NONE, BATCH, MICROBATCH, STREAM, };

	/**
	 * A public read-only list of all the '<em><b>Processing Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessingModel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Processing Model</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingModel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingModel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Model</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingModel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingModel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Model</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingModel get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case BATCH_VALUE:
			return BATCH;
		case MICROBATCH_VALUE:
			return MICROBATCH;
		case STREAM_VALUE:
			return STREAM;
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
	private ProcessingModel(int value, String name, String literal) {
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

} //ProcessingModel
