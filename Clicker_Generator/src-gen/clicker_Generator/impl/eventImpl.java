/**
 */
package clicker_Generator.impl;

import clicker_Generator.Clicker_GeneratorPackage;
import clicker_Generator.effect;
import clicker_Generator.event;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.impl.eventImpl#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.impl.eventImpl#getChance <em>Chance</em>}</li>
 *   <li>{@link clicker_Generator.impl.eventImpl#getIntervalSeconds <em>Interval Seconds</em>}</li>
 *   <li>{@link clicker_Generator.impl.eventImpl#getDurationSeconds <em>Duration Seconds</em>}</li>
 *   <li>{@link clicker_Generator.impl.eventImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link clicker_Generator.impl.eventImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class eventImpl extends MinimalEObjectImpl.Container implements event {
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
	 * The default value of the '{@link #getChance() <em>Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChance()
	 * @generated
	 * @ordered
	 */
	protected static final double CHANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getChance() <em>Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChance()
	 * @generated
	 * @ordered
	 */
	protected double chance = CHANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervalSeconds() <em>Interval Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double INTERVAL_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIntervalSeconds() <em>Interval Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalSeconds()
	 * @generated
	 * @ordered
	 */
	protected double intervalSeconds = INTERVAL_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationSeconds() <em>Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDurationSeconds() <em>Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationSeconds()
	 * @generated
	 * @ordered
	 */
	protected double durationSeconds = DURATION_SECONDS_EDEFAULT;

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
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected eventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Clicker_GeneratorPackage.Literals.EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getChance() {
		return chance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChance(double newChance) {
		double oldChance = chance;
		chance = newChance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.EVENT__CHANCE, oldChance,
					chance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getIntervalSeconds() {
		return intervalSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalSeconds(double newIntervalSeconds) {
		double oldIntervalSeconds = intervalSeconds;
		intervalSeconds = newIntervalSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.EVENT__INTERVAL_SECONDS,
					oldIntervalSeconds, intervalSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDurationSeconds() {
		return durationSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationSeconds(double newDurationSeconds) {
		double oldDurationSeconds = durationSeconds;
		durationSeconds = newDurationSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.EVENT__DURATION_SECONDS,
					oldDurationSeconds, durationSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<effect> getEffects() {
		if (effects == null) {
			effects = new EObjectContainmentEList<effect>(effect.class, this, Clicker_GeneratorPackage.EVENT__EFFECTS);
		}
		return effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.EVENT__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Clicker_GeneratorPackage.EVENT__EFFECTS:
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
		case Clicker_GeneratorPackage.EVENT__NAME:
			return getName();
		case Clicker_GeneratorPackage.EVENT__CHANCE:
			return getChance();
		case Clicker_GeneratorPackage.EVENT__INTERVAL_SECONDS:
			return getIntervalSeconds();
		case Clicker_GeneratorPackage.EVENT__DURATION_SECONDS:
			return getDurationSeconds();
		case Clicker_GeneratorPackage.EVENT__EFFECTS:
			return getEffects();
		case Clicker_GeneratorPackage.EVENT__ICON:
			return getIcon();
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
		case Clicker_GeneratorPackage.EVENT__NAME:
			setName((String) newValue);
			return;
		case Clicker_GeneratorPackage.EVENT__CHANCE:
			setChance((Double) newValue);
			return;
		case Clicker_GeneratorPackage.EVENT__INTERVAL_SECONDS:
			setIntervalSeconds((Double) newValue);
			return;
		case Clicker_GeneratorPackage.EVENT__DURATION_SECONDS:
			setDurationSeconds((Double) newValue);
			return;
		case Clicker_GeneratorPackage.EVENT__EFFECTS:
			getEffects().clear();
			getEffects().addAll((Collection<? extends effect>) newValue);
			return;
		case Clicker_GeneratorPackage.EVENT__ICON:
			setIcon((String) newValue);
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
		case Clicker_GeneratorPackage.EVENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.EVENT__CHANCE:
			setChance(CHANCE_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.EVENT__INTERVAL_SECONDS:
			setIntervalSeconds(INTERVAL_SECONDS_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.EVENT__DURATION_SECONDS:
			setDurationSeconds(DURATION_SECONDS_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.EVENT__EFFECTS:
			getEffects().clear();
			return;
		case Clicker_GeneratorPackage.EVENT__ICON:
			setIcon(ICON_EDEFAULT);
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
		case Clicker_GeneratorPackage.EVENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Clicker_GeneratorPackage.EVENT__CHANCE:
			return chance != CHANCE_EDEFAULT;
		case Clicker_GeneratorPackage.EVENT__INTERVAL_SECONDS:
			return intervalSeconds != INTERVAL_SECONDS_EDEFAULT;
		case Clicker_GeneratorPackage.EVENT__DURATION_SECONDS:
			return durationSeconds != DURATION_SECONDS_EDEFAULT;
		case Clicker_GeneratorPackage.EVENT__EFFECTS:
			return effects != null && !effects.isEmpty();
		case Clicker_GeneratorPackage.EVENT__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
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
		result.append(", chance: ");
		result.append(chance);
		result.append(", intervalSeconds: ");
		result.append(intervalSeconds);
		result.append(", durationSeconds: ");
		result.append(durationSeconds);
		result.append(", icon: ");
		result.append(icon);
		result.append(')');
		return result.toString();
	}

} //eventImpl
