/**
 */
package mARTE.impl;

import java.util.Collection;

import mARTE.MARTEPackage;
import mARTE.Measure;
import mARTE.QuantitativeNFP;
import mARTE.SampleRealization;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantitative NFP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.impl.QuantitativeNFPImpl#getRealizationValues <em>Realization Values</em>}</li>
 *   <li>{@link mARTE.impl.QuantitativeNFPImpl#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantitativeNFPImpl extends AbstractNFPImpl implements QuantitativeNFP {
	/**
	 * The cached value of the '{@link #getRealizationValues() <em>Realization Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizationValues()
	 * @generated
	 * @ordered
	 */
	protected EList<SampleRealization> realizationValues;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantitativeNFPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTEPackage.Literals.QUANTITATIVE_NFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SampleRealization> getRealizationValues() {
		if (realizationValues == null) {
			realizationValues = new EObjectContainmentEList<SampleRealization>(SampleRealization.class, this,
					MARTEPackage.QUANTITATIVE_NFP__REALIZATION_VALUES);
		}
		return realizationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasure() {
		if (measure == null) {
			measure = new EObjectContainmentEList<Measure>(Measure.class, this, MARTEPackage.QUANTITATIVE_NFP__MEASURE);
		}
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MARTEPackage.QUANTITATIVE_NFP__REALIZATION_VALUES:
			return ((InternalEList<?>) getRealizationValues()).basicRemove(otherEnd, msgs);
		case MARTEPackage.QUANTITATIVE_NFP__MEASURE:
			return ((InternalEList<?>) getMeasure()).basicRemove(otherEnd, msgs);
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
		case MARTEPackage.QUANTITATIVE_NFP__REALIZATION_VALUES:
			return getRealizationValues();
		case MARTEPackage.QUANTITATIVE_NFP__MEASURE:
			return getMeasure();
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
		case MARTEPackage.QUANTITATIVE_NFP__REALIZATION_VALUES:
			getRealizationValues().clear();
			getRealizationValues().addAll((Collection<? extends SampleRealization>) newValue);
			return;
		case MARTEPackage.QUANTITATIVE_NFP__MEASURE:
			getMeasure().clear();
			getMeasure().addAll((Collection<? extends Measure>) newValue);
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
		case MARTEPackage.QUANTITATIVE_NFP__REALIZATION_VALUES:
			getRealizationValues().clear();
			return;
		case MARTEPackage.QUANTITATIVE_NFP__MEASURE:
			getMeasure().clear();
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
		case MARTEPackage.QUANTITATIVE_NFP__REALIZATION_VALUES:
			return realizationValues != null && !realizationValues.isEmpty();
		case MARTEPackage.QUANTITATIVE_NFP__MEASURE:
			return measure != null && !measure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuantitativeNFPImpl
