/**
 */
package rebel_componentandconnector;

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
 * @see rebel_componentandconnector.Rebel_componentandconnectorFactory
 * @model kind="package"
 * @generated
 */
public interface Rebel_componentandconnectorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rebel_componentandconnector";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uniandes/rebel_componentandconnector";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rebel_componentandconnector";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rebel_componentandconnectorPackage eINSTANCE = rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.ComponentImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__POS_X = 3;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__POS_Y = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HEIGHT = 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.ConnectorImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DELIVERY = 1;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NOTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BUFFERING = 3;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__THROUGHPUT = 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROTOCOL = 5;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROPS = 6;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ROLES = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ID = 8;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__POS_X = 9;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__POS_Y = 10;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SYNC = 11;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.RoleImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PORT = 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.PortImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.ArbitratorImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getArbitrator()
	 * @generated
	 */
	int ARBITRATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__PROPS = CONNECTOR__PROPS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__ID = CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__POS_X = CONNECTOR__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__POS_Y = CONNECTOR__POS_Y;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__SYNC = CONNECTOR__SYNC;

	/**
	 * The number of structural features of the '<em>Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.StreamImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__PROPS = CONNECTOR__PROPS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__ID = CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__POS_X = CONNECTOR__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__POS_Y = CONNECTOR__POS_Y;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__SYNC = CONNECTOR__SYNC;

	/**
	 * The number of structural features of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.AdaptorImpl <em>Adaptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.AdaptorImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getAdaptor()
	 * @generated
	 */
	int ADAPTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__PROPS = CONNECTOR__PROPS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__ID = CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__POS_X = CONNECTOR__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__POS_Y = CONNECTOR__POS_Y;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__SYNC = CONNECTOR__SYNC;

	/**
	 * The number of structural features of the '<em>Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.DistributorImpl <em>Distributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.DistributorImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getDistributor()
	 * @generated
	 */
	int DISTRIBUTOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__PROPS = CONNECTOR__PROPS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__ID = CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__POS_X = CONNECTOR__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__POS_Y = CONNECTOR__POS_Y;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__SYNC = CONNECTOR__SYNC;

	/**
	 * The number of structural features of the '<em>Distributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.EventImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROPS = CONNECTOR__PROPS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__POS_X = CONNECTOR__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__POS_Y = CONNECTOR__POS_Y;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SYNC = CONNECTOR__SYNC;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.ProcedureCallImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getProcedureCall()
	 * @generated
	 */
	int PROCEDURE_CALL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__PROPS = CONNECTOR__PROPS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__ID = CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__POS_X = CONNECTOR__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__POS_Y = CONNECTOR__POS_Y;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__SYNC = CONNECTOR__SYNC;

	/**
	 * The number of structural features of the '<em>Procedure Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Procedure Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.FunctionalViewImpl <em>Functional View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.FunctionalViewImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getFunctionalView()
	 * @generated
	 */
	int FUNCTIONAL_VIEW = 10;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__CONNECTORS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__NAME = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__DATE = 3;

	/**
	 * The number of structural features of the '<em>Functional View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Functional View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.impl.ProjectImpl
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Functionalviews</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FUNCTIONALVIEWS = 1;

	/**
	 * The feature id for the '<em><b>Modeling Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MODELING_DATE = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.RoleType <em>Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.RoleType
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 12;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.PortType
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 13;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.DeliveryModel <em>Delivery Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.DeliveryModel
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getDeliveryModel()
	 * @generated
	 */
	int DELIVERY_MODEL = 14;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.SyncType <em>Sync Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.SyncType
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getSyncType()
	 * @generated
	 */
	int SYNC_TYPE = 15;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.NotificationModel <em>Notification Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.NotificationModel
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getNotificationModel()
	 * @generated
	 */
	int NOTIFICATION_MODEL = 16;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.Buffering <em>Buffering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.Buffering
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getBuffering()
	 * @generated
	 */
	int BUFFERING = 17;

	/**
	 * The meta object id for the '{@link rebel_componentandconnector.Throughput <em>Throughput</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_componentandconnector.Throughput
	 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getThroughput()
	 * @generated
	 */
	int THROUGHPUT = 18;

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see rebel_componentandconnector.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_componentandconnector.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_componentandconnector.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see rebel_componentandconnector.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_componentandconnector.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Component#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see rebel_componentandconnector.Component#getPosX()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_PosX();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Component#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see rebel_componentandconnector.Component#getPosY()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_PosY();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Component#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see rebel_componentandconnector.Component#getWidth()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Width();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Component#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see rebel_componentandconnector.Component#getHeight()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Height();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see rebel_componentandconnector.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_componentandconnector.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery</em>'.
	 * @see rebel_componentandconnector.Connector#getDelivery()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Delivery();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getSync <em>Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync</em>'.
	 * @see rebel_componentandconnector.Connector#getSync()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Sync();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification</em>'.
	 * @see rebel_componentandconnector.Connector#getNotification()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Notification();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getBuffering <em>Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffering</em>'.
	 * @see rebel_componentandconnector.Connector#getBuffering()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Buffering();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see rebel_componentandconnector.Connector#getThroughput()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see rebel_componentandconnector.Connector#getProtocol()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props</em>'.
	 * @see rebel_componentandconnector.Connector#getProps()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Props();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_componentandconnector.Connector#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see rebel_componentandconnector.Connector#getRoles()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Roles();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_componentandconnector.Connector#getId()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see rebel_componentandconnector.Connector#getPosX()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PosX();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Connector#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see rebel_componentandconnector.Connector#getPosY()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PosY();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see rebel_componentandconnector.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Role#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_componentandconnector.Role#getType()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Type();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_componentandconnector.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference '{@link rebel_componentandconnector.Role#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see rebel_componentandconnector.Role#getPort()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Port();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see rebel_componentandconnector.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_componentandconnector.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_componentandconnector.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Port#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_componentandconnector.Port#getId()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Id();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.Arbitrator <em>Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrator</em>'.
	 * @see rebel_componentandconnector.Arbitrator
	 * @generated
	 */
	EClass getArbitrator();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see rebel_componentandconnector.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.Adaptor <em>Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptor</em>'.
	 * @see rebel_componentandconnector.Adaptor
	 * @generated
	 */
	EClass getAdaptor();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.Distributor <em>Distributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributor</em>'.
	 * @see rebel_componentandconnector.Distributor
	 * @generated
	 */
	EClass getDistributor();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see rebel_componentandconnector.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.ProcedureCall <em>Procedure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Call</em>'.
	 * @see rebel_componentandconnector.ProcedureCall
	 * @generated
	 */
	EClass getProcedureCall();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.FunctionalView <em>Functional View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional View</em>'.
	 * @see rebel_componentandconnector.FunctionalView
	 * @generated
	 */
	EClass getFunctionalView();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_componentandconnector.FunctionalView#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see rebel_componentandconnector.FunctionalView#getComponents()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EReference getFunctionalView_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_componentandconnector.FunctionalView#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see rebel_componentandconnector.FunctionalView#getConnectors()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EReference getFunctionalView_Connectors();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.FunctionalView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_componentandconnector.FunctionalView#getName()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EAttribute getFunctionalView_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.FunctionalView#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see rebel_componentandconnector.FunctionalView#getDate()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EAttribute getFunctionalView_Date();

	/**
	 * Returns the meta object for class '{@link rebel_componentandconnector.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see rebel_componentandconnector.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_componentandconnector.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_componentandconnector.Project#getFunctionalviews <em>Functionalviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionalviews</em>'.
	 * @see rebel_componentandconnector.Project#getFunctionalviews()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Functionalviews();

	/**
	 * Returns the meta object for the attribute '{@link rebel_componentandconnector.Project#getModelingDate <em>Modeling Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modeling Date</em>'.
	 * @see rebel_componentandconnector.Project#getModelingDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ModelingDate();

	/**
	 * Returns the meta object for enum '{@link rebel_componentandconnector.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Type</em>'.
	 * @see rebel_componentandconnector.RoleType
	 * @generated
	 */
	EEnum getRoleType();

	/**
	 * Returns the meta object for enum '{@link rebel_componentandconnector.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see rebel_componentandconnector.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the meta object for enum '{@link rebel_componentandconnector.DeliveryModel <em>Delivery Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Delivery Model</em>'.
	 * @see rebel_componentandconnector.DeliveryModel
	 * @generated
	 */
	EEnum getDeliveryModel();

	/**
	 * Returns the meta object for enum '{@link rebel_componentandconnector.SyncType <em>Sync Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sync Type</em>'.
	 * @see rebel_componentandconnector.SyncType
	 * @generated
	 */
	EEnum getSyncType();

	/**
	 * Returns the meta object for enum '{@link rebel_componentandconnector.NotificationModel <em>Notification Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Model</em>'.
	 * @see rebel_componentandconnector.NotificationModel
	 * @generated
	 */
	EEnum getNotificationModel();

	/**
	 * Returns the meta object for enum '{@link rebel_componentandconnector.Buffering <em>Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Buffering</em>'.
	 * @see rebel_componentandconnector.Buffering
	 * @generated
	 */
	EEnum getBuffering();

	/**
	 * Returns the meta object for enum '{@link rebel_componentandconnector.Throughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throughput</em>'.
	 * @see rebel_componentandconnector.Throughput
	 * @generated
	 */
	EEnum getThroughput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Rebel_componentandconnectorFactory getRebel_componentandconnectorFactory();

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
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.ComponentImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__POS_X = eINSTANCE.getComponent_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__POS_Y = eINSTANCE.getComponent_PosY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__WIDTH = eINSTANCE.getComponent_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__HEIGHT = eINSTANCE.getComponent_Height();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.ConnectorImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DELIVERY = eINSTANCE.getConnector_Delivery();

		/**
		 * The meta object literal for the '<em><b>Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SYNC = eINSTANCE.getConnector_Sync();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NOTIFICATION = eINSTANCE.getConnector_Notification();

		/**
		 * The meta object literal for the '<em><b>Buffering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__BUFFERING = eINSTANCE.getConnector_Buffering();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__THROUGHPUT = eINSTANCE.getConnector_Throughput();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PROTOCOL = eINSTANCE.getConnector_Protocol();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PROPS = eINSTANCE.getConnector_Props();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__ROLES = eINSTANCE.getConnector_Roles();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__ID = eINSTANCE.getConnector_Id();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__POS_X = eINSTANCE.getConnector_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__POS_Y = eINSTANCE.getConnector_PosY();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.RoleImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__TYPE = eINSTANCE.getRole_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PORT = eINSTANCE.getRole_Port();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.PortImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ID = eINSTANCE.getPort_Id();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.ArbitratorImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getArbitrator()
		 * @generated
		 */
		EClass ARBITRATOR = eINSTANCE.getArbitrator();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.StreamImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.AdaptorImpl <em>Adaptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.AdaptorImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getAdaptor()
		 * @generated
		 */
		EClass ADAPTOR = eINSTANCE.getAdaptor();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.DistributorImpl <em>Distributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.DistributorImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getDistributor()
		 * @generated
		 */
		EClass DISTRIBUTOR = eINSTANCE.getDistributor();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.EventImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.ProcedureCallImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getProcedureCall()
		 * @generated
		 */
		EClass PROCEDURE_CALL = eINSTANCE.getProcedureCall();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.FunctionalViewImpl <em>Functional View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.FunctionalViewImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getFunctionalView()
		 * @generated
		 */
		EClass FUNCTIONAL_VIEW = eINSTANCE.getFunctionalView();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_VIEW__COMPONENTS = eINSTANCE.getFunctionalView_Components();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_VIEW__CONNECTORS = eINSTANCE.getFunctionalView_Connectors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_VIEW__NAME = eINSTANCE.getFunctionalView_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_VIEW__DATE = eINSTANCE.getFunctionalView_Date();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.impl.ProjectImpl
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getProject()
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
		 * The meta object literal for the '<em><b>Functionalviews</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__FUNCTIONALVIEWS = eINSTANCE.getProject_Functionalviews();

		/**
		 * The meta object literal for the '<em><b>Modeling Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__MODELING_DATE = eINSTANCE.getProject_ModelingDate();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.RoleType <em>Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.RoleType
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getRoleType()
		 * @generated
		 */
		EEnum ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.PortType
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.DeliveryModel <em>Delivery Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.DeliveryModel
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getDeliveryModel()
		 * @generated
		 */
		EEnum DELIVERY_MODEL = eINSTANCE.getDeliveryModel();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.SyncType <em>Sync Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.SyncType
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getSyncType()
		 * @generated
		 */
		EEnum SYNC_TYPE = eINSTANCE.getSyncType();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.NotificationModel <em>Notification Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.NotificationModel
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getNotificationModel()
		 * @generated
		 */
		EEnum NOTIFICATION_MODEL = eINSTANCE.getNotificationModel();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.Buffering <em>Buffering</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.Buffering
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getBuffering()
		 * @generated
		 */
		EEnum BUFFERING = eINSTANCE.getBuffering();

		/**
		 * The meta object literal for the '{@link rebel_componentandconnector.Throughput <em>Throughput</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_componentandconnector.Throughput
		 * @see rebel_componentandconnector.impl.Rebel_componentandconnectorPackageImpl#getThroughput()
		 * @generated
		 */
		EEnum THROUGHPUT = eINSTANCE.getThroughput();

	}

} //Rebel_componentandconnectorPackage
