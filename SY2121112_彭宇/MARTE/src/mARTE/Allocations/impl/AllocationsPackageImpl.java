/**
 */
package mARTE.Allocations.impl;

import mARTE.Allocations.Allocation;
import mARTE.Allocations.AllocationEnd;
import mARTE.Allocations.AllocationsFactory;
import mARTE.Allocations.AllocationsPackage;
import mARTE.Allocations.ApplicationAllocationEnd;
import mARTE.Allocations.ExecutionPlatformAllocationEnd;
import mARTE.Allocations.NFP_Constraint;
import mARTE.Allocations.Refinement;

import mARTE.NFP_Annotation.NFP_AnnotationPackage;

import mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl;

import mARTE.NFP_Declaration.NFP_DeclarationPackage;

import mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl;

import mARTE.NFP_Natrue.NFP_NatruePackage;

import mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationsPackageImpl extends EPackageImpl implements AllocationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionPlatformAllocationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationAllocationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_ConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mARTE.Allocations.AllocationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AllocationsPackageImpl() {
		super(eNS_URI, AllocationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AllocationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AllocationsPackage init() {
		if (isInited) return (AllocationsPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAllocationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AllocationsPackageImpl theAllocationsPackage = registeredAllocationsPackage instanceof AllocationsPackageImpl ? (AllocationsPackageImpl)registeredAllocationsPackage : new AllocationsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NFP_NatruePackage.eNS_URI);
		NFP_NatruePackageImpl theNFP_NatruePackage = (NFP_NatruePackageImpl)(registeredPackage instanceof NFP_NatruePackageImpl ? registeredPackage : NFP_NatruePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NFP_AnnotationPackage.eNS_URI);
		NFP_AnnotationPackageImpl theNFP_AnnotationPackage = (NFP_AnnotationPackageImpl)(registeredPackage instanceof NFP_AnnotationPackageImpl ? registeredPackage : NFP_AnnotationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NFP_DeclarationPackage.eNS_URI);
		NFP_DeclarationPackageImpl theNFP_DeclarationPackage = (NFP_DeclarationPackageImpl)(registeredPackage instanceof NFP_DeclarationPackageImpl ? registeredPackage : NFP_DeclarationPackage.eINSTANCE);

		// Create package meta-data objects
		theAllocationsPackage.createPackageContents();
		theNFP_NatruePackage.createPackageContents();
		theNFP_AnnotationPackage.createPackageContents();
		theNFP_DeclarationPackage.createPackageContents();

		// Initialize created meta-data
		theAllocationsPackage.initializePackageContents();
		theNFP_NatruePackage.initializePackageContents();
		theNFP_AnnotationPackage.initializePackageContents();
		theNFP_DeclarationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAllocationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AllocationsPackage.eNS_URI, theAllocationsPackage);
		return theAllocationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionPlatformAllocationEnd() {
		return executionPlatformAllocationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationAllocationEnd() {
		return applicationAllocationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_Target() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_Source() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_InpliedConstraint() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationEnd() {
		return allocationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Constraint() {
		return nfP_ConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinement() {
		return refinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinement_General() {
		return (EReference)refinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinement_Refined() {
		return (EReference)refinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinement_Constraint() {
		return (EReference)refinementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationsFactory getAllocationsFactory() {
		return (AllocationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		executionPlatformAllocationEndEClass = createEClass(EXECUTION_PLATFORM_ALLOCATION_END);

		applicationAllocationEndEClass = createEClass(APPLICATION_ALLOCATION_END);

		allocationEClass = createEClass(ALLOCATION);
		createEReference(allocationEClass, ALLOCATION__TARGET);
		createEReference(allocationEClass, ALLOCATION__SOURCE);
		createEReference(allocationEClass, ALLOCATION__INPLIED_CONSTRAINT);

		allocationEndEClass = createEClass(ALLOCATION_END);

		nfP_ConstraintEClass = createEClass(NFP_CONSTRAINT);

		refinementEClass = createEClass(REFINEMENT);
		createEReference(refinementEClass, REFINEMENT__GENERAL);
		createEReference(refinementEClass, REFINEMENT__REFINED);
		createEReference(refinementEClass, REFINEMENT__CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NFP_AnnotationPackage theNFP_AnnotationPackage = (NFP_AnnotationPackage)EPackage.Registry.INSTANCE.getEPackage(NFP_AnnotationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		executionPlatformAllocationEndEClass.getESuperTypes().add(this.getAllocationEnd());
		applicationAllocationEndEClass.getESuperTypes().add(this.getAllocationEnd());

		// Initialize classes, features, and operations; add parameters
		initEClass(executionPlatformAllocationEndEClass, ExecutionPlatformAllocationEnd.class, "ExecutionPlatformAllocationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationAllocationEndEClass, ApplicationAllocationEnd.class, "ApplicationAllocationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocation_Target(), this.getExecutionPlatformAllocationEnd(), null, "target", null, 1, -1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocation_Source(), this.getApplicationAllocationEnd(), null, "source", null, 1, -1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocation_InpliedConstraint(), theNFP_AnnotationPackage.getNFP_Constraint(), null, "inpliedConstraint", null, 0, -1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationEndEClass, AllocationEnd.class, "AllocationEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nfP_ConstraintEClass, NFP_Constraint.class, "NFP_Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refinementEClass, Refinement.class, "Refinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinement_General(), this.getAllocationEnd(), null, "general", null, 1, -1, Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinement_Refined(), this.getAllocationEnd(), null, "refined", null, 1, -1, Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinement_Constraint(), theNFP_AnnotationPackage.getNFP_Constraint(), null, "constraint", null, 0, -1, Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AllocationsPackageImpl
