/**
 */
package mARTE.NFP_Natrue.tests;

import junit.textui.TestRunner;

import mARTE.NFP_Natrue.BaseQuantity;
import mARTE.NFP_Natrue.NFP_NatrueFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Base Quantity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseQuantityTest extends QuantityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BaseQuantityTest.class);
	}

	/**
	 * Constructs a new Base Quantity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseQuantityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Base Quantity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BaseQuantity getFixture() {
		return (BaseQuantity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NFP_NatrueFactory.eINSTANCE.createBaseQuantity());
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

} //BaseQuantityTest
