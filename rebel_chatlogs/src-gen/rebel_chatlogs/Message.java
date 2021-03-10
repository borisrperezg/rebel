/**
 */
package rebel_chatlogs;

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
 *   <li>{@link rebel_chatlogs.Message#getText <em>Text</em>}</li>
 *   <li>{@link rebel_chatlogs.Message#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link rebel_chatlogs.Message#getSentBy <em>Sent By</em>}</li>
 *   <li>{@link rebel_chatlogs.Message#getReceivedBy <em>Received By</em>}</li>
 * </ul>
 *
 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Received By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received By</em>' attribute.
	 * @see #setReceivedBy(String)
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessage_ReceivedBy()
	 * @model
	 * @generated
	 */
	String getReceivedBy();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.Message#getReceivedBy <em>Received By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received By</em>' attribute.
	 * @see #getReceivedBy()
	 * @generated
	 */
	void setReceivedBy(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessage_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.Message#getText <em>Text</em>}' attribute.
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
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessage_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.Message#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * @see rebel_chatlogs.Rebel_chatlogsPackage#getMessage_SentBy()
	 * @model
	 * @generated
	 */
	String getSentBy();

	/**
	 * Sets the value of the '{@link rebel_chatlogs.Message#getSentBy <em>Sent By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent By</em>' attribute.
	 * @see #getSentBy()
	 * @generated
	 */
	void setSentBy(String value);

} // Message
