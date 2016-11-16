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
			case TwitterRESTAPIPackage.TWEET: return createTweet();
			case TwitterRESTAPIPackage.MESSAGE: return createMessage();
			case TwitterRESTAPIPackage.ENTITY: return createEntity();
			case TwitterRESTAPIPackage.PLACE: return createPlace();
			case TwitterRESTAPIPackage.HASHTAG: return createHashtag();
			case TwitterRESTAPIPackage.MEDIA: return createMedia();
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
	public Tweet createTweet() {
		TweetImpl tweet = new TweetImpl();
		return tweet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
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
	public Hashtag createHashtag() {
		HashtagImpl hashtag = new HashtagImpl();
		return hashtag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
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
