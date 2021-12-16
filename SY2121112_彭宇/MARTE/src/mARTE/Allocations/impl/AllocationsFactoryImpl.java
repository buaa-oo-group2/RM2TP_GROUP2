/**
 */
package mARTE.Allocations.impl;

import mARTE.Allocations.*;

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
public class AllocationsFactoryImpl extends EFactoryImpl implements AllocationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AllocationsFactory init() {
		try {
			AllocationsFactory theAllocationsFactory = (AllocationsFactory)EPackage.Registry.INSTANCE.getEFactory(AllocationsPackage.eNS_URI);
			if (theAllocationsFactory != null) {
				return theAllocationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AllocationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationsFactoryImpl() {
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
			case AllocationsPackage.EXECUTION_PLATFORM_ALLOCATION_END: return createExecutionPlatformAllocationEnd();
			case AllocationsPackage.APPLICATION_ALLOCATION_END: return createApplicationAllocationEnd();
			case AllocationsPackage.ALLOCATION: return createAllocation();
			case AllocationsPackage.NFP_CONSTRAINT: return createNFP_Constraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPlatformAllocationEnd createExecutionPlatformAllocationEnd() {
		ExecutionPlatformAllocationEndImpl executionPlatformAllocationEnd = new ExecutionPlatformAllocationEndImpl();
		return executionPlatformAllocationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAllocationEnd createApplicationAllocationEnd() {
		ApplicationAllocationEndImpl applicationAllocationEnd = new ApplicationAllocationEndImpl();
		return applicationAllocationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation createAllocation() {
		AllocationImpl allocation = new AllocationImpl();
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Constraint createNFP_Constraint() {
		NFP_ConstraintImpl nfP_Constraint = new NFP_ConstraintImpl();
		return nfP_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationsPackage getAllocationsPackage() {
		return (AllocationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AllocationsPackage getPackage() {
		return AllocationsPackage.eINSTANCE;
	}

} //AllocationsFactoryImpl
