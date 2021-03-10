/**
 */
package rebel_architecturaldecisions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rebel_architecturaldecisions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rebel_architecturaldecisionsFactoryImpl extends EFactoryImpl
		implements Rebel_architecturaldecisionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rebel_architecturaldecisionsFactory init() {
		try {
			Rebel_architecturaldecisionsFactory theRebel_architecturaldecisionsFactory = (Rebel_architecturaldecisionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(Rebel_architecturaldecisionsPackage.eNS_URI);
			if (theRebel_architecturaldecisionsFactory != null) {
				return theRebel_architecturaldecisionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Rebel_architecturaldecisionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rebel_architecturaldecisionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Rebel_architecturaldecisionsPackage.PROJECT:
			return createProject();
		case Rebel_architecturaldecisionsPackage.DECISION:
			return createDecision();
		case Rebel_architecturaldecisionsPackage.PERSON:
			return createPerson();
		case Rebel_architecturaldecisionsPackage.ASSUMPTION:
			return createAssumption();
		case Rebel_architecturaldecisionsPackage.ALTERNATIVE:
			return createAlternative();
		case Rebel_architecturaldecisionsPackage.CONSEQUENCE:
			return createConsequence();
		case Rebel_architecturaldecisionsPackage.MOTIVATOR:
			return createMotivator();
		case Rebel_architecturaldecisionsPackage.USER_STORY:
			return createUserStory();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Rebel_architecturaldecisionsPackage.MODEL_TYPE:
			return createModelTypeFromString(eDataType, initialValue);
		case Rebel_architecturaldecisionsPackage.STATE_TYPE:
			return createStateTypeFromString(eDataType, initialValue);
		case Rebel_architecturaldecisionsPackage.CONSEQUENCE_TYPE:
			return createConsequenceTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Rebel_architecturaldecisionsPackage.MODEL_TYPE:
			return convertModelTypeToString(eDataType, instanceValue);
		case Rebel_architecturaldecisionsPackage.STATE_TYPE:
			return convertStateTypeToString(eDataType, instanceValue);
		case Rebel_architecturaldecisionsPackage.CONSEQUENCE_TYPE:
			return convertConsequenceTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consequence createConsequence() {
		ConsequenceImpl consequence = new ConsequenceImpl();
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Motivator createMotivator() {
		MotivatorImpl motivator = new MotivatorImpl();
		return motivator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserStory createUserStory() {
		UserStoryImpl userStory = new UserStoryImpl();
		return userStory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelTypeFromString(EDataType eDataType, String initialValue) {
		ModelType result = ModelType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType createStateTypeFromString(EDataType eDataType, String initialValue) {
		StateType result = StateType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsequenceType createConsequenceTypeFromString(EDataType eDataType, String initialValue) {
		ConsequenceType result = ConsequenceType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rebel_architecturaldecisionsPackage getRebel_architecturaldecisionsPackage() {
		return (Rebel_architecturaldecisionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Rebel_architecturaldecisionsPackage getPackage() {
		return Rebel_architecturaldecisionsPackage.eINSTANCE;
	}

} //Rebel_architecturaldecisionsFactoryImpl
