/**
 */
package clicker_Generator.impl;

import clicker_Generator.Clicker_GeneratorPackage;
import clicker_Generator.resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.impl.resourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.impl.resourceImpl#getStartAmount <em>Start Amount</em>}</li>
 *   <li>{@link clicker_Generator.impl.resourceImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class resourceImpl extends MinimalEObjectImpl.Container implements resource {
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
	 * The default value of the '{@link #getStartAmount() <em>Start Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double START_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartAmount() <em>Start Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAmount()
	 * @generated
	 * @ordered
	 */
	protected double startAmount = START_AMOUNT_EDEFAULT;

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
	protected resourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Clicker_GeneratorPackage.Literals.RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.RESOURCE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStartAmount() {
		return startAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartAmount(double newStartAmount) {
		double oldStartAmount = startAmount;
		startAmount = newStartAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.RESOURCE__START_AMOUNT,
					oldStartAmount, startAmount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Clicker_GeneratorPackage.RESOURCE__ICON, oldIcon,
					icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Clicker_GeneratorPackage.RESOURCE__NAME:
			return getName();
		case Clicker_GeneratorPackage.RESOURCE__START_AMOUNT:
			return getStartAmount();
		case Clicker_GeneratorPackage.RESOURCE__ICON:
			return getIcon();
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
		case Clicker_GeneratorPackage.RESOURCE__NAME:
			setName((String) newValue);
			return;
		case Clicker_GeneratorPackage.RESOURCE__START_AMOUNT:
			setStartAmount((Double) newValue);
			return;
		case Clicker_GeneratorPackage.RESOURCE__ICON:
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
		case Clicker_GeneratorPackage.RESOURCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.RESOURCE__START_AMOUNT:
			setStartAmount(START_AMOUNT_EDEFAULT);
			return;
		case Clicker_GeneratorPackage.RESOURCE__ICON:
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
		case Clicker_GeneratorPackage.RESOURCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Clicker_GeneratorPackage.RESOURCE__START_AMOUNT:
			return startAmount != START_AMOUNT_EDEFAULT;
		case Clicker_GeneratorPackage.RESOURCE__ICON:
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
		result.append(", startAmount: ");
		result.append(startAmount);
		result.append(", icon: ");
		result.append(icon);
		result.append(')');
		return result.toString();
	}

} //resourceImpl
