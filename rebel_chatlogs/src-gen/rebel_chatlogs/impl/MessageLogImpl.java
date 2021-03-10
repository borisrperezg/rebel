/**
 */
package rebel_chatlogs.impl;

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

import rebel_chatlogs.Message;
import rebel_chatlogs.MessageLog;
import rebel_chatlogs.MessageLogType;
import rebel_chatlogs.Rebel_chatlogsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_chatlogs.impl.MessageLogImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link rebel_chatlogs.impl.MessageLogImpl#getType <em>Type</em>}</li>
 *   <li>{@link rebel_chatlogs.impl.MessageLogImpl#getCreation <em>Creation</em>}</li>
 *   <li>{@link rebel_chatlogs.impl.MessageLogImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageLogImpl extends MinimalEObjectImpl.Container implements MessageLog {
	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

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
	 * The default value of the '{@link #getCreation() <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreation() <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected Date creation = CREATION_EDEFAULT;

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
		return Rebel_chatlogsPackage.Literals.MESSAGE_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Message>(Message.class, this,
					Rebel_chatlogsPackage.MESSAGE_LOG__MESSAGES);
		}
		return messages;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_chatlogsPackage.MESSAGE_LOG__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreation() {
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreation(Date newCreation) {
		Date oldCreation = creation;
		creation = newCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_chatlogsPackage.MESSAGE_LOG__CREATION,
					oldCreation, creation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_chatlogsPackage.MESSAGE_LOG__TITLE, oldTitle,
					title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_chatlogsPackage.MESSAGE_LOG__MESSAGES:
			return ((InternalEList<?>) getMessages()).basicRemove(otherEnd, msgs);
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
		case Rebel_chatlogsPackage.MESSAGE_LOG__MESSAGES:
			return getMessages();
		case Rebel_chatlogsPackage.MESSAGE_LOG__TYPE:
			return getType();
		case Rebel_chatlogsPackage.MESSAGE_LOG__CREATION:
			return getCreation();
		case Rebel_chatlogsPackage.MESSAGE_LOG__TITLE:
			return getTitle();
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
		case Rebel_chatlogsPackage.MESSAGE_LOG__MESSAGES:
			getMessages().clear();
			getMessages().addAll((Collection<? extends Message>) newValue);
			return;
		case Rebel_chatlogsPackage.MESSAGE_LOG__TYPE:
			setType((MessageLogType) newValue);
			return;
		case Rebel_chatlogsPackage.MESSAGE_LOG__CREATION:
			setCreation((Date) newValue);
			return;
		case Rebel_chatlogsPackage.MESSAGE_LOG__TITLE:
			setTitle((String) newValue);
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
		case Rebel_chatlogsPackage.MESSAGE_LOG__MESSAGES:
			getMessages().clear();
			return;
		case Rebel_chatlogsPackage.MESSAGE_LOG__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Rebel_chatlogsPackage.MESSAGE_LOG__CREATION:
			setCreation(CREATION_EDEFAULT);
			return;
		case Rebel_chatlogsPackage.MESSAGE_LOG__TITLE:
			setTitle(TITLE_EDEFAULT);
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
		case Rebel_chatlogsPackage.MESSAGE_LOG__MESSAGES:
			return messages != null && !messages.isEmpty();
		case Rebel_chatlogsPackage.MESSAGE_LOG__TYPE:
			return type != TYPE_EDEFAULT;
		case Rebel_chatlogsPackage.MESSAGE_LOG__CREATION:
			return CREATION_EDEFAULT == null ? creation != null : !CREATION_EDEFAULT.equals(creation);
		case Rebel_chatlogsPackage.MESSAGE_LOG__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(", creation: ");
		result.append(creation);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //MessageLogImpl
