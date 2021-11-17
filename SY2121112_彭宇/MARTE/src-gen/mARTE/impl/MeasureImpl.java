/**
 */
package mARTE.impl;

import java.util.Collection;

import mARTE.MARTEPackage;
import mARTE.Measure;
import mARTE.Quantity;
import mARTE.SampleRealization;
import mARTE.Unit;

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
 *   <li>{@link mARTE.impl.MeasureImpl#getMeasurementUnit <em>Measurement Unit</em>}</li>
 *   <li>{@link mARTE.impl.MeasureImpl#getPhysicalQuantity <em>Physical Quantity</em>}</li>
 *   <li>{@link mARTE.impl.MeasureImpl#getDomain <em>Domain</em>}</li>
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
		return MARTEPackage.Literals.MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getMeasurementUnit() {
		if (measurementUnit != null && measurementUnit.eIsProxy()) {
			InternalEObject oldMeasurementUnit = (InternalEObject) measurementUnit;
			measurementUnit = (Unit) eResolveProxy(oldMeasurementUnit);
			if (measurementUnit != oldMeasurementUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MARTEPackage.MEASURE__MEASUREMENT_UNIT,
							oldMeasurementUnit, measurementUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.MEASURE__MEASUREMENT_UNIT,
					oldMeasurementUnit, measurementUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getPhysicalQuantity() {
		if (physicalQuantity != null && physicalQuantity.eIsProxy()) {
			InternalEObject oldPhysicalQuantity = (InternalEObject) physicalQuantity;
			physicalQuantity = (Quantity) eResolveProxy(oldPhysicalQuantity);
			if (physicalQuantity != oldPhysicalQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MARTEPackage.MEASURE__PHYSICAL_QUANTITY,
							oldPhysicalQuantity, physicalQuantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.MEASURE__PHYSICAL_QUANTITY,
					oldPhysicalQuantity, physicalQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SampleRealization> getDomain() {
		if (domain == null) {
			domain = new EObjectWithInverseResolvingEList.ManyInverse<SampleRealization>(SampleRealization.class, this,
					MARTEPackage.MEASURE__DOMAIN, MARTEPackage.SAMPLE_REALIZATION__FUNCTION);
		}
		return domain;
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
		case MARTEPackage.MEASURE__DOMAIN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDomain()).basicAdd(otherEnd, msgs);
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
		case MARTEPackage.MEASURE__DOMAIN:
			return ((InternalEList<?>) getDomain()).basicRemove(otherEnd, msgs);
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
		case MARTEPackage.MEASURE__MEASUREMENT_UNIT:
			if (resolve)
				return getMeasurementUnit();
			return basicGetMeasurementUnit();
		case MARTEPackage.MEASURE__PHYSICAL_QUANTITY:
			if (resolve)
				return getPhysicalQuantity();
			return basicGetPhysicalQuantity();
		case MARTEPackage.MEASURE__DOMAIN:
			return getDomain();
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
		case MARTEPackage.MEASURE__MEASUREMENT_UNIT:
			setMeasurementUnit((Unit) newValue);
			return;
		case MARTEPackage.MEASURE__PHYSICAL_QUANTITY:
			setPhysicalQuantity((Quantity) newValue);
			return;
		case MARTEPackage.MEASURE__DOMAIN:
			getDomain().clear();
			getDomain().addAll((Collection<? extends SampleRealization>) newValue);
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
		case MARTEPackage.MEASURE__MEASUREMENT_UNIT:
			setMeasurementUnit((Unit) null);
			return;
		case MARTEPackage.MEASURE__PHYSICAL_QUANTITY:
			setPhysicalQuantity((Quantity) null);
			return;
		case MARTEPackage.MEASURE__DOMAIN:
			getDomain().clear();
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
		case MARTEPackage.MEASURE__MEASUREMENT_UNIT:
			return measurementUnit != null;
		case MARTEPackage.MEASURE__PHYSICAL_QUANTITY:
			return physicalQuantity != null;
		case MARTEPackage.MEASURE__DOMAIN:
			return domain != null && !domain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureImpl
