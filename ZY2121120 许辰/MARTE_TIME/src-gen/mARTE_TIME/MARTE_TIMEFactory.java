/**
 */
package mARTE_TIME;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mARTE_TIME.MARTE_TIMEPackage
 * @generated
 */
public interface MARTE_TIMEFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MARTE_TIMEFactory eINSTANCE = mARTE_TIME.impl.MARTE_TIMEFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Timed Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Message</em>'.
	 * @generated
	 */
	TimedMessage createTimedMessage();

	/**
	 * Returns a new object of class '<em>Timed Instant Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Instant Constraint</em>'.
	 * @generated
	 */
	TimedInstantConstraint createTimedInstantConstraint();

	/**
	 * Returns a new object of class '<em>Timed Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Duration Constraint</em>'.
	 * @generated
	 */
	TimedDurationConstraint createTimedDurationConstraint();

	/**
	 * Returns a new object of class '<em>Duration Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration Predicate</em>'.
	 * @generated
	 */
	DurationPredicate createDurationPredicate();

	/**
	 * Returns a new object of class '<em>Timed Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Duration Observation</em>'.
	 * @generated
	 */
	TimedDurationObservation createTimedDurationObservation();

	/**
	 * Returns a new object of class '<em>Timed Instant Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Instant Observation</em>'.
	 * @generated
	 */
	TimedInstantObservation createTimedInstantObservation();

	/**
	 * Returns a new object of class '<em>Instant Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instant Predicate</em>'.
	 * @generated
	 */
	InstantPredicate createInstantPredicate();

	/**
	 * Returns a new object of class '<em>Logical Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Clock</em>'.
	 * @generated
	 */
	LogicalClock createLogicalClock();

	/**
	 * Returns a new object of class '<em>Chronometric Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chronometric Clock</em>'.
	 * @generated
	 */
	ChronometricClock createChronometricClock();

	/**
	 * Returns a new object of class '<em>Timed Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Behavior</em>'.
	 * @generated
	 */
	TimedBehavior createTimedBehavior();

	/**
	 * Returns a new object of class '<em>Timed Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Action</em>'.
	 * @generated
	 */
	TimedAction createTimedAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MARTE_TIMEPackage getMARTE_TIMEPackage();

} //MARTE_TIMEFactory
