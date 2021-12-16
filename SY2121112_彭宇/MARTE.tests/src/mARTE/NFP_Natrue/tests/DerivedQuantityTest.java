/**
 */
package mARTE.NFP_Natrue.tests;

import junit.textui.TestRunner;

import mARTE.NFP_Natrue.DerivedQuantity;
import mARTE.NFP_Natrue.NFP_NatrueFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Derived Quantity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DerivedQuantityTest extends QuantityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DerivedQuantityTest.class);
	}

	/**
	 * Constructs a new Derived Quantity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedQuantityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Derived Quantity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DerivedQuantity getFixture() {
		return (DerivedQuantity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NFP_NatrueFactory.eINSTANCE.createDerivedQuantity());
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

} //DerivedQuantityTest
