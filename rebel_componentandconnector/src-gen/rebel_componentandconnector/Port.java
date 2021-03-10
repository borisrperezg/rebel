/**
 */
package rebel_componentandconnector;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_componentandconnector.Port#getName <em>Name</em>}</li>
 *   <li>{@link rebel_componentandconnector.Port#getType <em>Type</em>}</li>
 *   <li>{@link rebel_componentandconnector.Port#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_componentandconnector.PortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see rebel_componentandconnector.PortType
	 * @see #setType(PortType)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getPort_Type()
	 * @model
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rebel_componentandconnector.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getPort_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Port#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Port
