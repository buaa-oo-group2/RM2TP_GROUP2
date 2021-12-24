/**
 */
package mARTE.NFP_Natrue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Natrue.Unit#getConvFactor <em>Conv Factor</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.Unit#getConvOffset <em>Conv Offset</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.Unit#getBaseUnit <em>Base Unit</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Conv Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conv Factor</em>' attribute.
	 * @see #setConvFactor(Double)
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getUnit_ConvFactor()
	 * @model
	 * @generated
	 */
	Double getConvFactor();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Natrue.Unit#getConvFactor <em>Conv Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conv Factor</em>' attribute.
	 * @see #getConvFactor()
	 * @generated
	 */
	void setConvFactor(Double value);

	/**
	 * Returns the value of the '<em><b>Conv Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conv Offset</em>' attribute.
	 * @see #setConvOffset(Double)
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getUnit_ConvOffset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	Double getConvOffset();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Natrue.Unit#getConvOffset <em>Conv Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conv Offset</em>' attribute.
	 * @see #getConvOffset()
	 * @generated
	 */
	void setConvOffset(Double value);

	/**
	 * Returns the value of the '<em><b>Base Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Unit</em>' reference.
	 * @see #setBaseUnit(Unit)
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getUnit_BaseUnit()
	 * @model
	 * @generated
	 */
	Unit getBaseUnit();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Natrue.Unit#getBaseUnit <em>Base Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit</em>' reference.
	 * @see #getBaseUnit()
	 * @generated
	 */
	void setBaseUnit(Unit value);

} // Unit
