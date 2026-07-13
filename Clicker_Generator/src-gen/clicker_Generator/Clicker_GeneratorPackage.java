/**
 */
package clicker_Generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GENERATORS = 2;

	/**
	 * The feature id for the '<em><b>Upgrades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__UPGRADES = 3;

	/**
	 * The feature id for the '<em><b>Achievements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ACHIEVEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__EVENTS = 5;

	/**
	 * The number of structural features of the '<em>game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.resourceImpl <em>resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.resourceImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getresource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__START_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ICON = 2;

	/**
	 * The number of structural features of the '<em>resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.generatorImpl <em>generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.generatorImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getgenerator()
	 * @generated
	 */
	int GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__PRODUCES = 1;

	/**
	 * The feature id for the '<em><b>Base Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__BASE_RATE = 2;

	/**
	 * The feature id for the '<em><b>Base Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__BASE_COST = 3;

	/**
	 * The feature id for the '<em><b>Cost Growth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__COST_GROWTH = 4;

	/**
	 * The number of structural features of the '<em>generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.upgradeImpl <em>upgrade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.upgradeImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getupgrade()
	 * @generated
	 */
	int UPGRADE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPGRADE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPGRADE__COST = 1;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPGRADE__EFFECTS = 2;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPGRADE__REQUIRES = 3;

	/**
	 * The feature id for the '<em><b>Cost Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPGRADE__COST_RESOURCE = 4;

	/**
	 * The number of structural features of the '<em>upgrade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPGRADE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>upgrade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPGRADE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.effectImpl <em>effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.effectImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#geteffect()
	 * @generated
	 */
	int EFFECT = 4;

	/**
	 * The number of structural features of the '<em>effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.multiplyRateEffectImpl <em>multiply Rate Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.multiplyRateEffectImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getmultiplyRateEffect()
	 * @generated
	 */
	int MULTIPLY_RATE_EFFECT = 5;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_RATE_EFFECT__FACTOR = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_RATE_EFFECT__TARGET = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>multiply Rate Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_RATE_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>multiply Rate Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_RATE_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.reduceCostEffectImpl <em>reduce Cost Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.reduceCostEffectImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getreduceCostEffect()
	 * @generated
	 */
	int REDUCE_COST_EFFECT = 6;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_COST_EFFECT__FACTOR = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_COST_EFFECT__TARGET = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>reduce Cost Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_COST_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>reduce Cost Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_COST_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.unlockGeneratorEffectImpl <em>unlock Generator Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.unlockGeneratorEffectImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getunlockGeneratorEffect()
	 * @generated
	 */
	int UNLOCK_GENERATOR_EFFECT = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_GENERATOR_EFFECT__TARGET = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>unlock Generator Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_GENERATOR_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>unlock Generator Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_GENERATOR_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.grantAmountEffectImpl <em>grant Amount Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.grantAmountEffectImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getgrantAmountEffect()
	 * @generated
	 */
	int GRANT_AMOUNT_EFFECT = 8;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_AMOUNT_EFFECT__AMOUNT = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_AMOUNT_EFFECT__TARGET = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>grant Amount Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_AMOUNT_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>grant Amount Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANT_AMOUNT_EFFECT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.achievementImpl <em>achievement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.achievementImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getachievement()
	 * @generated
	 */
	int ACHIEVEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVEMENT__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>achievement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>achievement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.expressionImpl <em>expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.expressionImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getexpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.comparisonImpl <em>comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.comparisonImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getcomparison()
	 * @generated
	 */
	int COMPARISON = 11;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__RESOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__VALUE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.binaryExpressionImpl <em>binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.binaryExpressionImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getbinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.impl.eventImpl <em>event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.impl.eventImpl
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getevent()
	 * @generated
	 */
	int EVENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CHANCE = 1;

	/**
	 * The feature id for the '<em><b>Interval Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INTERVAL_SECONDS = 2;

	/**
	 * The feature id for the '<em><b>Duration Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DURATION_SECONDS = 3;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EFFECTS = 4;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ICON = 5;

	/**
	 * The number of structural features of the '<em>event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link clicker_Generator.comparisonOperator <em>comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.comparisonOperator
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getcomparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 14;

	/**
	 * The meta object id for the '{@link clicker_Generator.logicOperator <em>logic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clicker_Generator.logicOperator
	 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getlogicOperator()
	 * @generated
	 */
	int LOGIC_OPERATOR = 15;

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
	 * Returns the meta object for the containment reference list '{@link clicker_Generator.game#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see clicker_Generator.game#getResources()
	 * @see #getgame()
	 * @generated
	 */
	EReference getgame_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link clicker_Generator.game#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see clicker_Generator.game#getGenerators()
	 * @see #getgame()
	 * @generated
	 */
	EReference getgame_Generators();

	/**
	 * Returns the meta object for the containment reference list '{@link clicker_Generator.game#getUpgrades <em>Upgrades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upgrades</em>'.
	 * @see clicker_Generator.game#getUpgrades()
	 * @see #getgame()
	 * @generated
	 */
	EReference getgame_Upgrades();

	/**
	 * Returns the meta object for the containment reference list '{@link clicker_Generator.game#getAchievements <em>Achievements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Achievements</em>'.
	 * @see clicker_Generator.game#getAchievements()
	 * @see #getgame()
	 * @generated
	 */
	EReference getgame_Achievements();

	/**
	 * Returns the meta object for the containment reference list '{@link clicker_Generator.game#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see clicker_Generator.game#getEvents()
	 * @see #getgame()
	 * @generated
	 */
	EReference getgame_Events();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.resource <em>resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>resource</em>'.
	 * @see clicker_Generator.resource
	 * @generated
	 */
	EClass getresource();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see clicker_Generator.resource#getName()
	 * @see #getresource()
	 * @generated
	 */
	EAttribute getresource_Name();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.resource#getStartAmount <em>Start Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Amount</em>'.
	 * @see clicker_Generator.resource#getStartAmount()
	 * @see #getresource()
	 * @generated
	 */
	EAttribute getresource_StartAmount();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.resource#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see clicker_Generator.resource#getIcon()
	 * @see #getresource()
	 * @generated
	 */
	EAttribute getresource_Icon();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.generator <em>generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>generator</em>'.
	 * @see clicker_Generator.generator
	 * @generated
	 */
	EClass getgenerator();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.generator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see clicker_Generator.generator#getName()
	 * @see #getgenerator()
	 * @generated
	 */
	EAttribute getgenerator_Name();

	/**
	 * Returns the meta object for the reference '{@link clicker_Generator.generator#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Produces</em>'.
	 * @see clicker_Generator.generator#getProduces()
	 * @see #getgenerator()
	 * @generated
	 */
	EReference getgenerator_Produces();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.generator#getBaseRate <em>Base Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Rate</em>'.
	 * @see clicker_Generator.generator#getBaseRate()
	 * @see #getgenerator()
	 * @generated
	 */
	EAttribute getgenerator_BaseRate();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.generator#getBaseCost <em>Base Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Cost</em>'.
	 * @see clicker_Generator.generator#getBaseCost()
	 * @see #getgenerator()
	 * @generated
	 */
	EAttribute getgenerator_BaseCost();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.generator#getCostGrowth <em>Cost Growth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Growth</em>'.
	 * @see clicker_Generator.generator#getCostGrowth()
	 * @see #getgenerator()
	 * @generated
	 */
	EAttribute getgenerator_CostGrowth();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.upgrade <em>upgrade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>upgrade</em>'.
	 * @see clicker_Generator.upgrade
	 * @generated
	 */
	EClass getupgrade();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.upgrade#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see clicker_Generator.upgrade#getName()
	 * @see #getupgrade()
	 * @generated
	 */
	EAttribute getupgrade_Name();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.upgrade#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see clicker_Generator.upgrade#getCost()
	 * @see #getupgrade()
	 * @generated
	 */
	EAttribute getupgrade_Cost();

	/**
	 * Returns the meta object for the containment reference list '{@link clicker_Generator.upgrade#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see clicker_Generator.upgrade#getEffects()
	 * @see #getupgrade()
	 * @generated
	 */
	EReference getupgrade_Effects();

	/**
	 * Returns the meta object for the reference list '{@link clicker_Generator.upgrade#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see clicker_Generator.upgrade#getRequires()
	 * @see #getupgrade()
	 * @generated
	 */
	EReference getupgrade_Requires();

	/**
	 * Returns the meta object for the reference '{@link clicker_Generator.upgrade#getCostResource <em>Cost Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Resource</em>'.
	 * @see clicker_Generator.upgrade#getCostResource()
	 * @see #getupgrade()
	 * @generated
	 */
	EReference getupgrade_CostResource();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.effect <em>effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>effect</em>'.
	 * @see clicker_Generator.effect
	 * @generated
	 */
	EClass geteffect();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.multiplyRateEffect <em>multiply Rate Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>multiply Rate Effect</em>'.
	 * @see clicker_Generator.multiplyRateEffect
	 * @generated
	 */
	EClass getmultiplyRateEffect();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.multiplyRateEffect#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see clicker_Generator.multiplyRateEffect#getFactor()
	 * @see #getmultiplyRateEffect()
	 * @generated
	 */
	EAttribute getmultiplyRateEffect_Factor();

	/**
	 * Returns the meta object for the reference '{@link clicker_Generator.multiplyRateEffect#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see clicker_Generator.multiplyRateEffect#getTarget()
	 * @see #getmultiplyRateEffect()
	 * @generated
	 */
	EReference getmultiplyRateEffect_Target();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.reduceCostEffect <em>reduce Cost Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>reduce Cost Effect</em>'.
	 * @see clicker_Generator.reduceCostEffect
	 * @generated
	 */
	EClass getreduceCostEffect();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.reduceCostEffect#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see clicker_Generator.reduceCostEffect#getFactor()
	 * @see #getreduceCostEffect()
	 * @generated
	 */
	EAttribute getreduceCostEffect_Factor();

	/**
	 * Returns the meta object for the reference '{@link clicker_Generator.reduceCostEffect#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see clicker_Generator.reduceCostEffect#getTarget()
	 * @see #getreduceCostEffect()
	 * @generated
	 */
	EReference getreduceCostEffect_Target();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.unlockGeneratorEffect <em>unlock Generator Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>unlock Generator Effect</em>'.
	 * @see clicker_Generator.unlockGeneratorEffect
	 * @generated
	 */
	EClass getunlockGeneratorEffect();

	/**
	 * Returns the meta object for the reference '{@link clicker_Generator.unlockGeneratorEffect#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see clicker_Generator.unlockGeneratorEffect#getTarget()
	 * @see #getunlockGeneratorEffect()
	 * @generated
	 */
	EReference getunlockGeneratorEffect_Target();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.grantAmountEffect <em>grant Amount Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>grant Amount Effect</em>'.
	 * @see clicker_Generator.grantAmountEffect
	 * @generated
	 */
	EClass getgrantAmountEffect();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.grantAmountEffect#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see clicker_Generator.grantAmountEffect#getAmount()
	 * @see #getgrantAmountEffect()
	 * @generated
	 */
	EAttribute getgrantAmountEffect_Amount();

	/**
	 * Returns the meta object for the reference '{@link clicker_Generator.grantAmountEffect#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see clicker_Generator.grantAmountEffect#getTarget()
	 * @see #getgrantAmountEffect()
	 * @generated
	 */
	EReference getgrantAmountEffect_Target();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.achievement <em>achievement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>achievement</em>'.
	 * @see clicker_Generator.achievement
	 * @generated
	 */
	EClass getachievement();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.achievement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see clicker_Generator.achievement#getName()
	 * @see #getachievement()
	 * @generated
	 */
	EAttribute getachievement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link clicker_Generator.achievement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see clicker_Generator.achievement#getCondition()
	 * @see #getachievement()
	 * @generated
	 */
	EReference getachievement_Condition();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.expression <em>expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>expression</em>'.
	 * @see clicker_Generator.expression
	 * @generated
	 */
	EClass getexpression();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.comparison <em>comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>comparison</em>'.
	 * @see clicker_Generator.comparison
	 * @generated
	 */
	EClass getcomparison();

	/**
	 * Returns the meta object for the reference '{@link clicker_Generator.comparison#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see clicker_Generator.comparison#getResource()
	 * @see #getcomparison()
	 * @generated
	 */
	EReference getcomparison_Resource();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.comparison#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see clicker_Generator.comparison#getOperator()
	 * @see #getcomparison()
	 * @generated
	 */
	EAttribute getcomparison_Operator();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.comparison#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see clicker_Generator.comparison#getValue()
	 * @see #getcomparison()
	 * @generated
	 */
	EAttribute getcomparison_Value();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.binaryExpression <em>binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>binary Expression</em>'.
	 * @see clicker_Generator.binaryExpression
	 * @generated
	 */
	EClass getbinaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.binaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see clicker_Generator.binaryExpression#getOperator()
	 * @see #getbinaryExpression()
	 * @generated
	 */
	EAttribute getbinaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link clicker_Generator.binaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see clicker_Generator.binaryExpression#getLeft()
	 * @see #getbinaryExpression()
	 * @generated
	 */
	EReference getbinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link clicker_Generator.binaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see clicker_Generator.binaryExpression#getRight()
	 * @see #getbinaryExpression()
	 * @generated
	 */
	EReference getbinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link clicker_Generator.event <em>event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>event</em>'.
	 * @see clicker_Generator.event
	 * @generated
	 */
	EClass getevent();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see clicker_Generator.event#getName()
	 * @see #getevent()
	 * @generated
	 */
	EAttribute getevent_Name();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.event#getChance <em>Chance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chance</em>'.
	 * @see clicker_Generator.event#getChance()
	 * @see #getevent()
	 * @generated
	 */
	EAttribute getevent_Chance();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.event#getIntervalSeconds <em>Interval Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Seconds</em>'.
	 * @see clicker_Generator.event#getIntervalSeconds()
	 * @see #getevent()
	 * @generated
	 */
	EAttribute getevent_IntervalSeconds();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.event#getDurationSeconds <em>Duration Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Seconds</em>'.
	 * @see clicker_Generator.event#getDurationSeconds()
	 * @see #getevent()
	 * @generated
	 */
	EAttribute getevent_DurationSeconds();

	/**
	 * Returns the meta object for the containment reference list '{@link clicker_Generator.event#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see clicker_Generator.event#getEffects()
	 * @see #getevent()
	 * @generated
	 */
	EReference getevent_Effects();

	/**
	 * Returns the meta object for the attribute '{@link clicker_Generator.event#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see clicker_Generator.event#getIcon()
	 * @see #getevent()
	 * @generated
	 */
	EAttribute getevent_Icon();

	/**
	 * Returns the meta object for enum '{@link clicker_Generator.comparisonOperator <em>comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>comparison Operator</em>'.
	 * @see clicker_Generator.comparisonOperator
	 * @generated
	 */
	EEnum getcomparisonOperator();

	/**
	 * Returns the meta object for enum '{@link clicker_Generator.logicOperator <em>logic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>logic Operator</em>'.
	 * @see clicker_Generator.logicOperator
	 * @generated
	 */
	EEnum getlogicOperator();

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
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__RESOURCES = eINSTANCE.getgame_Resources();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GENERATORS = eINSTANCE.getgame_Generators();

		/**
		 * The meta object literal for the '<em><b>Upgrades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__UPGRADES = eINSTANCE.getgame_Upgrades();

		/**
		 * The meta object literal for the '<em><b>Achievements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ACHIEVEMENTS = eINSTANCE.getgame_Achievements();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__EVENTS = eINSTANCE.getgame_Events();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.resourceImpl <em>resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.resourceImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getresource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getresource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getresource_Name();

		/**
		 * The meta object literal for the '<em><b>Start Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__START_AMOUNT = eINSTANCE.getresource_StartAmount();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ICON = eINSTANCE.getresource_Icon();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.generatorImpl <em>generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.generatorImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getgenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getgenerator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__NAME = eINSTANCE.getgenerator_Name();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__PRODUCES = eINSTANCE.getgenerator_Produces();

		/**
		 * The meta object literal for the '<em><b>Base Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__BASE_RATE = eINSTANCE.getgenerator_BaseRate();

		/**
		 * The meta object literal for the '<em><b>Base Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__BASE_COST = eINSTANCE.getgenerator_BaseCost();

		/**
		 * The meta object literal for the '<em><b>Cost Growth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__COST_GROWTH = eINSTANCE.getgenerator_CostGrowth();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.upgradeImpl <em>upgrade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.upgradeImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getupgrade()
		 * @generated
		 */
		EClass UPGRADE = eINSTANCE.getupgrade();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPGRADE__NAME = eINSTANCE.getupgrade_Name();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPGRADE__COST = eINSTANCE.getupgrade_Cost();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPGRADE__EFFECTS = eINSTANCE.getupgrade_Effects();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPGRADE__REQUIRES = eINSTANCE.getupgrade_Requires();

		/**
		 * The meta object literal for the '<em><b>Cost Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPGRADE__COST_RESOURCE = eINSTANCE.getupgrade_CostResource();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.effectImpl <em>effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.effectImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#geteffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.geteffect();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.multiplyRateEffectImpl <em>multiply Rate Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.multiplyRateEffectImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getmultiplyRateEffect()
		 * @generated
		 */
		EClass MULTIPLY_RATE_EFFECT = eINSTANCE.getmultiplyRateEffect();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLY_RATE_EFFECT__FACTOR = eINSTANCE.getmultiplyRateEffect_Factor();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLY_RATE_EFFECT__TARGET = eINSTANCE.getmultiplyRateEffect_Target();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.reduceCostEffectImpl <em>reduce Cost Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.reduceCostEffectImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getreduceCostEffect()
		 * @generated
		 */
		EClass REDUCE_COST_EFFECT = eINSTANCE.getreduceCostEffect();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCE_COST_EFFECT__FACTOR = eINSTANCE.getreduceCostEffect_Factor();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_COST_EFFECT__TARGET = eINSTANCE.getreduceCostEffect_Target();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.unlockGeneratorEffectImpl <em>unlock Generator Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.unlockGeneratorEffectImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getunlockGeneratorEffect()
		 * @generated
		 */
		EClass UNLOCK_GENERATOR_EFFECT = eINSTANCE.getunlockGeneratorEffect();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLOCK_GENERATOR_EFFECT__TARGET = eINSTANCE.getunlockGeneratorEffect_Target();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.grantAmountEffectImpl <em>grant Amount Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.grantAmountEffectImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getgrantAmountEffect()
		 * @generated
		 */
		EClass GRANT_AMOUNT_EFFECT = eINSTANCE.getgrantAmountEffect();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANT_AMOUNT_EFFECT__AMOUNT = eINSTANCE.getgrantAmountEffect_Amount();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRANT_AMOUNT_EFFECT__TARGET = eINSTANCE.getgrantAmountEffect_Target();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.achievementImpl <em>achievement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.achievementImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getachievement()
		 * @generated
		 */
		EClass ACHIEVEMENT = eINSTANCE.getachievement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACHIEVEMENT__NAME = eINSTANCE.getachievement_Name();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACHIEVEMENT__CONDITION = eINSTANCE.getachievement_Condition();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.expressionImpl <em>expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.expressionImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getexpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getexpression();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.comparisonImpl <em>comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.comparisonImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getcomparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getcomparison();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__RESOURCE = eINSTANCE.getcomparison_Resource();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__OPERATOR = eINSTANCE.getcomparison_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__VALUE = eINSTANCE.getcomparison_Value();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.binaryExpressionImpl <em>binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.binaryExpressionImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getbinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getbinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getbinaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getbinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getbinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link clicker_Generator.impl.eventImpl <em>event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.impl.eventImpl
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getevent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getevent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getevent_Name();

		/**
		 * The meta object literal for the '<em><b>Chance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__CHANCE = eINSTANCE.getevent_Chance();

		/**
		 * The meta object literal for the '<em><b>Interval Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__INTERVAL_SECONDS = eINSTANCE.getevent_IntervalSeconds();

		/**
		 * The meta object literal for the '<em><b>Duration Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DURATION_SECONDS = eINSTANCE.getevent_DurationSeconds();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__EFFECTS = eINSTANCE.getevent_Effects();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ICON = eINSTANCE.getevent_Icon();

		/**
		 * The meta object literal for the '{@link clicker_Generator.comparisonOperator <em>comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.comparisonOperator
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getcomparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getcomparisonOperator();

		/**
		 * The meta object literal for the '{@link clicker_Generator.logicOperator <em>logic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clicker_Generator.logicOperator
		 * @see clicker_Generator.impl.Clicker_GeneratorPackageImpl#getlogicOperator()
		 * @generated
		 */
		EEnum LOGIC_OPERATOR = eINSTANCE.getlogicOperator();

	}

} //Clicker_GeneratorPackage
