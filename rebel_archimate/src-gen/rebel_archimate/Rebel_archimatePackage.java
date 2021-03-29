/**
 */
package rebel_archimate;

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
 * @see rebel_archimate.Rebel_archimateFactory
 * @model kind="package"
 * @generated
 */
public interface Rebel_archimatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rebel_archimate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rebel_archimate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rebel_archimate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rebel_archimatePackage eINSTANCE = rebel_archimate.impl.Rebel_archimatePackageImpl.init();

	/**
	 * The meta object id for the '{@link rebel_archimate.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.impl.ProjectImpl
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 1;

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
	 * The meta object id for the '{@link rebel_archimate.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.impl.ViewImpl
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__RELATION = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DATE = 4;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_archimate.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.impl.ElementImpl
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

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
	 * The feature id for the '<em><b>Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SYNC = 8;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DELIVERY = 9;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NOTIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BUFFERING = 11;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__THROUGHPUT = 12;

	/**
	 * The feature id for the '<em><b>Application Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__APPLICATION_SERVICE_TYPE = 13;

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
	 * The meta object id for the '{@link rebel_archimate.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.impl.RelationImpl
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 3;

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
	 * The meta object id for the '{@link rebel_archimate.RELATIONTYPE <em>RELATIONTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.RELATIONTYPE
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getRELATIONTYPE()
	 * @generated
	 */
	int RELATIONTYPE = 4;

	/**
	 * The meta object id for the '{@link rebel_archimate.ELEMENTTYPE <em>ELEMENTTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.ELEMENTTYPE
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getELEMENTTYPE()
	 * @generated
	 */
	int ELEMENTTYPE = 5;

	/**
	 * The meta object id for the '{@link rebel_archimate.SyncType <em>Sync Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.SyncType
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getSyncType()
	 * @generated
	 */
	int SYNC_TYPE = 6;

	/**
	 * The meta object id for the '{@link rebel_archimate.Buffering <em>Buffering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.Buffering
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getBuffering()
	 * @generated
	 */
	int BUFFERING = 7;

	/**
	 * The meta object id for the '{@link rebel_archimate.DeliveryModel <em>Delivery Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.DeliveryModel
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getDeliveryModel()
	 * @generated
	 */
	int DELIVERY_MODEL = 8;

	/**
	 * The meta object id for the '{@link rebel_archimate.Throughput <em>Throughput</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.Throughput
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getThroughput()
	 * @generated
	 */
	int THROUGHPUT = 9;

	/**
	 * The meta object id for the '{@link rebel_archimate.NotificationModel <em>Notification Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.NotificationModel
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getNotificationModel()
	 * @generated
	 */
	int NOTIFICATION_MODEL = 10;

	/**
	 * The meta object id for the '{@link rebel_archimate.APPLICATIONSERVICETYPE <em>APPLICATIONSERVICETYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_archimate.APPLICATIONSERVICETYPE
	 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getAPPLICATIONSERVICETYPE()
	 * @generated
	 */
	int APPLICATIONSERVICETYPE = 11;

	/**
	 * Returns the meta object for class '{@link rebel_archimate.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see rebel_archimate.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_archimate.Project#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see rebel_archimate.Project#getView()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_View();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_archimate.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Project#getModelingDate <em>Modeling Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modeling Date</em>'.
	 * @see rebel_archimate.Project#getModelingDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ModelingDate();

	/**
	 * Returns the meta object for class '{@link rebel_archimate.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see rebel_archimate.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_archimate.View#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see rebel_archimate.View#getRelation()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_archimate.View#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see rebel_archimate.View#getElement()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Element();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_archimate.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.View#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_archimate.View#getId()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.View#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see rebel_archimate.View#getDate()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Date();

	/**
	 * Returns the meta object for class '{@link rebel_archimate.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see rebel_archimate.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_archimate.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_archimate.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see rebel_archimate.Element#getPosX()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_PosX();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see rebel_archimate.Element#getPosY()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_PosY();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see rebel_archimate.Element#getWidth()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see rebel_archimate.Element#getHeight()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Height();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_archimate.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#isGrouper <em>Grouper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouper</em>'.
	 * @see rebel_archimate.Element#isGrouper()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Grouper();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getSync <em>Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync</em>'.
	 * @see rebel_archimate.Element#getSync()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Sync();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery</em>'.
	 * @see rebel_archimate.Element#getDelivery()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Delivery();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification</em>'.
	 * @see rebel_archimate.Element#getNotification()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Notification();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getBuffering <em>Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffering</em>'.
	 * @see rebel_archimate.Element#getBuffering()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Buffering();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see rebel_archimate.Element#getThroughput()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Element#getApplicationServiceType <em>Application Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Service Type</em>'.
	 * @see rebel_archimate.Element#getApplicationServiceType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ApplicationServiceType();

	/**
	 * Returns the meta object for class '{@link rebel_archimate.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see rebel_archimate.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link rebel_archimate.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rebel_archimate.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link rebel_archimate.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rebel_archimate.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Relation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see rebel_archimate.Relation#getId()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Id();

	/**
	 * Returns the meta object for the attribute '{@link rebel_archimate.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_archimate.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Type();

	/**
	 * Returns the meta object for enum '{@link rebel_archimate.RELATIONTYPE <em>RELATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RELATIONTYPE</em>'.
	 * @see rebel_archimate.RELATIONTYPE
	 * @generated
	 */
	EEnum getRELATIONTYPE();

	/**
	 * Returns the meta object for enum '{@link rebel_archimate.ELEMENTTYPE <em>ELEMENTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ELEMENTTYPE</em>'.
	 * @see rebel_archimate.ELEMENTTYPE
	 * @generated
	 */
	EEnum getELEMENTTYPE();

	/**
	 * Returns the meta object for enum '{@link rebel_archimate.SyncType <em>Sync Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sync Type</em>'.
	 * @see rebel_archimate.SyncType
	 * @generated
	 */
	EEnum getSyncType();

	/**
	 * Returns the meta object for enum '{@link rebel_archimate.Buffering <em>Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Buffering</em>'.
	 * @see rebel_archimate.Buffering
	 * @generated
	 */
	EEnum getBuffering();

	/**
	 * Returns the meta object for enum '{@link rebel_archimate.DeliveryModel <em>Delivery Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Delivery Model</em>'.
	 * @see rebel_archimate.DeliveryModel
	 * @generated
	 */
	EEnum getDeliveryModel();

	/**
	 * Returns the meta object for enum '{@link rebel_archimate.Throughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throughput</em>'.
	 * @see rebel_archimate.Throughput
	 * @generated
	 */
	EEnum getThroughput();

	/**
	 * Returns the meta object for enum '{@link rebel_archimate.NotificationModel <em>Notification Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Model</em>'.
	 * @see rebel_archimate.NotificationModel
	 * @generated
	 */
	EEnum getNotificationModel();

	/**
	 * Returns the meta object for enum '{@link rebel_archimate.APPLICATIONSERVICETYPE <em>APPLICATIONSERVICETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>APPLICATIONSERVICETYPE</em>'.
	 * @see rebel_archimate.APPLICATIONSERVICETYPE
	 * @generated
	 */
	EEnum getAPPLICATIONSERVICETYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Rebel_archimateFactory getRebel_archimateFactory();

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
		 * The meta object literal for the '{@link rebel_archimate.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.impl.ProjectImpl
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__VIEW = eINSTANCE.getProject_View();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Modeling Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__MODELING_DATE = eINSTANCE.getProject_ModelingDate();

		/**
		 * The meta object literal for the '{@link rebel_archimate.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.impl.ViewImpl
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__RELATION = eINSTANCE.getView_Relation();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__ELEMENT = eINSTANCE.getView_Element();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ID = eINSTANCE.getView_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__DATE = eINSTANCE.getView_Date();

		/**
		 * The meta object literal for the '{@link rebel_archimate.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.impl.ElementImpl
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getElement()
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
		 * The meta object literal for the '<em><b>Application Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__APPLICATION_SERVICE_TYPE = eINSTANCE.getElement_ApplicationServiceType();

		/**
		 * The meta object literal for the '{@link rebel_archimate.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.impl.RelationImpl
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getRelation()
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
		 * The meta object literal for the '{@link rebel_archimate.RELATIONTYPE <em>RELATIONTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.RELATIONTYPE
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getRELATIONTYPE()
		 * @generated
		 */
		EEnum RELATIONTYPE = eINSTANCE.getRELATIONTYPE();

		/**
		 * The meta object literal for the '{@link rebel_archimate.ELEMENTTYPE <em>ELEMENTTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.ELEMENTTYPE
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getELEMENTTYPE()
		 * @generated
		 */
		EEnum ELEMENTTYPE = eINSTANCE.getELEMENTTYPE();

		/**
		 * The meta object literal for the '{@link rebel_archimate.SyncType <em>Sync Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.SyncType
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getSyncType()
		 * @generated
		 */
		EEnum SYNC_TYPE = eINSTANCE.getSyncType();

		/**
		 * The meta object literal for the '{@link rebel_archimate.Buffering <em>Buffering</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.Buffering
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getBuffering()
		 * @generated
		 */
		EEnum BUFFERING = eINSTANCE.getBuffering();

		/**
		 * The meta object literal for the '{@link rebel_archimate.DeliveryModel <em>Delivery Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.DeliveryModel
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getDeliveryModel()
		 * @generated
		 */
		EEnum DELIVERY_MODEL = eINSTANCE.getDeliveryModel();

		/**
		 * The meta object literal for the '{@link rebel_archimate.Throughput <em>Throughput</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.Throughput
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getThroughput()
		 * @generated
		 */
		EEnum THROUGHPUT = eINSTANCE.getThroughput();

		/**
		 * The meta object literal for the '{@link rebel_archimate.NotificationModel <em>Notification Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.NotificationModel
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getNotificationModel()
		 * @generated
		 */
		EEnum NOTIFICATION_MODEL = eINSTANCE.getNotificationModel();

		/**
		 * The meta object literal for the '{@link rebel_archimate.APPLICATIONSERVICETYPE <em>APPLICATIONSERVICETYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_archimate.APPLICATIONSERVICETYPE
		 * @see rebel_archimate.impl.Rebel_archimatePackageImpl#getAPPLICATIONSERVICETYPE()
		 * @generated
		 */
		EEnum APPLICATIONSERVICETYPE = eINSTANCE.getAPPLICATIONSERVICETYPE();

	}

} //Rebel_archimatePackage
