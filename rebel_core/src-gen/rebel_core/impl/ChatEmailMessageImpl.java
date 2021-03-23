/**
 */
package rebel_core.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rebel_core.ChatEmailMessage;
import rebel_core.Rebel_corePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chat Email Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.impl.ChatEmailMessageImpl#getText <em>Text</em>}</li>
 *   <li>{@link rebel_core.impl.ChatEmailMessageImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link rebel_core.impl.ChatEmailMessageImpl#getSentBy <em>Sent By</em>}</li>
 *   <li>{@link rebel_core.impl.ChatEmailMessageImpl#getReceivedBy <em>Received By</em>}</li>
 *   <li>{@link rebel_core.impl.ChatEmailMessageImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChatEmailMessageImpl extends MinimalEObjectImpl.Container implements ChatEmailMessage {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSentBy() <em>Sent By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentBy()
	 * @generated
	 * @ordered
	 */
	protected static final String SENT_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSentBy() <em>Sent By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentBy()
	 * @generated
	 * @ordered
	 */
	protected String sentBy = SENT_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivedBy() <em>Received By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivedBy() <em>Received By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedBy()
	 * @generated
	 * @ordered
	 */
	protected String receivedBy = RECEIVED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChatEmailMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_corePackage.Literals.CHAT_EMAIL_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.CHAT_EMAIL_MESSAGE__TEXT, oldText,
					text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.CHAT_EMAIL_MESSAGE__TIMESTAMP,
					oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSentBy() {
		return sentBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSentBy(String newSentBy) {
		String oldSentBy = sentBy;
		sentBy = newSentBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.CHAT_EMAIL_MESSAGE__SENT_BY,
					oldSentBy, sentBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReceivedBy() {
		return receivedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivedBy(String newReceivedBy) {
		String oldReceivedBy = receivedBy;
		receivedBy = newReceivedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.CHAT_EMAIL_MESSAGE__RECEIVED_BY,
					oldReceivedBy, receivedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.CHAT_EMAIL_MESSAGE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__TEXT:
			return getText();
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__TIMESTAMP:
			return getTimestamp();
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__SENT_BY:
			return getSentBy();
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__RECEIVED_BY:
			return getReceivedBy();
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__TEXT:
			setText((String) newValue);
			return;
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__TIMESTAMP:
			setTimestamp((Date) newValue);
			return;
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__SENT_BY:
			setSentBy((String) newValue);
			return;
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__RECEIVED_BY:
			setReceivedBy((String) newValue);
			return;
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__ID:
			setId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__TIMESTAMP:
			setTimestamp(TIMESTAMP_EDEFAULT);
			return;
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__SENT_BY:
			setSentBy(SENT_BY_EDEFAULT);
			return;
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__RECEIVED_BY:
			setReceivedBy(RECEIVED_BY_EDEFAULT);
			return;
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__ID:
			setId(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__TIMESTAMP:
			return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__SENT_BY:
			return SENT_BY_EDEFAULT == null ? sentBy != null : !SENT_BY_EDEFAULT.equals(sentBy);
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__RECEIVED_BY:
			return RECEIVED_BY_EDEFAULT == null ? receivedBy != null : !RECEIVED_BY_EDEFAULT.equals(receivedBy);
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", sentBy: ");
		result.append(sentBy);
		result.append(", receivedBy: ");
		result.append(receivedBy);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ChatEmailMessageImpl
