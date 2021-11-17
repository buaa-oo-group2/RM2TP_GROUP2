/**
 */
package mARTE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.AnnotatedElement#getNfpDeclaration <em>Nfp Declaration</em>}</li>
 *   <li>{@link mARTE.AnnotatedElement#getNfpValue <em>Nfp Value</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getAnnotatedElement()
 * @model
 * @generated
 */
public interface AnnotatedElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Nfp Declaration</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nfp Declaration</em>' reference list.
	 * @see mARTE.MARTEPackage#getAnnotatedElement_NfpDeclaration()
	 * @model
	 * @generated
	 */
	EList<NFP> getNfpDeclaration();

	/**
	 * Returns the value of the '<em><b>Nfp Value</b></em>' containment reference list.
	 * The list contents are of type {@link mARTE.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nfp Value</em>' containment reference list.
	 * @see mARTE.MARTEPackage#getAnnotatedElement_NfpValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getNfpValue();

} // AnnotatedElement
