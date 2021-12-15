/**
 */
package mARTE.NFP_Natrue;

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
 *   <li>{@link mARTE.NFP_Natrue.Dimension#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.Dimension#getBasequantity <em>Basequantity</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getDimension()
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
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getDimension_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Natrue.Dimension#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Basequantity</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Natrue.BaseQuantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basequantity</em>' reference list.
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getDimension_Basequantity()
	 * @model
	 * @generated
	 */
	EList<BaseQuantity> getBasequantity();

} // Dimension
