/**
 */
package rebel_componentandconnector;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_componentandconnector.Project#getName <em>Name</em>}</li>
 *   <li>{@link rebel_componentandconnector.Project#getFunctionalviews <em>Functionalviews</em>}</li>
 *   <li>{@link rebel_componentandconnector.Project#getModelingDate <em>Modeling Date</em>}</li>
 * </ul>
 *
 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Functionalviews</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_componentandconnector.FunctionalView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionalviews</em>' containment reference list.
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getProject_Functionalviews()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalView> getFunctionalviews();

	/**
	 * Returns the value of the '<em><b>Modeling Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Date</em>' attribute.
	 * @see #setModelingDate(Date)
	 * @see rebel_componentandconnector.Rebel_componentandconnectorPackage#getProject_ModelingDate()
	 * @model
	 * @generated
	 */
	Date getModelingDate();

	/**
	 * Sets the value of the '{@link rebel_componentandconnector.Project#getModelingDate <em>Modeling Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Date</em>' attribute.
	 * @see #getModelingDate()
	 * @generated
	 */
	void setModelingDate(Date value);

} // Project
