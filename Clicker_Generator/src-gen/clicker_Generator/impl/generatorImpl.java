/**
 */
package clicker_Generator.impl;

import clicker_Generator.Clicker_GeneratorPackage;
import clicker_Generator.generator;
import clicker_Generator.resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.impl.generatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.impl.generatorImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link clicker_Generator.impl.generatorImpl#getBaseRate <em>Base Rate</em>}</li>
 *   <li>{@link clicker_Generator.impl.generatorImpl#getBaseCost <em>Base Cost</em>}</li>
 *   <li>{@link clicker_Generator.impl.generatorImpl#getCostGrowth <em>Cost Growth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class generatorImpl extends MinimalEObjectImpl.Container implements generator {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected resource produces;

	/**
	 * The default value of the '{@link #getBaseRate() <em>Base Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseRate()
	 * @generated
	 * @ordered
	 */
	protected static final double BASE_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBaseRate() <em>Base Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseRate()
	 * @generated
	 * @ordered
	 */
	protected double baseRate = BASE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseCost() <em>Base Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCost()
	 * @generated
	 * @ordered
	 */
	protected static final double BASE_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBaseCost() <em>Base Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCost()
	 * @generated
	 * @ordered
	 */
	protected double baseCost = BASE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostGrowth() <em>Cost Growth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostGrowth()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_GROWTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCostGrowth() <em>Cost Growth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostGrowth()
	 * @generated
	 * @ordered
	 */
	protected double costGrowth = COST_GROWTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected generatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Clicker_GeneratorPackage.Literals.GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.GENERATOR__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public resource getProduces() {
		if (produces != null && produces.eIsProxy()) {
			InternalEObject oldProduces = (InternalEObject) produces;
			produces = (resource) eResolveProxy(oldProduces);
			if (produces != oldProduces) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Clicker_GeneratorPackage.GENERATOR__PRODUCES, oldProduces, produces));
			}
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resource basicGetProduces() {
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduces(resource newProduces) {
		resource oldProduces = produces;
		produces = newProduces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.GENERATOR__PRODUCES,
					oldProduces, produces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBaseRate() {
		return baseRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseRate(double newBaseRate) {
		double oldBaseRate = baseRate;
		baseRate = newBaseRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.GENERATOR__BASE_RATE,
					oldBaseRate, baseRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBaseCost() {
		return baseCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseCost(double newBaseCost) {
		double oldBaseCost = baseCost;
		baseCost = newBaseCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.GENERATOR__BASE_COST,
					oldBaseCost, baseCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCostGrowth() {
		return costGrowth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostGrowth(double newCostGrowth) {
		double oldCostGrowth = costGrowth;
		costGrowth = newCostGrowth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.GENERATOR__COST_GROWTH,
					oldCostGrowth, costGrowth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Clicker_GeneratorPackage.GENERATOR__NAME:
			return getName();
		case Clicker_GeneratorPackage.GENERATOR__PRODUCES:
			if (resolve)
				return getProduces();
			return basicGetProduces();
		case Clicker_GeneratorPackage.GENERATOR__BASE_RATE:
			return getBaseRate();
		case Clicker_GeneratorPackage.GENERATOR__BASE_COST:
			return getBaseCost();
		case Clicker_GeneratorPackage.GENERATOR__COST_GROWTH:
			return getCostGrowth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Clicker_GeneratorPackage.GENERATOR__NAME:
			setName((String) newValue);
			return;
		case Clicker_GeneratorPackage.GENERATOR__PRODUCES:
			setProduces((resource) newValue);
			return;
		case Clicker_GeneratorPackage.GENERATOR__BASE_RATE:
			setBaseRate((Double) newValue);
			return;
		case Clicker_GeneratorPackage.GENERATOR__BASE_COST:
			setBaseCost((Double) newValue);
			return;
		case Clicker_GeneratorPackage.GENERATOR__COST_GROWTH:
			setCostGrowth((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Clicker_GeneratorPackage.GENERATOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.GENERATOR__PRODUCES:
			setProduces((resource) null);
			return;
		case Clicker_GeneratorPackage.GENERATOR__BASE_RATE:
			setBaseRate(BASE_RATE_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.GENERATOR__BASE_COST:
			setBaseCost(BASE_COST_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.GENERATOR__COST_GROWTH:
			setCostGrowth(COST_GROWTH_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Clicker_GeneratorPackage.GENERATOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Clicker_GeneratorPackage.GENERATOR__PRODUCES:
			return produces != null;
		case Clicker_GeneratorPackage.GENERATOR__BASE_RATE:
			return baseRate != BASE_RATE_EDEFAULT;
		case Clicker_GeneratorPackage.GENERATOR__BASE_COST:
			return baseCost != BASE_COST_EDEFAULT;
		case Clicker_GeneratorPackage.GENERATOR__COST_GROWTH:
			return costGrowth != COST_GROWTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", baseRate: ");
		result.append(baseRate);
		result.append(", baseCost: ");
		result.append(baseCost);
		result.append(", costGrowth: ");
		result.append(costGrowth);
		result.append(')');
		return result.toString();
	}

} //generatorImpl
