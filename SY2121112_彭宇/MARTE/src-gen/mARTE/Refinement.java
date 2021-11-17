/**
 */
package mARTE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.Refinement#getGeneral <em>General</em>}</li>
 *   <li>{@link mARTE.Refinement#getRefined <em>Refined</em>}</li>
 *   <li>{@link mARTE.Refinement#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getRefinement()
 * @model
 * @generated
 */
public interface Refinement extends EObject {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link mARTE.AllocationEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see mARTE.MARTEPackage#getRefinement_General()
	 * @model required="true"
	 * @generated
	 */
	EList<AllocationEnd> getGeneral();

	/**
	 * Returns the value of the '<em><b>Refined</b></em>' reference list.
	 * The list contents are of type {@link mARTE.AllocationEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined</em>' reference list.
	 * @see mARTE.MARTEPackage#getRefinement_Refined()
	 * @model required="true"
	 * @generated
	 */
	EList<AllocationEnd> getRefined();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference list.
	 * @see mARTE.MARTEPackage#getRefinement_Constraint()
	 * @model
	 * @generated
	 */
	EList<NFP_Constraint> getConstraint();

} // Refinement
