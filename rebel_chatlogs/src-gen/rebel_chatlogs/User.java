/**
 */
package rebel_chatlogs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_chatlogs.User#getSend <em>Send</em>}</li>
 *   <li>{@link rebel_chatlogs.User#getReceive <em>Receive</em>}</li>
 *   <li>{@link rebel_chatlogs.User#getName <em>Name</em>}</li>
 *   <li>{@link rebel_chatlogs.User#getCellPhone <em>Cell Phone</em>}</li>
 *   <li>{@link rebel_chatlogs.User#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see rebel_chatlogs.Rebel_chatlogsPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Send</b></em>' reference list.
	 * The list contents are of type {@link rebel_chatlogs.Message}.
	 * It is bidirectional and its opposite is '{@link rebel_chatlogs.Message#getSendBy <em>Send By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send</em>' reference list.
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getUser_Send()
	 * @see rebel_chatlogs.Message#getSendBy
	 * @model opposite="sendBy"
	 * @generated
	 */
	EList<Message> getSend();

	/**
	 * Returns the value of the '<em><b>Receive</b></em>' reference list.
	 * The list contents are of type {@link rebel_chatlogs.Message}.
	 * It is bidirectional and its opposite is '{@link rebel_chatlogs.Message#getReceivedBy <em>Received By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive</em>' reference list.
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getUser_Receive()
	 * @see rebel_chatlogs.Message#getReceivedBy
	 * @model opposite="receivedBy"
	 * @generated
	 */
	EList<Message> getReceive();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cell Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Phone</em>' attribute.
	 * @see #setCellPhone(int)
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getUser_CellPhone()
	 * @model
	 * @generated
	 */
	int getCellPhone();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.User#getCellPhone <em>Cell Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Phone</em>' attribute.
	 * @see #getCellPhone()
	 * @generated
	 */
	void setCellPhone(int value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getUser_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // User
