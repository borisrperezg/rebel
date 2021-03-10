/**
 */
package rebel_chatlogs;

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
 * @see rebel_chatlogs.Rebel_chatlogsFactory
 * @model kind="package"
 * @generated
 */
public interface Rebel_chatlogsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rebel_chatlogs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uniandes/rebel_chatlogs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rebel_chatlogs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rebel_chatlogsPackage eINSTANCE = rebel_chatlogs.impl.Rebel_chatlogsPackageImpl.init();

	/**
	 * The meta object id for the '{@link rebel_chatlogs.impl.MessageLogImpl <em>Message Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_chatlogs.impl.MessageLogImpl
	 * @see rebel_chatlogs.impl.Rebel_chatlogsPackageImpl#getMessageLog()
	 * @generated
	 */
	int MESSAGE_LOG = 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOG__MESSAGES = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOG__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOG__CREATION = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOG__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Message Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Message Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_chatlogs.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_chatlogs.impl.MessageImpl
	 * @see rebel_chatlogs.impl.Rebel_chatlogsPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Sent By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SENT_BY = 2;

	/**
	 * The feature id for the '<em><b>Received By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVED_BY = 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_chatlogs.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_chatlogs.impl.ProjectImpl
	 * @see rebel_chatlogs.impl.Rebel_chatlogsPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Messagelogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MESSAGELOGS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rebel_chatlogs.MessageLogType <em>Message Log Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rebel_chatlogs.MessageLogType
	 * @see rebel_chatlogs.impl.Rebel_chatlogsPackageImpl#getMessageLogType()
	 * @generated
	 */
	int MESSAGE_LOG_TYPE = 3;

	/**
	 * Returns the meta object for class '{@link rebel_chatlogs.MessageLog <em>Message Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Log</em>'.
	 * @see rebel_chatlogs.MessageLog
	 * @generated
	 */
	EClass getMessageLog();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_chatlogs.MessageLog#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see rebel_chatlogs.MessageLog#getMessages()
	 * @see #getMessageLog()
	 * @generated
	 */
	EReference getMessageLog_Messages();

	/**
	 * Returns the meta object for the attribute '{@link rebel_chatlogs.MessageLog#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rebel_chatlogs.MessageLog#getType()
	 * @see #getMessageLog()
	 * @generated
	 */
	EAttribute getMessageLog_Type();

	/**
	 * Returns the meta object for the attribute '{@link rebel_chatlogs.MessageLog#getCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation</em>'.
	 * @see rebel_chatlogs.MessageLog#getCreation()
	 * @see #getMessageLog()
	 * @generated
	 */
	EAttribute getMessageLog_Creation();

	/**
	 * Returns the meta object for the attribute '{@link rebel_chatlogs.MessageLog#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see rebel_chatlogs.MessageLog#getTitle()
	 * @see #getMessageLog()
	 * @generated
	 */
	EAttribute getMessageLog_Title();

	/**
	 * Returns the meta object for class '{@link rebel_chatlogs.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see rebel_chatlogs.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link rebel_chatlogs.Message#getReceivedBy <em>Received By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received By</em>'.
	 * @see rebel_chatlogs.Message#getReceivedBy()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_ReceivedBy();

	/**
	 * Returns the meta object for the attribute '{@link rebel_chatlogs.Message#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see rebel_chatlogs.Message#getText()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Text();

	/**
	 * Returns the meta object for the attribute '{@link rebel_chatlogs.Message#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see rebel_chatlogs.Message#getTimestamp()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link rebel_chatlogs.Message#getSentBy <em>Sent By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sent By</em>'.
	 * @see rebel_chatlogs.Message#getSentBy()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_SentBy();

	/**
	 * Returns the meta object for class '{@link rebel_chatlogs.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see rebel_chatlogs.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link rebel_chatlogs.Project#getMessagelogs <em>Messagelogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messagelogs</em>'.
	 * @see rebel_chatlogs.Project#getMessagelogs()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Messagelogs();

	/**
	 * Returns the meta object for the attribute '{@link rebel_chatlogs.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rebel_chatlogs.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for enum '{@link rebel_chatlogs.MessageLogType <em>Message Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Log Type</em>'.
	 * @see rebel_chatlogs.MessageLogType
	 * @generated
	 */
	EEnum getMessageLogType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Rebel_chatlogsFactory getRebel_chatlogsFactory();

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
		 * The meta object literal for the '{@link rebel_chatlogs.impl.MessageLogImpl <em>Message Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_chatlogs.impl.MessageLogImpl
		 * @see rebel_chatlogs.impl.Rebel_chatlogsPackageImpl#getMessageLog()
		 * @generated
		 */
		EClass MESSAGE_LOG = eINSTANCE.getMessageLog();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_LOG__MESSAGES = eINSTANCE.getMessageLog_Messages();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LOG__TYPE = eINSTANCE.getMessageLog_Type();

		/**
		 * The meta object literal for the '<em><b>Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LOG__CREATION = eINSTANCE.getMessageLog_Creation();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LOG__TITLE = eINSTANCE.getMessageLog_Title();

		/**
		 * The meta object literal for the '{@link rebel_chatlogs.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_chatlogs.impl.MessageImpl
		 * @see rebel_chatlogs.impl.Rebel_chatlogsPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Received By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__RECEIVED_BY = eINSTANCE.getMessage_ReceivedBy();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TEXT = eINSTANCE.getMessage_Text();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TIMESTAMP = eINSTANCE.getMessage_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Sent By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__SENT_BY = eINSTANCE.getMessage_SentBy();

		/**
		 * The meta object literal for the '{@link rebel_chatlogs.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_chatlogs.impl.ProjectImpl
		 * @see rebel_chatlogs.impl.Rebel_chatlogsPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Messagelogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MESSAGELOGS = eINSTANCE.getProject_Messagelogs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '{@link rebel_chatlogs.MessageLogType <em>Message Log Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rebel_chatlogs.MessageLogType
		 * @see rebel_chatlogs.impl.Rebel_chatlogsPackageImpl#getMessageLogType()
		 * @generated
		 */
		EEnum MESSAGE_LOG_TYPE = eINSTANCE.getMessageLogType();

	}

} //Rebel_chatlogsPackage
