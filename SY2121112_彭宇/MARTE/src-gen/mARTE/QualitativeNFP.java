/**
 */
package mARTE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative NFP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE.QualitativeNFP#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getQualitativeNFP()
 * @model
 * @generated
 */
public interface QualitativeNFP extends AbstractNFP {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link mARTE.AbstractNFP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see mARTE.MARTEPackage#getQualitativeNFP_Parameter()
	 * @model
	 * @generated
	 */
	EList<AbstractNFP> getParameter();

} // QualitativeNFP
