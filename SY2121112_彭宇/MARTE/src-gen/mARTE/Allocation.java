/**
 */
package mARTE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.Allocation#getTarget <em>Target</em>}</li>
 *   <li>{@link mARTE.Allocation#getSource <em>Source</em>}</li>
 *   <li>{@link mARTE.Allocation#getInpliedConstraint <em>Inplied Constraint</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getAllocation()
 * @model
 * @generated
 */
public interface Allocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link mARTE.ExecutionPlatformAllocationEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see mARTE.MARTEPackage#getAllocation_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<ExecutionPlatformAllocationEnd> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link mARTE.ApplicationAllocationEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see mARTE.MARTEPackage#getAllocation_Source()
	 * @model required="true"
	 * @generated
	 */
	EList<ApplicationAllocationEnd> getSource();

	/**
	 * Returns the value of the '<em><b>Inplied Constraint</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inplied Constraint</em>' reference list.
	 * @see mARTE.MARTEPackage#getAllocation_InpliedConstraint()
	 * @model
	 * @generated
	 */
	EList<NFP_Constraint> getInpliedConstraint();

} // Allocation
