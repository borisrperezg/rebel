/**
 */
package rebel_componentandconnector.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rebel_componentandconnector.Buffering;
import rebel_componentandconnector.Connector;
import rebel_componentandconnector.DeliveryModel;
import rebel_componentandconnector.NotificationModel;
import rebel_componentandconnector.Rebel_componentandconnectorPackage;
import rebel_componentandconnector.Role;
import rebel_componentandconnector.SyncType;
import rebel_componentandconnector.Throughput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getNotification <em>Notification</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getBuffering <em>Buffering</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getProps <em>Props</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getId <em>Id</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ConnectorImpl#getSync <em>Sync</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelivery() <em>Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected static final DeliveryModel DELIVERY_EDEFAULT = DeliveryModel.NONE;

	/**
	 * The cached value of the '{@link #getDelivery() <em>Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected DeliveryModel delivery = DELIVERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotification() <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationModel NOTIFICATION_EDEFAULT = NotificationModel.NONE;

	/**
	 * The cached value of the '{@link #getNotification() <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification()
	 * @generated
	 * @ordered
	 */
	protected NotificationModel notification = NOTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuffering() <em>Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffering()
	 * @generated
	 * @ordered
	 */
	protected static final Buffering BUFFERING_EDEFAULT = Buffering.NONE;

	/**
	 * The cached value of the '{@link #getBuffering() <em>Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffering()
	 * @generated
	 * @ordered
	 */
	protected Buffering buffering = BUFFERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final Throughput THROUGHPUT_EDEFAULT = Throughput.NONE;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected Throughput throughput = THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProps() <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProps() <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected String props = PROPS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

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
	 * The default value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected static final String POS_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected String posX = POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected static final String POS_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected String posY = POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getSync() <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSync()
	 * @generated
	 * @ordered
	 */
	protected static final SyncType SYNC_EDEFAULT = SyncType.NONE;

	/**
	 * The cached value of the '{@link #getSync() <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSync()
	 * @generated
	 * @ordered
	 */
	protected SyncType sync = SYNC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_componentandconnectorPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.CONNECTOR__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeliveryModel getDelivery() {
		return delivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelivery(DeliveryModel newDelivery) {
		DeliveryModel oldDelivery = delivery;
		delivery = newDelivery == null ? DELIVERY_EDEFAULT : newDelivery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Rebel_componentandconnectorPackage.CONNECTOR__DELIVERY, oldDelivery, delivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyncType getSync() {
		return sync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSync(SyncType newSync) {
		SyncType oldSync = sync;
		sync = newSync == null ? SYNC_EDEFAULT : newSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.CONNECTOR__SYNC,
					oldSync, sync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationModel getNotification() {
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotification(NotificationModel newNotification) {
		NotificationModel oldNotification = notification;
		notification = newNotification == null ? NOTIFICATION_EDEFAULT : newNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Rebel_componentandconnectorPackage.CONNECTOR__NOTIFICATION, oldNotification, notification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Buffering getBuffering() {
		return buffering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuffering(Buffering newBuffering) {
		Buffering oldBuffering = buffering;
		buffering = newBuffering == null ? BUFFERING_EDEFAULT : newBuffering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Rebel_componentandconnectorPackage.CONNECTOR__BUFFERING, oldBuffering, buffering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Throughput getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThroughput(Throughput newThroughput) {
		Throughput oldThroughput = throughput;
		throughput = newThroughput == null ? THROUGHPUT_EDEFAULT : newThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Rebel_componentandconnectorPackage.CONNECTOR__THROUGHPUT, oldThroughput, throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Rebel_componentandconnectorPackage.CONNECTOR__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProps() {
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProps(String newProps) {
		String oldProps = props;
		props = newProps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.CONNECTOR__PROPS,
					oldProps, props));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this,
					Rebel_componentandconnectorPackage.CONNECTOR__ROLES);
		}
		return roles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.CONNECTOR__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPosX() {
		return posX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosX(String newPosX) {
		String oldPosX = posX;
		posX = newPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.CONNECTOR__POS_X,
					oldPosX, posX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPosY() {
		return posY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosY(String newPosY) {
		String oldPosY = posY;
		posY = newPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.CONNECTOR__POS_Y,
					oldPosY, posY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_componentandconnectorPackage.CONNECTOR__ROLES:
			return ((InternalEList<?>) getRoles()).basicRemove(otherEnd, msgs);
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
		case Rebel_componentandconnectorPackage.CONNECTOR__NAME:
			return getName();
		case Rebel_componentandconnectorPackage.CONNECTOR__DELIVERY:
			return getDelivery();
		case Rebel_componentandconnectorPackage.CONNECTOR__NOTIFICATION:
			return getNotification();
		case Rebel_componentandconnectorPackage.CONNECTOR__BUFFERING:
			return getBuffering();
		case Rebel_componentandconnectorPackage.CONNECTOR__THROUGHPUT:
			return getThroughput();
		case Rebel_componentandconnectorPackage.CONNECTOR__PROTOCOL:
			return getProtocol();
		case Rebel_componentandconnectorPackage.CONNECTOR__PROPS:
			return getProps();
		case Rebel_componentandconnectorPackage.CONNECTOR__ROLES:
			return getRoles();
		case Rebel_componentandconnectorPackage.CONNECTOR__ID:
			return getId();
		case Rebel_componentandconnectorPackage.CONNECTOR__POS_X:
			return getPosX();
		case Rebel_componentandconnectorPackage.CONNECTOR__POS_Y:
			return getPosY();
		case Rebel_componentandconnectorPackage.CONNECTOR__SYNC:
			return getSync();
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
		case Rebel_componentandconnectorPackage.CONNECTOR__NAME:
			setName((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__DELIVERY:
			setDelivery((DeliveryModel) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__NOTIFICATION:
			setNotification((NotificationModel) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__BUFFERING:
			setBuffering((Buffering) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__THROUGHPUT:
			setThroughput((Throughput) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__PROTOCOL:
			setProtocol((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__PROPS:
			setProps((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__ID:
			setId((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__POS_X:
			setPosX((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__POS_Y:
			setPosY((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__SYNC:
			setSync((SyncType) newValue);
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
		case Rebel_componentandconnectorPackage.CONNECTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__DELIVERY:
			setDelivery(DELIVERY_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__NOTIFICATION:
			setNotification(NOTIFICATION_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__BUFFERING:
			setBuffering(BUFFERING_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__THROUGHPUT:
			setThroughput(THROUGHPUT_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__PROTOCOL:
			setProtocol(PROTOCOL_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__PROPS:
			setProps(PROPS_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__ROLES:
			getRoles().clear();
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__ID:
			setId(ID_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__POS_X:
			setPosX(POS_X_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__POS_Y:
			setPosY(POS_Y_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.CONNECTOR__SYNC:
			setSync(SYNC_EDEFAULT);
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
		case Rebel_componentandconnectorPackage.CONNECTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Rebel_componentandconnectorPackage.CONNECTOR__DELIVERY:
			return delivery != DELIVERY_EDEFAULT;
		case Rebel_componentandconnectorPackage.CONNECTOR__NOTIFICATION:
			return notification != NOTIFICATION_EDEFAULT;
		case Rebel_componentandconnectorPackage.CONNECTOR__BUFFERING:
			return buffering != BUFFERING_EDEFAULT;
		case Rebel_componentandconnectorPackage.CONNECTOR__THROUGHPUT:
			return throughput != THROUGHPUT_EDEFAULT;
		case Rebel_componentandconnectorPackage.CONNECTOR__PROTOCOL:
			return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
		case Rebel_componentandconnectorPackage.CONNECTOR__PROPS:
			return PROPS_EDEFAULT == null ? props != null : !PROPS_EDEFAULT.equals(props);
		case Rebel_componentandconnectorPackage.CONNECTOR__ROLES:
			return roles != null && !roles.isEmpty();
		case Rebel_componentandconnectorPackage.CONNECTOR__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Rebel_componentandconnectorPackage.CONNECTOR__POS_X:
			return POS_X_EDEFAULT == null ? posX != null : !POS_X_EDEFAULT.equals(posX);
		case Rebel_componentandconnectorPackage.CONNECTOR__POS_Y:
			return POS_Y_EDEFAULT == null ? posY != null : !POS_Y_EDEFAULT.equals(posY);
		case Rebel_componentandconnectorPackage.CONNECTOR__SYNC:
			return sync != SYNC_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", delivery: ");
		result.append(delivery);
		result.append(", notification: ");
		result.append(notification);
		result.append(", buffering: ");
		result.append(buffering);
		result.append(", throughput: ");
		result.append(throughput);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", props: ");
		result.append(props);
		result.append(", id: ");
		result.append(id);
		result.append(", posX: ");
		result.append(posX);
		result.append(", posY: ");
		result.append(posY);
		result.append(", sync: ");
		result.append(sync);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
