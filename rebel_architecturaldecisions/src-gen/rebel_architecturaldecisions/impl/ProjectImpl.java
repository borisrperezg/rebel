/**
 */
package rebel_architecturaldecisions.impl;

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

import rebel_architecturaldecisions.Decision;
import rebel_architecturaldecisions.Person;
import rebel_architecturaldecisions.Project;
import rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_architecturaldecisions.impl.ProjectImpl#getResponsibles <em>Responsibles</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.impl.ProjectImpl#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.impl.ProjectImpl#getModelingDate <em>Modeling Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The cached value of the '{@link #getResponsibles() <em>Responsibles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibles()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> responsibles;

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
		return Rebel_architecturaldecisionsPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getResponsibles() {
		if (responsibles == null) {
			responsibles = new EObjectContainmentEList<Person>(Person.class, this,
					Rebel_architecturaldecisionsPackage.PROJECT__RESPONSIBLES);
		}
		return responsibles;
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
					Rebel_architecturaldecisionsPackage.PROJECT__DECISIONS);
		}
		return decisions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_architecturaldecisionsPackage.PROJECT__NAME,
					oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Rebel_architecturaldecisionsPackage.PROJECT__MODELING_DATE, oldModelingDate, modelingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_architecturaldecisionsPackage.PROJECT__RESPONSIBLES:
			return ((InternalEList<?>) getResponsibles()).basicRemove(otherEnd, msgs);
		case Rebel_architecturaldecisionsPackage.PROJECT__DECISIONS:
			return ((InternalEList<?>) getDecisions()).basicRemove(otherEnd, msgs);
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
		case Rebel_architecturaldecisionsPackage.PROJECT__RESPONSIBLES:
			return getResponsibles();
		case Rebel_architecturaldecisionsPackage.PROJECT__DECISIONS:
			return getDecisions();
		case Rebel_architecturaldecisionsPackage.PROJECT__NAME:
			return getName();
		case Rebel_architecturaldecisionsPackage.PROJECT__MODELING_DATE:
			return getModelingDate();
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
		case Rebel_architecturaldecisionsPackage.PROJECT__RESPONSIBLES:
			getResponsibles().clear();
			getResponsibles().addAll((Collection<? extends Person>) newValue);
			return;
		case Rebel_architecturaldecisionsPackage.PROJECT__DECISIONS:
			getDecisions().clear();
			getDecisions().addAll((Collection<? extends Decision>) newValue);
			return;
		case Rebel_architecturaldecisionsPackage.PROJECT__NAME:
			setName((String) newValue);
			return;
		case Rebel_architecturaldecisionsPackage.PROJECT__MODELING_DATE:
			setModelingDate((Date) newValue);
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
		case Rebel_architecturaldecisionsPackage.PROJECT__RESPONSIBLES:
			getResponsibles().clear();
			return;
		case Rebel_architecturaldecisionsPackage.PROJECT__DECISIONS:
			getDecisions().clear();
			return;
		case Rebel_architecturaldecisionsPackage.PROJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Rebel_architecturaldecisionsPackage.PROJECT__MODELING_DATE:
			setModelingDate(MODELING_DATE_EDEFAULT);
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
		case Rebel_architecturaldecisionsPackage.PROJECT__RESPONSIBLES:
			return responsibles != null && !responsibles.isEmpty();
		case Rebel_architecturaldecisionsPackage.PROJECT__DECISIONS:
			return decisions != null && !decisions.isEmpty();
		case Rebel_architecturaldecisionsPackage.PROJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Rebel_architecturaldecisionsPackage.PROJECT__MODELING_DATE:
			return MODELING_DATE_EDEFAULT == null ? modelingDate != null : !MODELING_DATE_EDEFAULT.equals(modelingDate);
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
		result.append(", modelingDate: ");
		result.append(modelingDate);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
