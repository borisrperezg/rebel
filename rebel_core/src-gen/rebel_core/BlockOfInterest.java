/**
 */
package rebel_core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Of Interest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.BlockOfInterest#getFact <em>Fact</em>}</li>
 *   <li>{@link rebel_core.BlockOfInterest#getId <em>Id</em>}</li>
 *   <li>{@link rebel_core.BlockOfInterest#getName <em>Name</em>}</li>
 *   <li>{@link rebel_core.BlockOfInterest#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link rebel_core.BlockOfInterest#getBusiness_driver <em>Business driver</em>}</li>
 *   <li>{@link rebel_core.BlockOfInterest#getBusiness_goal <em>Business goal</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getBlockOfInterest()
 * @model
 * @generated
 */
public interface BlockOfInterest extends EObject {
	/**
	 * Returns the value of the '<em><b>Fact</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.Fact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getBlockOfInterest_Fact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fact> getFact();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see rebel_core.Rebel_corePackage#getBlockOfInterest_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link rebel_core.BlockOfInterest#getId <em>Id</em>}' attribute.
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
	 * @see rebel_core.Rebel_corePackage#getBlockOfInterest_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_core.BlockOfInterest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' attribute.
	 * @see #setResponsible(String)
	 * @see rebel_core.Rebel_corePackage#getBlockOfInterest_Responsible()
	 * @model
	 * @generated
	 */
	String getResponsible();

	/**
	 * Sets the value of the '{@link rebel_core.BlockOfInterest#getResponsible <em>Responsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' attribute.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(String value);

	/**
	 * Returns the value of the '<em><b>Business driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business driver</em>' attribute.
	 * @see #setBusiness_driver(String)
	 * @see rebel_core.Rebel_corePackage#getBlockOfInterest_Business_driver()
	 * @model
	 * @generated
	 */
	String getBusiness_driver();

	/**
	 * Sets the value of the '{@link rebel_core.BlockOfInterest#getBusiness_driver <em>Business driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business driver</em>' attribute.
	 * @see #getBusiness_driver()
	 * @generated
	 */
	void setBusiness_driver(String value);

	/**
	 * Returns the value of the '<em><b>Business goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business goal</em>' attribute.
	 * @see #setBusiness_goal(String)
	 * @see rebel_core.Rebel_corePackage#getBlockOfInterest_Business_goal()
	 * @model
	 * @generated
	 */
	String getBusiness_goal();

	/**
	 * Sets the value of the '{@link rebel_core.BlockOfInterest#getBusiness_goal <em>Business goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business goal</em>' attribute.
	 * @see #getBusiness_goal()
	 * @generated
	 */
	void setBusiness_goal(String value);

} // BlockOfInterest
