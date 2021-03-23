/**
 */
package rebel_core;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chat Email Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.ChatEmailMessage#getText <em>Text</em>}</li>
 *   <li>{@link rebel_core.ChatEmailMessage#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link rebel_core.ChatEmailMessage#getSentBy <em>Sent By</em>}</li>
 *   <li>{@link rebel_core.ChatEmailMessage#getReceivedBy <em>Received By</em>}</li>
 *   <li>{@link rebel_core.ChatEmailMessage#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getChatEmailMessage()
 * @model
 * @generated
 */
public interface ChatEmailMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see rebel_core.Rebel_corePackage#getChatEmailMessage_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link rebel_core.ChatEmailMessage#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see rebel_core.Rebel_corePackage#getChatEmailMessage_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link rebel_core.ChatEmailMessage#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Sent By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent By</em>' attribute.
	 * @see #setSentBy(String)
	 * @see rebel_core.Rebel_corePackage#getChatEmailMessage_SentBy()
	 * @model
	 * @generated
	 */
	String getSentBy();

	/**
	 * Sets the value of the '{@link rebel_core.ChatEmailMessage#getSentBy <em>Sent By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent By</em>' attribute.
	 * @see #getSentBy()
	 * @generated
	 */
	void setSentBy(String value);

	/**
	 * Returns the value of the '<em><b>Received By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received By</em>' attribute.
	 * @see #setReceivedBy(String)
	 * @see rebel_core.Rebel_corePackage#getChatEmailMessage_ReceivedBy()
	 * @model
	 * @generated
	 */
	String getReceivedBy();

	/**
	 * Sets the value of the '{@link rebel_core.ChatEmailMessage#getReceivedBy <em>Received By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received By</em>' attribute.
	 * @see #getReceivedBy()
	 * @generated
	 */
	void setReceivedBy(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see rebel_core.Rebel_corePackage#getChatEmailMessage_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_core.ChatEmailMessage#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ChatEmailMessage