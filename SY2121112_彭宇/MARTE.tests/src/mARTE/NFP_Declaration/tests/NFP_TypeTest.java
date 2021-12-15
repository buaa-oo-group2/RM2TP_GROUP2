/**
 */
package mARTE.NFP_Declaration.tests;

import junit.textui.TestRunner;

import mARTE.NFP_Declaration.NFP_DeclarationFactory;
import mARTE.NFP_Declaration.NFP_Type;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NFP Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NFP_TypeTest extends ValueTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NFP_TypeTest.class);
	}

	/**
	 * Constructs a new NFP Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_TypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NFP Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NFP_Type getFixture() {
		return (NFP_Type)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NFP_DeclarationFactory.eINSTANCE.createNFP_Type());
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

} //NFP_TypeTest
