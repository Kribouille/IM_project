/**
 */
package twitterRESTAPI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see twitterRESTAPI.TwitterRESTAPIFactory
 * @model kind="package"
 * @generated
 */
public interface TwitterRESTAPIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "twitterRESTAPI";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/twitterRESTAPI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "twitterRESTAPI";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TwitterRESTAPIPackage eINSTANCE = twitterRESTAPI.impl.TwitterRESTAPIPackageImpl.init();

	/**
	 * The meta object id for the '{@link twitterRESTAPI.Type <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.Type
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 13;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.UserImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.PlaceImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 6;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.OrImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getOr()
	 * @generated
	 */
	int OR = 8;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.NotImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 9;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.Operation <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.Operation
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 14;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.equalsImpl <em>equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.equalsImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getequals()
	 * @generated
	 */
	int EQUALS = 10;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.lessThanImpl <em>less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.lessThanImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getlessThan()
	 * @generated
	 */
	int LESS_THAN = 11;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.ExprSimpleImpl <em>Expr Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.ExprSimpleImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getExprSimple()
	 * @generated
	 */
	int EXPR_SIMPLE = 12;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.upperThanImpl <em>upper Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.upperThanImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getupperThan()
	 * @generated
	 */
	int UPPER_THAN = 15;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.HashtagImpl <em>Hashtag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.HashtagImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getHashtag()
	 * @generated
	 */
	int HASHTAG = 1;

	/**
	 * The number of structural features of the '<em>Hashtag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hashtag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.DateImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 2;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.DeckImpl <em>Deck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.DeckImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getDeck()
	 * @generated
	 */
	int DECK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.Expression
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.ExprBinaireImpl <em>Expr Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.ExprBinaireImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getExprBinaire()
	 * @generated
	 */
	int EXPR_BINAIRE = 7;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_BINAIRE__EXP1 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_BINAIRE__EXP2 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expr Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_BINAIRE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expr Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_BINAIRE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.AndImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 4;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXP1 = EXPR_BINAIRE__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXP2 = EXPR_BINAIRE__EXP2;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = EXPR_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = EXPR_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__EXP1 = EXPR_BINAIRE__EXP1;

	/**
	 * The feature id for the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__EXP2 = EXPR_BINAIRE__EXP2;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = EXPR_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = EXPR_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_SIMPLE__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_SIMPLE__TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_SIMPLE__OPERATION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expr Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_SIMPLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Expr Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_SIMPLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>upper Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_THAN_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>upper Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_THAN_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.WebPageImpl <em>Web Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.WebPageImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getWebPage()
	 * @generated
	 */
	int WEB_PAGE = 16;

	/**
	 * The feature id for the '<em><b>Deck</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__DECK = 0;

	/**
	 * The number of structural features of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see twitterRESTAPI.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see twitterRESTAPI.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.ExprBinaire <em>Expr Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr Binaire</em>'.
	 * @see twitterRESTAPI.ExprBinaire
	 * @generated
	 */
	EClass getExprBinaire();

	/**
	 * Returns the meta object for the containment reference '{@link twitterRESTAPI.ExprBinaire#getExp1 <em>Exp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp1</em>'.
	 * @see twitterRESTAPI.ExprBinaire#getExp1()
	 * @see #getExprBinaire()
	 * @generated
	 */
	EReference getExprBinaire_Exp1();

	/**
	 * Returns the meta object for the containment reference '{@link twitterRESTAPI.ExprBinaire#getExp2 <em>Exp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp2</em>'.
	 * @see twitterRESTAPI.ExprBinaire#getExp2()
	 * @see #getExprBinaire()
	 * @generated
	 */
	EReference getExprBinaire_Exp2();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see twitterRESTAPI.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see twitterRESTAPI.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link twitterRESTAPI.Not#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see twitterRESTAPI.Not#getExp()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Exp();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.equals <em>equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>equals</em>'.
	 * @see twitterRESTAPI.equals
	 * @generated
	 */
	EClass getequals();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.lessThan <em>less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>less Than</em>'.
	 * @see twitterRESTAPI.lessThan
	 * @generated
	 */
	EClass getlessThan();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.ExprSimple <em>Expr Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr Simple</em>'.
	 * @see twitterRESTAPI.ExprSimple
	 * @generated
	 */
	EClass getExprSimple();

	/**
	 * Returns the meta object for the attribute '{@link twitterRESTAPI.ExprSimple#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see twitterRESTAPI.ExprSimple#getValue()
	 * @see #getExprSimple()
	 * @generated
	 */
	EAttribute getExprSimple_Value();

	/**
	 * Returns the meta object for the containment reference '{@link twitterRESTAPI.ExprSimple#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see twitterRESTAPI.ExprSimple#getType()
	 * @see #getExprSimple()
	 * @generated
	 */
	EReference getExprSimple_Type();

	/**
	 * Returns the meta object for the containment reference '{@link twitterRESTAPI.ExprSimple#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see twitterRESTAPI.ExprSimple#getOperation()
	 * @see #getExprSimple()
	 * @generated
	 */
	EReference getExprSimple_Operation();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see twitterRESTAPI.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see twitterRESTAPI.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.upperThan <em>upper Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>upper Than</em>'.
	 * @see twitterRESTAPI.upperThan
	 * @generated
	 */
	EClass getupperThan();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Page</em>'.
	 * @see twitterRESTAPI.WebPage
	 * @generated
	 */
	EClass getWebPage();

	/**
	 * Returns the meta object for the containment reference list '{@link twitterRESTAPI.WebPage#getDeck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deck</em>'.
	 * @see twitterRESTAPI.WebPage#getDeck()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Deck();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Hashtag <em>Hashtag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hashtag</em>'.
	 * @see twitterRESTAPI.Hashtag
	 * @generated
	 */
	EClass getHashtag();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see twitterRESTAPI.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Deck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deck</em>'.
	 * @see twitterRESTAPI.Deck
	 * @generated
	 */
	EClass getDeck();

	/**
	 * Returns the meta object for the attribute '{@link twitterRESTAPI.Deck#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see twitterRESTAPI.Deck#getName()
	 * @see #getDeck()
	 * @generated
	 */
	EAttribute getDeck_Name();

	/**
	 * Returns the meta object for the containment reference '{@link twitterRESTAPI.Deck#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see twitterRESTAPI.Deck#getExpression()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_Expression();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see twitterRESTAPI.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see twitterRESTAPI.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TwitterRESTAPIFactory getTwitterRESTAPIFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.UserImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.PlaceImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.ExprBinaireImpl <em>Expr Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.ExprBinaireImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getExprBinaire()
		 * @generated
		 */
		EClass EXPR_BINAIRE = eINSTANCE.getExprBinaire();

		/**
		 * The meta object literal for the '<em><b>Exp1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPR_BINAIRE__EXP1 = eINSTANCE.getExprBinaire_Exp1();

		/**
		 * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPR_BINAIRE__EXP2 = eINSTANCE.getExprBinaire_Exp2();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.OrImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.NotImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXP = eINSTANCE.getNot_Exp();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.equalsImpl <em>equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.equalsImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getequals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getequals();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.lessThanImpl <em>less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.lessThanImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getlessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getlessThan();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.ExprSimpleImpl <em>Expr Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.ExprSimpleImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getExprSimple()
		 * @generated
		 */
		EClass EXPR_SIMPLE = eINSTANCE.getExprSimple();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPR_SIMPLE__VALUE = eINSTANCE.getExprSimple_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPR_SIMPLE__TYPE = eINSTANCE.getExprSimple_Type();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPR_SIMPLE__OPERATION = eINSTANCE.getExprSimple_Operation();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.Type <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.Type
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.Operation <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.Operation
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.upperThanImpl <em>upper Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.upperThanImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getupperThan()
		 * @generated
		 */
		EClass UPPER_THAN = eINSTANCE.getupperThan();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.WebPageImpl <em>Web Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.WebPageImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getWebPage()
		 * @generated
		 */
		EClass WEB_PAGE = eINSTANCE.getWebPage();

		/**
		 * The meta object literal for the '<em><b>Deck</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__DECK = eINSTANCE.getWebPage_Deck();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.HashtagImpl <em>Hashtag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.HashtagImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getHashtag()
		 * @generated
		 */
		EClass HASHTAG = eINSTANCE.getHashtag();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.DateImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.DeckImpl <em>Deck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.DeckImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getDeck()
		 * @generated
		 */
		EClass DECK = eINSTANCE.getDeck();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECK__NAME = eINSTANCE.getDeck_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__EXPRESSION = eINSTANCE.getDeck_Expression();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.AndImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.Expression
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

	}

} //TwitterRESTAPIPackage
