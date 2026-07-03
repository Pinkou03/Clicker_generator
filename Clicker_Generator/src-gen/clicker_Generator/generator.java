/**
 */
package clicker_Generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clicker_Generator.generator#getName <em>Name</em>}</li>
 *   <li>{@link clicker_Generator.generator#getProduces <em>Produces</em>}</li>
 *   <li>{@link clicker_Generator.generator#getBaseRate <em>Base Rate</em>}</li>
 *   <li>{@link clicker_Generator.generator#getBaseCost <em>Base Cost</em>}</li>
 *   <li>{@link clicker_Generator.generator#getCostGrowth <em>Cost Growth</em>}</li>
 * </ul>
 *
 * @see clicker_Generator.Clicker_GeneratorPackage#getgenerator()
 * @model
 * @generated
 */
public interface generator extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgenerator_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link clicker_Generator.generator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' reference.
	 * @see #setProduces(resource)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgenerator_Produces()
	 * @model
	 * @generated
	 */
	resource getProduces();

	/**
	 * Sets the value of the '{@link clicker_Generator.generator#getProduces <em>Produces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produces</em>' reference.
	 * @see #getProduces()
	 * @generated
	 */
	void setProduces(resource value);

	/**
	 * Returns the value of the '<em><b>Base Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Rate</em>' attribute.
	 * @see #setBaseRate(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgenerator_BaseRate()
	 * @model
	 * @generated
	 */
	double getBaseRate();

	/**
	 * Sets the value of the '{@link clicker_Generator.generator#getBaseRate <em>Base Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Rate</em>' attribute.
	 * @see #getBaseRate()
	 * @generated
	 */
	void setBaseRate(double value);

	/**
	 * Returns the value of the '<em><b>Base Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Cost</em>' attribute.
	 * @see #setBaseCost(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgenerator_BaseCost()
	 * @model
	 * @generated
	 */
	double getBaseCost();

	/**
	 * Sets the value of the '{@link clicker_Generator.generator#getBaseCost <em>Base Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Cost</em>' attribute.
	 * @see #getBaseCost()
	 * @generated
	 */
	void setBaseCost(double value);

	/**
	 * Returns the value of the '<em><b>Cost Growth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Growth</em>' attribute.
	 * @see #setCostGrowth(double)
	 * @see clicker_Generator.Clicker_GeneratorPackage#getgenerator_CostGrowth()
	 * @model
	 * @generated
	 */
	double getCostGrowth();

	/**
	 * Sets the value of the '{@link clicker_Generator.generator#getCostGrowth <em>Cost Growth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Growth</em>' attribute.
	 * @see #getCostGrowth()
	 * @generated
	 */
	void setCostGrowth(double value);

} // generator
