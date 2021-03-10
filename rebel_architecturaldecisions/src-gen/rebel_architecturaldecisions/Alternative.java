/**
 */
package rebel_architecturaldecisions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_architecturaldecisions.Alternative#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getAlternative_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.Alternative#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Alternative
