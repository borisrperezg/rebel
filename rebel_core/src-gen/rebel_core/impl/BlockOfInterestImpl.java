/**
 */
package rebel_core.impl;

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

import rebel_core.BlockOfInterest;
import rebel_core.Fact;
import rebel_core.Rebel_corePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Of Interest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.impl.BlockOfInterestImpl#getFact <em>Fact</em>}</li>
 *   <li>{@link rebel_core.impl.BlockOfInterestImpl#getId <em>Id</em>}</li>
 *   <li>{@link rebel_core.impl.BlockOfInterestImpl#getName <em>Name</em>}</li>
 *   <li>{@link rebel_core.impl.BlockOfInterestImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link rebel_core.impl.BlockOfInterestImpl#getBusiness_driver <em>Business driver</em>}</li>
 *   <li>{@link rebel_core.impl.BlockOfInterestImpl#getBusiness_goal <em>Business goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockOfInterestImpl extends MinimalEObjectImpl.Container implements BlockOfInterest {
	/**
	 * The cached value of the '{@link #getFact() <em>Fact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFact()
	 * @generated
	 * @ordered
	 */
	protected EList<Fact> fact;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected String responsible = RESPONSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusiness_driver() <em>Business driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusiness_driver()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_DRIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusiness_driver() <em>Business driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusiness_driver()
	 * @generated
	 * @ordered
	 */
	protected String business_driver = BUSINESS_DRIVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusiness_goal() <em>Business goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusiness_goal()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusiness_goal() <em>Business goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusiness_goal()
	 * @generated
	 * @ordered
	 */
	protected String business_goal = BUSINESS_GOAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockOfInterestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_corePackage.Literals.BLOCK_OF_INTEREST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fact> getFact() {
		if (fact == null) {
			fact = new EObjectContainmentEList<Fact>(Fact.class, this, Rebel_corePackage.BLOCK_OF_INTEREST__FACT);
		}
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.BLOCK_OF_INTEREST__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.BLOCK_OF_INTEREST__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsible(String newResponsible) {
		String oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.BLOCK_OF_INTEREST__RESPONSIBLE,
					oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBusiness_driver() {
		return business_driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusiness_driver(String newBusiness_driver) {
		String oldBusiness_driver = business_driver;
		business_driver = newBusiness_driver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.BLOCK_OF_INTEREST__BUSINESS_DRIVER,
					oldBusiness_driver, business_driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBusiness_goal() {
		return business_goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusiness_goal(String newBusiness_goal) {
		String oldBusiness_goal = business_goal;
		business_goal = newBusiness_goal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.BLOCK_OF_INTEREST__BUSINESS_GOAL,
					oldBusiness_goal, business_goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_corePackage.BLOCK_OF_INTEREST__FACT:
			return ((InternalEList<?>) getFact()).basicRemove(otherEnd, msgs);
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
		case Rebel_corePackage.BLOCK_OF_INTEREST__FACT:
			return getFact();
		case Rebel_corePackage.BLOCK_OF_INTEREST__ID:
			return getId();
		case Rebel_corePackage.BLOCK_OF_INTEREST__NAME:
			return getName();
		case Rebel_corePackage.BLOCK_OF_INTEREST__RESPONSIBLE:
			return getResponsible();
		case Rebel_corePackage.BLOCK_OF_INTEREST__BUSINESS_DRIVER:
			return getBusiness_driver();
		case Rebel_corePackage.BLOCK_OF_INTEREST__BUSINESS_GOAL:
			return getBusiness_goal();
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
		case Rebel_corePackage.BLOCK_OF_INTEREST__FACT:
			getFact().clear();
			getFact().addAll((Collection<? extends Fact>) newValue);
			return;
		case Rebel_corePackage.BLOCK_OF_INTEREST__ID:
			setId((Integer) newValue);
			return;
		case Rebel_corePackage.BLOCK_OF_INTEREST__NAME:
			setName((String) newValue);
			return;
		case Rebel_corePackage.BLOCK_OF_INTEREST__RESPONSIBLE:
			setResponsible((String) newValue);
			return;
		case Rebel_corePackage.BLOCK_OF_INTEREST__BUSINESS_DRIVER:
			setBusiness_driver((String) newValue);
			return;
		case Rebel_corePackage.BLOCK_OF_INTEREST__BUSINESS_GOAL:
			setBusiness_goal((String) newValue);
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
		case Rebel_corePackage.BLOCK_OF_INTEREST__FACT:
			getFact().clear();
			return;
		case Rebel_corePackage.BLOCK_OF_INTEREST__ID:
			setId(ID_EDEFAULT);
			return;
		case Rebel_corePackage.BLOCK_OF_INTEREST__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Rebel_corePackage.BLOCK_OF_INTEREST__RESPONSIBLE:
			setResponsible(RESPONSIBLE_EDEFAULT);
			return;
		case Rebel_corePackage.BLOCK_OF_INTEREST__BUSINESS_DRIVER:
			setBusiness_driver(BUSINESS_DRIVER_EDEFAULT);
			return;
		case Rebel_corePackage.BLOCK_OF_INTEREST__BUSINESS_GOAL:
			setBusiness_goal(BUSINESS_GOAL_EDEFAULT);
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
		case Rebel_corePackage.BLOCK_OF_INTEREST__FACT:
			return fact != null && !fact.isEmpty();
		case Rebel_corePackage.BLOCK_OF_INTEREST__ID:
			return id != ID_EDEFAULT;
		case Rebel_corePackage.BLOCK_OF_INTEREST__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Rebel_corePackage.BLOCK_OF_INTEREST__RESPONSIBLE:
			return RESPONSIBLE_EDEFAULT == null ? responsible != null : !RESPONSIBLE_EDEFAULT.equals(responsible);
		case Rebel_corePackage.BLOCK_OF_INTEREST__BUSINESS_DRIVER:
			return BUSINESS_DRIVER_EDEFAULT == null ? business_driver != null
					: !BUSINESS_DRIVER_EDEFAULT.equals(business_driver);
		case Rebel_corePackage.BLOCK_OF_INTEREST__BUSINESS_GOAL:
			return BUSINESS_GOAL_EDEFAULT == null ? business_goal != null
					: !BUSINESS_GOAL_EDEFAULT.equals(business_goal);
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
		result.append(", responsible: ");
		result.append(responsible);
		result.append(", business_driver: ");
		result.append(business_driver);
		result.append(", business_goal: ");
		result.append(business_goal);
		result.append(')');
		return result.toString();
	}

} //BlockOfInterestImpl
