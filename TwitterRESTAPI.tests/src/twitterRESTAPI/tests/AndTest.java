/**
 */
package twitterRESTAPI.tests;

import junit.textui.TestRunner;

import twitterRESTAPI.And;
import twitterRESTAPI.TwitterRESTAPIFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndTest extends ExprBinaireTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AndTest.class);
	}

	/**
	 * Constructs a new And test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this And test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected And getFixture() {
		return (And)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterRESTAPIFactory.eINSTANCE.createAnd());
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

} //AndTest
