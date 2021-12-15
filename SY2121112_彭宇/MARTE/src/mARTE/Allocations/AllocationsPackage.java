/**
 */
package mARTE.Allocations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mARTE.Allocations.AllocationsFactory
 * @model kind="package"
 * @generated
 */
public interface AllocationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Allocations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mARTE/Allocations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "allocations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocationsPackage eINSTANCE = mARTE.Allocations.impl.AllocationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link mARTE.Allocations.impl.AllocationEndImpl <em>Allocation End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.Allocations.impl.AllocationEndImpl
	 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getAllocationEnd()
	 * @generated
	 */
	int ALLOCATION_END = 3;

	/**
	 * The number of structural features of the '<em>Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_END_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.Allocations.impl.ExecutionPlatformAllocationEndImpl <em>Execution Platform Allocation End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.Allocations.impl.ExecutionPlatformAllocationEndImpl
	 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getExecutionPlatformAllocationEnd()
	 * @generated
	 */
	int EXECUTION_PLATFORM_ALLOCATION_END = 0;

	/**
	 * The number of structural features of the '<em>Execution Platform Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_ALLOCATION_END_FEATURE_COUNT = ALLOCATION_END_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Platform Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_ALLOCATION_END_OPERATION_COUNT = ALLOCATION_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.Allocations.impl.ApplicationAllocationEndImpl <em>Application Allocation End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.Allocations.impl.ApplicationAllocationEndImpl
	 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getApplicationAllocationEnd()
	 * @generated
	 */
	int APPLICATION_ALLOCATION_END = 1;

	/**
	 * The number of structural features of the '<em>Application Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ALLOCATION_END_FEATURE_COUNT = ALLOCATION_END_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ALLOCATION_END_OPERATION_COUNT = ALLOCATION_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.Allocations.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.Allocations.impl.AllocationImpl
	 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Inplied Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__INPLIED_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.Allocations.impl.NFP_ConstraintImpl <em>NFP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.Allocations.impl.NFP_ConstraintImpl
	 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getNFP_Constraint()
	 * @generated
	 */
	int NFP_CONSTRAINT = 4;

	/**
	 * The number of structural features of the '<em>NFP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>NFP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.Allocations.impl.RefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.Allocations.impl.RefinementImpl
	 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getRefinement()
	 * @generated
	 */
	int REFINEMENT = 5;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__GENERAL = 0;

	/**
	 * The feature id for the '<em><b>Refined</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__REFINED = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mARTE.Allocations.ExecutionPlatformAllocationEnd <em>Execution Platform Allocation End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Platform Allocation End</em>'.
	 * @see mARTE.Allocations.ExecutionPlatformAllocationEnd
	 * @generated
	 */
	EClass getExecutionPlatformAllocationEnd();

	/**
	 * Returns the meta object for class '{@link mARTE.Allocations.ApplicationAllocationEnd <em>Application Allocation End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Allocation End</em>'.
	 * @see mARTE.Allocations.ApplicationAllocationEnd
	 * @generated
	 */
	EClass getApplicationAllocationEnd();

	/**
	 * Returns the meta object for class '{@link mARTE.Allocations.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see mARTE.Allocations.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Allocations.Allocation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see mARTE.Allocations.Allocation#getTarget()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_Target();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Allocations.Allocation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see mARTE.Allocations.Allocation#getSource()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_Source();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Allocations.Allocation#getInpliedConstraint <em>Inplied Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inplied Constraint</em>'.
	 * @see mARTE.Allocations.Allocation#getInpliedConstraint()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_InpliedConstraint();

	/**
	 * Returns the meta object for class '{@link mARTE.Allocations.AllocationEnd <em>Allocation End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation End</em>'.
	 * @see mARTE.Allocations.AllocationEnd
	 * @generated
	 */
	EClass getAllocationEnd();

	/**
	 * Returns the meta object for class '{@link mARTE.Allocations.NFP_Constraint <em>NFP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Constraint</em>'.
	 * @see mARTE.Allocations.NFP_Constraint
	 * @generated
	 */
	EClass getNFP_Constraint();

	/**
	 * Returns the meta object for class '{@link mARTE.Allocations.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see mARTE.Allocations.Refinement
	 * @generated
	 */
	EClass getRefinement();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Allocations.Refinement#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see mARTE.Allocations.Refinement#getGeneral()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_General();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Allocations.Refinement#getRefined <em>Refined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined</em>'.
	 * @see mARTE.Allocations.Refinement#getRefined()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_Refined();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Allocations.Refinement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see mARTE.Allocations.Refinement#getConstraint()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_Constraint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AllocationsFactory getAllocationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mARTE.Allocations.impl.ExecutionPlatformAllocationEndImpl <em>Execution Platform Allocation End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.Allocations.impl.ExecutionPlatformAllocationEndImpl
		 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getExecutionPlatformAllocationEnd()
		 * @generated
		 */
		EClass EXECUTION_PLATFORM_ALLOCATION_END = eINSTANCE.getExecutionPlatformAllocationEnd();

		/**
		 * The meta object literal for the '{@link mARTE.Allocations.impl.ApplicationAllocationEndImpl <em>Application Allocation End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.Allocations.impl.ApplicationAllocationEndImpl
		 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getApplicationAllocationEnd()
		 * @generated
		 */
		EClass APPLICATION_ALLOCATION_END = eINSTANCE.getApplicationAllocationEnd();

		/**
		 * The meta object literal for the '{@link mARTE.Allocations.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.Allocations.impl.AllocationImpl
		 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__TARGET = eINSTANCE.getAllocation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__SOURCE = eINSTANCE.getAllocation_Source();

		/**
		 * The meta object literal for the '<em><b>Inplied Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__INPLIED_CONSTRAINT = eINSTANCE.getAllocation_InpliedConstraint();

		/**
		 * The meta object literal for the '{@link mARTE.Allocations.impl.AllocationEndImpl <em>Allocation End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.Allocations.impl.AllocationEndImpl
		 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getAllocationEnd()
		 * @generated
		 */
		EClass ALLOCATION_END = eINSTANCE.getAllocationEnd();

		/**
		 * The meta object literal for the '{@link mARTE.Allocations.impl.NFP_ConstraintImpl <em>NFP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.Allocations.impl.NFP_ConstraintImpl
		 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getNFP_Constraint()
		 * @generated
		 */
		EClass NFP_CONSTRAINT = eINSTANCE.getNFP_Constraint();

		/**
		 * The meta object literal for the '{@link mARTE.Allocations.impl.RefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.Allocations.impl.RefinementImpl
		 * @see mARTE.Allocations.impl.AllocationsPackageImpl#getRefinement()
		 * @generated
		 */
		EClass REFINEMENT = eINSTANCE.getRefinement();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__GENERAL = eINSTANCE.getRefinement_General();

		/**
		 * The meta object literal for the '<em><b>Refined</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__REFINED = eINSTANCE.getRefinement_Refined();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__CONSTRAINT = eINSTANCE.getRefinement_Constraint();

	}

} //AllocationsPackage
