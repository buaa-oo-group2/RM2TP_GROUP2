/**
 */
package mARTE_TIME;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.TimedDurationConstraint#getDurationpredication <em>Durationpredication</em>}</li>
 * </ul>
 *
 * @see mARTE_TIME.MARTE_TIMEPackage#getTimedDurationConstraint()
 * @model
 * @generated
 */
public interface TimedDurationConstraint extends TimedConstraint {
	/**
	 * Returns the value of the '<em><b>Durationpredication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durationpredication</em>' containment reference.
	 * @see #setDurationpredication(DurationPredicate)
	 * @see mARTE_TIME.MARTE_TIMEPackage#getTimedDurationConstraint_Durationpredication()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DurationPredicate getDurationpredication();

	/**
	 * Sets the value of the '{@link mARTE_TIME.TimedDurationConstraint#getDurationpredication <em>Durationpredication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durationpredication</em>' containment reference.
	 * @see #getDurationpredication()
	 * @generated
	 */
	void setDurationpredication(DurationPredicate value);

} // TimedDurationConstraint
