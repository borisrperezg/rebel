/**
 */
package rebel_componentandconnector;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_componentandconnector.Role#getType <em>Type</em>}</li>
 *   <li>{@link rebel_componentandconnector.Role#getName <em>Name</em>}</li>
 *   <li>{@link rebel_componentandconnector.Role#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_componentandconnector.RoleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see rebel_componentandconnector.RoleType
	 * @see #setType(RoleType)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getRole_Type()
	 * @model
	 * @generated
	 */
	RoleType getType();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Role#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rebel_componentandconnector.RoleType
	 * @see #getType()
	 * @generated
	 */
	void setType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getRole_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getRole_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Role#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

} // Role
