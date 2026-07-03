/**
 */
package clicker_Generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.resource#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.resource#getStartAmount <em>Start Amount</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getresource()
 * @model
 * @generated
 */
public interface resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getresource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link clicker_Generator.resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Amount</em>' attribute.
	 * @see #setStartAmount(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getresource_StartAmount()
	 * @model
	 * @generated
	 */
	double getStartAmount();

	/**
	 * Sets the value of the '{@link clicker_Generator.resource#getStartAmount <em>Start Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Amount</em>' attribute.
	 * @see #getStartAmount()
	 * @generated
	 */
	void setStartAmount(double value);

} // resource
