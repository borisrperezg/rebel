/**
 */
package rebel_architecturaldecisions;

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
 *   <li>{@link rebel_architecturaldecisions.Project#getResponsibles <em>Responsibles</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Project#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Project#getName <em>Name</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Project#getModelingDate <em>Modeling Date</em>}</li>
 * </ul>
 *
 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Responsibles</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_architecturaldecisions.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibles</em>' containment reference list.
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getProject_Responsibles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getResponsibles();

	/**
	 * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_architecturaldecisions.Decision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisions</em>' containment reference list.
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getProject_Decisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decision> getDecisions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modeling Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Date</em>' attribute.
	 * @see #setModelingDate(Date)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getProject_ModelingDate()
	 * @model
	 * @generated
	 */
	Date getModelingDate();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.Project#getModelingDate <em>Modeling Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Date</em>' attribute.
	 * @see #getModelingDate()
	 * @generated
	 */
	void setModelingDate(Date value);

} // Project
