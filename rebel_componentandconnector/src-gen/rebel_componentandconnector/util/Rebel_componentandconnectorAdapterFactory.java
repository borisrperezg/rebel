/**
 */
package rebel_componentandconnector.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rebel_componentandconnector.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage
 * @generated
 */
public class Rebel_componentandconnectorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Rebel_componentandconnectorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rebel_componentandconnectorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Rebel_componentandconnectorPackage.eINSTANCE;
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
	protected Rebel_componentandconnectorSwitch<Adapter> modelSwitch = new Rebel_componentandconnectorSwitch<Adapter>() {
		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseConnector(Connector object) {
			return createConnectorAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseArbitrator(Arbitrator object) {
			return createArbitratorAdapter();
		}

		@Override
		public Adapter caseStream(Stream object) {
			return createStreamAdapter();
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
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseProcedureCall(ProcedureCall object) {
			return createProcedureCallAdapter();
		}

		@Override
		public Adapter caseFunctionalView(FunctionalView object) {
			return createFunctionalViewAdapter();
		}

		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.Arbitrator <em>Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.Arbitrator
	 * @generated
	 */
	public Adapter createArbitratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.Stream
	 * @generated
	 */
	public Adapter createStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.Adaptor <em>Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.Adaptor
	 * @generated
	 */
	public Adapter createAdaptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.Distributor <em>Distributor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.Distributor
	 * @generated
	 */
	public Adapter createDistributorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.ProcedureCall <em>Procedure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.ProcedureCall
	 * @generated
	 */
	public Adapter createProcedureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.FunctionalView <em>Functional View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.FunctionalView
	 * @generated
	 */
	public Adapter createFunctionalViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rebel_componentandconnector.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rebel_componentandconnector.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
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

} //Rebel_componentandconnectorAdapterFactory
