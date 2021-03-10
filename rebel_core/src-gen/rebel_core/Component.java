/**
 */
package rebel_core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.Component#getName <em>Name</em>}</li>
 *   <li>{@link rebel_core.Component#getId <em>Id</em>}</li>
 *   <li>{@link rebel_core.Component#getPosX <em>Pos X</em>}</li>
 *   <li>{@link rebel_core.Component#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link rebel_core.Component#getWidth <em>Width</em>}</li>
 *   <li>{@link rebel_core.Component#getHeight <em>Height</em>}</li>
 *   <li>{@link rebel_core.Component#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rebel_core.Rebel_corePackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rebel_core.Component#getName <em>Name</em>}' attribute.
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
	 * @see rebel_core.Rebel_corePackage#getComponent_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link rebel_core.Component#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos X</em>' attribute.
	 * @see #setPosX(String)
	 * @see rebel_core.Rebel_corePackage#getComponent_PosX()
	 * @model
	 * @generated
	 */
	String getPosX();

	/**
	 * Sets the value of the '{@link rebel_core.Component#getPosX <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos X</em>' attribute.
	 * @see #getPosX()
	 * @generated
	 */
	void setPosX(String value);

	/**
	 * Returns the value of the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Y</em>' attribute.
	 * @see #setPosY(String)
	 * @see rebel_core.Rebel_corePackage#getComponent_PosY()
	 * @model
	 * @generated
	 */
	String getPosY();

	/**
	 * Sets the value of the '{@link rebel_core.Component#getPosY <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Y</em>' attribute.
	 * @see #getPosY()
	 * @generated
	 */
	void setPosY(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see rebel_core.Rebel_corePackage#getComponent_Width()
	 * @model
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link rebel_core.Component#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see rebel_core.Rebel_corePackage#getComponent_Height()
	 * @model
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link rebel_core.Component#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getComponent_Ports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Port> getPorts();

} // Component
