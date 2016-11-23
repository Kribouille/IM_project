/**
 */
package twitterRESTAPI.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import twitterRESTAPI.Hashtag;
import twitterRESTAPI.TwitterRESTAPIFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hashtag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HashtagTest extends TestCase {

	/**
	 * The fixture for this Hashtag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hashtag fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HashtagTest.class);
	}

	/**
	 * Constructs a new Hashtag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashtagTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Hashtag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Hashtag fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Hashtag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hashtag getFixture() {
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
		setFixture(TwitterRESTAPIFactory.eINSTANCE.createHashtag());
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

} //HashtagTest
