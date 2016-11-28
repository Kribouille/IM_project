/**
 */
package twitterRESTAPI.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import twitterRESTAPI.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see twitterRESTAPI.TwitterRESTAPIPackage
 * @generated
 */
public class TwitterRESTAPIAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TwitterRESTAPIPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterRESTAPIAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TwitterRESTAPIPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwitterRESTAPISwitch<Adapter> modelSwitch =
		new TwitterRESTAPISwitch<Adapter>() {
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseHashtag(Hashtag object) {
				return createHashtagAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseDeck(Deck object) {
				return createDeckAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseExprBinaire(ExprBinaire object) {
				return createExprBinaireAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseequals(equals object) {
				return createequalsAdapter();
			}
			@Override
			public Adapter caselessThan(lessThan object) {
				return createlessThanAdapter();
			}
			@Override
			public Adapter caseExprSimple(ExprSimple object) {
				return createExprSimpleAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseupperThan(upperThan object) {
				return createupperThanAdapter();
			}
			@Override
			public Adapter caseWebPage(WebPage object) {
				return createWebPageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.ExprBinaire <em>Expr Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.ExprBinaire
	 * @generated
	 */
	public Adapter createExprBinaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.equals <em>equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.equals
	 * @generated
	 */
	public Adapter createequalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.lessThan <em>less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.lessThan
	 * @generated
	 */
	public Adapter createlessThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.ExprSimple <em>Expr Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.ExprSimple
	 * @generated
	 */
	public Adapter createExprSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.upperThan <em>upper Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.upperThan
	 * @generated
	 */
	public Adapter createupperThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.WebPage
	 * @generated
	 */
	public Adapter createWebPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.Hashtag <em>Hashtag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.Hashtag
	 * @generated
	 */
	public Adapter createHashtagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.Deck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.Deck
	 * @generated
	 */
	public Adapter createDeckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link twitterRESTAPI.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see twitterRESTAPI.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TwitterRESTAPIAdapterFactory
