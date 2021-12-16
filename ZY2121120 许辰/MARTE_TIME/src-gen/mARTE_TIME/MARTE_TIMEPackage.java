/**
 */
package mARTE_TIME;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mARTE_TIME.MARTE_TIMEFactory
 * @model kind="package"
 * @generated
 */
public interface MARTE_TIMEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mARTE_TIME";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mARTE_TIME";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mARTE_TIME";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MARTE_TIMEPackage eINSTANCE = mARTE_TIME.impl.MARTE_TIMEPackageImpl.init();

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.RootImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Timedelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TIMEDELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedElementImpl <em>Timed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedElementImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedElement()
	 * @generated
	 */
	int TIMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ELEMENT__CLOCK = 0;

	/**
	 * The number of structural features of the '<em>Timed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.ClockImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 2;

	/**
	 * The feature id for the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__CURRENT_TIME = 0;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedObservationImpl <em>Timed Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedObservationImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedObservation()
	 * @generated
	 */
	int TIMED_OBSERVATION = 3;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_OBSERVATION__CLOCK = TIMED_ELEMENT__CLOCK;

	/**
	 * The number of structural features of the '<em>Timed Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_OBSERVATION_FEATURE_COUNT = TIMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timed Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_OBSERVATION_OPERATION_COUNT = TIMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedConstraintImpl <em>Timed Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedConstraintImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedConstraint()
	 * @generated
	 */
	int TIMED_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONSTRAINT__CLOCK = TIMED_ELEMENT__CLOCK;

	/**
	 * The number of structural features of the '<em>Timed Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONSTRAINT_FEATURE_COUNT = TIMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timed Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_CONSTRAINT_OPERATION_COUNT = TIMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedProcessingImpl <em>Timed Processing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedProcessingImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedProcessing()
	 * @generated
	 */
	int TIMED_PROCESSING = 5;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_PROCESSING__CLOCK = TIMED_ELEMENT__CLOCK;

	/**
	 * The number of structural features of the '<em>Timed Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_PROCESSING_FEATURE_COUNT = TIMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timed Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_PROCESSING_OPERATION_COUNT = TIMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedMessageImpl <em>Timed Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedMessageImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedMessage()
	 * @generated
	 */
	int TIMED_MESSAGE = 6;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_MESSAGE__CLOCK = TIMED_PROCESSING__CLOCK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_MESSAGE__NAME = TIMED_PROCESSING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_MESSAGE_FEATURE_COUNT = TIMED_PROCESSING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_MESSAGE_OPERATION_COUNT = TIMED_PROCESSING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedInstantConstraintImpl <em>Timed Instant Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedInstantConstraintImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedInstantConstraint()
	 * @generated
	 */
	int TIMED_INSTANT_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_CONSTRAINT__CLOCK = TIMED_CONSTRAINT__CLOCK;

	/**
	 * The feature id for the '<em><b>Instantpredication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION = TIMED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Instant Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_CONSTRAINT_FEATURE_COUNT = TIMED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Instant Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_CONSTRAINT_OPERATION_COUNT = TIMED_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedDurationConstraintImpl <em>Timed Duration Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedDurationConstraintImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedDurationConstraint()
	 * @generated
	 */
	int TIMED_DURATION_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_CONSTRAINT__CLOCK = TIMED_CONSTRAINT__CLOCK;

	/**
	 * The feature id for the '<em><b>Durationpredication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION = TIMED_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Duration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_CONSTRAINT_FEATURE_COUNT = TIMED_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Duration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_CONSTRAINT_OPERATION_COUNT = TIMED_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.DurationPredicateImpl <em>Duration Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.DurationPredicateImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getDurationPredicate()
	 * @generated
	 */
	int DURATION_PREDICATE = 9;

	/**
	 * The feature id for the '<em><b>Timeddurationobservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_PREDICATE__TIMEDDURATIONOBSERVATION = 0;

	/**
	 * The number of structural features of the '<em>Duration Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_PREDICATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Duration Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedDurationObservationImpl <em>Timed Duration Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedDurationObservationImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedDurationObservation()
	 * @generated
	 */
	int TIMED_DURATION_OBSERVATION = 10;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_OBSERVATION__CLOCK = TIMED_OBSERVATION__CLOCK;

	/**
	 * The feature id for the '<em><b>Obs Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_OBSERVATION__OBS_KIND = TIMED_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Duration Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_OBSERVATION_FEATURE_COUNT = TIMED_OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Duration Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_DURATION_OBSERVATION_OPERATION_COUNT = TIMED_OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedInstantObservationImpl <em>Timed Instant Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedInstantObservationImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedInstantObservation()
	 * @generated
	 */
	int TIMED_INSTANT_OBSERVATION = 11;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_OBSERVATION__CLOCK = TIMED_OBSERVATION__CLOCK;

	/**
	 * The feature id for the '<em><b>Obs Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_OBSERVATION__OBS_KIND = TIMED_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Instant Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_OBSERVATION_FEATURE_COUNT = TIMED_OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Instant Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_INSTANT_OBSERVATION_OPERATION_COUNT = TIMED_OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.InstantPredicateImpl <em>Instant Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.InstantPredicateImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getInstantPredicate()
	 * @generated
	 */
	int INSTANT_PREDICATE = 12;

	/**
	 * The feature id for the '<em><b>Timedinstantobservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_PREDICATE__TIMEDINSTANTOBSERVATION = 0;

	/**
	 * The number of structural features of the '<em>Instant Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_PREDICATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instant Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.LogicalClockImpl <em>Logical Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.LogicalClockImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getLogicalClock()
	 * @generated
	 */
	int LOGICAL_CLOCK = 13;

	/**
	 * The feature id for the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLOCK__CURRENT_TIME = CLOCK__CURRENT_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLOCK__NAME = CLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLOCK_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLOCK_OPERATION_COUNT = CLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.ChronometricClockImpl <em>Chronometric Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.ChronometricClockImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getChronometricClock()
	 * @generated
	 */
	int CHRONOMETRIC_CLOCK = 14;

	/**
	 * The feature id for the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHRONOMETRIC_CLOCK__CURRENT_TIME = CLOCK__CURRENT_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHRONOMETRIC_CLOCK__NAME = CLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chronometric Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHRONOMETRIC_CLOCK_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Chronometric Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHRONOMETRIC_CLOCK_OPERATION_COUNT = CLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedBehaviorImpl <em>Timed Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedBehaviorImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedBehavior()
	 * @generated
	 */
	int TIMED_BEHAVIOR = 15;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_BEHAVIOR__CLOCK = TIMED_PROCESSING__CLOCK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_BEHAVIOR__NAME = TIMED_PROCESSING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_BEHAVIOR_FEATURE_COUNT = TIMED_PROCESSING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_BEHAVIOR_OPERATION_COUNT = TIMED_PROCESSING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.impl.TimedActionImpl <em>Timed Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.impl.TimedActionImpl
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedAction()
	 * @generated
	 */
	int TIMED_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION__CLOCK = TIMED_PROCESSING__CLOCK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION__NAME = TIMED_PROCESSING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION_FEATURE_COUNT = TIMED_PROCESSING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION_OPERATION_COUNT = TIMED_PROCESSING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE_TIME.EventKind <em>Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE_TIME.EventKind
	 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getEventKind()
	 * @generated
	 */
	int EVENT_KIND = 17;

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see mARTE_TIME.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link mARTE_TIME.Root#getTimedelement <em>Timedelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timedelement</em>'.
	 * @see mARTE_TIME.Root#getTimedelement()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Timedelement();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedElement <em>Timed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Element</em>'.
	 * @see mARTE_TIME.TimedElement
	 * @generated
	 */
	EClass getTimedElement();

	/**
	 * Returns the meta object for the reference '{@link mARTE_TIME.TimedElement#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see mARTE_TIME.TimedElement#getClock()
	 * @see #getTimedElement()
	 * @generated
	 */
	EReference getTimedElement_Clock();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see mARTE_TIME.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the attribute '{@link mARTE_TIME.Clock#getCurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Time</em>'.
	 * @see mARTE_TIME.Clock#getCurrentTime()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_CurrentTime();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedObservation <em>Timed Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Observation</em>'.
	 * @see mARTE_TIME.TimedObservation
	 * @generated
	 */
	EClass getTimedObservation();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedConstraint <em>Timed Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Constraint</em>'.
	 * @see mARTE_TIME.TimedConstraint
	 * @generated
	 */
	EClass getTimedConstraint();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedProcessing <em>Timed Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Processing</em>'.
	 * @see mARTE_TIME.TimedProcessing
	 * @generated
	 */
	EClass getTimedProcessing();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedMessage <em>Timed Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Message</em>'.
	 * @see mARTE_TIME.TimedMessage
	 * @generated
	 */
	EClass getTimedMessage();

	/**
	 * Returns the meta object for the attribute '{@link mARTE_TIME.TimedMessage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mARTE_TIME.TimedMessage#getName()
	 * @see #getTimedMessage()
	 * @generated
	 */
	EAttribute getTimedMessage_Name();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedInstantConstraint <em>Timed Instant Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Instant Constraint</em>'.
	 * @see mARTE_TIME.TimedInstantConstraint
	 * @generated
	 */
	EClass getTimedInstantConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link mARTE_TIME.TimedInstantConstraint#getInstantpredication <em>Instantpredication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instantpredication</em>'.
	 * @see mARTE_TIME.TimedInstantConstraint#getInstantpredication()
	 * @see #getTimedInstantConstraint()
	 * @generated
	 */
	EReference getTimedInstantConstraint_Instantpredication();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedDurationConstraint <em>Timed Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Duration Constraint</em>'.
	 * @see mARTE_TIME.TimedDurationConstraint
	 * @generated
	 */
	EClass getTimedDurationConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link mARTE_TIME.TimedDurationConstraint#getDurationpredication <em>Durationpredication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Durationpredication</em>'.
	 * @see mARTE_TIME.TimedDurationConstraint#getDurationpredication()
	 * @see #getTimedDurationConstraint()
	 * @generated
	 */
	EReference getTimedDurationConstraint_Durationpredication();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.DurationPredicate <em>Duration Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Predicate</em>'.
	 * @see mARTE_TIME.DurationPredicate
	 * @generated
	 */
	EClass getDurationPredicate();

	/**
	 * Returns the meta object for the reference list '{@link mARTE_TIME.DurationPredicate#getTimeddurationobservation <em>Timeddurationobservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Timeddurationobservation</em>'.
	 * @see mARTE_TIME.DurationPredicate#getTimeddurationobservation()
	 * @see #getDurationPredicate()
	 * @generated
	 */
	EReference getDurationPredicate_Timeddurationobservation();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedDurationObservation <em>Timed Duration Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Duration Observation</em>'.
	 * @see mARTE_TIME.TimedDurationObservation
	 * @generated
	 */
	EClass getTimedDurationObservation();

	/**
	 * Returns the meta object for the attribute '{@link mARTE_TIME.TimedDurationObservation#getObsKind <em>Obs Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obs Kind</em>'.
	 * @see mARTE_TIME.TimedDurationObservation#getObsKind()
	 * @see #getTimedDurationObservation()
	 * @generated
	 */
	EAttribute getTimedDurationObservation_ObsKind();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedInstantObservation <em>Timed Instant Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Instant Observation</em>'.
	 * @see mARTE_TIME.TimedInstantObservation
	 * @generated
	 */
	EClass getTimedInstantObservation();

	/**
	 * Returns the meta object for the attribute '{@link mARTE_TIME.TimedInstantObservation#getObsKind <em>Obs Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obs Kind</em>'.
	 * @see mARTE_TIME.TimedInstantObservation#getObsKind()
	 * @see #getTimedInstantObservation()
	 * @generated
	 */
	EAttribute getTimedInstantObservation_ObsKind();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.InstantPredicate <em>Instant Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant Predicate</em>'.
	 * @see mARTE_TIME.InstantPredicate
	 * @generated
	 */
	EClass getInstantPredicate();

	/**
	 * Returns the meta object for the reference list '{@link mARTE_TIME.InstantPredicate#getTimedinstantobservation <em>Timedinstantobservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Timedinstantobservation</em>'.
	 * @see mARTE_TIME.InstantPredicate#getTimedinstantobservation()
	 * @see #getInstantPredicate()
	 * @generated
	 */
	EReference getInstantPredicate_Timedinstantobservation();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.LogicalClock <em>Logical Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Clock</em>'.
	 * @see mARTE_TIME.LogicalClock
	 * @generated
	 */
	EClass getLogicalClock();

	/**
	 * Returns the meta object for the attribute '{@link mARTE_TIME.LogicalClock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mARTE_TIME.LogicalClock#getName()
	 * @see #getLogicalClock()
	 * @generated
	 */
	EAttribute getLogicalClock_Name();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.ChronometricClock <em>Chronometric Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chronometric Clock</em>'.
	 * @see mARTE_TIME.ChronometricClock
	 * @generated
	 */
	EClass getChronometricClock();

	/**
	 * Returns the meta object for the attribute '{@link mARTE_TIME.ChronometricClock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mARTE_TIME.ChronometricClock#getName()
	 * @see #getChronometricClock()
	 * @generated
	 */
	EAttribute getChronometricClock_Name();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedBehavior <em>Timed Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Behavior</em>'.
	 * @see mARTE_TIME.TimedBehavior
	 * @generated
	 */
	EClass getTimedBehavior();

	/**
	 * Returns the meta object for the attribute '{@link mARTE_TIME.TimedBehavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mARTE_TIME.TimedBehavior#getName()
	 * @see #getTimedBehavior()
	 * @generated
	 */
	EAttribute getTimedBehavior_Name();

	/**
	 * Returns the meta object for class '{@link mARTE_TIME.TimedAction <em>Timed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Action</em>'.
	 * @see mARTE_TIME.TimedAction
	 * @generated
	 */
	EClass getTimedAction();

	/**
	 * Returns the meta object for the attribute '{@link mARTE_TIME.TimedAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mARTE_TIME.TimedAction#getName()
	 * @see #getTimedAction()
	 * @generated
	 */
	EAttribute getTimedAction_Name();

	/**
	 * Returns the meta object for enum '{@link mARTE_TIME.EventKind <em>Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Kind</em>'.
	 * @see mARTE_TIME.EventKind
	 * @generated
	 */
	EEnum getEventKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MARTE_TIMEFactory getMARTE_TIMEFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.RootImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Timedelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__TIMEDELEMENT = eINSTANCE.getRoot_Timedelement();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedElementImpl <em>Timed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedElementImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedElement()
		 * @generated
		 */
		EClass TIMED_ELEMENT = eINSTANCE.getTimedElement();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ELEMENT__CLOCK = eINSTANCE.getTimedElement_Clock();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.ClockImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Current Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__CURRENT_TIME = eINSTANCE.getClock_CurrentTime();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedObservationImpl <em>Timed Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedObservationImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedObservation()
		 * @generated
		 */
		EClass TIMED_OBSERVATION = eINSTANCE.getTimedObservation();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedConstraintImpl <em>Timed Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedConstraintImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedConstraint()
		 * @generated
		 */
		EClass TIMED_CONSTRAINT = eINSTANCE.getTimedConstraint();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedProcessingImpl <em>Timed Processing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedProcessingImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedProcessing()
		 * @generated
		 */
		EClass TIMED_PROCESSING = eINSTANCE.getTimedProcessing();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedMessageImpl <em>Timed Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedMessageImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedMessage()
		 * @generated
		 */
		EClass TIMED_MESSAGE = eINSTANCE.getTimedMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_MESSAGE__NAME = eINSTANCE.getTimedMessage_Name();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedInstantConstraintImpl <em>Timed Instant Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedInstantConstraintImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedInstantConstraint()
		 * @generated
		 */
		EClass TIMED_INSTANT_CONSTRAINT = eINSTANCE.getTimedInstantConstraint();

		/**
		 * The meta object literal for the '<em><b>Instantpredication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION = eINSTANCE
				.getTimedInstantConstraint_Instantpredication();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedDurationConstraintImpl <em>Timed Duration Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedDurationConstraintImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedDurationConstraint()
		 * @generated
		 */
		EClass TIMED_DURATION_CONSTRAINT = eINSTANCE.getTimedDurationConstraint();

		/**
		 * The meta object literal for the '<em><b>Durationpredication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION = eINSTANCE
				.getTimedDurationConstraint_Durationpredication();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.DurationPredicateImpl <em>Duration Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.DurationPredicateImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getDurationPredicate()
		 * @generated
		 */
		EClass DURATION_PREDICATE = eINSTANCE.getDurationPredicate();

		/**
		 * The meta object literal for the '<em><b>Timeddurationobservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURATION_PREDICATE__TIMEDDURATIONOBSERVATION = eINSTANCE
				.getDurationPredicate_Timeddurationobservation();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedDurationObservationImpl <em>Timed Duration Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedDurationObservationImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedDurationObservation()
		 * @generated
		 */
		EClass TIMED_DURATION_OBSERVATION = eINSTANCE.getTimedDurationObservation();

		/**
		 * The meta object literal for the '<em><b>Obs Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_DURATION_OBSERVATION__OBS_KIND = eINSTANCE.getTimedDurationObservation_ObsKind();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedInstantObservationImpl <em>Timed Instant Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedInstantObservationImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedInstantObservation()
		 * @generated
		 */
		EClass TIMED_INSTANT_OBSERVATION = eINSTANCE.getTimedInstantObservation();

		/**
		 * The meta object literal for the '<em><b>Obs Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_INSTANT_OBSERVATION__OBS_KIND = eINSTANCE.getTimedInstantObservation_ObsKind();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.InstantPredicateImpl <em>Instant Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.InstantPredicateImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getInstantPredicate()
		 * @generated
		 */
		EClass INSTANT_PREDICATE = eINSTANCE.getInstantPredicate();

		/**
		 * The meta object literal for the '<em><b>Timedinstantobservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANT_PREDICATE__TIMEDINSTANTOBSERVATION = eINSTANCE.getInstantPredicate_Timedinstantobservation();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.LogicalClockImpl <em>Logical Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.LogicalClockImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getLogicalClock()
		 * @generated
		 */
		EClass LOGICAL_CLOCK = eINSTANCE.getLogicalClock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CLOCK__NAME = eINSTANCE.getLogicalClock_Name();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.ChronometricClockImpl <em>Chronometric Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.ChronometricClockImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getChronometricClock()
		 * @generated
		 */
		EClass CHRONOMETRIC_CLOCK = eINSTANCE.getChronometricClock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHRONOMETRIC_CLOCK__NAME = eINSTANCE.getChronometricClock_Name();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedBehaviorImpl <em>Timed Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedBehaviorImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedBehavior()
		 * @generated
		 */
		EClass TIMED_BEHAVIOR = eINSTANCE.getTimedBehavior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_BEHAVIOR__NAME = eINSTANCE.getTimedBehavior_Name();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.impl.TimedActionImpl <em>Timed Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.impl.TimedActionImpl
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getTimedAction()
		 * @generated
		 */
		EClass TIMED_ACTION = eINSTANCE.getTimedAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_ACTION__NAME = eINSTANCE.getTimedAction_Name();

		/**
		 * The meta object literal for the '{@link mARTE_TIME.EventKind <em>Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE_TIME.EventKind
		 * @see mARTE_TIME.impl.MARTE_TIMEPackageImpl#getEventKind()
		 * @generated
		 */
		EEnum EVENT_KIND = eINSTANCE.getEventKind();

	}

} //MARTE_TIMEPackage
