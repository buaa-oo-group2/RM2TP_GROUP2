/**
 */
package mARTE.NFP_Natrue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Natrue.Quantity#getAllowedUnits <em>Allowed Units</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.Quantity#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getQuantity()
 * @model abstract="true"
 * @generated
 */
public interface Quantity extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed Units</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Natrue.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Units</em>' reference list.
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getQuantity_AllowedUnits()
	 * @model
	 * @generated
	 */
	EList<Unit> getAllowedUnits();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference.
	 * @see #setDimension(Dimension)
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getQuantity_Dimension()
	 * @model
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Natrue.Quantity#getDimension <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

} // Quantity
