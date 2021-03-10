/**
 */
package rebel_core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rebel_core.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rebel_core.Rebel_corePackage
 * @generated
 */
public class Rebel_coreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Rebel_corePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rebel_coreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Rebel_corePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rebel_coreSwitch<Adapter> modelSwitch = new Rebel_coreSwitch<Adapter>() {
		@Override
		public Adapter caseFact(Fact object) {
			return createFactAdapter();
		}

		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter caseBlockOfInterest(BlockOfInterest object) {
			return createBlockOfInterestAdapter();
		}

		@Override
		public Adapter caseFunctionalView(FunctionalView object) {
			return createFunctionalViewAdapter();
		}

		@Override
		public Adapter caseConnector(Connector object) {
			return createConnectorAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseAdaptor(Adaptor object) {
			return createAdaptorAdapter();
		}

		@Override
		public Adapter caseDistributor(Distributor object) {
			return createDistributorAdapter();
		}

		@Override
		public Adapter caseStream(Stream object) {
			return createStreamAdapter();
		}

		@Override
		public Adapter caseProcedureCall(ProcedureCall object) {
			return createProcedureCallAdapter();
		}

		@Override
		public Adapter caseArbitrator(Arbitrator object) {
			return createArbitratorAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseDecision(Decision object) {
			return createDecisionAdapter();
		}

		@Override
		public Adapter caseAssumption(Assumption object) {
			return createAssumptionAdapter();
		}

		@Override
		public Adapter caseUserStory(UserStory object) {
			return createUserStoryAdapter();
		}

		@Override
		public Adapter caseConsequence(Consequence object) {
			return createConsequenceAdapter();
		}

		@Override
		public Adapter caseMotivator(Motivator object) {
			return createMotivatorAdapter();
		}

		@Override
		public Adapter caseAlternative(Alternative object) {
			return createAlternativeAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter casePerson(Person object) {
			return createPersonAdapter();
		}

		@Override
		public Adapter caseRelation(Relation object) {
			return createRelationAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseArchimateView(ArchimateView object) {
			return createArchimateViewAdapter();
		}

		@Override
		public Adapter caseATDItem(ATDItem object) {
			return createATDItemAdapter();
		}

		@Override
		public Adapter caseATDRationale(ATDRationale object) {
			return createATDRationaleAdapter();
		}

		@Override
		public Adapter caseATDBenefit(ATDBenefit object) {
			return createATDBenefitAdapter();
		}

		@Override
		public Adapter caseATDEffect(ATDEffect object) {
			return createATDEffectAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Fact
	 * @generated
	 */
	public Adapter createFactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.BlockOfInterest <em>Block Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.BlockOfInterest
	 * @generated
	 */
	public Adapter createBlockOfInterestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.FunctionalView <em>Functional View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.FunctionalView
	 * @generated
	 */
	public Adapter createFunctionalViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Adaptor <em>Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Adaptor
	 * @generated
	 */
	public Adapter createAdaptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Distributor <em>Distributor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Distributor
	 * @generated
	 */
	public Adapter createDistributorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Stream
	 * @generated
	 */
	public Adapter createStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.ProcedureCall <em>Procedure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.ProcedureCall
	 * @generated
	 */
	public Adapter createProcedureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Arbitrator <em>Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Arbitrator
	 * @generated
	 */
	public Adapter createArbitratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Assumption
	 * @generated
	 */
	public Adapter createAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.UserStory
	 * @generated
	 */
	public Adapter createUserStoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Consequence
	 * @generated
	 */
	public Adapter createConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Motivator <em>Motivator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Motivator
	 * @generated
	 */
	public Adapter createMotivatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.ArchimateView <em>Archimate View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.ArchimateView
	 * @generated
	 */
	public Adapter createArchimateViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.ATDItem <em>ATD Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.ATDItem
	 * @generated
	 */
	public Adapter createATDItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.ATDRationale <em>ATD Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.ATDRationale
	 * @generated
	 */
	public Adapter createATDRationaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.ATDBenefit <em>ATD Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.ATDBenefit
	 * @generated
	 */
	public Adapter createATDBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_core.ATDEffect <em>ATD Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_core.ATDEffect
	 * @generated
	 */
	public Adapter createATDEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Rebel_coreAdapterFactory
