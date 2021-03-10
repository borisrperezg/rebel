/**
 */
package rebel_componentandconnector.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rebel_componentandconnector.Adaptor;
import rebel_componentandconnector.Arbitrator;
import rebel_componentandconnector.Buffering;
import rebel_componentandconnector.Component;
import rebel_componentandconnector.Connector;
import rebel_componentandconnector.DeliveryModel;
import rebel_componentandconnector.Distributor;
import rebel_componentandconnector.Event;
import rebel_componentandconnector.FunctionalView;
import rebel_componentandconnector.NotificationModel;
import rebel_componentandconnector.Port;
import rebel_componentandconnector.PortType;
import rebel_componentandconnector.ProcedureCall;
import rebel_componentandconnector.Project;
import rebel_componentandconnector.Rebel_componentandconnectorFactory;
import rebel_componentandconnector.Rebel_componentandconnectorPackage;
import rebel_componentandconnector.Role;
import rebel_componentandconnector.RoleType;
import rebel_componentandconnector.Stream;
import rebel_componentandconnector.SyncType;
import rebel_componentandconnector.Throughput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rebel_componentandconnectorPackageImpl extends EPackageImpl implements Rebel_componentandconnectorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalViewEClass = null;

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
	private EEnum roleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deliveryModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum syncTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notificationModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bufferingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum throughputEEnum = null;

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
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Rebel_componentandconnectorPackageImpl() {
		super(eNS_URI, Rebel_componentandconnectorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Rebel_componentandconnectorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Rebel_componentandconnectorPackage init() {
		if (isInited)
			return (Rebel_componentandconnectorPackage) EPackage.Registry.INSTANCE
					.getEPackage(Rebel_componentandconnectorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRebel_componentandconnectorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Rebel_componentandconnectorPackageImpl theRebel_componentandconnectorPackage = registeredRebel_componentandconnectorPackage instanceof Rebel_componentandconnectorPackageImpl
				? (Rebel_componentandconnectorPackageImpl) registeredRebel_componentandconnectorPackage
				: new Rebel_componentandconnectorPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRebel_componentandconnectorPackage.createPackageContents();

		// Initialize created meta-data
		theRebel_componentandconnectorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRebel_componentandconnectorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Rebel_componentandconnectorPackage.eNS_URI,
				theRebel_componentandconnectorPackage);
		return theRebel_componentandconnectorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Ports() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Id() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_PosX() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_PosY() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Width() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Height() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Name() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Delivery() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Sync() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Notification() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Buffering() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Throughput() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Protocol() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Props() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Roles() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Id() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_PosX() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_PosY() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Type() {
		return (EAttribute) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Name() {
		return (EAttribute) roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Port() {
		return (EReference) roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Name() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Type() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Id() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArbitrator() {
		return arbitratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStream() {
		return streamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdaptor() {
		return adaptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistributor() {
		return distributorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureCall() {
		return procedureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalView() {
		return functionalViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalView_Components() {
		return (EReference) functionalViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalView_Connectors() {
		return (EReference) functionalViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionalView_Name() {
		return (EAttribute) functionalViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionalView_Date() {
		return (EAttribute) functionalViewEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getProject_Name() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Functionalviews() {
		return (EReference) projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ModelingDate() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRoleType() {
		return roleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeliveryModel() {
		return deliveryModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSyncType() {
		return syncTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNotificationModel() {
		return notificationModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBuffering() {
		return bufferingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getThroughput() {
		return throughputEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rebel_componentandconnectorFactory getRebel_componentandconnectorFactory() {
		return (Rebel_componentandconnectorFactory) getEFactoryInstance();
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
		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__PORTS);
		createEAttribute(componentEClass, COMPONENT__ID);
		createEAttribute(componentEClass, COMPONENT__POS_X);
		createEAttribute(componentEClass, COMPONENT__POS_Y);
		createEAttribute(componentEClass, COMPONENT__WIDTH);
		createEAttribute(componentEClass, COMPONENT__HEIGHT);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__NAME);
		createEAttribute(connectorEClass, CONNECTOR__DELIVERY);
		createEAttribute(connectorEClass, CONNECTOR__NOTIFICATION);
		createEAttribute(connectorEClass, CONNECTOR__BUFFERING);
		createEAttribute(connectorEClass, CONNECTOR__THROUGHPUT);
		createEAttribute(connectorEClass, CONNECTOR__PROTOCOL);
		createEAttribute(connectorEClass, CONNECTOR__PROPS);
		createEReference(connectorEClass, CONNECTOR__ROLES);
		createEAttribute(connectorEClass, CONNECTOR__ID);
		createEAttribute(connectorEClass, CONNECTOR__POS_X);
		createEAttribute(connectorEClass, CONNECTOR__POS_Y);
		createEAttribute(connectorEClass, CONNECTOR__SYNC);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__TYPE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEReference(roleEClass, ROLE__PORT);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__TYPE);
		createEAttribute(portEClass, PORT__ID);

		arbitratorEClass = createEClass(ARBITRATOR);

		streamEClass = createEClass(STREAM);

		adaptorEClass = createEClass(ADAPTOR);

		distributorEClass = createEClass(DISTRIBUTOR);

		eventEClass = createEClass(EVENT);

		procedureCallEClass = createEClass(PROCEDURE_CALL);

		functionalViewEClass = createEClass(FUNCTIONAL_VIEW);
		createEReference(functionalViewEClass, FUNCTIONAL_VIEW__COMPONENTS);
		createEReference(functionalViewEClass, FUNCTIONAL_VIEW__CONNECTORS);
		createEAttribute(functionalViewEClass, FUNCTIONAL_VIEW__NAME);
		createEAttribute(functionalViewEClass, FUNCTIONAL_VIEW__DATE);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEReference(projectEClass, PROJECT__FUNCTIONALVIEWS);
		createEAttribute(projectEClass, PROJECT__MODELING_DATE);

		// Create enums
		roleTypeEEnum = createEEnum(ROLE_TYPE);
		portTypeEEnum = createEEnum(PORT_TYPE);
		deliveryModelEEnum = createEEnum(DELIVERY_MODEL);
		syncTypeEEnum = createEEnum(SYNC_TYPE);
		notificationModelEEnum = createEEnum(NOTIFICATION_MODEL);
		bufferingEEnum = createEEnum(BUFFERING);
		throughputEEnum = createEEnum(THROUGHPUT);
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
		arbitratorEClass.getESuperTypes().add(this.getConnector());
		streamEClass.getESuperTypes().add(this.getConnector());
		adaptorEClass.getESuperTypes().add(this.getConnector());
		distributorEClass.getESuperTypes().add(this.getConnector());
		eventEClass.getESuperTypes().add(this.getConnector());
		procedureCallEClass.getESuperTypes().add(this.getConnector());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Ports(), this.getPort(), null, "ports", null, 1, -1, Component.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getComponent_Id(), ecorePackage.getEString(), "id", null, 0, 1, Component.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_PosX(), ecorePackage.getEString(), "posX", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_PosY(), ecorePackage.getEString(), "posY", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Width(), ecorePackage.getEString(), "width", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Height(), ecorePackage.getEString(), "height", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Delivery(), this.getDeliveryModel(), "delivery", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Notification(), this.getNotificationModel(), "notification", null, 0, 1,
				Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Buffering(), this.getBuffering(), "buffering", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Throughput(), this.getThroughput(), "throughput", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Props(), ecorePackage.getEString(), "props", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Roles(), this.getRole(), null, "roles", null, 1, -1, Connector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getConnector_Id(), ecorePackage.getEString(), "id", null, 0, 1, Connector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PosX(), ecorePackage.getEString(), "posX", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_PosY(), ecorePackage.getEString(), "posY", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Sync(), this.getSyncType(), "sync", null, 0, 1, Connector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Type(), this.getRoleType(), "type", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Port(), this.getPort(), null, "port", null, 0, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Type(), this.getPortType(), "type", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Id(), ecorePackage.getEString(), "id", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arbitratorEClass, Arbitrator.class, "Arbitrator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(streamEClass, Stream.class, "Stream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adaptorEClass, Adaptor.class, "Adaptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distributorEClass, Distributor.class, "Distributor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(procedureCallEClass, ProcedureCall.class, "ProcedureCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalViewEClass, FunctionalView.class, "FunctionalView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalView_Components(), this.getComponent(), null, "components", null, 0, -1,
				FunctionalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalView_Connectors(), this.getConnector(), null, "connectors", null, 0, -1,
				FunctionalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalView_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionalView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalView_Date(), ecorePackage.getEDate(), "date", null, 0, 1, FunctionalView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Functionalviews(), this.getFunctionalView(), null, "functionalviews", null, 0, -1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ModelingDate(), ecorePackage.getEDate(), "modelingDate", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(roleTypeEEnum, RoleType.class, "RoleType");
		addEEnumLiteral(roleTypeEEnum, RoleType.NONE);
		addEEnumLiteral(roleTypeEEnum, RoleType.IN);
		addEEnumLiteral(roleTypeEEnum, RoleType.OUT);

		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.NONE);
		addEEnumLiteral(portTypeEEnum, PortType.PROVIDED);
		addEEnumLiteral(portTypeEEnum, PortType.REQUIRED);

		initEEnum(deliveryModelEEnum, DeliveryModel.class, "DeliveryModel");
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.NONE);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.AT_LEAST_ONE);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.AT_MOST_ONE);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.EXACTLY_ONE);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.BEST_EFFORT);

		initEEnum(syncTypeEEnum, SyncType.class, "SyncType");
		addEEnumLiteral(syncTypeEEnum, SyncType.NONE);
		addEEnumLiteral(syncTypeEEnum, SyncType.SYNC);
		addEEnumLiteral(syncTypeEEnum, SyncType.ASYNC);

		initEEnum(notificationModelEEnum, NotificationModel.class, "NotificationModel");
		addEEnumLiteral(notificationModelEEnum, NotificationModel.NONE);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.PUBSUB);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.QUEUED);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.CENTRAL);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.POLLED);

		initEEnum(bufferingEEnum, Buffering.class, "Buffering");
		addEEnumLiteral(bufferingEEnum, Buffering.NONE);
		addEEnumLiteral(bufferingEEnum, Buffering.UNBUFFERED);
		addEEnumLiteral(bufferingEEnum, Buffering.BUFFERED);

		initEEnum(throughputEEnum, Throughput.class, "Throughput");
		addEEnumLiteral(throughputEEnum, Throughput.NONE);
		addEEnumLiteral(throughputEEnum, Throughput.HIGH_ORDER);
		addEEnumLiteral(throughputEEnum, Throughput.ATOMIC);

		// Create resource
		createResource(eNS_URI);
	}

} //Rebel_componentandconnectorPackageImpl
