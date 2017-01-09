/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.ecore.EClass;

import twitterRESTAPI.Place;
import twitterRESTAPI.TwitterRESTAPIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.PlaceImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends ElementImpl implements Place {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterRESTAPIPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(TwitterRESTAPIPackage.Literals.PLACE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(TwitterRESTAPIPackage.Literals.PLACE__VALUE, newValue);
	}

} //PlaceImpl
