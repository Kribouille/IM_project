/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.ecore.EClass;

import twitterRESTAPI.Hashtag;
import twitterRESTAPI.TwitterRESTAPIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hashtag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.HashtagImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HashtagImpl extends InstructionImpl implements Hashtag {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashtagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterRESTAPIPackage.Literals.HASHTAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(TwitterRESTAPIPackage.Literals.HASHTAG__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(TwitterRESTAPIPackage.Literals.HASHTAG__VALUE, newValue);
	}

} //HashtagImpl
