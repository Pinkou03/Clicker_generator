/**
 */
package clicker_Generator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see clicker_Generator.Clicker_GeneratorPackage
 * @generated
 */
public interface Clicker_GeneratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Clicker_GeneratorFactory eINSTANCE = clicker_Generator.impl.Clicker_GeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>game</em>'.
	 * @generated
	 */
	game creategame();

	/**
	 * Returns a new object of class '<em>resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>resource</em>'.
	 * @generated
	 */
	resource createresource();

	/**
	 * Returns a new object of class '<em>generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>generator</em>'.
	 * @generated
	 */
	generator creategenerator();

	/**
	 * Returns a new object of class '<em>upgrade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>upgrade</em>'.
	 * @generated
	 */
	upgrade createupgrade();

	/**
	 * Returns a new object of class '<em>multiply Rate Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>multiply Rate Effect</em>'.
	 * @generated
	 */
	multiplyRateEffect createmultiplyRateEffect();

	/**
	 * Returns a new object of class '<em>reduce Cost Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>reduce Cost Effect</em>'.
	 * @generated
	 */
	reduceCostEffect createreduceCostEffect();

	/**
	 * Returns a new object of class '<em>unlock Generator Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>unlock Generator Effect</em>'.
	 * @generated
	 */
	unlockGeneratorEffect createunlockGeneratorEffect();

	/**
	 * Returns a new object of class '<em>grant Amount Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>grant Amount Effect</em>'.
	 * @generated
	 */
	grantAmountEffect creategrantAmountEffect();

	/**
	 * Returns a new object of class '<em>achievement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>achievement</em>'.
	 * @generated
	 */
	achievement createachievement();

	/**
	 * Returns a new object of class '<em>comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>comparison</em>'.
	 * @generated
	 */
	comparison createcomparison();

	/**
	 * Returns a new object of class '<em>binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>binary Expression</em>'.
	 * @generated
	 */
	binaryExpression createbinaryExpression();

	/**
	 * Returns a new object of class '<em>event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>event</em>'.
	 * @generated
	 */
	event createevent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Clicker_GeneratorPackage getClicker_GeneratorPackage();

} //Clicker_GeneratorFactory
