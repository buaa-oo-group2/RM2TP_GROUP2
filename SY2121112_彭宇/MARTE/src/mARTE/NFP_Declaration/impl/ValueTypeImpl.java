/**
 */
package mARTE.NFP_Declaration.impl;

import java.util.Collection;

import mARTE.NFP_Declaration.NFP_DeclarationPackage;
import mARTE.NFP_Declaration.ValueType;

import mARTE.NFP_Natrue.Unit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Declaration.impl.ValueTypeImpl#getAllowedUnits <em>Allowed Units</em>}</li>
 *   <li>{@link mARTE.NFP_Declaration.impl.ValueTypeImpl#getDefaultUnit <em>Default Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueTypeImpl extends MinimalEObjectImpl.Container implements ValueType {
	/**
	 * The cached value of the '{@link #getAllowedUnits() <em>Allowed Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> allowedUnits;

	/**
	 * The cached value of the '{@link #getDefaultUnit() <em>Default Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit defaultUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NFP_DeclarationPackage.Literals.VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getAllowedUnits() {
		if (allowedUnits == null) {
			allowedUnits = new EObjectResolvingEList<Unit>(Unit.class, this, NFP_DeclarationPackage.VALUE_TYPE__ALLOWED_UNITS);
		}
		return allowedUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getDefaultUnit() {
		if (defaultUnit != null && defaultUnit.eIsProxy()) {
			InternalEObject oldDefaultUnit = (InternalEObject)defaultUnit;
			defaultUnit = (Unit)eResolveProxy(oldDefaultUnit);
			if (defaultUnit != oldDefaultUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NFP_DeclarationPackage.VALUE_TYPE__DEFAULT_UNIT, oldDefaultUnit, defaultUnit));
			}
		}
		return defaultUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetDefaultUnit() {
		return defaultUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultUnit(Unit newDefaultUnit) {
		Unit oldDefaultUnit = defaultUnit;
		defaultUnit = newDefaultUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFP_DeclarationPackage.VALUE_TYPE__DEFAULT_UNIT, oldDefaultUnit, defaultUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NFP_DeclarationPackage.VALUE_TYPE__ALLOWED_UNITS:
				return getAllowedUnits();
			case NFP_DeclarationPackage.VALUE_TYPE__DEFAULT_UNIT:
				if (resolve) return getDefaultUnit();
				return basicGetDefaultUnit();
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
			case NFP_DeclarationPackage.VALUE_TYPE__ALLOWED_UNITS:
				getAllowedUnits().clear();
				getAllowedUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case NFP_DeclarationPackage.VALUE_TYPE__DEFAULT_UNIT:
				setDefaultUnit((Unit)newValue);
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
			case NFP_DeclarationPackage.VALUE_TYPE__ALLOWED_UNITS:
				getAllowedUnits().clear();
				return;
			case NFP_DeclarationPackage.VALUE_TYPE__DEFAULT_UNIT:
				setDefaultUnit((Unit)null);
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
			case NFP_DeclarationPackage.VALUE_TYPE__ALLOWED_UNITS:
				return allowedUnits != null && !allowedUnits.isEmpty();
			case NFP_DeclarationPackage.VALUE_TYPE__DEFAULT_UNIT:
				return defaultUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueTypeImpl
