/**
 */
package mARTE.NFP_Annotation;

import mARTE.NFP_Declaration.NFP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Annotation.AnnotatedElement#getNfpDeclaration <em>Nfp Declaration</em>}</li>
 *   <li>{@link mARTE.NFP_Annotation.AnnotatedElement#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getAnnotatedElement()
 * @model
 * @generated
 */
public interface AnnotatedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Nfp Declaration</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Declaration.NFP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nfp Declaration</em>' reference list.
	 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getAnnotatedElement_NfpDeclaration()
	 * @model
	 * @generated
	 */
	EList<NFP> getNfpDeclaration();

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#getAnnotatedElement_ElementName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Annotation.AnnotatedElement#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

} // AnnotatedElement
