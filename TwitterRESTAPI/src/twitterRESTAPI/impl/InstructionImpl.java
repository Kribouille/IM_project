/**
 */
package twitterRESTAPI.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link twitterRESTAPI.impl.InstructionImpl#getUnOp <em>Un Op</em>}</li>
 *   <li>{@link twitterRESTAPI.impl.InstructionImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction {
	/**
	 * The default value of the '{@link #getIsNot() <em>Is Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNot()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NOT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsNot() <em>Is Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNot()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNot = IS_NOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> next;

	/**
	 * The default value of the '{@link #getUnOp() <em>Un Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnOp()
	 * @generated
	 * @ordered
	 */
	protected static final UnOp UN_OP_EDEFAULT = UnOp.EQUALS;

	/**
	 * The cached value of the '{@link #getUnOp() <em>Un Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnOp()
	 * @generated
	 * @ordered
	 */
	protected UnOp unOp = UN_OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> previous;

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
	public Boolean getIsNot() {
		return isNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNot(Boolean newIsNot) {
		Boolean oldIsNot = isNot;
		isNot = newIsNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterRESTAPIPackage.INSTRUCTION__IS_NOT, oldIsNot, isNot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList.ManyInverse<Instruction>(Instruction.class, this, TwitterRESTAPIPackage.INSTRUCTION__NEXT, TwitterRESTAPIPackage.INSTRUCTION__PREVIOUS);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnOp getUnOp() {
		return unOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnOp(UnOp newUnOp) {
		UnOp oldUnOp = unOp;
		unOp = newUnOp == null ? UN_OP_EDEFAULT : newUnOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterRESTAPIPackage.INSTRUCTION__UN_OP, oldUnOp, unOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getPrevious() {
		if (previous == null) {
			previous = new EObjectWithInverseResolvingEList.ManyInverse<Instruction>(Instruction.class, this, TwitterRESTAPIPackage.INSTRUCTION__PREVIOUS, TwitterRESTAPIPackage.INSTRUCTION__NEXT);
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterRESTAPIPackage.INSTRUCTION__NEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNext()).basicAdd(otherEnd, msgs);
			case TwitterRESTAPIPackage.INSTRUCTION__PREVIOUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrevious()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterRESTAPIPackage.INSTRUCTION__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
			case TwitterRESTAPIPackage.INSTRUCTION__PREVIOUS:
				return ((InternalEList<?>)getPrevious()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterRESTAPIPackage.INSTRUCTION__IS_NOT:
				return getIsNot();
			case TwitterRESTAPIPackage.INSTRUCTION__NEXT:
				return getNext();
			case TwitterRESTAPIPackage.INSTRUCTION__UN_OP:
				return getUnOp();
			case TwitterRESTAPIPackage.INSTRUCTION__PREVIOUS:
				return getPrevious();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TwitterRESTAPIPackage.INSTRUCTION__IS_NOT:
				setIsNot((Boolean)newValue);
				return;
			case TwitterRESTAPIPackage.INSTRUCTION__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends Instruction>)newValue);
				return;
			case TwitterRESTAPIPackage.INSTRUCTION__UN_OP:
				setUnOp((UnOp)newValue);
				return;
			case TwitterRESTAPIPackage.INSTRUCTION__PREVIOUS:
				getPrevious().clear();
				getPrevious().addAll((Collection<? extends Instruction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TwitterRESTAPIPackage.INSTRUCTION__IS_NOT:
				setIsNot(IS_NOT_EDEFAULT);
				return;
			case TwitterRESTAPIPackage.INSTRUCTION__NEXT:
				getNext().clear();
				return;
			case TwitterRESTAPIPackage.INSTRUCTION__UN_OP:
				setUnOp(UN_OP_EDEFAULT);
				return;
			case TwitterRESTAPIPackage.INSTRUCTION__PREVIOUS:
				getPrevious().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TwitterRESTAPIPackage.INSTRUCTION__IS_NOT:
				return IS_NOT_EDEFAULT == null ? isNot != null : !IS_NOT_EDEFAULT.equals(isNot);
			case TwitterRESTAPIPackage.INSTRUCTION__NEXT:
				return next != null && !next.isEmpty();
			case TwitterRESTAPIPackage.INSTRUCTION__UN_OP:
				return unOp != UN_OP_EDEFAULT;
			case TwitterRESTAPIPackage.INSTRUCTION__PREVIOUS:
				return previous != null && !previous.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isNot: ");
		result.append(isNot);
		result.append(", unOp: ");
		result.append(unOp);
		result.append(')');
		return result.toString();
	}

} //InstructionImpl
