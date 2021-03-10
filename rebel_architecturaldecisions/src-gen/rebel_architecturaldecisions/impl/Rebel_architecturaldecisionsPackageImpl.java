/**
 */
package rebel_architecturaldecisions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rebel_architecturaldecisions.Alternative;
import rebel_architecturaldecisions.Assumption;
import rebel_architecturaldecisions.Consequence;
import rebel_architecturaldecisions.ConsequenceType;
import rebel_architecturaldecisions.Decision;
import rebel_architecturaldecisions.ModelType;
import rebel_architecturaldecisions.Motivator;
import rebel_architecturaldecisions.Person;
import rebel_architecturaldecisions.Project;
import rebel_architecturaldecisions.Rebel_architecturaldecisionsFactory;
import rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage;
import rebel_architecturaldecisions.StateType;
import rebel_architecturaldecisions.UserStory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rebel_architecturaldecisionsPackageImpl extends EPackageImpl
		implements Rebel_architecturaldecisionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motivatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userStoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consequenceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Rebel_architecturaldecisionsPackageImpl() {
		super(eNS_URI, Rebel_architecturaldecisionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Rebel_architecturaldecisionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Rebel_architecturaldecisionsPackage init() {
		if (isInited)
			return (Rebel_architecturaldecisionsPackage) EPackage.Registry.INSTANCE
					.getEPackage(Rebel_architecturaldecisionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRebel_architecturaldecisionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Rebel_architecturaldecisionsPackageImpl theRebel_architecturaldecisionsPackage = registeredRebel_architecturaldecisionsPackage instanceof Rebel_architecturaldecisionsPackageImpl
				? (Rebel_architecturaldecisionsPackageImpl) registeredRebel_architecturaldecisionsPackage
				: new Rebel_architecturaldecisionsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRebel_architecturaldecisionsPackage.createPackageContents();

		// Initialize created meta-data
		theRebel_architecturaldecisionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRebel_architecturaldecisionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Rebel_architecturaldecisionsPackage.eNS_URI,
				theRebel_architecturaldecisionsPackage);
		return theRebel_architecturaldecisionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Responsibles() {
		return (EReference) projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Decisions() {
		return (EReference) projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Name() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ModelingDate() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_Number() {
		return (EAttribute) decisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_Title() {
		return (EAttribute) decisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_State() {
		return (EAttribute) decisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Alternatives() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Assumptions() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Consequences() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_MotivatedBy() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Supercedes() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_Date() {
		return (EAttribute) decisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Deciders() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_Description() {
		return (EAttribute) decisionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_Phase() {
		return (EAttribute) decisionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_UserStories() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Name() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssumption_Description() {
		return (EAttribute) assumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlternative() {
		return alternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlternative_Description() {
		return (EAttribute) alternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsequence() {
		return consequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsequence_Description() {
		return (EAttribute) consequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsequence_Type() {
		return (EAttribute) consequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMotivator() {
		return motivatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMotivator_Description() {
		return (EAttribute) motivatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserStory() {
		return userStoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserStory_Id() {
		return (EAttribute) userStoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModelType() {
		return modelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStateType() {
		return stateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsequenceType() {
		return consequenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rebel_architecturaldecisionsFactory getRebel_architecturaldecisionsFactory() {
		return (Rebel_architecturaldecisionsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__RESPONSIBLES);
		createEReference(projectEClass, PROJECT__DECISIONS);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__MODELING_DATE);

		decisionEClass = createEClass(DECISION);
		createEAttribute(decisionEClass, DECISION__NUMBER);
		createEAttribute(decisionEClass, DECISION__TITLE);
		createEAttribute(decisionEClass, DECISION__STATE);
		createEReference(decisionEClass, DECISION__ALTERNATIVES);
		createEReference(decisionEClass, DECISION__ASSUMPTIONS);
		createEReference(decisionEClass, DECISION__CONSEQUENCES);
		createEReference(decisionEClass, DECISION__MOTIVATED_BY);
		createEReference(decisionEClass, DECISION__SUPERCEDES);
		createEAttribute(decisionEClass, DECISION__DATE);
		createEReference(decisionEClass, DECISION__DECIDERS);
		createEAttribute(decisionEClass, DECISION__DESCRIPTION);
		createEAttribute(decisionEClass, DECISION__PHASE);
		createEReference(decisionEClass, DECISION__USER_STORIES);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);

		assumptionEClass = createEClass(ASSUMPTION);
		createEAttribute(assumptionEClass, ASSUMPTION__DESCRIPTION);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEAttribute(alternativeEClass, ALTERNATIVE__DESCRIPTION);

		consequenceEClass = createEClass(CONSEQUENCE);
		createEAttribute(consequenceEClass, CONSEQUENCE__DESCRIPTION);
		createEAttribute(consequenceEClass, CONSEQUENCE__TYPE);

		motivatorEClass = createEClass(MOTIVATOR);
		createEAttribute(motivatorEClass, MOTIVATOR__DESCRIPTION);

		userStoryEClass = createEClass(USER_STORY);
		createEAttribute(userStoryEClass, USER_STORY__ID);

		// Create enums
		modelTypeEEnum = createEEnum(MODEL_TYPE);
		stateTypeEEnum = createEEnum(STATE_TYPE);
		consequenceTypeEEnum = createEEnum(CONSEQUENCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Responsibles(), this.getPerson(), null, "responsibles", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Decisions(), this.getDecision(), null, "decisions", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ModelingDate(), ecorePackage.getEDate(), "modelingDate", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecision_Number(), ecorePackage.getEString(), "number", null, 0, 1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Title(), ecorePackage.getEString(), "title", null, 0, 1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_State(), this.getStateType(), "state", null, 0, 1, Decision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Alternatives(), this.getAlternative(), null, "alternatives", null, 0, -1,
				Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Assumptions(), this.getAssumption(), null, "assumptions", null, 0, -1,
				Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Consequences(), this.getConsequence(), null, "consequences", null, 0, -1,
				Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_MotivatedBy(), this.getMotivator(), null, "motivatedBy", null, 0, -1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Supercedes(), this.getDecision(), null, "supercedes", null, 0, 1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Decision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Deciders(), this.getPerson(), null, "deciders", null, 1, -1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Description(), ecorePackage.getEString(), "description", null, 0, 1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Phase(), ecorePackage.getEString(), "phase", null, 0, 1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_UserStories(), this.getUserStory(), null, "userStories", null, 0, -1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssumption_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlternative_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(consequenceEClass, Consequence.class, "Consequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsequence_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Consequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsequence_Type(), this.getConsequenceType(), "type", null, 0, 1, Consequence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motivatorEClass, Motivator.class, "Motivator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotivator_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Motivator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(userStoryEClass, UserStory.class, "UserStory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserStory_Id(), ecorePackage.getEString(), "id", null, 0, 1, UserStory.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modelTypeEEnum, ModelType.class, "ModelType");
		addEEnumLiteral(modelTypeEEnum, ModelType.COMPONENT);
		addEEnumLiteral(modelTypeEEnum, ModelType.DEPLOYMENT);

		initEEnum(stateTypeEEnum, StateType.class, "StateType");
		addEEnumLiteral(stateTypeEEnum, StateType.ACCEPTED);
		addEEnumLiteral(stateTypeEEnum, StateType.PROPOSED);
		addEEnumLiteral(stateTypeEEnum, StateType.DEPRECATED);
		addEEnumLiteral(stateTypeEEnum, StateType.SUPERCEDES);
		addEEnumLiteral(stateTypeEEnum, StateType.REJECTED);

		initEEnum(consequenceTypeEEnum, ConsequenceType.class, "ConsequenceType");
		addEEnumLiteral(consequenceTypeEEnum, ConsequenceType.POSITIVE);
		addEEnumLiteral(consequenceTypeEEnum, ConsequenceType.NEGATIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //Rebel_architecturaldecisionsPackageImpl
