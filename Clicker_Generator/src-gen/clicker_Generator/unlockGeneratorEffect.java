/**
 */
package clicker_Generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unlock Generator Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.unlockGeneratorEffect#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getunlockGeneratorEffect()
 * @model
 * @generated
 */
public interface unlockGeneratorEffect extends effect {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(generator)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getunlockGeneratorEffect_Target()
	 * @model
	 * @generated
	 */
	generator getTarget();

	/**
	 * Sets the value of the '{@link clicker_Generator.unlockGeneratorEffect#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(generator value);

} // unlockGeneratorEffect
