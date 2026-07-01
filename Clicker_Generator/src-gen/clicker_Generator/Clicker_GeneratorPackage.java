/**
 */
package clicker_Generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see clicker_Generator.Clicker_GeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface Clicker_GeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "clicker_Generator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/clicker_Generator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "clicker_Generator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Clicker_GeneratorPackage eINSTANCE = clicker_Generator.impl.Clicker_GeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.gameImpl <em>game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.gameImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getgame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.resourcesImpl <em>resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.resourcesImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getresources()
	 * @generated
	 */
	int RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__START_AMOUNT = 1;

	/**
	 * The number of structural features of the '<em>resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link clicker_Generator.game <em>game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>game</em>'.
	 * @see clicker_Generator.game
	 * @generated
	 */
	EClass getgame();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.game#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see clicker_Generator.game#getName()
	 * @see #getgame()
	 * @generated
	 */
	EAttribute getgame_Name();

	/**
	 * Returns the meta object for the containment reference '{@link clicker_Generator.game#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see clicker_Generator.game#getResources()
	 * @see #getgame()
	 * @generated
	 */
	EReference getgame_Resources();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.resources <em>resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>resources</em>'.
	 * @see clicker_Generator.resources
	 * @generated
	 */
	EClass getresources();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.resources#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see clicker_Generator.resources#getName()
	 * @see #getresources()
	 * @generated
	 */
	EAttribute getresources_Name();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.resources#getStartAmount <em>Start Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Amount</em>'.
	 * @see clicker_Generator.resources#getStartAmount()
	 * @see #getresources()
	 * @generated
	 */
	EAttribute getresources_StartAmount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Clicker_GeneratorFactory getClicker_GeneratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.gameImpl <em>game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.gameImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getgame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getgame();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__NAME = eINSTANCE.getgame_Name();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__RESOURCES = eINSTANCE.getgame_Resources();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.resourcesImpl <em>resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.resourcesImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getresources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getresources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES__NAME = eINSTANCE.getresources_Name();

		/**
		 * The meta object literal for the '<em><b>Start Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES__START_AMOUNT = eINSTANCE.getresources_StartAmount();

	}

} //Clicker_GeneratorPackage
