/**
 */
package rebel_core.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rebel_core.ChatEmailMessage;
import rebel_core.MessageLog;
import rebel_core.MessageLogType;
import rebel_core.Rebel_corePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.impl.MessageLogImpl#getMsgLogMessages <em>Msg Log Messages</em>}</li>
 *   <li>{@link rebel_core.impl.MessageLogImpl#getType <em>Type</em>}</li>
 *   <li>{@link rebel_core.impl.MessageLogImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link rebel_core.impl.MessageLogImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link rebel_core.impl.MessageLogImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageLogImpl extends MinimalEObjectImpl.Container implements MessageLog {
	/**
	 * The cached value of the '{@link #getMsgLogMessages() <em>Msg Log Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgLogMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<ChatEmailMessage> msgLogMessages;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MessageLogType TYPE_EDEFAULT = MessageLogType.NONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MessageLogType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	protected MessageLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_corePackage.Literals.MESSAGE_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChatEmailMessage> getMsgLogMessages() {
		if (msgLogMessages == null) {
			msgLogMessages = new EObjectContainmentEList<ChatEmailMessage>(ChatEmailMessage.class, this,
					Rebel_corePackage.MESSAGE_LOG__MSG_LOG_MESSAGES);
		}
		return msgLogMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageLogType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(MessageLogType newType) {
		MessageLogType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.MESSAGE_LOG__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.MESSAGE_LOG__CREATION_DATE,
					oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.MESSAGE_LOG__TITLE, oldTitle,
					title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.MESSAGE_LOG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_corePackage.MESSAGE_LOG__MSG_LOG_MESSAGES:
			return ((InternalEList<?>) getMsgLogMessages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Rebel_corePackage.MESSAGE_LOG__MSG_LOG_MESSAGES:
			return getMsgLogMessages();
		case Rebel_corePackage.MESSAGE_LOG__TYPE:
			return getType();
		case Rebel_corePackage.MESSAGE_LOG__CREATION_DATE:
			return getCreationDate();
		case Rebel_corePackage.MESSAGE_LOG__TITLE:
			return getTitle();
		case Rebel_corePackage.MESSAGE_LOG__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Rebel_corePackage.MESSAGE_LOG__MSG_LOG_MESSAGES:
			getMsgLogMessages().clear();
			getMsgLogMessages().addAll((Collection<? extends ChatEmailMessage>) newValue);
			return;
		case Rebel_corePackage.MESSAGE_LOG__TYPE:
			setType((MessageLogType) newValue);
			return;
		case Rebel_corePackage.MESSAGE_LOG__CREATION_DATE:
			setCreationDate((Date) newValue);
			return;
		case Rebel_corePackage.MESSAGE_LOG__TITLE:
			setTitle((String) newValue);
			return;
		case Rebel_corePackage.MESSAGE_LOG__ID:
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
		case Rebel_corePackage.MESSAGE_LOG__MSG_LOG_MESSAGES:
			getMsgLogMessages().clear();
			return;
		case Rebel_corePackage.MESSAGE_LOG__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Rebel_corePackage.MESSAGE_LOG__CREATION_DATE:
			setCreationDate(CREATION_DATE_EDEFAULT);
			return;
		case Rebel_corePackage.MESSAGE_LOG__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case Rebel_corePackage.MESSAGE_LOG__ID:
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
		case Rebel_corePackage.MESSAGE_LOG__MSG_LOG_MESSAGES:
			return msgLogMessages != null && !msgLogMessages.isEmpty();
		case Rebel_corePackage.MESSAGE_LOG__TYPE:
			return type != TYPE_EDEFAULT;
		case Rebel_corePackage.MESSAGE_LOG__CREATION_DATE:
			return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
		case Rebel_corePackage.MESSAGE_LOG__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case Rebel_corePackage.MESSAGE_LOG__ID:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", title: ");
		result.append(title);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MessageLogImpl