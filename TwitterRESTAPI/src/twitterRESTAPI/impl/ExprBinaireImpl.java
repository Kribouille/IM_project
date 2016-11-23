/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import twitterRESTAPI.ExprBinaire;
import twitterRESTAPI.Expression;
import twitterRESTAPI.TwitterRESTAPIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.ExprBinaireImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link twitterRESTAPI.impl.ExprBinaireImpl#getExp2 <em>Exp2</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExprBinaireImpl extends MinimalEObjectImpl.Container implements ExprBinaire {
	/**
	 * The cached value of the '{@link #getExp1() <em>Exp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp1()
	 * @generated
	 * @ordered
	 */
	protected Expression exp1;

	/**
	 * The cached value of the '{@link #getExp2() <em>Exp2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp2()
	 * @generated
	 * @ordered
	 */
	protected Expression exp2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExprBinaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterRESTAPIPackage.Literals.EXPR_BINAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExp1() {
		return exp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp1(Expression newExp1, NotificationChain msgs) {
		Expression oldExp1 = exp1;
		exp1 = newExp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterRESTAPIPackage.EXPR_BINAIRE__EXP1, oldExp1, newExp1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExp1(Expression newExp1) {
		if (newExp1 != exp1) {
			NotificationChain msgs = null;
			if (exp1 != null)
				msgs = ((InternalEObject)exp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterRESTAPIPackage.EXPR_BINAIRE__EXP1, null, msgs);
			if (newExp1 != null)
				msgs = ((InternalEObject)newExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterRESTAPIPackage.EXPR_BINAIRE__EXP1, null, msgs);
			msgs = basicSetExp1(newExp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterRESTAPIPackage.EXPR_BINAIRE__EXP1, newExp1, newExp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExp2() {
		return exp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp2(Expression newExp2, NotificationChain msgs) {
		Expression oldExp2 = exp2;
		exp2 = newExp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterRESTAPIPackage.EXPR_BINAIRE__EXP2, oldExp2, newExp2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExp2(Expression newExp2) {
		if (newExp2 != exp2) {
			NotificationChain msgs = null;
			if (exp2 != null)
				msgs = ((InternalEObject)exp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterRESTAPIPackage.EXPR_BINAIRE__EXP2, null, msgs);
			if (newExp2 != null)
				msgs = ((InternalEObject)newExp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterRESTAPIPackage.EXPR_BINAIRE__EXP2, null, msgs);
			msgs = basicSetExp2(newExp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterRESTAPIPackage.EXPR_BINAIRE__EXP2, newExp2, newExp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterRESTAPIPackage.EXPR_BINAIRE__EXP1:
				return basicSetExp1(null, msgs);
			case TwitterRESTAPIPackage.EXPR_BINAIRE__EXP2:
				return basicSetExp2(null, msgs);
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
			case TwitterRESTAPIPackage.EXPR_BINAIRE__EXP1:
				return getExp1();
			case TwitterRESTAPIPackage.EXPR_BINAIRE__EXP2:
				return getExp2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TwitterRESTAPIPackage.EXPR_BINAIRE__EXP1:
				setExp1((Expression)newValue);
				return;
			case TwitterRESTAPIPackage.EXPR_BINAIRE__EXP2:
				setExp2((Expression)newValue);
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
			case TwitterRESTAPIPackage.EXPR_BINAIRE__EXP1:
				setExp1((Expression)null);
				return;
			case TwitterRESTAPIPackage.EXPR_BINAIRE__EXP2:
				setExp2((Expression)null);
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
			case TwitterRESTAPIPackage.EXPR_BINAIRE__EXP1:
				return exp1 != null;
			case TwitterRESTAPIPackage.EXPR_BINAIRE__EXP2:
				return exp2 != null;
		}
		return super.eIsSet(featureID);
	}

} //ExprBinaireImpl
