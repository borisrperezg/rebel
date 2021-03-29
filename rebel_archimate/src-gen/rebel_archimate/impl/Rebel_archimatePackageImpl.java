/**
 */
package rebel_archimate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rebel_archimate.Buffering;
import rebel_archimate.DeliveryModel;
import rebel_archimate.Element;
import rebel_archimate.NotificationModel;
import rebel_archimate.Project;
import rebel_archimate.Rebel_archimateFactory;
import rebel_archimate.Rebel_archimatePackage;
import rebel_archimate.Relation;
import rebel_archimate.SyncType;
import rebel_archimate.Throughput;
import rebel_archimate.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rebel_archimatePackageImpl extends EPackageImpl implements Rebel_archimatePackage {
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
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationtypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementtypeEEnum = null;

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
	private EEnum bufferingEEnum = null;

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
	private EEnum throughputEEnum = null;

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
	private EEnum applicationservicetypeEEnum = null;

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
	 * @see rebel_archimate.Rebel_archimatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Rebel_archimatePackageImpl() {
		super(eNS_URI, Rebel_archimateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Rebel_archimatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Rebel_archimatePackage init() {
		if (isInited)
			return (Rebel_archimatePackage) EPackage.Registry.INSTANCE.getEPackage(Rebel_archimatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRebel_archimatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Rebel_archimatePackageImpl theRebel_archimatePackage = registeredRebel_archimatePackage instanceof Rebel_archimatePackageImpl
				? (Rebel_archimatePackageImpl) registeredRebel_archimatePackage
				: new Rebel_archimatePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRebel_archimatePackage.createPackageContents();

		// Initialize created meta-data
		theRebel_archimatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRebel_archimatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Rebel_archimatePackage.eNS_URI, theRebel_archimatePackage);
		return theRebel_archimatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_View() {
		return (EReference) projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ModelingDate() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Relation() {
		return (EReference) viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Element() {
		return (EReference) viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Name() {
		return (EAttribute) viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Id() {
		return (EAttribute) viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Date() {
		return (EAttribute) viewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Id() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_PosX() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_PosY() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Width() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Height() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Type() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Grouper() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Sync() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Delivery() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Notification() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Buffering() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Throughput() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ApplicationServiceType() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Source() {
		return (EReference) relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Target() {
		return (EReference) relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Id() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Type() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRELATIONTYPE() {
		return relationtypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getELEMENTTYPE() {
		return elementtypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSyncType() {
		return syncTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuffering() {
		return bufferingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeliveryModel() {
		return deliveryModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getThroughput() {
		return throughputEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotificationModel() {
		return notificationModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAPPLICATIONSERVICETYPE() {
		return applicationservicetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rebel_archimateFactory getRebel_archimateFactory() {
		return (Rebel_archimateFactory) getEFactoryInstance();
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
		createEReference(projectEClass, PROJECT__VIEW);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__MODELING_DATE);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__RELATION);
		createEReference(viewEClass, VIEW__ELEMENT);
		createEAttribute(viewEClass, VIEW__NAME);
		createEAttribute(viewEClass, VIEW__ID);
		createEAttribute(viewEClass, VIEW__DATE);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__POS_X);
		createEAttribute(elementEClass, ELEMENT__POS_Y);
		createEAttribute(elementEClass, ELEMENT__WIDTH);
		createEAttribute(elementEClass, ELEMENT__HEIGHT);
		createEAttribute(elementEClass, ELEMENT__TYPE);
		createEAttribute(elementEClass, ELEMENT__GROUPER);
		createEAttribute(elementEClass, ELEMENT__SYNC);
		createEAttribute(elementEClass, ELEMENT__DELIVERY);
		createEAttribute(elementEClass, ELEMENT__NOTIFICATION);
		createEAttribute(elementEClass, ELEMENT__BUFFERING);
		createEAttribute(elementEClass, ELEMENT__THROUGHPUT);
		createEAttribute(elementEClass, ELEMENT__APPLICATION_SERVICE_TYPE);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__SOURCE);
		createEReference(relationEClass, RELATION__TARGET);
		createEAttribute(relationEClass, RELATION__ID);
		createEAttribute(relationEClass, RELATION__TYPE);

		// Create enums
		relationtypeEEnum = createEEnum(RELATIONTYPE);
		elementtypeEEnum = createEEnum(ELEMENTTYPE);
		syncTypeEEnum = createEEnum(SYNC_TYPE);
		bufferingEEnum = createEEnum(BUFFERING);
		deliveryModelEEnum = createEEnum(DELIVERY_MODEL);
		throughputEEnum = createEEnum(THROUGHPUT);
		notificationModelEEnum = createEEnum(NOTIFICATION_MODEL);
		applicationservicetypeEEnum = createEEnum(APPLICATIONSERVICETYPE);
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
		initEReference(getProject_View(), this.getView(), null, "view", null, 0, -1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ModelingDate(), ecorePackage.getEDate(), "modelingDate", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_Relation(), this.getRelation(), null, "relation", null, 0, -1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getView_Element(), this.getElement(), null, "element", null, 0, -1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getView_Name(), ecorePackage.getEString(), "name", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Id(), ecorePackage.getEString(), "id", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Date(), ecorePackage.getEDate(), "date", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_PosX(), ecorePackage.getEInt(), "posX", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_PosY(), ecorePackage.getEInt(), "posY", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Type(), this.getELEMENTTYPE(), "type", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Grouper(), ecorePackage.getEBoolean(), "grouper", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Sync(), this.getSyncType(), "sync", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Delivery(), this.getDeliveryModel(), "delivery", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Notification(), this.getNotificationModel(), "notification", null, 0, 1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Buffering(), this.getBuffering(), "buffering", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Throughput(), this.getThroughput(), "throughput", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_ApplicationServiceType(), this.getAPPLICATIONSERVICETYPE(), "applicationServiceType",
				null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Source(), this.getElement(), null, "source", null, 1, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Target(), this.getElement(), null, "target", null, 1, 1, Relation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Id(), ecorePackage.getEString(), "id", null, 0, 1, Relation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Type(), this.getRELATIONTYPE(), "type", null, 0, 1, Relation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(relationtypeEEnum, rebel_archimate.RELATIONTYPE.class, "RELATIONTYPE");
		addEEnumLiteral(relationtypeEEnum, rebel_archimate.RELATIONTYPE.NONE);
		addEEnumLiteral(relationtypeEEnum, rebel_archimate.RELATIONTYPE.REALIZATION);
		addEEnumLiteral(relationtypeEEnum, rebel_archimate.RELATIONTYPE.INFLUENCE);
		addEEnumLiteral(relationtypeEEnum, rebel_archimate.RELATIONTYPE.AGGREGATION);
		addEEnumLiteral(relationtypeEEnum, rebel_archimate.RELATIONTYPE.TRIGGERING);
		addEEnumLiteral(relationtypeEEnum, rebel_archimate.RELATIONTYPE.SERVING);
		addEEnumLiteral(relationtypeEEnum, rebel_archimate.RELATIONTYPE.ACCESS);
		addEEnumLiteral(relationtypeEEnum, rebel_archimate.RELATIONTYPE.COMPOSITION);
		addEEnumLiteral(relationtypeEEnum, rebel_archimate.RELATIONTYPE.ASSOCIATION);

		initEEnum(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.class, "ELEMENTTYPE");
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.NONE);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.BUSINESS_SERVICE);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.APPLICATION_SERVICE);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.DEVICE);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.ASSESSMENT);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.APPLICATION_COMPONENT);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.BUSINESS_PROCESS);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.APPLICATION_COLLABORATION);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.DATAOBJECT);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.MOTIVATION_STAKEHOLDER);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.MOTIVATION_DRIVER);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.MOTIVATION_GOAL);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.MOTIVATION_OUTCOME);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.MOTIVATION_REQUIREMENT);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.BUSINESS_COLLABORATION);
		addEEnumLiteral(elementtypeEEnum, rebel_archimate.ELEMENTTYPE.APPLICATION_INTERFACE);

		initEEnum(syncTypeEEnum, SyncType.class, "SyncType");
		addEEnumLiteral(syncTypeEEnum, SyncType.NONE);
		addEEnumLiteral(syncTypeEEnum, SyncType.SYNC);
		addEEnumLiteral(syncTypeEEnum, SyncType.ASYNC);

		initEEnum(bufferingEEnum, Buffering.class, "Buffering");
		addEEnumLiteral(bufferingEEnum, Buffering.NONE);
		addEEnumLiteral(bufferingEEnum, Buffering.UNBUFFERED);
		addEEnumLiteral(bufferingEEnum, Buffering.BUFFERED);

		initEEnum(deliveryModelEEnum, DeliveryModel.class, "DeliveryModel");
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.NONE);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.AT_LEAST_ONE);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.AT_MOST_ONE);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.EXACTLY_ONE);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.BEST_EFFORT);

		initEEnum(throughputEEnum, Throughput.class, "Throughput");
		addEEnumLiteral(throughputEEnum, Throughput.NONE);
		addEEnumLiteral(throughputEEnum, Throughput.HIGH_ORDER);
		addEEnumLiteral(throughputEEnum, Throughput.ATOMIC);

		initEEnum(notificationModelEEnum, NotificationModel.class, "NotificationModel");
		addEEnumLiteral(notificationModelEEnum, NotificationModel.NONE);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.PUBSUB);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.QUEUED);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.CENTRAL);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.POLLED);

		initEEnum(applicationservicetypeEEnum, rebel_archimate.APPLICATIONSERVICETYPE.class, "APPLICATIONSERVICETYPE");
		addEEnumLiteral(applicationservicetypeEEnum, rebel_archimate.APPLICATIONSERVICETYPE.NONE);
		addEEnumLiteral(applicationservicetypeEEnum, rebel_archimate.APPLICATIONSERVICETYPE.EVENT);
		addEEnumLiteral(applicationservicetypeEEnum, rebel_archimate.APPLICATIONSERVICETYPE.PROCEDURE_CALL);

		// Create resource
		createResource(eNS_URI);
	}

} //Rebel_archimatePackageImpl
