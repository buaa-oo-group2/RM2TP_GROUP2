/**
 */
package mARTE.NFP_Declaration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Declaration.ValueProperty#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Declaration.NFP_DeclarationPackage#getValueProperty()
 * @model abstract="true"
 * @generated
 */
public interface ValueProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ValueType)
	 * @see mARTE.NFP_Declaration.NFP_DeclarationPackage#getValueProperty_Type()
	 * @model
	 * @generated
	 */
	ValueType getType();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Declaration.ValueProperty#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ValueType value);

} // ValueProperty
