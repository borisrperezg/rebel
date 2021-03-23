/**
 */
package rebel_core;

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
 *   <li>{@link rebel_core.MessageLog#getMsgLogMessages <em>Msg Log Messages</em>}</li>
 *   <li>{@link rebel_core.MessageLog#getType <em>Type</em>}</li>
 *   <li>{@link rebel_core.MessageLog#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link rebel_core.MessageLog#getTitle <em>Title</em>}</li>
 *   <li>{@link rebel_core.MessageLog#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getMessageLog()
 * @model
 * @generated
 */
public interface MessageLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Msg Log Messages</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.ChatEmailMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Log Messages</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getMessageLog_MsgLogMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChatEmailMessage> getMsgLogMessages();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.MessageLogType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see rebel_core.MessageLogType
	 * @see #setType(MessageLogType)
	 * @see rebel_core.Rebel_corePackage#getMessageLog_Type()
	 * @model
	 * @generated
	 */
	MessageLogType getType();

	/**
	 * Sets the value of the '{@link rebel_core.MessageLog#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rebel_core.MessageLogType
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageLogType value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see rebel_core.Rebel_corePackage#getMessageLog_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link rebel_core.MessageLog#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see rebel_core.Rebel_corePackage#getMessageLog_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link rebel_core.MessageLog#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see rebel_core.Rebel_corePackage#getMessageLog_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_core.MessageLog#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MessageLog
