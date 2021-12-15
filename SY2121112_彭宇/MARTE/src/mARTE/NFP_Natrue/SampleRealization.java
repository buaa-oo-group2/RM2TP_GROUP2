/**
 */
package mARTE.NFP_Natrue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Natrue.SampleRealization#getFunction <em>Function</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.SampleRealization#getMeasureName <em>Measure Name</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getSampleRealization()
 * @model
 * @generated
 */
public interface SampleRealization extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference list.
	 * The list contents are of type {@link mARTE.NFP_Natrue.Measure}.
	 * It is bidirectional and its opposite is '{@link mARTE.NFP_Natrue.Measure#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference list.
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getSampleRealization_Function()
	 * @see mARTE.NFP_Natrue.Measure#getDomain
	 * @model opposite="domain"
	 * @generated
	 */
	EList<Measure> getFunction();

	/**
	 * Returns the value of the '<em><b>Measure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Name</em>' attribute.
	 * @see #setMeasureName(String)
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getSampleRealization_MeasureName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMeasureName();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Natrue.SampleRealization#getMeasureName <em>Measure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Name</em>' attribute.
	 * @see #getMeasureName()
	 * @generated
	 */
	void setMeasureName(String value);

} // SampleRealization
