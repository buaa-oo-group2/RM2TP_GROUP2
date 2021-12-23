/**
 */
package mARTE_TIME.impl;

import mARTE_TIME.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MARTE_TIMEFactoryImpl extends EFactoryImpl implements MARTE_TIMEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MARTE_TIMEFactory init() {
		try {
			MARTE_TIMEFactory theMARTE_TIMEFactory = (MARTE_TIMEFactory) EPackage.Registry.INSTANCE
					.getEFactory(MARTE_TIMEPackage.eNS_URI);
			if (theMARTE_TIMEFactory != null) {
				return theMARTE_TIMEFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MARTE_TIMEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_TIMEFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MARTE_TIMEPackage.ROOT:
			return createRoot();
		case MARTE_TIMEPackage.TIMED_MESSAGE:
			return createTimedMessage();
		case MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT:
			return createTimedInstantConstraint();
		case MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT:
			return createTimedDurationConstraint();
		case MARTE_TIMEPackage.DURATION_PREDICATE:
			return createDurationPredicate();
		case MARTE_TIMEPackage.TIMED_DURATION_OBSERVATION:
			return createTimedDurationObservation();
		case MARTE_TIMEPackage.TIMED_INSTANT_OBSERVATION:
			return createTimedInstantObservation();
		case MARTE_TIMEPackage.INSTANT_PREDICATE:
			return createInstantPredicate();
		case MARTE_TIMEPackage.LOGICAL_CLOCK:
			return createLogicalClock();
		case MARTE_TIMEPackage.CHRONOMETRIC_CLOCK:
			return createChronometricClock();
		case MARTE_TIMEPackage.TIMED_BEHAVIOR:
			return createTimedBehavior();
		case MARTE_TIMEPackage.TIMED_ACTION:
			return createTimedAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MARTE_TIMEPackage.EVENT_KIND:
			return createEventKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MARTE_TIMEPackage.EVENT_KIND:
			return convertEventKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedMessage createTimedMessage() {
		TimedMessageImpl timedMessage = new TimedMessageImpl();
		return timedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedInstantConstraint createTimedInstantConstraint() {
		TimedInstantConstraintImpl timedInstantConstraint = new TimedInstantConstraintImpl();
		return timedInstantConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedDurationConstraint createTimedDurationConstraint() {
		TimedDurationConstraintImpl timedDurationConstraint = new TimedDurationConstraintImpl();
		return timedDurationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationPredicate createDurationPredicate() {
		DurationPredicateImpl durationPredicate = new DurationPredicateImpl();
		return durationPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedDurationObservation createTimedDurationObservation() {
		TimedDurationObservationImpl timedDurationObservation = new TimedDurationObservationImpl();
		return timedDurationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedInstantObservation createTimedInstantObservation() {
		TimedInstantObservationImpl timedInstantObservation = new TimedInstantObservationImpl();
		return timedInstantObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantPredicate createInstantPredicate() {
		InstantPredicateImpl instantPredicate = new InstantPredicateImpl();
		return instantPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalClock createLogicalClock() {
		LogicalClockImpl logicalClock = new LogicalClockImpl();
		return logicalClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChronometricClock createChronometricClock() {
		ChronometricClockImpl chronometricClock = new ChronometricClockImpl();
		return chronometricClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedBehavior createTimedBehavior() {
		TimedBehaviorImpl timedBehavior = new TimedBehaviorImpl();
		return timedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedAction createTimedAction() {
		TimedActionImpl timedAction = new TimedActionImpl();
		return timedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind createEventKindFromString(EDataType eDataType, String initialValue) {
		EventKind result = EventKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_TIMEPackage getMARTE_TIMEPackage() {
		return (MARTE_TIMEPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MARTE_TIMEPackage getPackage() {
		return MARTE_TIMEPackage.eINSTANCE;
	}

} //MARTE_TIMEFactoryImpl
