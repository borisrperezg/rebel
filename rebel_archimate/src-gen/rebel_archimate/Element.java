/**
 */
package rebel_archimate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_archimate.Element#getId <em>Id</em>}</li>
 *   <li>{@link rebel_archimate.Element#getName <em>Name</em>}</li>
 *   <li>{@link rebel_archimate.Element#getPosX <em>Pos X</em>}</li>
 *   <li>{@link rebel_archimate.Element#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link rebel_archimate.Element#getWidth <em>Width</em>}</li>
 *   <li>{@link rebel_archimate.Element#getHeight <em>Height</em>}</li>
 *   <li>{@link rebel_archimate.Element#getType <em>Type</em>}</li>
 *   <li>{@link rebel_archimate.Element#isGrouper <em>Grouper</em>}</li>
 *   <li>{@link rebel_archimate.Element#getSync <em>Sync</em>}</li>
 *   <li>{@link rebel_archimate.Element#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link rebel_archimate.Element#getNotification <em>Notification</em>}</li>
 *   <li>{@link rebel_archimate.Element#getBuffering <em>Buffering</em>}</li>
 *   <li>{@link rebel_archimate.Element#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link rebel_archimate.Element#getApplicationServiceType <em>Application Service Type</em>}</li>
 * </ul>
 *
 * @see rebel_archimate.Rebel_archimatePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos X</em>' attribute.
	 * @see #setPosX(int)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_PosX()
	 * @model
	 * @generated
	 */
	int getPosX();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getPosX <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos X</em>' attribute.
	 * @see #getPosX()
	 * @generated
	 */
	void setPosX(int value);

	/**
	 * Returns the value of the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Y</em>' attribute.
	 * @see #setPosY(int)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_PosY()
	 * @model
	 * @generated
	 */
	int getPosY();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getPosY <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Y</em>' attribute.
	 * @see #getPosY()
	 * @generated
	 */
	void setPosY(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_archimate.ELEMENTTYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see rebel_archimate.ELEMENTTYPE
	 * @see #setType(ELEMENTTYPE)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Type()
	 * @model
	 * @generated
	 */
	ELEMENTTYPE getType();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rebel_archimate.ELEMENTTYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(ELEMENTTYPE value);

	/**
	 * Returns the value of the '<em><b>Grouper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouper</em>' attribute.
	 * @see #setGrouper(boolean)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Grouper()
	 * @model
	 * @generated
	 */
	boolean isGrouper();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#isGrouper <em>Grouper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouper</em>' attribute.
	 * @see #isGrouper()
	 * @generated
	 */
	void setGrouper(boolean value);

	/**
	 * Returns the value of the '<em><b>Sync</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_archimate.SyncType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync</em>' attribute.
	 * @see rebel_archimate.SyncType
	 * @see #setSync(SyncType)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Sync()
	 * @model
	 * @generated
	 */
	SyncType getSync();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getSync <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync</em>' attribute.
	 * @see rebel_archimate.SyncType
	 * @see #getSync()
	 * @generated
	 */
	void setSync(SyncType value);

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_archimate.DeliveryModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery</em>' attribute.
	 * @see rebel_archimate.DeliveryModel
	 * @see #setDelivery(DeliveryModel)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Delivery()
	 * @model
	 * @generated
	 */
	DeliveryModel getDelivery();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getDelivery <em>Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery</em>' attribute.
	 * @see rebel_archimate.DeliveryModel
	 * @see #getDelivery()
	 * @generated
	 */
	void setDelivery(DeliveryModel value);

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_archimate.NotificationModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' attribute.
	 * @see rebel_archimate.NotificationModel
	 * @see #setNotification(NotificationModel)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Notification()
	 * @model
	 * @generated
	 */
	NotificationModel getNotification();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getNotification <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' attribute.
	 * @see rebel_archimate.NotificationModel
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(NotificationModel value);

	/**
	 * Returns the value of the '<em><b>Buffering</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_archimate.Buffering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffering</em>' attribute.
	 * @see rebel_archimate.Buffering
	 * @see #setBuffering(Buffering)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Buffering()
	 * @model
	 * @generated
	 */
	Buffering getBuffering();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getBuffering <em>Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffering</em>' attribute.
	 * @see rebel_archimate.Buffering
	 * @see #getBuffering()
	 * @generated
	 */
	void setBuffering(Buffering value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_archimate.Throughput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see rebel_archimate.Throughput
	 * @see #setThroughput(Throughput)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_Throughput()
	 * @model
	 * @generated
	 */
	Throughput getThroughput();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see rebel_archimate.Throughput
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(Throughput value);

	/**
	 * Returns the value of the '<em><b>Application Service Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_archimate.APPLICATIONSERVICETYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Service Type</em>' attribute.
	 * @see rebel_archimate.APPLICATIONSERVICETYPE
	 * @see #setApplicationServiceType(APPLICATIONSERVICETYPE)
	 * @see rebel_archimate.Rebel_archimatePackage#getElement_ApplicationServiceType()
	 * @model
	 * @generated
	 */
	APPLICATIONSERVICETYPE getApplicationServiceType();

	/**
	 * Sets the value of the '{@link rebel_archimate.Element#getApplicationServiceType <em>Application Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Service Type</em>' attribute.
	 * @see rebel_archimate.APPLICATIONSERVICETYPE
	 * @see #getApplicationServiceType()
	 * @generated
	 */
	void setApplicationServiceType(APPLICATIONSERVICETYPE value);

} // Element
