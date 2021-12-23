/**
 */
package mARTE.NFP_Natrue.tests;

import junit.textui.TestRunner;

import mARTE.NFP_Natrue.NFP_NatrueFactory;
import mARTE.NFP_Natrue.QuantitativeNFP;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quantitative NFP</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantitativeNFPTest extends AbstractNFPTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuantitativeNFPTest.class);
	}

	/**
	 * Constructs a new Quantitative NFP test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeNFPTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quantitative NFP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QuantitativeNFP getFixture() {
		return (QuantitativeNFP)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NFP_NatrueFactory.eINSTANCE.createQuantitativeNFP());
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

} //QuantitativeNFPTest
