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

import rebel_core.ATDBenefit;
import rebel_core.ATDEffect;
import rebel_core.ATDItem;
import rebel_core.ATDRationale;
import rebel_core.Rebel_corePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATD Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.impl.ATDItemImpl#getCompromisedQA <em>Compromised QA</em>}</li>
 *   <li>{@link rebel_core.impl.ATDItemImpl#getDate <em>Date</em>}</li>
 *   <li>{@link rebel_core.impl.ATDItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link rebel_core.impl.ATDItemImpl#getIncurredBy <em>Incurred By</em>}</li>
 *   <li>{@link rebel_core.impl.ATDItemImpl#getRationales <em>Rationales</em>}</li>
 *   <li>{@link rebel_core.impl.ATDItemImpl#getBenefits <em>Benefits</em>}</li>
 *   <li>{@link rebel_core.impl.ATDItemImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link rebel_core.impl.ATDItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link rebel_core.impl.ATDItemImpl#isIdentifyByArchitect <em>Identify By Architect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATDItemImpl extends MinimalEObjectImpl.Container implements ATDItem {
	/**
	 * The default value of the '{@link #getCompromisedQA() <em>Compromised QA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompromisedQA()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPROMISED_QA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompromisedQA() <em>Compromised QA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompromisedQA()
	 * @generated
	 * @ordered
	 */
	protected String compromisedQA = COMPROMISED_QA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncurredBy() <em>Incurred By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncurredBy()
	 * @generated
	 * @ordered
	 */
	protected static final String INCURRED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncurredBy() <em>Incurred By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncurredBy()
	 * @generated
	 * @ordered
	 */
	protected String incurredBy = INCURRED_BY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRationales() <em>Rationales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationales()
	 * @generated
	 * @ordered
	 */
	protected EList<ATDRationale> rationales;

	/**
	 * The cached value of the '{@link #getBenefits() <em>Benefits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefits()
	 * @generated
	 * @ordered
	 */
	protected EList<ATDBenefit> benefits;

	/**
	 * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<ATDEffect> effects;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIdentifyByArchitect() <em>Identify By Architect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentifyByArchitect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDENTIFY_BY_ARCHITECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIdentifyByArchitect() <em>Identify By Architect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentifyByArchitect()
	 * @generated
	 * @ordered
	 */
	protected boolean identifyByArchitect = IDENTIFY_BY_ARCHITECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATDItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_corePackage.Literals.ATD_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompromisedQA() {
		return compromisedQA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompromisedQA(String newCompromisedQA) {
		String oldCompromisedQA = compromisedQA;
		compromisedQA = newCompromisedQA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ATD_ITEM__COMPROMISED_QA,
					oldCompromisedQA, compromisedQA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ATD_ITEM__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ATD_ITEM__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncurredBy() {
		return incurredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncurredBy(String newIncurredBy) {
		String oldIncurredBy = incurredBy;
		incurredBy = newIncurredBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ATD_ITEM__INCURRED_BY,
					oldIncurredBy, incurredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ATDRationale> getRationales() {
		if (rationales == null) {
			rationales = new EObjectContainmentEList<ATDRationale>(ATDRationale.class, this,
					Rebel_corePackage.ATD_ITEM__RATIONALES);
		}
		return rationales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ATDBenefit> getBenefits() {
		if (benefits == null) {
			benefits = new EObjectContainmentEList<ATDBenefit>(ATDBenefit.class, this,
					Rebel_corePackage.ATD_ITEM__BENEFITS);
		}
		return benefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ATDEffect> getEffects() {
		if (effects == null) {
			effects = new EObjectContainmentEList<ATDEffect>(ATDEffect.class, this,
					Rebel_corePackage.ATD_ITEM__EFFECTS);
		}
		return effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ATD_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIdentifyByArchitect() {
		return identifyByArchitect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifyByArchitect(boolean newIdentifyByArchitect) {
		boolean oldIdentifyByArchitect = identifyByArchitect;
		identifyByArchitect = newIdentifyByArchitect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.ATD_ITEM__IDENTIFY_BY_ARCHITECT,
					oldIdentifyByArchitect, identifyByArchitect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_corePackage.ATD_ITEM__RATIONALES:
			return ((InternalEList<?>) getRationales()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.ATD_ITEM__BENEFITS:
			return ((InternalEList<?>) getBenefits()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.ATD_ITEM__EFFECTS:
			return ((InternalEList<?>) getEffects()).basicRemove(otherEnd, msgs);
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
		case Rebel_corePackage.ATD_ITEM__COMPROMISED_QA:
			return getCompromisedQA();
		case Rebel_corePackage.ATD_ITEM__DATE:
			return getDate();
		case Rebel_corePackage.ATD_ITEM__STATUS:
			return getStatus();
		case Rebel_corePackage.ATD_ITEM__INCURRED_BY:
			return getIncurredBy();
		case Rebel_corePackage.ATD_ITEM__RATIONALES:
			return getRationales();
		case Rebel_corePackage.ATD_ITEM__BENEFITS:
			return getBenefits();
		case Rebel_corePackage.ATD_ITEM__EFFECTS:
			return getEffects();
		case Rebel_corePackage.ATD_ITEM__TYPE:
			return getType();
		case Rebel_corePackage.ATD_ITEM__IDENTIFY_BY_ARCHITECT:
			return isIdentifyByArchitect();
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
		case Rebel_corePackage.ATD_ITEM__COMPROMISED_QA:
			setCompromisedQA((String) newValue);
			return;
		case Rebel_corePackage.ATD_ITEM__DATE:
			setDate((Date) newValue);
			return;
		case Rebel_corePackage.ATD_ITEM__STATUS:
			setStatus((String) newValue);
			return;
		case Rebel_corePackage.ATD_ITEM__INCURRED_BY:
			setIncurredBy((String) newValue);
			return;
		case Rebel_corePackage.ATD_ITEM__RATIONALES:
			getRationales().clear();
			getRationales().addAll((Collection<? extends ATDRationale>) newValue);
			return;
		case Rebel_corePackage.ATD_ITEM__BENEFITS:
			getBenefits().clear();
			getBenefits().addAll((Collection<? extends ATDBenefit>) newValue);
			return;
		case Rebel_corePackage.ATD_ITEM__EFFECTS:
			getEffects().clear();
			getEffects().addAll((Collection<? extends ATDEffect>) newValue);
			return;
		case Rebel_corePackage.ATD_ITEM__TYPE:
			setType((String) newValue);
			return;
		case Rebel_corePackage.ATD_ITEM__IDENTIFY_BY_ARCHITECT:
			setIdentifyByArchitect((Boolean) newValue);
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
		case Rebel_corePackage.ATD_ITEM__COMPROMISED_QA:
			setCompromisedQA(COMPROMISED_QA_EDEFAULT);
			return;
		case Rebel_corePackage.ATD_ITEM__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case Rebel_corePackage.ATD_ITEM__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case Rebel_corePackage.ATD_ITEM__INCURRED_BY:
			setIncurredBy(INCURRED_BY_EDEFAULT);
			return;
		case Rebel_corePackage.ATD_ITEM__RATIONALES:
			getRationales().clear();
			return;
		case Rebel_corePackage.ATD_ITEM__BENEFITS:
			getBenefits().clear();
			return;
		case Rebel_corePackage.ATD_ITEM__EFFECTS:
			getEffects().clear();
			return;
		case Rebel_corePackage.ATD_ITEM__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Rebel_corePackage.ATD_ITEM__IDENTIFY_BY_ARCHITECT:
			setIdentifyByArchitect(IDENTIFY_BY_ARCHITECT_EDEFAULT);
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
		case Rebel_corePackage.ATD_ITEM__COMPROMISED_QA:
			return COMPROMISED_QA_EDEFAULT == null ? compromisedQA != null
					: !COMPROMISED_QA_EDEFAULT.equals(compromisedQA);
		case Rebel_corePackage.ATD_ITEM__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case Rebel_corePackage.ATD_ITEM__STATUS:
			return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
		case Rebel_corePackage.ATD_ITEM__INCURRED_BY:
			return INCURRED_BY_EDEFAULT == null ? incurredBy != null : !INCURRED_BY_EDEFAULT.equals(incurredBy);
		case Rebel_corePackage.ATD_ITEM__RATIONALES:
			return rationales != null && !rationales.isEmpty();
		case Rebel_corePackage.ATD_ITEM__BENEFITS:
			return benefits != null && !benefits.isEmpty();
		case Rebel_corePackage.ATD_ITEM__EFFECTS:
			return effects != null && !effects.isEmpty();
		case Rebel_corePackage.ATD_ITEM__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case Rebel_corePackage.ATD_ITEM__IDENTIFY_BY_ARCHITECT:
			return identifyByArchitect != IDENTIFY_BY_ARCHITECT_EDEFAULT;
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
		result.append(" (compromisedQA: ");
		result.append(compromisedQA);
		result.append(", date: ");
		result.append(date);
		result.append(", status: ");
		result.append(status);
		result.append(", incurredBy: ");
		result.append(incurredBy);
		result.append(", type: ");
		result.append(type);
		result.append(", identifyByArchitect: ");
		result.append(identifyByArchitect);
		result.append(')');
		return result.toString();
	}

} //ATDItemImpl
