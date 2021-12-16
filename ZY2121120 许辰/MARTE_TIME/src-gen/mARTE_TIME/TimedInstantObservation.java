/**
 */
package mARTE_TIME;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Instant Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.TimedInstantObservation#getObsKind <em>Obs Kind</em>}</li>
 * </ul>
 *
 * @see mARTE_TIME.MARTE_TIMEPackage#getTimedInstantObservation()
 * @model
 * @generated
 */
public interface TimedInstantObservation extends TimedObservation {
	/**
	 * Returns the value of the '<em><b>Obs Kind</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link mARTE_TIME.EventKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obs Kind</em>' attribute.
	 * @see mARTE_TIME.EventKind
	 * @see #setObsKind(EventKind)
	 * @see mARTE_TIME.MARTE_TIMEPackage#getTimedInstantObservation_ObsKind()
	 * @model default=""
	 * @generated
	 */
	EventKind getObsKind();

	/**
	 * Sets the value of the '{@link mARTE_TIME.TimedInstantObservation#getObsKind <em>Obs Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obs Kind</em>' attribute.
	 * @see mARTE_TIME.EventKind
	 * @see #getObsKind()
	 * @generated
	 */
	void setObsKind(EventKind value);

} // TimedInstantObservation
