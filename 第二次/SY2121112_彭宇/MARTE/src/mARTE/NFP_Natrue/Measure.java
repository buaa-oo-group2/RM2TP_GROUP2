/**
 */
package mARTE.NFP_Natrue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Natrue.Measure#getMeasurementUnit <em>Measurement Unit</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.Measure#getPhysicalQuantity <em>Physical Quantity</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.Measure#getDomain <em>Domain</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.Measure#getMeasureName <em>Measure Name</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Unit</em>' reference.
	 * @see #setMeasurementUnit(Unit)
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getMeasure_MeasurementUnit()
	 * @model
	 * @generated
	 */
	Unit getMeasurementUnit();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Natrue.Measure#getMeasurementUnit <em>Measurement Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Unit</em>' reference.
	 * @see #getMeasurementUnit()
	 * @generated
	 */
	void setMeasurementUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Physical Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Quantity</em>' reference.
	 * @see #setPhysicalQuantity(Quantity)
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getMeasure_PhysicalQuantity()
	 * @model
	 * @generated
	 */
	Quantity getPhysicalQuantity();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Natrue.Measure#getPhysicalQuantity <em>Physical Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Quantity</em>' reference.
	 * @see #getPhysicalQuantity()
	 * @generated
	 */
	void setPhysicalQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Natrue.SampleRealization}.
	 * It is bidirectional and its opposite is '{@link mARTE.NFP_Natrue.SampleRealization#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference list.
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getMeasure_Domain()
	 * @see mARTE.NFP_Natrue.SampleRealization#getFunction
	 * @model opposite="function" required="true"
	 * @generated
	 */
	EList<SampleRealization> getDomain();

	/**
	 * Returns the value of the '<em><b>Measure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Name</em>' attribute.
	 * @see #setMeasureName(String)
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getMeasure_MeasureName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMeasureName();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Natrue.Measure#getMeasureName <em>Measure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Name</em>' attribute.
	 * @see #getMeasureName()
	 * @generated
	 */
	void setMeasureName(String value);

} // Measure
