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
	 * Returns a new object of class '<em>resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>resources</em>'.
	 * @generated
	 */
	resources createresources();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Clicker_GeneratorPackage getClicker_GeneratorPackage();

} //Clicker_GeneratorFactory
