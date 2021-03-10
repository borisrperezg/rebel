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

import rebel_componentandconnector.Component;
import rebel_componentandconnector.Port;
import rebel_componentandconnector.Rebel_componentandconnectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_componentandconnector.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ComponentImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ComponentImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ComponentImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ComponentImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_componentandconnectorPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.COMPONENT__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this,
					Rebel_componentandconnectorPackage.COMPONENT__PORTS);
		}
		return ports;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.COMPONENT__ID,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.COMPONENT__POS_X,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.COMPONENT__POS_Y,
					oldPosY, posY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.COMPONENT__WIDTH,
					oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.COMPONENT__HEIGHT,
					oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_componentandconnectorPackage.COMPONENT__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
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
		case Rebel_componentandconnectorPackage.COMPONENT__NAME:
			return getName();
		case Rebel_componentandconnectorPackage.COMPONENT__PORTS:
			return getPorts();
		case Rebel_componentandconnectorPackage.COMPONENT__ID:
			return getId();
		case Rebel_componentandconnectorPackage.COMPONENT__POS_X:
			return getPosX();
		case Rebel_componentandconnectorPackage.COMPONENT__POS_Y:
			return getPosY();
		case Rebel_componentandconnectorPackage.COMPONENT__WIDTH:
			return getWidth();
		case Rebel_componentandconnectorPackage.COMPONENT__HEIGHT:
			return getHeight();
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
		case Rebel_componentandconnectorPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__ID:
			setId((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__POS_X:
			setPosX((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__POS_Y:
			setPosY((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__WIDTH:
			setWidth((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__HEIGHT:
			setHeight((String) newValue);
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
		case Rebel_componentandconnectorPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__PORTS:
			getPorts().clear();
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__ID:
			setId(ID_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__POS_X:
			setPosX(POS_X_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__POS_Y:
			setPosY(POS_Y_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.COMPONENT__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
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
		case Rebel_componentandconnectorPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Rebel_componentandconnectorPackage.COMPONENT__PORTS:
			return ports != null && !ports.isEmpty();
		case Rebel_componentandconnectorPackage.COMPONENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Rebel_componentandconnectorPackage.COMPONENT__POS_X:
			return POS_X_EDEFAULT == null ? posX != null : !POS_X_EDEFAULT.equals(posX);
		case Rebel_componentandconnectorPackage.COMPONENT__POS_Y:
			return POS_Y_EDEFAULT == null ? posY != null : !POS_Y_EDEFAULT.equals(posY);
		case Rebel_componentandconnectorPackage.COMPONENT__WIDTH:
			return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
		case Rebel_componentandconnectorPackage.COMPONENT__HEIGHT:
			return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
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
		result.append(", id: ");
		result.append(id);
		result.append(", posX: ");
		result.append(posX);
		result.append(", posY: ");
		result.append(posY);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
