/**
 */
package rebel_chatlogs;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_chatlogs.MessageLog#getMessages <em>Messages</em>}</li>
 *   <li>{@link rebel_chatlogs.MessageLog#getType <em>Type</em>}</li>
 *   <li>{@link rebel_chatlogs.MessageLog#getCreation <em>Creation</em>}</li>
 *   <li>{@link rebel_chatlogs.MessageLog#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessageLog()
 * @model
 * @generated
 */
public interface MessageLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_chatlogs.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessageLog_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_chatlogs.MessageLogType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see rebel_chatlogs.MessageLogType
	 * @see #setType(MessageLogType)
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessageLog_Type()
	 * @model
	 * @generated
	 */
	MessageLogType getType();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.MessageLog#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rebel_chatlogs.MessageLogType
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageLogType value);

	/**
	 * Returns the value of the '<em><b>Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation</em>' attribute.
	 * @see #setCreation(Date)
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessageLog_Creation()
	 * @model
	 * @generated
	 */
	Date getCreation();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.MessageLog#getCreation <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation</em>' attribute.
	 * @see #getCreation()
	 * @generated
	 */
	void setCreation(Date value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessageLog_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.MessageLog#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // MessageLog
