/**
 */
package clicker_Generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.game#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.game#getResources <em>Resources</em>}</li>
 *   <li>{@link clicker_Generator.game#getGenerators <em>Generators</em>}</li>
 *   <li>{@link clicker_Generator.game#getUpgrades <em>Upgrades</em>}</li>
 *   <li>{@link clicker_Generator.game#getAchievements <em>Achievements</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getgame()
 * @model
 * @generated
 */
public interface game extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgame_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link clicker_Generator.game#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link clicker_Generator.resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgame_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<resource> getResources();

	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link clicker_Generator.generator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgame_Generators()
	 * @model containment="true"
	 * @generated
	 */
	EList<generator> getGenerators();

	/**
	 * Returns the value of the '<em><b>Upgrades</b></em>' containment reference list.
	 * The list contents are of type {@link clicker_Generator.upgrade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upgrades</em>' containment reference list.
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgame_Upgrades()
	 * @model containment="true"
	 * @generated
	 */
	EList<upgrade> getUpgrades();

	/**
	 * Returns the value of the '<em><b>Achievements</b></em>' containment reference list.
	 * The list contents are of type {@link clicker_Generator.achievement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Achievements</em>' containment reference list.
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgame_Achievements()
	 * @model containment="true"
	 * @generated
	 */
	EList<achievement> getAchievements();

} // game
