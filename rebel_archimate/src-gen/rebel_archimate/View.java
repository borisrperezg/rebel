/**
 */
package rebel_archimate;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_archimate.View#getRelation <em>Relation</em>}</li>
 *   <li>{@link rebel_archimate.View#getElement <em>Element</em>}</li>
 *   <li>{@link rebel_archimate.View#getName <em>Name</em>}</li>
 *   <li>{@link rebel_archimate.View#getId <em>Id</em>}</li>
 *   <li>{@link rebel_archimate.View#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see rebel_archimate.Rebel_archimatePackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_archimate.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see rebel_archimate.Rebel_archimatePackage#getView_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelation();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_archimate.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see rebel_archimate.Rebel_archimatePackage#getView_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_archimate.Rebel_archimatePackage#getView_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_archimate.View#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see rebel_archimate.Rebel_archimatePackage#getView_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_archimate.View#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see rebel_archimate.Rebel_archimatePackage#getView_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link rebel_archimate.View#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // View
