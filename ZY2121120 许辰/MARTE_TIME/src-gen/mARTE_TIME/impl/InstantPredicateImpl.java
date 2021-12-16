/**
 */
package mARTE_TIME.impl;

import java.util.Collection;

import mARTE_TIME.InstantPredicate;
import mARTE_TIME.MARTE_TIMEPackage;
import mARTE_TIME.TimedInstantObservation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instant Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.impl.InstantPredicateImpl#getTimedinstantobservation <em>Timedinstantobservation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstantPredicateImpl extends MinimalEObjectImpl.Container implements InstantPredicate {
	/**
	 * The cached value of the '{@link #getTimedinstantobservation() <em>Timedinstantobservation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimedinstantobservation()
	 * @generated
	 * @ordered
	 */
	protected EList<TimedInstantObservation> timedinstantobservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTE_TIMEPackage.Literals.INSTANT_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimedInstantObservation> getTimedinstantobservation() {
		if (timedinstantobservation == null) {
			timedinstantobservation = new EObjectResolvingEList<TimedInstantObservation>(TimedInstantObservation.class,
					this, MARTE_TIMEPackage.INSTANT_PREDICATE__TIMEDINSTANTOBSERVATION);
		}
		return timedinstantobservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MARTE_TIMEPackage.INSTANT_PREDICATE__TIMEDINSTANTOBSERVATION:
			return getTimedinstantobservation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MARTE_TIMEPackage.INSTANT_PREDICATE__TIMEDINSTANTOBSERVATION:
			getTimedinstantobservation().clear();
			getTimedinstantobservation().addAll((Collection<? extends TimedInstantObservation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MARTE_TIMEPackage.INSTANT_PREDICATE__TIMEDINSTANTOBSERVATION:
			getTimedinstantobservation().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MARTE_TIMEPackage.INSTANT_PREDICATE__TIMEDINSTANTOBSERVATION:
			return timedinstantobservation != null && !timedinstantobservation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstantPredicateImpl
