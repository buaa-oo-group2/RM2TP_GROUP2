/**
 */
package mARTE.NFP_Natrue.impl;

import java.util.Collection;

import mARTE.NFP_Natrue.Dimension;
import mARTE.NFP_Natrue.NFP_NatruePackage;
import mARTE.NFP_Natrue.Quantity;
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
 * An implementation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Natrue.impl.QuantityImpl#getAllowedUnits <em>Allowed Units</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.impl.QuantityImpl#getDimension <em>Dimension</em>}</li>
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
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

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
	public Dimension getDimension() {
		if (dimension != null && dimension.eIsProxy()) {
			InternalEObject oldDimension = (InternalEObject)dimension;
			dimension = (Dimension)eResolveProxy(oldDimension);
			if (dimension != oldDimension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NFP_NatruePackage.QUANTITY__DIMENSION, oldDimension, dimension));
			}
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension basicGetDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Dimension newDimension) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFP_NatruePackage.QUANTITY__DIMENSION, oldDimension, dimension));
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
			case NFP_NatruePackage.QUANTITY__DIMENSION:
				if (resolve) return getDimension();
				return basicGetDimension();
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
			case NFP_NatruePackage.QUANTITY__DIMENSION:
				setDimension((Dimension)newValue);
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
			case NFP_NatruePackage.QUANTITY__DIMENSION:
				setDimension((Dimension)null);
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
			case NFP_NatruePackage.QUANTITY__DIMENSION:
				return dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantityImpl
