/**
 */
package twitterRESTAPI;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see twitterRESTAPI.TwitterRESTAPIPackage
 * @generated
 */
public interface TwitterRESTAPIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TwitterRESTAPIFactory eINSTANCE = twitterRESTAPI.impl.TwitterRESTAPIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>equals</em>'.
	 * @generated
	 */
	equals createequals();

	/**
	 * Returns a new object of class '<em>less Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>less Than</em>'.
	 * @generated
	 */
	lessThan createlessThan();

	/**
	 * Returns a new object of class '<em>Expr Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expr Simple</em>'.
	 * @generated
	 */
	ExprSimple createExprSimple();

	/**
	 * Returns a new object of class '<em>upper Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>upper Than</em>'.
	 * @generated
	 */
	upperThan createupperThan();

	/**
	 * Returns a new object of class '<em>Hashtag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hashtag</em>'.
	 * @generated
	 */
	Hashtag createHashtag();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Deck</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deck</em>'.
	 * @generated
	 */
	Deck createDeck();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TwitterRESTAPIPackage getTwitterRESTAPIPackage();

} //TwitterRESTAPIFactory
