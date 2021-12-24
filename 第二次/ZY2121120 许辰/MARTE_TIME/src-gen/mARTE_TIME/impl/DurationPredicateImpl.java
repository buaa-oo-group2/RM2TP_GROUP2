/**
 */
package mARTE_TIME.impl;

import java.util.Collection;

import mARTE_TIME.DurationPredicate;
import mARTE_TIME.MARTE_TIMEPackage;
import mARTE_TIME.TimedDurationObservation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.impl.DurationPredicateImpl#getTimeddurationobservation <em>Timeddurationobservation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DurationPredicateImpl extends MinimalEObjectImpl.Container implements DurationPredicate {
	/**
	 * The cached value of the '{@link #getTimeddurationobservation() <em>Timeddurationobservation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeddurationobservation()
	 * @generated
	 * @ordered
	 */
	protected EList<TimedDurationObservation> timeddurationobservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTE_TIMEPackage.Literals.DURATION_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimedDurationObservation> getTimeddurationobservation() {
		if (timeddurationobservation == null) {
			timeddurationobservation = new EObjectResolvingEList<TimedDurationObservation>(
					TimedDurationObservation.class, this,
					MARTE_TIMEPackage.DURATION_PREDICATE__TIMEDDURATIONOBSERVATION);
		}
		return timeddurationobservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MARTE_TIMEPackage.DURATION_PREDICATE__TIMEDDURATIONOBSERVATION:
			return getTimeddurationobservation();
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
		case MARTE_TIMEPackage.DURATION_PREDICATE__TIMEDDURATIONOBSERVATION:
			getTimeddurationobservation().clear();
			getTimeddurationobservation().addAll((Collection<? extends TimedDurationObservation>) newValue);
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
		case MARTE_TIMEPackage.DURATION_PREDICATE__TIMEDDURATIONOBSERVATION:
			getTimeddurationobservation().clear();
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
		case MARTE_TIMEPackage.DURATION_PREDICATE__TIMEDDURATIONOBSERVATION:
			return timeddurationobservation != null && !timeddurationobservation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DurationPredicateImpl
