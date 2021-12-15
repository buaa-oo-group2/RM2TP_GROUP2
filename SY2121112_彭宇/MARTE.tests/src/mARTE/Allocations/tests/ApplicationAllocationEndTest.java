/**
 */
package mARTE.Allocations.tests;

import junit.textui.TestRunner;

import mARTE.Allocations.AllocationsFactory;
import mARTE.Allocations.ApplicationAllocationEnd;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Application Allocation End</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationAllocationEndTest extends AllocationEndTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplicationAllocationEndTest.class);
	}

	/**
	 * Constructs a new Application Allocation End test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAllocationEndTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Application Allocation End test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ApplicationAllocationEnd getFixture() {
		return (ApplicationAllocationEnd)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocationsFactory.eINSTANCE.createApplicationAllocationEnd());
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

} //ApplicationAllocationEndTest
