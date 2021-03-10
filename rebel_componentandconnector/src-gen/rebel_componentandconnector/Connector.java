/**
 */
package rebel_componentandconnector;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_componentandconnector.Connector#getName <em>Name</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getNotification <em>Notification</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getBuffering <em>Buffering</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getProps <em>Props</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getRoles <em>Roles</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getId <em>Id</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getPosX <em>Pos X</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link rebel_componentandconnector.Connector#getSync <em>Sync</em>}</li>
 * </ul>
 *
 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_componentandconnector.DeliveryModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery</em>' attribute.
	 * @see rebel_componentandconnector.DeliveryModel
	 * @see #setDelivery(DeliveryModel)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_Delivery()
	 * @model
	 * @generated
	 */
	DeliveryModel getDelivery();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getDelivery <em>Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery</em>' attribute.
	 * @see rebel_componentandconnector.DeliveryModel
	 * @see #getDelivery()
	 * @generated
	 */
	void setDelivery(DeliveryModel value);

	/**
	 * Returns the value of the '<em><b>Sync</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_componentandconnector.SyncType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync</em>' attribute.
	 * @see rebel_componentandconnector.SyncType
	 * @see #setSync(SyncType)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_Sync()
	 * @model
	 * @generated
	 */
	SyncType getSync();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getSync <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync</em>' attribute.
	 * @see rebel_componentandconnector.SyncType
	 * @see #getSync()
	 * @generated
	 */
	void setSync(SyncType value);

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_componentandconnector.NotificationModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' attribute.
	 * @see rebel_componentandconnector.NotificationModel
	 * @see #setNotification(NotificationModel)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_Notification()
	 * @model
	 * @generated
	 */
	NotificationModel getNotification();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getNotification <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' attribute.
	 * @see rebel_componentandconnector.NotificationModel
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(NotificationModel value);

	/**
	 * Returns the value of the '<em><b>Buffering</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_componentandconnector.Buffering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffering</em>' attribute.
	 * @see rebel_componentandconnector.Buffering
	 * @see #setBuffering(Buffering)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_Buffering()
	 * @model
	 * @generated
	 */
	Buffering getBuffering();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getBuffering <em>Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffering</em>' attribute.
	 * @see rebel_componentandconnector.Buffering
	 * @see #getBuffering()
	 * @generated
	 */
	void setBuffering(Buffering value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_componentandconnector.Throughput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see rebel_componentandconnector.Throughput
	 * @see #setThroughput(Throughput)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_Throughput()
	 * @model
	 * @generated
	 */
	Throughput getThroughput();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see rebel_componentandconnector.Throughput
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(Throughput value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' attribute.
	 * @see #setProps(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_Props()
	 * @model
	 * @generated
	 */
	String getProps();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getProps <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props</em>' attribute.
	 * @see #getProps()
	 * @generated
	 */
	void setProps(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_componentandconnector.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_Roles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos X</em>' attribute.
	 * @see #setPosX(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_PosX()
	 * @model
	 * @generated
	 */
	String getPosX();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getPosX <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos X</em>' attribute.
	 * @see #getPosX()
	 * @generated
	 */
	void setPosX(String value);

	/**
	 * Returns the value of the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Y</em>' attribute.
	 * @see #setPosY(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getConnector_PosY()
	 * @model
	 * @generated
	 */
	String getPosY();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Connector#getPosY <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Y</em>' attribute.
	 * @see #getPosY()
	 * @generated
	 */
	void setPosY(String value);

} // Connector
