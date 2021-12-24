/**
 */
package mARTE_TIME;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.TimedMessage#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mARTE_TIME.MARTE_TIMEPackage#getTimedMessage()
 * @model
 * @generated
 */
public interface TimedMessage extends TimedProcessing {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mARTE_TIME.MARTE_TIMEPackage#getTimedMessage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mARTE_TIME.TimedMessage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // TimedMessage
