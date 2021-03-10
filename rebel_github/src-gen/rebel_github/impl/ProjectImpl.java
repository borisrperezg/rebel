/**
 */
package rebel_github.impl;

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

import rebel_github.Message;
import rebel_github.Person;
import rebel_github.Project;
import rebel_github.Rebel_githubPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_github.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link rebel_github.impl.ProjectImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link rebel_github.impl.ProjectImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link rebel_github.impl.ProjectImpl#getModelingDate <em>Modeling Date</em>}</li>
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
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> members;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

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
		return Rebel_githubPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Person>(Person.class, this, Rebel_githubPackage.PROJECT__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Message>(Message.class, this, Rebel_githubPackage.PROJECT__MESSAGES);
		}
		return messages;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.PROJECT__MODELING_DATE,
					oldModelingDate, modelingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_githubPackage.PROJECT__MEMBERS:
			return ((InternalEList<?>) getMembers()).basicRemove(otherEnd, msgs);
		case Rebel_githubPackage.PROJECT__MESSAGES:
			return ((InternalEList<?>) getMessages()).basicRemove(otherEnd, msgs);
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
		case Rebel_githubPackage.PROJECT__NAME:
			return getName();
		case Rebel_githubPackage.PROJECT__MEMBERS:
			return getMembers();
		case Rebel_githubPackage.PROJECT__MESSAGES:
			return getMessages();
		case Rebel_githubPackage.PROJECT__MODELING_DATE:
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
		case Rebel_githubPackage.PROJECT__NAME:
			setName((String) newValue);
			return;
		case Rebel_githubPackage.PROJECT__MEMBERS:
			getMembers().clear();
			getMembers().addAll((Collection<? extends Person>) newValue);
			return;
		case Rebel_githubPackage.PROJECT__MESSAGES:
			getMessages().clear();
			getMessages().addAll((Collection<? extends Message>) newValue);
			return;
		case Rebel_githubPackage.PROJECT__MODELING_DATE:
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
		case Rebel_githubPackage.PROJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Rebel_githubPackage.PROJECT__MEMBERS:
			getMembers().clear();
			return;
		case Rebel_githubPackage.PROJECT__MESSAGES:
			getMessages().clear();
			return;
		case Rebel_githubPackage.PROJECT__MODELING_DATE:
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
		case Rebel_githubPackage.PROJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Rebel_githubPackage.PROJECT__MEMBERS:
			return members != null && !members.isEmpty();
		case Rebel_githubPackage.PROJECT__MESSAGES:
			return messages != null && !messages.isEmpty();
		case Rebel_githubPackage.PROJECT__MODELING_DATE:
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
