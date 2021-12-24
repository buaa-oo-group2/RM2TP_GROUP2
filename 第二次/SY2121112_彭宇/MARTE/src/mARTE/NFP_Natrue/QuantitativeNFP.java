/**
 */
package mARTE.NFP_Natrue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantitative NFP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Natrue.QuantitativeNFP#getRealizationValues <em>Realization Values</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.QuantitativeNFP#getMeasure <em>Measure</em>}</li>
 *   <li>{@link mARTE.NFP_Natrue.QuantitativeNFP#getNumbers <em>Numbers</em>}</li>
 * </ul>
 *
 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getQuantitativeNFP()
 * @model
 * @generated
 */
public interface QuantitativeNFP extends AbstractNFP {
	/**
	 * Returns the value of the '<em><b>Realization Values</b></em>' containment reference list.
	 * The list contents are of type {@link mARTE.NFP_Natrue.SampleRealization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realization Values</em>' containment reference list.
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getQuantitativeNFP_RealizationValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<SampleRealization> getRealizationValues();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
	 * The list contents are of type {@link mARTE.NFP_Natrue.Measure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference list.
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getQuantitativeNFP_Measure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measure> getMeasure();

	/**
	 * Returns the value of the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbers</em>' attribute.
	 * @see #setNumbers(Integer)
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#getQuantitativeNFP_Numbers()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
	 * @generated
	 */
	Integer getNumbers();

	/**
	 * Sets the value of the '{@link mARTE.NFP_Natrue.QuantitativeNFP#getNumbers <em>Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbers</em>' attribute.
	 * @see #getNumbers()
	 * @generated
	 */
	void setNumbers(Integer value);

} // QuantitativeNFP
