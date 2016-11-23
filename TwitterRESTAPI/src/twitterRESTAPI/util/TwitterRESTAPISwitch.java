/**
 */
package twitterRESTAPI.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import twitterRESTAPI.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see twitterRESTAPI.TwitterRESTAPIPackage
 * @generated
 */
public class TwitterRESTAPISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TwitterRESTAPIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterRESTAPISwitch() {
		if (modelPackage == null) {
			modelPackage = TwitterRESTAPIPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TwitterRESTAPIPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseType(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.HASHTAG: {
				Hashtag hashtag = (Hashtag)theEObject;
				T result = caseHashtag(hashtag);
				if (result == null) result = caseType(hashtag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseType(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.DECK: {
				Deck deck = (Deck)theEObject;
				T result = caseDeck(deck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseExprBinaire(and);
				if (result == null) result = caseExpression(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseType(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.EXPR_BINAIRE: {
				ExprBinaire exprBinaire = (ExprBinaire)theEObject;
				T result = caseExprBinaire(exprBinaire);
				if (result == null) result = caseExpression(exprBinaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseExprBinaire(or);
				if (result == null) result = caseExpression(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.EQUALS: {
				equals equals = (equals)theEObject;
				T result = caseequals(equals);
				if (result == null) result = caseOperation(equals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.LESS_THAN: {
				lessThan lessThan = (lessThan)theEObject;
				T result = caselessThan(lessThan);
				if (result == null) result = caseOperation(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.EXPR_SIMPLE: {
				ExprSimple exprSimple = (ExprSimple)theEObject;
				T result = caseExprSimple(exprSimple);
				if (result == null) result = caseExpression(exprSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TwitterRESTAPIPackage.UPPER_THAN: {
				upperThan upperThan = (upperThan)theEObject;
				T result = caseupperThan(upperThan);
				if (result == null) result = caseOperation(upperThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expr Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expr Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExprBinaire(ExprBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseequals(equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselessThan(lessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expr Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expr Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExprSimple(ExprSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>upper Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>upper Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseupperThan(upperThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hashtag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hashtag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashtag(Hashtag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deck</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deck</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeck(Deck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TwitterRESTAPISwitch
