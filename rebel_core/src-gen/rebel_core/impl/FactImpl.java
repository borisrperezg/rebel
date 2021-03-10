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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import rebel_core.ATDItem;
import rebel_core.Action;
import rebel_core.ArchimateView;
import rebel_core.Decision;
import rebel_core.Fact;
import rebel_core.FunctionalView;
import rebel_core.Message;
import rebel_core.Rebel_corePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.impl.FactImpl#getDate <em>Date</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getAction <em>Action</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getObservations <em>Observations</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getFunctionalview <em>Functionalview</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getArchitecturaldecision <em>Architecturaldecision</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getId <em>Id</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getView <em>View</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getFact <em>Fact</em>}</li>
 *   <li>{@link rebel_core.impl.FactImpl#getAtditem <em>Atditem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactImpl extends MinimalEObjectImpl.Container implements Fact {
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
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Action ACTION_EDEFAULT = Action.NONE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getObservations() <em>Observations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservations() <em>Observations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected String observations = OBSERVATIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctionalview() <em>Functionalview</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalview()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalView> functionalview;

	/**
	 * The cached value of the '{@link #getArchitecturaldecision() <em>Architecturaldecision</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturaldecision()
	 * @generated
	 * @ordered
	 */
	protected EList<Decision> architecturaldecision;

	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected String elementType = ELEMENT_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchimateView> view;

	/**
	 * The cached value of the '{@link #getFact() <em>Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFact()
	 * @generated
	 * @ordered
	 */
	protected Fact fact;

	/**
	 * The cached value of the '{@link #getAtditem() <em>Atditem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtditem()
	 * @generated
	 * @ordered
	 */
	protected EList<ATDItem> atditem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_corePackage.Literals.FACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.FACT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.FACT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObservations() {
		return observations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservations(String newObservations) {
		String oldObservations = observations;
		observations = newObservations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.FACT__OBSERVATIONS, oldObservations,
					observations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalView> getFunctionalview() {
		if (functionalview == null) {
			functionalview = new EObjectResolvingEList<FunctionalView>(FunctionalView.class, this,
					Rebel_corePackage.FACT__FUNCTIONALVIEW);
		}
		return functionalview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decision> getArchitecturaldecision() {
		if (architecturaldecision == null) {
			architecturaldecision = new EObjectResolvingEList<Decision>(Decision.class, this,
					Rebel_corePackage.FACT__ARCHITECTURALDECISION);
		}
		return architecturaldecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.FACT__ELEMENT_NAME, oldElementName,
					elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementType(String newElementType) {
		String oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.FACT__ELEMENT_TYPE, oldElementType,
					elementType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.FACT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectResolvingEList<Message>(Message.class, this, Rebel_corePackage.FACT__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArchimateView> getView() {
		if (view == null) {
			view = new EObjectResolvingEList<ArchimateView>(ArchimateView.class, this, Rebel_corePackage.FACT__VIEW);
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fact getFact() {
		if (fact != null && fact.eIsProxy()) {
			InternalEObject oldFact = (InternalEObject) fact;
			fact = (Fact) eResolveProxy(oldFact);
			if (fact != oldFact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Rebel_corePackage.FACT__FACT, oldFact,
							fact));
			}
		}
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fact basicGetFact() {
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFact(Fact newFact) {
		Fact oldFact = fact;
		fact = newFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.FACT__FACT, oldFact, fact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ATDItem> getAtditem() {
		if (atditem == null) {
			atditem = new EObjectContainmentEList<ATDItem>(ATDItem.class, this, Rebel_corePackage.FACT__ATDITEM);
		}
		return atditem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_corePackage.FACT__ATDITEM:
			return ((InternalEList<?>) getAtditem()).basicRemove(otherEnd, msgs);
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
		case Rebel_corePackage.FACT__DATE:
			return getDate();
		case Rebel_corePackage.FACT__ACTION:
			return getAction();
		case Rebel_corePackage.FACT__OBSERVATIONS:
			return getObservations();
		case Rebel_corePackage.FACT__FUNCTIONALVIEW:
			return getFunctionalview();
		case Rebel_corePackage.FACT__ARCHITECTURALDECISION:
			return getArchitecturaldecision();
		case Rebel_corePackage.FACT__ELEMENT_NAME:
			return getElementName();
		case Rebel_corePackage.FACT__ELEMENT_TYPE:
			return getElementType();
		case Rebel_corePackage.FACT__ID:
			return getId();
		case Rebel_corePackage.FACT__MESSAGE:
			return getMessage();
		case Rebel_corePackage.FACT__VIEW:
			return getView();
		case Rebel_corePackage.FACT__FACT:
			if (resolve)
				return getFact();
			return basicGetFact();
		case Rebel_corePackage.FACT__ATDITEM:
			return getAtditem();
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
		case Rebel_corePackage.FACT__DATE:
			setDate((Date) newValue);
			return;
		case Rebel_corePackage.FACT__ACTION:
			setAction((Action) newValue);
			return;
		case Rebel_corePackage.FACT__OBSERVATIONS:
			setObservations((String) newValue);
			return;
		case Rebel_corePackage.FACT__FUNCTIONALVIEW:
			getFunctionalview().clear();
			getFunctionalview().addAll((Collection<? extends FunctionalView>) newValue);
			return;
		case Rebel_corePackage.FACT__ARCHITECTURALDECISION:
			getArchitecturaldecision().clear();
			getArchitecturaldecision().addAll((Collection<? extends Decision>) newValue);
			return;
		case Rebel_corePackage.FACT__ELEMENT_NAME:
			setElementName((String) newValue);
			return;
		case Rebel_corePackage.FACT__ELEMENT_TYPE:
			setElementType((String) newValue);
			return;
		case Rebel_corePackage.FACT__ID:
			setId((String) newValue);
			return;
		case Rebel_corePackage.FACT__MESSAGE:
			getMessage().clear();
			getMessage().addAll((Collection<? extends Message>) newValue);
			return;
		case Rebel_corePackage.FACT__VIEW:
			getView().clear();
			getView().addAll((Collection<? extends ArchimateView>) newValue);
			return;
		case Rebel_corePackage.FACT__FACT:
			setFact((Fact) newValue);
			return;
		case Rebel_corePackage.FACT__ATDITEM:
			getAtditem().clear();
			getAtditem().addAll((Collection<? extends ATDItem>) newValue);
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
		case Rebel_corePackage.FACT__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case Rebel_corePackage.FACT__ACTION:
			setAction(ACTION_EDEFAULT);
			return;
		case Rebel_corePackage.FACT__OBSERVATIONS:
			setObservations(OBSERVATIONS_EDEFAULT);
			return;
		case Rebel_corePackage.FACT__FUNCTIONALVIEW:
			getFunctionalview().clear();
			return;
		case Rebel_corePackage.FACT__ARCHITECTURALDECISION:
			getArchitecturaldecision().clear();
			return;
		case Rebel_corePackage.FACT__ELEMENT_NAME:
			setElementName(ELEMENT_NAME_EDEFAULT);
			return;
		case Rebel_corePackage.FACT__ELEMENT_TYPE:
			setElementType(ELEMENT_TYPE_EDEFAULT);
			return;
		case Rebel_corePackage.FACT__ID:
			setId(ID_EDEFAULT);
			return;
		case Rebel_corePackage.FACT__MESSAGE:
			getMessage().clear();
			return;
		case Rebel_corePackage.FACT__VIEW:
			getView().clear();
			return;
		case Rebel_corePackage.FACT__FACT:
			setFact((Fact) null);
			return;
		case Rebel_corePackage.FACT__ATDITEM:
			getAtditem().clear();
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
		case Rebel_corePackage.FACT__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case Rebel_corePackage.FACT__ACTION:
			return action != ACTION_EDEFAULT;
		case Rebel_corePackage.FACT__OBSERVATIONS:
			return OBSERVATIONS_EDEFAULT == null ? observations != null : !OBSERVATIONS_EDEFAULT.equals(observations);
		case Rebel_corePackage.FACT__FUNCTIONALVIEW:
			return functionalview != null && !functionalview.isEmpty();
		case Rebel_corePackage.FACT__ARCHITECTURALDECISION:
			return architecturaldecision != null && !architecturaldecision.isEmpty();
		case Rebel_corePackage.FACT__ELEMENT_NAME:
			return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
		case Rebel_corePackage.FACT__ELEMENT_TYPE:
			return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
		case Rebel_corePackage.FACT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Rebel_corePackage.FACT__MESSAGE:
			return message != null && !message.isEmpty();
		case Rebel_corePackage.FACT__VIEW:
			return view != null && !view.isEmpty();
		case Rebel_corePackage.FACT__FACT:
			return fact != null;
		case Rebel_corePackage.FACT__ATDITEM:
			return atditem != null && !atditem.isEmpty();
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
		result.append(" (date: ");
		result.append(date);
		result.append(", action: ");
		result.append(action);
		result.append(", observations: ");
		result.append(observations);
		result.append(", elementName: ");
		result.append(elementName);
		result.append(", elementType: ");
		result.append(elementType);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FactImpl
