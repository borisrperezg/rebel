/**
 */
package rebel_core;

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
 *   <li>{@link rebel_core.Decision#getNumber <em>Number</em>}</li>
 *   <li>{@link rebel_core.Decision#getTitle <em>Title</em>}</li>
 *   <li>{@link rebel_core.Decision#getState <em>State</em>}</li>
 *   <li>{@link rebel_core.Decision#getSupercedes <em>Supercedes</em>}</li>
 *   <li>{@link rebel_core.Decision#getDate <em>Date</em>}</li>
 *   <li>{@link rebel_core.Decision#getDescription <em>Description</em>}</li>
 *   <li>{@link rebel_core.Decision#getPhase <em>Phase</em>}</li>
 *   <li>{@link rebel_core.Decision#getUserstories <em>Userstories</em>}</li>
 *   <li>{@link rebel_core.Decision#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link rebel_core.Decision#getMotivators <em>Motivators</em>}</li>
 *   <li>{@link rebel_core.Decision#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link rebel_core.Decision#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getDecision()
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
	 * @see rebel_core.Rebel_corePackage#getDecision_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link rebel_core.Decision#getNumber <em>Number</em>}' attribute.
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
	 * @see rebel_core.Rebel_corePackage#getDecision_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link rebel_core.Decision#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.StateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see rebel_core.StateType
	 * @see #setState(StateType)
	 * @see rebel_core.Rebel_corePackage#getDecision_State()
	 * @model
	 * @generated
	 */
	StateType getState();

	/**
	 * Sets the value of the '{@link rebel_core.Decision#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see rebel_core.StateType
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType value);

	/**
	 * Returns the value of the '<em><b>Supercedes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supercedes</em>' reference.
	 * @see #setSupercedes(Decision)
	 * @see rebel_core.Rebel_corePackage#getDecision_Supercedes()
	 * @model
	 * @generated
	 */
	Decision getSupercedes();

	/**
	 * Sets the value of the '{@link rebel_core.Decision#getSupercedes <em>Supercedes</em>}' reference.
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
	 * @see rebel_core.Rebel_corePackage#getDecision_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link rebel_core.Decision#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see rebel_core.Rebel_corePackage#getDecision_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rebel_core.Decision#getDescription <em>Description</em>}' attribute.
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
	 * @see rebel_core.Rebel_corePackage#getDecision_Phase()
	 * @model
	 * @generated
	 */
	String getPhase();

	/**
	 * Sets the value of the '{@link rebel_core.Decision#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(String value);

	/**
	 * Returns the value of the '<em><b>Userstories</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.UserStory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userstories</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getDecision_Userstories()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserStory> getUserstories();

	/**
	 * Returns the value of the '<em><b>Consequences</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.Consequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequences</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getDecision_Consequences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Consequence> getConsequences();

	/**
	 * Returns the value of the '<em><b>Motivators</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.Motivator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motivators</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getDecision_Motivators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Motivator> getMotivators();

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.Assumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getDecision_Assumptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assumption> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.Alternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getDecision_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alternative> getAlternatives();

} // Decision
