/**
 */
package mARTE_TIME.impl;

import mARTE_TIME.EventKind;
import mARTE_TIME.MARTE_TIMEPackage;
import mARTE_TIME.TimedDurationObservation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.impl.TimedDurationObservationImpl#getObsKind <em>Obs Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedDurationObservationImpl extends TimedObservationImpl implements TimedDurationObservation {
	/**
	 * The default value of the '{@link #getObsKind() <em>Obs Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObsKind()
	 * @generated
	 * @ordered
	 */
	protected static final EventKind OBS_KIND_EDEFAULT = EventKind.START;

	/**
	 * The cached value of the '{@link #getObsKind() <em>Obs Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObsKind()
	 * @generated
	 * @ordered
	 */
	protected EventKind obsKind = OBS_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedDurationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTE_TIMEPackage.Literals.TIMED_DURATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind getObsKind() {
		return obsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObsKind(EventKind newObsKind) {
		EventKind oldObsKind = obsKind;
		obsKind = newObsKind == null ? OBS_KIND_EDEFAULT : newObsKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MARTE_TIMEPackage.TIMED_DURATION_OBSERVATION__OBS_KIND, oldObsKind, obsKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MARTE_TIMEPackage.TIMED_DURATION_OBSERVATION__OBS_KIND:
			return getObsKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MARTE_TIMEPackage.TIMED_DURATION_OBSERVATION__OBS_KIND:
			setObsKind((EventKind) newValue);
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
		case MARTE_TIMEPackage.TIMED_DURATION_OBSERVATION__OBS_KIND:
			setObsKind(OBS_KIND_EDEFAULT);
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
		case MARTE_TIMEPackage.TIMED_DURATION_OBSERVATION__OBS_KIND:
			return obsKind != OBS_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (obsKind: ");
		result.append(obsKind);
		result.append(')');
		return result.toString();
	}

} //TimedDurationObservationImpl
