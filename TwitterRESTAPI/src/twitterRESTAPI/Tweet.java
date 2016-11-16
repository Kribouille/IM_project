/**
 */
package twitterRESTAPI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tweet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.Tweet#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see twitterRESTAPI.TwitterRESTAPIPackage#getTweet()
 * @model
 * @generated
 */
public interface Tweet extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference list.
	 * The list contents are of type {@link twitterRESTAPI.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference list.
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getTweet_Entity()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntity();

} // Tweet
