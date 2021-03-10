/**
 */
package rebel_github;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rebel_github.Rebel_githubFactory
 * @model kind="package"
 * @generated
 */
public interface Rebel_githubPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rebel_github";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uniandes/rebel_github";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rebel_github";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rebel_githubPackage eINSTANCE = rebel_github.impl.Rebel_githubPackageImpl.init();

	/**
	 * The meta object id for the '{@link rebel_github.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_github.impl.ProjectImpl
	 * @see rebel_github.impl.Rebel_githubPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MESSAGES = 2;

	/**
	 * The feature id for the '<em><b>Modeling Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MODELING_DATE = 3;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_github.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_github.impl.MessageImpl
	 * @see rebel_github.impl.Rebel_githubPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FOOTER = 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SCOPE = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BODY = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ACTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DATE = 7;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PERSON = 8;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_github.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_github.impl.PersonImpl
	 * @see rebel_github.impl.Rebel_githubPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MESSAGES = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_github.OPERATIONTYPE <em>OPERATIONTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_github.OPERATIONTYPE
	 * @see rebel_github.impl.Rebel_githubPackageImpl#getOPERATIONTYPE()
	 * @generated
	 */
	int OPERATIONTYPE = 3;

	/**
	 * The meta object id for the '{@link rebel_github.ACTIONTYPE <em>ACTIONTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_github.ACTIONTYPE
	 * @see rebel_github.impl.Rebel_githubPackageImpl#getACTIONTYPE()
	 * @generated
	 */
	int ACTIONTYPE = 4;

	/**
	 * Returns the meta object for class '{@link rebel_github.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see rebel_github.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_github.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_github.Project#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see rebel_github.Project#getMembers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_github.Project#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see rebel_github.Project#getMessages()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Messages();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Project#getModelingDate <em>Modeling Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modeling Date</em>'.
	 * @see rebel_github.Project#getModelingDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ModelingDate();

	/**
	 * Returns the meta object for class '{@link rebel_github.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see rebel_github.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Message#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see rebel_github.Message#getSubject()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Subject();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Message#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see rebel_github.Message#getFooter()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Footer();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Message#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see rebel_github.Message#getScope()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Scope();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Message#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see rebel_github.Message#getBody()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Body();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_github.Message#getType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Type();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Message#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see rebel_github.Message#getAction()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Action();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Message#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_github.Message#getId()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Message#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see rebel_github.Message#getDate()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Date();

	/**
	 * Returns the meta object for the reference '{@link rebel_github.Message#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see rebel_github.Message#getPerson()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Person();

	/**
	 * Returns the meta object for class '{@link rebel_github.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see rebel_github.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_github.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_github.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see rebel_github.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the reference list '{@link rebel_github.Person#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Messages</em>'.
	 * @see rebel_github.Person#getMessages()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Messages();

	/**
	 * Returns the meta object for enum '{@link rebel_github.OPERATIONTYPE <em>OPERATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OPERATIONTYPE</em>'.
	 * @see rebel_github.OPERATIONTYPE
	 * @generated
	 */
	EEnum getOPERATIONTYPE();

	/**
	 * Returns the meta object for enum '{@link rebel_github.ACTIONTYPE <em>ACTIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ACTIONTYPE</em>'.
	 * @see rebel_github.ACTIONTYPE
	 * @generated
	 */
	EEnum getACTIONTYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Rebel_githubFactory getRebel_githubFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rebel_github.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_github.impl.ProjectImpl
		 * @see rebel_github.impl.Rebel_githubPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MEMBERS = eINSTANCE.getProject_Members();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MESSAGES = eINSTANCE.getProject_Messages();

		/**
		 * The meta object literal for the '<em><b>Modeling Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__MODELING_DATE = eINSTANCE.getProject_ModelingDate();

		/**
		 * The meta object literal for the '{@link rebel_github.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_github.impl.MessageImpl
		 * @see rebel_github.impl.Rebel_githubPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__SUBJECT = eINSTANCE.getMessage_Subject();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__FOOTER = eINSTANCE.getMessage_Footer();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__SCOPE = eINSTANCE.getMessage_Scope();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__BODY = eINSTANCE.getMessage_Body();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TYPE = eINSTANCE.getMessage_Type();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ACTION = eINSTANCE.getMessage_Action();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ID = eINSTANCE.getMessage_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DATE = eINSTANCE.getMessage_Date();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__PERSON = eINSTANCE.getMessage_Person();

		/**
		 * The meta object literal for the '{@link rebel_github.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_github.impl.PersonImpl
		 * @see rebel_github.impl.Rebel_githubPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MESSAGES = eINSTANCE.getPerson_Messages();

		/**
		 * The meta object literal for the '{@link rebel_github.OPERATIONTYPE <em>OPERATIONTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_github.OPERATIONTYPE
		 * @see rebel_github.impl.Rebel_githubPackageImpl#getOPERATIONTYPE()
		 * @generated
		 */
		EEnum OPERATIONTYPE = eINSTANCE.getOPERATIONTYPE();

		/**
		 * The meta object literal for the '{@link rebel_github.ACTIONTYPE <em>ACTIONTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_github.ACTIONTYPE
		 * @see rebel_github.impl.Rebel_githubPackageImpl#getACTIONTYPE()
		 * @generated
		 */
		EEnum ACTIONTYPE = eINSTANCE.getACTIONTYPE();

	}

} //Rebel_githubPackage
