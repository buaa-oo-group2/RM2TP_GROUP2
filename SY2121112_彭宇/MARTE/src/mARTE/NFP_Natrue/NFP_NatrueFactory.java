/**
 */
package mARTE.NFP_Natrue;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mARTE.NFP_Natrue.NFP_NatruePackage
 * @generated
 */
public interface NFP_NatrueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NFP_NatrueFactory eINSTANCE = mARTE.NFP_Natrue.impl.NFP_NatrueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Derived Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Quantity</em>'.
	 * @generated
	 */
	DerivedQuantity createDerivedQuantity();

	/**
	 * Returns a new object of class '<em>Base Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Quantity</em>'.
	 * @generated
	 */
	BaseQuantity createBaseQuantity();

	/**
	 * Returns a new object of class '<em>Sample Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Realization</em>'.
	 * @generated
	 */
	SampleRealization createSampleRealization();

	/**
	 * Returns a new object of class '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension</em>'.
	 * @generated
	 */
	Dimension createDimension();

	/**
	 * Returns a new object of class '<em>Quantitative NFP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantitative NFP</em>'.
	 * @generated
	 */
	QuantitativeNFP createQuantitativeNFP();

	/**
	 * Returns a new object of class '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure</em>'.
	 * @generated
	 */
	Measure createMeasure();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Qualitative NFP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualitative NFP</em>'.
	 * @generated
	 */
	QualitativeNFP createQualitativeNFP();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NFP_NatruePackage getNFP_NatruePackage();

} //NFP_NatrueFactory
