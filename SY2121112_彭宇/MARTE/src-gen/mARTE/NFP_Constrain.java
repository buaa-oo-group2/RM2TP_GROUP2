/**
 */
package mARTE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Constrain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Constrain#getKind <em>Kind</em>}</li>
 *   <li>{@link mARTE.NFP_Constrain#getMode <em>Mode</em>}</li>
 *   <li>{@link mARTE.NFP_Constrain#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link mARTE.NFP_Constrain#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getNFP_Constrain()
 * @model
 * @generated
 */
public interface NFP_Constrain extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link mARTE.ConstrainKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see mARTE.ConstrainKind
	 * @see #setKind(ConstrainKind)
	 * @see mARTE.MARTEPackage#getNFP_Constrain_Kind()
	 * @model
	 * @generated
	 */
	ConstrainKind getKind();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Constrain#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see mARTE.ConstrainKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConstrainKind value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference list.
	 * The list contents are of type {@link mARTE.Mode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference list.
	 * @see mARTE.MARTEPackage#getNFP_Constrain_Mode()
	 * @model
	 * @generated
	 */
	EList<Mode> getMode();

	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' reference list.
	 * The list contents are of type {@link mARTE.AnnotatedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' reference list.
	 * @see mARTE.MARTEPackage#getNFP_Constrain_ConstrainedElement()
	 * @model
	 * @generated
	 */
	EList<AnnotatedElement> getConstrainedElement();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference list.
	 * The list contents are of type {@link mARTE.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference list.
	 * @see mARTE.MARTEPackage#getNFP_Constrain_Specification()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getSpecification();

} // NFP_Constrain
