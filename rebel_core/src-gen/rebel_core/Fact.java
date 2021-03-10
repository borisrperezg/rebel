/**
 */
package rebel_core;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.Fact#getDate <em>Date</em>}</li>
 *   <li>{@link rebel_core.Fact#getAction <em>Action</em>}</li>
 *   <li>{@link rebel_core.Fact#getObservations <em>Observations</em>}</li>
 *   <li>{@link rebel_core.Fact#getFunctionalview <em>Functionalview</em>}</li>
 *   <li>{@link rebel_core.Fact#getArchitecturaldecision <em>Architecturaldecision</em>}</li>
 *   <li>{@link rebel_core.Fact#getElementName <em>Element Name</em>}</li>
 *   <li>{@link rebel_core.Fact#getElementType <em>Element Type</em>}</li>
 *   <li>{@link rebel_core.Fact#getId <em>Id</em>}</li>
 *   <li>{@link rebel_core.Fact#getMessage <em>Message</em>}</li>
 *   <li>{@link rebel_core.Fact#getView <em>View</em>}</li>
 *   <li>{@link rebel_core.Fact#getFact <em>Fact</em>}</li>
 *   <li>{@link rebel_core.Fact#getAtditem <em>Atditem</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getFact()
 * @model
 * @generated
 */
public interface Fact extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see rebel_core.Rebel_corePackage#getFact_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link rebel_core.Fact#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see rebel_core.Action
	 * @see #setAction(Action)
	 * @see rebel_core.Rebel_corePackage#getFact_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link rebel_core.Fact#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see rebel_core.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Observations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observations</em>' attribute.
	 * @see #setObservations(String)
	 * @see rebel_core.Rebel_corePackage#getFact_Observations()
	 * @model
	 * @generated
	 */
	String getObservations();

	/**
	 * Sets the value of the '{@link rebel_core.Fact#getObservations <em>Observations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observations</em>' attribute.
	 * @see #getObservations()
	 * @generated
	 */
	void setObservations(String value);

	/**
	 * Returns the value of the '<em><b>Functionalview</b></em>' reference list.
	 * The list contents are of type {@link rebel_core.FunctionalView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionalview</em>' reference list.
	 * @see rebel_core.Rebel_corePackage#getFact_Functionalview()
	 * @model
	 * @generated
	 */
	EList<FunctionalView> getFunctionalview();

	/**
	 * Returns the value of the '<em><b>Architecturaldecision</b></em>' reference list.
	 * The list contents are of type {@link rebel_core.Decision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecturaldecision</em>' reference list.
	 * @see rebel_core.Rebel_corePackage#getFact_Architecturaldecision()
	 * @model
	 * @generated
	 */
	EList<Decision> getArchitecturaldecision();

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see rebel_core.Rebel_corePackage#getFact_ElementName()
	 * @model
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link rebel_core.Fact#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(String)
	 * @see rebel_core.Rebel_corePackage#getFact_ElementType()
	 * @model
	 * @generated
	 */
	String getElementType();

	/**
	 * Sets the value of the '{@link rebel_core.Fact#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see rebel_core.Rebel_corePackage#getFact_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_core.Fact#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference list.
	 * The list contents are of type {@link rebel_core.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference list.
	 * @see rebel_core.Rebel_corePackage#getFact_Message()
	 * @model
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>View</b></em>' reference list.
	 * The list contents are of type {@link rebel_core.ArchimateView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference list.
	 * @see rebel_core.Rebel_corePackage#getFact_View()
	 * @model
	 * @generated
	 */
	EList<ArchimateView> getView();

	/**
	 * Returns the value of the '<em><b>Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' reference.
	 * @see #setFact(Fact)
	 * @see rebel_core.Rebel_corePackage#getFact_Fact()
	 * @model
	 * @generated
	 */
	Fact getFact();

	/**
	 * Sets the value of the '{@link rebel_core.Fact#getFact <em>Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' reference.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(Fact value);

	/**
	 * Returns the value of the '<em><b>Atditem</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.ATDItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atditem</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getFact_Atditem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ATDItem> getAtditem();

} // Fact
