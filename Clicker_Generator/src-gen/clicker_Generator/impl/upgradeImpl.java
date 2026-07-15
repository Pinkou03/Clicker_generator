/**
 */
package clicker_Generator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import clicker_Generator.Clicker_GeneratorPackage;
import clicker_Generator.effect;
import clicker_Generator.resource;
import clicker_Generator.upgrade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>upgrade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.impl.upgradeImpl#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.impl.upgradeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link clicker_Generator.impl.upgradeImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link clicker_Generator.impl.upgradeImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link clicker_Generator.impl.upgradeImpl#getCostResource <em>Cost Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class upgradeImpl extends MinimalEObjectImpl.Container implements upgrade {
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
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<effect> effects;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<upgrade> requires;

	/**
	 * The cached value of the '{@link #getCostResource() <em>Cost Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostResource()
	 * @generated
	 * @ordered
	 */
	protected resource costResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected upgradeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Clicker_GeneratorPackage.Literals.UPGRADE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.UPGRADE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.UPGRADE__COST, oldCost,
					cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<effect> getEffects() {
		if (effects == null) {
			effects = new EObjectContainmentEList<effect>(effect.class, this,
					Clicker_GeneratorPackage.UPGRADE__EFFECTS);
		}
		return effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<upgrade> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<upgrade>(upgrade.class, this,
					Clicker_GeneratorPackage.UPGRADE__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public resource getCostResource() {
		if (costResource != null && costResource.eIsProxy()) {
			InternalEObject oldCostResource = (InternalEObject) costResource;
			costResource = (resource) eResolveProxy(oldCostResource);
			if (costResource != oldCostResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Clicker_GeneratorPackage.UPGRADE__COST_RESOURCE, oldCostResource, costResource));
			}
		}
		return costResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resource basicGetCostResource() {
		return costResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostResource(resource newCostResource) {
		resource oldCostResource = costResource;
		costResource = newCostResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.UPGRADE__COST_RESOURCE,
					oldCostResource, costResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Clicker_GeneratorPackage.UPGRADE__EFFECTS:
			return ((InternalEList<?>) getEffects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Clicker_GeneratorPackage.UPGRADE__NAME:
			return getName();
		case Clicker_GeneratorPackage.UPGRADE__COST:
			return getCost();
		case Clicker_GeneratorPackage.UPGRADE__EFFECTS:
			return getEffects();
		case Clicker_GeneratorPackage.UPGRADE__REQUIRES:
			return getRequires();
		case Clicker_GeneratorPackage.UPGRADE__COST_RESOURCE:
			if (resolve)
				return getCostResource();
			return basicGetCostResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Clicker_GeneratorPackage.UPGRADE__NAME:
			setName((String) newValue);
			return;
		case Clicker_GeneratorPackage.UPGRADE__COST:
			setCost((Double) newValue);
			return;
		case Clicker_GeneratorPackage.UPGRADE__EFFECTS:
			getEffects().clear();
			getEffects().addAll((Collection<? extends effect>) newValue);
			return;
		case Clicker_GeneratorPackage.UPGRADE__REQUIRES:
			getRequires().clear();
			getRequires().addAll((Collection<? extends upgrade>) newValue);
			return;
		case Clicker_GeneratorPackage.UPGRADE__COST_RESOURCE:
			setCostResource((resource) newValue);
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
		case Clicker_GeneratorPackage.UPGRADE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.UPGRADE__COST:
			setCost(COST_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.UPGRADE__EFFECTS:
			getEffects().clear();
			return;
		case Clicker_GeneratorPackage.UPGRADE__REQUIRES:
			getRequires().clear();
			return;
		case Clicker_GeneratorPackage.UPGRADE__COST_RESOURCE:
			setCostResource((resource) null);
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
		case Clicker_GeneratorPackage.UPGRADE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Clicker_GeneratorPackage.UPGRADE__COST:
			return cost != COST_EDEFAULT;
		case Clicker_GeneratorPackage.UPGRADE__EFFECTS:
			return effects != null && !effects.isEmpty();
		case Clicker_GeneratorPackage.UPGRADE__REQUIRES:
			return requires != null && !requires.isEmpty();
		case Clicker_GeneratorPackage.UPGRADE__COST_RESOURCE:
			return costResource != null;
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
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //upgradeImpl
