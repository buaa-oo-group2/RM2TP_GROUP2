/**
 */
package mARTE.NFP_Declaration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mARTE.NFP_Declaration.NFP_DeclarationPackage
 * @generated
 */
public interface NFP_DeclarationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NFP_DeclarationFactory eINSTANCE = mARTE.NFP_Declaration.impl.NFP_DeclarationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>NFP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP</em>'.
	 * @generated
	 */
	NFP createNFP();

	/**
	 * Returns a new object of class '<em>NFP Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Type</em>'.
	 * @generated
	 */
	NFP_Type createNFP_Type();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NFP_DeclarationPackage getNFP_DeclarationPackage();

} //NFP_DeclarationFactory
