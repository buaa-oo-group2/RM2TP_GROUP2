/**
 */
package mARTE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.ValueType#getAllowedUnits <em>Allowed Units</em>}</li>
 *   <li>{@link mARTE.ValueType#getDefaultUnit <em>Default Unit</em>}</li>
 *   <li>{@link mARTE.ValueType#getValueAttribute <em>Value Attribute</em>}</li>
 *   <li>{@link mARTE.ValueType#getUnitAttribute <em>Unit Attribute</em>}</li>
 *   <li>{@link mARTE.ValueType#getExprAttribute <em>Expr Attribute</em>}</li>
 *   <li>{@link mARTE.ValueType#getQualifierAttributes <em>Qualifier Attributes</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getValueType()
 * @model abstract="true"
 * @generated
 */
public interface ValueType extends TupleType {
	/**
	 * Returns the value of the '<em><b>Allowed Units</b></em>' reference list.
	 * The list contents are of type {@link mARTE.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Units</em>' reference list.
	 * @see mARTE.MARTEPackage#getValueType_AllowedUnits()
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
	 * @see mARTE.MARTEPackage#getValueType_DefaultUnit()
	 * @model
	 * @generated
	 */
	Unit getDefaultUnit();

	/**
	 * Sets the value of the '{@link mARTE.ValueType#getDefaultUnit <em>Default Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Unit</em>' reference.
	 * @see #getDefaultUnit()
	 * @generated
	 */
	void setDefaultUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Value Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attribute</em>' containment reference.
	 * @see #setValueAttribute(Property)
	 * @see mARTE.MARTEPackage#getValueType_ValueAttribute()
	 * @model containment="true"
	 * @generated
	 */
	Property getValueAttribute();

	/**
	 * Sets the value of the '{@link mARTE.ValueType#getValueAttribute <em>Value Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attribute</em>' containment reference.
	 * @see #getValueAttribute()
	 * @generated
	 */
	void setValueAttribute(Property value);

	/**
	 * Returns the value of the '<em><b>Unit Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Attribute</em>' containment reference.
	 * @see #setUnitAttribute(Property)
	 * @see mARTE.MARTEPackage#getValueType_UnitAttribute()
	 * @model containment="true"
	 * @generated
	 */
	Property getUnitAttribute();

	/**
	 * Sets the value of the '{@link mARTE.ValueType#getUnitAttribute <em>Unit Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Attribute</em>' containment reference.
	 * @see #getUnitAttribute()
	 * @generated
	 */
	void setUnitAttribute(Property value);

	/**
	 * Returns the value of the '<em><b>Expr Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr Attribute</em>' containment reference.
	 * @see #setExprAttribute(Property)
	 * @see mARTE.MARTEPackage#getValueType_ExprAttribute()
	 * @model containment="true"
	 * @generated
	 */
	Property getExprAttribute();

	/**
	 * Sets the value of the '{@link mARTE.ValueType#getExprAttribute <em>Expr Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr Attribute</em>' containment reference.
	 * @see #getExprAttribute()
	 * @generated
	 */
	void setExprAttribute(Property value);

	/**
	 * Returns the value of the '<em><b>Qualifier Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link mARTE.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier Attributes</em>' containment reference list.
	 * @see mARTE.MARTEPackage#getValueType_QualifierAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getQualifierAttributes();

} // ValueType
