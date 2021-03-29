/**
 */
package rebel_archimate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rebel_archimate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rebel_archimateFactoryImpl extends EFactoryImpl implements Rebel_archimateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rebel_archimateFactory init() {
		try {
			Rebel_archimateFactory theRebel_archimateFactory = (Rebel_archimateFactory) EPackage.Registry.INSTANCE
					.getEFactory(Rebel_archimatePackage.eNS_URI);
			if (theRebel_archimateFactory != null) {
				return theRebel_archimateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Rebel_archimateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rebel_archimateFactoryImpl() {
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
		case Rebel_archimatePackage.PROJECT:
			return createProject();
		case Rebel_archimatePackage.VIEW:
			return createView();
		case Rebel_archimatePackage.ELEMENT:
			return createElement();
		case Rebel_archimatePackage.RELATION:
			return createRelation();
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
		case Rebel_archimatePackage.RELATIONTYPE:
			return createRELATIONTYPEFromString(eDataType, initialValue);
		case Rebel_archimatePackage.ELEMENTTYPE:
			return createELEMENTTYPEFromString(eDataType, initialValue);
		case Rebel_archimatePackage.SYNC_TYPE:
			return createSyncTypeFromString(eDataType, initialValue);
		case Rebel_archimatePackage.BUFFERING:
			return createBufferingFromString(eDataType, initialValue);
		case Rebel_archimatePackage.DELIVERY_MODEL:
			return createDeliveryModelFromString(eDataType, initialValue);
		case Rebel_archimatePackage.THROUGHPUT:
			return createThroughputFromString(eDataType, initialValue);
		case Rebel_archimatePackage.NOTIFICATION_MODEL:
			return createNotificationModelFromString(eDataType, initialValue);
		case Rebel_archimatePackage.APPLICATIONSERVICETYPE:
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
		case Rebel_archimatePackage.RELATIONTYPE:
			return convertRELATIONTYPEToString(eDataType, instanceValue);
		case Rebel_archimatePackage.ELEMENTTYPE:
			return convertELEMENTTYPEToString(eDataType, instanceValue);
		case Rebel_archimatePackage.SYNC_TYPE:
			return convertSyncTypeToString(eDataType, instanceValue);
		case Rebel_archimatePackage.BUFFERING:
			return convertBufferingToString(eDataType, instanceValue);
		case Rebel_archimatePackage.DELIVERY_MODEL:
			return convertDeliveryModelToString(eDataType, instanceValue);
		case Rebel_archimatePackage.THROUGHPUT:
			return convertThroughputToString(eDataType, instanceValue);
		case Rebel_archimatePackage.NOTIFICATION_MODEL:
			return convertNotificationModelToString(eDataType, instanceValue);
		case Rebel_archimatePackage.APPLICATIONSERVICETYPE:
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
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
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
	public Rebel_archimatePackage getRebel_archimatePackage() {
		return (Rebel_archimatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Rebel_archimatePackage getPackage() {
		return Rebel_archimatePackage.eINSTANCE;
	}

} //Rebel_archimateFactoryImpl
