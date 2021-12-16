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

} // Quantity
