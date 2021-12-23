/**
 */
package mARTE_TIME.impl;

import mARTE_TIME.InstantPredicate;
import mARTE_TIME.MARTE_TIMEPackage;
import mARTE_TIME.TimedInstantConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Instant Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.impl.TimedInstantConstraintImpl#getInstantpredication <em>Instantpredication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedInstantConstraintImpl extends TimedConstraintImpl implements TimedInstantConstraint {
	/**
	 * The cached value of the '{@link #getInstantpredication() <em>Instantpredication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantpredication()
	 * @generated
	 * @ordered
	 */
	protected InstantPredicate instantpredication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedInstantConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTE_TIMEPackage.Literals.TIMED_INSTANT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantPredicate getInstantpredication() {
		return instantpredication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantpredication(InstantPredicate newInstantpredication,
			NotificationChain msgs) {
		InstantPredicate oldInstantpredication = instantpredication;
		instantpredication = newInstantpredication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION, oldInstantpredication,
					newInstantpredication);
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
	public void setInstantpredication(InstantPredicate newInstantpredication) {
		if (newInstantpredication != instantpredication) {
			NotificationChain msgs = null;
			if (instantpredication != null)
				msgs = ((InternalEObject) instantpredication).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION, null,
						msgs);
			if (newInstantpredication != null)
				msgs = ((InternalEObject) newInstantpredication).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION, null,
						msgs);
			msgs = basicSetInstantpredication(newInstantpredication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION, newInstantpredication,
					newInstantpredication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION:
			return basicSetInstantpredication(null, msgs);
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
		case MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION:
			return getInstantpredication();
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
		case MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION:
			setInstantpredication((InstantPredicate) newValue);
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
		case MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION:
			setInstantpredication((InstantPredicate) null);
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
		case MARTE_TIMEPackage.TIMED_INSTANT_CONSTRAINT__INSTANTPREDICATION:
			return instantpredication != null;
		}
		return super.eIsSet(featureID);
	}

} //TimedInstantConstraintImpl
