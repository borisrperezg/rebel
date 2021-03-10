/**
 */
package rebel_core;

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
 *   <li>{@link rebel_core.Element#getId <em>Id</em>}</li>
 *   <li>{@link rebel_core.Element#getName <em>Name</em>}</li>
 *   <li>{@link rebel_core.Element#getPosX <em>Pos X</em>}</li>
 *   <li>{@link rebel_core.Element#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link rebel_core.Element#getWidth <em>Width</em>}</li>
 *   <li>{@link rebel_core.Element#getHeight <em>Height</em>}</li>
 *   <li>{@link rebel_core.Element#getType <em>Type</em>}</li>
 *   <li>{@link rebel_core.Element#isGrouper <em>Grouper</em>}</li>
 *   <li>{@link rebel_core.Element#isBoiElement <em>Boi Element</em>}</li>
 *   <li>{@link rebel_core.Element#getSync <em>Sync</em>}</li>
 *   <li>{@link rebel_core.Element#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link rebel_core.Element#getNotification <em>Notification</em>}</li>
 *   <li>{@link rebel_core.Element#getBuffering <em>Buffering</em>}</li>
 *   <li>{@link rebel_core.Element#getThroughput <em>Throughput</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getElement()
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
	 * @see rebel_core.Rebel_corePackage#getElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getId <em>Id</em>}' attribute.
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
	 * @see rebel_core.Rebel_corePackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getName <em>Name</em>}' attribute.
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
	 * @see rebel_core.Rebel_corePackage#getElement_PosX()
	 * @model
	 * @generated
	 */
	int getPosX();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getPosX <em>Pos X</em>}' attribute.
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
	 * @see rebel_core.Rebel_corePackage#getElement_PosY()
	 * @model
	 * @generated
	 */
	int getPosY();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getPosY <em>Pos Y</em>}' attribute.
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
	 * @see rebel_core.Rebel_corePackage#getElement_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getWidth <em>Width</em>}' attribute.
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
	 * @see rebel_core.Rebel_corePackage#getElement_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.ELEMENTTYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see rebel_core.ELEMENTTYPE
	 * @see #setType(ELEMENTTYPE)
	 * @see rebel_core.Rebel_corePackage#getElement_Type()
	 * @model
	 * @generated
	 */
	ELEMENTTYPE getType();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rebel_core.ELEMENTTYPE
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
	 * @see rebel_core.Rebel_corePackage#getElement_Grouper()
	 * @model
	 * @generated
	 */
	boolean isGrouper();

	/**
	 * Sets the value of the '{@link rebel_core.Element#isGrouper <em>Grouper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouper</em>' attribute.
	 * @see #isGrouper()
	 * @generated
	 */
	void setGrouper(boolean value);

	/**
	 * Returns the value of the '<em><b>Boi Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boi Element</em>' attribute.
	 * @see #setBoiElement(boolean)
	 * @see rebel_core.Rebel_corePackage#getElement_BoiElement()
	 * @model
	 * @generated
	 */
	boolean isBoiElement();

	/**
	 * Sets the value of the '{@link rebel_core.Element#isBoiElement <em>Boi Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boi Element</em>' attribute.
	 * @see #isBoiElement()
	 * @generated
	 */
	void setBoiElement(boolean value);

	/**
	 * Returns the value of the '<em><b>Sync</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.SyncType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync</em>' attribute.
	 * @see rebel_core.SyncType
	 * @see #setSync(SyncType)
	 * @see rebel_core.Rebel_corePackage#getElement_Sync()
	 * @model
	 * @generated
	 */
	SyncType getSync();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getSync <em>Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync</em>' attribute.
	 * @see rebel_core.SyncType
	 * @see #getSync()
	 * @generated
	 */
	void setSync(SyncType value);

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.DeliveryModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery</em>' attribute.
	 * @see rebel_core.DeliveryModel
	 * @see #setDelivery(DeliveryModel)
	 * @see rebel_core.Rebel_corePackage#getElement_Delivery()
	 * @model
	 * @generated
	 */
	DeliveryModel getDelivery();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getDelivery <em>Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery</em>' attribute.
	 * @see rebel_core.DeliveryModel
	 * @see #getDelivery()
	 * @generated
	 */
	void setDelivery(DeliveryModel value);

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.NotificationModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' attribute.
	 * @see rebel_core.NotificationModel
	 * @see #setNotification(NotificationModel)
	 * @see rebel_core.Rebel_corePackage#getElement_Notification()
	 * @model
	 * @generated
	 */
	NotificationModel getNotification();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getNotification <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' attribute.
	 * @see rebel_core.NotificationModel
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(NotificationModel value);

	/**
	 * Returns the value of the '<em><b>Buffering</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.Buffering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffering</em>' attribute.
	 * @see rebel_core.Buffering
	 * @see #setBuffering(Buffering)
	 * @see rebel_core.Rebel_corePackage#getElement_Buffering()
	 * @model
	 * @generated
	 */
	Buffering getBuffering();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getBuffering <em>Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffering</em>' attribute.
	 * @see rebel_core.Buffering
	 * @see #getBuffering()
	 * @generated
	 */
	void setBuffering(Buffering value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.Throughput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see rebel_core.Throughput
	 * @see #setThroughput(Throughput)
	 * @see rebel_core.Rebel_corePackage#getElement_Throughput()
	 * @model
	 * @generated
	 */
	Throughput getThroughput();

	/**
	 * Sets the value of the '{@link rebel_core.Element#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see rebel_core.Throughput
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(Throughput value);

} // Element
