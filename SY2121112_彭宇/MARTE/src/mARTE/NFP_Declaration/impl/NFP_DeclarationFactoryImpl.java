/**
 */
package mARTE.NFP_Declaration.impl;

import mARTE.NFP_Declaration.*;

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
public class NFP_DeclarationFactoryImpl extends EFactoryImpl implements NFP_DeclarationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NFP_DeclarationFactory init() {
		try {
			NFP_DeclarationFactory theNFP_DeclarationFactory = (NFP_DeclarationFactory)EPackage.Registry.INSTANCE.getEFactory(NFP_DeclarationPackage.eNS_URI);
			if (theNFP_DeclarationFactory != null) {
				return theNFP_DeclarationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NFP_DeclarationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DeclarationFactoryImpl() {
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
			case NFP_DeclarationPackage.NFP: return createNFP();
			case NFP_DeclarationPackage.NFP_TYPE: return createNFP_Type();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP createNFP() {
		NFPImpl nfp = new NFPImpl();
		return nfp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Type createNFP_Type() {
		NFP_TypeImpl nfP_Type = new NFP_TypeImpl();
		return nfP_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DeclarationPackage getNFP_DeclarationPackage() {
		return (NFP_DeclarationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NFP_DeclarationPackage getPackage() {
		return NFP_DeclarationPackage.eINSTANCE;
	}

} //NFP_DeclarationFactoryImpl
