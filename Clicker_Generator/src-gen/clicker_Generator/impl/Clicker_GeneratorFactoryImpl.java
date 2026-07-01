/**
 */
package clicker_Generator.impl;

import clicker_Generator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Clicker_GeneratorFactoryImpl extends EFactoryImpl implements Clicker_GeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Clicker_GeneratorFactory init() {
		try {
			Clicker_GeneratorFactory theClicker_GeneratorFactory = (Clicker_GeneratorFactory) EPackage.Registry.INSTANCE
					.getEFactory(Clicker_GeneratorPackage.eNS_URI);
			if (theClicker_GeneratorFactory != null) {
				return theClicker_GeneratorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Clicker_GeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clicker_GeneratorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Clicker_GeneratorPackage.GAME:
			return creategame();
		case Clicker_GeneratorPackage.RESOURCES:
			return createresources();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public game creategame() {
		gameImpl game = new gameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public resources createresources() {
		resourcesImpl resources = new resourcesImpl();
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clicker_GeneratorPackage getClicker_GeneratorPackage() {
		return (Clicker_GeneratorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Clicker_GeneratorPackage getPackage() {
		return Clicker_GeneratorPackage.eINSTANCE;
	}

} //Clicker_GeneratorFactoryImpl
