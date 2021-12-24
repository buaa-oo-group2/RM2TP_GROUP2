/**
 */
package mARTE.NFP_Natrue.impl;

import java.util.Collection;

import mARTE.NFP_Natrue.NFP_NatruePackage;
import mARTE.NFP_Natrue.Quantity;
import mARTE.NFP_Natrue.Unit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Natrue.impl.QuantityImpl#getAllowedUnits <em>Allowed Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuantityImpl extends MinimalEObjectImpl.Container implements Quantity {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NFP_NatruePackage.Literals.QUANTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getAllowedUnits() {
		if (allowedUnits == null) {
			allowedUnits = new EObjectResolvingEList<Unit>(Unit.class, this, NFP_NatruePackage.QUANTITY__ALLOWED_UNITS);
		}
		return allowedUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NFP_NatruePackage.QUANTITY__ALLOWED_UNITS:
				return getAllowedUnits();
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
			case NFP_NatruePackage.QUANTITY__ALLOWED_UNITS:
				getAllowedUnits().clear();
				getAllowedUnits().addAll((Collection<? extends Unit>)newValue);
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
			case NFP_NatruePackage.QUANTITY__ALLOWED_UNITS:
				getAllowedUnits().clear();
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
			case NFP_NatruePackage.QUANTITY__ALLOWED_UNITS:
				return allowedUnits != null && !allowedUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuantityImpl
