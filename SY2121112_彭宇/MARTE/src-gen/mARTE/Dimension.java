/**
 */
package mARTE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.Dimension#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link mARTE.Dimension#getBaseExponents <em>Base Exponents</em>}</li>
 *   <li>{@link mARTE.Dimension#getBasequantity <em>Basequantity</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see mARTE.MARTEPackage#getDimension_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link mARTE.Dimension#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Base Exponents</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Exponents</em>' attribute list.
	 * @see mARTE.MARTEPackage#getDimension_BaseExponents()
	 * @model
	 * @generated
	 */
	EList<Integer> getBaseExponents();

	/**
	 * Returns the value of the '<em><b>Basequantity</b></em>' reference list.
	 * The list contents are of type {@link mARTE.BaseQuantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basequantity</em>' reference list.
	 * @see mARTE.MARTEPackage#getDimension_Basequantity()
	 * @model
	 * @generated
	 */
	EList<BaseQuantity> getBasequantity();

} // Dimension
