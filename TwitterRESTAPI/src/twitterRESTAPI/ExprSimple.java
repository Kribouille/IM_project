/**
 */
package twitterRESTAPI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.ExprSimple#getValue <em>Value</em>}</li>
 *   <li>{@link twitterRESTAPI.ExprSimple#getType <em>Type</em>}</li>
 *   <li>{@link twitterRESTAPI.ExprSimple#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see twitterRESTAPI.TwitterRESTAPIPackage#getExprSimple()
 * @model
 * @generated
 */
public interface ExprSimple extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getExprSimple_Value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.ExprSimple#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getExprSimple_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.ExprSimple#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getExprSimple_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.ExprSimple#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // ExprSimple
