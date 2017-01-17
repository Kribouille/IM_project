/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.ecore.EClass;

import twitterRESTAPI.TwitterRESTAPIPackage;
import twitterRESTAPI.Word;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.WordImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WordImpl extends InstructionImpl implements Word {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterRESTAPIPackage.Literals.WORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(TwitterRESTAPIPackage.Literals.WORD__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(TwitterRESTAPIPackage.Literals.WORD__VALUE, newValue);
	}

} //WordImpl
