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

import rebel_core.Alternative;
import rebel_core.Assumption;
import rebel_core.Consequence;
import rebel_core.Decision;
import rebel_core.Motivator;
import rebel_core.Rebel_corePackage;
import rebel_core.StateType;
import rebel_core.UserStory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.impl.DecisionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getState <em>State</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getSupercedes <em>Supercedes</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getUserstories <em>Userstories</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getMotivators <em>Motivators</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link rebel_core.impl.DecisionImpl#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionImpl extends MinimalEObjectImpl.Container implements Decision {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final StateType STATE_EDEFAULT = StateType.NONE;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateType state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupercedes() <em>Supercedes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupercedes()
	 * @generated
	 * @ordered
	 */
	protected Decision supercedes;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected String phase = PHASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserstories() <em>Userstories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserstories()
	 * @generated
	 * @ordered
	 */
	protected EList<UserStory> userstories;

	/**
	 * The cached value of the '{@link #getConsequences() <em>Consequences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequences()
	 * @generated
	 * @ordered
	 */
	protected EList<Consequence> consequences;

	/**
	 * The cached value of the '{@link #getMotivators() <em>Motivators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivators()
	 * @generated
	 * @ordered
	 */
	protected EList<Motivator> motivators;

	/**
	 * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> assumptions;

	/**
	 * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<Alternative> alternatives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_corePackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.DECISION__NUMBER, oldNumber,
					number));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.DECISION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateType getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(StateType newState) {
		StateType oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.DECISION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decision getSupercedes() {
		if (supercedes != null && supercedes.eIsProxy()) {
			InternalEObject oldSupercedes = (InternalEObject) supercedes;
			supercedes = (Decision) eResolveProxy(oldSupercedes);
			if (supercedes != oldSupercedes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Rebel_corePackage.DECISION__SUPERCEDES,
							oldSupercedes, supercedes));
			}
		}
		return supercedes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision basicGetSupercedes() {
		return supercedes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupercedes(Decision newSupercedes) {
		Decision oldSupercedes = supercedes;
		supercedes = newSupercedes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.DECISION__SUPERCEDES, oldSupercedes,
					supercedes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.DECISION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.DECISION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase(String newPhase) {
		String oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.DECISION__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserStory> getUserstories() {
		if (userstories == null) {
			userstories = new EObjectContainmentEList<UserStory>(UserStory.class, this,
					Rebel_corePackage.DECISION__USERSTORIES);
		}
		return userstories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Consequence> getConsequences() {
		if (consequences == null) {
			consequences = new EObjectContainmentEList<Consequence>(Consequence.class, this,
					Rebel_corePackage.DECISION__CONSEQUENCES);
		}
		return consequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Motivator> getMotivators() {
		if (motivators == null) {
			motivators = new EObjectContainmentEList<Motivator>(Motivator.class, this,
					Rebel_corePackage.DECISION__MOTIVATORS);
		}
		return motivators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assumption> getAssumptions() {
		if (assumptions == null) {
			assumptions = new EObjectContainmentEList<Assumption>(Assumption.class, this,
					Rebel_corePackage.DECISION__ASSUMPTIONS);
		}
		return assumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Alternative> getAlternatives() {
		if (alternatives == null) {
			alternatives = new EObjectContainmentEList<Alternative>(Alternative.class, this,
					Rebel_corePackage.DECISION__ALTERNATIVES);
		}
		return alternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_corePackage.DECISION__USERSTORIES:
			return ((InternalEList<?>) getUserstories()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.DECISION__CONSEQUENCES:
			return ((InternalEList<?>) getConsequences()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.DECISION__MOTIVATORS:
			return ((InternalEList<?>) getMotivators()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.DECISION__ASSUMPTIONS:
			return ((InternalEList<?>) getAssumptions()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.DECISION__ALTERNATIVES:
			return ((InternalEList<?>) getAlternatives()).basicRemove(otherEnd, msgs);
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
		case Rebel_corePackage.DECISION__NUMBER:
			return getNumber();
		case Rebel_corePackage.DECISION__TITLE:
			return getTitle();
		case Rebel_corePackage.DECISION__STATE:
			return getState();
		case Rebel_corePackage.DECISION__SUPERCEDES:
			if (resolve)
				return getSupercedes();
			return basicGetSupercedes();
		case Rebel_corePackage.DECISION__DATE:
			return getDate();
		case Rebel_corePackage.DECISION__DESCRIPTION:
			return getDescription();
		case Rebel_corePackage.DECISION__PHASE:
			return getPhase();
		case Rebel_corePackage.DECISION__USERSTORIES:
			return getUserstories();
		case Rebel_corePackage.DECISION__CONSEQUENCES:
			return getConsequences();
		case Rebel_corePackage.DECISION__MOTIVATORS:
			return getMotivators();
		case Rebel_corePackage.DECISION__ASSUMPTIONS:
			return getAssumptions();
		case Rebel_corePackage.DECISION__ALTERNATIVES:
			return getAlternatives();
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
		case Rebel_corePackage.DECISION__NUMBER:
			setNumber((String) newValue);
			return;
		case Rebel_corePackage.DECISION__TITLE:
			setTitle((String) newValue);
			return;
		case Rebel_corePackage.DECISION__STATE:
			setState((StateType) newValue);
			return;
		case Rebel_corePackage.DECISION__SUPERCEDES:
			setSupercedes((Decision) newValue);
			return;
		case Rebel_corePackage.DECISION__DATE:
			setDate((Date) newValue);
			return;
		case Rebel_corePackage.DECISION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Rebel_corePackage.DECISION__PHASE:
			setPhase((String) newValue);
			return;
		case Rebel_corePackage.DECISION__USERSTORIES:
			getUserstories().clear();
			getUserstories().addAll((Collection<? extends UserStory>) newValue);
			return;
		case Rebel_corePackage.DECISION__CONSEQUENCES:
			getConsequences().clear();
			getConsequences().addAll((Collection<? extends Consequence>) newValue);
			return;
		case Rebel_corePackage.DECISION__MOTIVATORS:
			getMotivators().clear();
			getMotivators().addAll((Collection<? extends Motivator>) newValue);
			return;
		case Rebel_corePackage.DECISION__ASSUMPTIONS:
			getAssumptions().clear();
			getAssumptions().addAll((Collection<? extends Assumption>) newValue);
			return;
		case Rebel_corePackage.DECISION__ALTERNATIVES:
			getAlternatives().clear();
			getAlternatives().addAll((Collection<? extends Alternative>) newValue);
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
		case Rebel_corePackage.DECISION__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case Rebel_corePackage.DECISION__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case Rebel_corePackage.DECISION__STATE:
			setState(STATE_EDEFAULT);
			return;
		case Rebel_corePackage.DECISION__SUPERCEDES:
			setSupercedes((Decision) null);
			return;
		case Rebel_corePackage.DECISION__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case Rebel_corePackage.DECISION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Rebel_corePackage.DECISION__PHASE:
			setPhase(PHASE_EDEFAULT);
			return;
		case Rebel_corePackage.DECISION__USERSTORIES:
			getUserstories().clear();
			return;
		case Rebel_corePackage.DECISION__CONSEQUENCES:
			getConsequences().clear();
			return;
		case Rebel_corePackage.DECISION__MOTIVATORS:
			getMotivators().clear();
			return;
		case Rebel_corePackage.DECISION__ASSUMPTIONS:
			getAssumptions().clear();
			return;
		case Rebel_corePackage.DECISION__ALTERNATIVES:
			getAlternatives().clear();
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
		case Rebel_corePackage.DECISION__NUMBER:
			return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
		case Rebel_corePackage.DECISION__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case Rebel_corePackage.DECISION__STATE:
			return state != STATE_EDEFAULT;
		case Rebel_corePackage.DECISION__SUPERCEDES:
			return supercedes != null;
		case Rebel_corePackage.DECISION__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case Rebel_corePackage.DECISION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Rebel_corePackage.DECISION__PHASE:
			return PHASE_EDEFAULT == null ? phase != null : !PHASE_EDEFAULT.equals(phase);
		case Rebel_corePackage.DECISION__USERSTORIES:
			return userstories != null && !userstories.isEmpty();
		case Rebel_corePackage.DECISION__CONSEQUENCES:
			return consequences != null && !consequences.isEmpty();
		case Rebel_corePackage.DECISION__MOTIVATORS:
			return motivators != null && !motivators.isEmpty();
		case Rebel_corePackage.DECISION__ASSUMPTIONS:
			return assumptions != null && !assumptions.isEmpty();
		case Rebel_corePackage.DECISION__ALTERNATIVES:
			return alternatives != null && !alternatives.isEmpty();
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
		result.append(" (number: ");
		result.append(number);
		result.append(", title: ");
		result.append(title);
		result.append(", state: ");
		result.append(state);
		result.append(", date: ");
		result.append(date);
		result.append(", description: ");
		result.append(description);
		result.append(", phase: ");
		result.append(phase);
		result.append(')');
		return result.toString();
	}

} //DecisionImpl
