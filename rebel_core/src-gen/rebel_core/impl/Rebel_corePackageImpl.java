/**
 */
package rebel_core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rebel_core.ATDBenefit;
import rebel_core.ATDEffect;
import rebel_core.ATDItem;
import rebel_core.ATDRationale;
import rebel_core.Action;
import rebel_core.Adaptor;
import rebel_core.Alternative;
import rebel_core.Arbitrator;
import rebel_core.ArchimateView;
import rebel_core.Assumption;
import rebel_core.BlockOfInterest;
import rebel_core.Buffering;
import rebel_core.Component;
import rebel_core.Connector;
import rebel_core.Consequence;
import rebel_core.ConsequenceType;
import rebel_core.Decision;
import rebel_core.DeliveryModel;
import rebel_core.Distributor;
import rebel_core.Element;
import rebel_core.Event;
import rebel_core.Fact;
import rebel_core.FunctionalView;
import rebel_core.Message;
import rebel_core.ModelElementType;
import rebel_core.Motivator;
import rebel_core.NotificationModel;
import rebel_core.Person;
import rebel_core.Port;
import rebel_core.PortType;
import rebel_core.ProcedureCall;
import rebel_core.Project;
import rebel_core.Rebel_coreFactory;
import rebel_core.Rebel_corePackage;
import rebel_core.Relation;
import rebel_core.Role;
import rebel_core.RoleType;
import rebel_core.StateType;
import rebel_core.Stream;
import rebel_core.SyncType;
import rebel_core.Throughput;
import rebel_core.UserStory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rebel_corePackageImpl extends EPackageImpl implements Rebel_corePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factEClass = null;

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
	private EClass blockOfInterestEClass = null;

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
	private EClass connectorEClass = null;

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
	private EClass portEClass = null;

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
	private EClass streamEClass = null;

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
	private EClass arbitratorEClass = null;

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
	private EClass decisionEClass = null;

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
	private EClass userStoryEClass = null;

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
	private EClass alternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

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
	private EClass relationEClass = null;

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
	private EClass archimateViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atdItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atdRationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atdBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atdEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

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
	private EEnum roleTypeEEnum = null;

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
	private EEnum syncTypeEEnum = null;

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
	private EEnum modelElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consequenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actiontypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationtypeEEnum = null;

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
	 * @see rebel_core.Rebel_corePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Rebel_corePackageImpl() {
		super(eNS_URI, Rebel_coreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Rebel_corePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Rebel_corePackage init() {
		if (isInited)
			return (Rebel_corePackage) EPackage.Registry.INSTANCE.getEPackage(Rebel_corePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRebel_corePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Rebel_corePackageImpl theRebel_corePackage = registeredRebel_corePackage instanceof Rebel_corePackageImpl
				? (Rebel_corePackageImpl) registeredRebel_corePackage
				: new Rebel_corePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRebel_corePackage.createPackageContents();

		// Initialize created meta-data
		theRebel_corePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRebel_corePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Rebel_corePackage.eNS_URI, theRebel_corePackage);
		return theRebel_corePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFact() {
		return factEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFact_Date() {
		return (EAttribute) factEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFact_Action() {
		return (EAttribute) factEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFact_Observations() {
		return (EAttribute) factEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFact_Functionalview() {
		return (EReference) factEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFact_Architecturaldecision() {
		return (EReference) factEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFact_ElementName() {
		return (EAttribute) factEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFact_ElementType() {
		return (EAttribute) factEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFact_Id() {
		return (EAttribute) factEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFact_Message() {
		return (EReference) factEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFact_View() {
		return (EReference) factEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFact_Fact() {
		return (EReference) factEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFact_Atditem() {
		return (EReference) factEClass.getEStructuralFeatures().get(11);
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
	public EReference getProject_Blockofinterest() {
		return (EReference) projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Id() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(1);
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
	public EReference getProject_Functionalviews() {
		return (EReference) projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Decisions() {
		return (EReference) projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Message() {
		return (EReference) projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Person() {
		return (EReference) projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ModelingDate() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_View() {
		return (EReference) projectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockOfInterest() {
		return blockOfInterestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockOfInterest_Fact() {
		return (EReference) blockOfInterestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockOfInterest_Id() {
		return (EAttribute) blockOfInterestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockOfInterest_Name() {
		return (EAttribute) blockOfInterestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockOfInterest_Responsible() {
		return (EAttribute) blockOfInterestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockOfInterest_Business_driver() {
		return (EAttribute) blockOfInterestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockOfInterest_Business_goal() {
		return (EAttribute) blockOfInterestEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getFunctionalView_Name() {
		return (EAttribute) functionalViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionalView_Date() {
		return (EAttribute) functionalViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalView_Components() {
		return (EReference) functionalViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalView_Connectors() {
		return (EReference) functionalViewEClass.getEStructuralFeatures().get(3);
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
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Notification() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Buffering() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Throughput() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Protocol() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Props() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Roles() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Id() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_PosX() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_PosY() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(11);
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
	public EAttribute getComponent_Id() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_PosX() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_PosY() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Width() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Height() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Ports() {
		return (EReference) componentEClass.getEStructuralFeatures().get(6);
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
	public EClass getStream() {
		return streamEClass;
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
	public EClass getArbitrator() {
		return arbitratorEClass;
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
	public EReference getDecision_Supercedes() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_Date() {
		return (EAttribute) decisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_Description() {
		return (EAttribute) decisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecision_Phase() {
		return (EAttribute) decisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Userstories() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Consequences() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Motivators() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Assumptions() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecision_Alternatives() {
		return (EReference) decisionEClass.getEStructuralFeatures().get(11);
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
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Subject() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Footer() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Scope() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Body() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Type() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Action() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Id() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Date() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_Person() {
		return (EReference) messageEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getPerson_Email() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Message() {
		return (EReference) personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_Source() {
		return (EReference) relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_Target() {
		return (EReference) relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelation_Id() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelation_Type() {
		return (EAttribute) relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Id() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Name() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_PosX() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_PosY() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Width() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Height() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Type() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Grouper() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_BoiElement() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Sync() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Delivery() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Notification() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Buffering() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Throughput() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchimateView() {
		return archimateViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchimateView_Relation() {
		return (EReference) archimateViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchimateView_Element() {
		return (EReference) archimateViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchimateView_Name() {
		return (EAttribute) archimateViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchimateView_Id() {
		return (EAttribute) archimateViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchimateView_Date() {
		return (EAttribute) archimateViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATDItem() {
		return atdItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATDItem_CompromisedQA() {
		return (EAttribute) atdItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATDItem_Date() {
		return (EAttribute) atdItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATDItem_Status() {
		return (EAttribute) atdItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATDItem_IncurredBy() {
		return (EAttribute) atdItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATDItem_Rationales() {
		return (EReference) atdItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATDItem_Benefits() {
		return (EReference) atdItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATDItem_Effects() {
		return (EReference) atdItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATDItem_Type() {
		return (EAttribute) atdItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATDItem_IdentifyByArchitect() {
		return (EAttribute) atdItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATDRationale() {
		return atdRationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATDRationale_Description() {
		return (EAttribute) atdRationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATDBenefit() {
		return atdBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATDBenefit_Description() {
		return (EAttribute) atdBenefitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATDEffect() {
		return atdEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getATDEffect_Description() {
		return (EAttribute) atdEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAction() {
		return actionEEnum;
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
	public EEnum getRoleType() {
		return roleTypeEEnum;
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
	public EEnum getStateType() {
		return stateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModelElementType() {
		return modelElementTypeEEnum;
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
	public EEnum getACTIONTYPE() {
		return actiontypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOPERATIONTYPE() {
		return operationtypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRELATIONTYPE() {
		return relationtypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getELEMENTTYPE() {
		return elementtypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rebel_coreFactory getRebel_coreFactory() {
		return (Rebel_coreFactory) getEFactoryInstance();
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
		factEClass = createEClass(FACT);
		createEAttribute(factEClass, FACT__DATE);
		createEAttribute(factEClass, FACT__ACTION);
		createEAttribute(factEClass, FACT__OBSERVATIONS);
		createEReference(factEClass, FACT__FUNCTIONALVIEW);
		createEReference(factEClass, FACT__ARCHITECTURALDECISION);
		createEAttribute(factEClass, FACT__ELEMENT_NAME);
		createEAttribute(factEClass, FACT__ELEMENT_TYPE);
		createEAttribute(factEClass, FACT__ID);
		createEReference(factEClass, FACT__MESSAGE);
		createEReference(factEClass, FACT__VIEW);
		createEReference(factEClass, FACT__FACT);
		createEReference(factEClass, FACT__ATDITEM);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__BLOCKOFINTEREST);
		createEAttribute(projectEClass, PROJECT__ID);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEReference(projectEClass, PROJECT__FUNCTIONALVIEWS);
		createEReference(projectEClass, PROJECT__DECISIONS);
		createEReference(projectEClass, PROJECT__MESSAGE);
		createEReference(projectEClass, PROJECT__PERSON);
		createEAttribute(projectEClass, PROJECT__MODELING_DATE);
		createEReference(projectEClass, PROJECT__VIEW);

		blockOfInterestEClass = createEClass(BLOCK_OF_INTEREST);
		createEReference(blockOfInterestEClass, BLOCK_OF_INTEREST__FACT);
		createEAttribute(blockOfInterestEClass, BLOCK_OF_INTEREST__ID);
		createEAttribute(blockOfInterestEClass, BLOCK_OF_INTEREST__NAME);
		createEAttribute(blockOfInterestEClass, BLOCK_OF_INTEREST__RESPONSIBLE);
		createEAttribute(blockOfInterestEClass, BLOCK_OF_INTEREST__BUSINESS_DRIVER);
		createEAttribute(blockOfInterestEClass, BLOCK_OF_INTEREST__BUSINESS_GOAL);

		functionalViewEClass = createEClass(FUNCTIONAL_VIEW);
		createEAttribute(functionalViewEClass, FUNCTIONAL_VIEW__NAME);
		createEAttribute(functionalViewEClass, FUNCTIONAL_VIEW__DATE);
		createEReference(functionalViewEClass, FUNCTIONAL_VIEW__COMPONENTS);
		createEReference(functionalViewEClass, FUNCTIONAL_VIEW__CONNECTORS);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__NAME);
		createEAttribute(connectorEClass, CONNECTOR__DELIVERY);
		createEAttribute(connectorEClass, CONNECTOR__SYNC);
		createEAttribute(connectorEClass, CONNECTOR__NOTIFICATION);
		createEAttribute(connectorEClass, CONNECTOR__BUFFERING);
		createEAttribute(connectorEClass, CONNECTOR__THROUGHPUT);
		createEAttribute(connectorEClass, CONNECTOR__PROTOCOL);
		createEAttribute(connectorEClass, CONNECTOR__PROPS);
		createEReference(connectorEClass, CONNECTOR__ROLES);
		createEAttribute(connectorEClass, CONNECTOR__ID);
		createEAttribute(connectorEClass, CONNECTOR__POS_X);
		createEAttribute(connectorEClass, CONNECTOR__POS_Y);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__ID);
		createEAttribute(componentEClass, COMPONENT__POS_X);
		createEAttribute(componentEClass, COMPONENT__POS_Y);
		createEAttribute(componentEClass, COMPONENT__WIDTH);
		createEAttribute(componentEClass, COMPONENT__HEIGHT);
		createEReference(componentEClass, COMPONENT__PORTS);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__TYPE);
		createEAttribute(portEClass, PORT__ID);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__TYPE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEReference(roleEClass, ROLE__PORT);

		adaptorEClass = createEClass(ADAPTOR);

		distributorEClass = createEClass(DISTRIBUTOR);

		streamEClass = createEClass(STREAM);

		procedureCallEClass = createEClass(PROCEDURE_CALL);

		arbitratorEClass = createEClass(ARBITRATOR);

		eventEClass = createEClass(EVENT);

		decisionEClass = createEClass(DECISION);
		createEAttribute(decisionEClass, DECISION__NUMBER);
		createEAttribute(decisionEClass, DECISION__TITLE);
		createEAttribute(decisionEClass, DECISION__STATE);
		createEReference(decisionEClass, DECISION__SUPERCEDES);
		createEAttribute(decisionEClass, DECISION__DATE);
		createEAttribute(decisionEClass, DECISION__DESCRIPTION);
		createEAttribute(decisionEClass, DECISION__PHASE);
		createEReference(decisionEClass, DECISION__USERSTORIES);
		createEReference(decisionEClass, DECISION__CONSEQUENCES);
		createEReference(decisionEClass, DECISION__MOTIVATORS);
		createEReference(decisionEClass, DECISION__ASSUMPTIONS);
		createEReference(decisionEClass, DECISION__ALTERNATIVES);

		assumptionEClass = createEClass(ASSUMPTION);
		createEAttribute(assumptionEClass, ASSUMPTION__DESCRIPTION);

		userStoryEClass = createEClass(USER_STORY);
		createEAttribute(userStoryEClass, USER_STORY__ID);

		consequenceEClass = createEClass(CONSEQUENCE);
		createEAttribute(consequenceEClass, CONSEQUENCE__DESCRIPTION);
		createEAttribute(consequenceEClass, CONSEQUENCE__TYPE);

		motivatorEClass = createEClass(MOTIVATOR);
		createEAttribute(motivatorEClass, MOTIVATOR__DESCRIPTION);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEAttribute(alternativeEClass, ALTERNATIVE__DESCRIPTION);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__SUBJECT);
		createEAttribute(messageEClass, MESSAGE__FOOTER);
		createEAttribute(messageEClass, MESSAGE__SCOPE);
		createEAttribute(messageEClass, MESSAGE__BODY);
		createEAttribute(messageEClass, MESSAGE__TYPE);
		createEAttribute(messageEClass, MESSAGE__ACTION);
		createEAttribute(messageEClass, MESSAGE__ID);
		createEAttribute(messageEClass, MESSAGE__DATE);
		createEReference(messageEClass, MESSAGE__PERSON);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__EMAIL);
		createEReference(personEClass, PERSON__MESSAGE);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__SOURCE);
		createEReference(relationEClass, RELATION__TARGET);
		createEAttribute(relationEClass, RELATION__ID);
		createEAttribute(relationEClass, RELATION__TYPE);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__POS_X);
		createEAttribute(elementEClass, ELEMENT__POS_Y);
		createEAttribute(elementEClass, ELEMENT__WIDTH);
		createEAttribute(elementEClass, ELEMENT__HEIGHT);
		createEAttribute(elementEClass, ELEMENT__TYPE);
		createEAttribute(elementEClass, ELEMENT__GROUPER);
		createEAttribute(elementEClass, ELEMENT__BOI_ELEMENT);
		createEAttribute(elementEClass, ELEMENT__SYNC);
		createEAttribute(elementEClass, ELEMENT__DELIVERY);
		createEAttribute(elementEClass, ELEMENT__NOTIFICATION);
		createEAttribute(elementEClass, ELEMENT__BUFFERING);
		createEAttribute(elementEClass, ELEMENT__THROUGHPUT);

		archimateViewEClass = createEClass(ARCHIMATE_VIEW);
		createEReference(archimateViewEClass, ARCHIMATE_VIEW__RELATION);
		createEReference(archimateViewEClass, ARCHIMATE_VIEW__ELEMENT);
		createEAttribute(archimateViewEClass, ARCHIMATE_VIEW__NAME);
		createEAttribute(archimateViewEClass, ARCHIMATE_VIEW__ID);
		createEAttribute(archimateViewEClass, ARCHIMATE_VIEW__DATE);

		atdItemEClass = createEClass(ATD_ITEM);
		createEAttribute(atdItemEClass, ATD_ITEM__COMPROMISED_QA);
		createEAttribute(atdItemEClass, ATD_ITEM__DATE);
		createEAttribute(atdItemEClass, ATD_ITEM__STATUS);
		createEAttribute(atdItemEClass, ATD_ITEM__INCURRED_BY);
		createEReference(atdItemEClass, ATD_ITEM__RATIONALES);
		createEReference(atdItemEClass, ATD_ITEM__BENEFITS);
		createEReference(atdItemEClass, ATD_ITEM__EFFECTS);
		createEAttribute(atdItemEClass, ATD_ITEM__TYPE);
		createEAttribute(atdItemEClass, ATD_ITEM__IDENTIFY_BY_ARCHITECT);

		atdRationaleEClass = createEClass(ATD_RATIONALE);
		createEAttribute(atdRationaleEClass, ATD_RATIONALE__DESCRIPTION);

		atdBenefitEClass = createEClass(ATD_BENEFIT);
		createEAttribute(atdBenefitEClass, ATD_BENEFIT__DESCRIPTION);

		atdEffectEClass = createEClass(ATD_EFFECT);
		createEAttribute(atdEffectEClass, ATD_EFFECT__DESCRIPTION);

		// Create enums
		actionEEnum = createEEnum(ACTION);
		portTypeEEnum = createEEnum(PORT_TYPE);
		roleTypeEEnum = createEEnum(ROLE_TYPE);
		throughputEEnum = createEEnum(THROUGHPUT);
		notificationModelEEnum = createEEnum(NOTIFICATION_MODEL);
		bufferingEEnum = createEEnum(BUFFERING);
		deliveryModelEEnum = createEEnum(DELIVERY_MODEL);
		syncTypeEEnum = createEEnum(SYNC_TYPE);
		stateTypeEEnum = createEEnum(STATE_TYPE);
		modelElementTypeEEnum = createEEnum(MODEL_ELEMENT_TYPE);
		consequenceTypeEEnum = createEEnum(CONSEQUENCE_TYPE);
		actiontypeEEnum = createEEnum(ACTIONTYPE);
		operationtypeEEnum = createEEnum(OPERATIONTYPE);
		relationtypeEEnum = createEEnum(RELATIONTYPE);
		elementtypeEEnum = createEEnum(ELEMENTTYPE);
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
		adaptorEClass.getESuperTypes().add(this.getConnector());
		distributorEClass.getESuperTypes().add(this.getConnector());
		streamEClass.getESuperTypes().add(this.getConnector());
		procedureCallEClass.getESuperTypes().add(this.getConnector());
		arbitratorEClass.getESuperTypes().add(this.getConnector());
		eventEClass.getESuperTypes().add(this.getConnector());

		// Initialize classes, features, and operations; add parameters
		initEClass(factEClass, Fact.class, "Fact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFact_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Fact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFact_Action(), this.getAction(), "action", null, 0, 1, Fact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFact_Observations(), ecorePackage.getEString(), "observations", null, 0, 1, Fact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFact_Functionalview(), this.getFunctionalView(), null, "functionalview", null, 0, -1,
				Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFact_Architecturaldecision(), this.getDecision(), null, "architecturaldecision", null, 0, -1,
				Fact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFact_ElementName(), ecorePackage.getEString(), "elementName", null, 0, 1, Fact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFact_ElementType(), ecorePackage.getEString(), "elementType", null, 0, 1, Fact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFact_Id(), ecorePackage.getEString(), "id", null, 0, 1, Fact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFact_Message(), this.getMessage(), null, "message", null, 0, -1, Fact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFact_View(), this.getArchimateView(), null, "view", null, 0, -1, Fact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFact_Fact(), this.getFact(), null, "fact", null, 0, 1, Fact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFact_Atditem(), this.getATDItem(), null, "atditem", null, 0, -1, Fact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Blockofinterest(), this.getBlockOfInterest(), null, "blockofinterest", null, 0, -1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Functionalviews(), this.getFunctionalView(), null, "functionalviews", null, 0, -1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Decisions(), this.getDecision(), null, "decisions", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Message(), this.getMessage(), null, "message", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Person(), this.getPerson(), null, "person", null, 0, -1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getProject_ModelingDate(), ecorePackage.getEDate(), "modelingDate", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_View(), this.getArchimateView(), null, "view", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockOfInterestEClass, BlockOfInterest.class, "BlockOfInterest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockOfInterest_Fact(), this.getFact(), null, "fact", null, 0, -1, BlockOfInterest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockOfInterest_Id(), ecorePackage.getEInt(), "id", null, 0, 1, BlockOfInterest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockOfInterest_Name(), ecorePackage.getEString(), "name", null, 0, 1, BlockOfInterest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockOfInterest_Responsible(), ecorePackage.getEString(), "responsible", null, 0, 1,
				BlockOfInterest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockOfInterest_Business_driver(), ecorePackage.getEString(), "business_driver", null, 0, 1,
				BlockOfInterest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockOfInterest_Business_goal(), ecorePackage.getEString(), "business_goal", null, 0, 1,
				BlockOfInterest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(functionalViewEClass, FunctionalView.class, "FunctionalView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalView_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionalView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalView_Date(), ecorePackage.getEDate(), "date", null, 0, 1, FunctionalView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalView_Components(), this.getComponent(), null, "components", null, 0, -1,
				FunctionalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalView_Connectors(), this.getConnector(), null, "connectors", null, 0, -1,
				FunctionalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Delivery(), this.getDeliveryModel(), "delivery", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Sync(), this.getSyncType(), "sync", null, 0, 1, Connector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getComponent_Ports(), this.getPort(), null, "ports", null, 1, -1, Component.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Type(), this.getPortType(), "type", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Id(), ecorePackage.getEString(), "id", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Type(), this.getRoleType(), "type", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Port(), this.getPort(), null, "port", null, 0, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(adaptorEClass, Adaptor.class, "Adaptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distributorEClass, Distributor.class, "Distributor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(streamEClass, Stream.class, "Stream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(procedureCallEClass, ProcedureCall.class, "ProcedureCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(arbitratorEClass, Arbitrator.class, "Arbitrator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecision_Number(), ecorePackage.getEString(), "number", null, 0, 1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Title(), ecorePackage.getEString(), "title", null, 0, 1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_State(), this.getStateType(), "state", null, 0, 1, Decision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Supercedes(), this.getDecision(), null, "supercedes", null, 0, 1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Decision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Description(), ecorePackage.getEString(), "description", null, 0, 1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Phase(), ecorePackage.getEString(), "phase", null, 0, 1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Userstories(), this.getUserStory(), null, "userstories", null, 0, -1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Consequences(), this.getConsequence(), null, "consequences", null, 0, -1,
				Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Motivators(), this.getMotivator(), null, "motivators", null, 0, -1, Decision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Assumptions(), this.getAssumption(), null, "assumptions", null, 0, -1,
				Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Alternatives(), this.getAlternative(), null, "alternatives", null, 0, -1,
				Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssumption_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(userStoryEClass, UserStory.class, "UserStory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserStory_Id(), ecorePackage.getEString(), "id", null, 0, 1, UserStory.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlternative_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, Message.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, Message.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Scope(), ecorePackage.getEString(), "scope", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Body(), ecorePackage.getEString(), "body", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Type(), this.getOPERATIONTYPE(), "type", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Action(), this.getACTIONTYPE(), "action", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Id(), ecorePackage.getEString(), "id", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Person(), this.getPerson(), this.getPerson_Message(), "person", null, 0, 1,
				Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Email(), ecorePackage.getEString(), "email", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Message(), this.getMessage(), this.getMessage_Person(), "message", null, 0, -1,
				Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getElement_BoiElement(), ecorePackage.getEBoolean(), "boiElement", null, 0, 1, Element.class,
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

		initEClass(archimateViewEClass, ArchimateView.class, "ArchimateView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchimateView_Relation(), this.getRelation(), null, "relation", null, 0, -1,
				ArchimateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchimateView_Element(), this.getElement(), null, "element", null, 0, -1, ArchimateView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchimateView_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArchimateView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchimateView_Id(), ecorePackage.getEString(), "id", null, 0, 1, ArchimateView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchimateView_Date(), ecorePackage.getEDate(), "date", null, 0, 1, ArchimateView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atdItemEClass, ATDItem.class, "ATDItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATDItem_CompromisedQA(), ecorePackage.getEString(), "compromisedQA", null, 0, 1,
				ATDItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getATDItem_Date(), ecorePackage.getEDate(), "date", null, 0, 1, ATDItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATDItem_Status(), ecorePackage.getEString(), "status", null, 0, 1, ATDItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATDItem_IncurredBy(), ecorePackage.getEString(), "incurredBy", null, 0, 1, ATDItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATDItem_Rationales(), this.getATDRationale(), null, "rationales", null, 0, -1, ATDItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATDItem_Benefits(), this.getATDBenefit(), null, "benefits", null, 0, -1, ATDItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATDItem_Effects(), this.getATDEffect(), null, "effects", null, 0, -1, ATDItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATDItem_Type(), ecorePackage.getEString(), "type", null, 0, 1, ATDItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATDItem_IdentifyByArchitect(), ecorePackage.getEBoolean(), "identifyByArchitect", null, 0, 1,
				ATDItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(atdRationaleEClass, ATDRationale.class, "ATDRationale", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATDRationale_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ATDRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(atdBenefitEClass, ATDBenefit.class, "ATDBenefit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATDBenefit_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ATDBenefit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(atdEffectEClass, ATDEffect.class, "ATDEffect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATDEffect_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ATDEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actionEEnum, Action.class, "Action");
		addEEnumLiteral(actionEEnum, Action.NONE);
		addEEnumLiteral(actionEEnum, Action.CREATE);
		addEEnumLiteral(actionEEnum, Action.DELETE);
		addEEnumLiteral(actionEEnum, Action.DIVIDE);
		addEEnumLiteral(actionEEnum, Action.UPDATE);

		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.NONE);
		addEEnumLiteral(portTypeEEnum, PortType.PROVIDED);
		addEEnumLiteral(portTypeEEnum, PortType.REQUIRED);

		initEEnum(roleTypeEEnum, RoleType.class, "RoleType");
		addEEnumLiteral(roleTypeEEnum, RoleType.NONE);
		addEEnumLiteral(roleTypeEEnum, RoleType.IN);
		addEEnumLiteral(roleTypeEEnum, RoleType.OUT);

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

		initEEnum(syncTypeEEnum, SyncType.class, "SyncType");
		addEEnumLiteral(syncTypeEEnum, SyncType.NONE);
		addEEnumLiteral(syncTypeEEnum, SyncType.SYNC);
		addEEnumLiteral(syncTypeEEnum, SyncType.ASYNC);

		initEEnum(stateTypeEEnum, StateType.class, "StateType");
		addEEnumLiteral(stateTypeEEnum, StateType.ACCEPTED);
		addEEnumLiteral(stateTypeEEnum, StateType.PROPOSED);
		addEEnumLiteral(stateTypeEEnum, StateType.DEPRECATED);
		addEEnumLiteral(stateTypeEEnum, StateType.SUPERCEDES);
		addEEnumLiteral(stateTypeEEnum, StateType.REJECTED);

		initEEnum(modelElementTypeEEnum, ModelElementType.class, "ModelElementType");
		addEEnumLiteral(modelElementTypeEEnum, ModelElementType.COMPONENT);
		addEEnumLiteral(modelElementTypeEEnum, ModelElementType.CONNECTOR);
		addEEnumLiteral(modelElementTypeEEnum, ModelElementType.ARCHIMATE_ELEMENT);
		addEEnumLiteral(modelElementTypeEEnum, ModelElementType.ARCHIMATE_RELATION);

		initEEnum(consequenceTypeEEnum, ConsequenceType.class, "ConsequenceType");
		addEEnumLiteral(consequenceTypeEEnum, ConsequenceType.POSITIVE);
		addEEnumLiteral(consequenceTypeEEnum, ConsequenceType.NEGATIVE);

		initEEnum(actiontypeEEnum, rebel_core.ACTIONTYPE.class, "ACTIONTYPE");
		addEEnumLiteral(actiontypeEEnum, rebel_core.ACTIONTYPE.COMMIT);

		initEEnum(operationtypeEEnum, rebel_core.OPERATIONTYPE.class, "OPERATIONTYPE");
		addEEnumLiteral(operationtypeEEnum, rebel_core.OPERATIONTYPE.FEAT);
		addEEnumLiteral(operationtypeEEnum, rebel_core.OPERATIONTYPE.FIX);
		addEEnumLiteral(operationtypeEEnum, rebel_core.OPERATIONTYPE.REFACTOR);
		addEEnumLiteral(operationtypeEEnum, rebel_core.OPERATIONTYPE.MODELS);
		addEEnumLiteral(operationtypeEEnum, rebel_core.OPERATIONTYPE.DOCS);

		initEEnum(relationtypeEEnum, rebel_core.RELATIONTYPE.class, "RELATIONTYPE");
		addEEnumLiteral(relationtypeEEnum, rebel_core.RELATIONTYPE.NONE);
		addEEnumLiteral(relationtypeEEnum, rebel_core.RELATIONTYPE.REALIZATION);
		addEEnumLiteral(relationtypeEEnum, rebel_core.RELATIONTYPE.INFLUENCE);
		addEEnumLiteral(relationtypeEEnum, rebel_core.RELATIONTYPE.AGGREGATION);
		addEEnumLiteral(relationtypeEEnum, rebel_core.RELATIONTYPE.TRIGGERING);
		addEEnumLiteral(relationtypeEEnum, rebel_core.RELATIONTYPE.SERVING);
		addEEnumLiteral(relationtypeEEnum, rebel_core.RELATIONTYPE.ACCESS);
		addEEnumLiteral(relationtypeEEnum, rebel_core.RELATIONTYPE.COMPOSITION);
		addEEnumLiteral(relationtypeEEnum, rebel_core.RELATIONTYPE.ASSOCIATION);

		initEEnum(elementtypeEEnum, rebel_core.ELEMENTTYPE.class, "ELEMENTTYPE");
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.NONE);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.BUSINESS_SERVICE);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.APPLICATION_SERVICE);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.DEVICE);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.ASSESSMENT);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.APPLICATION_COMPONENT);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.BUSINESS_PROCESS);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.APPLICATION_COLLABORATION);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.DATAOBJECT);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.MOTIVATION_STAKEHOLDER);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.MOTIVATION_DRIVER);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.MOTIVATION_GOAL);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.MOTIVATION_OUTCOME);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.MOTIVATION_REQUIREMENT);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.BUSINESS_COLLABORATION);
		addEEnumLiteral(elementtypeEEnum, rebel_core.ELEMENTTYPE.APPLICATION_INTERFACE);

		// Create resource
		createResource(eNS_URI);
	}

} //Rebel_corePackageImpl
