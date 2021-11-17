/**
 */
package mARTE;

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
 *   <li>{@link mARTE.QuantitativeNFP#getRealizationValues <em>Realization Values</em>}</li>
 *   <li>{@link mARTE.QuantitativeNFP#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getQuantitativeNFP()
 * @model
 * @generated
 */
public interface QuantitativeNFP extends AbstractNFP {
	/**
	 * Returns the value of the '<em><b>Realization Values</b></em>' containment reference list.
	 * The list contents are of type {@link mARTE.SampleRealization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realization Values</em>' containment reference list.
	 * @see mARTE.MARTEPackage#getQuantitativeNFP_RealizationValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<SampleRealization> getRealizationValues();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
	 * The list contents are of type {@link mARTE.Measure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference list.
	 * @see mARTE.MARTEPackage#getQuantitativeNFP_Measure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measure> getMeasure();

} // QuantitativeNFP
