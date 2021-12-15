/**
 */
package mARTE.NFP_Natrue.impl;

import java.util.Collection;

import mARTE.NFP_Natrue.Measure;
import mARTE.NFP_Natrue.NFP_NatruePackage;
import mARTE.NFP_Natrue.QuantitativeNFP;
import mARTE.NFP_Natrue.SampleRealization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link mARTE.NFP_Natrue.impl.QuantitativeNFPImpl#getRealizationValues <em>Realization Values</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.impl.QuantitativeNFPImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.impl.QuantitativeNFPImpl#getNumbers <em>Numbers</em>}</li>
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
	 * The default value of the '{@link #getNumbers() <em>Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbers()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumbers() <em>Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbers()
	 * @generated
	 * @ordered
	 */
	protected Integer numbers = NUMBERS_EDEFAULT;

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
		return NFP_NatruePackage.Literals.QUANTITATIVE_NFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SampleRealization> getRealizationValues() {
		if (realizationValues == null) {
			realizationValues = new EObjectContainmentEList<SampleRealization>(SampleRealization.class, this, NFP_NatruePackage.QUANTITATIVE_NFP__REALIZATION_VALUES);
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
			measure = new EObjectContainmentEList<Measure>(Measure.class, this, NFP_NatruePackage.QUANTITATIVE_NFP__MEASURE);
		}
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumbers() {
		return numbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbers(Integer newNumbers) {
		Integer oldNumbers = numbers;
		numbers = newNumbers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFP_NatruePackage.QUANTITATIVE_NFP__NUMBERS, oldNumbers, numbers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NFP_NatruePackage.QUANTITATIVE_NFP__REALIZATION_VALUES:
				return ((InternalEList<?>)getRealizationValues()).basicRemove(otherEnd, msgs);
			case NFP_NatruePackage.QUANTITATIVE_NFP__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
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
			case NFP_NatruePackage.QUANTITATIVE_NFP__REALIZATION_VALUES:
				return getRealizationValues();
			case NFP_NatruePackage.QUANTITATIVE_NFP__MEASURE:
				return getMeasure();
			case NFP_NatruePackage.QUANTITATIVE_NFP__NUMBERS:
				return getNumbers();
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
			case NFP_NatruePackage.QUANTITATIVE_NFP__REALIZATION_VALUES:
				getRealizationValues().clear();
				getRealizationValues().addAll((Collection<? extends SampleRealization>)newValue);
				return;
			case NFP_NatruePackage.QUANTITATIVE_NFP__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends Measure>)newValue);
				return;
			case NFP_NatruePackage.QUANTITATIVE_NFP__NUMBERS:
				setNumbers((Integer)newValue);
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
			case NFP_NatruePackage.QUANTITATIVE_NFP__REALIZATION_VALUES:
				getRealizationValues().clear();
				return;
			case NFP_NatruePackage.QUANTITATIVE_NFP__MEASURE:
				getMeasure().clear();
				return;
			case NFP_NatruePackage.QUANTITATIVE_NFP__NUMBERS:
				setNumbers(NUMBERS_EDEFAULT);
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
			case NFP_NatruePackage.QUANTITATIVE_NFP__REALIZATION_VALUES:
				return realizationValues != null && !realizationValues.isEmpty();
			case NFP_NatruePackage.QUANTITATIVE_NFP__MEASURE:
				return measure != null && !measure.isEmpty();
			case NFP_NatruePackage.QUANTITATIVE_NFP__NUMBERS:
				return NUMBERS_EDEFAULT == null ? numbers != null : !NUMBERS_EDEFAULT.equals(numbers);
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
		result.append(" (numbers: ");
		result.append(numbers);
		result.append(')');
		return result.toString();
	}

} //QuantitativeNFPImpl
