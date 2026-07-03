/**
 */
package clicker_Generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>achievement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.achievement#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.achievement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getachievement()
 * @model
 * @generated
 */
public interface achievement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getachievement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link clicker_Generator.achievement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(expression)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getachievement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	expression getCondition();

	/**
	 * Sets the value of the '{@link clicker_Generator.achievement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(expression value);

} // achievement
