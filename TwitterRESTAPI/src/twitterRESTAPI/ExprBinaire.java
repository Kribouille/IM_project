/**
 */
package twitterRESTAPI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.ExprBinaire#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link twitterRESTAPI.ExprBinaire#getExp2 <em>Exp2</em>}</li>
 * </ul>
 *
 * @see twitterRESTAPI.TwitterRESTAPIPackage#getExprBinaire()
 * @model abstract="true"
 * @generated
 */
public interface ExprBinaire extends Expression {
	/**
	 * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp1</em>' containment reference.
	 * @see #setExp1(Expression)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getExprBinaire_Exp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExp1();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.ExprBinaire#getExp1 <em>Exp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp1</em>' containment reference.
	 * @see #getExp1()
	 * @generated
	 */
	void setExp1(Expression value);

	/**
	 * Returns the value of the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp2</em>' containment reference.
	 * @see #setExp2(Expression)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getExprBinaire_Exp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExp2();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.ExprBinaire#getExp2 <em>Exp2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp2</em>' containment reference.
	 * @see #getExp2()
	 * @generated
	 */
	void setExp2(Expression value);

} // ExprBinaire
