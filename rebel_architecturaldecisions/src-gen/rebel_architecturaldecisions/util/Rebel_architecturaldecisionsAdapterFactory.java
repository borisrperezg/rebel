/**
 */
package rebel_architecturaldecisions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rebel_architecturaldecisions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage
 * @generated
 */
public class Rebel_architecturaldecisionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Rebel_architecturaldecisionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rebel_architecturaldecisionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Rebel_architecturaldecisionsPackage.eINSTANCE;
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
	protected Rebel_architecturaldecisionsSwitch<Adapter> modelSwitch = new Rebel_architecturaldecisionsSwitch<Adapter>() {
		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter caseDecision(Decision object) {
			return createDecisionAdapter();
		}

		@Override
		public Adapter casePerson(Person object) {
			return createPersonAdapter();
		}

		@Override
		public Adapter caseAssumption(Assumption object) {
			return createAssumptionAdapter();
		}

		@Override
		public Adapter caseAlternative(Alternative object) {
			return createAlternativeAdapter();
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
		public Adapter caseUserStory(UserStory object) {
			return createUserStoryAdapter();
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
	 * Creates a new adapter for an object of class '{@link rebel_architecturaldecisions.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_architecturaldecisions.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_architecturaldecisions.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_architecturaldecisions.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_architecturaldecisions.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_architecturaldecisions.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_architecturaldecisions.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_architecturaldecisions.Assumption
	 * @generated
	 */
	public Adapter createAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_architecturaldecisions.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_architecturaldecisions.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_architecturaldecisions.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_architecturaldecisions.Consequence
	 * @generated
	 */
	public Adapter createConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_architecturaldecisions.Motivator <em>Motivator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_architecturaldecisions.Motivator
	 * @generated
	 */
	public Adapter createMotivatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_architecturaldecisions.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_architecturaldecisions.UserStory
	 * @generated
	 */
	public Adapter createUserStoryAdapter() {
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

} //Rebel_architecturaldecisionsAdapterFactory
