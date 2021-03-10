/**
 */
package rebel_architecturaldecisions;

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
 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsFactory
 * @model kind="package"
 * @generated
 */
public interface Rebel_architecturaldecisionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rebel_architecturaldecisions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uniandes/rebel_architecturaldecisions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rebel_architecturaldecisions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rebel_architecturaldecisionsPackage eINSTANCE = rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link rebel_architecturaldecisions.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.impl.ProjectImpl
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Responsibles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESPONSIBLES = 0;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DECISIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 2;

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
	 * The meta object id for the '{@link rebel_architecturaldecisions.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.impl.DecisionImpl
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TITLE = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__STATE = 2;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ALTERNATIVES = 3;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ASSUMPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Consequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__CONSEQUENCES = 5;

	/**
	 * The feature id for the '<em><b>Motivated By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__MOTIVATED_BY = 6;

	/**
	 * The feature id for the '<em><b>Supercedes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__SUPERCEDES = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DATE = 8;

	/**
	 * The feature id for the '<em><b>Deciders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DECIDERS = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__PHASE = 11;

	/**
	 * The feature id for the '<em><b>User Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__USER_STORIES = 12;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_architecturaldecisions.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.impl.PersonImpl
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getPerson()
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
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_architecturaldecisions.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.impl.AssumptionImpl
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_architecturaldecisions.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.impl.AlternativeImpl
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_architecturaldecisions.impl.ConsequenceImpl <em>Consequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.impl.ConsequenceImpl
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getConsequence()
	 * @generated
	 */
	int CONSEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_architecturaldecisions.impl.MotivatorImpl <em>Motivator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.impl.MotivatorImpl
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getMotivator()
	 * @generated
	 */
	int MOTIVATOR = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATOR__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Motivator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Motivator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_architecturaldecisions.impl.UserStoryImpl <em>User Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.impl.UserStoryImpl
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getUserStory()
	 * @generated
	 */
	int USER_STORY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__ID = 0;

	/**
	 * The number of structural features of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_architecturaldecisions.ModelType <em>Model Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.ModelType
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 8;

	/**
	 * The meta object id for the '{@link rebel_architecturaldecisions.StateType <em>State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.StateType
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 9;

	/**
	 * The meta object id for the '{@link rebel_architecturaldecisions.ConsequenceType <em>Consequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_architecturaldecisions.ConsequenceType
	 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getConsequenceType()
	 * @generated
	 */
	int CONSEQUENCE_TYPE = 10;

	/**
	 * Returns the meta object for class '{@link rebel_architecturaldecisions.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see rebel_architecturaldecisions.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_architecturaldecisions.Project#getResponsibles <em>Responsibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsibles</em>'.
	 * @see rebel_architecturaldecisions.Project#getResponsibles()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Responsibles();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_architecturaldecisions.Project#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisions</em>'.
	 * @see rebel_architecturaldecisions.Project#getDecisions()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Decisions();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_architecturaldecisions.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Project#getModelingDate <em>Modeling Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modeling Date</em>'.
	 * @see rebel_architecturaldecisions.Project#getModelingDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ModelingDate();

	/**
	 * Returns the meta object for class '{@link rebel_architecturaldecisions.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see rebel_architecturaldecisions.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Decision#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see rebel_architecturaldecisions.Decision#getNumber()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Number();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Decision#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see rebel_architecturaldecisions.Decision#getTitle()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Title();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Decision#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see rebel_architecturaldecisions.Decision#getState()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_State();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_architecturaldecisions.Decision#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see rebel_architecturaldecisions.Decision#getAlternatives()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Alternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_architecturaldecisions.Decision#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assumptions</em>'.
	 * @see rebel_architecturaldecisions.Decision#getAssumptions()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Assumptions();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_architecturaldecisions.Decision#getConsequences <em>Consequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consequences</em>'.
	 * @see rebel_architecturaldecisions.Decision#getConsequences()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Consequences();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_architecturaldecisions.Decision#getMotivatedBy <em>Motivated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motivated By</em>'.
	 * @see rebel_architecturaldecisions.Decision#getMotivatedBy()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_MotivatedBy();

	/**
	 * Returns the meta object for the reference '{@link rebel_architecturaldecisions.Decision#getSupercedes <em>Supercedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supercedes</em>'.
	 * @see rebel_architecturaldecisions.Decision#getSupercedes()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Supercedes();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Decision#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see rebel_architecturaldecisions.Decision#getDate()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_architecturaldecisions.Decision#getDeciders <em>Deciders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deciders</em>'.
	 * @see rebel_architecturaldecisions.Decision#getDeciders()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Deciders();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Decision#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_architecturaldecisions.Decision#getDescription()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Description();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Decision#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see rebel_architecturaldecisions.Decision#getPhase()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Phase();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_architecturaldecisions.Decision#getUserStories <em>User Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Stories</em>'.
	 * @see rebel_architecturaldecisions.Decision#getUserStories()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_UserStories();

	/**
	 * Returns the meta object for class '{@link rebel_architecturaldecisions.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see rebel_architecturaldecisions.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_architecturaldecisions.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link rebel_architecturaldecisions.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see rebel_architecturaldecisions.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Assumption#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_architecturaldecisions.Assumption#getDescription()
	 * @see #getAssumption()
	 * @generated
	 */
	EAttribute getAssumption_Description();

	/**
	 * Returns the meta object for class '{@link rebel_architecturaldecisions.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see rebel_architecturaldecisions.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Alternative#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_architecturaldecisions.Alternative#getDescription()
	 * @see #getAlternative()
	 * @generated
	 */
	EAttribute getAlternative_Description();

	/**
	 * Returns the meta object for class '{@link rebel_architecturaldecisions.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consequence</em>'.
	 * @see rebel_architecturaldecisions.Consequence
	 * @generated
	 */
	EClass getConsequence();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Consequence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_architecturaldecisions.Consequence#getDescription()
	 * @see #getConsequence()
	 * @generated
	 */
	EAttribute getConsequence_Description();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Consequence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_architecturaldecisions.Consequence#getType()
	 * @see #getConsequence()
	 * @generated
	 */
	EAttribute getConsequence_Type();

	/**
	 * Returns the meta object for class '{@link rebel_architecturaldecisions.Motivator <em>Motivator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motivator</em>'.
	 * @see rebel_architecturaldecisions.Motivator
	 * @generated
	 */
	EClass getMotivator();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.Motivator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_architecturaldecisions.Motivator#getDescription()
	 * @see #getMotivator()
	 * @generated
	 */
	EAttribute getMotivator_Description();

	/**
	 * Returns the meta object for class '{@link rebel_architecturaldecisions.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Story</em>'.
	 * @see rebel_architecturaldecisions.UserStory
	 * @generated
	 */
	EClass getUserStory();

	/**
	 * Returns the meta object for the attribute '{@link rebel_architecturaldecisions.UserStory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_architecturaldecisions.UserStory#getId()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Id();

	/**
	 * Returns the meta object for enum '{@link rebel_architecturaldecisions.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Type</em>'.
	 * @see rebel_architecturaldecisions.ModelType
	 * @generated
	 */
	EEnum getModelType();

	/**
	 * Returns the meta object for enum '{@link rebel_architecturaldecisions.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Type</em>'.
	 * @see rebel_architecturaldecisions.StateType
	 * @generated
	 */
	EEnum getStateType();

	/**
	 * Returns the meta object for enum '{@link rebel_architecturaldecisions.ConsequenceType <em>Consequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consequence Type</em>'.
	 * @see rebel_architecturaldecisions.ConsequenceType
	 * @generated
	 */
	EEnum getConsequenceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Rebel_architecturaldecisionsFactory getRebel_architecturaldecisionsFactory();

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
		 * The meta object literal for the '{@link rebel_architecturaldecisions.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.impl.ProjectImpl
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Responsibles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RESPONSIBLES = eINSTANCE.getProject_Responsibles();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DECISIONS = eINSTANCE.getProject_Decisions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Modeling Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__MODELING_DATE = eINSTANCE.getProject_ModelingDate();

		/**
		 * The meta object literal for the '{@link rebel_architecturaldecisions.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.impl.DecisionImpl
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__NUMBER = eINSTANCE.getDecision_Number();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__TITLE = eINSTANCE.getDecision_Title();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__STATE = eINSTANCE.getDecision_State();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__ALTERNATIVES = eINSTANCE.getDecision_Alternatives();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__ASSUMPTIONS = eINSTANCE.getDecision_Assumptions();

		/**
		 * The meta object literal for the '<em><b>Consequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__CONSEQUENCES = eINSTANCE.getDecision_Consequences();

		/**
		 * The meta object literal for the '<em><b>Motivated By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__MOTIVATED_BY = eINSTANCE.getDecision_MotivatedBy();

		/**
		 * The meta object literal for the '<em><b>Supercedes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__SUPERCEDES = eINSTANCE.getDecision_Supercedes();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__DATE = eINSTANCE.getDecision_Date();

		/**
		 * The meta object literal for the '<em><b>Deciders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__DECIDERS = eINSTANCE.getDecision_Deciders();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__DESCRIPTION = eINSTANCE.getDecision_Description();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__PHASE = eINSTANCE.getDecision_Phase();

		/**
		 * The meta object literal for the '<em><b>User Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__USER_STORIES = eINSTANCE.getDecision_UserStories();

		/**
		 * The meta object literal for the '{@link rebel_architecturaldecisions.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.impl.PersonImpl
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getPerson()
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
		 * The meta object literal for the '{@link rebel_architecturaldecisions.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.impl.AssumptionImpl
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSUMPTION__DESCRIPTION = eINSTANCE.getAssumption_Description();

		/**
		 * The meta object literal for the '{@link rebel_architecturaldecisions.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.impl.AlternativeImpl
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVE__DESCRIPTION = eINSTANCE.getAlternative_Description();

		/**
		 * The meta object literal for the '{@link rebel_architecturaldecisions.impl.ConsequenceImpl <em>Consequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.impl.ConsequenceImpl
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getConsequence()
		 * @generated
		 */
		EClass CONSEQUENCE = eINSTANCE.getConsequence();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSEQUENCE__DESCRIPTION = eINSTANCE.getConsequence_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSEQUENCE__TYPE = eINSTANCE.getConsequence_Type();

		/**
		 * The meta object literal for the '{@link rebel_architecturaldecisions.impl.MotivatorImpl <em>Motivator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.impl.MotivatorImpl
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getMotivator()
		 * @generated
		 */
		EClass MOTIVATOR = eINSTANCE.getMotivator();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIVATOR__DESCRIPTION = eINSTANCE.getMotivator_Description();

		/**
		 * The meta object literal for the '{@link rebel_architecturaldecisions.impl.UserStoryImpl <em>User Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.impl.UserStoryImpl
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getUserStory()
		 * @generated
		 */
		EClass USER_STORY = eINSTANCE.getUserStory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__ID = eINSTANCE.getUserStory_Id();

		/**
		 * The meta object literal for the '{@link rebel_architecturaldecisions.ModelType <em>Model Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.ModelType
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getModelType()
		 * @generated
		 */
		EEnum MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '{@link rebel_architecturaldecisions.StateType <em>State Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.StateType
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getStateType()
		 * @generated
		 */
		EEnum STATE_TYPE = eINSTANCE.getStateType();

		/**
		 * The meta object literal for the '{@link rebel_architecturaldecisions.ConsequenceType <em>Consequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_architecturaldecisions.ConsequenceType
		 * @see rebel_architecturaldecisions.impl.Rebel_architecturaldecisionsPackageImpl#getConsequenceType()
		 * @generated
		 */
		EEnum CONSEQUENCE_TYPE = eINSTANCE.getConsequenceType();

	}

} //Rebel_architecturaldecisionsPackage
