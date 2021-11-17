/**
 */
package mARTE.impl;

import mARTE.MARTEPackage;
import mARTE.Unit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.impl.UnitImpl#getConvFactor <em>Conv Factor</em>}</li>
 *   <li>{@link mARTE.impl.UnitImpl#getConvOffset <em>Conv Offset</em>}</li>
 *   <li>{@link mARTE.impl.UnitImpl#getBaseUnit <em>Base Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitImpl extends MinimalEObjectImpl.Container implements Unit {
	/**
	 * The default value of the '{@link #getConvFactor() <em>Conv Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Double CONV_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConvFactor() <em>Conv Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvFactor()
	 * @generated
	 * @ordered
	 */
	protected Double convFactor = CONV_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getConvOffset() <em>Conv Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double CONV_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConvOffset() <em>Conv Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvOffset()
	 * @generated
	 * @ordered
	 */
	protected Double convOffset = CONV_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseUnit() <em>Base Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit baseUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTEPackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getConvFactor() {
		return convFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvFactor(Double newConvFactor) {
		Double oldConvFactor = convFactor;
		convFactor = newConvFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.UNIT__CONV_FACTOR, oldConvFactor,
					convFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getConvOffset() {
		return convOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvOffset(Double newConvOffset) {
		Double oldConvOffset = convOffset;
		convOffset = newConvOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.UNIT__CONV_OFFSET, oldConvOffset,
					convOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getBaseUnit() {
		if (baseUnit != null && baseUnit.eIsProxy()) {
			InternalEObject oldBaseUnit = (InternalEObject) baseUnit;
			baseUnit = (Unit) eResolveProxy(oldBaseUnit);
			if (baseUnit != oldBaseUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MARTEPackage.UNIT__BASE_UNIT, oldBaseUnit,
							baseUnit));
			}
		}
		return baseUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetBaseUnit() {
		return baseUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseUnit(Unit newBaseUnit) {
		Unit oldBaseUnit = baseUnit;
		baseUnit = newBaseUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.UNIT__BASE_UNIT, oldBaseUnit, baseUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MARTEPackage.UNIT__CONV_FACTOR:
			return getConvFactor();
		case MARTEPackage.UNIT__CONV_OFFSET:
			return getConvOffset();
		case MARTEPackage.UNIT__BASE_UNIT:
			if (resolve)
				return getBaseUnit();
			return basicGetBaseUnit();
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
		case MARTEPackage.UNIT__CONV_FACTOR:
			setConvFactor((Double) newValue);
			return;
		case MARTEPackage.UNIT__CONV_OFFSET:
			setConvOffset((Double) newValue);
			return;
		case MARTEPackage.UNIT__BASE_UNIT:
			setBaseUnit((Unit) newValue);
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
		case MARTEPackage.UNIT__CONV_FACTOR:
			setConvFactor(CONV_FACTOR_EDEFAULT);
			return;
		case MARTEPackage.UNIT__CONV_OFFSET:
			setConvOffset(CONV_OFFSET_EDEFAULT);
			return;
		case MARTEPackage.UNIT__BASE_UNIT:
			setBaseUnit((Unit) null);
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
		case MARTEPackage.UNIT__CONV_FACTOR:
			return CONV_FACTOR_EDEFAULT == null ? convFactor != null : !CONV_FACTOR_EDEFAULT.equals(convFactor);
		case MARTEPackage.UNIT__CONV_OFFSET:
			return CONV_OFFSET_EDEFAULT == null ? convOffset != null : !CONV_OFFSET_EDEFAULT.equals(convOffset);
		case MARTEPackage.UNIT__BASE_UNIT:
			return baseUnit != null;
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
		result.append(" (convFactor: ");
		result.append(convFactor);
		result.append(", convOffset: ");
		result.append(convOffset);
		result.append(')');
		return result.toString();
	}

} //UnitImpl
