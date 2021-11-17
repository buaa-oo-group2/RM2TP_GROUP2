/**
 */
package mARTE;

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
 *   <li>{@link mARTE.AnnotatedModel#getOwner <em>Owner</em>}</li>
 *   <li>{@link mARTE.AnnotatedModel#getAnnotationConcern <em>Annotation Concern</em>}</li>
 *   <li>{@link mARTE.AnnotatedModel#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getAnnotatedModel()
 * @model
 * @generated
 */
public interface AnnotatedModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference list.
	 * The list contents are of type {@link mARTE.AnnotatedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference list.
	 * @see mARTE.MARTEPackage#getAnnotatedModel_Owner()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AnnotatedElement> getOwner();

	/**
	 * Returns the value of the '<em><b>Annotation Concern</b></em>' reference list.
	 * The list contents are of type {@link mARTE.ModelingConcern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Concern</em>' reference list.
	 * @see mARTE.MARTEPackage#getAnnotatedModel_AnnotationConcern()
	 * @model required="true"
	 * @generated
	 */
	EList<ModelingConcern> getAnnotationConcern();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(NFP_Constrain)
	 * @see mARTE.MARTEPackage#getAnnotatedModel_Context()
	 * @model containment="true"
	 * @generated
	 */
	NFP_Constrain getContext();

	/**
	 * Sets the value of the '{@link mARTE.AnnotatedModel#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(NFP_Constrain value);

} // AnnotatedModel
