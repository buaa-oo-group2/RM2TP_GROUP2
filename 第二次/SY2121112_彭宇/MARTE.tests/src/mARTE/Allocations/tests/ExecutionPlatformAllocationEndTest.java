/**
 */
package mARTE.Allocations.tests;

import junit.textui.TestRunner;

import mARTE.Allocations.AllocationsFactory;
import mARTE.Allocations.ExecutionPlatformAllocationEnd;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Execution Platform Allocation End</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionPlatformAllocationEndTest extends AllocationEndTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExecutionPlatformAllocationEndTest.class);
	}

	/**
	 * Constructs a new Execution Platform Allocation End test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPlatformAllocationEndTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Execution Platform Allocation End test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExecutionPlatformAllocationEnd getFixture() {
		return (ExecutionPlatformAllocationEnd)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocationsFactory.eINSTANCE.createExecutionPlatformAllocationEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ExecutionPlatformAllocationEndTest
