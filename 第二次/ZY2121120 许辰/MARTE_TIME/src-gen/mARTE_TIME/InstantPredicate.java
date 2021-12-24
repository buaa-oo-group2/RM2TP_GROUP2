/**
 */
package mARTE_TIME;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instant Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.InstantPredicate#getTimedinstantobservation <em>Timedinstantobservation</em>}</li>
 * </ul>
 *
 * @see mARTE_TIME.MARTE_TIMEPackage#getInstantPredicate()
 * @model
 * @generated
 */
public interface InstantPredicate extends EObject {
	/**
	 * Returns the value of the '<em><b>Timedinstantobservation</b></em>' reference list.
	 * The list contents are of type {@link mARTE_TIME.TimedInstantObservation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timedinstantobservation</em>' reference list.
	 * @see mARTE_TIME.MARTE_TIMEPackage#getInstantPredicate_Timedinstantobservation()
	 * @model required="true"
	 * @generated
	 */
	EList<TimedInstantObservation> getTimedinstantobservation();

} // InstantPredicate
