/**
 */
package clicker_Generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.binaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link clicker_Generator.binaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link clicker_Generator.binaryExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getbinaryExpression()
 * @model
 * @generated
 */
public interface binaryExpression extends expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link clicker_Generator.logicOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see clicker_Generator.logicOperator
	 * @see #setOperator(logicOperator)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getbinaryExpression_Operator()
	 * @model
	 * @generated
	 */
	logicOperator getOperator();

	/**
	 * Sets the value of the '{@link clicker_Generator.binaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see clicker_Generator.logicOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(logicOperator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(expression)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getbinaryExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	expression getLeft();

	/**
	 * Sets the value of the '{@link clicker_Generator.binaryExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(expression)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getbinaryExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	expression getRight();

	/**
	 * Sets the value of the '{@link clicker_Generator.binaryExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(expression value);

} // binaryExpression
