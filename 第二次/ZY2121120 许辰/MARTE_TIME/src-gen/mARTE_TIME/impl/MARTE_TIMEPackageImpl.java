/**
 */
package mARTE_TIME.impl;

import mARTE_TIME.ChronometricClock;
import mARTE_TIME.Clock;
import mARTE_TIME.DurationPredicate;
import mARTE_TIME.EventKind;
import mARTE_TIME.InstantPredicate;
import mARTE_TIME.LogicalClock;
import mARTE_TIME.MARTE_TIMEFactory;
import mARTE_TIME.MARTE_TIMEPackage;
import mARTE_TIME.Root;
import mARTE_TIME.TimedAction;
import mARTE_TIME.TimedBehavior;
import mARTE_TIME.TimedConstraint;
import mARTE_TIME.TimedDurationConstraint;
import mARTE_TIME.TimedDurationObservation;
import mARTE_TIME.TimedElement;
import mARTE_TIME.TimedInstantConstraint;
import mARTE_TIME.TimedInstantObservation;
import mARTE_TIME.TimedMessage;
import mARTE_TIME.TimedObservation;
import mARTE_TIME.TimedProcessing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MARTE_TIMEPackageImpl extends EPackageImpl implements MARTE_TIMEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedProcessingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedInstantConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedDurationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedDurationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedInstantObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chronometricClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mARTE_TIME.MARTE_TIMEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MARTE_TIMEPackageImpl() {
		super(eNS_URI, MARTE_TIMEFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MARTE_TIMEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MARTE_TIMEPackage init() {
		if (isInited)
			return (MARTE_TIMEPackage) EPackage.Registry.INSTANCE.getEPackage(MARTE_TIMEPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMARTE_TIMEPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MARTE_TIMEPackageImpl theMARTE_TIMEPackage = registeredMARTE_TIMEPackage instanceof MARTE_TIMEPackageImpl
				? (MARTE_TIMEPackageImpl) registeredMARTE_TIMEPackage
				: new MARTE_TIMEPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMARTE_TIMEPackage.createPackageContents();

		// Initialize created meta-data
		theMARTE_TIMEPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMARTE_TIMEPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MARTE_TIMEPackage.eNS_URI, theMARTE_TIMEPackage);
		return theMARTE_TIMEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Timedelement() {
		return (EReference) rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedElement() {
		return timedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedElement_Clock() {
		return (EReference) timedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClock() {
		return clockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClock_CurrentTime() {
		return (EAttribute) clockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedObservation() {
		return timedObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedConstraint() {
		return timedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedProcessing() {
		return timedProcessingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedMessage() {
		return timedMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedMessage_Name() {
		return (EAttribute) timedMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedInstantConstraint() {
		return timedInstantConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedInstantConstraint_Instantpredication() {
		return (EReference) timedInstantConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedDurationConstraint() {
		return timedDurationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedDurationConstraint_Durationpredication() {
		return (EReference) timedDurationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationPredicate() {
		return durationPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationPredicate_Timeddurationobservation() {
		return (EReference) durationPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedDurationObservation() {
		return timedDurationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedDurationObservation_ObsKind() {
		return (EAttribute) timedDurationObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedInstantObservation() {
		return timedInstantObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedInstantObservation_ObsKind() {
		return (EAttribute) timedInstantObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantPredicate() {
		return instantPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantPredicate_Timedinstantobservation() {
		return (EReference) instantPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalClock() {
		return logicalClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalClock_Name() {
		return (EAttribute) logicalClockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChronometricClock() {
		return chronometricClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChronometricClock_Name() {
		return (EAttribute) chronometricClockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedBehavior() {
		return timedBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedBehavior_Name() {
		return (EAttribute) timedBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedAction() {
		return timedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedAction_Name() {
		return (EAttribute) timedActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventKind() {
		return eventKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_TIMEFactory getMARTE_TIMEFactory() {
		return (MARTE_TIMEFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__TIMEDELEMENT);

		timedElementEClass = createEClass(TIMED_ELEMENT);
		createEReference(timedElementEClass, TIMED_ELEMENT__CLOCK);

		clockEClass = createEClass(CLOCK);
		createEAttribute(clockEClass, CLOCK__CURRENT_TIME);

		timedObservationEClass = createEClass(TIMED_OBSERVATION);

		timedConstraintEClass = createEClass(TIMED_CONSTRAINT);

		timedProcessingEClass = createEClass(TIMED_PROCESSING);

		timedMessageEClass = createEClass(TIMED_MESSAGE);
		createEAttribute(timedMessageEClass, TIMED_MESSAGE__NAME);

		timedInstantConstraintEClass = createEClass(TIMED_INSTANT_CONSTRAINT);
		createEReference(timedInstantConstraintEClass, TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION);

		timedDurationConstraintEClass = createEClass(TIMED_DURATION_CONSTRAINT);
		createEReference(timedDurationConstraintEClass, TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION);

		durationPredicateEClass = createEClass(DURATION_PREDICATE);
		createEReference(durationPredicateEClass, DURATION_PREDICATE__TIMEDDURATIONOBSERVATION);

		timedDurationObservationEClass = createEClass(TIMED_DURATION_OBSERVATION);
		createEAttribute(timedDurationObservationEClass, TIMED_DURATION_OBSERVATION__OBS_KIND);

		timedInstantObservationEClass = createEClass(TIMED_INSTANT_OBSERVATION);
		createEAttribute(timedInstantObservationEClass, TIMED_INSTANT_OBSERVATION__OBS_KIND);

		instantPredicateEClass = createEClass(INSTANT_PREDICATE);
		createEReference(instantPredicateEClass, INSTANT_PREDICATE__TIMEDINSTANTOBSERVATION);

		logicalClockEClass = createEClass(LOGICAL_CLOCK);
		createEAttribute(logicalClockEClass, LOGICAL_CLOCK__NAME);

		chronometricClockEClass = createEClass(CHRONOMETRIC_CLOCK);
		createEAttribute(chronometricClockEClass, CHRONOMETRIC_CLOCK__NAME);

		timedBehaviorEClass = createEClass(TIMED_BEHAVIOR);
		createEAttribute(timedBehaviorEClass, TIMED_BEHAVIOR__NAME);

		timedActionEClass = createEClass(TIMED_ACTION);
		createEAttribute(timedActionEClass, TIMED_ACTION__NAME);

		// Create enums
		eventKindEEnum = createEEnum(EVENT_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timedObservationEClass.getESuperTypes().add(this.getTimedElement());
		timedConstraintEClass.getESuperTypes().add(this.getTimedElement());
		timedProcessingEClass.getESuperTypes().add(this.getTimedElement());
		timedMessageEClass.getESuperTypes().add(this.getTimedProcessing());
		timedInstantConstraintEClass.getESuperTypes().add(this.getTimedConstraint());
		timedDurationConstraintEClass.getESuperTypes().add(this.getTimedConstraint());
		timedDurationObservationEClass.getESuperTypes().add(this.getTimedObservation());
		timedInstantObservationEClass.getESuperTypes().add(this.getTimedObservation());
		logicalClockEClass.getESuperTypes().add(this.getClock());
		chronometricClockEClass.getESuperTypes().add(this.getClock());
		timedBehaviorEClass.getESuperTypes().add(this.getTimedProcessing());
		timedActionEClass.getESuperTypes().add(this.getTimedProcessing());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Timedelement(), this.getTimedElement(), null, "timedelement", null, 0, -1, Root.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedElementEClass, TimedElement.class, "TimedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedElement_Clock(), this.getClock(), null, "clock", null, 0, 1, TimedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockEClass, Clock.class, "Clock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClock_CurrentTime(), ecorePackage.getEFloat(), "currentTime", "0.0", 0, 1, Clock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedObservationEClass, TimedObservation.class, "TimedObservation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timedConstraintEClass, TimedConstraint.class, "TimedConstraint", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timedProcessingEClass, TimedProcessing.class, "TimedProcessing", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timedMessageEClass, TimedMessage.class, "TimedMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimedMessage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedInstantConstraintEClass, TimedInstantConstraint.class, "TimedInstantConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedInstantConstraint_Instantpredication(), this.getInstantPredicate(), null,
				"instantpredication", null, 1, 1, TimedInstantConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedDurationConstraintEClass, TimedDurationConstraint.class, "TimedDurationConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedDurationConstraint_Durationpredication(), this.getDurationPredicate(), null,
				"durationpredication", null, 1, 1, TimedDurationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationPredicateEClass, DurationPredicate.class, "DurationPredicate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDurationPredicate_Timeddurationobservation(), this.getTimedDurationObservation(), null,
				"timeddurationobservation", null, 1, -1, DurationPredicate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedDurationObservationEClass, TimedDurationObservation.class, "TimedDurationObservation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedDurationObservation_ObsKind(), this.getEventKind(), "obsKind", "", 0, 1,
				TimedDurationObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedInstantObservationEClass, TimedInstantObservation.class, "TimedInstantObservation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedInstantObservation_ObsKind(), this.getEventKind(), "obsKind", "", 0, 1,
				TimedInstantObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantPredicateEClass, InstantPredicate.class, "InstantPredicate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstantPredicate_Timedinstantobservation(), this.getTimedInstantObservation(), null,
				"timedinstantobservation", null, 1, -1, InstantPredicate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalClockEClass, LogicalClock.class, "LogicalClock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalClock_Name(), ecorePackage.getEString(), "name", null, 0, 1, LogicalClock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chronometricClockEClass, ChronometricClock.class, "ChronometricClock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChronometricClock_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ChronometricClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(timedBehaviorEClass, TimedBehavior.class, "TimedBehavior", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedBehavior_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimedBehavior.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedActionEClass, TimedAction.class, "TimedAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimedAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventKindEEnum, EventKind.class, "EventKind");
		addEEnumLiteral(eventKindEEnum, EventKind.START);
		addEEnumLiteral(eventKindEEnum, EventKind.FINISH);
		addEEnumLiteral(eventKindEEnum, EventKind.SEND);
		addEEnumLiteral(eventKindEEnum, EventKind.RECEIVE);
		addEEnumLiteral(eventKindEEnum, EventKind.CONSUME);

		// Create resource
		createResource(eNS_URI);
	}

} //MARTE_TIMEPackageImpl
