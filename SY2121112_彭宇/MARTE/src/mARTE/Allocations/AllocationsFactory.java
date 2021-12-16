/**
 */
package mARTE.Allocations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mARTE.Allocations.AllocationsPackage
 * @generated
 */
public interface AllocationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocationsFactory eINSTANCE = mARTE.Allocations.impl.AllocationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Execution Platform Allocation End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Platform Allocation End</em>'.
	 * @generated
	 */
	ExecutionPlatformAllocationEnd createExecutionPlatformAllocationEnd();

	/**
	 * Returns a new object of class '<em>Application Allocation End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Allocation End</em>'.
	 * @generated
	 */
	ApplicationAllocationEnd createApplicationAllocationEnd();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AllocationsPackage getAllocationsPackage();

} //AllocationsFactory
