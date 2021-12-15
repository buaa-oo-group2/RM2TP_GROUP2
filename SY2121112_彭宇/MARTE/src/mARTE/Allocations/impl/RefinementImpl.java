/**
 */
package mARTE.Allocations.impl;

import java.util.Collection;

import mARTE.Allocations.AllocationEnd;
import mARTE.Allocations.AllocationsPackage;
import mARTE.Allocations.Refinement;

import mARTE.NFP_Annotation.NFP_Constraint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.Allocations.impl.RefinementImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link mARTE.Allocations.impl.RefinementImpl#getRefined <em>Refined</em>}</li>
 *   <li>{@link mARTE.Allocations.impl.RefinementImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinementImpl extends MinimalEObjectImpl.Container implements Refinement {
	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationEnd> general;

	/**
	 * The cached value of the '{@link #getRefined() <em>Refined</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefined()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationEnd> refined;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<NFP_Constraint> constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationEnd> getGeneral() {
		if (general == null) {
			general = new EObjectResolvingEList<AllocationEnd>(AllocationEnd.class, this, AllocationsPackage.REFINEMENT__GENERAL);
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationEnd> getRefined() {
		if (refined == null) {
			refined = new EObjectResolvingEList<AllocationEnd>(AllocationEnd.class, this, AllocationsPackage.REFINEMENT__REFINED);
		}
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NFP_Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectResolvingEList<NFP_Constraint>(NFP_Constraint.class, this, AllocationsPackage.REFINEMENT__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationsPackage.REFINEMENT__GENERAL:
				return getGeneral();
			case AllocationsPackage.REFINEMENT__REFINED:
				return getRefined();
			case AllocationsPackage.REFINEMENT__CONSTRAINT:
				return getConstraint();
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
			case AllocationsPackage.REFINEMENT__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends AllocationEnd>)newValue);
				return;
			case AllocationsPackage.REFINEMENT__REFINED:
				getRefined().clear();
				getRefined().addAll((Collection<? extends AllocationEnd>)newValue);
				return;
			case AllocationsPackage.REFINEMENT__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends NFP_Constraint>)newValue);
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
			case AllocationsPackage.REFINEMENT__GENERAL:
				getGeneral().clear();
				return;
			case AllocationsPackage.REFINEMENT__REFINED:
				getRefined().clear();
				return;
			case AllocationsPackage.REFINEMENT__CONSTRAINT:
				getConstraint().clear();
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
			case AllocationsPackage.REFINEMENT__GENERAL:
				return general != null && !general.isEmpty();
			case AllocationsPackage.REFINEMENT__REFINED:
				return refined != null && !refined.isEmpty();
			case AllocationsPackage.REFINEMENT__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefinementImpl
