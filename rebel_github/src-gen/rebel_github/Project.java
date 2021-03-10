/**
 */
package rebel_github;

import java.util.Date;
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
 *   <li>{@link rebel_github.Project#getName <em>Name</em>}</li>
 *   <li>{@link rebel_github.Project#getMembers <em>Members</em>}</li>
 *   <li>{@link rebel_github.Project#getMessages <em>Messages</em>}</li>
 *   <li>{@link rebel_github.Project#getModelingDate <em>Modeling Date</em>}</li>
 * </ul>
 *
 * @see rebel_github.Rebel_githubPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_github.Rebel_githubPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_github.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_github.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see rebel_github.Rebel_githubPackage#getProject_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getMembers();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_github.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see rebel_github.Rebel_githubPackage#getProject_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Modeling Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Date</em>' attribute.
	 * @see #setModelingDate(Date)
	 * @see rebel_github.Rebel_githubPackage#getProject_ModelingDate()
	 * @model
	 * @generated
	 */
	Date getModelingDate();

	/**
	 * Sets the value of the '{@link rebel_github.Project#getModelingDate <em>Modeling Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Date</em>' attribute.
	 * @see #getModelingDate()
	 * @generated
	 */
	void setModelingDate(Date value);

} // Project
