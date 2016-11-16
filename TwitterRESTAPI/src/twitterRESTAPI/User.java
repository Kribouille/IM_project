/**
 */
package twitterRESTAPI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.User#getFollowers <em>Followers</em>}</li>
 *   <li>{@link twitterRESTAPI.User#getFriends <em>Friends</em>}</li>
 *   <li>{@link twitterRESTAPI.User#getStatus <em>Status</em>}</li>
 *   <li>{@link twitterRESTAPI.User#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @see twitterRESTAPI.TwitterRESTAPIPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Followers</b></em>' reference list.
	 * The list contents are of type {@link twitterRESTAPI.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Followers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers</em>' reference list.
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getUser_Followers()
	 * @model
	 * @generated
	 */
	EList<User> getFollowers();

	/**
	 * Returns the value of the '<em><b>Friends</b></em>' reference list.
	 * The list contents are of type {@link twitterRESTAPI.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friends</em>' reference list.
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getUser_Friends()
	 * @model
	 * @generated
	 */
	EList<User> getFriends();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference list.
	 * The list contents are of type {@link twitterRESTAPI.Tweet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference list.
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getUser_Status()
	 * @model
	 * @generated
	 */
	EList<Tweet> getStatus();

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link twitterRESTAPI.Place#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getUser_Place()
	 * @see twitterRESTAPI.Place#getUser
	 * @model opposite="user"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.User#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // User
