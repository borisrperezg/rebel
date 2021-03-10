/**
 */
package rebel_core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link rebel_core.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link rebel_core.Relation#getId <em>Id</em>}</li>
 *   <li>{@link rebel_core.Relation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see rebel_core.Rebel_corePackage#getRelation_Source()
	 * @model required="true"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link rebel_core.Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Element)
	 * @see rebel_core.Rebel_corePackage#getRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	Element getTarget();

	/**
	 * Sets the value of the '{@link rebel_core.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Element value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see rebel_core.Rebel_corePackage#getRelation_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_core.Relation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rebel_core.RELATIONTYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see rebel_core.RELATIONTYPE
	 * @see #setType(RELATIONTYPE)
	 * @see rebel_core.Rebel_corePackage#getRelation_Type()
	 * @model
	 * @generated
	 */
	RELATIONTYPE getType();

	/**
	 * Sets the value of the '{@link rebel_core.Relation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rebel_core.RELATIONTYPE
	 * @see #getType()
	 * @generated
	 */
	void setType(RELATIONTYPE value);

} // Relation
