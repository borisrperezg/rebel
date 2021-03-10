/**
 */
package rebel_github.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rebel_github.ACTIONTYPE;
import rebel_github.Message;
import rebel_github.OPERATIONTYPE;
import rebel_github.Person;
import rebel_github.Rebel_githubPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rebel_github.impl.MessageImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link rebel_github.impl.MessageImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link rebel_github.impl.MessageImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link rebel_github.impl.MessageImpl#getBody <em>Body</em>}</li>
 *   <li>{@link rebel_github.impl.MessageImpl#getType <em>Type</em>}</li>
 *   <li>{@link rebel_github.impl.MessageImpl#getAction <em>Action</em>}</li>
 *   <li>{@link rebel_github.impl.MessageImpl#getId <em>Id</em>}</li>
 *   <li>{@link rebel_github.impl.MessageImpl#getDate <em>Date</em>}</li>
 *   <li>{@link rebel_github.impl.MessageImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected String footer = FOOTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OPERATIONTYPE TYPE_EDEFAULT = OPERATIONTYPE.FEAT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OPERATIONTYPE type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ACTIONTYPE ACTION_EDEFAULT = ACTIONTYPE.COMMIT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ACTIONTYPE action = ACTION_EDEFAULT;

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
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rebel_githubPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.MESSAGE__SUBJECT, oldSubject,
					subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooter(String newFooter) {
		String oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.MESSAGE__FOOTER, oldFooter,
					footer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.MESSAGE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.MESSAGE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OPERATIONTYPE getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(OPERATIONTYPE newType) {
		OPERATIONTYPE oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.MESSAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ACTIONTYPE getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(ACTIONTYPE newAction) {
		ACTIONTYPE oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.MESSAGE__ACTION, oldAction,
					action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.MESSAGE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.MESSAGE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject) person;
			person = (Person) eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Rebel_githubPackage.MESSAGE__PERSON,
							oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Rebel_githubPackage.MESSAGE__PERSON, oldPerson, newPerson);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject) person).eInverseRemove(this, Rebel_githubPackage.PERSON__MESSAGES,
						Person.class, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject) newPerson).eInverseAdd(this, Rebel_githubPackage.PERSON__MESSAGES,
						Person.class, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rebel_githubPackage.MESSAGE__PERSON, newPerson,
					newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_githubPackage.MESSAGE__PERSON:
			if (person != null)
				msgs = ((InternalEObject) person).eInverseRemove(this, Rebel_githubPackage.PERSON__MESSAGES,
						Person.class, msgs);
			return basicSetPerson((Person) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rebel_githubPackage.MESSAGE__PERSON:
			return basicSetPerson(null, msgs);
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
		case Rebel_githubPackage.MESSAGE__SUBJECT:
			return getSubject();
		case Rebel_githubPackage.MESSAGE__FOOTER:
			return getFooter();
		case Rebel_githubPackage.MESSAGE__SCOPE:
			return getScope();
		case Rebel_githubPackage.MESSAGE__BODY:
			return getBody();
		case Rebel_githubPackage.MESSAGE__TYPE:
			return getType();
		case Rebel_githubPackage.MESSAGE__ACTION:
			return getAction();
		case Rebel_githubPackage.MESSAGE__ID:
			return getId();
		case Rebel_githubPackage.MESSAGE__DATE:
			return getDate();
		case Rebel_githubPackage.MESSAGE__PERSON:
			if (resolve)
				return getPerson();
			return basicGetPerson();
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
		case Rebel_githubPackage.MESSAGE__SUBJECT:
			setSubject((String) newValue);
			return;
		case Rebel_githubPackage.MESSAGE__FOOTER:
			setFooter((String) newValue);
			return;
		case Rebel_githubPackage.MESSAGE__SCOPE:
			setScope((String) newValue);
			return;
		case Rebel_githubPackage.MESSAGE__BODY:
			setBody((String) newValue);
			return;
		case Rebel_githubPackage.MESSAGE__TYPE:
			setType((OPERATIONTYPE) newValue);
			return;
		case Rebel_githubPackage.MESSAGE__ACTION:
			setAction((ACTIONTYPE) newValue);
			return;
		case Rebel_githubPackage.MESSAGE__ID:
			setId((String) newValue);
			return;
		case Rebel_githubPackage.MESSAGE__DATE:
			setDate((Date) newValue);
			return;
		case Rebel_githubPackage.MESSAGE__PERSON:
			setPerson((Person) newValue);
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
		case Rebel_githubPackage.MESSAGE__SUBJECT:
			setSubject(SUBJECT_EDEFAULT);
			return;
		case Rebel_githubPackage.MESSAGE__FOOTER:
			setFooter(FOOTER_EDEFAULT);
			return;
		case Rebel_githubPackage.MESSAGE__SCOPE:
			setScope(SCOPE_EDEFAULT);
			return;
		case Rebel_githubPackage.MESSAGE__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case Rebel_githubPackage.MESSAGE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Rebel_githubPackage.MESSAGE__ACTION:
			setAction(ACTION_EDEFAULT);
			return;
		case Rebel_githubPackage.MESSAGE__ID:
			setId(ID_EDEFAULT);
			return;
		case Rebel_githubPackage.MESSAGE__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case Rebel_githubPackage.MESSAGE__PERSON:
			setPerson((Person) null);
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
		case Rebel_githubPackage.MESSAGE__SUBJECT:
			return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
		case Rebel_githubPackage.MESSAGE__FOOTER:
			return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
		case Rebel_githubPackage.MESSAGE__SCOPE:
			return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
		case Rebel_githubPackage.MESSAGE__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
		case Rebel_githubPackage.MESSAGE__TYPE:
			return type != TYPE_EDEFAULT;
		case Rebel_githubPackage.MESSAGE__ACTION:
			return action != ACTION_EDEFAULT;
		case Rebel_githubPackage.MESSAGE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Rebel_githubPackage.MESSAGE__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case Rebel_githubPackage.MESSAGE__PERSON:
			return person != null;
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
		result.append(" (subject: ");
		result.append(subject);
		result.append(", footer: ");
		result.append(footer);
		result.append(", scope: ");
		result.append(scope);
		result.append(", body: ");
		result.append(body);
		result.append(", type: ");
		result.append(type);
		result.append(", action: ");
		result.append(action);
		result.append(", id: ");
		result.append(id);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
