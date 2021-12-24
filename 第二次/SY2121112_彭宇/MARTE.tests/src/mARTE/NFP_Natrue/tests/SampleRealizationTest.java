/**
 */
package mARTE.NFP_Natrue.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mARTE.NFP_Natrue.NFP_NatrueFactory;
import mARTE.NFP_Natrue.SampleRealization;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sample Realization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SampleRealizationTest extends TestCase {

	/**
	 * The fixture for this Sample Realization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleRealization fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SampleRealizationTest.class);
	}

	/**
	 * Constructs a new Sample Realization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleRealizationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sample Realization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SampleRealization fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sample Realization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleRealization getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NFP_NatrueFactory.eINSTANCE.createSampleRealization());
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

} //SampleRealizationTest
