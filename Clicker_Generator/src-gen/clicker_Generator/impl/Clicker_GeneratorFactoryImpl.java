/**
 */
package clicker_Generator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import clicker_Generator.Clicker_GeneratorFactory;
import clicker_Generator.Clicker_GeneratorPackage;
import clicker_Generator.achievement;
import clicker_Generator.binaryExpression;
import clicker_Generator.comparison;
import clicker_Generator.comparisonOperator;
import clicker_Generator.event;
import clicker_Generator.game;
import clicker_Generator.generator;
import clicker_Generator.grantAmountEffect;
import clicker_Generator.logicOperator;
import clicker_Generator.multiplyRateEffect;
import clicker_Generator.reduceCostEffect;
import clicker_Generator.resource;
import clicker_Generator.unlockGeneratorEffect;
import clicker_Generator.upgrade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Clicker_GeneratorFactoryImpl extends EFactoryImpl implements Clicker_GeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Clicker_GeneratorFactory init() {
		try {
			Clicker_GeneratorFactory theClicker_GeneratorFactory = (Clicker_GeneratorFactory) EPackage.Registry.INSTANCE
					.getEFactory(Clicker_GeneratorPackage.eNS_URI);
			if (theClicker_GeneratorFactory != null) {
				return theClicker_GeneratorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Clicker_GeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clicker_GeneratorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Clicker_GeneratorPackage.GAME:
			return creategame();
		case Clicker_GeneratorPackage.RESOURCE:
			return createresource();
		case Clicker_GeneratorPackage.GENERATOR:
			return creategenerator();
		case Clicker_GeneratorPackage.UPGRADE:
			return createupgrade();
		case Clicker_GeneratorPackage.MULTIPLY_RATE_EFFECT:
			return createmultiplyRateEffect();
		case Clicker_GeneratorPackage.REDUCE_COST_EFFECT:
			return createreduceCostEffect();
		case Clicker_GeneratorPackage.UNLOCK_GENERATOR_EFFECT:
			return createunlockGeneratorEffect();
		case Clicker_GeneratorPackage.GRANT_AMOUNT_EFFECT:
			return creategrantAmountEffect();
		case Clicker_GeneratorPackage.ACHIEVEMENT:
			return createachievement();
		case Clicker_GeneratorPackage.COMPARISON:
			return createcomparison();
		case Clicker_GeneratorPackage.BINARY_EXPRESSION:
			return createbinaryExpression();
		case Clicker_GeneratorPackage.EVENT:
			return createevent();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Clicker_GeneratorPackage.COMPARISON_OPERATOR:
			return createcomparisonOperatorFromString(eDataType, initialValue);
		case Clicker_GeneratorPackage.LOGIC_OPERATOR:
			return createlogicOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Clicker_GeneratorPackage.COMPARISON_OPERATOR:
			return convertcomparisonOperatorToString(eDataType, instanceValue);
		case Clicker_GeneratorPackage.LOGIC_OPERATOR:
			return convertlogicOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public game creategame() {
		gameImpl game = new gameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public resource createresource() {
		resourceImpl resource = new resourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public generator creategenerator() {
		generatorImpl generator = new generatorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public upgrade createupgrade() {
		upgradeImpl upgrade = new upgradeImpl();
		return upgrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public multiplyRateEffect createmultiplyRateEffect() {
		multiplyRateEffectImpl multiplyRateEffect = new multiplyRateEffectImpl();
		return multiplyRateEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public reduceCostEffect createreduceCostEffect() {
		reduceCostEffectImpl reduceCostEffect = new reduceCostEffectImpl();
		return reduceCostEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public unlockGeneratorEffect createunlockGeneratorEffect() {
		unlockGeneratorEffectImpl unlockGeneratorEffect = new unlockGeneratorEffectImpl();
		return unlockGeneratorEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public grantAmountEffect creategrantAmountEffect() {
		grantAmountEffectImpl grantAmountEffect = new grantAmountEffectImpl();
		return grantAmountEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public achievement createachievement() {
		achievementImpl achievement = new achievementImpl();
		return achievement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public comparison createcomparison() {
		comparisonImpl comparison = new comparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public binaryExpression createbinaryExpression() {
		binaryExpressionImpl binaryExpression = new binaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public event createevent() {
		eventImpl event = new eventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comparisonOperator createcomparisonOperatorFromString(EDataType eDataType, String initialValue) {
		comparisonOperator result = comparisonOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcomparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public logicOperator createlogicOperatorFromString(EDataType eDataType, String initialValue) {
		logicOperator result = logicOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlogicOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clicker_GeneratorPackage getClicker_GeneratorPackage() {
		return (Clicker_GeneratorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Clicker_GeneratorPackage getPackage() {
		return Clicker_GeneratorPackage.eINSTANCE;
	}

} //Clicker_GeneratorFactoryImpl
