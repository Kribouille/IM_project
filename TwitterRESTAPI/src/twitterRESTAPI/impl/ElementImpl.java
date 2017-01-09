/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.ecore.EClass;
import twitterRESTAPI.Element;
import twitterRESTAPI.TwitterRESTAPIPackage;
import twitterRESTAPI.UnOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.ElementImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends InstructionImpl implements Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterRESTAPIPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnOp getOp() {
		return (UnOp)eGet(TwitterRESTAPIPackage.Literals.ELEMENT__OP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(UnOp newOp) {
		eSet(TwitterRESTAPIPackage.Literals.ELEMENT__OP, newOp);
	}

} //ElementImpl
