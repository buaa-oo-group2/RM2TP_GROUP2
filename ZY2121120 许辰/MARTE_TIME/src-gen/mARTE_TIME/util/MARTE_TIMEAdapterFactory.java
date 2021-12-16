/**
 */
package mARTE_TIME.util;

import mARTE_TIME.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mARTE_TIME.MARTE_TIMEPackage
 * @generated
 */
public class MARTE_TIMEAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MARTE_TIMEPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_TIMEAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MARTE_TIMEPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MARTE_TIMESwitch<Adapter> modelSwitch = new MARTE_TIMESwitch<Adapter>() {
		@Override
		public Adapter caseRoot(Root object) {
			return createRootAdapter();
		}

		@Override
		public Adapter caseTimedElement(TimedElement object) {
			return createTimedElementAdapter();
		}

		@Override
		public Adapter caseClock(Clock object) {
			return createClockAdapter();
		}

		@Override
		public Adapter caseTimedObservation(TimedObservation object) {
			return createTimedObservationAdapter();
		}

		@Override
		public Adapter caseTimedConstraint(TimedConstraint object) {
			return createTimedConstraintAdapter();
		}

		@Override
		public Adapter caseTimedProcessing(TimedProcessing object) {
			return createTimedProcessingAdapter();
		}

		@Override
		public Adapter caseTimedMessage(TimedMessage object) {
			return createTimedMessageAdapter();
		}

		@Override
		public Adapter caseTimedInstantConstraint(TimedInstantConstraint object) {
			return createTimedInstantConstraintAdapter();
		}

		@Override
		public Adapter caseTimedDurationConstraint(TimedDurationConstraint object) {
			return createTimedDurationConstraintAdapter();
		}

		@Override
		public Adapter caseDurationPredicate(DurationPredicate object) {
			return createDurationPredicateAdapter();
		}

		@Override
		public Adapter caseTimedDurationObservation(TimedDurationObservation object) {
			return createTimedDurationObservationAdapter();
		}

		@Override
		public Adapter caseTimedInstantObservation(TimedInstantObservation object) {
			return createTimedInstantObservationAdapter();
		}

		@Override
		public Adapter caseInstantPredicate(InstantPredicate object) {
			return createInstantPredicateAdapter();
		}

		@Override
		public Adapter caseLogicalClock(LogicalClock object) {
			return createLogicalClockAdapter();
		}

		@Override
		public Adapter caseChronometricClock(ChronometricClock object) {
			return createChronometricClockAdapter();
		}

		@Override
		public Adapter caseTimedBehavior(TimedBehavior object) {
			return createTimedBehaviorAdapter();
		}

		@Override
		public Adapter caseTimedAction(TimedAction object) {
			return createTimedActionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedElement <em>Timed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedElement
	 * @generated
	 */
	public Adapter createTimedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedObservation <em>Timed Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedObservation
	 * @generated
	 */
	public Adapter createTimedObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedConstraint <em>Timed Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedConstraint
	 * @generated
	 */
	public Adapter createTimedConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedProcessing <em>Timed Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedProcessing
	 * @generated
	 */
	public Adapter createTimedProcessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedMessage <em>Timed Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedMessage
	 * @generated
	 */
	public Adapter createTimedMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedInstantConstraint <em>Timed Instant Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedInstantConstraint
	 * @generated
	 */
	public Adapter createTimedInstantConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedDurationConstraint <em>Timed Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedDurationConstraint
	 * @generated
	 */
	public Adapter createTimedDurationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.DurationPredicate <em>Duration Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.DurationPredicate
	 * @generated
	 */
	public Adapter createDurationPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedDurationObservation <em>Timed Duration Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedDurationObservation
	 * @generated
	 */
	public Adapter createTimedDurationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedInstantObservation <em>Timed Instant Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedInstantObservation
	 * @generated
	 */
	public Adapter createTimedInstantObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.InstantPredicate <em>Instant Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.InstantPredicate
	 * @generated
	 */
	public Adapter createInstantPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.LogicalClock <em>Logical Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.LogicalClock
	 * @generated
	 */
	public Adapter createLogicalClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.ChronometricClock <em>Chronometric Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.ChronometricClock
	 * @generated
	 */
	public Adapter createChronometricClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedBehavior <em>Timed Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedBehavior
	 * @generated
	 */
	public Adapter createTimedBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE_TIME.TimedAction <em>Timed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE_TIME.TimedAction
	 * @generated
	 */
	public Adapter createTimedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MARTE_TIMEAdapterFactory
