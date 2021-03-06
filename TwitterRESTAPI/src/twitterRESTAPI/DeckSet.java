/**
 */
package twitterRESTAPI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.DeckSet#getDeck <em>Deck</em>}</li>
 * </ul>
 *
 * @see twitterRESTAPI.TwitterRESTAPIPackage#getDeckSet()
 * @model
 * @generated
 */
public interface DeckSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Deck</b></em>' containment reference list.
	 * The list contents are of type {@link twitterRESTAPI.Deck}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deck</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck</em>' containment reference list.
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getDeckSet_Deck()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Deck> getDeck();

} // DeckSet
