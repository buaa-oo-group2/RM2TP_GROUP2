/**
 */
package mARTE_TIME;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.DurationPredicate#getTimeddurationobservation <em>Timeddurationobservation</em>}</li>
 * </ul>
 *
 * @see mARTE_TIME.MARTE_TIMEPackage#getDurationPredicate()
 * @model
 * @generated
 */
public interface DurationPredicate extends EObject {
	/**
	 * Returns the value of the '<em><b>Timeddurationobservation</b></em>' reference list.
	 * The list contents are of type {@link mARTE_TIME.TimedDurationObservation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeddurationobservation</em>' reference list.
	 * @see mARTE_TIME.MARTE_TIMEPackage#getDurationPredicate_Timeddurationobservation()
	 * @model required="true"
	 * @generated
	 */
	EList<TimedDurationObservation> getTimeddurationobservation();

} // DurationPredicate
