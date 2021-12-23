/**
 */
package mARTE.NFP_Natrue.impl;

import java.util.Collection;

import mARTE.NFP_Natrue.Measure;
import mARTE.NFP_Natrue.NFP_NatruePackage;
import mARTE.NFP_Natrue.Quantity;
import mARTE.NFP_Natrue.SampleRealization;
import mARTE.NFP_Natrue.Unit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Natrue.impl.MeasureImpl#getMeasurementUnit <em>Measurement Unit</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.impl.MeasureImpl#getPhysicalQuantity <em>Physical Quantity</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.impl.MeasureImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.impl.MeasureImpl#getMeasureName <em>Measure Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureImpl extends MinimalEObjectImpl.Container implements Measure {
	/**
	 * The cached value of the '{@link #getMeasurementUnit() <em>Measurement Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit measurementUnit;

	/**
	 * The cached value of the '{@link #getPhysicalQuantity() <em>Physical Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity physicalQuantity;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<SampleRealization> domain;

	/**
	 * The default value of the '{@link #getMeasureName() <em>Measure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureName() <em>Measure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureName()
	 * @generated
	 * @ordered
	 */
	protected String measureName = MEASURE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NFP_NatruePackage.Literals.MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getMeasurementUnit() {
		if (measurementUnit != null && measurementUnit.eIsProxy()) {
			InternalEObject oldMeasurementUnit = (InternalEObject)measurementUnit;
			measurementUnit = (Unit)eResolveProxy(oldMeasurementUnit);
			if (measurementUnit != oldMeasurementUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NFP_NatruePackage.MEASURE__MEASUREMENT_UNIT, oldMeasurementUnit, measurementUnit));
			}
		}
		return measurementUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetMeasurementUnit() {
		return measurementUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementUnit(Unit newMeasurementUnit) {
		Unit oldMeasurementUnit = measurementUnit;
		measurementUnit = newMeasurementUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFP_NatruePackage.MEASURE__MEASUREMENT_UNIT, oldMeasurementUnit, measurementUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getPhysicalQuantity() {
		if (physicalQuantity != null && physicalQuantity.eIsProxy()) {
			InternalEObject oldPhysicalQuantity = (InternalEObject)physicalQuantity;
			physicalQuantity = (Quantity)eResolveProxy(oldPhysicalQuantity);
			if (physicalQuantity != oldPhysicalQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NFP_NatruePackage.MEASURE__PHYSICAL_QUANTITY, oldPhysicalQuantity, physicalQuantity));
			}
		}
		return physicalQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity basicGetPhysicalQuantity() {
		return physicalQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalQuantity(Quantity newPhysicalQuantity) {
		Quantity oldPhysicalQuantity = physicalQuantity;
		physicalQuantity = newPhysicalQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFP_NatruePackage.MEASURE__PHYSICAL_QUANTITY, oldPhysicalQuantity, physicalQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SampleRealization> getDomain() {
		if (domain == null) {
			domain = new EObjectWithInverseResolvingEList.ManyInverse<SampleRealization>(SampleRealization.class, this, NFP_NatruePackage.MEASURE__DOMAIN, NFP_NatruePackage.SAMPLE_REALIZATION__FUNCTION);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasureName() {
		return measureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureName(String newMeasureName) {
		String oldMeasureName = measureName;
		measureName = newMeasureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFP_NatruePackage.MEASURE__MEASURE_NAME, oldMeasureName, measureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NFP_NatruePackage.MEASURE__DOMAIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomain()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NFP_NatruePackage.MEASURE__DOMAIN:
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
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
			case NFP_NatruePackage.MEASURE__MEASUREMENT_UNIT:
				if (resolve) return getMeasurementUnit();
				return basicGetMeasurementUnit();
			case NFP_NatruePackage.MEASURE__PHYSICAL_QUANTITY:
				if (resolve) return getPhysicalQuantity();
				return basicGetPhysicalQuantity();
			case NFP_NatruePackage.MEASURE__DOMAIN:
				return getDomain();
			case NFP_NatruePackage.MEASURE__MEASURE_NAME:
				return getMeasureName();
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
			case NFP_NatruePackage.MEASURE__MEASUREMENT_UNIT:
				setMeasurementUnit((Unit)newValue);
				return;
			case NFP_NatruePackage.MEASURE__PHYSICAL_QUANTITY:
				setPhysicalQuantity((Quantity)newValue);
				return;
			case NFP_NatruePackage.MEASURE__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends SampleRealization>)newValue);
				return;
			case NFP_NatruePackage.MEASURE__MEASURE_NAME:
				setMeasureName((String)newValue);
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
			case NFP_NatruePackage.MEASURE__MEASUREMENT_UNIT:
				setMeasurementUnit((Unit)null);
				return;
			case NFP_NatruePackage.MEASURE__PHYSICAL_QUANTITY:
				setPhysicalQuantity((Quantity)null);
				return;
			case NFP_NatruePackage.MEASURE__DOMAIN:
				getDomain().clear();
				return;
			case NFP_NatruePackage.MEASURE__MEASURE_NAME:
				setMeasureName(MEASURE_NAME_EDEFAULT);
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
			case NFP_NatruePackage.MEASURE__MEASUREMENT_UNIT:
				return measurementUnit != null;
			case NFP_NatruePackage.MEASURE__PHYSICAL_QUANTITY:
				return physicalQuantity != null;
			case NFP_NatruePackage.MEASURE__DOMAIN:
				return domain != null && !domain.isEmpty();
			case NFP_NatruePackage.MEASURE__MEASURE_NAME:
				return MEASURE_NAME_EDEFAULT == null ? measureName != null : !MEASURE_NAME_EDEFAULT.equals(measureName);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (measureName: ");
		result.append(measureName);
		result.append(')');
		return result.toString();
	}

} //MeasureImpl
