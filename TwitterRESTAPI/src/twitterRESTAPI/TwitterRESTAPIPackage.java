/**
 */
package twitterRESTAPI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link twitterRESTAPI.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.InstructionImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 4;

	/**
	 * The feature id for the '<em><b>Is Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__IS_NOT = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Un Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__UN_OP = 2;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Is Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_NOT = INSTRUCTION__IS_NOT;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Un Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UN_OP = INSTRUCTION__UN_OP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Is Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__IS_NOT = INSTRUCTION__IS_NOT;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Un Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__UN_OP = INSTRUCTION__UN_OP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hashtag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hashtag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Is Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__IS_NOT = INSTRUCTION__IS_NOT;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Un Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__UN_OP = INSTRUCTION__UN_OP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__INSTRUCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Init Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__INIT_FILTERS = 2;

	/**
	 * The number of structural features of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.PlaceImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 5;

	/**
	 * The feature id for the '<em><b>Is Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IS_NOT = INSTRUCTION__IS_NOT;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Un Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UN_OP = INSTRUCTION__UN_OP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.DeckSetImpl <em>Deck Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.DeckSetImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getDeckSet()
	 * @generated
	 */
	int DECK_SET = 6;

	/**
	 * The feature id for the '<em><b>Deck</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_SET__DECK = 0;

	/**
	 * The number of structural features of the '<em>Deck Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deck Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.impl.RetweetImpl <em>Retweet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.impl.RetweetImpl
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getRetweet()
	 * @generated
	 */
	int RETWEET = 7;

	/**
	 * The feature id for the '<em><b>Is Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETWEET__IS_NOT = INSTRUCTION__IS_NOT;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETWEET__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Un Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETWEET__UN_OP = INSTRUCTION__UN_OP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETWEET__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Retweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETWEET_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Retweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETWEET_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link twitterRESTAPI.UnOp <em>Un Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see twitterRESTAPI.UnOp
	 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getUnOp()
	 * @generated
	 */
	int UN_OP = 8;


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
	 * Returns the meta object for the attribute '{@link twitterRESTAPI.User#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see twitterRESTAPI.User#getValue()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Value();

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
	 * Returns the meta object for the attribute '{@link twitterRESTAPI.Hashtag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see twitterRESTAPI.Hashtag#getValue()
	 * @see #getHashtag()
	 * @generated
	 */
	EAttribute getHashtag_Value();

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
	 * Returns the meta object for the attribute '{@link twitterRESTAPI.Date#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see twitterRESTAPI.Date#getValue()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Value();

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
	 * Returns the meta object for the containment reference list '{@link twitterRESTAPI.Deck#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see twitterRESTAPI.Deck#getInstructions()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_Instructions();

	/**
	 * Returns the meta object for the reference list '{@link twitterRESTAPI.Deck#getInitFilters <em>Init Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Init Filters</em>'.
	 * @see twitterRESTAPI.Deck#getInitFilters()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_InitFilters();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see twitterRESTAPI.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute '{@link twitterRESTAPI.Instruction#getIsNot <em>Is Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Not</em>'.
	 * @see twitterRESTAPI.Instruction#getIsNot()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_IsNot();

	/**
	 * Returns the meta object for the containment reference list '{@link twitterRESTAPI.Instruction#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see twitterRESTAPI.Instruction#getNext()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Next();

	/**
	 * Returns the meta object for the attribute '{@link twitterRESTAPI.Instruction#getUnOp <em>Un Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Un Op</em>'.
	 * @see twitterRESTAPI.Instruction#getUnOp()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_UnOp();

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
	 * Returns the meta object for the attribute '{@link twitterRESTAPI.Place#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see twitterRESTAPI.Place#getValue()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Value();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.DeckSet <em>Deck Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deck Set</em>'.
	 * @see twitterRESTAPI.DeckSet
	 * @generated
	 */
	EClass getDeckSet();

	/**
	 * Returns the meta object for the containment reference list '{@link twitterRESTAPI.DeckSet#getDeck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deck</em>'.
	 * @see twitterRESTAPI.DeckSet#getDeck()
	 * @see #getDeckSet()
	 * @generated
	 */
	EReference getDeckSet_Deck();

	/**
	 * Returns the meta object for class '{@link twitterRESTAPI.Retweet <em>Retweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retweet</em>'.
	 * @see twitterRESTAPI.Retweet
	 * @generated
	 */
	EClass getRetweet();

	/**
	 * Returns the meta object for the attribute '{@link twitterRESTAPI.Retweet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see twitterRESTAPI.Retweet#getValue()
	 * @see #getRetweet()
	 * @generated
	 */
	EAttribute getRetweet_Value();

	/**
	 * Returns the meta object for enum '{@link twitterRESTAPI.UnOp <em>Un Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Un Op</em>'.
	 * @see twitterRESTAPI.UnOp
	 * @generated
	 */
	EEnum getUnOp();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__VALUE = eINSTANCE.getUser_Value();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASHTAG__VALUE = eINSTANCE.getHashtag_Value();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__VALUE = eINSTANCE.getDate_Value();

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
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__INSTRUCTIONS = eINSTANCE.getDeck_Instructions();

		/**
		 * The meta object literal for the '<em><b>Init Filters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__INIT_FILTERS = eINSTANCE.getDeck_InitFilters();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.InstructionImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Is Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__IS_NOT = eINSTANCE.getInstruction_IsNot();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__NEXT = eINSTANCE.getInstruction_Next();

		/**
		 * The meta object literal for the '<em><b>Un Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__UN_OP = eINSTANCE.getInstruction_UnOp();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__VALUE = eINSTANCE.getPlace_Value();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.DeckSetImpl <em>Deck Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.DeckSetImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getDeckSet()
		 * @generated
		 */
		EClass DECK_SET = eINSTANCE.getDeckSet();

		/**
		 * The meta object literal for the '<em><b>Deck</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK_SET__DECK = eINSTANCE.getDeckSet_Deck();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.impl.RetweetImpl <em>Retweet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.impl.RetweetImpl
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getRetweet()
		 * @generated
		 */
		EClass RETWEET = eINSTANCE.getRetweet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETWEET__VALUE = eINSTANCE.getRetweet_Value();

		/**
		 * The meta object literal for the '{@link twitterRESTAPI.UnOp <em>Un Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see twitterRESTAPI.UnOp
		 * @see twitterRESTAPI.impl.TwitterRESTAPIPackageImpl#getUnOp()
		 * @generated
		 */
		EEnum UN_OP = eINSTANCE.getUnOp();

	}

} //TwitterRESTAPIPackage
