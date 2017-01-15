/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.ecore.EClass;

import twitterRESTAPI.Date;
import twitterRESTAPI.TwitterRESTAPIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.DateImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateImpl extends InstructionImpl implements Date {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterRESTAPIPackage.Literals.DATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java.util.Date getValue() {
		return (java.util.Date)eGet(TwitterRESTAPIPackage.Literals.DATE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(java.util.Date newValue) {
		eSet(TwitterRESTAPIPackage.Literals.DATE__VALUE, newValue);
	}

} //DateImpl
