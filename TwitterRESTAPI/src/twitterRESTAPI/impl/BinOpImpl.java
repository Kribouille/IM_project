/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.ecore.EClass;
import twitterRESTAPI.BinOp;
import twitterRESTAPI.Instruction;
import twitterRESTAPI.TwitterRESTAPIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bin Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.BinOpImpl#getRight <em>Right</em>}</li>
 *   <li>{@link twitterRESTAPI.impl.BinOpImpl#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BinOpImpl extends InstructionImpl implements BinOp {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterRESTAPIPackage.Literals.BIN_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getRight() {
		return (Instruction)eGet(TwitterRESTAPIPackage.Literals.BIN_OP__RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Instruction newRight) {
		eSet(TwitterRESTAPIPackage.Literals.BIN_OP__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getLeft() {
		return (Instruction)eGet(TwitterRESTAPIPackage.Literals.BIN_OP__LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Instruction newLeft) {
		eSet(TwitterRESTAPIPackage.Literals.BIN_OP__LEFT, newLeft);
	}

} //BinOpImpl
