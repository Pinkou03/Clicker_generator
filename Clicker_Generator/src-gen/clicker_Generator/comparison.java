/**
 */
package clicker_Generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.comparison#getResource <em>Resource</em>}</li>
 *   <li>{@link clicker_Generator.comparison#getOperator <em>Operator</em>}</li>
 *   <li>{@link clicker_Generator.comparison#getValue <em>Value</em>}</li>
 *   <li>{@link clicker_Generator.comparison#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getcomparison()
 * @model
 * @generated
 */
public interface comparison extends expression {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(resource)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getcomparison_Resource()
	 * @model
	 * @generated
	 */
	resource getResource();

	/**
	 * Sets the value of the '{@link clicker_Generator.comparison#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(resource value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link clicker_Generator.comparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see clicker_Generator.comparisonOperator
	 * @see #setOperator(comparisonOperator)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getcomparison_Operator()
	 * @model
	 * @generated
	 */
	comparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link clicker_Generator.comparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see clicker_Generator.comparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(comparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getcomparison_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link clicker_Generator.comparison#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' reference.
	 * @see #setGenerator(generator)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getcomparison_Generator()
	 * @model
	 * @generated
	 */
	generator getGenerator();

	/**
	 * Sets the value of the '{@link clicker_Generator.comparison#getGenerator <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(generator value);

} // comparison
