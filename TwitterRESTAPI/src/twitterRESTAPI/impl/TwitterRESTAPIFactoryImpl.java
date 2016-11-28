/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import twitterRESTAPI.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwitterRESTAPIFactoryImpl extends EFactoryImpl implements TwitterRESTAPIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TwitterRESTAPIFactory init() {
		try {
			TwitterRESTAPIFactory theTwitterRESTAPIFactory = (TwitterRESTAPIFactory)EPackage.Registry.INSTANCE.getEFactory(TwitterRESTAPIPackage.eNS_URI);
			if (theTwitterRESTAPIFactory != null) {
				return theTwitterRESTAPIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TwitterRESTAPIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterRESTAPIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TwitterRESTAPIPackage.USER: return createUser();
			case TwitterRESTAPIPackage.HASHTAG: return createHashtag();
			case TwitterRESTAPIPackage.DATE: return createDate();
			case TwitterRESTAPIPackage.DECK: return createDeck();
			case TwitterRESTAPIPackage.AND: return createAnd();
			case TwitterRESTAPIPackage.PLACE: return createPlace();
			case TwitterRESTAPIPackage.OR: return createOr();
			case TwitterRESTAPIPackage.NOT: return createNot();
			case TwitterRESTAPIPackage.EQUALS: return createequals();
			case TwitterRESTAPIPackage.LESS_THAN: return createlessThan();
			case TwitterRESTAPIPackage.EXPR_SIMPLE: return createExprSimple();
			case TwitterRESTAPIPackage.UPPER_THAN: return createupperThan();
			case TwitterRESTAPIPackage.WEB_PAGE: return createWebPage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public equals createequals() {
		equalsImpl equals = new equalsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public lessThan createlessThan() {
		lessThanImpl lessThan = new lessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExprSimple createExprSimple() {
		ExprSimpleImpl exprSimple = new ExprSimpleImpl();
		return exprSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public upperThan createupperThan() {
		upperThanImpl upperThan = new upperThanImpl();
		return upperThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebPage createWebPage() {
		WebPageImpl webPage = new WebPageImpl();
		return webPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtag createHashtag() {
		HashtagImpl hashtag = new HashtagImpl();
		return hashtag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deck createDeck() {
		DeckImpl deck = new DeckImpl();
		return deck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterRESTAPIPackage getTwitterRESTAPIPackage() {
		return (TwitterRESTAPIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TwitterRESTAPIPackage getPackage() {
		return TwitterRESTAPIPackage.eINSTANCE;
	}

} //TwitterRESTAPIFactoryImpl
