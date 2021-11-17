/**
 */
package mARTE.impl;

import java.util.Collection;

import mARTE.MARTEPackage;
import mARTE.Measure;
import mARTE.SampleRealization;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.impl.SampleRealizationImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SampleRealizationImpl extends MinimalEObjectImpl.Container implements SampleRealization {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTEPackage.Literals.SAMPLE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getFunction() {
		if (function == null) {
			function = new EObjectWithInverseResolvingEList.ManyInverse<Measure>(Measure.class, this,
					MARTEPackage.SAMPLE_REALIZATION__FUNCTION, MARTEPackage.MEASURE__DOMAIN);
		}
		return function;
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
		case MARTEPackage.SAMPLE_REALIZATION__FUNCTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFunction()).basicAdd(otherEnd, msgs);
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
		case MARTEPackage.SAMPLE_REALIZATION__FUNCTION:
			return ((InternalEList<?>) getFunction()).basicRemove(otherEnd, msgs);
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
		case MARTEPackage.SAMPLE_REALIZATION__FUNCTION:
			return getFunction();
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
		case MARTEPackage.SAMPLE_REALIZATION__FUNCTION:
			getFunction().clear();
			getFunction().addAll((Collection<? extends Measure>) newValue);
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
		case MARTEPackage.SAMPLE_REALIZATION__FUNCTION:
			getFunction().clear();
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
		case MARTEPackage.SAMPLE_REALIZATION__FUNCTION:
			return function != null && !function.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SampleRealizationImpl
