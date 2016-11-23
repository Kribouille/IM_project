/**
 */
package twitterRESTAPI.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import twitterRESTAPI.Date;
import twitterRESTAPI.TwitterRESTAPIFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DateTest extends TestCase {

	/**
	 * The fixture for this Date test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Date fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DateTest.class);
	}

	/**
	 * Constructs a new Date test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Date test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Date fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Date test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Date getFixture() {
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
		setFixture(TwitterRESTAPIFactory.eINSTANCE.createDate());
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

} //DateTest
