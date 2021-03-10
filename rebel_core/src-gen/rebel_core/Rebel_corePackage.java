/**
 */
package rebel_core;

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
 * @see rebel_core.Rebel_coreFactory
 * @model kind="package"
 * @generated
 */
public interface Rebel_corePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rebel_core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rebel_core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rebel_core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rebel_corePackage eINSTANCE = rebel_core.impl.Rebel_corePackageImpl.init();

	/**
	 * The meta object id for the '{@link rebel_core.impl.FactImpl <em>Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.FactImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getFact()
	 * @generated
	 */
	int FACT = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__DATE = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__OBSERVATIONS = 2;

	/**
	 * The feature id for the '<em><b>Functionalview</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__FUNCTIONALVIEW = 3;

	/**
	 * The feature id for the '<em><b>Architecturaldecision</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__ARCHITECTURALDECISION = 4;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__ELEMENT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__ELEMENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__ID = 7;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__VIEW = 9;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__FACT = 10;

	/**
	 * The feature id for the '<em><b>Atditem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT__ATDITEM = 11;

	/**
	 * The number of structural features of the '<em>Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ProjectImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Blockofinterest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BLOCKOFINTEREST = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Functionalviews</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FUNCTIONALVIEWS = 3;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DECISIONS = 4;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PERSON = 6;

	/**
	 * The feature id for the '<em><b>Modeling Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MODELING_DATE = 7;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VIEW = 8;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.impl.BlockOfInterestImpl <em>Block Of Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.BlockOfInterestImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getBlockOfInterest()
	 * @generated
	 */
	int BLOCK_OF_INTEREST = 2;

	/**
	 * The feature id for the '<em><b>Fact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_INTEREST__FACT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_INTEREST__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_INTEREST__NAME = 2;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_INTEREST__RESPONSIBLE = 3;

	/**
	 * The feature id for the '<em><b>Business driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_INTEREST__BUSINESS_DRIVER = 4;

	/**
	 * The feature id for the '<em><b>Business goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_INTEREST__BUSINESS_GOAL = 5;

	/**
	 * The number of structural features of the '<em>Block Of Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_INTEREST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Block Of Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_INTEREST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.impl.FunctionalViewImpl <em>Functional View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.FunctionalViewImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getFunctionalView()
	 * @generated
	 */
	int FUNCTIONAL_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__DATE = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__CONNECTORS = 3;

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
	 * The meta object id for the '{@link rebel_core.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ConnectorImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

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
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SYNC = 2;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NOTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BUFFERING = 4;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__THROUGHPUT = 5;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROTOCOL = 6;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROPS = 7;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ROLES = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ID = 9;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__POS_X = 10;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__POS_Y = 11;

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
	 * The meta object id for the '{@link rebel_core.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ComponentImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__POS_X = 2;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__POS_Y = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = 6;

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
	 * The meta object id for the '{@link rebel_core.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.PortImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 6;

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
	 * The meta object id for the '{@link rebel_core.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.RoleImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 7;

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
	 * The meta object id for the '{@link rebel_core.impl.AdaptorImpl <em>Adaptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.AdaptorImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getAdaptor()
	 * @generated
	 */
	int ADAPTOR = 8;

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
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__SYNC = CONNECTOR__SYNC;

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
	 * The meta object id for the '{@link rebel_core.impl.DistributorImpl <em>Distributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.DistributorImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getDistributor()
	 * @generated
	 */
	int DISTRIBUTOR = 9;

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
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__SYNC = CONNECTOR__SYNC;

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
	 * The meta object id for the '{@link rebel_core.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.StreamImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 10;

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
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__SYNC = CONNECTOR__SYNC;

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
	 * The meta object id for the '{@link rebel_core.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ProcedureCallImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getProcedureCall()
	 * @generated
	 */
	int PROCEDURE_CALL = 11;

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
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__SYNC = CONNECTOR__SYNC;

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
	 * The meta object id for the '{@link rebel_core.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ArbitratorImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getArbitrator()
	 * @generated
	 */
	int ARBITRATOR = 12;

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
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__SYNC = CONNECTOR__SYNC;

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
	 * The meta object id for the '{@link rebel_core.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.EventImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 13;

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
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SYNC = CONNECTOR__SYNC;

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
	 * The meta object id for the '{@link rebel_core.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.DecisionImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 14;

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
	 * The feature id for the '<em><b>Supercedes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__SUPERCEDES = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DATE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__PHASE = 6;

	/**
	 * The feature id for the '<em><b>Userstories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__USERSTORIES = 7;

	/**
	 * The feature id for the '<em><b>Consequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__CONSEQUENCES = 8;

	/**
	 * The feature id for the '<em><b>Motivators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__MOTIVATORS = 9;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ASSUMPTIONS = 10;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ALTERNATIVES = 11;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.AssumptionImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 15;

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
	 * The meta object id for the '{@link rebel_core.impl.UserStoryImpl <em>User Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.UserStoryImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getUserStory()
	 * @generated
	 */
	int USER_STORY = 16;

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
	 * The meta object id for the '{@link rebel_core.impl.ConsequenceImpl <em>Consequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ConsequenceImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getConsequence()
	 * @generated
	 */
	int CONSEQUENCE = 17;

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
	 * The meta object id for the '{@link rebel_core.impl.MotivatorImpl <em>Motivator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.MotivatorImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getMotivator()
	 * @generated
	 */
	int MOTIVATOR = 18;

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
	 * The meta object id for the '{@link rebel_core.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.AlternativeImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 19;

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
	 * The meta object id for the '{@link rebel_core.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.MessageImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 20;

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
	 * The meta object id for the '{@link rebel_core.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.PersonImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 21;

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
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MESSAGE = 2;

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
	 * The meta object id for the '{@link rebel_core.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.RelationImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ElementImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__POS_X = 2;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__POS_Y = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Grouper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GROUPER = 7;

	/**
	 * The feature id for the '<em><b>Boi Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BOI_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SYNC = 9;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DELIVERY = 10;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NOTIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BUFFERING = 12;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__THROUGHPUT = 13;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.impl.ArchimateViewImpl <em>Archimate View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ArchimateViewImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getArchimateView()
	 * @generated
	 */
	int ARCHIMATE_VIEW = 24;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_VIEW__RELATION = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_VIEW__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_VIEW__NAME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_VIEW__ID = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_VIEW__DATE = 4;

	/**
	 * The number of structural features of the '<em>Archimate View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_VIEW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Archimate View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.impl.ATDItemImpl <em>ATD Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ATDItemImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getATDItem()
	 * @generated
	 */
	int ATD_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Compromised QA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM__COMPROMISED_QA = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM__DATE = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Incurred By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM__INCURRED_BY = 3;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM__RATIONALES = 4;

	/**
	 * The feature id for the '<em><b>Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM__BENEFITS = 5;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM__EFFECTS = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Identify By Architect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM__IDENTIFY_BY_ARCHITECT = 8;

	/**
	 * The number of structural features of the '<em>ATD Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>ATD Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.impl.ATDRationaleImpl <em>ATD Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ATDRationaleImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getATDRationale()
	 * @generated
	 */
	int ATD_RATIONALE = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_RATIONALE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>ATD Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_RATIONALE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ATD Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_RATIONALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.impl.ATDBenefitImpl <em>ATD Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ATDBenefitImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getATDBenefit()
	 * @generated
	 */
	int ATD_BENEFIT = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_BENEFIT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>ATD Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_BENEFIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ATD Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_BENEFIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.impl.ATDEffectImpl <em>ATD Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.impl.ATDEffectImpl
	 * @see rebel_core.impl.Rebel_corePackageImpl#getATDEffect()
	 * @generated
	 */
	int ATD_EFFECT = 28;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_EFFECT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>ATD Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_EFFECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ATD Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATD_EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_core.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.Action
	 * @see rebel_core.impl.Rebel_corePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 29;

	/**
	 * The meta object id for the '{@link rebel_core.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.PortType
	 * @see rebel_core.impl.Rebel_corePackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 30;

	/**
	 * The meta object id for the '{@link rebel_core.RoleType <em>Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.RoleType
	 * @see rebel_core.impl.Rebel_corePackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 31;

	/**
	 * The meta object id for the '{@link rebel_core.Throughput <em>Throughput</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.Throughput
	 * @see rebel_core.impl.Rebel_corePackageImpl#getThroughput()
	 * @generated
	 */
	int THROUGHPUT = 32;

	/**
	 * The meta object id for the '{@link rebel_core.NotificationModel <em>Notification Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.NotificationModel
	 * @see rebel_core.impl.Rebel_corePackageImpl#getNotificationModel()
	 * @generated
	 */
	int NOTIFICATION_MODEL = 33;

	/**
	 * The meta object id for the '{@link rebel_core.Buffering <em>Buffering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.Buffering
	 * @see rebel_core.impl.Rebel_corePackageImpl#getBuffering()
	 * @generated
	 */
	int BUFFERING = 34;

	/**
	 * The meta object id for the '{@link rebel_core.DeliveryModel <em>Delivery Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.DeliveryModel
	 * @see rebel_core.impl.Rebel_corePackageImpl#getDeliveryModel()
	 * @generated
	 */
	int DELIVERY_MODEL = 35;

	/**
	 * The meta object id for the '{@link rebel_core.SyncType <em>Sync Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.SyncType
	 * @see rebel_core.impl.Rebel_corePackageImpl#getSyncType()
	 * @generated
	 */
	int SYNC_TYPE = 36;

	/**
	 * The meta object id for the '{@link rebel_core.StateType <em>State Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.StateType
	 * @see rebel_core.impl.Rebel_corePackageImpl#getStateType()
	 * @generated
	 */
	int STATE_TYPE = 37;

	/**
	 * The meta object id for the '{@link rebel_core.ModelElementType <em>Model Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.ModelElementType
	 * @see rebel_core.impl.Rebel_corePackageImpl#getModelElementType()
	 * @generated
	 */
	int MODEL_ELEMENT_TYPE = 38;

	/**
	 * The meta object id for the '{@link rebel_core.ConsequenceType <em>Consequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.ConsequenceType
	 * @see rebel_core.impl.Rebel_corePackageImpl#getConsequenceType()
	 * @generated
	 */
	int CONSEQUENCE_TYPE = 39;

	/**
	 * The meta object id for the '{@link rebel_core.ACTIONTYPE <em>ACTIONTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.ACTIONTYPE
	 * @see rebel_core.impl.Rebel_corePackageImpl#getACTIONTYPE()
	 * @generated
	 */
	int ACTIONTYPE = 40;

	/**
	 * The meta object id for the '{@link rebel_core.OPERATIONTYPE <em>OPERATIONTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.OPERATIONTYPE
	 * @see rebel_core.impl.Rebel_corePackageImpl#getOPERATIONTYPE()
	 * @generated
	 */
	int OPERATIONTYPE = 41;

	/**
	 * The meta object id for the '{@link rebel_core.RELATIONTYPE <em>RELATIONTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.RELATIONTYPE
	 * @see rebel_core.impl.Rebel_corePackageImpl#getRELATIONTYPE()
	 * @generated
	 */
	int RELATIONTYPE = 42;

	/**
	 * The meta object id for the '{@link rebel_core.ELEMENTTYPE <em>ELEMENTTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_core.ELEMENTTYPE
	 * @see rebel_core.impl.Rebel_corePackageImpl#getELEMENTTYPE()
	 * @generated
	 */
	int ELEMENTTYPE = 43;

	/**
	 * Returns the meta object for class '{@link rebel_core.Fact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact</em>'.
	 * @see rebel_core.Fact
	 * @generated
	 */
	EClass getFact();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Fact#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see rebel_core.Fact#getDate()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_Date();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Fact#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see rebel_core.Fact#getAction()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_Action();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Fact#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observations</em>'.
	 * @see rebel_core.Fact#getObservations()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_Observations();

	/**
	 * Returns the meta object for the reference list '{@link rebel_core.Fact#getFunctionalview <em>Functionalview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functionalview</em>'.
	 * @see rebel_core.Fact#getFunctionalview()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_Functionalview();

	/**
	 * Returns the meta object for the reference list '{@link rebel_core.Fact#getArchitecturaldecision <em>Architecturaldecision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Architecturaldecision</em>'.
	 * @see rebel_core.Fact#getArchitecturaldecision()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_Architecturaldecision();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Fact#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see rebel_core.Fact#getElementName()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_ElementName();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Fact#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see rebel_core.Fact#getElementType()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_ElementType();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Fact#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.Fact#getId()
	 * @see #getFact()
	 * @generated
	 */
	EAttribute getFact_Id();

	/**
	 * Returns the meta object for the reference list '{@link rebel_core.Fact#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see rebel_core.Fact#getMessage()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_Message();

	/**
	 * Returns the meta object for the reference list '{@link rebel_core.Fact#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>View</em>'.
	 * @see rebel_core.Fact#getView()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_View();

	/**
	 * Returns the meta object for the reference '{@link rebel_core.Fact#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fact</em>'.
	 * @see rebel_core.Fact#getFact()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_Fact();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Fact#getAtditem <em>Atditem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atditem</em>'.
	 * @see rebel_core.Fact#getAtditem()
	 * @see #getFact()
	 * @generated
	 */
	EReference getFact_Atditem();

	/**
	 * Returns the meta object for class '{@link rebel_core.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see rebel_core.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Project#getBlockofinterest <em>Blockofinterest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockofinterest</em>'.
	 * @see rebel_core.Project#getBlockofinterest()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Blockofinterest();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Project#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.Project#getId()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_core.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Project#getFunctionalviews <em>Functionalviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionalviews</em>'.
	 * @see rebel_core.Project#getFunctionalviews()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Functionalviews();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Project#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisions</em>'.
	 * @see rebel_core.Project#getDecisions()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Decisions();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Project#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see rebel_core.Project#getMessage()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Project#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see rebel_core.Project#getPerson()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Person();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Project#getModelingDate <em>Modeling Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modeling Date</em>'.
	 * @see rebel_core.Project#getModelingDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ModelingDate();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Project#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see rebel_core.Project#getView()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_View();

	/**
	 * Returns the meta object for class '{@link rebel_core.BlockOfInterest <em>Block Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Of Interest</em>'.
	 * @see rebel_core.BlockOfInterest
	 * @generated
	 */
	EClass getBlockOfInterest();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.BlockOfInterest#getFact <em>Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fact</em>'.
	 * @see rebel_core.BlockOfInterest#getFact()
	 * @see #getBlockOfInterest()
	 * @generated
	 */
	EReference getBlockOfInterest_Fact();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.BlockOfInterest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.BlockOfInterest#getId()
	 * @see #getBlockOfInterest()
	 * @generated
	 */
	EAttribute getBlockOfInterest_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.BlockOfInterest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_core.BlockOfInterest#getName()
	 * @see #getBlockOfInterest()
	 * @generated
	 */
	EAttribute getBlockOfInterest_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.BlockOfInterest#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsible</em>'.
	 * @see rebel_core.BlockOfInterest#getResponsible()
	 * @see #getBlockOfInterest()
	 * @generated
	 */
	EAttribute getBlockOfInterest_Responsible();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.BlockOfInterest#getBusiness_driver <em>Business driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business driver</em>'.
	 * @see rebel_core.BlockOfInterest#getBusiness_driver()
	 * @see #getBlockOfInterest()
	 * @generated
	 */
	EAttribute getBlockOfInterest_Business_driver();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.BlockOfInterest#getBusiness_goal <em>Business goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business goal</em>'.
	 * @see rebel_core.BlockOfInterest#getBusiness_goal()
	 * @see #getBlockOfInterest()
	 * @generated
	 */
	EAttribute getBlockOfInterest_Business_goal();

	/**
	 * Returns the meta object for class '{@link rebel_core.FunctionalView <em>Functional View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional View</em>'.
	 * @see rebel_core.FunctionalView
	 * @generated
	 */
	EClass getFunctionalView();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.FunctionalView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_core.FunctionalView#getName()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EAttribute getFunctionalView_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.FunctionalView#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see rebel_core.FunctionalView#getDate()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EAttribute getFunctionalView_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.FunctionalView#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see rebel_core.FunctionalView#getComponents()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EReference getFunctionalView_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.FunctionalView#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see rebel_core.FunctionalView#getConnectors()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EReference getFunctionalView_Connectors();

	/**
	 * Returns the meta object for class '{@link rebel_core.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see rebel_core.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_core.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery</em>'.
	 * @see rebel_core.Connector#getDelivery()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Delivery();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getSync <em>Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync</em>'.
	 * @see rebel_core.Connector#getSync()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Sync();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification</em>'.
	 * @see rebel_core.Connector#getNotification()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Notification();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getBuffering <em>Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffering</em>'.
	 * @see rebel_core.Connector#getBuffering()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Buffering();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see rebel_core.Connector#getThroughput()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see rebel_core.Connector#getProtocol()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props</em>'.
	 * @see rebel_core.Connector#getProps()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Props();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Connector#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see rebel_core.Connector#getRoles()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Roles();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.Connector#getId()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see rebel_core.Connector#getPosX()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PosX();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Connector#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see rebel_core.Connector#getPosY()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_PosY();

	/**
	 * Returns the meta object for class '{@link rebel_core.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see rebel_core.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_core.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Component#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see rebel_core.Component#getPosX()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_PosX();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Component#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see rebel_core.Component#getPosY()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_PosY();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Component#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see rebel_core.Component#getWidth()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Width();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Component#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see rebel_core.Component#getHeight()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see rebel_core.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for class '{@link rebel_core.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see rebel_core.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_core.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_core.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Port#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.Port#getId()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Id();

	/**
	 * Returns the meta object for class '{@link rebel_core.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see rebel_core.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Role#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_core.Role#getType()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Type();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_core.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference '{@link rebel_core.Role#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see rebel_core.Role#getPort()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Port();

	/**
	 * Returns the meta object for class '{@link rebel_core.Adaptor <em>Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptor</em>'.
	 * @see rebel_core.Adaptor
	 * @generated
	 */
	EClass getAdaptor();

	/**
	 * Returns the meta object for class '{@link rebel_core.Distributor <em>Distributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributor</em>'.
	 * @see rebel_core.Distributor
	 * @generated
	 */
	EClass getDistributor();

	/**
	 * Returns the meta object for class '{@link rebel_core.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see rebel_core.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for class '{@link rebel_core.ProcedureCall <em>Procedure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Call</em>'.
	 * @see rebel_core.ProcedureCall
	 * @generated
	 */
	EClass getProcedureCall();

	/**
	 * Returns the meta object for class '{@link rebel_core.Arbitrator <em>Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrator</em>'.
	 * @see rebel_core.Arbitrator
	 * @generated
	 */
	EClass getArbitrator();

	/**
	 * Returns the meta object for class '{@link rebel_core.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see rebel_core.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link rebel_core.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see rebel_core.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Decision#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see rebel_core.Decision#getNumber()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Number();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Decision#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see rebel_core.Decision#getTitle()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Title();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Decision#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see rebel_core.Decision#getState()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_State();

	/**
	 * Returns the meta object for the reference '{@link rebel_core.Decision#getSupercedes <em>Supercedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supercedes</em>'.
	 * @see rebel_core.Decision#getSupercedes()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Supercedes();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Decision#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see rebel_core.Decision#getDate()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Date();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Decision#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_core.Decision#getDescription()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Description();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Decision#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see rebel_core.Decision#getPhase()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Phase();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Decision#getUserstories <em>Userstories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Userstories</em>'.
	 * @see rebel_core.Decision#getUserstories()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Userstories();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Decision#getConsequences <em>Consequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consequences</em>'.
	 * @see rebel_core.Decision#getConsequences()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Consequences();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Decision#getMotivators <em>Motivators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motivators</em>'.
	 * @see rebel_core.Decision#getMotivators()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Motivators();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Decision#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assumptions</em>'.
	 * @see rebel_core.Decision#getAssumptions()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Assumptions();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.Decision#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see rebel_core.Decision#getAlternatives()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Alternatives();

	/**
	 * Returns the meta object for class '{@link rebel_core.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see rebel_core.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Assumption#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_core.Assumption#getDescription()
	 * @see #getAssumption()
	 * @generated
	 */
	EAttribute getAssumption_Description();

	/**
	 * Returns the meta object for class '{@link rebel_core.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Story</em>'.
	 * @see rebel_core.UserStory
	 * @generated
	 */
	EClass getUserStory();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.UserStory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.UserStory#getId()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Id();

	/**
	 * Returns the meta object for class '{@link rebel_core.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consequence</em>'.
	 * @see rebel_core.Consequence
	 * @generated
	 */
	EClass getConsequence();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Consequence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_core.Consequence#getDescription()
	 * @see #getConsequence()
	 * @generated
	 */
	EAttribute getConsequence_Description();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Consequence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_core.Consequence#getType()
	 * @see #getConsequence()
	 * @generated
	 */
	EAttribute getConsequence_Type();

	/**
	 * Returns the meta object for class '{@link rebel_core.Motivator <em>Motivator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motivator</em>'.
	 * @see rebel_core.Motivator
	 * @generated
	 */
	EClass getMotivator();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Motivator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_core.Motivator#getDescription()
	 * @see #getMotivator()
	 * @generated
	 */
	EAttribute getMotivator_Description();

	/**
	 * Returns the meta object for class '{@link rebel_core.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see rebel_core.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Alternative#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_core.Alternative#getDescription()
	 * @see #getAlternative()
	 * @generated
	 */
	EAttribute getAlternative_Description();

	/**
	 * Returns the meta object for class '{@link rebel_core.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see rebel_core.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Message#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see rebel_core.Message#getSubject()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Subject();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Message#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see rebel_core.Message#getFooter()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Footer();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Message#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see rebel_core.Message#getScope()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Scope();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Message#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see rebel_core.Message#getBody()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Body();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_core.Message#getType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Type();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Message#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see rebel_core.Message#getAction()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Action();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Message#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.Message#getId()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Message#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see rebel_core.Message#getDate()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Date();

	/**
	 * Returns the meta object for the reference '{@link rebel_core.Message#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see rebel_core.Message#getPerson()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Person();

	/**
	 * Returns the meta object for class '{@link rebel_core.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see rebel_core.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_core.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see rebel_core.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the reference list '{@link rebel_core.Person#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see rebel_core.Person#getMessage()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Message();

	/**
	 * Returns the meta object for class '{@link rebel_core.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see rebel_core.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link rebel_core.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rebel_core.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link rebel_core.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rebel_core.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Relation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.Relation#getId()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_core.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Type();

	/**
	 * Returns the meta object for class '{@link rebel_core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see rebel_core.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_core.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see rebel_core.Element#getPosX()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_PosX();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see rebel_core.Element#getPosY()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_PosY();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see rebel_core.Element#getWidth()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see rebel_core.Element#getHeight()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Height();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_core.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#isGrouper <em>Grouper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouper</em>'.
	 * @see rebel_core.Element#isGrouper()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Grouper();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#isBoiElement <em>Boi Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boi Element</em>'.
	 * @see rebel_core.Element#isBoiElement()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_BoiElement();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getSync <em>Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync</em>'.
	 * @see rebel_core.Element#getSync()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Sync();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery</em>'.
	 * @see rebel_core.Element#getDelivery()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Delivery();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification</em>'.
	 * @see rebel_core.Element#getNotification()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Notification();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getBuffering <em>Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffering</em>'.
	 * @see rebel_core.Element#getBuffering()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Buffering();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.Element#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see rebel_core.Element#getThroughput()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Throughput();

	/**
	 * Returns the meta object for class '{@link rebel_core.ArchimateView <em>Archimate View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archimate View</em>'.
	 * @see rebel_core.ArchimateView
	 * @generated
	 */
	EClass getArchimateView();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.ArchimateView#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see rebel_core.ArchimateView#getRelation()
	 * @see #getArchimateView()
	 * @generated
	 */
	EReference getArchimateView_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.ArchimateView#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see rebel_core.ArchimateView#getElement()
	 * @see #getArchimateView()
	 * @generated
	 */
	EReference getArchimateView_Element();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ArchimateView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_core.ArchimateView#getName()
	 * @see #getArchimateView()
	 * @generated
	 */
	EAttribute getArchimateView_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ArchimateView#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_core.ArchimateView#getId()
	 * @see #getArchimateView()
	 * @generated
	 */
	EAttribute getArchimateView_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ArchimateView#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see rebel_core.ArchimateView#getDate()
	 * @see #getArchimateView()
	 * @generated
	 */
	EAttribute getArchimateView_Date();

	/**
	 * Returns the meta object for class '{@link rebel_core.ATDItem <em>ATD Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATD Item</em>'.
	 * @see rebel_core.ATDItem
	 * @generated
	 */
	EClass getATDItem();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ATDItem#getCompromisedQA <em>Compromised QA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compromised QA</em>'.
	 * @see rebel_core.ATDItem#getCompromisedQA()
	 * @see #getATDItem()
	 * @generated
	 */
	EAttribute getATDItem_CompromisedQA();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ATDItem#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see rebel_core.ATDItem#getDate()
	 * @see #getATDItem()
	 * @generated
	 */
	EAttribute getATDItem_Date();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ATDItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see rebel_core.ATDItem#getStatus()
	 * @see #getATDItem()
	 * @generated
	 */
	EAttribute getATDItem_Status();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ATDItem#getIncurredBy <em>Incurred By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incurred By</em>'.
	 * @see rebel_core.ATDItem#getIncurredBy()
	 * @see #getATDItem()
	 * @generated
	 */
	EAttribute getATDItem_IncurredBy();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.ATDItem#getRationales <em>Rationales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rationales</em>'.
	 * @see rebel_core.ATDItem#getRationales()
	 * @see #getATDItem()
	 * @generated
	 */
	EReference getATDItem_Rationales();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.ATDItem#getBenefits <em>Benefits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Benefits</em>'.
	 * @see rebel_core.ATDItem#getBenefits()
	 * @see #getATDItem()
	 * @generated
	 */
	EReference getATDItem_Benefits();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_core.ATDItem#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see rebel_core.ATDItem#getEffects()
	 * @see #getATDItem()
	 * @generated
	 */
	EReference getATDItem_Effects();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ATDItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_core.ATDItem#getType()
	 * @see #getATDItem()
	 * @generated
	 */
	EAttribute getATDItem_Type();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ATDItem#isIdentifyByArchitect <em>Identify By Architect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identify By Architect</em>'.
	 * @see rebel_core.ATDItem#isIdentifyByArchitect()
	 * @see #getATDItem()
	 * @generated
	 */
	EAttribute getATDItem_IdentifyByArchitect();

	/**
	 * Returns the meta object for class '{@link rebel_core.ATDRationale <em>ATD Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATD Rationale</em>'.
	 * @see rebel_core.ATDRationale
	 * @generated
	 */
	EClass getATDRationale();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ATDRationale#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_core.ATDRationale#getDescription()
	 * @see #getATDRationale()
	 * @generated
	 */
	EAttribute getATDRationale_Description();

	/**
	 * Returns the meta object for class '{@link rebel_core.ATDBenefit <em>ATD Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATD Benefit</em>'.
	 * @see rebel_core.ATDBenefit
	 * @generated
	 */
	EClass getATDBenefit();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ATDBenefit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_core.ATDBenefit#getDescription()
	 * @see #getATDBenefit()
	 * @generated
	 */
	EAttribute getATDBenefit_Description();

	/**
	 * Returns the meta object for class '{@link rebel_core.ATDEffect <em>ATD Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATD Effect</em>'.
	 * @see rebel_core.ATDEffect
	 * @generated
	 */
	EClass getATDEffect();

	/**
	 * Returns the meta object for the attribute '{@link rebel_core.ATDEffect#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rebel_core.ATDEffect#getDescription()
	 * @see #getATDEffect()
	 * @generated
	 */
	EAttribute getATDEffect_Description();

	/**
	 * Returns the meta object for enum '{@link rebel_core.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see rebel_core.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the meta object for enum '{@link rebel_core.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see rebel_core.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the meta object for enum '{@link rebel_core.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Type</em>'.
	 * @see rebel_core.RoleType
	 * @generated
	 */
	EEnum getRoleType();

	/**
	 * Returns the meta object for enum '{@link rebel_core.Throughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throughput</em>'.
	 * @see rebel_core.Throughput
	 * @generated
	 */
	EEnum getThroughput();

	/**
	 * Returns the meta object for enum '{@link rebel_core.NotificationModel <em>Notification Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Model</em>'.
	 * @see rebel_core.NotificationModel
	 * @generated
	 */
	EEnum getNotificationModel();

	/**
	 * Returns the meta object for enum '{@link rebel_core.Buffering <em>Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Buffering</em>'.
	 * @see rebel_core.Buffering
	 * @generated
	 */
	EEnum getBuffering();

	/**
	 * Returns the meta object for enum '{@link rebel_core.DeliveryModel <em>Delivery Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Delivery Model</em>'.
	 * @see rebel_core.DeliveryModel
	 * @generated
	 */
	EEnum getDeliveryModel();

	/**
	 * Returns the meta object for enum '{@link rebel_core.SyncType <em>Sync Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sync Type</em>'.
	 * @see rebel_core.SyncType
	 * @generated
	 */
	EEnum getSyncType();

	/**
	 * Returns the meta object for enum '{@link rebel_core.StateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Type</em>'.
	 * @see rebel_core.StateType
	 * @generated
	 */
	EEnum getStateType();

	/**
	 * Returns the meta object for enum '{@link rebel_core.ModelElementType <em>Model Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Element Type</em>'.
	 * @see rebel_core.ModelElementType
	 * @generated
	 */
	EEnum getModelElementType();

	/**
	 * Returns the meta object for enum '{@link rebel_core.ConsequenceType <em>Consequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consequence Type</em>'.
	 * @see rebel_core.ConsequenceType
	 * @generated
	 */
	EEnum getConsequenceType();

	/**
	 * Returns the meta object for enum '{@link rebel_core.ACTIONTYPE <em>ACTIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ACTIONTYPE</em>'.
	 * @see rebel_core.ACTIONTYPE
	 * @generated
	 */
	EEnum getACTIONTYPE();

	/**
	 * Returns the meta object for enum '{@link rebel_core.OPERATIONTYPE <em>OPERATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OPERATIONTYPE</em>'.
	 * @see rebel_core.OPERATIONTYPE
	 * @generated
	 */
	EEnum getOPERATIONTYPE();

	/**
	 * Returns the meta object for enum '{@link rebel_core.RELATIONTYPE <em>RELATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RELATIONTYPE</em>'.
	 * @see rebel_core.RELATIONTYPE
	 * @generated
	 */
	EEnum getRELATIONTYPE();

	/**
	 * Returns the meta object for enum '{@link rebel_core.ELEMENTTYPE <em>ELEMENTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ELEMENTTYPE</em>'.
	 * @see rebel_core.ELEMENTTYPE
	 * @generated
	 */
	EEnum getELEMENTTYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Rebel_coreFactory getRebel_coreFactory();

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
		 * The meta object literal for the '{@link rebel_core.impl.FactImpl <em>Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.FactImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getFact()
		 * @generated
		 */
		EClass FACT = eINSTANCE.getFact();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__DATE = eINSTANCE.getFact_Date();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__ACTION = eINSTANCE.getFact_Action();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__OBSERVATIONS = eINSTANCE.getFact_Observations();

		/**
		 * The meta object literal for the '<em><b>Functionalview</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT__FUNCTIONALVIEW = eINSTANCE.getFact_Functionalview();

		/**
		 * The meta object literal for the '<em><b>Architecturaldecision</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT__ARCHITECTURALDECISION = eINSTANCE.getFact_Architecturaldecision();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__ELEMENT_NAME = eINSTANCE.getFact_ElementName();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__ELEMENT_TYPE = eINSTANCE.getFact_ElementType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT__ID = eINSTANCE.getFact_Id();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT__MESSAGE = eINSTANCE.getFact_Message();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT__VIEW = eINSTANCE.getFact_View();

		/**
		 * The meta object literal for the '<em><b>Fact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT__FACT = eINSTANCE.getFact_Fact();

		/**
		 * The meta object literal for the '<em><b>Atditem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT__ATDITEM = eINSTANCE.getFact_Atditem();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ProjectImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Blockofinterest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__BLOCKOFINTEREST = eINSTANCE.getProject_Blockofinterest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ID = eINSTANCE.getProject_Id();

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
		 * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DECISIONS = eINSTANCE.getProject_Decisions();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MESSAGE = eINSTANCE.getProject_Message();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PERSON = eINSTANCE.getProject_Person();

		/**
		 * The meta object literal for the '<em><b>Modeling Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__MODELING_DATE = eINSTANCE.getProject_ModelingDate();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__VIEW = eINSTANCE.getProject_View();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.BlockOfInterestImpl <em>Block Of Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.BlockOfInterestImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getBlockOfInterest()
		 * @generated
		 */
		EClass BLOCK_OF_INTEREST = eINSTANCE.getBlockOfInterest();

		/**
		 * The meta object literal for the '<em><b>Fact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_OF_INTEREST__FACT = eINSTANCE.getBlockOfInterest_Fact();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_OF_INTEREST__ID = eINSTANCE.getBlockOfInterest_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_OF_INTEREST__NAME = eINSTANCE.getBlockOfInterest_Name();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_OF_INTEREST__RESPONSIBLE = eINSTANCE.getBlockOfInterest_Responsible();

		/**
		 * The meta object literal for the '<em><b>Business driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_OF_INTEREST__BUSINESS_DRIVER = eINSTANCE.getBlockOfInterest_Business_driver();

		/**
		 * The meta object literal for the '<em><b>Business goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_OF_INTEREST__BUSINESS_GOAL = eINSTANCE.getBlockOfInterest_Business_goal();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.FunctionalViewImpl <em>Functional View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.FunctionalViewImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getFunctionalView()
		 * @generated
		 */
		EClass FUNCTIONAL_VIEW = eINSTANCE.getFunctionalView();

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
		 * The meta object literal for the '{@link rebel_core.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ConnectorImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getConnector()
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
		 * The meta object literal for the '{@link rebel_core.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ComponentImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getComponent()
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
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.PortImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getPort()
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
		 * The meta object literal for the '{@link rebel_core.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.RoleImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getRole()
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
		 * The meta object literal for the '{@link rebel_core.impl.AdaptorImpl <em>Adaptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.AdaptorImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getAdaptor()
		 * @generated
		 */
		EClass ADAPTOR = eINSTANCE.getAdaptor();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.DistributorImpl <em>Distributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.DistributorImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getDistributor()
		 * @generated
		 */
		EClass DISTRIBUTOR = eINSTANCE.getDistributor();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.StreamImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ProcedureCallImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getProcedureCall()
		 * @generated
		 */
		EClass PROCEDURE_CALL = eINSTANCE.getProcedureCall();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ArbitratorImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getArbitrator()
		 * @generated
		 */
		EClass ARBITRATOR = eINSTANCE.getArbitrator();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.EventImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.DecisionImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getDecision()
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
		 * The meta object literal for the '<em><b>Userstories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__USERSTORIES = eINSTANCE.getDecision_Userstories();

		/**
		 * The meta object literal for the '<em><b>Consequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__CONSEQUENCES = eINSTANCE.getDecision_Consequences();

		/**
		 * The meta object literal for the '<em><b>Motivators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__MOTIVATORS = eINSTANCE.getDecision_Motivators();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__ASSUMPTIONS = eINSTANCE.getDecision_Assumptions();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__ALTERNATIVES = eINSTANCE.getDecision_Alternatives();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.AssumptionImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getAssumption()
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
		 * The meta object literal for the '{@link rebel_core.impl.UserStoryImpl <em>User Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.UserStoryImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getUserStory()
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
		 * The meta object literal for the '{@link rebel_core.impl.ConsequenceImpl <em>Consequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ConsequenceImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getConsequence()
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
		 * The meta object literal for the '{@link rebel_core.impl.MotivatorImpl <em>Motivator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.MotivatorImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getMotivator()
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
		 * The meta object literal for the '{@link rebel_core.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.AlternativeImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getAlternative()
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
		 * The meta object literal for the '{@link rebel_core.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.MessageImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getMessage()
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
		 * The meta object literal for the '{@link rebel_core.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.PersonImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getPerson()
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
		 * The meta object literal for the '<em><b>Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MESSAGE = eINSTANCE.getPerson_Message();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.RelationImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__ID = eINSTANCE.getRelation_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ElementImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__POS_X = eINSTANCE.getElement_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__POS_Y = eINSTANCE.getElement_PosY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__WIDTH = eINSTANCE.getElement_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__HEIGHT = eINSTANCE.getElement_Height();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '<em><b>Grouper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__GROUPER = eINSTANCE.getElement_Grouper();

		/**
		 * The meta object literal for the '<em><b>Boi Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__BOI_ELEMENT = eINSTANCE.getElement_BoiElement();

		/**
		 * The meta object literal for the '<em><b>Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__SYNC = eINSTANCE.getElement_Sync();

		/**
		 * The meta object literal for the '<em><b>Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DELIVERY = eINSTANCE.getElement_Delivery();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NOTIFICATION = eINSTANCE.getElement_Notification();

		/**
		 * The meta object literal for the '<em><b>Buffering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__BUFFERING = eINSTANCE.getElement_Buffering();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__THROUGHPUT = eINSTANCE.getElement_Throughput();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.ArchimateViewImpl <em>Archimate View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ArchimateViewImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getArchimateView()
		 * @generated
		 */
		EClass ARCHIMATE_VIEW = eINSTANCE.getArchimateView();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIMATE_VIEW__RELATION = eINSTANCE.getArchimateView_Relation();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIMATE_VIEW__ELEMENT = eINSTANCE.getArchimateView_Element();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_VIEW__NAME = eINSTANCE.getArchimateView_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_VIEW__ID = eINSTANCE.getArchimateView_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_VIEW__DATE = eINSTANCE.getArchimateView_Date();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.ATDItemImpl <em>ATD Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ATDItemImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getATDItem()
		 * @generated
		 */
		EClass ATD_ITEM = eINSTANCE.getATDItem();

		/**
		 * The meta object literal for the '<em><b>Compromised QA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATD_ITEM__COMPROMISED_QA = eINSTANCE.getATDItem_CompromisedQA();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATD_ITEM__DATE = eINSTANCE.getATDItem_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATD_ITEM__STATUS = eINSTANCE.getATDItem_Status();

		/**
		 * The meta object literal for the '<em><b>Incurred By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATD_ITEM__INCURRED_BY = eINSTANCE.getATDItem_IncurredBy();

		/**
		 * The meta object literal for the '<em><b>Rationales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATD_ITEM__RATIONALES = eINSTANCE.getATDItem_Rationales();

		/**
		 * The meta object literal for the '<em><b>Benefits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATD_ITEM__BENEFITS = eINSTANCE.getATDItem_Benefits();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATD_ITEM__EFFECTS = eINSTANCE.getATDItem_Effects();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATD_ITEM__TYPE = eINSTANCE.getATDItem_Type();

		/**
		 * The meta object literal for the '<em><b>Identify By Architect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATD_ITEM__IDENTIFY_BY_ARCHITECT = eINSTANCE.getATDItem_IdentifyByArchitect();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.ATDRationaleImpl <em>ATD Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ATDRationaleImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getATDRationale()
		 * @generated
		 */
		EClass ATD_RATIONALE = eINSTANCE.getATDRationale();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATD_RATIONALE__DESCRIPTION = eINSTANCE.getATDRationale_Description();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.ATDBenefitImpl <em>ATD Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ATDBenefitImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getATDBenefit()
		 * @generated
		 */
		EClass ATD_BENEFIT = eINSTANCE.getATDBenefit();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATD_BENEFIT__DESCRIPTION = eINSTANCE.getATDBenefit_Description();

		/**
		 * The meta object literal for the '{@link rebel_core.impl.ATDEffectImpl <em>ATD Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.impl.ATDEffectImpl
		 * @see rebel_core.impl.Rebel_corePackageImpl#getATDEffect()
		 * @generated
		 */
		EClass ATD_EFFECT = eINSTANCE.getATDEffect();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATD_EFFECT__DESCRIPTION = eINSTANCE.getATDEffect_Description();

		/**
		 * The meta object literal for the '{@link rebel_core.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.Action
		 * @see rebel_core.impl.Rebel_corePackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link rebel_core.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.PortType
		 * @see rebel_core.impl.Rebel_corePackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '{@link rebel_core.RoleType <em>Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.RoleType
		 * @see rebel_core.impl.Rebel_corePackageImpl#getRoleType()
		 * @generated
		 */
		EEnum ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '{@link rebel_core.Throughput <em>Throughput</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.Throughput
		 * @see rebel_core.impl.Rebel_corePackageImpl#getThroughput()
		 * @generated
		 */
		EEnum THROUGHPUT = eINSTANCE.getThroughput();

		/**
		 * The meta object literal for the '{@link rebel_core.NotificationModel <em>Notification Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.NotificationModel
		 * @see rebel_core.impl.Rebel_corePackageImpl#getNotificationModel()
		 * @generated
		 */
		EEnum NOTIFICATION_MODEL = eINSTANCE.getNotificationModel();

		/**
		 * The meta object literal for the '{@link rebel_core.Buffering <em>Buffering</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.Buffering
		 * @see rebel_core.impl.Rebel_corePackageImpl#getBuffering()
		 * @generated
		 */
		EEnum BUFFERING = eINSTANCE.getBuffering();

		/**
		 * The meta object literal for the '{@link rebel_core.DeliveryModel <em>Delivery Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.DeliveryModel
		 * @see rebel_core.impl.Rebel_corePackageImpl#getDeliveryModel()
		 * @generated
		 */
		EEnum DELIVERY_MODEL = eINSTANCE.getDeliveryModel();

		/**
		 * The meta object literal for the '{@link rebel_core.SyncType <em>Sync Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.SyncType
		 * @see rebel_core.impl.Rebel_corePackageImpl#getSyncType()
		 * @generated
		 */
		EEnum SYNC_TYPE = eINSTANCE.getSyncType();

		/**
		 * The meta object literal for the '{@link rebel_core.StateType <em>State Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.StateType
		 * @see rebel_core.impl.Rebel_corePackageImpl#getStateType()
		 * @generated
		 */
		EEnum STATE_TYPE = eINSTANCE.getStateType();

		/**
		 * The meta object literal for the '{@link rebel_core.ModelElementType <em>Model Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.ModelElementType
		 * @see rebel_core.impl.Rebel_corePackageImpl#getModelElementType()
		 * @generated
		 */
		EEnum MODEL_ELEMENT_TYPE = eINSTANCE.getModelElementType();

		/**
		 * The meta object literal for the '{@link rebel_core.ConsequenceType <em>Consequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.ConsequenceType
		 * @see rebel_core.impl.Rebel_corePackageImpl#getConsequenceType()
		 * @generated
		 */
		EEnum CONSEQUENCE_TYPE = eINSTANCE.getConsequenceType();

		/**
		 * The meta object literal for the '{@link rebel_core.ACTIONTYPE <em>ACTIONTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.ACTIONTYPE
		 * @see rebel_core.impl.Rebel_corePackageImpl#getACTIONTYPE()
		 * @generated
		 */
		EEnum ACTIONTYPE = eINSTANCE.getACTIONTYPE();

		/**
		 * The meta object literal for the '{@link rebel_core.OPERATIONTYPE <em>OPERATIONTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.OPERATIONTYPE
		 * @see rebel_core.impl.Rebel_corePackageImpl#getOPERATIONTYPE()
		 * @generated
		 */
		EEnum OPERATIONTYPE = eINSTANCE.getOPERATIONTYPE();

		/**
		 * The meta object literal for the '{@link rebel_core.RELATIONTYPE <em>RELATIONTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.RELATIONTYPE
		 * @see rebel_core.impl.Rebel_corePackageImpl#getRELATIONTYPE()
		 * @generated
		 */
		EEnum RELATIONTYPE = eINSTANCE.getRELATIONTYPE();

		/**
		 * The meta object literal for the '{@link rebel_core.ELEMENTTYPE <em>ELEMENTTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_core.ELEMENTTYPE
		 * @see rebel_core.impl.Rebel_corePackageImpl#getELEMENTTYPE()
		 * @generated
		 */
		EEnum ELEMENTTYPE = eINSTANCE.getELEMENTTYPE();

	}

} //Rebel_corePackage
