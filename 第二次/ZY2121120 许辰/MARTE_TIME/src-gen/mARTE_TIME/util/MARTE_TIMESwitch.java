/**
 */
package mARTE_TIME.util;

import mARTE_TIME.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mARTE_TIME.MARTE_TIMEPackage
 * @generated
 */
public class MARTE_TIMESwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MARTE_TIMEPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_TIMESwitch() {
		if (modelPackage == null) {
			modelPackage = MARTE_TIMEPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MARTE_TIMEPackage.ROOT: {
			Root root = (Root) theEObject;
			T result = caseRoot(root);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_ELEMENT: {
			TimedElement timedElement = (TimedElement) theEObject;
			T result = caseTimedElement(timedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.CLOCK: {
			Clock clock = (Clock) theEObject;
			T result = caseClock(clock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_OBSERVATION: {
			TimedObservation timedObservation = (TimedObservation) theEObject;
			T result = caseTimedObservation(timedObservation);
			if (result == null)
				result = caseTimedElement(timedObservation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_CONSTRAINT: {
			TimedConstraint timedConstraint = (TimedConstraint) theEObject;
			T result = caseTimedConstraint(timedConstraint);
			if (result == null)
				result = caseTimedElement(timedConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_PROCESSING: {
			TimedProcessing timedProcessing = (TimedProcessing) theEObject;
			T result = caseTimedProcessing(timedProcessing);
			if (result == null)
				result = caseTimedElement(timedProcessing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_MESSAGE: {
			TimedMessage timedMessage = (TimedMessage) theEObject;
			T result = caseTimedMessage(timedMessage);
			if (result == null)
				result = caseTimedProcessing(timedMessage);
			if (result == null)
				result = caseTimedElement(timedMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT: {
			TimedInstantConstraint timedInstantConstraint = (TimedInstantConstraint) theEObject;
			T result = caseTimedInstantConstraint(timedInstantConstraint);
			if (result == null)
				result = caseTimedConstraint(timedInstantConstraint);
			if (result == null)
				result = caseTimedElement(timedInstantConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT: {
			TimedDurationConstraint timedDurationConstraint = (TimedDurationConstraint) theEObject;
			T result = caseTimedDurationConstraint(timedDurationConstraint);
			if (result == null)
				result = caseTimedConstraint(timedDurationConstraint);
			if (result == null)
				result = caseTimedElement(timedDurationConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.DURATION_PREDICATE: {
			DurationPredicate durationPredicate = (DurationPredicate) theEObject;
			T result = caseDurationPredicate(durationPredicate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_DURATION_OBSERVATION: {
			TimedDurationObservation timedDurationObservation = (TimedDurationObservation) theEObject;
			T result = caseTimedDurationObservation(timedDurationObservation);
			if (result == null)
				result = caseTimedObservation(timedDurationObservation);
			if (result == null)
				result = caseTimedElement(timedDurationObservation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_INSTANT_OBSERVATION: {
			TimedInstantObservation timedInstantObservation = (TimedInstantObservation) theEObject;
			T result = caseTimedInstantObservation(timedInstantObservation);
			if (result == null)
				result = caseTimedObservation(timedInstantObservation);
			if (result == null)
				result = caseTimedElement(timedInstantObservation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.INSTANT_PREDICATE: {
			InstantPredicate instantPredicate = (InstantPredicate) theEObject;
			T result = caseInstantPredicate(instantPredicate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.LOGICAL_CLOCK: {
			LogicalClock logicalClock = (LogicalClock) theEObject;
			T result = caseLogicalClock(logicalClock);
			if (result == null)
				result = caseClock(logicalClock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.CHRONOMETRIC_CLOCK: {
			ChronometricClock chronometricClock = (ChronometricClock) theEObject;
			T result = caseChronometricClock(chronometricClock);
			if (result == null)
				result = caseClock(chronometricClock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_BEHAVIOR: {
			TimedBehavior timedBehavior = (TimedBehavior) theEObject;
			T result = caseTimedBehavior(timedBehavior);
			if (result == null)
				result = caseTimedProcessing(timedBehavior);
			if (result == null)
				result = caseTimedElement(timedBehavior);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTE_TIMEPackage.TIMED_ACTION: {
			TimedAction timedAction = (TimedAction) theEObject;
			T result = caseTimedAction(timedAction);
			if (result == null)
				result = caseTimedProcessing(timedAction);
			if (result == null)
				result = caseTimedElement(timedAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedElement(TimedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedObservation(TimedObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedConstraint(TimedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedProcessing(TimedProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedMessage(TimedMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Instant Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Instant Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedInstantConstraint(TimedInstantConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Duration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedDurationConstraint(TimedDurationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationPredicate(DurationPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Duration Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedDurationObservation(TimedDurationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Instant Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Instant Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedInstantObservation(TimedInstantObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instant Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instant Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantPredicate(InstantPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalClock(LogicalClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chronometric Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chronometric Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChronometricClock(ChronometricClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedBehavior(TimedBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedAction(TimedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MARTE_TIMESwitch
