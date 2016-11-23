/**
 */
package twitterRESTAPI.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import twitterRESTAPI.Not;
import twitterRESTAPI.TwitterRESTAPIFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotTest extends TestCase {

	/**
	 * The fixture for this Not test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Not fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotTest.class);
	}

	/**
	 * Constructs a new Not test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Not test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Not fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Not test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Not getFixture() {
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
		setFixture(TwitterRESTAPIFactory.eINSTANCE.createNot());
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

} //NotTest
