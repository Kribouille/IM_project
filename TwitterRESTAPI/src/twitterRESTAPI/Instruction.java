/**
 */
package twitterRESTAPI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.Instruction#getIsNot <em>Is Not</em>}</li>
 *   <li>{@link twitterRESTAPI.Instruction#getNext <em>Next</em>}</li>
 *   <li>{@link twitterRESTAPI.Instruction#getUnOp <em>Un Op</em>}</li>
 *   <li>{@link twitterRESTAPI.Instruction#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see twitterRESTAPI.TwitterRESTAPIPackage#getInstruction()
 * @model abstract="true"
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Not</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Not</em>' attribute.
	 * @see #setIsNot(Boolean)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getInstruction_IsNot()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getIsNot();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.Instruction#getIsNot <em>Is Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Not</em>' attribute.
	 * @see #getIsNot()
	 * @generated
	 */
	void setIsNot(Boolean value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link twitterRESTAPI.Instruction}.
	 * It is bidirectional and its opposite is '{@link twitterRESTAPI.Instruction#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getInstruction_Next()
	 * @see twitterRESTAPI.Instruction#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	EList<Instruction> getNext();

	/**
	 * Returns the value of the '<em><b>Un Op</b></em>' attribute.
	 * The literals are from the enumeration {@link twitterRESTAPI.UnOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Un Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Op</em>' attribute.
	 * @see twitterRESTAPI.UnOp
	 * @see #setUnOp(UnOp)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getInstruction_UnOp()
	 * @model
	 * @generated
	 */
	UnOp getUnOp();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.Instruction#getUnOp <em>Un Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Op</em>' attribute.
	 * @see twitterRESTAPI.UnOp
	 * @see #getUnOp()
	 * @generated
	 */
	void setUnOp(UnOp value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link twitterRESTAPI.Instruction}.
	 * It is bidirectional and its opposite is '{@link twitterRESTAPI.Instruction#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getInstruction_Previous()
	 * @see twitterRESTAPI.Instruction#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<Instruction> getPrevious();

} // Instruction
