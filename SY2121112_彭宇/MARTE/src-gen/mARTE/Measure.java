/**
 */
package mARTE;

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
 *   <li>{@link mARTE.Measure#getMeasurementUnit <em>Measurement Unit</em>}</li>
 *   <li>{@link mARTE.Measure#getPhysicalQuantity <em>Physical Quantity</em>}</li>
 *   <li>{@link mARTE.Measure#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getMeasure()
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
	 * @see mARTE.MARTEPackage#getMeasure_MeasurementUnit()
	 * @model
	 * @generated
	 */
	Unit getMeasurementUnit();

	/**
	 * Sets the value of the '{@link mARTE.Measure#getMeasurementUnit <em>Measurement Unit</em>}' reference.
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
	 * @see mARTE.MARTEPackage#getMeasure_PhysicalQuantity()
	 * @model
	 * @generated
	 */
	Quantity getPhysicalQuantity();

	/**
	 * Sets the value of the '{@link mARTE.Measure#getPhysicalQuantity <em>Physical Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Quantity</em>' reference.
	 * @see #getPhysicalQuantity()
	 * @generated
	 */
	void setPhysicalQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference list.
	 * The list contents are of type {@link mARTE.SampleRealization}.
	 * It is bidirectional and its opposite is '{@link mARTE.SampleRealization#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference list.
	 * @see mARTE.MARTEPackage#getMeasure_Domain()
	 * @see mARTE.SampleRealization#getFunction
	 * @model opposite="function" required="true"
	 * @generated
	 */
	EList<SampleRealization> getDomain();

} // Measure
