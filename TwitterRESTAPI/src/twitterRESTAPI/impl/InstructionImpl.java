/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import twitterRESTAPI.Instruction;
import twitterRESTAPI.TwitterRESTAPIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.InstructionImpl#getIsNot <em>Is Not</em>}</li>
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

} //InstructionImpl
