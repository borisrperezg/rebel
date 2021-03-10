/**
 */
package rebel_core;

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
 *   <li>{@link rebel_core.Project#getBlockofinterest <em>Blockofinterest</em>}</li>
 *   <li>{@link rebel_core.Project#getId <em>Id</em>}</li>
 *   <li>{@link rebel_core.Project#getName <em>Name</em>}</li>
 *   <li>{@link rebel_core.Project#getFunctionalviews <em>Functionalviews</em>}</li>
 *   <li>{@link rebel_core.Project#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link rebel_core.Project#getMessage <em>Message</em>}</li>
 *   <li>{@link rebel_core.Project#getPerson <em>Person</em>}</li>
 *   <li>{@link rebel_core.Project#getModelingDate <em>Modeling Date</em>}</li>
 *   <li>{@link rebel_core.Project#getView <em>View</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Blockofinterest</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.BlockOfInterest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockofinterest</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getProject_Blockofinterest()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockOfInterest> getBlockofinterest();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see rebel_core.Rebel_corePackage#getProject_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link rebel_core.Project#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_core.Rebel_corePackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_core.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Functionalviews</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.FunctionalView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionalviews</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getProject_Functionalviews()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalView> getFunctionalviews();

	/**
	 * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.Decision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisions</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getProject_Decisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decision> getDecisions();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getProject_Message()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getProject_Person()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Modeling Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Date</em>' attribute.
	 * @see #setModelingDate(Date)
	 * @see rebel_core.Rebel_corePackage#getProject_ModelingDate()
	 * @model
	 * @generated
	 */
	Date getModelingDate();

	/**
	 * Sets the value of the '{@link rebel_core.Project#getModelingDate <em>Modeling Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Date</em>' attribute.
	 * @see #getModelingDate()
	 * @generated
	 */
	void setModelingDate(Date value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.ArchimateView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getProject_View()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchimateView> getView();

} // Project
