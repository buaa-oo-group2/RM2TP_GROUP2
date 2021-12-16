/**
 */
package mARTE.NFP_Annotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Annotation.NFP_Constraint#getKind <em>Kind</em>}</li>
 *   <li>{@link mARTE.NFP_Annotation.NFP_Constraint#getConstrainedElement <em>Constrained Element</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getNFP_Constraint()
 * @model
 * @generated
 */
public interface NFP_Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link mARTE.NFP_Annotation.ConstrainKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see mARTE.NFP_Annotation.ConstrainKind
	 * @see #setKind(ConstrainKind)
	 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getNFP_Constraint_Kind()
	 * @model
	 * @generated
	 */
	ConstrainKind getKind();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Annotation.NFP_Constraint#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see mARTE.NFP_Annotation.ConstrainKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConstrainKind value);

	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Annotation.AnnotatedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' reference list.
	 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getNFP_Constraint_ConstrainedElement()
	 * @model
	 * @generated
	 */
	EList<AnnotatedElement> getConstrainedElement();

} // NFP_Constraint
