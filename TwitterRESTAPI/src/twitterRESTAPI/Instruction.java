/**
 */
package twitterRESTAPI;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link twitterRESTAPI.Instruction#getOp <em>Op</em>}</li>
 *   <li>{@link twitterRESTAPI.Instruction#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see twitterRESTAPI.TwitterRESTAPIPackage#getInstruction()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Instruction extends CDOObject {
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
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(UnOp)
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getInstruction_Op()
	 * @model containment="true"
	 * @generated
	 */
	UnOp getOp();

	/**
	 * Sets the value of the '{@link twitterRESTAPI.Instruction#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(UnOp value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link twitterRESTAPI.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#getInstruction_Next()
	 * @model
	 * @generated
	 */
	EList<Instruction> getNext();

} // Instruction
