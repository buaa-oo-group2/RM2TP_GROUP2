/**
 */
package mARTE.NFP_Annotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Annotation.AnnotatedModel#getOwner <em>Owner</em>}</li>
 *   <li>{@link mARTE.NFP_Annotation.AnnotatedModel#getAnnotationConcern <em>Annotation Concern</em>}</li>
 *   <li>{@link mARTE.NFP_Annotation.AnnotatedModel#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getAnnotatedModel()
 * @model
 * @generated
 */
public interface AnnotatedModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference list.
	 * The list contents are of type {@link mARTE.NFP_Annotation.AnnotatedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference list.
	 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getAnnotatedModel_Owner()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AnnotatedElement> getOwner();

	/**
	 * Returns the value of the '<em><b>Annotation Concern</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Annotation.ModelingConcern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Concern</em>' reference list.
	 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getAnnotatedModel_AnnotationConcern()
	 * @model required="true"
	 * @generated
	 */
	EList<ModelingConcern> getAnnotationConcern();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(NFP_Constraint)
	 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getAnnotatedModel_Context()
	 * @model containment="true"
	 * @generated
	 */
	NFP_Constraint getContext();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Annotation.AnnotatedModel#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(NFP_Constraint value);

} // AnnotatedModel
