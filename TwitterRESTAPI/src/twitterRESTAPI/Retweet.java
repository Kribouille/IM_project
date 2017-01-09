/**
 */
package twitterRESTAPI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retweet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.Retweet#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see twitterRESTAPI.TwitterRESTAPIPackage#getRetweet()
 * @model
 * @generated
 */
public interface Retweet extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getRetweet_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.Retweet#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Retweet
