/**
 */
package mARTE;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mARTE.MARTEPackage
 * @generated
 */
public interface MARTEFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MARTEFactory eINSTANCE = mARTE.impl.MARTEFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension</em>'.
	 * @generated
	 */
	Dimension createDimension();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure</em>'.
	 * @generated
	 */
	Measure createMeasure();

	/**
	 * Returns a new object of class '<em>Sample Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Realization</em>'.
	 * @generated
	 */
	SampleRealization createSampleRealization();

	/**
	 * Returns a new object of class '<em>Quantitative NFP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantitative NFP</em>'.
	 * @generated
	 */
	QuantitativeNFP createQuantitativeNFP();

	/**
	 * Returns a new object of class '<em>Qualitative NFP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualitative NFP</em>'.
	 * @generated
	 */
	QualitativeNFP createQualitativeNFP();

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
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotated Element</em>'.
	 * @generated
	 */
	AnnotatedElement createAnnotatedElement();

	/**
	 * Returns a new object of class '<em>Annotated Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotated Model</em>'.
	 * @generated
	 */
	AnnotatedModel createAnnotatedModel();

	/**
	 * Returns a new object of class '<em>Modeling Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modeling Concern</em>'.
	 * @generated
	 */
	ModelingConcern createModelingConcern();

	/**
	 * Returns a new object of class '<em>NFP Constrain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Constrain</em>'.
	 * @generated
	 */
	NFP_Constrain createNFP_Constrain();

	/**
	 * Returns a new object of class '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode</em>'.
	 * @generated
	 */
	Mode createMode();

	/**
	 * Returns a new object of class '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Specification</em>'.
	 * @generated
	 */
	ValueSpecification createValueSpecification();

	/**
	 * Returns a new object of class '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation</em>'.
	 * @generated
	 */
	Allocation createAllocation();

	/**
	 * Returns a new object of class '<em>NFP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Constraint</em>'.
	 * @generated
	 */
	NFP_Constraint createNFP_Constraint();

	/**
	 * Returns a new object of class '<em>Application Allocation End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Allocation End</em>'.
	 * @generated
	 */
	ApplicationAllocationEnd createApplicationAllocationEnd();

	/**
	 * Returns a new object of class '<em>Execution Platform Allocation End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Platform Allocation End</em>'.
	 * @generated
	 */
	ExecutionPlatformAllocationEnd createExecutionPlatformAllocationEnd();

	/**
	 * Returns a new object of class '<em>Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refinement</em>'.
	 * @generated
	 */
	Refinement createRefinement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MARTEPackage getMARTEPackage();

} //MARTEFactory
