/**
 */
package rebel_architecturaldecisions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_architecturaldecisions.UserStory#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getUserStory()
 * @model
 * @generated
 */
public interface UserStory extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getUserStory_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.UserStory#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // UserStory
