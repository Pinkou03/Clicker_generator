/**
 */
package clicker_Generator.util;

import clicker_Generator.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see clicker_Generator.Clicker_GeneratorPackage
 * @generated
 */
public class Clicker_GeneratorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Clicker_GeneratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clicker_GeneratorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Clicker_GeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Clicker_GeneratorSwitch<Adapter> modelSwitch = new Clicker_GeneratorSwitch<Adapter>() {
		@Override
		public Adapter casegame(game object) {
			return creategameAdapter();
		}

		@Override
		public Adapter caseresource(resource object) {
			return createresourceAdapter();
		}

		@Override
		public Adapter casegenerator(generator object) {
			return creategeneratorAdapter();
		}

		@Override
		public Adapter caseupgrade(upgrade object) {
			return createupgradeAdapter();
		}

		@Override
		public Adapter caseeffect(effect object) {
			return createeffectAdapter();
		}

		@Override
		public Adapter casemultiplyRateEffect(multiplyRateEffect object) {
			return createmultiplyRateEffectAdapter();
		}

		@Override
		public Adapter casereduceCostEffect(reduceCostEffect object) {
			return createreduceCostEffectAdapter();
		}

		@Override
		public Adapter caseunlockGeneratorEffect(unlockGeneratorEffect object) {
			return createunlockGeneratorEffectAdapter();
		}

		@Override
		public Adapter casegrantAmountEffect(grantAmountEffect object) {
			return creategrantAmountEffectAdapter();
		}

		@Override
		public Adapter caseachievement(achievement object) {
			return createachievementAdapter();
		}

		@Override
		public Adapter caseexpression(expression object) {
			return createexpressionAdapter();
		}

		@Override
		public Adapter casecomparison(comparison object) {
			return createcomparisonAdapter();
		}

		@Override
		public Adapter casebinaryExpression(binaryExpression object) {
			return createbinaryExpressionAdapter();
		}

		@Override
		public Adapter caseevent(event object) {
			return createeventAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.game <em>game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.game
	 * @generated
	 */
	public Adapter creategameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.resource <em>resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.resource
	 * @generated
	 */
	public Adapter createresourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.generator <em>generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.generator
	 * @generated
	 */
	public Adapter creategeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.upgrade <em>upgrade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.upgrade
	 * @generated
	 */
	public Adapter createupgradeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.effect <em>effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.effect
	 * @generated
	 */
	public Adapter createeffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.multiplyRateEffect <em>multiply Rate Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.multiplyRateEffect
	 * @generated
	 */
	public Adapter createmultiplyRateEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.reduceCostEffect <em>reduce Cost Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.reduceCostEffect
	 * @generated
	 */
	public Adapter createreduceCostEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.unlockGeneratorEffect <em>unlock Generator Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.unlockGeneratorEffect
	 * @generated
	 */
	public Adapter createunlockGeneratorEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.grantAmountEffect <em>grant Amount Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.grantAmountEffect
	 * @generated
	 */
	public Adapter creategrantAmountEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.achievement <em>achievement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.achievement
	 * @generated
	 */
	public Adapter createachievementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.expression <em>expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.expression
	 * @generated
	 */
	public Adapter createexpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.comparison <em>comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.comparison
	 * @generated
	 */
	public Adapter createcomparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.binaryExpression <em>binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.binaryExpression
	 * @generated
	 */
	public Adapter createbinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link clicker_Generator.event <em>event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see clicker_Generator.event
	 * @generated
	 */
	public Adapter createeventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Clicker_GeneratorAdapterFactory
