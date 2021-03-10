/**
 */
package rebel_chatlogs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_chatlogs.Project#getMessagelogs <em>Messagelogs</em>}</li>
 *   <li>{@link rebel_chatlogs.Project#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see rebel_chatlogs.Rebel_chatlogsPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Messagelogs</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_chatlogs.MessageLog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messagelogs</em>' containment reference list.
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getProject_Messagelogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageLog> getMessagelogs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Project
