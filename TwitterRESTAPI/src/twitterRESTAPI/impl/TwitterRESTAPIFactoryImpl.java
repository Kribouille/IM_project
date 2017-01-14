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
			case TwitterRESTAPIPackage.USER: return (EObject)createUser();
			case TwitterRESTAPIPackage.HASHTAG: return (EObject)createHashtag();
			case TwitterRESTAPIPackage.DATE: return (EObject)createDate();
			case TwitterRESTAPIPackage.DECK: return (EObject)createDeck();
			case TwitterRESTAPIPackage.PLACE: return (EObject)createPlace();
			case TwitterRESTAPIPackage.LESS_THAN: return (EObject)createLessThan();
			case TwitterRESTAPIPackage.UPPER_THAN: return (EObject)createUpperThan();
			case TwitterRESTAPIPackage.WEB_PAGE: return (EObject)createWebPage();
			case TwitterRESTAPIPackage.RETWEET: return (EObject)createRetweet();
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
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperThan createUpperThan() {
		UpperThanImpl upperThan = new UpperThanImpl();
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
	public Retweet createRetweet() {
		RetweetImpl retweet = new RetweetImpl();
		return retweet;
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
