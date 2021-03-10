/**
 */
package rebel_architecturaldecisions;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_architecturaldecisions.Decision#getNumber <em>Number</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getTitle <em>Title</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getState <em>State</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getMotivatedBy <em>Motivated By</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getSupercedes <em>Supercedes</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getDate <em>Date</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getDeciders <em>Deciders</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getDescription <em>Description</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getPhase <em>Phase</em>}</li>
 *   <li>{@link rebel_architecturaldecisions.Decision#getUserStories <em>User Stories</em>}</li>
 * </ul>
 *
 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.Decision#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.Decision#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_architecturaldecisions.StateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see rebel_architecturaldecisions.StateType
	 * @see #setState(StateType)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_State()
	 * @model
	 * @generated
	 */
	StateType getState();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.Decision#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see rebel_architecturaldecisions.StateType
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType value);

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_architecturaldecisions.Alternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alternative> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_architecturaldecisions.Assumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' containment reference list.
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_Assumptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assumption> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Consequences</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_architecturaldecisions.Consequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequences</em>' containment reference list.
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_Consequences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Consequence> getConsequences();

	/**
	 * Returns the value of the '<em><b>Motivated By</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_architecturaldecisions.Motivator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motivated By</em>' containment reference list.
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_MotivatedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Motivator> getMotivatedBy();

	/**
	 * Returns the value of the '<em><b>Supercedes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supercedes</em>' reference.
	 * @see #setSupercedes(Decision)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_Supercedes()
	 * @model
	 * @generated
	 */
	Decision getSupercedes();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.Decision#getSupercedes <em>Supercedes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supercedes</em>' reference.
	 * @see #getSupercedes()
	 * @generated
	 */
	void setSupercedes(Decision value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.Decision#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Deciders</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_architecturaldecisions.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deciders</em>' containment reference list.
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_Deciders()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Person> getDeciders();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.Decision#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(String)
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_Phase()
	 * @model
	 * @generated
	 */
	String getPhase();

	/**
	 * Sets the value of the '{@link rebel_architecturaldecisions.Decision#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(String value);

	/**
	 * Returns the value of the '<em><b>User Stories</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_architecturaldecisions.UserStory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Stories</em>' containment reference list.
	 * @see rebel_architecturaldecisions.Rebel_architecturaldecisionsPackage#getDecision_UserStories()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserStory> getUserStories();

} // Decision
