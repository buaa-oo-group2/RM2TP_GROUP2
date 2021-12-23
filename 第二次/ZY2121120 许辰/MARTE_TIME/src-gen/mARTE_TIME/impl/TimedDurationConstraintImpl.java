/**
 */
package mARTE_TIME.impl;

import mARTE_TIME.DurationPredicate;
import mARTE_TIME.MARTE_TIMEPackage;
import mARTE_TIME.TimedDurationConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.impl.TimedDurationConstraintImpl#getDurationpredication <em>Durationpredication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedDurationConstraintImpl extends TimedConstraintImpl implements TimedDurationConstraint {
	/**
	 * The cached value of the '{@link #getDurationpredication() <em>Durationpredication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationpredication()
	 * @generated
	 * @ordered
	 */
	protected DurationPredicate durationpredication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedDurationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTE_TIMEPackage.Literals.TIMED_DURATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationPredicate getDurationpredication() {
		return durationpredication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationpredication(DurationPredicate newDurationpredication,
			NotificationChain msgs) {
		DurationPredicate oldDurationpredication = durationpredication;
		durationpredication = newDurationpredication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION, oldDurationpredication,
					newDurationpredication);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationpredication(DurationPredicate newDurationpredication) {
		if (newDurationpredication != durationpredication) {
			NotificationChain msgs = null;
			if (durationpredication != null)
				msgs = ((InternalEObject) durationpredication).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION, null,
						msgs);
			if (newDurationpredication != null)
				msgs = ((InternalEObject) newDurationpredication).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION, null,
						msgs);
			msgs = basicSetDurationpredication(newDurationpredication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION, newDurationpredication,
					newDurationpredication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION:
			return basicSetDurationpredication(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION:
			return getDurationpredication();
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
		case MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION:
			setDurationpredication((DurationPredicate) newValue);
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
		case MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION:
			setDurationpredication((DurationPredicate) null);
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
		case MARTE_TIMEPackage.TIMED_DURATION_CONSTRAINT__DURATIONPREDICATION:
			return durationpredication != null;
		}
		return super.eIsSet(featureID);
	}

} //TimedDurationConstraintImpl
