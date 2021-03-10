/**
 */
package rebel_componentandconnector;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_componentandconnector.FunctionalView#getComponents <em>Components</em>}</li>
 *   <li>{@link rebel_componentandconnector.FunctionalView#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link rebel_componentandconnector.FunctionalView#getName <em>Name</em>}</li>
 *   <li>{@link rebel_componentandconnector.FunctionalView#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getFunctionalView()
 * @model
 * @generated
 */
public interface FunctionalView extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_componentandconnector.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getFunctionalView_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_componentandconnector.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getFunctionalView_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getFunctionalView_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.FunctionalView#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getFunctionalView_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.FunctionalView#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // FunctionalView
