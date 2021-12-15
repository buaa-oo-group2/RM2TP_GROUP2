/**
 */
package mARTE.Allocations.impl;

import java.util.Collection;

import mARTE.Allocations.Allocation;
import mARTE.Allocations.AllocationsPackage;
import mARTE.Allocations.ApplicationAllocationEnd;
import mARTE.Allocations.ExecutionPlatformAllocationEnd;

import mARTE.NFP_Annotation.NFP_Constraint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.Allocations.impl.AllocationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link mARTE.Allocations.impl.AllocationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link mARTE.Allocations.impl.AllocationImpl#getInpliedConstraint <em>Inplied Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationImpl extends MinimalEObjectImpl.Container implements Allocation {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionPlatformAllocationEnd> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationAllocationEnd> source;

	/**
	 * The cached value of the '{@link #getInpliedConstraint() <em>Inplied Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInpliedConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<NFP_Constraint> inpliedConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationsPackage.Literals.ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionPlatformAllocationEnd> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<ExecutionPlatformAllocationEnd>(ExecutionPlatformAllocationEnd.class, this, AllocationsPackage.ALLOCATION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationAllocationEnd> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<ApplicationAllocationEnd>(ApplicationAllocationEnd.class, this, AllocationsPackage.ALLOCATION__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NFP_Constraint> getInpliedConstraint() {
		if (inpliedConstraint == null) {
			inpliedConstraint = new EObjectResolvingEList<NFP_Constraint>(NFP_Constraint.class, this, AllocationsPackage.ALLOCATION__INPLIED_CONSTRAINT);
		}
		return inpliedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationsPackage.ALLOCATION__TARGET:
				return getTarget();
			case AllocationsPackage.ALLOCATION__SOURCE:
				return getSource();
			case AllocationsPackage.ALLOCATION__INPLIED_CONSTRAINT:
				return getInpliedConstraint();
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
			case AllocationsPackage.ALLOCATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ExecutionPlatformAllocationEnd>)newValue);
				return;
			case AllocationsPackage.ALLOCATION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends ApplicationAllocationEnd>)newValue);
				return;
			case AllocationsPackage.ALLOCATION__INPLIED_CONSTRAINT:
				getInpliedConstraint().clear();
				getInpliedConstraint().addAll((Collection<? extends NFP_Constraint>)newValue);
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
			case AllocationsPackage.ALLOCATION__TARGET:
				getTarget().clear();
				return;
			case AllocationsPackage.ALLOCATION__SOURCE:
				getSource().clear();
				return;
			case AllocationsPackage.ALLOCATION__INPLIED_CONSTRAINT:
				getInpliedConstraint().clear();
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
			case AllocationsPackage.ALLOCATION__TARGET:
				return target != null && !target.isEmpty();
			case AllocationsPackage.ALLOCATION__SOURCE:
				return source != null && !source.isEmpty();
			case AllocationsPackage.ALLOCATION__INPLIED_CONSTRAINT:
				return inpliedConstraint != null && !inpliedConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocationImpl
