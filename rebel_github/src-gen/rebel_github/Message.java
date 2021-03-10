/**
 */
package rebel_github;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_github.Message#getSubject <em>Subject</em>}</li>
 *   <li>{@link rebel_github.Message#getFooter <em>Footer</em>}</li>
 *   <li>{@link rebel_github.Message#getScope <em>Scope</em>}</li>
 *   <li>{@link rebel_github.Message#getBody <em>Body</em>}</li>
 *   <li>{@link rebel_github.Message#getType <em>Type</em>}</li>
 *   <li>{@link rebel_github.Message#getAction <em>Action</em>}</li>
 *   <li>{@link rebel_github.Message#getId <em>Id</em>}</li>
 *   <li>{@link rebel_github.Message#getDate <em>Date</em>}</li>
 *   <li>{@link rebel_github.Message#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see rebel_github.Rebel_githubPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see rebel_github.Rebel_githubPackage#getMessage_Subject()
	 * @model
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link rebel_github.Message#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' attribute.
	 * @see #setFooter(String)
	 * @see rebel_github.Rebel_githubPackage#getMessage_Footer()
	 * @model
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link rebel_github.Message#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see rebel_github.Rebel_githubPackage#getMessage_Scope()
	 * @model
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link rebel_github.Message#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see rebel_github.Rebel_githubPackage#getMessage_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link rebel_github.Message#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_github.OPERATIONTYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see rebel_github.OPERATIONTYPE
	 * @see #setType(OPERATIONTYPE)
	 * @see rebel_github.Rebel_githubPackage#getMessage_Type()
	 * @model
	 * @generated
	 */
	OPERATIONTYPE getType();

	/**
	 * Sets the value of the '{@link rebel_github.Message#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rebel_github.OPERATIONTYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(OPERATIONTYPE value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_github.ACTIONTYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see rebel_github.ACTIONTYPE
	 * @see #setAction(ACTIONTYPE)
	 * @see rebel_github.Rebel_githubPackage#getMessage_Action()
	 * @model
	 * @generated
	 */
	ACTIONTYPE getAction();

	/**
	 * Sets the value of the '{@link rebel_github.Message#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see rebel_github.ACTIONTYPE
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ACTIONTYPE value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see rebel_github.Rebel_githubPackage#getMessage_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_github.Message#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see rebel_github.Rebel_githubPackage#getMessage_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link rebel_github.Message#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rebel_github.Person#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see rebel_github.Rebel_githubPackage#getMessage_Person()
	 * @see rebel_github.Person#getMessages
	 * @model opposite="messages"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link rebel_github.Message#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // Message
