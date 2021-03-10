/**
 */
package rebel_componentandconnector.impl;

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

import rebel_componentandconnector.FunctionalView;
import rebel_componentandconnector.Project;
import rebel_componentandconnector.Rebel_componentandconnectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_componentandconnector.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ProjectImpl#getFunctionalviews <em>Functionalviews</em>}</li>
 *   <li>{@link rebel_componentandconnector.impl.ProjectImpl#getModelingDate <em>Modeling Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
		return Rebel_componentandconnectorPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_componentandconnectorPackage.PROJECT__NAME,
					oldName, name));
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
					Rebel_componentandconnectorPackage.PROJECT__FUNCTIONALVIEWS);
		}
		return functionalviews;
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
					Rebel_componentandconnectorPackage.PROJECT__MODELING_DATE, oldModelingDate, modelingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_componentandconnectorPackage.PROJECT__FUNCTIONALVIEWS:
			return ((InternalEList<?>) getFunctionalviews()).basicRemove(otherEnd, msgs);
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
		case Rebel_componentandconnectorPackage.PROJECT__NAME:
			return getName();
		case Rebel_componentandconnectorPackage.PROJECT__FUNCTIONALVIEWS:
			return getFunctionalviews();
		case Rebel_componentandconnectorPackage.PROJECT__MODELING_DATE:
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
		case Rebel_componentandconnectorPackage.PROJECT__NAME:
			setName((String) newValue);
			return;
		case Rebel_componentandconnectorPackage.PROJECT__FUNCTIONALVIEWS:
			getFunctionalviews().clear();
			getFunctionalviews().addAll((Collection<? extends FunctionalView>) newValue);
			return;
		case Rebel_componentandconnectorPackage.PROJECT__MODELING_DATE:
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
		case Rebel_componentandconnectorPackage.PROJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Rebel_componentandconnectorPackage.PROJECT__FUNCTIONALVIEWS:
			getFunctionalviews().clear();
			return;
		case Rebel_componentandconnectorPackage.PROJECT__MODELING_DATE:
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
		case Rebel_componentandconnectorPackage.PROJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Rebel_componentandconnectorPackage.PROJECT__FUNCTIONALVIEWS:
			return functionalviews != null && !functionalviews.isEmpty();
		case Rebel_componentandconnectorPackage.PROJECT__MODELING_DATE:
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
