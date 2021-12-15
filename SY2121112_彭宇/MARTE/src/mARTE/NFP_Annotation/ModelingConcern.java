/**
 */
package mARTE.NFP_Annotation;

import mARTE.NFP_Declaration.NFP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Annotation.ModelingConcern#getDescription <em>Description</em>}</li>
 *   <li>{@link mARTE.NFP_Annotation.ModelingConcern#getRelevantNfp <em>Relevant Nfp</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getModelingConcern()
 * @model
 * @generated
 */
public interface ModelingConcern extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getModelingConcern_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Annotation.ModelingConcern#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Relevant Nfp</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Declaration.NFP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant Nfp</em>' reference list.
	 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getModelingConcern_RelevantNfp()
	 * @model
	 * @generated
	 */
	EList<NFP> getRelevantNfp();

} // ModelingConcern
