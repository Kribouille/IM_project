/**
 */
package twitterRESTAPI.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import twitterRESTAPI.ExprSimple;
import twitterRESTAPI.TwitterRESTAPIFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExprSimpleTest extends TestCase {

	/**
	 * The fixture for this Expr Simple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExprSimple fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExprSimpleTest.class);
	}

	/**
	 * Constructs a new Expr Simple test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExprSimpleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Expr Simple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExprSimple fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Expr Simple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExprSimple getFixture() {
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
		setFixture(TwitterRESTAPIFactory.eINSTANCE.createExprSimple());
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

} //ExprSimpleTest
