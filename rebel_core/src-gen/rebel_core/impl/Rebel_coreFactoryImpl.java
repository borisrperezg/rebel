/**
 */
package rebel_core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rebel_core.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rebel_coreFactoryImpl extends EFactoryImpl implements Rebel_coreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rebel_coreFactory init() {
		try {
			Rebel_coreFactory theRebel_coreFactory = (Rebel_coreFactory) EPackage.Registry.INSTANCE
					.getEFactory(Rebel_corePackage.eNS_URI);
			if (theRebel_coreFactory != null) {
				return theRebel_coreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Rebel_coreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rebel_coreFactoryImpl() {
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
		case Rebel_corePackage.FACT:
			return createFact();
		case Rebel_corePackage.PROJECT:
			return createProject();
		case Rebel_corePackage.BLOCK_OF_INTEREST:
			return createBlockOfInterest();
		case Rebel_corePackage.FUNCTIONAL_VIEW:
			return createFunctionalView();
		case Rebel_corePackage.CONNECTOR:
			return createConnector();
		case Rebel_corePackage.COMPONENT:
			return createComponent();
		case Rebel_corePackage.PORT:
			return createPort();
		case Rebel_corePackage.ROLE:
			return createRole();
		case Rebel_corePackage.ADAPTOR:
			return createAdaptor();
		case Rebel_corePackage.DISTRIBUTOR:
			return createDistributor();
		case Rebel_corePackage.STREAM:
			return createStream();
		case Rebel_corePackage.PROCEDURE_CALL:
			return createProcedureCall();
		case Rebel_corePackage.ARBITRATOR:
			return createArbitrator();
		case Rebel_corePackage.EVENT:
			return createEvent();
		case Rebel_corePackage.DECISION:
			return createDecision();
		case Rebel_corePackage.ASSUMPTION:
			return createAssumption();
		case Rebel_corePackage.USER_STORY:
			return createUserStory();
		case Rebel_corePackage.CONSEQUENCE:
			return createConsequence();
		case Rebel_corePackage.MOTIVATOR:
			return createMotivator();
		case Rebel_corePackage.ALTERNATIVE:
			return createAlternative();
		case Rebel_corePackage.COMMIT_MESSAGE:
			return createCommitMessage();
		case Rebel_corePackage.PERSON:
			return createPerson();
		case Rebel_corePackage.RELATION:
			return createRelation();
		case Rebel_corePackage.ELEMENT:
			return createElement();
		case Rebel_corePackage.ARCHIMATE_VIEW:
			return createArchimateView();
		case Rebel_corePackage.ATD_ITEM:
			return createATDItem();
		case Rebel_corePackage.ATD_RATIONALE:
			return createATDRationale();
		case Rebel_corePackage.ATD_BENEFIT:
			return createATDBenefit();
		case Rebel_corePackage.ATD_EFFECT:
			return createATDEffect();
		case Rebel_corePackage.MESSAGE_LOG:
			return createMessageLog();
		case Rebel_corePackage.CHAT_EMAIL_MESSAGE:
			return createChatEmailMessage();
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
		case Rebel_corePackage.ACTION:
			return createActionFromString(eDataType, initialValue);
		case Rebel_corePackage.PORT_TYPE:
			return createPortTypeFromString(eDataType, initialValue);
		case Rebel_corePackage.ROLE_TYPE:
			return createRoleTypeFromString(eDataType, initialValue);
		case Rebel_corePackage.THROUGHPUT:
			return createThroughputFromString(eDataType, initialValue);
		case Rebel_corePackage.NOTIFICATION_MODEL:
			return createNotificationModelFromString(eDataType, initialValue);
		case Rebel_corePackage.BUFFERING:
			return createBufferingFromString(eDataType, initialValue);
		case Rebel_corePackage.DELIVERY_MODEL:
			return createDeliveryModelFromString(eDataType, initialValue);
		case Rebel_corePackage.SYNC_TYPE:
			return createSyncTypeFromString(eDataType, initialValue);
		case Rebel_corePackage.STATE_TYPE:
			return createStateTypeFromString(eDataType, initialValue);
		case Rebel_corePackage.MODEL_ELEMENT_TYPE:
			return createModelElementTypeFromString(eDataType, initialValue);
		case Rebel_corePackage.CONSEQUENCE_TYPE:
			return createConsequenceTypeFromString(eDataType, initialValue);
		case Rebel_corePackage.ACTIONTYPE:
			return createACTIONTYPEFromString(eDataType, initialValue);
		case Rebel_corePackage.OPERATIONTYPE:
			return createOPERATIONTYPEFromString(eDataType, initialValue);
		case Rebel_corePackage.RELATIONTYPE:
			return createRELATIONTYPEFromString(eDataType, initialValue);
		case Rebel_corePackage.ELEMENTTYPE:
			return createELEMENTTYPEFromString(eDataType, initialValue);
		case Rebel_corePackage.MESSAGE_LOG_TYPE:
			return createMessageLogTypeFromString(eDataType, initialValue);
		case Rebel_corePackage.APPLICATIONSERVICETYPE:
			return createAPPLICATIONSERVICETYPEFromString(eDataType, initialValue);
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
		case Rebel_corePackage.ACTION:
			return convertActionToString(eDataType, instanceValue);
		case Rebel_corePackage.PORT_TYPE:
			return convertPortTypeToString(eDataType, instanceValue);
		case Rebel_corePackage.ROLE_TYPE:
			return convertRoleTypeToString(eDataType, instanceValue);
		case Rebel_corePackage.THROUGHPUT:
			return convertThroughputToString(eDataType, instanceValue);
		case Rebel_corePackage.NOTIFICATION_MODEL:
			return convertNotificationModelToString(eDataType, instanceValue);
		case Rebel_corePackage.BUFFERING:
			return convertBufferingToString(eDataType, instanceValue);
		case Rebel_corePackage.DELIVERY_MODEL:
			return convertDeliveryModelToString(eDataType, instanceValue);
		case Rebel_corePackage.SYNC_TYPE:
			return convertSyncTypeToString(eDataType, instanceValue);
		case Rebel_corePackage.STATE_TYPE:
			return convertStateTypeToString(eDataType, instanceValue);
		case Rebel_corePackage.MODEL_ELEMENT_TYPE:
			return convertModelElementTypeToString(eDataType, instanceValue);
		case Rebel_corePackage.CONSEQUENCE_TYPE:
			return convertConsequenceTypeToString(eDataType, instanceValue);
		case Rebel_corePackage.ACTIONTYPE:
			return convertACTIONTYPEToString(eDataType, instanceValue);
		case Rebel_corePackage.OPERATIONTYPE:
			return convertOPERATIONTYPEToString(eDataType, instanceValue);
		case Rebel_corePackage.RELATIONTYPE:
			return convertRELATIONTYPEToString(eDataType, instanceValue);
		case Rebel_corePackage.ELEMENTTYPE:
			return convertELEMENTTYPEToString(eDataType, instanceValue);
		case Rebel_corePackage.MESSAGE_LOG_TYPE:
			return convertMessageLogTypeToString(eDataType, instanceValue);
		case Rebel_corePackage.APPLICATIONSERVICETYPE:
			return convertAPPLICATIONSERVICETYPEToString(eDataType, instanceValue);
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
	public Fact createFact() {
		FactImpl fact = new FactImpl();
		return fact;
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
	public BlockOfInterest createBlockOfInterest() {
		BlockOfInterestImpl blockOfInterest = new BlockOfInterestImpl();
		return blockOfInterest;
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
	public UserStory createUserStory() {
		UserStoryImpl userStory = new UserStoryImpl();
		return userStory;
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
	public CommitMessage createCommitMessage() {
		CommitMessageImpl commitMessage = new CommitMessageImpl();
		return commitMessage;
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
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchimateView createArchimateView() {
		ArchimateViewImpl archimateView = new ArchimateViewImpl();
		return archimateView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATDItem createATDItem() {
		ATDItemImpl atdItem = new ATDItemImpl();
		return atdItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATDRationale createATDRationale() {
		ATDRationaleImpl atdRationale = new ATDRationaleImpl();
		return atdRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATDBenefit createATDBenefit() {
		ATDBenefitImpl atdBenefit = new ATDBenefitImpl();
		return atdBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATDEffect createATDEffect() {
		ATDEffectImpl atdEffect = new ATDEffectImpl();
		return atdEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageLog createMessageLog() {
		MessageLogImpl messageLog = new MessageLogImpl();
		return messageLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChatEmailMessage createChatEmailMessage() {
		ChatEmailMessageImpl chatEmailMessage = new ChatEmailMessageImpl();
		return chatEmailMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createActionFromString(EDataType eDataType, String initialValue) {
		Action result = Action.get(initialValue);
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
	public String convertActionToString(EDataType eDataType, Object instanceValue) {
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
	public ModelElementType createModelElementTypeFromString(EDataType eDataType, String initialValue) {
		ModelElementType result = ModelElementType.get(initialValue);
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
	public String convertModelElementTypeToString(EDataType eDataType, Object instanceValue) {
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
	public ACTIONTYPE createACTIONTYPEFromString(EDataType eDataType, String initialValue) {
		ACTIONTYPE result = ACTIONTYPE.get(initialValue);
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
	public String convertACTIONTYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPERATIONTYPE createOPERATIONTYPEFromString(EDataType eDataType, String initialValue) {
		OPERATIONTYPE result = OPERATIONTYPE.get(initialValue);
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
	public String convertOPERATIONTYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RELATIONTYPE createRELATIONTYPEFromString(EDataType eDataType, String initialValue) {
		RELATIONTYPE result = RELATIONTYPE.get(initialValue);
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
	public String convertRELATIONTYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELEMENTTYPE createELEMENTTYPEFromString(EDataType eDataType, String initialValue) {
		ELEMENTTYPE result = ELEMENTTYPE.get(initialValue);
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
	public String convertELEMENTTYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageLogType createMessageLogTypeFromString(EDataType eDataType, String initialValue) {
		MessageLogType result = MessageLogType.get(initialValue);
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
	public String convertMessageLogTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APPLICATIONSERVICETYPE createAPPLICATIONSERVICETYPEFromString(EDataType eDataType, String initialValue) {
		APPLICATIONSERVICETYPE result = APPLICATIONSERVICETYPE.get(initialValue);
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
	public String convertAPPLICATIONSERVICETYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rebel_corePackage getRebel_corePackage() {
		return (Rebel_corePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Rebel_corePackage getPackage() {
		return Rebel_corePackage.eINSTANCE;
	}

} //Rebel_coreFactoryImpl
