/**
 */
package clicker_Generator.util;

import clicker_Generator.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see clicker_Generator.Clicker_GeneratorPackage
 * @generated
 */
public class Clicker_GeneratorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Clicker_GeneratorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clicker_GeneratorSwitch() {
		if (modelPackage == null) {
			modelPackage = Clicker_GeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Clicker_GeneratorPackage.GAME: {
			game game = (game) theEObject;
			T result = casegame(game);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.RESOURCE: {
			resource resource = (resource) theEObject;
			T result = caseresource(resource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.GENERATOR: {
			generator generator = (generator) theEObject;
			T result = casegenerator(generator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.UPGRADE: {
			upgrade upgrade = (upgrade) theEObject;
			T result = caseupgrade(upgrade);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.EFFECT: {
			effect effect = (effect) theEObject;
			T result = caseeffect(effect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.MULTIPLY_RATE_EFFECT: {
			multiplyRateEffect multiplyRateEffect = (multiplyRateEffect) theEObject;
			T result = casemultiplyRateEffect(multiplyRateEffect);
			if (result == null)
				result = caseeffect(multiplyRateEffect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.REDUCE_COST_EFFECT: {
			reduceCostEffect reduceCostEffect = (reduceCostEffect) theEObject;
			T result = casereduceCostEffect(reduceCostEffect);
			if (result == null)
				result = caseeffect(reduceCostEffect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.UNLOCK_GENERATOR_EFFECT: {
			unlockGeneratorEffect unlockGeneratorEffect = (unlockGeneratorEffect) theEObject;
			T result = caseunlockGeneratorEffect(unlockGeneratorEffect);
			if (result == null)
				result = caseeffect(unlockGeneratorEffect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.ACHIEVEMENT: {
			achievement achievement = (achievement) theEObject;
			T result = caseachievement(achievement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.EXPRESSION: {
			expression expression = (expression) theEObject;
			T result = caseexpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.COMPARISON: {
			comparison comparison = (comparison) theEObject;
			T result = casecomparison(comparison);
			if (result == null)
				result = caseexpression(comparison);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Clicker_GeneratorPackage.BINARY_EXPRESSION: {
			binaryExpression binaryExpression = (binaryExpression) theEObject;
			T result = casebinaryExpression(binaryExpression);
			if (result == null)
				result = caseexpression(binaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegame(game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseresource(resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegenerator(generator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>upgrade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>upgrade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseupgrade(upgrade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseeffect(effect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>multiply Rate Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>multiply Rate Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemultiplyRateEffect(multiplyRateEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>reduce Cost Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>reduce Cost Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereduceCostEffect(reduceCostEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>unlock Generator Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>unlock Generator Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseunlockGeneratorEffect(unlockGeneratorEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>achievement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>achievement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseachievement(achievement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseexpression(expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecomparison(comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebinaryExpression(binaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Clicker_GeneratorSwitch
