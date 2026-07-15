/**
 */
package clicker_Generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>upgrade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.upgrade#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.upgrade#getCost <em>Cost</em>}</li>
 *   <li>{@link clicker_Generator.upgrade#getEffects <em>Effects</em>}</li>
 *   <li>{@link clicker_Generator.upgrade#getRequires <em>Requires</em>}</li>
 *   <li>{@link clicker_Generator.upgrade#getCostResource <em>Cost Resource</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getupgrade()
 * @model
 * @generated
 */
public interface upgrade extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getupgrade_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link clicker_Generator.upgrade#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getupgrade_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link clicker_Generator.upgrade#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link clicker_Generator.effect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see clicker_Generator.Clicker_GeneratorPackage#getupgrade_Effects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<effect> getEffects();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link clicker_Generator.upgrade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see clicker_Generator.Clicker_GeneratorPackage#getupgrade_Requires()
	 * @model
	 * @generated
	 */
	EList<upgrade> getRequires();

	/**
	 * Returns the value of the '<em><b>Cost Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Resource</em>' reference.
	 * @see #setCostResource(resource)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getupgrade_CostResource()
	 * @model
	 * @generated
	 */
	resource getCostResource();

	/**
	 * Sets the value of the '{@link clicker_Generator.upgrade#getCostResource <em>Cost Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Resource</em>' reference.
	 * @see #getCostResource()
	 * @generated
	 */
	void setCostResource(resource value);

} // upgrade
