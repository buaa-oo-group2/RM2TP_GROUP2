/**
 */
package mARTE.NFP_Declaration.tests;

import junit.textui.TestRunner;

import mARTE.NFP_Declaration.NFP;
import mARTE.NFP_Declaration.NFP_DeclarationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NFP</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NFPTest extends ValuePropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NFPTest.class);
	}

	/**
	 * Constructs a new NFP test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFPTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NFP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NFP getFixture() {
		return (NFP)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NFP_DeclarationFactory.eINSTANCE.createNFP());
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

} //NFPTest
