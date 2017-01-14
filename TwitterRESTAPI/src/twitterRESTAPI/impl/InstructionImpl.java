/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import twitterRESTAPI.Instruction;
import twitterRESTAPI.TwitterRESTAPIPackage;
import twitterRESTAPI.UnOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.InstructionImpl#getIsNot <em>Is Not</em>}</li>
 *   <li>{@link twitterRESTAPI.impl.InstructionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link twitterRESTAPI.impl.InstructionImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstructionImpl extends CDOObjectImpl implements Instruction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterRESTAPIPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNot() {
		return (Boolean)eGet(TwitterRESTAPIPackage.Literals.INSTRUCTION__IS_NOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNot(Boolean newIsNot) {
		eSet(TwitterRESTAPIPackage.Literals.INSTRUCTION__IS_NOT, newIsNot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Instruction> getNext() {
		return (EList<Instruction>)eGet(TwitterRESTAPIPackage.Literals.INSTRUCTION__NEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnOp getOp() {
		return (UnOp)eGet(TwitterRESTAPIPackage.Literals.INSTRUCTION__OP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(UnOp newOp) {
		eSet(TwitterRESTAPIPackage.Literals.INSTRUCTION__OP, newOp);
	}

} //InstructionImpl
