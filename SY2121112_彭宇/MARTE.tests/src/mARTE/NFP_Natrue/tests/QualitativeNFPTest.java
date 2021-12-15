/**
 */
package mARTE.NFP_Natrue.tests;

import junit.textui.TestRunner;

import mARTE.NFP_Natrue.NFP_NatrueFactory;
import mARTE.NFP_Natrue.QualitativeNFP;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Qualitative NFP</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualitativeNFPTest extends AbstractNFPTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QualitativeNFPTest.class);
	}

	/**
	 * Constructs a new Qualitative NFP test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeNFPTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Qualitative NFP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QualitativeNFP getFixture() {
		return (QualitativeNFP)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NFP_NatrueFactory.eINSTANCE.createQualitativeNFP());
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

} //QualitativeNFPTest
