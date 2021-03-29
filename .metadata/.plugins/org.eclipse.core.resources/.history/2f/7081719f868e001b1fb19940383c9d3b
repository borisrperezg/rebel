/**
 */
package rebel_core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rebel_core.Buffering;
import rebel_core.DeliveryModel;
import rebel_core.ELEMENTTYPE;
import rebel_core.Element;
import rebel_core.NotificationModel;
import rebel_core.Rebel_corePackage;
import rebel_core.SyncType;
import rebel_core.Throughput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.impl.ElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#isGrouper <em>Grouper</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#isBoiElement <em>Boi Element</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getSync <em>Sync</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getNotification <em>Notification</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getBuffering <em>Buffering</em>}</li>
 *   <li>{@link rebel_core.impl.ElementImpl#getThroughput <em>Throughput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
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
	 * The default value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected int posX = POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected int posY = POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ELEMENTTYPE TYPE_EDEFAULT = ELEMENTTYPE.NONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ELEMENTTYPE type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrouper() <em>Grouper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrouper()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUPER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrouper() <em>Grouper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrouper()
	 * @generated
	 * @ordered
	 */
	protected boolean grouper = GROUPER_EDEFAULT;

	/**
	 * The default value of the '{@link #isBoiElement() <em>Boi Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoiElement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOI_ELEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoiElement() <em>Boi Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoiElement()
	 * @generated
	 * @ordered
	 */
	protected boolean boiElement = BOI_ELEMENT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_corePackage.Literals.ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosX() {
		return posX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosX(int newPosX) {
		int oldPosX = posX;
		posX = newPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__POS_X, oldPosX, posX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosY() {
		return posY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosY(int newPosY) {
		int oldPosY = posY;
		posY = newPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__POS_Y, oldPosY, posY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ELEMENTTYPE getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ELEMENTTYPE newType) {
		ELEMENTTYPE oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGrouper() {
		return grouper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrouper(boolean newGrouper) {
		boolean oldGrouper = grouper;
		grouper = newGrouper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__GROUPER, oldGrouper,
					grouper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBoiElement() {
		return boiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoiElement(boolean newBoiElement) {
		boolean oldBoiElement = boiElement;
		boiElement = newBoiElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__BOI_ELEMENT, oldBoiElement,
					boiElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__SYNC, oldSync, sync));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__DELIVERY, oldDelivery,
					delivery));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__NOTIFICATION,
					oldNotification, notification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__BUFFERING, oldBuffering,
					buffering));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ELEMENT__THROUGHPUT, oldThroughput,
					throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Rebel_corePackage.ELEMENT__ID:
			return getId();
		case Rebel_corePackage.ELEMENT__NAME:
			return getName();
		case Rebel_corePackage.ELEMENT__POS_X:
			return getPosX();
		case Rebel_corePackage.ELEMENT__POS_Y:
			return getPosY();
		case Rebel_corePackage.ELEMENT__WIDTH:
			return getWidth();
		case Rebel_corePackage.ELEMENT__HEIGHT:
			return getHeight();
		case Rebel_corePackage.ELEMENT__TYPE:
			return getType();
		case Rebel_corePackage.ELEMENT__GROUPER:
			return isGrouper();
		case Rebel_corePackage.ELEMENT__BOI_ELEMENT:
			return isBoiElement();
		case Rebel_corePackage.ELEMENT__SYNC:
			return getSync();
		case Rebel_corePackage.ELEMENT__DELIVERY:
			return getDelivery();
		case Rebel_corePackage.ELEMENT__NOTIFICATION:
			return getNotification();
		case Rebel_corePackage.ELEMENT__BUFFERING:
			return getBuffering();
		case Rebel_corePackage.ELEMENT__THROUGHPUT:
			return getThroughput();
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
		case Rebel_corePackage.ELEMENT__ID:
			setId((String) newValue);
			return;
		case Rebel_corePackage.ELEMENT__NAME:
			setName((String) newValue);
			return;
		case Rebel_corePackage.ELEMENT__POS_X:
			setPosX((Integer) newValue);
			return;
		case Rebel_corePackage.ELEMENT__POS_Y:
			setPosY((Integer) newValue);
			return;
		case Rebel_corePackage.ELEMENT__WIDTH:
			setWidth((Integer) newValue);
			return;
		case Rebel_corePackage.ELEMENT__HEIGHT:
			setHeight((Integer) newValue);
			return;
		case Rebel_corePackage.ELEMENT__TYPE:
			setType((ELEMENTTYPE) newValue);
			return;
		case Rebel_corePackage.ELEMENT__GROUPER:
			setGrouper((Boolean) newValue);
			return;
		case Rebel_corePackage.ELEMENT__BOI_ELEMENT:
			setBoiElement((Boolean) newValue);
			return;
		case Rebel_corePackage.ELEMENT__SYNC:
			setSync((SyncType) newValue);
			return;
		case Rebel_corePackage.ELEMENT__DELIVERY:
			setDelivery((DeliveryModel) newValue);
			return;
		case Rebel_corePackage.ELEMENT__NOTIFICATION:
			setNotification((NotificationModel) newValue);
			return;
		case Rebel_corePackage.ELEMENT__BUFFERING:
			setBuffering((Buffering) newValue);
			return;
		case Rebel_corePackage.ELEMENT__THROUGHPUT:
			setThroughput((Throughput) newValue);
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
		case Rebel_corePackage.ELEMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__POS_X:
			setPosX(POS_X_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__POS_Y:
			setPosY(POS_Y_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__GROUPER:
			setGrouper(GROUPER_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__BOI_ELEMENT:
			setBoiElement(BOI_ELEMENT_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__SYNC:
			setSync(SYNC_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__DELIVERY:
			setDelivery(DELIVERY_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__NOTIFICATION:
			setNotification(NOTIFICATION_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__BUFFERING:
			setBuffering(BUFFERING_EDEFAULT);
			return;
		case Rebel_corePackage.ELEMENT__THROUGHPUT:
			setThroughput(THROUGHPUT_EDEFAULT);
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
		case Rebel_corePackage.ELEMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Rebel_corePackage.ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Rebel_corePackage.ELEMENT__POS_X:
			return posX != POS_X_EDEFAULT;
		case Rebel_corePackage.ELEMENT__POS_Y:
			return posY != POS_Y_EDEFAULT;
		case Rebel_corePackage.ELEMENT__WIDTH:
			return width != WIDTH_EDEFAULT;
		case Rebel_corePackage.ELEMENT__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case Rebel_corePackage.ELEMENT__TYPE:
			return type != TYPE_EDEFAULT;
		case Rebel_corePackage.ELEMENT__GROUPER:
			return grouper != GROUPER_EDEFAULT;
		case Rebel_corePackage.ELEMENT__BOI_ELEMENT:
			return boiElement != BOI_ELEMENT_EDEFAULT;
		case Rebel_corePackage.ELEMENT__SYNC:
			return sync != SYNC_EDEFAULT;
		case Rebel_corePackage.ELEMENT__DELIVERY:
			return delivery != DELIVERY_EDEFAULT;
		case Rebel_corePackage.ELEMENT__NOTIFICATION:
			return notification != NOTIFICATION_EDEFAULT;
		case Rebel_corePackage.ELEMENT__BUFFERING:
			return buffering != BUFFERING_EDEFAULT;
		case Rebel_corePackage.ELEMENT__THROUGHPUT:
			return throughput != THROUGHPUT_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", posX: ");
		result.append(posX);
		result.append(", posY: ");
		result.append(posY);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", type: ");
		result.append(type);
		result.append(", grouper: ");
		result.append(grouper);
		result.append(", boiElement: ");
		result.append(boiElement);
		result.append(", sync: ");
		result.append(sync);
		result.append(", delivery: ");
		result.append(delivery);
		result.append(", notification: ");
		result.append(notification);
		result.append(", buffering: ");
		result.append(buffering);
		result.append(", throughput: ");
		result.append(throughput);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
