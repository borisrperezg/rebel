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

import rebel_core.ArchimateView;
import rebel_core.BlockOfInterest;
import rebel_core.Decision;
import rebel_core.FunctionalView;
import rebel_core.Message;
import rebel_core.Person;
import rebel_core.Project;
import rebel_core.Rebel_corePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.impl.ProjectImpl#getBlockofinterest <em>Blockofinterest</em>}</li>
 *   <li>{@link rebel_core.impl.ProjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link rebel_core.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link rebel_core.impl.ProjectImpl#getFunctionalviews <em>Functionalviews</em>}</li>
 *   <li>{@link rebel_core.impl.ProjectImpl#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link rebel_core.impl.ProjectImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link rebel_core.impl.ProjectImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link rebel_core.impl.ProjectImpl#getModelingDate <em>Modeling Date</em>}</li>
 *   <li>{@link rebel_core.impl.ProjectImpl#getView <em>View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The cached value of the '{@link #getBlockofinterest() <em>Blockofinterest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockofinterest()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockOfInterest> blockofinterest;

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
	 * The cached value of the '{@link #getFunctionalviews() <em>Functionalviews</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalviews()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalView> functionalviews;

	/**
	 * The cached value of the '{@link #getDecisions() <em>Decisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Decision> decisions;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> person;

	/**
	 * The default value of the '{@link #getModelingDate() <em>Modeling Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODELING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelingDate() <em>Modeling Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingDate()
	 * @generated
	 * @ordered
	 */
	protected Date modelingDate = MODELING_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchimateView> view;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_corePackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockOfInterest> getBlockofinterest() {
		if (blockofinterest == null) {
			blockofinterest = new EObjectContainmentEList<BlockOfInterest>(BlockOfInterest.class, this,
					Rebel_corePackage.PROJECT__BLOCKOFINTEREST);
		}
		return blockofinterest;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.PROJECT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalView> getFunctionalviews() {
		if (functionalviews == null) {
			functionalviews = new EObjectContainmentEList<FunctionalView>(FunctionalView.class, this,
					Rebel_corePackage.PROJECT__FUNCTIONALVIEWS);
		}
		return functionalviews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decision> getDecisions() {
		if (decisions == null) {
			decisions = new EObjectContainmentEList<Decision>(Decision.class, this,
					Rebel_corePackage.PROJECT__DECISIONS);
		}
		return decisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<Message>(Message.class, this, Rebel_corePackage.PROJECT__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<Person>(Person.class, this, Rebel_corePackage.PROJECT__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getModelingDate() {
		return modelingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelingDate(Date newModelingDate) {
		Date oldModelingDate = modelingDate;
		modelingDate = newModelingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_corePackage.PROJECT__MODELING_DATE,
					oldModelingDate, modelingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArchimateView> getView() {
		if (view == null) {
			view = new EObjectContainmentEList<ArchimateView>(ArchimateView.class, this,
					Rebel_corePackage.PROJECT__VIEW);
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_corePackage.PROJECT__BLOCKOFINTEREST:
			return ((InternalEList<?>) getBlockofinterest()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.PROJECT__FUNCTIONALVIEWS:
			return ((InternalEList<?>) getFunctionalviews()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.PROJECT__DECISIONS:
			return ((InternalEList<?>) getDecisions()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.PROJECT__MESSAGE:
			return ((InternalEList<?>) getMessage()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.PROJECT__PERSON:
			return ((InternalEList<?>) getPerson()).basicRemove(otherEnd, msgs);
		case Rebel_corePackage.PROJECT__VIEW:
			return ((InternalEList<?>) getView()).basicRemove(otherEnd, msgs);
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
		case Rebel_corePackage.PROJECT__BLOCKOFINTEREST:
			return getBlockofinterest();
		case Rebel_corePackage.PROJECT__ID:
			return getId();
		case Rebel_corePackage.PROJECT__NAME:
			return getName();
		case Rebel_corePackage.PROJECT__FUNCTIONALVIEWS:
			return getFunctionalviews();
		case Rebel_corePackage.PROJECT__DECISIONS:
			return getDecisions();
		case Rebel_corePackage.PROJECT__MESSAGE:
			return getMessage();
		case Rebel_corePackage.PROJECT__PERSON:
			return getPerson();
		case Rebel_corePackage.PROJECT__MODELING_DATE:
			return getModelingDate();
		case Rebel_corePackage.PROJECT__VIEW:
			return getView();
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
		case Rebel_corePackage.PROJECT__BLOCKOFINTEREST:
			getBlockofinterest().clear();
			getBlockofinterest().addAll((Collection<? extends BlockOfInterest>) newValue);
			return;
		case Rebel_corePackage.PROJECT__ID:
			setId((Integer) newValue);
			return;
		case Rebel_corePackage.PROJECT__NAME:
			setName((String) newValue);
			return;
		case Rebel_corePackage.PROJECT__FUNCTIONALVIEWS:
			getFunctionalviews().clear();
			getFunctionalviews().addAll((Collection<? extends FunctionalView>) newValue);
			return;
		case Rebel_corePackage.PROJECT__DECISIONS:
			getDecisions().clear();
			getDecisions().addAll((Collection<? extends Decision>) newValue);
			return;
		case Rebel_corePackage.PROJECT__MESSAGE:
			getMessage().clear();
			getMessage().addAll((Collection<? extends Message>) newValue);
			return;
		case Rebel_corePackage.PROJECT__PERSON:
			getPerson().clear();
			getPerson().addAll((Collection<? extends Person>) newValue);
			return;
		case Rebel_corePackage.PROJECT__MODELING_DATE:
			setModelingDate((Date) newValue);
			return;
		case Rebel_corePackage.PROJECT__VIEW:
			getView().clear();
			getView().addAll((Collection<? extends ArchimateView>) newValue);
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
		case Rebel_corePackage.PROJECT__BLOCKOFINTEREST:
			getBlockofinterest().clear();
			return;
		case Rebel_corePackage.PROJECT__ID:
			setId(ID_EDEFAULT);
			return;
		case Rebel_corePackage.PROJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Rebel_corePackage.PROJECT__FUNCTIONALVIEWS:
			getFunctionalviews().clear();
			return;
		case Rebel_corePackage.PROJECT__DECISIONS:
			getDecisions().clear();
			return;
		case Rebel_corePackage.PROJECT__MESSAGE:
			getMessage().clear();
			return;
		case Rebel_corePackage.PROJECT__PERSON:
			getPerson().clear();
			return;
		case Rebel_corePackage.PROJECT__MODELING_DATE:
			setModelingDate(MODELING_DATE_EDEFAULT);
			return;
		case Rebel_corePackage.PROJECT__VIEW:
			getView().clear();
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
		case Rebel_corePackage.PROJECT__BLOCKOFINTEREST:
			return blockofinterest != null && !blockofinterest.isEmpty();
		case Rebel_corePackage.PROJECT__ID:
			return id != ID_EDEFAULT;
		case Rebel_corePackage.PROJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Rebel_corePackage.PROJECT__FUNCTIONALVIEWS:
			return functionalviews != null && !functionalviews.isEmpty();
		case Rebel_corePackage.PROJECT__DECISIONS:
			return decisions != null && !decisions.isEmpty();
		case Rebel_corePackage.PROJECT__MESSAGE:
			return message != null && !message.isEmpty();
		case Rebel_corePackage.PROJECT__PERSON:
			return person != null && !person.isEmpty();
		case Rebel_corePackage.PROJECT__MODELING_DATE:
			return MODELING_DATE_EDEFAULT == null ? modelingDate != null : !MODELING_DATE_EDEFAULT.equals(modelingDate);
		case Rebel_corePackage.PROJECT__VIEW:
			return view != null && !view.isEmpty();
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
		result.append(", modelingDate: ");
		result.append(modelingDate);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
