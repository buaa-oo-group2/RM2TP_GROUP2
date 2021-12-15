/**
 */
package mARTE.NFP_Annotation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mARTE.NFP_Annotation.AnnotatedModel;
import mARTE.NFP_Annotation.NFP_AnnotationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Annotated Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotatedModelTest extends TestCase {

	/**
	 * The fixture for this Annotated Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatedModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnnotatedModelTest.class);
	}

	/**
	 * Constructs a new Annotated Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Annotated Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AnnotatedModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Annotated Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatedModel getFixture() {
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
		setFixture(NFP_AnnotationFactory.eINSTANCE.createAnnotatedModel());
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

} //AnnotatedModelTest
