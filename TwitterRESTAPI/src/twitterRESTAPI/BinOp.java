/**
 */
package twitterRESTAPI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.BinOp#getRight <em>Right</em>}</li>
 *   <li>{@link twitterRESTAPI.BinOp#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see twitterRESTAPI.TwitterRESTAPIPackage#getBinOp()
 * @model abstract="true"
 * @generated
 */
public interface BinOp extends Instruction {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Instruction)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getBinOp_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instruction getRight();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.BinOp#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Instruction value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Instruction)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getBinOp_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instruction getLeft();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.BinOp#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Instruction value);

} // BinOp
