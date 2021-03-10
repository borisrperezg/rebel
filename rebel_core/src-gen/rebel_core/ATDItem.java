/**
 */
package rebel_core;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATD Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rebel_core.ATDItem#getCompromisedQA <em>Compromised QA</em>}</li>
 *   <li>{@link rebel_core.ATDItem#getDate <em>Date</em>}</li>
 *   <li>{@link rebel_core.ATDItem#getStatus <em>Status</em>}</li>
 *   <li>{@link rebel_core.ATDItem#getIncurredBy <em>Incurred By</em>}</li>
 *   <li>{@link rebel_core.ATDItem#getRationales <em>Rationales</em>}</li>
 *   <li>{@link rebel_core.ATDItem#getBenefits <em>Benefits</em>}</li>
 *   <li>{@link rebel_core.ATDItem#getEffects <em>Effects</em>}</li>
 *   <li>{@link rebel_core.ATDItem#getType <em>Type</em>}</li>
 *   <li>{@link rebel_core.ATDItem#isIdentifyByArchitect <em>Identify By Architect</em>}</li>
 * </ul>
 *
 * @see rebel_core.Rebel_corePackage#getATDItem()
 * @model
 * @generated
 */
public interface ATDItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Compromised QA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compromised QA</em>' attribute.
	 * @see #setCompromisedQA(String)
	 * @see rebel_core.Rebel_corePackage#getATDItem_CompromisedQA()
	 * @model
	 * @generated
	 */
	String getCompromisedQA();

	/**
	 * Sets the value of the '{@link rebel_core.ATDItem#getCompromisedQA <em>Compromised QA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compromised QA</em>' attribute.
	 * @see #getCompromisedQA()
	 * @generated
	 */
	void setCompromisedQA(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see rebel_core.Rebel_corePackage#getATDItem_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link rebel_core.ATDItem#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see rebel_core.Rebel_corePackage#getATDItem_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link rebel_core.ATDItem#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Incurred By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incurred By</em>' attribute.
	 * @see #setIncurredBy(String)
	 * @see rebel_core.Rebel_corePackage#getATDItem_IncurredBy()
	 * @model
	 * @generated
	 */
	String getIncurredBy();

	/**
	 * Sets the value of the '{@link rebel_core.ATDItem#getIncurredBy <em>Incurred By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incurred By</em>' attribute.
	 * @see #getIncurredBy()
	 * @generated
	 */
	void setIncurredBy(String value);

	/**
	 * Returns the value of the '<em><b>Rationales</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.ATDRationale}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationales</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getATDItem_Rationales()
	 * @model containment="true"
	 * @generated
	 */
	EList<ATDRationale> getRationales();

	/**
	 * Returns the value of the '<em><b>Benefits</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.ATDBenefit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefits</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getATDItem_Benefits()
	 * @model containment="true"
	 * @generated
	 */
	EList<ATDBenefit> getBenefits();

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link rebel_core.ATDEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see rebel_core.Rebel_corePackage#getATDItem_Effects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ATDEffect> getEffects();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see rebel_core.Rebel_corePackage#getATDItem_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link rebel_core.ATDItem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Identify By Architect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identify By Architect</em>' attribute.
	 * @see #setIdentifyByArchitect(boolean)
	 * @see rebel_core.Rebel_corePackage#getATDItem_IdentifyByArchitect()
	 * @model
	 * @generated
	 */
	boolean isIdentifyByArchitect();

	/**
	 * Sets the value of the '{@link rebel_core.ATDItem#isIdentifyByArchitect <em>Identify By Architect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identify By Architect</em>' attribute.
	 * @see #isIdentifyByArchitect()
	 * @generated
	 */
	void setIdentifyByArchitect(boolean value);

} // ATDItem
