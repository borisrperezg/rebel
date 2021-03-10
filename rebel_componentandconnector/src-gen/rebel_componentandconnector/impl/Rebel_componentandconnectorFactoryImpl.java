/**
 */
package rebel_componentandconnector.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rebel_componentandconnector.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rebel_componentandconnectorFactoryImpl extends EFactoryImpl implements Rebel_componentandconnectorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rebel_componentandconnectorFactory init() {
		try {
			Rebel_componentandconnectorFactory theRebel_componentandconnectorFactory = (Rebel_componentandconnectorFactory) EPackage.Registry.INSTANCE
					.getEFactory(Rebel_componentandconnectorPackage.eNS_URI);
			if (theRebel_componentandconnectorFactory != null) {
				return theRebel_componentandconnectorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Rebel_componentandconnectorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rebel_componentandconnectorFactoryImpl() {
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
		case Rebel_componentandconnectorPackage.COMPONENT:
			return createComponent();
		case Rebel_componentandconnectorPackage.CONNECTOR:
			return createConnector();
		case Rebel_componentandconnectorPackage.ROLE:
			return createRole();
		case Rebel_componentandconnectorPackage.PORT:
			return createPort();
		case Rebel_componentandconnectorPackage.ARBITRATOR:
			return createArbitrator();
		case Rebel_componentandconnectorPackage.STREAM:
			return createStream();
		case Rebel_componentandconnectorPackage.ADAPTOR:
			return createAdaptor();
		case Rebel_componentandconnectorPackage.DISTRIBUTOR:
			return createDistributor();
		case Rebel_componentandconnectorPackage.EVENT:
			return createEvent();
		case Rebel_componentandconnectorPackage.PROCEDURE_CALL:
			return createProcedureCall();
		case Rebel_componentandconnectorPackage.FUNCTIONAL_VIEW:
			return createFunctionalView();
		case Rebel_componentandconnectorPackage.PROJECT:
			return createProject();
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
		case Rebel_componentandconnectorPackage.ROLE_TYPE:
			return createRoleTypeFromString(eDataType, initialValue);
		case Rebel_componentandconnectorPackage.PORT_TYPE:
			return createPortTypeFromString(eDataType, initialValue);
		case Rebel_componentandconnectorPackage.DELIVERY_MODEL:
			return createDeliveryModelFromString(eDataType, initialValue);
		case Rebel_componentandconnectorPackage.SYNC_TYPE:
			return createSyncTypeFromString(eDataType, initialValue);
		case Rebel_componentandconnectorPackage.NOTIFICATION_MODEL:
			return createNotificationModelFromString(eDataType, initialValue);
		case Rebel_componentandconnectorPackage.BUFFERING:
			return createBufferingFromString(eDataType, initialValue);
		case Rebel_componentandconnectorPackage.THROUGHPUT:
			return createThroughputFromString(eDataType, initialValue);
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
		case Rebel_componentandconnectorPackage.ROLE_TYPE:
			return convertRoleTypeToString(eDataType, instanceValue);
		case Rebel_componentandconnectorPackage.PORT_TYPE:
			return convertPortTypeToString(eDataType, instanceValue);
		case Rebel_componentandconnectorPackage.DELIVERY_MODEL:
			return convertDeliveryModelToString(eDataType, instanceValue);
		case Rebel_componentandconnectorPackage.SYNC_TYPE:
			return convertSyncTypeToString(eDataType, instanceValue);
		case Rebel_componentandconnectorPackage.NOTIFICATION_MODEL:
			return convertNotificationModelToString(eDataType, instanceValue);
		case Rebel_componentandconnectorPackage.BUFFERING:
			return convertBufferingToString(eDataType, instanceValue);
		case Rebel_componentandconnectorPackage.THROUGHPUT:
			return convertThroughputToString(eDataType, instanceValue);
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
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arbitrator createArbitrator() {
		ArbitratorImpl arbitrator = new ArbitratorImpl();
		return arbitrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stream createStream() {
		StreamImpl stream = new StreamImpl();
		return stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adaptor createAdaptor() {
		AdaptorImpl adaptor = new AdaptorImpl();
		return adaptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distributor createDistributor() {
		DistributorImpl distributor = new DistributorImpl();
		return distributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureCall createProcedureCall() {
		ProcedureCallImpl procedureCall = new ProcedureCallImpl();
		return procedureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalView createFunctionalView() {
		FunctionalViewImpl functionalView = new FunctionalViewImpl();
		return functionalView;
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
	public RoleType createRoleTypeFromString(EDataType eDataType, String initialValue) {
		RoleType result = RoleType.get(initialValue);
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
	public String convertRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
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
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryModel createDeliveryModelFromString(EDataType eDataType, String initialValue) {
		DeliveryModel result = DeliveryModel.get(initialValue);
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
	public String convertDeliveryModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncType createSyncTypeFromString(EDataType eDataType, String initialValue) {
		SyncType result = SyncType.get(initialValue);
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
	public String convertSyncTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationModel createNotificationModelFromString(EDataType eDataType, String initialValue) {
		NotificationModel result = NotificationModel.get(initialValue);
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
	public String convertNotificationModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffering createBufferingFromString(EDataType eDataType, String initialValue) {
		Buffering result = Buffering.get(initialValue);
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
	public String convertBufferingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throughput createThroughputFromString(EDataType eDataType, String initialValue) {
		Throughput result = Throughput.get(initialValue);
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
	public String convertThroughputToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rebel_componentandconnectorPackage getRebel_componentandconnectorPackage() {
		return (Rebel_componentandconnectorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Rebel_componentandconnectorPackage getPackage() {
		return Rebel_componentandconnectorPackage.eINSTANCE;
	}

} //Rebel_componentandconnectorFactoryImpl
