/**
 */
package mARTE.NFP_Declaration;

import mARTE.NFP_Natrue.Unit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Declaration.ValueType#getAllowedUnits <em>Allowed Units</em>}</li>
 *   <li>{@link mARTE.NFP_Declaration.ValueType#getDefaultUnit <em>Default Unit</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Declaration.NFP_DeclarationPackage#getValueType()
 * @model abstract="true"
 * @generated
 */
public interface ValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed Units</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Natrue.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Units</em>' reference list.
	 * @see mARTE.NFP_Declaration.NFP_DeclarationPackage#getValueType_AllowedUnits()
	 * @model
	 * @generated
	 */
	EList<Unit> getAllowedUnits();

	/**
	 * Returns the value of the '<em><b>Default Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Unit</em>' reference.
	 * @see #setDefaultUnit(Unit)
	 * @see mARTE.NFP_Declaration.NFP_DeclarationPackage#getValueType_DefaultUnit()
	 * @model
	 * @generated
	 */
	Unit getDefaultUnit();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Declaration.ValueType#getDefaultUnit <em>Default Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Unit</em>' reference.
	 * @see #getDefaultUnit()
	 * @generated
	 */
	void setDefaultUnit(Unit value);

} // ValueType
