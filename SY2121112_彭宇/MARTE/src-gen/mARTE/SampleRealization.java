/**
 */
package mARTE;

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
 *   <li>{@link mARTE.SampleRealization#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see mARTE.MARTEPackage#getSampleRealization()
 * @model
 * @generated
 */
public interface SampleRealization extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference list.
	 * The list contents are of type {@link mARTE.Measure}.
	 * It is bidirectional and its opposite is '{@link mARTE.Measure#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference list.
	 * @see mARTE.MARTEPackage#getSampleRealization_Function()
	 * @see mARTE.Measure#getDomain
	 * @model opposite="domain"
	 * @generated
	 */
	EList<Measure> getFunction();

} // SampleRealization
