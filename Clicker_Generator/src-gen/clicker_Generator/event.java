/**
 */
package clicker_Generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.event#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.event#getChance <em>Chance</em>}</li>
 *   <li>{@link clicker_Generator.event#getIntervalSeconds <em>Interval Seconds</em>}</li>
 *   <li>{@link clicker_Generator.event#getDurationSeconds <em>Duration Seconds</em>}</li>
 *   <li>{@link clicker_Generator.event#getEffects <em>Effects</em>}</li>
 *   <li>{@link clicker_Generator.event#getIcon <em>Icon</em>}</li>
 *   <li>{@link clicker_Generator.event#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getevent()
 * @model
 * @generated
 */
public interface event extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getevent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link clicker_Generator.event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chance</em>' attribute.
	 * @see #setChance(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getevent_Chance()
	 * @model
	 * @generated
	 */
	double getChance();

	/**
	 * Sets the value of the '{@link clicker_Generator.event#getChance <em>Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chance</em>' attribute.
	 * @see #getChance()
	 * @generated
	 */
	void setChance(double value);

	/**
	 * Returns the value of the '<em><b>Interval Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Seconds</em>' attribute.
	 * @see #setIntervalSeconds(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getevent_IntervalSeconds()
	 * @model
	 * @generated
	 */
	double getIntervalSeconds();

	/**
	 * Sets the value of the '{@link clicker_Generator.event#getIntervalSeconds <em>Interval Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Seconds</em>' attribute.
	 * @see #getIntervalSeconds()
	 * @generated
	 */
	void setIntervalSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Duration Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Seconds</em>' attribute.
	 * @see #setDurationSeconds(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getevent_DurationSeconds()
	 * @model
	 * @generated
	 */
	double getDurationSeconds();

	/**
	 * Sets the value of the '{@link clicker_Generator.event#getDurationSeconds <em>Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Seconds</em>' attribute.
	 * @see #getDurationSeconds()
	 * @generated
	 */
	void setDurationSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link clicker_Generator.effect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see clicker_Generator.Clicker_GeneratorPackage#getevent_Effects()
	 * @model containment="true"
	 * @generated
	 */
	EList<effect> getEffects();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getevent_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link clicker_Generator.event#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(expression)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getevent_Condition()
	 * @model containment="true"
	 * @generated
	 */
	expression getCondition();

	/**
	 * Sets the value of the '{@link clicker_Generator.event#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(expression value);

} // event
