/**
 */
package twitterRESTAPI;

import org.eclipse.emf.cdo.CDOObject;

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

} // Instruction
