/**
 */
package clicker_Generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>reduce Cost Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.reduceCostEffect#getFactor <em>Factor</em>}</li>
 *   <li>{@link clicker_Generator.reduceCostEffect#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getreduceCostEffect()
 * @model
 * @generated
 */
public interface reduceCostEffect extends effect {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getreduceCostEffect_Factor()
	 * @model
	 * @generated
	 */
	double getFactor();

	/**
	 * Sets the value of the '{@link clicker_Generator.reduceCostEffect#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(double value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(effect)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getreduceCostEffect_Target()
	 * @model
	 * @generated
	 */
	effect getTarget();

	/**
	 * Sets the value of the '{@link clicker_Generator.reduceCostEffect#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(effect value);

} // reduceCostEffect
