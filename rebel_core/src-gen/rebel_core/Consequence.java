/**
 */
package rebel_core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.Consequence#getDescription <em>Description</em>}</li>
 *   <li>{@link rebel_core.Consequence#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getConsequence()
 * @model
 * @generated
 */
public interface Consequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see rebel_core.Rebel_corePackage#getConsequence_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rebel_core.Consequence#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.ConsequenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see rebel_core.ConsequenceType
	 * @see #setType(ConsequenceType)
	 * @see rebel_core.Rebel_corePackage#getConsequence_Type()
	 * @model
	 * @generated
	 */
	ConsequenceType getType();

	/**
	 * Sets the value of the '{@link rebel_core.Consequence#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rebel_core.ConsequenceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConsequenceType value);

} // Consequence
