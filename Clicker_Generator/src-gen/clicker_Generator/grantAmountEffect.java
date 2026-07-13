/**
 */
package clicker_Generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>grant Amount Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.grantAmountEffect#getAmount <em>Amount</em>}</li>
 *   <li>{@link clicker_Generator.grantAmountEffect#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getgrantAmountEffect()
 * @model
 * @generated
 */
public interface grantAmountEffect extends effect {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgrantAmountEffect_Amount()
	 * @model
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link clicker_Generator.grantAmountEffect#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(generator)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgrantAmountEffect_Target()
	 * @model
	 * @generated
	 */
	generator getTarget();

	/**
	 * Sets the value of the '{@link clicker_Generator.grantAmountEffect#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(generator value);

} // grantAmountEffect
