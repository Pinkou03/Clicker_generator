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
import org.eclipse.emf.ecore.util.InternalEList;

import clicker_Generator.Clicker_GeneratorPackage;
import clicker_Generator.achievement;
import clicker_Generator.event;
import clicker_Generator.game;
import clicker_Generator.generator;
import clicker_Generator.resource;
import clicker_Generator.upgrade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.impl.gameImpl#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.impl.gameImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link clicker_Generator.impl.gameImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link clicker_Generator.impl.gameImpl#getUpgrades <em>Upgrades</em>}</li>
 *   <li>{@link clicker_Generator.impl.gameImpl#getAchievements <em>Achievements</em>}</li>
 *   <li>{@link clicker_Generator.impl.gameImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class gameImpl extends MinimalEObjectImpl.Container implements game {
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
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<resource> resources;

	/**
	 * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<generator> generators;

	/**
	 * The cached value of the '{@link #getUpgrades() <em>Upgrades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgrades()
	 * @generated
	 * @ordered
	 */
	protected EList<upgrade> upgrades;

	/**
	 * The cached value of the '{@link #getAchievements() <em>Achievements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAchievements()
	 * @generated
	 * @ordered
	 */
	protected EList<achievement> achievements;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<event> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected gameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Clicker_GeneratorPackage.Literals.GAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.GAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<resource>(resource.class, this,
					Clicker_GeneratorPackage.GAME__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<generator> getGenerators() {
		if (generators == null) {
			generators = new EObjectContainmentEList<generator>(generator.class, this,
					Clicker_GeneratorPackage.GAME__GENERATORS);
		}
		return generators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<upgrade> getUpgrades() {
		if (upgrades == null) {
			upgrades = new EObjectContainmentEList<upgrade>(upgrade.class, this,
					Clicker_GeneratorPackage.GAME__UPGRADES);
		}
		return upgrades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<achievement> getAchievements() {
		if (achievements == null) {
			achievements = new EObjectContainmentEList<achievement>(achievement.class, this,
					Clicker_GeneratorPackage.GAME__ACHIEVEMENTS);
		}
		return achievements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<event>(event.class, this, Clicker_GeneratorPackage.GAME__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Clicker_GeneratorPackage.GAME__RESOURCES:
			return ((InternalEList<?>) getResources()).basicRemove(otherEnd, msgs);
		case Clicker_GeneratorPackage.GAME__GENERATORS:
			return ((InternalEList<?>) getGenerators()).basicRemove(otherEnd, msgs);
		case Clicker_GeneratorPackage.GAME__UPGRADES:
			return ((InternalEList<?>) getUpgrades()).basicRemove(otherEnd, msgs);
		case Clicker_GeneratorPackage.GAME__ACHIEVEMENTS:
			return ((InternalEList<?>) getAchievements()).basicRemove(otherEnd, msgs);
		case Clicker_GeneratorPackage.GAME__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
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
		case Clicker_GeneratorPackage.GAME__NAME:
			return getName();
		case Clicker_GeneratorPackage.GAME__RESOURCES:
			return getResources();
		case Clicker_GeneratorPackage.GAME__GENERATORS:
			return getGenerators();
		case Clicker_GeneratorPackage.GAME__UPGRADES:
			return getUpgrades();
		case Clicker_GeneratorPackage.GAME__ACHIEVEMENTS:
			return getAchievements();
		case Clicker_GeneratorPackage.GAME__EVENTS:
			return getEvents();
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
		case Clicker_GeneratorPackage.GAME__NAME:
			setName((String) newValue);
			return;
		case Clicker_GeneratorPackage.GAME__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends resource>) newValue);
			return;
		case Clicker_GeneratorPackage.GAME__GENERATORS:
			getGenerators().clear();
			getGenerators().addAll((Collection<? extends generator>) newValue);
			return;
		case Clicker_GeneratorPackage.GAME__UPGRADES:
			getUpgrades().clear();
			getUpgrades().addAll((Collection<? extends upgrade>) newValue);
			return;
		case Clicker_GeneratorPackage.GAME__ACHIEVEMENTS:
			getAchievements().clear();
			getAchievements().addAll((Collection<? extends achievement>) newValue);
			return;
		case Clicker_GeneratorPackage.GAME__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends event>) newValue);
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
		case Clicker_GeneratorPackage.GAME__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.GAME__RESOURCES:
			getResources().clear();
			return;
		case Clicker_GeneratorPackage.GAME__GENERATORS:
			getGenerators().clear();
			return;
		case Clicker_GeneratorPackage.GAME__UPGRADES:
			getUpgrades().clear();
			return;
		case Clicker_GeneratorPackage.GAME__ACHIEVEMENTS:
			getAchievements().clear();
			return;
		case Clicker_GeneratorPackage.GAME__EVENTS:
			getEvents().clear();
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
		case Clicker_GeneratorPackage.GAME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Clicker_GeneratorPackage.GAME__RESOURCES:
			return resources != null && !resources.isEmpty();
		case Clicker_GeneratorPackage.GAME__GENERATORS:
			return generators != null && !generators.isEmpty();
		case Clicker_GeneratorPackage.GAME__UPGRADES:
			return upgrades != null && !upgrades.isEmpty();
		case Clicker_GeneratorPackage.GAME__ACHIEVEMENTS:
			return achievements != null && !achievements.isEmpty();
		case Clicker_GeneratorPackage.GAME__EVENTS:
			return events != null && !events.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //gameImpl
