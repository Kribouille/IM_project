/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.ecore.EClass;

import twitterRESTAPI.Retweet;
import twitterRESTAPI.TwitterRESTAPIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retweet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.RetweetImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetweetImpl extends ElementImpl implements Retweet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetweetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterRESTAPIPackage.Literals.RETWEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return (Integer)eGet(TwitterRESTAPIPackage.Literals.RETWEET__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		eSet(TwitterRESTAPIPackage.Literals.RETWEET__VALUE, newValue);
	}

} //RetweetImpl
