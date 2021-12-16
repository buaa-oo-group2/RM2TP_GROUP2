/**
 */
package mARTE_TIME;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Instant Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.TimedInstantConstraint#getInstantpredication <em>Instantpredication</em>}</li>
 * </ul>
 *
 * @see mARTE_TIME.MARTE_TIMEPackage#getTimedInstantConstraint()
 * @model
 * @generated
 */
public interface TimedInstantConstraint extends TimedConstraint {
	/**
	 * Returns the value of the '<em><b>Instantpredication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantpredication</em>' containment reference.
	 * @see #setInstantpredication(InstantPredicate)
	 * @see mARTE_TIME.MARTE_TIMEPackage#getTimedInstantConstraint_Instantpredication()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InstantPredicate getInstantpredication();

	/**
	 * Sets the value of the '{@link mARTE_TIME.TimedInstantConstraint#getInstantpredication <em>Instantpredication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantpredication</em>' containment reference.
	 * @see #getInstantpredication()
	 * @generated
	 */
	void setInstantpredication(InstantPredicate value);

} // TimedInstantConstraint
